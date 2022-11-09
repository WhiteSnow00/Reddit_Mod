// 
// Decompiled by Procyon v0.6.0
// 

package l9;

import java.util.concurrent.Executor;

public final class e
{
    public static final e$a a;
    public static final e$b b;
    
    static {
        a = new Executor() {
            @Override
            public final void execute(final Runnable runnable) {
                j.f().post(runnable);
            }
        };
        b = new Executor() {
            @Override
            public final void execute(final Runnable runnable) {
                runnable.run();
            }
        };
    }
}
