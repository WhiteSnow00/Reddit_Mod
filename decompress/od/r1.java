// 
// Decompiled by Procyon v0.6.0
// 

package od;

import md.d;
import ve.c;
import z0.c1;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import ui.b;
import ve.h;

public final class r1<ResultT> extends d1
{
    public final p<Object, ResultT> b;
    public final h<ResultT> c;
    public final b d;
    
    public r1(final int n, final p<Object, ResultT> b, final h<ResultT> c, final b d) {
        super(n);
        this.c = c;
        this.b = b;
        this.d = d;
        if (n == 2 && b.b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }
    
    public final void a(final Status status) {
        final h<ResultT> c = this.c;
        this.d.getClass();
        c.c((Exception)lw0.b.u0(status));
    }
    
    public final void b(final RuntimeException ex) {
        this.c.c((Exception)ex);
    }
    
    public final void c(final w0<?> w0) throws DeadObjectException {
        try {
            this.b.a(w0.b, (h)this.c);
        }
        catch (final RuntimeException ex) {
            this.c.c((Exception)ex);
        }
        catch (final RemoteException ex2) {
            this.a(t1.e(ex2));
        }
        catch (final DeadObjectException ex3) {
            throw ex3;
        }
    }
    
    public final void d(final s s, final boolean b) {
        final h<ResultT> c = this.c;
        s.b.put(c, b);
        c.a.q((c)new c1((Object)s, (Object)c, 7));
    }
    
    @Override
    public final boolean f(final w0<?> w0) {
        return this.b.b;
    }
    
    @Override
    public final d[] g(final w0<?> w0) {
        return this.b.a;
    }
}
