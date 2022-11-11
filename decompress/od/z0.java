// 
// Decompiled by Procyon v0.6.0
// 

package od;

import md.b;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import pd.j;
import com.google.android.gms.common.api.a$e;
import pd.b$c;

public final class z0 implements b$c, k1
{
    public final a$e a;
    public final a<?> b;
    public j c;
    public Set<Scope> d;
    public boolean e;
    public final /* synthetic */ e f;
    
    public z0(final e f, final a$e a, final a<?> b) {
        this.f = f;
        this.c = null;
        this.d = null;
        this.e = false;
        this.a = a;
        this.b = b;
    }
    
    public final void a(final b b) {
        this.f.s.post((Runnable)new y0(this, b));
    }
    
    public final void b(final b b) {
        final w0 w0 = this.f.o.get(this.b);
        if (w0 != null) {
            lw0.b.K(w0.l.s);
            final a$e b2 = w0.b;
            final String name = b2.getClass().getName();
            final String value = String.valueOf(b);
            b2.e(b.j(new StringBuilder(name.length() + 25 + value.length()), "onSignInFailed for ", name, " with ", value));
            w0.p(b, null);
        }
    }
}
