// 
// Decompiled by Procyon v0.6.0
// 

package w3;

import android.os.Handler;
import z3.a;
import java.util.concurrent.Callable;

public final class o<T> implements Runnable
{
    public Callable<T> f;
    public a<T> g;
    public Handler h;
    
    public o(final Handler h, final i f, final j g) {
        this.f = (Callable<T>)f;
        this.g = (a<T>)g;
        this.h = h;
    }
    
    @Override
    public final void run() {
        Object call;
        try {
            call = this.f.call();
        }
        catch (final Exception ex) {
            call = null;
        }
        this.h.post((Runnable)new Runnable(this.g, call) {
            public final a f;
            public final Object g;
            
            @Override
            public final void run() {
                this.f.accept(this.g);
            }
        });
    }
}
