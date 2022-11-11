// 
// Decompiled by Procyon v0.6.0
// 

package ve;

import java.util.concurrent.ExecutionException;

public final class m implements e, d, b
{
    public final Object a;
    public final int b;
    public final x<Void> c;
    public int d;
    public int e;
    public int f;
    public Exception g;
    public boolean h;
    
    public m(final int b, final x<Void> c) {
        this.a = new Object();
        this.b = b;
        this.c = c;
    }
    
    public final void a(final Exception g) {
        synchronized (this.a) {
            ++this.e;
            this.g = g;
            this.b();
        }
    }
    
    public final void b() {
        if (this.d + this.e + this.f == this.b) {
            if (this.g != null) {
                final x<Void> c = this.c;
                final int e = this.e;
                final int b = this.b;
                final StringBuilder sb = new StringBuilder(54);
                sb.append(e);
                sb.append(" out of ");
                sb.append(b);
                sb.append(" underlying tasks failed");
                c.s(new ExecutionException(sb.toString(), this.g));
                return;
            }
            if (this.h) {
                this.c.u();
                return;
            }
            this.c.t(null);
        }
    }
    
    public final void onCanceled() {
        synchronized (this.a) {
            ++this.f;
            this.h = true;
            this.b();
        }
    }
    
    public final void onSuccess(final Object o) {
        synchronized (this.a) {
            ++this.d;
            this.b();
        }
    }
}
