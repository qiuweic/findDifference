package com.liete.game.fd.huawei;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class GameCommonDialog extends Dialog {

    private final Context mContext;
    private CheckBox checkBox;
    private DialogCallback mCallback;

    /**
     * Privacy protocol dialog box callback interface.
     */
    public interface DialogCallback {
        void getMoreTime();
        void replay();
    }

    /**
     * Constructor.
     *
     * @param context context
     */
    public GameCommonDialog(@NonNull Context context) {
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
        LinearLayout rootView = (LinearLayout) inflater.inflate(R.layout.dialog_game_over, null);
        setContentView(rootView);

        TextView adBtn = rootView.findViewById(R.id.btn_get_ad);
        TextView replayBtn = rootView.findViewById(R.id.btn_replay);

        adBtn.setOnClickListener(view -> {
            mCallback.getMoreTime();
        });

        replayBtn.setOnClickListener(view -> {
            mCallback.replay();
        });
    }

}
