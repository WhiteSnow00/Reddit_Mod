// 
// Decompiled by Procyon v0.6.0
// 

package n6;

import java.util.concurrent.Executor;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import android.os.Handler;
import m6.l;

public final class b implements a
{
    public final l a;
    public final Handler b;
    public final b$a c;
    
    public b(final ExecutorService executorService) {
        this.b = new Handler(Looper.getMainLooper());
        this.c = new Executor() {
            @Override
            public final void execute(final Runnable runnable) {
                n6.b.this.b.post(runnable);
            }
        };
        this.a = new l(executorService);
    }
    
    public final void a(final Runnable runnable) {
        this.a.execute(runnable);
    }
}
