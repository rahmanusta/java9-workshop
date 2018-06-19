package com.kodedu.http2.server;

import javax.net.ssl.X509TrustManager;
import java.security.cert.X509Certificate;

public class TrustAllCertificates implements X509TrustManager {
    public void checkClientTrusted(X509Certificate[] certs, String authType) {
    }

    public void checkServerTrusted(X509Certificate[] certs, String authType) {
    }

    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }
}
