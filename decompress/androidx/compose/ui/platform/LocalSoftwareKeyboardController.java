// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import mg2.q;
import z0.d$a;
import o2.t;
import z0.m0;
import androidx.compose.runtime.ComposerKt;
import z0.d;
import mg2.a;
import androidx.compose.runtime.CompositionLocalKt;
import z0.r;

public final class LocalSoftwareKeyboardController
{
    public static final r a;
    
    static {
        a = CompositionLocalKt.c((a)LocalSoftwareKeyboardController$LocalSoftwareKeyboardController$1.INSTANCE);
    }
    
    public static c1 a(final d d) {
        d.A(-1059476185);
        final q a = ComposerKt.a;
        c1 c1;
        if ((c1 = (c1)d.u((m0)LocalSoftwareKeyboardController.a)) == null) {
            d.A(1835581880);
            final t t = (t)d.u((m0)CompositionLocalsKt.l);
            if (t == null) {
                d.H();
                c1 = null;
            }
            else {
                d.A(1157296644);
                final boolean m = d.m((Object)t);
                final Object b = d.B();
                e0 e0;
                if (m || (e0 = (e0)b) == d$a.a) {
                    e0 = new e0(t);
                    d.w((Object)e0);
                }
                d.H();
                c1 = e0;
                d.H();
            }
        }
        d.H();
        return c1;
    }
}
