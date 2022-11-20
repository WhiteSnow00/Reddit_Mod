// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.font;

import x1.c;
import n2.a0;
import n2.o;
import n2.g;
import ng2.e;
import n2.h;
import n2.s$a;
import n2.y;
import mg2.l;
import n2.j;
import n2.z;
import n2.s;
import n2.r;
import n2.g$a;

public final class b implements g$a
{
    public final r a;
    public final s b;
    public final z c;
    public final j d;
    public final cg.j e;
    public final l<y, Object> f;
    
    public b(final r a, n2.b b, final int n) {
        if ((n & 0x2) != 0x0) {
            s.a.getClass();
            b = (n2.b)s$a.b;
        }
        cg.j e = null;
        z a2;
        if ((n & 0x4) != 0x0) {
            a2 = h.a;
        }
        else {
            a2 = null;
        }
        j d;
        if ((n & 0x8) != 0x0) {
            d = new j(h.b);
        }
        else {
            d = null;
        }
        if ((n & 0x10) != 0x0) {
            e = new cg.j();
        }
        ng2.e.f((Object)b, "platformResolveInterceptor");
        ng2.e.f((Object)a2, "typefaceRequestCache");
        ng2.e.f((Object)d, "fontListFontFamilyTypefaceAdapter");
        ng2.e.f((Object)e, "platformFamilyTypefaceAdapter");
        this.a = a;
        this.b = (s)b;
        this.c = a2;
        this.d = d;
        this.e = e;
        this.f = (l<y, Object>)new FontFamilyResolverImpl$createDefaultTypeface$1(this);
    }
    
    public final a0 a(final g g, o a, final int n, final int n2) {
        ng2.e.f((Object)a, "fontWeight");
        this.b.getClass();
        final s.s$a a2 = s.a;
        a = this.b.a(a);
        this.b.getClass();
        this.b.getClass();
        return this.b(new y(g, a, n, n2, this.a.b()));
    }
    
    public final a0 b(final y y) {
        final z c = this.c;
        final FontFamilyResolverImpl$resolve$result$1 fontFamilyResolverImpl$resolve$result$1 = new FontFamilyResolverImpl$resolve$result$1(this, y);
        c.getClass();
        synchronized (c.a) {
            final a0 a0 = (a0)c.b.a((Object)y);
            if (a0 != null) {
                if (a0.e()) {
                    monitorexit(c.a);
                    return a0;
                }
                final a0 a3 = (a0)c.b.c((Object)y);
            }
            monitorexit(c.a);
            try {
                final a0 a4 = (a0)((l)fontFamilyResolverImpl$resolve$result$1).invoke((Object)new TypefaceRequestCache$runCached$currentTypefaceResult$1(c, y));
                final c a5 = c.a;
                synchronized (c.a) {
                    if (c.b.a((Object)y) == null && a4.e()) {
                        c.b.b((Object)y, (Object)a4);
                    }
                    final cg2.j a6 = cg2.j.a;
                    monitorexit(c.a);
                    return a4;
                }
            }
            catch (final Exception ex) {
                throw new IllegalStateException("Could not load font", ex);
            }
        }
    }
}
