package com.liete.game.fd.huawei.ad;

import com.huawei.hms.ads.nativead.NativeAd;

public class MyNativeAd {

    private String requestId;

    private NativeAd nativeAd;

    public MyNativeAd(NativeAd nativeAd, String requestId) {
        this.nativeAd = nativeAd;
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public NativeAd getNativeAd() {
        return nativeAd;
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.nativeAd = nativeAd;
    }
}
