// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import z0.i;
import z0.r0;
import z0.u0;
import z0.z0;
import sg2.e;
import z0.w0;
import z0.x;
import java.util.List;
import java.util.ArrayList;
import z0.k0;
import hg2.j;
import z0.t0;
import z0.y0;
import z0.c;
import rg2.q;

public final class ComposerKt
{
    public static final q<c<?>, y0, t0, j> a;
    public static final q<c<?>, y0, t0, j> b;
    public static final q<c<?>, y0, t0, j> c;
    public static final q<c<?>, y0, t0, j> d;
    public static final q<c<?>, y0, t0, j> e;
    public static final k0 f;
    public static final k0 g;
    public static final k0 h;
    public static final k0 i;
    public static final k0 j;
    public static final k0 k;
    
    static {
        a = (q)ComposerKt$removeCurrentGroupInstance.ComposerKt$removeCurrentGroupInstance$1.INSTANCE;
        b = (q)ComposerKt$skipToGroupEndInstance.ComposerKt$skipToGroupEndInstance$1.INSTANCE;
        c = (q)ComposerKt$endGroupInstance.ComposerKt$endGroupInstance$1.INSTANCE;
        d = (q)ComposerKt$startRootGroup.ComposerKt$startRootGroup$1.INSTANCE;
        e = (q)ComposerKt$resetSlotsInstance.ComposerKt$resetSlotsInstance$1.INSTANCE;
        f = new k0("provider");
        g = new k0("provider");
        h = new k0("compositionLocalMap");
        i = new k0("providerValues");
        j = new k0("providers");
        k = new k0("reference");
    }
    
    public static final void a(int d, final int n, final ArrayList list) {
        final int n2 = d = d(d, list);
        if (n2 < 0) {
            d = -(n2 + 1);
        }
        while (d < list.size() && list.get(d).b < n) {
            list.remove(d);
        }
    }
    
    public static final void b(final w0 w0, final ArrayList list, final int n) {
        if (w0.i(n)) {
            list.add(w0.j(n));
        }
        else {
            for (int i = n + 1; i < w0.h(n) + n; i += w0.h(i)) {
                b(w0, list, i);
            }
        }
    }
    
    public static final void c(final String s) {
        sg2.e.f((Object)s, "message");
        final StringBuilder sb = new StringBuilder();
        sb.append("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (");
        sb.append(s);
        sb.append("). Please report to Google or use https://goo.gle/compose-feedback");
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public static final int d(final int n, final List list) {
        int n2 = list.size() - 1;
        int i = 0;
        while (i <= n2) {
            final int n3 = i + n2 >>> 1;
            final int h = sg2.e.h(list.get(n3).b, n);
            if (h < 0) {
                i = n3 + 1;
            }
            else {
                if (h <= 0) {
                    return n3;
                }
                n2 = n3 - 1;
            }
        }
        return -(i + 1);
    }
    
    public static final void e(final y0 y0, final t0 t0) {
        sg2.e.f((Object)y0, "<this>");
        sg2.e.f((Object)t0, "rememberManager");
        final int g = y0.g(y0.n(y0.r), y0.b);
        final int[] b = y0.b;
        final int r = y0.r;
        final z0 z0 = new z0(g, y0.g(y0.n(y0.o(r) + r), b), y0);
        while (z0.hasNext()) {
            final Object next = z0.next();
            if (next instanceof u0) {
                t0.a((u0)next);
            }
            else {
                if (!(next instanceof r0)) {
                    continue;
                }
                final r0 r2 = (r0)next;
                final i b2 = r2.b;
                if (b2 == null) {
                    continue;
                }
                b2.s = true;
                r2.b = null;
                r2.f = null;
                r2.g = null;
            }
        }
        y0.B();
    }
    
    public static final void f(final boolean b) {
        if (b) {
            return;
        }
        c("Check failed".toString());
        throw null;
    }
}
