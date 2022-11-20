// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.internal.extensions;

import m5.a;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0015\u0010\u0003\u001a\u00020\u0001*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007" }, d2 = { "HOURS_FMT", "", "MINUTES_FMT", "msToTimeString", "", "getMsToTimeString", "(J)Ljava/lang/String;", "player_release" }, k = 2, mv = { 1, 7, 1 }, xi = 48)
public final class LongExtensionsKt
{
    private static final String HOURS_FMT = "%1$d:%2$02d:%3$02d";
    private static final String MINUTES_FMT = "%2$d:%3$02d";
    
    public static final String getMsToTimeString(long n) {
        final long n2 = n / 1000;
        final long n3 = 60;
        long n4 = n2 / n3;
        if (n4 > 60L) {
            n = n4 / n3;
            n4 %= n3;
        }
        else {
            n = 0L;
        }
        String s;
        if (n > 0L) {
            s = "%1$d:%2$02d:%3$02d";
        }
        else {
            s = "%2$d:%3$02d";
        }
        return a.k(new Object[] { n, n4, n2 % n3 }, 3, s, "format(this, *args)");
    }
}
