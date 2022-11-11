// 
// Decompiled by Procyon v0.6.0
// 

package wc;

import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.h;

public final class m
{
    public static h.a a(final f f) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final int length = f.length();
        int n;
        int n2;
        for (int i = n = 0; i < length; ++i, n = n2) {
            n2 = n;
            if (f.b(i, elapsedRealtime)) {
                n2 = n + 1;
            }
        }
        return new h.a(1, 0, length, n);
    }
}
