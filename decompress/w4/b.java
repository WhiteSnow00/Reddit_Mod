// 
// Decompiled by Procyon v0.6.0
// 

package w4;

import java.util.concurrent.FutureTask;
import cg.d;
import android.os.Looper;
import android.content.Context;

public class b<D>
{
    public int a;
    public a<D> b;
    public Context c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    
    public b(final Context context) {
        this.d = false;
        this.e = false;
        this.f = true;
        this.g = false;
        this.c = context.getApplicationContext();
    }
    
    public final void a() {
        final w4.a a = (w4.a)this;
        if (a.i != null) {
            if (!a.d) {
                a.g = true;
            }
            if (a.j != null) {
                a.i.getClass();
                a.i = null;
            }
            else {
                a.i.getClass();
                final w4.a.a i = a.i;
                i.i.set(true);
                if (((FutureTask)i.g).cancel(false)) {
                    a.j = a.i;
                }
                a.i = null;
            }
        }
    }
    
    public void b(final D n) {
        final a<D> b = this.b;
        if (b != null) {
            final v4.b.a<D> a = (v4.b.a<D>)b;
            a.getClass();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                a.k(n);
            }
            else {
                a.i((Object)n);
            }
        }
    }
    
    public void c() {
        throw null;
    }
    
    public void d() {
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(64);
        cg.d.T0(sb, (Object)this);
        sb.append(" id=");
        return a.q(sb, this.a, "}");
    }
    
    public interface a<D>
    {
    }
}
