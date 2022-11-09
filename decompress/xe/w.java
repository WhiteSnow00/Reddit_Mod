// 
// Decompiled by Procyon v0.6.0
// 

package xe;

import android.os.Handler;
import android.os.Looper;
import ne.a;
import java.util.concurrent.Executor;

public final class w implements Executor
{
    public final a f;
    
    public w() {
        this.f = new a(Looper.getMainLooper());
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        ((Handler)this.f).post(runnable);
    }
}
