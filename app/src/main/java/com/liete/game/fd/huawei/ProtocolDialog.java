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

public class ProtocolDialog extends Dialog {

    private final Context mContext;
    private CheckBox checkBox;
    private ProtocolDialogCallback mCallback;

    /**
     * Privacy protocol dialog box callback interface.
     */
    public interface ProtocolDialogCallback {
        void agree();
        void cancel();
    }

    /**
     * Constructor.
     *
     * @param context context
     */
    public ProtocolDialog(@NonNull Context context) {
        super(context, R.style.ProtocolDialog);
        mContext = context;
    }

    /**
     * Set a dialog box callback.
     *
     * @param callback callback
     */
    public void setCallback(ProtocolDialogCallback callback) {
        mCallback = callback;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Window dialogWindow = getWindow();
        dialogWindow.requestFeature(Window.FEATURE_NO_TITLE);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        LinearLayout rootView = (LinearLayout) inflater.inflate(R.layout.dialog_protocol, null);
        setContentView(rootView);

        checkBox = rootView.findViewById(R.id.checkbox);
        TextView confirmBtn = rootView.findViewById(R.id.btn_confirm);
        TextView cancelBtn = rootView.findViewById(R.id.btn_cancel);

        confirmBtn.setOnClickListener(view -> {
            if (checkBox.isChecked()) {
                // save sp
                SharedPreferences preferences = mContext.getSharedPreferences(Constant.SP_NAME, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt(Constant.SP_PROTOCOL_KEY, Constant.ENABLED_PROTOCOL_VALUE).apply();
                mCallback.agree();
            } else {
                Toast.makeText(mContext, mContext.getString(R.string.reading_protocol_confirm), Toast.LENGTH_SHORT).show();
            }
        });

        cancelBtn.setOnClickListener(view -> {
            mCallback.cancel();
        });

        initClickableSpan(rootView);
    }

    private void initClickableSpan(View rootView) {
        TextView tipText = rootView.findViewById(R.id.tip_text);
        String spannableStr = tipText.getText().toString();
        SpannableString spannableText = new SpannableString(spannableStr);
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                openProtocolPage(1);
            }
            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLUE);
                ds.setUnderlineText(false);
            }

        };
        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                openProtocolPage(2);
            }
            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLUE);
                ds.setUnderlineText(false);
            }
        };
        if (mContext.getString(R.string.language).equals("Chinese")) {
            spannableText.setSpan(clickableSpan, 41, 47, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableText.setSpan(clickableSpan2, 48, 54, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        } else {
            spannableText.setSpan(clickableSpan, 127, 141, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
            spannableText.setSpan(clickableSpan2, 146, 160, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        }
        tipText.setText(spannableText);
        tipText.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void openProtocolPage(int type) {
        Intent intent = new Intent(mContext, PrivacyActivity.class);
        intent.putExtra("type", type); // 1: 隐私政策, 2: 用户协议
        mContext.startActivity(intent);
    }

}
