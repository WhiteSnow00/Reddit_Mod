// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal;

import android.net.Uri;
import android.net.Uri$Builder;
import java.text.Normalizer;
import android.os.Build$VERSION;
import android.os.Build;

public class TwitterApi
{
    public static final String BASE_HOST = "api.twitter.com";
    public static final String BASE_HOST_URL = "https://api.twitter.com";
    private final String baseHostUrl;
    
    public TwitterApi() {
        this("https://api.twitter.com");
    }
    
    public TwitterApi(final String baseHostUrl) {
        this.baseHostUrl = baseHostUrl;
    }
    
    public static String buildUserAgent(final String s, String model) {
        final StringBuilder sb = new StringBuilder(s);
        sb.append('/');
        sb.append(model);
        sb.append(' ');
        model = Build.MODEL;
        sb.append(model);
        sb.append('/');
        sb.append(Build$VERSION.RELEASE);
        sb.append(" (");
        sb.append(Build.MANUFACTURER);
        sb.append(';');
        sb.append(model);
        sb.append(';');
        sb.append(Build.BRAND);
        sb.append(';');
        sb.append(Build.PRODUCT);
        sb.append(')');
        return normalizeString(sb.toString());
    }
    
    public static String normalizeString(final String s) {
        return stripNonAscii(Normalizer.normalize(s, Normalizer.Form.NFD));
    }
    
    public static String stripNonAscii(final String s) {
        final StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (char1 > '\u001f' && char1 < '\u007f') {
                sb.append(char1);
            }
        }
        return sb.toString();
    }
    
    public Uri$Builder buildUponBaseHostUrl(final String... array) {
        final Uri$Builder buildUpon = Uri.parse(this.getBaseHostUrl()).buildUpon();
        if (array != null) {
            for (int length = array.length, i = 0; i < length; ++i) {
                buildUpon.appendPath(array[i]);
            }
        }
        return buildUpon;
    }
    
    public String getBaseHostUrl() {
        return this.baseHostUrl;
    }
}
