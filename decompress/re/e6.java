// 
// Decompiled by Procyon v0.6.0
// 

package re;

import u5.w;
import android.os.RemoteException;
import ke.u0;

public final class e6 implements Runnable
{
    public final /* synthetic */ t f;
    public final /* synthetic */ String g;
    public final /* synthetic */ u0 h;
    public final /* synthetic */ l6 i;
    
    public e6(final l6 i, final t f, final String g, final u0 h) {
        this.i = i;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void run() {
        final byte[] array = null;
        final byte[] array2 = null;
        Object o = array;
        while (true) {
            Label_0100: {
                try {
                    try {
                        final l6 i = this.i;
                        o = array;
                        final t2 j = i.i;
                        if (j == null) {
                            o = array;
                            ((h4)((w)i).f).f().k.a("Discarding data. Failed to send event to service to bundle");
                            o = ((w)this.i).f;
                            final byte[] array3 = array2;
                            ((h4)o).y().T(this.h, array3);
                            return;
                        }
                        break Label_0100;
                    }
                    finally {}
                }
                catch (final RemoteException ex) {
                    ((h4)((w)this.i).f).f().k.b(ex, "Failed to send event to the service to bundle");
                    o = ((w)this.i).f;
                    continue;
                    final t2 j;
                    final byte[] e = j.E(this.f, this.g);
                    this.i.J();
                    o = ((w)this.i).f;
                    final byte[] array3 = e;
                    continue;
                }
            }
            break;
        }
        ((h4)((w)this.i).f).y().T(this.h, (byte[])o);
    }
}
