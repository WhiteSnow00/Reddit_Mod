// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.webembed.browser;

import android.webkit.ConsoleMessage;
import android.graphics.Bitmap$Config;
import android.os.Build$VERSION;
import android.graphics.Bitmap;
import android.webkit.WebChromeClient;

public final class c extends WebChromeClient
{
    public final Bitmap getDefaultVideoPoster() {
        if (Build$VERSION.SDK_INT >= 25) {
            return super.getDefaultVideoPoster();
        }
        final Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
        if (defaultVideoPoster != null) {
            return defaultVideoPoster;
        }
        return Bitmap.createBitmap(4, 4, Bitmap$Config.ARGB_8888);
    }
    
    public final boolean onConsoleMessage(final ConsoleMessage consoleMessage) {
        consoleMessage.message();
        return super.onConsoleMessage(consoleMessage);
    }
}
