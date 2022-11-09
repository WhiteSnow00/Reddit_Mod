// 
// Decompiled by Procyon v0.6.0
// 

package qd;

import ag0.a;
import android.os.Message;
import android.os.Looper;
import fe.f;

public final class j0 extends f
{
    public final /* synthetic */ l0 a;
    
    public j0(final l0 a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(Message a) {
        final int what = a.what;
        if (what != 1) {
            if (what != 2) {
                a.u(31, "Unknown message id: ", what, "GoogleApiClientImpl");
                return;
            }
            final l0 a2 = this.a;
            a2.g.lock();
            try {
                if (a2.n) {
                    a2.n();
                }
                return;
            }
            finally {
                a2.g.unlock();
            }
        }
        a = (Message)this.a;
        ((l0)a).g.lock();
        try {
            if (((l0)a).i()) {
                ((l0)a).n();
            }
        }
        finally {
            ((l0)a).g.unlock();
        }
    }
}
