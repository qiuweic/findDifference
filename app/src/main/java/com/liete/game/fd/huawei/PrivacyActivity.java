package com.liete.game.fd.huawei;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class PrivacyActivity extends AppCompatActivity {
    private String privacyUrl;
    private int protocolType;
    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int uiOptions = View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_FULLSCREEN;
        getWindow().getDecorView().setSystemUiVisibility(uiOptions);

        WindowManager.LayoutParams lp = getWindow().getAttributes();
        lp.layoutInDisplayCutoutMode = WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;
        getWindow().setAttributes(lp);

        setContentView(R.layout.activity_privacy);

        protocolType = getIntent().getIntExtra("type", 1);

        initToolbar(protocolType == 2 ? getString(R.string.page_title_protocol) : getString(R.string.page_title_privacy), true);

        webView = findViewById(R.id.privacy_webView);

        // 开启javascript 渲染
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webView.setWebViewClient(new WebViewClient() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                Log.e("[HAPPY]", "onReceivedError:" + error.getDescription());
                if (error.getDescription().equals("net::ERR_EMPTY_RESPONSE")) {
                    loadProtocolFromRemote();
                }
            }

            @Override
            public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
                super.onReceivedHttpError(view, request, errorResponse);
                Log.e("[HAPPY]", "onReceivedHttpError");
                loadProtocolFromRemote();
            }
        });

        initPrivacyUrl(protocolType);

        // 从服务器上加载隐私政策或用户协议
        webView.loadUrl(privacyUrl);
    }

    /**
     * 设置ToolBar
     */
    protected void initToolbar(String title, boolean isDisplayHomeAsUpEnabled) {
        Toolbar toolbar = findViewById(R.id.toolbar2);
        TextView titleTv = toolbar.findViewById(R.id.title2);
        //titleTv.setText(title);

        //setTile 要在下面这句话上面，不然会失效
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(isDisplayHomeAsUpEnabled);
        actionBar.setDisplayShowTitleEnabled(false);
    }


    private void initPrivacyUrl(int protocolType) {
        if (getString(R.string.language).equals("Chinese")) {
            if (protocolType == 2) {
                // 从本地加载用户协议
                webView.loadUrl("file:///android_asset/protocol.htm");
            } else {
                // 从本地加载隐私政策
                webView.loadUrl("file:///android_asset/privacy.htm");
            }
        } else {
            if (protocolType == 2) {
                // 从本地加载用户协议
                webView.loadUrl("file:///android_asset/protocol-en.htm");
            } else {
                // 从本地加载隐私政策
                webView.loadUrl("file:///android_asset/privacy-en.htm");
            }
        }
    }

    private void loadProtocolFromRemote() {
        if (getString(R.string.language).equals("Chinese")) {
            if (protocolType == 2) {
                privacyUrl = Constant.PROTOCOL_URL_CN;
            } else {
                privacyUrl = Constant.PRIVACY_URL_CN;
            }
        } else {
            if (protocolType == 2) {
                privacyUrl = Constant.PROTOCOL_URL_EN;
            } else {
                privacyUrl = Constant.PRIVACY_URL_EN;
            }
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            //返回键back的箭头
            case android.R.id.home:
                this.finish();
                return true;
        }
        return false;
    }

}