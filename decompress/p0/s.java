// 
// Decompiled by Procyon v0.6.0
// 

package p0;

import kotlin.NoWhenBranchMatchedException;
import ah2.f;
import androidx.compose.foundation.layout.IntrinsicSize;
import j1.d;

public final class s
{
    public static final d a(d d, final IntrinsicSize intrinsicSize) {
        f.f((Object)d, "<this>");
        f.f((Object)intrinsicSize, "intrinsicSize");
        final int n = a.a[intrinsicSize.ordinal()];
        if (n != 1) {
            if (n != 2) {
                throw new NoWhenBranchMatchedException();
            }
            d = d.f0((d)u.f);
        }
        else {
            d = d.f0((d)w.f);
        }
        return d;
    }
    
    public static final d b(d d, final IntrinsicSize intrinsicSize) {
        f.f((Object)d, "<this>");
        f.f((Object)intrinsicSize, "intrinsicSize");
        final int n = a.a[intrinsicSize.ordinal()];
        if (n != 1) {
            if (n != 2) {
                throw new NoWhenBranchMatchedException();
            }
            d = d.f0((d)v.f);
        }
        else {
            d = d.f0((d)x.f);
        }
        return d;
    }
}
