package com.liete.game.fd.huawei.ad;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.huawei.hms.ads.AdListener;
import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.AppDownloadButton;
import com.huawei.hms.ads.AppDownloadButtonStyle;
import com.huawei.hms.ads.InterstitialAd;
import com.huawei.hms.ads.nativead.MediaView;
import com.huawei.hms.ads.nativead.NativeAd;
import com.huawei.hms.ads.nativead.NativeAdConfiguration;
import com.huawei.hms.ads.nativead.NativeAdLoader;
import com.huawei.hms.ads.nativead.NativeView;
import com.huawei.hms.ads.reward.Reward;
import com.huawei.hms.ads.reward.RewardAd;
import com.huawei.hms.ads.reward.RewardAdLoadListener;
import com.huawei.hms.ads.reward.RewardAdStatusListener;
import com.liete.game.fd.huawei.R;

public class AdManager {
    private static final String TAG = "AdManager";

    private Context mContext;
    private OnNativeAdListener mNativeAdListener;
    private OnRewardAdLoadedListener mRewardAdListener;
    private OnRewardAdShowListener mRewardShowListener;

    private RewardAd rewardAd;
    private InterstitialAd interstitialAd;

    public interface OnNativeAdListener {
        void onNativeAdLoaded(com.liete.game.fd.huawei.ad.MyNativeAd nativeAd, int statusCode);
        void onAdDisliked(NativeView nativeView);
    }

    public interface OnRewardAdLoadedListener {
        void onAdLoaded(int statusCode);
    }

    public interface OnRewardAdShowListener {
        void onRewarded();

        void onRewardAdFailedToShow(int errorCode);

        void onAdClosed();
    }

    public AdManager(Context context) {
        this.mContext = context;
    }

    public void setOnNativeAdListener(OnNativeAdListener listener){
        this.mNativeAdListener = listener;
    }

    public void setOnRewardAdLoadedListener(OnRewardAdLoadedListener listener){
        this.mRewardAdListener = listener;
    }

    public void setOnRewardAdShowListener(OnRewardAdShowListener listener){
        this.mRewardShowListener = listener;
    }

    /**
     * 加载原生广告
     */
    public void loadNativeAd(ScrollView rootView, String slotId, boolean isSmallOnly) {
        setOnNativeAdListener(new OnNativeAdListener() {
            @Override
            public void onNativeAdLoaded(MyNativeAd nativeAd, int statusCode) {
                // 获取NativeView视图
                NativeView nativeView = getNativeViewByTemplate(nativeAd.getNativeAd(), isSmallOnly);
                rootView.removeAllViews();
                rootView.addView(nativeView);
                nativeAd.getNativeAd().setDislikeAdListener(() -> {
                    rootView.removeView(nativeView);
                });
            }

            @Override
            public void onAdDisliked(NativeView nativeView) {
                rootView.removeView(nativeView);
            }
        });

        loadNativeAd(slotId, AdUtils.getUUID());
    }

    public NativeView getNativeViewByTemplate(NativeAd nativeAd, boolean isSmallOnly) {
        NativeView nativeView;
        int createType = nativeAd.getCreativeType();
        LayoutInflater inflater = LayoutInflater.from(mContext);
        if ((createType  == 7 || createType == 107)) {
            nativeView = (NativeView) inflater.inflate(R.layout.native_ad_small_template, null);
            initNativeVideoAdView(nativeAd, nativeView);
        } else if (createType == 8 || createType == 108) { // TODO
            nativeView = (NativeView) inflater.inflate(R.layout.native_ad_3_images_template, null);
            initThreeImagesAdView(nativeAd, nativeView);
        } else if (createType == 3 || createType == 6 || createType == 103 || createType == 106) {
            if (isSmallOnly) {
                nativeView = (NativeView) inflater.inflate(R.layout.native_ad_small_template, null);
            } else {
                nativeView = (NativeView) inflater.inflate(R.layout.native_ad_video_template, null);
            }
            initNativeVideoAdView(nativeAd, nativeView);
        } else {
            nativeView = (NativeView) inflater.inflate(R.layout.native_ad_video_template, null);
            initNativeVideoAdView(nativeAd, nativeView);
        }
        return nativeView;
    }

