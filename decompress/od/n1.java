// 
// Decompiled by Procyon v0.6.0
// 

package od;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import ve.h;

public abstract class n1<T> extends d1
{
    public final h<T> b;
    
    public n1(final h b) {
        super(4);
        this.b = (h<T>)b;
    }
    
    public final void a(final Status status) {
        this.b.c((Exception)new ApiException(status));
    }
    
    public final void b(final RuntimeException ex) {
        this.b.c((Exception)ex);
    }
    
    public final void c(final w0<?> w0) throws DeadObjectException {
        try {
            this.h(w0);
        }
        catch (final RuntimeException ex) {
            this.b.c((Exception)ex);
        }
        catch (final RemoteException ex2) {
            this.a(t1.e(ex2));
        }
        catch (final DeadObjectException ex3) {
            this.a(t1.e((RemoteException)ex3));
            throw ex3;
        }
    }
    
    public abstract void h(final w0<?> p0) throws RemoteException;
}
