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
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView currentLevel;
    private int levelId;

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
    }

    @Override
    protected void onResume() {
        super.onResume();
        levelId = getCurrentLevelId();
        levelId = 30;
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
}