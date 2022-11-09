// 
// Decompiled by Procyon v0.6.0
// 

package xe;

import java.util.concurrent.Executor;

public final class v implements Executor
{
    @Override
    public final void execute(final Runnable runnable) {
        runnable.run();
    }
}
