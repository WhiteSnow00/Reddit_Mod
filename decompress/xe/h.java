// 
// Decompiled by Procyon v0.6.0
// 

package xe;

public final class h<TResult>
{
    public final x<TResult> a;
    
    public h() {
        this.a = new x<TResult>();
    }
    
    public final void a(final Exception ex) {
        this.a.s(ex);
    }
    
    public final void b(final TResult tResult) {
        this.a.t(tResult);
    }
    
    public final boolean c(final Exception f) {
        final x<TResult> a = this.a;
        a.getClass();
        if (f != null) {
            synchronized (a.a) {
                boolean b;
                if (a.c) {
                    monitorexit(a.a);
                    b = false;
                }
                else {
                    a.c = true;
                    a.f = f;
                    monitorexit(a.a);
                    a.b.b(a);
                    b = true;
                }
                return b;
            }
        }
        throw new NullPointerException("Exception must not be null");
    }
    
    public final void d(final Object e) {
        final x<TResult> a = this.a;
        synchronized (a.a) {
            if (a.c) {
                monitorexit(a.a);
            }
            else {
                a.c = true;
                a.e = (TResult)e;
                monitorexit(a.a);
                a.b.b(a);
            }
        }
    }
}
