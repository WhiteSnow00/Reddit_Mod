// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Iterator;
import j0.h$c;
import j0.b;

public final class k1 extends l2
{
    public final b g;
    public final b h;
    public long i;
    
    public k1(final h4 h4) {
        super(h4);
        this.h = new b();
        this.g = new b();
    }
    
    public final void N(final long n, final String s) {
        if (s != null && s.length() != 0) {
            ((h4)super.f).b().U((Runnable)new a(this, s, n));
            return;
        }
        ((h4)super.f).h().k.a("Ad unit id must be a non-empty string");
    }
    
    public final void O(final long n, final String s) {
        if (s != null && s.length() != 0) {
            ((h4)super.f).b().U(new w(this, s, n));
            return;
        }
        ((h4)super.f).h().k.a("Ad unit id must be a non-empty string");
    }
    
    public final void P(final long n) {
        final u5 t = ((h4)super.f).u().T(false);
        for (final String s : (h$c)this.g.keySet()) {
            this.R(s, n - (long)this.g.getOrDefault((Object)s, (Object)null), t);
        }
        if (!this.g.isEmpty()) {
            this.Q(n - this.i, t);
        }
        this.S(n);
    }
    
    public final void Q(final long n, final u5 u5) {
        if (u5 == null) {
            ((h4)super.f).h().s.a("Not logging ad exposure. No active activity");
            return;
        }
        if (n < 1000L) {
            ((h4)super.f).h().s.b((Object)n, "Not logging ad exposure. Less than 1000 ms. exposure");
            return;
        }
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putLong("_xt", n);
        n7.Z(u5, bundle, true);
        ((h4)super.f).t().T(bundle, "am", "_xa");
    }
    
    public final void R(final String s, final long n, final u5 u5) {
        if (u5 == null) {
            ((h4)super.f).h().s.a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (n < 1000L) {
            ((h4)super.f).h().s.b((Object)n, "Not logging ad unit exposure. Less than 1000 ms. exposure");
            return;
        }
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("_ai", s);
        ((BaseBundle)bundle).putLong("_xt", n);
        n7.Z(u5, bundle, true);
        ((h4)super.f).t().T(bundle, "am", "_xu");
    }
    
    public final void S(final long i) {
        final Iterator iterator = ((h$c)this.g.keySet()).iterator();
        while (iterator.hasNext()) {
            this.g.put((Object)iterator.next(), (Object)i);
        }
        if (!this.g.isEmpty()) {
            this.i = i;
        }
    }
}
