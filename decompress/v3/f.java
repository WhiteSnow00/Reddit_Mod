// 
// Decompiled by Procyon v0.6.0
// 

package v3;

import java.util.concurrent.RejectedExecutionException;
import android.os.Handler;
import java.util.concurrent.Executor;

public final class f implements Executor
{
    public final Handler f;
    
    public f(final Handler f) {
        this.f = f;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        final Handler f = this.f;
        runnable.getClass();
        if (f.post(runnable)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append(" is shutting down");
        throw new RejectedExecutionException(sb.toString());
    }
}
