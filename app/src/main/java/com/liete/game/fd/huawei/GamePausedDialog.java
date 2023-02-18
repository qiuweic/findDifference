package com.liete.game.fd.huawei;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class GamePausedDialog extends Dialog {

    private final Context mContext;
    private CheckBox checkBox;
    private DialogCallback mCallback;

    /**
     * Privacy protocol dialog box callback interface.
     */
    public interface DialogCallback {
        void doContinue();
        void backHome();
        void openPrivacy();
    }

    /**
     * Constructor.
     *
     * @param context context
     */
    public GamePausedDialog(@NonNull Context context) {
        super(context, R.style.ProtocolDialog);
        mContext = context;
    }

    /**
     * Set a dialog box callback.
     *
     * @param callback callback
     */
    public void setCallback(DialogCallback callback) {
        mCallback = callback;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Window dialogWindow = getWindow();
        dialogWindow.requestFeature(Window.FEATURE_NO_TITLE);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        LinearLayout rootView = (LinearLayout) inflater.inflate(R.layout.dialog_game_pause, null);
        setContentView(rootView);

        checkBox = rootView.findViewById(R.id.checkbox);
        checkBox.setChecked(isVibratorEnabled());
        checkBox.setOnCheckedChangeListener((compoundButton, isChecked) -> {
            int enableVibrator = isChecked ? 1 : 0;
            SharedPreferences preferences = mContext.getSharedPreferences(Constant.SP_NAME, Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt(Constant.SP_VIBRATOR_KEY, enableVibrator).apply();
        });

        TextView confirmBtn = rootView.findViewById(R.id.btn_confirm);
        TextView menuBtn = rootView.findViewById(R.id.btn_menu);
        TextView privacy = rootView.findViewById(R.id.btn_privacy);

        confirmBtn.setOnClickListener(view -> {
            mCallback.doContinue();
        });

        menuBtn.setOnClickListener(view -> {
            mCallback.backHome();
        });

        privacy.setOnClickListener(view -> {
            mCallback.openPrivacy();
        });
    }

    private boolean isVibratorEnabled() {
        SharedPreferences preferences = mContext.getSharedPreferences(Constant.SP_NAME, Context.MODE_PRIVATE);
        int value = preferences.getInt(Constant.SP_VIBRATOR_KEY, Constant.ENABLED_VIBRATOR_VALUE);
        return value == Constant.ENABLED_VIBRATOR_VALUE;
    }
}
