package com.liete.game.fd.huawei;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.liete.game.fd.huawei.ad.AdManager;

public class MainActivity extends AppCompatActivity {

    private TextView currentLevel;
    private int levelId;

    private View exitOutside;
    private TextView exitButton;
    private RelativeLayout actionLayout;
    private FrameLayout exitLayout;

    private Animation showAnimation;
    private Animation hiddenAnimation;

    private ScrollView exitAdView;
    private AdManager adManager;

    @Override
    @RequiresApi(api = Build.VERSION_CODES.P)
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

        setContentView(R.layout.activity_main);

        if (needUserConsent()) {
            showConsent();
        }

        currentLevel = findViewById(R.id.btn_current_level);
        currentLevel.setOnClickListener(view -> startGameActivity());

        initExitView();
    }

    @Override
    protected void onResume() {
        super.onResume();
        levelId = getCurrentLevelId();
        currentLevel.setText("Level " + levelId);
    }

    private void startGameActivity() {
        Intent intent = new Intent(this, GameActivity.class);
        intent.putExtra("levelId", levelId);
        startActivity(intent);
    }

    private int getCurrentLevelId() {
        SharedPreferences preferences = getSharedPreferences(Constant.SP_NAME, Context.MODE_PRIVATE);
        return preferences.getInt(Constant.SP_CURRENT_LEVEL_KEY, 1);
    }

    private boolean needUserConsent() {
        SharedPreferences preferences = getSharedPreferences(Constant.SP_NAME, Context.MODE_PRIVATE);
        int value = preferences.getInt(Constant.SP_PROTOCOL_KEY, Constant.DEFAULT_PROTOCOL_VALUE);
        return value == Constant.DEFAULT_PROTOCOL_VALUE;
    }

    /**
     * 检查是否用户是否同意协议
     */
    private void showConsent() {
        ProtocolDialog dialog = new ProtocolDialog(this);
        dialog.setCallback(new ProtocolDialog.ProtocolDialogCallback() {
            @Override
            public void agree() {
                dialog.dismiss();
            }

            @Override
            public void cancel() {
                dialog.dismiss();
                finish();
            }
        });
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        dialog.show();
    }

    @Override
    public void onBackPressed() {
        //saveGameProgress();
        if (exitLayout.getVisibility() == View.VISIBLE) {
            actionLayout.startAnimation(hiddenAnimation);
            exitLayout.setVisibility(View.GONE);
        } else {
            exitLayout.setVisibility(View.VISIBLE);
            actionLayout.startAnimation(showAnimation);
            loadExitAd();
        }
        //super.onBackPressed();
    }

    private void initExitView() {
        exitAdView = findViewById(R.id.ad_layout);
        exitLayout = findViewById(R.id.exit_layout);
        actionLayout = findViewById(R.id.exit_action_layout);
        exitOutside = findViewById(R.id.exit_outside);
        exitButton = findViewById(R.id.exit_app);

        showAnimation = AnimationUtils.loadAnimation(this, R.anim.popup_show_anim);
        hiddenAnimation = AnimationUtils.loadAnimation(this, R.anim.popup_hide_anim);
        exitOutside.setOnClickListener(listener);
        exitButton.setOnClickListener(listener);
        exitLayout.setOnClickListener(listener);

        adManager = new AdManager(this);
        // 加载主页底部广告
        //loadBottomAd();
    }

    private final View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.exit_outside:
                    exitLayout.setVisibility(View.GONE);
                    break;
                case R.id.exit_app:
                    finish();
                    break;
                case R.id.exit_layout:
                    // 拦截当前Layout点击事件
                    break;
            }
        }
    };

    /**
     * 加载退出界面广告
     */
    private void loadExitAd() {
        // 大图：testu7m3hc4gvm 小图：testb65czjivt9，视频：testy63txaom86 三图：testr6w14o0hqz
        adManager.loadNativeAd(exitAdView, "testu7m3hc4gvm", false);
    }
}