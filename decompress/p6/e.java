// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import java.util.Iterator;
import bolts.ExecutorException;
import dg.k;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.ArrayList;

public final class e<TResult>
{
    public static final a.a e;
    public final Object a;
    public boolean b;
    public TResult c;
    public ArrayList d;
    
    static {
        final ExecutorService a = b.b.a;
        e = p6.a.b.a;
        new e(null);
        new e(Boolean.TRUE);
        new e(Boolean.FALSE);
        new e(0);
    }
    
    public e() {
        this.a = new Object();
        this.d = new ArrayList();
    }
    
    public e(final int n) {
        final Object a = new Object();
        this.a = a;
        this.d = new ArrayList();
        synchronized (a) {
            if (this.b) {
                monitorexit(a);
            }
            else {
                this.b = true;
                a.notifyAll();
                this.b();
            }
        }
    }
    
    public e(final Boolean b) {
        this.a = new Object();
        this.d = new ArrayList();
        this.c(b);
    }
    
    public static void a(final a.a a, final Callable callable) {
        final k k = new k(2);
        try {
            a.execute(new d(k, callable));
        }
        catch (final Exception ex) {
            k.e((Exception)new ExecutorException(ex));
        }
    }
    
    public final void b() {
        synchronized (this.a) {
            for (final c c : this.d) {
                try {
                    c.a();
                    continue;
                }
                catch (final Exception ex) {
                    throw new RuntimeException(ex);
                }
                catch (final RuntimeException ex2) {
                    throw ex2;
                }
                break;
            }
            this.d = null;
        }
    }
    
    public final boolean c(final TResult c) {
        synchronized (this.a) {
            if (this.b) {
                return false;
            }
            this.b = true;
            this.c = c;
            this.a.notifyAll();
            this.b();
            return true;
        }
    }
}