    public void loadNativeAd(final String adId, final String requestId) {
        NativeAdLoader.Builder builder = new NativeAdLoader.Builder(mContext, adId);
        builder.setNativeAdLoadedListener(new NativeAd.NativeAdLoadedListener() {
            @Override
            public void onNativeAdLoaded(NativeAd nativeAd) {
                Log.i(TAG,"onNativeAdLoaded, requestId:" + requestId);
                MyNativeAd myNativeAd = new MyNativeAd(nativeAd, requestId);
                if (mNativeAdListener != null) {
                    mNativeAdListener.onNativeAdLoaded(myNativeAd, 200);
                }
            }
        }).setAdListener(new AdListener() {
            @Override
            public void onAdFailed(int errorCode) {
                Log.i(TAG,"onAdFailed, errorCode:" + errorCode);
                // Call this method when an ad fails to be loaded.
                //Log.i(TAG,context.getString(R.string.status_load_ad_fail) + errorCode);
                if (mNativeAdListener != null) {
                    mNativeAdListener.onNativeAdLoaded(null, errorCode);
                }
            }

            @Override
            public void onAdLeave() {
                super.onAdLeave();
            }

            @Override
            public void onAdOpened() {
                super.onAdOpened();
            }

            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
            }

            @Override
            public void onAdClicked() {
                super.onAdClicked();
            }

            @Override
            public void onAdImpression() {
                super.onAdImpression();
            }
        });

        NativeAdConfiguration adConfiguration = new NativeAdConfiguration.Builder()
                //.setRequestCustomDislikeThisAd(true)
                //.setChoicesPosition(choicesPosition)
                .setRequestMultiImages(true)
                .build();

        NativeAdLoader nativeAdLoader = builder.setNativeAdOptions(adConfiguration).build();

        nativeAdLoader.loadAd(new AdParam.Builder().build());

