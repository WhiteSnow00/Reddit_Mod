// 
// Decompiled by Procyon v0.6.0
// 

package od;

import android.os.Message;
import android.os.Looper;
import de.f;

public final class j0 extends f
{
    public final /* synthetic */ l0 a;
    
    public j0(final l0 a, final Looper looper) {
        this.a = a;
        super(looper);
    }
    
    public final void handleMessage(final Message message) {
        final int what = message.what;
        if (what != 1) {
            if (what != 2) {
                d.w(31, "Unknown message id: ", what, "GoogleApiClientImpl");
                return;
            }
            final l0 a = this.a;
            a.g.lock();
            try {
                if (a.n) {
                    a.k();
                }
                return;
            }
            finally {
                a.g.unlock();
            }
        }
        final l0 a2 = this.a;
        a2.g.lock();
        try {
            if (a2.i()) {
                a2.k();
            }
        }
        finally {
            a2.g.unlock();
        }
    }
}
