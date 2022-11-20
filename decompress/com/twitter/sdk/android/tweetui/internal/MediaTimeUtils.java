// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui.internal;

import java.util.Locale;

final class MediaTimeUtils
{
    private static final String TIME_FORMAT_LONG = "%1$d:%2$02d:%3$02d";
    private static final String TIME_FORMAT_SHORT = "%1$d:%2$02d";
    
    private MediaTimeUtils() {
    }
    
    public static String getPlaybackTime(final long n) {
        final int n2 = (int)(n / 1000L);
        final int n3 = n2 % 60;
        final int n4 = n2 / 60 % 60;
        final int n5 = n2 / 3600;
        if (n5 > 0) {
            return String.format(Locale.getDefault(), "%1$d:%2$02d:%3$02d", n5, n4, n3);
        }
        return String.format(Locale.getDefault(), "%1$d:%2$02d", n4, n3);
    }
}
