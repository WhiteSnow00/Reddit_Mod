// 
// Decompiled by Procyon v0.6.0
// 

package od;

import com.google.android.gms.common.api.internal.BasePendingResult;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a$e;
import nd.c;
import com.google.android.gms.common.api.a;
import md.b;

public final class x implements m0
{
    public final p0 a;
    
    public x(final p0 a) {
        this.a = a;
    }
    
    public final void a() {
    }
    
    public final void b() {
    }
    
    public final void c(final int n) {
        this.a.h();
        this.a.n.q(n, false);
    }
    
    public final void d(final b b, final a<?> a, final boolean b2) {
    }
    
    public final boolean e() {
        this.a.m.getClass();
        this.a.h();
        return true;
    }
    
    public final <A, T extends com.google.android.gms.common.api.internal.a<? extends c, A>> T f(final T t) {
        try {
            final p1 b = this.a.m.B;
            b.a.add(t);
            ((BasePendingResult)t).e.set(b.b);
            final a$e a$e = this.a.m.t.get(t.m);
            lw0.b.S((Object)a$e, "Appropriate Api was not requested.");
            if (!a$e.c() && this.a.g.containsKey(t.m)) {
                t.m(new Status(17, (PendingIntent)null, (String)null));
            }
            else {
                try {
                    t.l(a$e);
                }
                catch (final RemoteException ex) {
                    t.m(new Status(8, (PendingIntent)null, ((Throwable)ex).getLocalizedMessage()));
                }
                catch (final DeadObjectException ex2) {
                    t.m(new Status(8, (PendingIntent)null, ((Throwable)ex2).getLocalizedMessage()));
                    throw ex2;
                }
            }
        }
        catch (final DeadObjectException ex3) {
            this.a.i(new w(this, (m0)this));
        }
        return t;
    }
    
    public final void g(final Bundle bundle) {
    }
}
