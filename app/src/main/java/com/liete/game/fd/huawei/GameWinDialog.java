package com.liete.game.fd.huawei;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class GameWinDialog extends Dialog {

    private final Context mContext;
    private DialogCallback mCallback;

    /**
     * Privacy protocol dialog box callback interface.
     */
    public interface DialogCallback {
        void doContinue();
        void doExit();
    }

    /**
     * Constructor.
     *
     * @param context context
     */
    public GameWinDialog(@NonNull Context context) {
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
        LinearLayout rootView = (LinearLayout) inflater.inflate(R.layout.dialog_game_win, null);
        setContentView(rootView);

        TextView adBtn = rootView.findViewById(R.id.btn_continue);
        TextView replayBtn = rootView.findViewById(R.id.btn_exit);


        adBtn.setOnClickListener(view -> {
            mCallback.doContinue();
        });

        replayBtn.setOnClickListener(view -> {
            mCallback.doExit();
        });
    }

}