        //Log.i(TAG, context.getString(R.string.status_ad_loading));
    }

    /**
     * Register and populate a native ad material view.
     *
     * @param nativeAd   native ad object that contains ad materials.
     * @param nativeView native ad view to be populated into.
     */
    public void initNativeVideoAdView(NativeAd nativeAd, NativeView nativeView) {
        // Register a native ad material view.
        nativeView.setTitleView(nativeView.findViewById(R.id.ad_title));
        nativeView.setMediaView((MediaView) nativeView.findViewById(R.id.ad_media));
        nativeView.setAdSourceView(nativeView.findViewById(R.id.ad_source));
        nativeView.setCallToActionView(nativeView.findViewById(R.id.ad_call_to_action));

        // Populate a native ad material view.
        ((TextView) nativeView.getTitleView()).setText(nativeAd.getTitle());
        nativeView.getMediaView().setMediaContent(nativeAd.getMediaContent());

        if (null != nativeAd.getAdSource()) {
            ((TextView) nativeView.getAdSourceView()).setText(nativeAd.getAdSource());
        }
        nativeView.getAdSourceView()
                .setVisibility(null != nativeAd.getAdSource() ? View.VISIBLE : View.INVISIBLE);

        if (null != nativeAd.getCallToAction()) {
            ((TextView) nativeView.getCallToActionView()).setText(nativeAd.getCallToAction());
        }
        nativeView.getCallToActionView()
                .setVisibility(null != nativeAd.getCallToAction() ? View.VISIBLE : View.INVISIBLE);

        // Register a native ad object.
        nativeView.setNativeAd(nativeAd);

        AppDownloadButton appDownloadButton = nativeView.findViewById(R.id.app_download_btn);
        appDownloadButton.setAppDownloadButtonStyle(new MyAppDownloadStyle(mContext));
        if (nativeView.register(appDownloadButton)) {
            appDownloadButton.setVisibility(View.VISIBLE);
            appDownloadButton.refreshAppStatus();
            nativeView.getCallToActionView().setVisibility(View.GONE);
        } else {
            appDownloadButton.setVisibility(View.GONE);
            nativeView.getCallToActionView().setVisibility(View.VISIBLE);
        }
    }

    public void initThreeImagesAdView(NativeAd nativeAd, NativeView nativeView) {
        nativeView.setTitleView(nativeView.findViewById(R.id.ad_title));
        nativeView.setAdSourceView(nativeView.findViewById(R.id.ad_source));
        nativeView.setCallToActionView(nativeView.findViewById(R.id.ad_call_to_action));

        ImageView imageView1 = nativeView.findViewById(R.id.image_view_1);
        ImageView imageView2 = nativeView.findViewById(R.id.image_view_2);
        ImageView imageView3 = nativeView.findViewById(R.id.image_view_3);

        ImageView closeBtn = nativeView.findViewById(R.id.close_ad_btn);
        closeBtn.setOnClickListener(view -> {
            if (mNativeAdListener != null) {
                mNativeAdListener.onAdDisliked(nativeView);
            }
        });

        // Populate a native ad material view.
        ((TextView) nativeView.getTitleView()).setText(nativeAd.getTitle());

        if (null != nativeAd.getAdSource()) {
            ((TextView) nativeView.getAdSourceView()).setText(nativeAd.getAdSource());
        }

        nativeView.getAdSourceView()
                .setVisibility(null != nativeAd.getAdSource() ? View.VISIBLE : View.INVISIBLE);

        if (null != nativeAd.getCallToAction()) {
            ((TextView) nativeView.getCallToActionView()).setText(nativeAd.getCallToAction());
        }
        nativeView.getCallToActionView()
                .setVisibility(null != nativeAd.getCallToAction() ? View.VISIBLE : View.INVISIBLE);

        if (nativeAd.getImages() != null && nativeAd.getImages().size() >= 3) {
            imageView1.setImageDrawable(nativeAd.getImages().get(0).getDrawable());
            imageView2.setImageDrawable(nativeAd.getImages().get(1).getDrawable());
            imageView3.setImageDrawable(nativeAd.getImages().get(2).getDrawable());
        }

        nativeView.setNativeAd(nativeAd);

        AppDownloadButton appDownloadButton = nativeView.findViewById(R.id.app_download_btn);
        appDownloadButton.setAppDownloadButtonStyle(new MyAppDownloadStyle(mContext));
        if (nativeView.register(appDownloadButton)) {
            appDownloadButton.setVisibility(View.VISIBLE);
            appDownloadButton.refreshAppStatus();
            nativeView.getCallToActionView().setVisibility(View.GONE);
        } else {
            appDownloadButton.setVisibility(View.GONE);
            nativeView.getCallToActionView().setVisibility(View.VISIBLE);
        }
    }

    private static class MyAppDownloadStyle extends AppDownloadButtonStyle {
        public MyAppDownloadStyle(Context context) {
            super(context);
            normalStyle.setTextColor(context.getColor(R.color.white));
            normalStyle.setBackground(context.getDrawable(R.drawable.bg_button_corner));
            processingStyle.setTextColor(context.getColor(R.color.black));
        }
    }

    public void loadRewardAd(Activity activity, String slotId) {
        if (rewardAd == null) {
            rewardAd = new RewardAd(activity, slotId);
        }
        RewardAdLoadListener listener= new RewardAdLoadListener() {
            @Override
            public void onRewardedLoaded() {
                // 激励广告加载成功
                if (mRewardAdListener != null) {
                    mRewardAdListener.onAdLoaded(200);
                }

                //rewardAdShow(activity, rewardAd);
            }
            @Override
            public void onRewardAdFailedToLoad(int errorCode) {
                // 激励广告加载失败
                if (mRewardAdListener != null) {
                    mRewardAdListener.onAdLoaded(errorCode);
                }

                //loadInterstitialAd(activity, Constant.SLOT_INTERSTITIAL_RESUME);
            }
        };
        rewardAd.loadAd(new AdParam.Builder().build(), listener);
    }

    /**
     * 展示激励广告
     */
    public boolean rewardAdShow(Activity activity, OnRewardAdShowListener listener) {
        if (rewardAd != null && rewardAd.isLoaded()) {
            //rewardAd.show(activity, listener);
            rewardAd.show(activity, new RewardAdStatusListener() {
                @Override
                public void onRewardAdOpened() {
                    // 激励广告被打开
                }
                @Override
                public void onRewardAdFailedToShow(int errorCode) {
                    // 激励广告展示失败
                    if (listener != null) {
                        listener.onRewardAdFailedToShow(errorCode);
                    }
                }
                @Override
                public void onRewardAdClosed() {
                    // 激励广告被关闭
                    if (listener != null) {
                        listener.onAdClosed();
                    }
                }
                @Override
                public void onRewarded(Reward reward){
                    // 激励广告奖励达成，发放奖励
                    if (listener != null) {
                        listener.onRewarded();
                    }
                }
            });
            return true;
        } else {
            if (listener != null) {
                listener.onRewardAdFailedToShow(-1);
            }
        }
        return false;
    }

    public void loadInterstitialAd(Activity activity, String slotId) {
        if (interstitialAd == null) {
            interstitialAd = new InterstitialAd(activity);
        }
        interstitialAd.setAdId(slotId);
        interstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {

            }
            @Override
            public void onAdFailed(int errorCode) {
            }
        });
        AdParam adParam = new AdParam.Builder().build();
        interstitialAd.loadAd(adParam);
    }

    private boolean showInterstitialAd(Activity activity) {
        // 显示广告
        if (interstitialAd != null &&interstitialAd.isLoaded()) {
            interstitialAd.show(activity);
            return true;
        } else {
            return false;
        }
    }
}
