// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.font;

import n2.y;
import n2.m;
import ah2.f;
import n2.h;
import n2.b;
import n2.w;
import zg2.l;
import n2.j;
import n2.x;
import n2.q;
import n2.p;
import n2.g;

public final class c implements a
{
    public final p a;
    public final q b;
    public final x c;
    public final j d;
    public final a2.c e;
    public final l<w, Object> f;
    
    public c(final p a, b b, final int n) {
        if ((n & 0x2) != 0x0) {
            q.a.getClass();
            b = (b)q.a.b;
        }
        a2.c e = null;
        x a2;
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
            e = new a2.c(1);
        }
        ah2.f.f((Object)b, "platformResolveInterceptor");
        ah2.f.f((Object)a2, "typefaceRequestCache");
        ah2.f.f((Object)d, "fontListFontFamilyTypefaceAdapter");
        ah2.f.f((Object)e, "platformFamilyTypefaceAdapter");
        this.a = a;
        this.b = b;
        this.c = a2;
        this.d = d;
        this.e = e;
        this.f = (l<w, Object>)new FontFamilyResolverImpl$createDefaultTypeface$1(this);
    }
    
    @Override
    public final y a(final g g, m a, final int n, final int n2) {
        ah2.f.f((Object)a, "fontWeight");
        this.b.getClass();
        final q.a a2 = q.a;
        a = this.b.a(a);
        this.b.getClass();
        this.b.getClass();
        return this.b(new w(g, a, n, n2, this.a.b()));
    }
    
    public final y b(final w w) {
        final x c = this.c;
        final FontFamilyResolverImpl$resolve$result$1 fontFamilyResolverImpl$resolve$result$1 = new FontFamilyResolverImpl$resolve$result$1(this, w);
        c.getClass();
        synchronized (c.a) {
            final y y = (y)c.b.a((Object)w);
            if (y != null) {
                if (y.c()) {
                    monitorexit(c.a);
                    return y;
                }
                final y y3 = (y)c.b.c((Object)w);
            }
            monitorexit(c.a);
            try {
                final y y4 = (y)((l)fontFamilyResolverImpl$resolve$result$1).invoke((Object)new TypefaceRequestCache$runCached$currentTypefaceResult$1(c, w));
                final v0.j a = c.a;
                synchronized (c.a) {
                    if (c.b.a((Object)w) == null && y4.c()) {
                        c.b.b((Object)w, (Object)y4);
                    }
                    final pg2.j a2 = pg2.j.a;
                    monitorexit(c.a);
                    return y4;
                }
            }
            catch (final Exception ex) {
                throw new IllegalStateException("Could not load font", ex);
            }
        }
    }
}
