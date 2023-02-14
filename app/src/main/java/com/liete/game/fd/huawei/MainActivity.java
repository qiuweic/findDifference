package com.liete.game.fd.huawei;

import static android.os.VibrationEffect.createOneShot;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements GameView.TouchListener {

    private LinearLayout gameViewLayout;
    private GameView gameView;
    private TextView timeLabel;
    private TextView gameLevel;
    private ImageView backHome;
    private ImageView pauseGame;
    private CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5;
    private int currentLevelId;

    private long totalTime = 120;
    private boolean isPlaying = false;


    private Vibrator mVibrator;

    private final Handler handler = new Handler();

    @RequiresApi(api = Build.VERSION_CODES.P)
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

        setContentView(R.layout.activity_main);
        mVibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        gameViewLayout = findViewById(R.id.game_view_layout);
        backHome = findViewById(R.id.back_home);
        backHome.setOnClickListener(view -> backHomePage());
        pauseGame = findViewById(R.id.pause_game);
        pauseGame.setOnClickListener(view -> pauseOrResumeGame());

        gameLevel = findViewById(R.id.game_level);
        timeLabel = findViewById(R.id.time_label);
        checkBox1 = findViewById(R.id.checkbox1);
        checkBox2 = findViewById(R.id.checkbox2);
        checkBox3 = findViewById(R.id.checkbox3);
        checkBox4 = findViewById(R.id.checkbox4);
        checkBox5 = findViewById(R.id.checkbox5);

        currentLevelId = 1;
        gameLevel.setText("Level " + currentLevelId);
        initGameLevel(currentLevelId);
    }


    private void initGameLevel(int levelId) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int width = (int) (displayMetrics.widthPixels - 40);
        int height = (int) (displayMetrics.heightPixels * 0.6f);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        params.gravity = Gravity.CENTER;

        gameView = new GameView(this, width, height, levelId, this);
        gameViewLayout.addView(gameView, params);

        LinearLayout nextLevel = findViewById(R.id.bottom_layout);
        nextLevel.setOnClickListener(view -> loadNextLevel());

        isPlaying = true;
        startTimer();
    }

    private void loadNextLevel() {
        currentLevelId += 1;
        totalTime = 120;
        resetCheckBox();
        gameView.loadGameLevel(3);
        gameLevel.setText("Level " + currentLevelId);
        gameView.setGameOver(false);
        isPlaying = true;
        startTimer();
    }

    private void backHomePage() {

    }

    private void pauseOrResumeGame() {
        isPlaying = !isPlaying;
        gameView.setGameState(!isPlaying);
        pauseGame.setImageResource(isPlaying ? R.drawable.ic_pause_100 : R.drawable.ic_play_100);
        if (isPlaying) startTimer();
    }

    private void handleVibrator() {
        //if (isVibratorEnabled) {
        mVibrator.vibrate(createOneShot(50, 5));
        //}
    }

    private void updateCheckBox() {
        if (!checkBox1.isChecked()) {
            checkBox1.setChecked(true);
            return;
        }
        if (!checkBox2.isChecked()) {
            checkBox2.setChecked(true);
            return;
        }
        if (!checkBox3.isChecked()) {
            checkBox3.setChecked(true);
            return;
        }
        if (!checkBox4.isChecked()) {
            checkBox4.setChecked(true);
            return;
        }
        if (!checkBox5.isChecked()) {
            checkBox5.setChecked(true);
        }
    }

    private void resetCheckBox() {
        checkBox1.setChecked(false);
        checkBox2.setChecked(false);
        checkBox3.setChecked(false);
        checkBox4.setChecked(false);
        checkBox5.setChecked(false);
    }

    @Override
    public void onErrorTouch() {
        handleVibrator();
        totalTime -= 30;
        updateTime();
    }

    @Override
    public void onAccurateTouch() {
        updateCheckBox();
    }

    @Override
    public void onFoundAll() {
        isPlaying = false;
        Toast.makeText(this, "Found All", Toast.LENGTH_SHORT).show();
    }

    private void startTimer() {
        handler.post(new Runnable() {
            @Override
            public void run() {
                if (isPlaying) {
                    updateTime();
                    totalTime -= 1;
                    handler.postDelayed(this, 1000);
                }
            }
        });
    }

    private void continueTimer() {
        if (!isPlaying) {
            startTimer();
        }
    }

    private void updateTime() {
        if (totalTime <= 0) {
            totalTime = 0;
            isPlaying = false;
            gameView.setGameOver(true);
        }

        timeLabel.setTextColor(totalTime <= 30 ? getColor(R.color.red_100): getColor(R.color.purple));
        timeLabel.setText(formatTime(totalTime));
    }

    private String formatTime(long seconds) {
        int min = (int) (seconds / 60 );
        int second = (int) (seconds % 60);
        return String.format(Locale.ENGLISH, "%d:%02d", min, second);
    }
}