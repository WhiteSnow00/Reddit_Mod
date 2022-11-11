// 
// Decompiled by Procyon v0.6.0
// 

package x4;

import androidx.lifecycle.x;
import androidx.loader.content.ModernAsyncTask;
import bg.d;
import android.os.Looper;
import w4.b$a;
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
            if (!((b)a).d) {
                ((b)a).g = true;
            }
            if (a.j != null) {
                a.i.getClass();
                a.i = null;
            }
            else {
                a.i.getClass();
                final a$a i = a.i;
                ((ModernAsyncTask)i).i.set(true);
                if (((ModernAsyncTask)i).g.cancel(false)) {
                    a.j = a.i;
                }
                a.i = null;
            }
        }
    }
    
    public void b(final D n) {
        final a<D> b = this.b;
        if (b != null) {
            final b$a b$a = (b$a)b;
            b$a.getClass();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                b$a.k((Object)n);
            }
            else {
                ((x)b$a).i((Object)n);
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
        bg.d.H(sb, (Object)this);
        sb.append(" id=");
        return al0.a.l(sb, this.a, "}");
    }
    
    public interface a<D>
    {
    }
}
