// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text.selection;

import wd.a;
import rg2.l;
import androidx.compose.animation.core.VectorConvertersKt;
import n1.c;
import l0.d0;
import l0.h0;
import l0.g;

public final class SelectionMagnifierKt
{
    public static final g a;
    public static final h0 b;
    public static final long c;
    public static final d0<c> d;
    
    static {
        a = new g(Float.NaN, Float.NaN);
        b = VectorConvertersKt.a((l)SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1.INSTANCE, (l)SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2.INSTANCE);
        d = new d0((Object)new c(c = wd.a.f(0.01f, 0.01f)), 3);
    }
}
