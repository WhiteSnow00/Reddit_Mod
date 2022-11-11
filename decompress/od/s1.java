// 
// Decompiled by Procyon v0.6.0
// 

package od;

import android.os.RemoteException;
import md.d;
import ve.h;

public final class s1 extends n1<Boolean>
{
    public final i$a<?> c;
    
    public s1(final i$a<?> c, final h<Boolean> h) {
        super(h);
        this.c = c;
    }
    
    @Override
    public final boolean f(final w0<?> w0) {
        if (w0.f.get(this.c) == null) {
            return false;
        }
        throw null;
    }
    
    @Override
    public final d[] g(final w0<?> w0) {
        if (w0.f.get(this.c) == null) {
            return null;
        }
        throw null;
    }
    
    @Override
    public final void h(final w0<?> w0) throws RemoteException {
        if (w0.f.remove(this.c) == null) {
            super.b.d((Object)Boolean.FALSE);
            return;
        }
        throw null;
    }
}
