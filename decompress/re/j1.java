// 
// Decompiled by Procyon v0.6.0
// 

package re;

import android.os.BaseBundle;
import j0.i;
import android.os.Bundle;
import java.util.Iterator;
import j0.h$c;
import j0.b;

public final class j1 extends k2
{
    public final b g;
    public final b h;
    public long i;
    
    public j1(final h4 h4) {
        super(h4);
        this.h = new b();
        this.g = new b();
    }
    
    public final void A(final long n, final String s) {
        if (s != null && s.length() != 0) {
            ((h4)((u5.w)this).f).a().G((Runnable)new w(this, s, n));
            return;
        }
        ((h4)((u5.w)this).f).f().k.a("Ad unit id must be a non-empty string");
    }
    
    public final void B(final long n) {
        final t5 f = ((h4)((u5.w)this).f).v().F(false);
        for (final String s : (h$c)this.g.keySet()) {
            this.D(s, n - (long)((i)this.g).getOrDefault((Object)s, (Object)null), f);
        }
        if (!((i)this.g).isEmpty()) {
            this.C(n - this.i, f);
        }
        this.E(n);
    }
    
    public final void C(final long n, final t5 t5) {
        if (t5 == null) {
            ((h4)((u5.w)this).f).f().s.a("Not logging ad exposure. No active activity");
            return;
        }
        if (n < 1000L) {
            ((h4)((u5.w)this).f).f().s.b(n, "Not logging ad exposure. Less than 1000 ms. exposure");
            return;
        }
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putLong("_xt", n);
        n7.L(t5, bundle, true);
        ((h4)((u5.w)this).f).u().F(bundle, "am", "_xa");
    }
    
    public final void D(final String s, final long n, final t5 t5) {
        if (t5 == null) {
            ((h4)((u5.w)this).f).f().s.a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (n < 1000L) {
            ((h4)((u5.w)this).f).f().s.b(n, "Not logging ad unit exposure. Less than 1000 ms. exposure");
            return;
        }
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("_ai", s);
        ((BaseBundle)bundle).putLong("_xt", n);
        n7.L(t5, bundle, true);
        ((h4)((u5.w)this).f).u().F(bundle, "am", "_xu");
    }
    
    public final void E(final long i) {
        final Iterator iterator = ((h$c)this.g.keySet()).iterator();
        while (iterator.hasNext()) {
            ((i)this.g).put((Object)iterator.next(), (Object)i);
        }
        if (!((i)this.g).isEmpty()) {
            this.i = i;
        }
    }
    
    public final void z(final long n, final String s) {
        if (s != null && s.length() != 0) {
            ((h4)((u5.w)this).f).a().G(new a(this, s, n));
            return;
        }
        ((h4)((u5.w)this).f).f().k.a("Ad unit id must be a non-empty string");
    }
}
