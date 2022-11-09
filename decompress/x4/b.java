// 
// Decompiled by Procyon v0.6.0
// 

package x4;

import java.util.concurrent.FutureTask;
import p2.e;
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
        final x4.a a = (x4.a)this;
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
                final x4.a.a i = a.i;
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
            final w4.b.a<D> a = (w4.b.a<D>)b;
            a.getClass();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                a.k(n);
            }
            else {
                a.i(n);
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
        p2.e.g(sb, (Object)this);
        sb.append(" id=");
        return d.l(sb, this.a, "}");
    }
    
    public interface a<D>
    {
    }
}
