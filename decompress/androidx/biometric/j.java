// 
// Decompiled by Procyon v0.6.0
// 

package androidx.biometric;

import java.util.concurrent.Executor;
import androidx.lifecycle.x;
import android.util.Log;
import androidx.lifecycle.y;

public final class j implements y<Boolean>
{
    public final /* synthetic */ e a;
    
    public j(final e a) {
        this.a = a;
    }
    
    public final void a(final Object o) {
        if (o) {
            final e a = this.a;
            if (a.q0()) {
                a.y0(a.getString(2131953558));
            }
            final r g = a.g;
            if (!g.n) {
                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
            }
            else {
                Object d = g.d;
                if (d == null) {
                    d = new r$b();
                }
                ((Executor)d).execute((Runnable)new f(a));
            }
            final r g2 = this.a.g;
            if (g2.u == null) {
                g2.u = new x<Boolean>();
            }
            r.i(g2.u, Boolean.FALSE);
        }
    }
}
