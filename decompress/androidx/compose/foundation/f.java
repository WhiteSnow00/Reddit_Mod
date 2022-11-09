// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import zg2.q;
import androidx.compose.ui.ComposedModifierKt;
import m0.t;
import pg2.j;
import u2.b;
import m0.v;
import m0.u;
import android.os.Build$VERSION;
import androidx.compose.ui.platform.InspectableValueKt;
import j1.d;
import m0.n;
import zg2.l;
import n1.c;
import androidx.compose.ui.semantics.a;

public final class f
{
    public static final a<zg2.a<c>> a;
    
    static {
        a = new a<zg2.a<c>>("MagnifierPositionInRoot");
    }
    
    public static d a(final l l, final n n, final l i) {
        final d.a f = d.a.f;
        final MagnifierKt$magnifier$1 instance = MagnifierKt$magnifier$1.INSTANCE;
        ah2.f.f((Object)instance, "magnifierCenter");
        ah2.f.f((Object)n, "style");
        final l a = InspectableValueKt.a;
        final int sdk_INT = Build$VERSION.SDK_INT;
        final int n2 = 1;
        Object b;
        if (sdk_INT >= 28) {
            int n3;
            if (sdk_INT >= 28) {
                n3 = n2;
            }
            else {
                n3 = 0;
            }
            if (n3 == 0) {
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            }
            Object o;
            if (sdk_INT == 28) {
                o = u.a;
            }
            else {
                o = v.a;
            }
            b = ComposedModifierKt.b((d)f, (q)new MagnifierKt$magnifier$4((l<? super b, c>)l, (l<? super b, c>)instance, Float.NaN, (l<? super u2.f, j>)i, (t)o, n));
        }
        else {
            b = f;
        }
        return InspectableValueKt.a((d)f, a, (d)b);
    }
}
