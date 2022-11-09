// 
// Decompiled by Procyon v0.6.0
// 

package qd;

import com.google.android.gms.common.api.internal.BasePendingResult;
import od.b;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a$e;
import pd.c;
import com.google.android.gms.common.api.internal.a;

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
        this.a.n.k(n, false);
    }
    
    public final boolean d() {
        this.a.m.getClass();
        this.a.h();
        return true;
    }
    
    public final <A, T extends a<? extends c, A>> T e(final T t) {
        try {
            final p1 b = this.a.m.B;
            b.a.add(t);
            ((BasePendingResult)t).e.set(b.b);
            final a$e a$e = this.a.m.t.get(t.m);
            yd.a.T0((Object)a$e, "Appropriate Api was not requested.");
            if (!a$e.b() && this.a.g.containsKey(t.m)) {
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
    
    public final void f(final Bundle bundle) {
    }
    
    public final void g(final b b, final com.google.android.gms.common.api.a<?> a, final boolean b2) {
    }
}
