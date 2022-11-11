// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.identity;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;

class OAuthWebChromeClient extends WebChromeClient
{
    public OAuthWebChromeClient() {
    }
    
    public boolean onConsoleMessage(final ConsoleMessage consoleMessage) {
        return true;
    }
}
