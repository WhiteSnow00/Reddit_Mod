// 
// Decompiled by Procyon v0.6.0
// 

package je;

import rd.b;
import android.util.Log;
import rd.d;
import com.google.android.gms.common.api.c;
import android.os.Looper;
import android.content.Context;

public final class j extends q
{
    public final f N;
    
    public j(final Context context, final Looper looper, final c.b b, final c.c c, final d d) {
        super(context, looper, b, c, d);
        this.N = new f(context, super.M);
    }
    
    public final void a() {
        synchronized (this.N) {
            if (((b)this).b()) {
                try {
                    this.N.a();
                    this.N.b();
                }
                catch (final Exception ex) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", (Throwable)ex);
                }
            }
            super.a();
        }
    }
}
