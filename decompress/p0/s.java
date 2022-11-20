// 
// Decompiled by Procyon v0.6.0
// 

package p0;

import kotlin.NoWhenBranchMatchedException;
import ng2.e;
import androidx.compose.foundation.layout.IntrinsicSize;
import j1.d;

public final class s
{
    public static final d a(d d, final IntrinsicSize intrinsicSize) {
        e.f((Object)d, "<this>");
        e.f((Object)intrinsicSize, "intrinsicSize");
        final int n = a.a[((Enum)intrinsicSize).ordinal()];
        if (n != 1) {
            if (n != 2) {
                throw new NoWhenBranchMatchedException();
            }
            d = d.l0((d)u.f);
        }
        else {
            d = d.l0((d)w.f);
        }
        return d;
    }
    
    public static final d b(d d, final IntrinsicSize intrinsicSize) {
        e.f((Object)d, "<this>");
        e.f((Object)intrinsicSize, "intrinsicSize");
        final int n = a.a[((Enum)intrinsicSize).ordinal()];
        if (n != 1) {
            if (n != 2) {
                throw new NoWhenBranchMatchedException();
            }
            d = d.l0((d)v.f);
        }
        else {
            d = d.l0((d)x.f);
        }
        return d;
    }
    
    public final class a
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[IntrinsicSize.values().length];
            a2[((Enum)IntrinsicSize.Min).ordinal()] = 1;
            a2[((Enum)IntrinsicSize.Max).ordinal()] = 2;
            a = a2;
        }
    }
}
