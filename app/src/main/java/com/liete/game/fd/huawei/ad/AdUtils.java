package com.liete.game.fd.huawei.ad;

import java.util.UUID;

public abstract class AdUtils {

    public static String getUUID() {
        UUID uuid = UUID.randomUUID();
        String uniqueId = uuid.toString();
        return uniqueId;
    }
}
