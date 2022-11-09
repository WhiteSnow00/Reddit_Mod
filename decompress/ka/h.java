// 
// Decompiled by Procyon v0.6.0
// 

package ka;

import pa.a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;

public final class h implements Executor
{
    public final Executor f;
    
    public h(final ExecutorService f) {
        this.f = f;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.f.execute(new a(runnable));
    }
    
    public static final class a implements Runnable
    {
        public final Runnable f;
        
        public a(final Runnable f) {
            this.f = f;
        }
        
        @Override
        public final void run() {
            try {
                this.f.run();
            }
            catch (final Exception ex) {
                pa.a.b("Executor", "Background execution failure.", ex);
            }
        }
    }
}
