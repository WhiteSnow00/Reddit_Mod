// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import p0.r;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import zg2.l;
import z0.s;
import z0.o0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i1.f$a;
import a4.d;
import android.os.Build$VERSION;
import a4.a2;
import android.view.ViewParent;
import p0.i0;
import mj2.c0;
import yd.a;
import q3.f;
import p0.p;
import p0.g0;
import p0.c;
import android.view.View;
import java.util.WeakHashMap;

public final class b
{
    public static final WeakHashMap<View, b> s;
    public final c a;
    public final c b;
    public final c c;
    public final c d;
    public final c e;
    public final c f;
    public final c g;
    public final c h;
    public final c i;
    public final g0 j;
    public final g0 k;
    public final g0 l;
    public final g0 m;
    public final g0 n;
    public final g0 o;
    public final boolean p;
    public int q;
    public final p r;
    
    static {
        new a();
        s = new WeakHashMap<View, b>();
    }
    
    public b(View view) {
        this.a = androidx.compose.foundation.layout.b.a.a(4, "captionBar");
        final c a = androidx.compose.foundation.layout.b.a.a(128, "displayCutout");
        this.b = a;
        final c a2 = androidx.compose.foundation.layout.b.a.a(8, "ime");
        this.c = a2;
        final c a3 = androidx.compose.foundation.layout.b.a.a(32, "mandatorySystemGestures");
        this.d = a3;
        this.e = androidx.compose.foundation.layout.b.a.a(2, "navigationBars");
        boolean booleanValue = true;
        this.f = androidx.compose.foundation.layout.b.a.a(1, "statusBars");
        final c a4 = androidx.compose.foundation.layout.b.a.a(7, "systemBars");
        this.g = a4;
        final c a5 = androidx.compose.foundation.layout.b.a.a(16, "systemGestures");
        this.h = a5;
        final c a6 = androidx.compose.foundation.layout.b.a.a(64, "tappableElement");
        this.i = a6;
        final g0 j = new g0(yd.a.C2(q3.f.e), "waterfall");
        this.j = j;
        c0.l0((i0)c0.l0((i0)c0.l0((i0)a4, (i0)a2), (i0)a), (i0)c0.l0((i0)c0.l0((i0)c0.l0((i0)a6, (i0)a3), (i0)a5), (i0)j));
        this.k = androidx.compose.foundation.layout.b.a.b(4, "captionBarIgnoringVisibility");
        this.l = androidx.compose.foundation.layout.b.a.b(2, "navigationBarsIgnoringVisibility");
        this.m = androidx.compose.foundation.layout.b.a.b(1, "statusBarsIgnoringVisibility");
        this.n = androidx.compose.foundation.layout.b.a.b(7, "systemBarsIgnoringVisibility");
        this.o = androidx.compose.foundation.layout.b.a.b(64, "tappableElementIgnoringVisibility");
        final ViewParent parent = view.getParent();
        final boolean b = parent instanceof View;
        Boolean b2 = null;
        if (b) {
            view = (View)parent;
        }
        else {
            view = null;
        }
        Object tag;
        if (view != null) {
            tag = view.getTag(2131428443);
        }
        else {
            tag = null;
        }
        if (tag instanceof Boolean) {
            b2 = (Boolean)tag;
        }
        if (b2 != null) {
            booleanValue = b2;
        }
        this.p = booleanValue;
        this.r = new p(this);
    }
    
    public final void a(final a2 a2, final int n) {
        ah2.f.f((Object)a2, "windowInsets");
        this.a.f(a2, n);
        this.c.f(a2, n);
        this.b.f(a2, n);
        this.e.f(a2, n);
        this.f.f(a2, n);
        this.g.f(a2, n);
        this.h.f(a2, n);
        this.i.f(a2, n);
        this.d.f(a2, n);
        if (n == 0) {
            final g0 k = this.k;
            final f b = a2.b(4);
            ah2.f.e((Object)b, "insets.getInsetsIgnoring\u2026aptionBar()\n            )");
            ((SnapshotMutableStateImpl<r>)k.b).setValue(yd.a.C2(b));
            final g0 l = this.l;
            final f b2 = a2.b(2);
            ah2.f.e((Object)b2, "insets.getInsetsIgnoring\u2026ationBars()\n            )");
            ((SnapshotMutableStateImpl<r>)l.b).setValue(yd.a.C2(b2));
            final g0 m = this.m;
            final f b3 = a2.b(1);
            ah2.f.e((Object)b3, "insets.getInsetsIgnoring\u2026tatusBars()\n            )");
            ((SnapshotMutableStateImpl<r>)m.b).setValue(yd.a.C2(b3));
            final g0 n2 = this.n;
            final f b4 = a2.b(7);
            ah2.f.e((Object)b4, "insets.getInsetsIgnoring\u2026ystemBars()\n            )");
            ((SnapshotMutableStateImpl<r>)n2.b).setValue(yd.a.C2(b4));
            final g0 o = this.o;
            final f b5 = a2.b(64);
            ah2.f.e((Object)b5, "insets.getInsetsIgnoring\u2026leElement()\n            )");
            ((SnapshotMutableStateImpl<r>)o.b).setValue(yd.a.C2(b5));
            final d e = a2.a.e();
            if (e != null) {
                f f;
                if (Build$VERSION.SDK_INT >= 30) {
                    f = q3.f.c(a4.d.b.b(e.a));
                }
                else {
                    f = q3.f.e;
                }
                ((SnapshotMutableStateImpl<r>)this.j.b).setValue(yd.a.C2(f));
            }
        }
        f$a.d();
    }
    
    public static final class a
    {
        public static final c a(final int n, final String s) {
            final WeakHashMap<View, b> s2 = b.s;
            return new c(n, s);
        }
        
        public static final g0 b(final int n, final String s) {
            final WeakHashMap<View, b> s2 = b.s;
            return new g0(yd.a.C2(f.e), s);
        }
        
        public static b c(final z0.d d) {
            d.A(-1366542614);
            final View view = (View)d.t(AndroidCompositionLocals_androidKt.f);
            final WeakHashMap<View, b> s = b.s;
            synchronized (s) {
                b value;
                if ((value = s.get(view)) == null) {
                    value = new b(view);
                    s.put(view, value);
                }
                final b b = value;
                monitorexit(s);
                z0.s.c(b, (l)new WindowInsetsHolder$Companion$current$1(b, view), d);
                d.I();
                return b;
            }
        }
    }
}
