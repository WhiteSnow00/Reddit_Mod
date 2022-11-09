// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import android.view.View;
import java.util.WeakHashMap;
import z0.d$a;
import ah2.f;
import kotlin.Metadata;
import j1.d;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
public final class WindowInsetsPadding_androidKt$imePadding$$inlined$windowInsetsPadding$1 extends Lambda implements q<d, z0.d, Integer, d>
{
    public WindowInsetsPadding_androidKt$imePadding$$inlined$windowInsetsPadding$1() {
        super(3);
    }
    
    public final d invoke(final d d, final z0.d d2, final int n) {
        f.f((Object)d, "$this$composed");
        d2.A(359872873);
        final WeakHashMap<View, b> s = b.s;
        final b c = b.a.c(d2);
        d2.A(1157296644);
        final boolean l = d2.l(c);
        final Object b = d2.B();
        InsetsPaddingModifier insetsPaddingModifier;
        if (l || (insetsPaddingModifier = (InsetsPaddingModifier)b) == d$a.a) {
            insetsPaddingModifier = new InsetsPaddingModifier(c.c);
            d2.v(insetsPaddingModifier);
        }
        d2.I();
        final InsetsPaddingModifier insetsPaddingModifier2 = insetsPaddingModifier;
        d2.I();
        return (d)insetsPaddingModifier2;
    }
}
