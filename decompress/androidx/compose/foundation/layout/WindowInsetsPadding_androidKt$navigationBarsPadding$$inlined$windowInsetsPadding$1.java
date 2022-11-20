// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import java.util.WeakHashMap;
import z0.d$a;
import androidx.compose.runtime.ComposerKt;
import ng2.e;
import kotlin.Metadata;
import j1.d;
import mg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
public final class WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$windowInsetsPadding$1 extends Lambda implements q<d, z0.d, Integer, d>
{
    public WindowInsetsPadding_androidKt$navigationBarsPadding$$inlined$windowInsetsPadding$1() {
        super(3);
    }
    
    public final d invoke(final d d, final z0.d d2, final int n) {
        e.f((Object)d, "$this$composed");
        d2.A(359872873);
        final q a = ComposerKt.a;
        final WeakHashMap s = b.s;
        final b c = b$a.c(d2);
        d2.A(1157296644);
        final boolean m = d2.m((Object)c);
        final Object b = d2.B();
        InsetsPaddingModifier insetsPaddingModifier;
        if (m || (insetsPaddingModifier = (InsetsPaddingModifier)b) == d$a.a) {
            insetsPaddingModifier = new InsetsPaddingModifier(c.e);
            d2.w((Object)insetsPaddingModifier);
        }
        d2.H();
        final InsetsPaddingModifier insetsPaddingModifier2 = insetsPaddingModifier;
        d2.H();
        return (d)insetsPaddingModifier2;
    }
    
    public /* bridge */ Object invoke(final Object o, final Object o2, final Object o3) {
        return this.invoke((d)o, (z0.d)o2, ((Number)o3).intValue());
    }
}
