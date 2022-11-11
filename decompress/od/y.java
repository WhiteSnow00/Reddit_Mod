// 
// Decompiled by Procyon v0.6.0
// 

package od;

import java.util.concurrent.locks.Lock;
import android.os.Looper;
import md.b;
import com.google.android.gms.common.api.a;
import java.lang.ref.WeakReference;
import pd.b$c;

public final class y implements b$c
{
    public final WeakReference<h0> a;
    public final a<?> b;
    public final boolean c;
    
    public y(final h0 h0, final a<?> b, final boolean c) {
        this.a = new WeakReference<h0>(h0);
        this.b = b;
        this.c = c;
    }
    
    public final void a(final b b) {
        final h0 h0 = this.a.get();
        if (h0 == null) {
            return;
        }
        lw0.b.W(Looper.myLooper() == h0.a.m.l, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        h0.b.lock();
        try {
            Lock lock;
            if (!h0.n(0)) {
                lock = h0.b;
            }
            else {
                if (!b.x()) {
                    h0.l(b, this.b, this.c);
                }
                if (h0.o()) {
                    h0.m();
                }
                lock = h0.b;
            }
            lock.unlock();
        }
        finally {
            h0.b.unlock();
        }
    }
}
