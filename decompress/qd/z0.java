// 
// Decompiled by Procyon v0.6.0
// 

package qd;

import android.os.Handler;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import rd.j;
import com.google.android.gms.common.api.a$e;
import rd.b;

public final class z0 implements c, k1
{
    public final a$e a;
    public final qd.a<?> b;
    public j c;
    public Set<Scope> d;
    public boolean e;
    public final /* synthetic */ e f;
    
    public z0(final e f, final a$e a, final qd.a<?> b) {
        this.f = f;
        this.c = null;
        this.d = null;
        this.e = false;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final od.b b) {
        ((Handler)this.f.s).post((Runnable)new y0(this, b));
    }
    
    public final void b(final od.b b) {
        final w0 w0 = this.f.o.get(this.b);
        if (w0 != null) {
            yd.a.M0(w0.l.s);
            final a$e b2 = w0.b;
            final String name = b2.getClass().getName();
            final String value = String.valueOf(b);
            b2.e(a.j(new StringBuilder(name.length() + 25 + value.length()), "onSignInFailed for ", name, " with ", value));
            w0.p(b, null);
        }
    }
}
