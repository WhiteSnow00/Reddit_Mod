// 
// Decompiled by Procyon v0.6.0
// 

package m0;

import a4.f2;
import n1.c;
import a4.e2;
import at1.a;
import android.widget.Magnifier$Builder;
import android.widget.Magnifier;
import ah2.f;
import u2.b;
import android.view.View;

public final class v implements t
{
    public static final v a;
    
    static {
        a = new v();
    }
    
    public final s a(final n n, final View view, final b b, final float initialZoom) {
        f.f((Object)n, "style");
        f.f((Object)view, "view");
        f.f((Object)b, "density");
        a a;
        if (f.a((Object)n, (Object)n.h)) {
            a = new a(new Magnifier(view));
        }
        else {
            final long b2 = b.b0(n.b);
            final float m0 = b.M0(n.c);
            final float m2 = b.M0(n.d);
            final Magnifier$Builder magnifier$Builder = new Magnifier$Builder(view);
            if (b2 != n1.f.c) {
                magnifier$Builder.setSize(at1.a.D1(n1.f.e(b2)), at1.a.D1(n1.f.c(b2)));
            }
            if (!Float.isNaN(m0)) {
                magnifier$Builder.setCornerRadius(m0);
            }
            if (!Float.isNaN(m2)) {
                magnifier$Builder.setElevation(m2);
            }
            if (!Float.isNaN(initialZoom)) {
                magnifier$Builder.setInitialZoom(initialZoom);
            }
            magnifier$Builder.setClippingEnabled(n.e);
            final Magnifier build = magnifier$Builder.build();
            f.e((Object)build, "Builder(view).run {\n    \u2026    build()\n            }");
            a = new a(build);
        }
        return (s)a;
    }
    
    public final boolean b() {
        return true;
    }
    
    public static final class a extends u.a
    {
        public a(final Magnifier magnifier) {
            super(magnifier);
        }
        
        @Override
        public final void b(final long n, final long n2, final float n3) {
            if (!Float.isNaN(n3)) {
                e2.h(super.a, n3);
            }
            if (yd.a.N1(n2)) {
                f2.d(super.a, c.c(n), c.d(n), c.c(n2), c.d(n2));
            }
            else {
                super.a.show(c.c(n), c.d(n));
            }
        }
    }
}
