// 
// Decompiled by Procyon v0.6.0
// 

package bf2;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class a implements df2.a
{
    public final AtomicBoolean f;
    
    public a() {
        this.f = new AtomicBoolean();
    }
    
    public abstract void a();
    
    public final void dispose() {
        if (this.f.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.a();
            }
            else {
                cf2.a.a().c((Runnable)new a$a(this));
            }
        }
    }
    
    public final boolean isDisposed() {
        return this.f.get();
    }
}
