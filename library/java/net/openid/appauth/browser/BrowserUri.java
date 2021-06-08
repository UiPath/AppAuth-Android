package net.openid.appauth.browser;

import android.net.Uri;

class BrowserUri {
    private static final String EXAMPLE_URL = "https://www.example.com";
    static final Uri CHROME = Uri.parse("googlechrome://" + EXAMPLE_URL);
    static final Uri SAMSUNG_INTERNET = Uri.parse("samsunginternet://com.sec.android.app.sbrowser://" + EXAMPLE_URL);
    static final Uri FIREFOX = Uri.parse("firefox://" + EXAMPLE_URL);
    static final Uri EDGE = Uri.parse("microsoft-edge://" + EXAMPLE_URL);

    private BrowserUri() {
        // Empty constructor
    }
}
