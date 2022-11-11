// 
// Decompiled by Procyon v0.6.0
// 

package m6;

import androidx.work.WorkInfo;
import androidx.work.impl.utils.futures.a;

public abstract class o<T> implements Runnable
{
    public final a<T> f;
    
    public o() {
        this.f = (a<T>)new a();
    }
    
    public abstract WorkInfo a();
    
    @Override
    public final void run() {
        try {
            this.f.i((Object)this.a());
        }
        finally {
            final Throwable t;
            this.f.j(t);
        }
    }
}
