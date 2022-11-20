// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import ph0.a;
import android.os.Message;
import android.os.Looper;
import ee.f;

public final class j0 extends f
{
    public final l0 a;
    
    public j0(final l0 a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(Message a) {
        final int what = a.what;
        if (what != 1) {
            if (what != 2) {
                a.h(31, "Unknown message id: ", what, "GoogleApiClientImpl");
                return;
            }
            a = (Message)this.a;
            ((l0)a).g.lock();
            try {
                if (((l0)a).n) {
                    ((l0)a).l();
                }
                return;
            }
            finally {
                ((l0)a).g.unlock();
            }
        }
        final l0 a2 = this.a;
        a2.g.lock();
        try {
            if (a2.j()) {
                a2.l();
            }
        }
        finally {
            a2.g.unlock();
        }
    }
}
