// 
// Decompiled by Procyon v0.6.0
// 

package od;

import de.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a$e;
import com.google.android.gms.common.internal.MethodInvocation;
import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;
import pd.b;
import pd.o;
import ve.g;
import ve.c;

public final class f1<T> implements c<T>
{
    public final e f;
    public final int g;
    public final a<?> h;
    public final long i;
    public final long j;
    
    public f1(final e f, final int g, final a h, final long i, final long j) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final void z(final g<T> g) {
        if (!this.f.b()) {
            return;
        }
        o.a().getClass();
        final w0 w0 = this.f.o.get(this.h);
        if (w0 != null) {
            final a$e b = w0.b;
            if (b instanceof b) {
                final b b2 = (b)b;
                final long i = this.i;
                boolean b3 = true;
                if (i <= 0L) {
                    b3 = false;
                }
                final int a = b2.A;
                int n = 100;
                final e f = this.f;
                int n2 = 0;
                Label_0196: {
                    if (g.n()) {
                        n = (n2 = 0);
                    }
                    else {
                        if (!g.l()) {
                            final Exception j = g.i();
                            if (j instanceof ApiException) {
                                final Status status = ((ApiException)j).getStatus();
                                final int g2 = status.g;
                                final md.b k = status.j;
                                int g3;
                                if (k == null) {
                                    g3 = -1;
                                }
                                else {
                                    g3 = k.g;
                                }
                                n2 = g3;
                                n = g2;
                                break Label_0196;
                            }
                            n = 101;
                        }
                        n2 = -1;
                    }
                }
                long l;
                long currentTimeMillis;
                int n3;
                if (b3) {
                    l = this.i;
                    currentTimeMillis = System.currentTimeMillis();
                    n3 = (int)(SystemClock.elapsedRealtime() - this.j);
                }
                else {
                    currentTimeMillis = (l = 0L);
                    n3 = -1;
                }
                final MethodInvocation methodInvocation = new MethodInvocation(this.g, n, n2, l, currentTimeMillis, (String)null, (String)null, a, n3);
                final long n4 = 5000;
                final f s = f.s;
                s.sendMessage(s.obtainMessage(18, (Object)new g1(methodInvocation, 0, n4, 100)));
            }
        }
    }
}
