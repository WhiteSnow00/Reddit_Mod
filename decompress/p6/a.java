// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class a
{
    public static final a b;
    public static final int c;
    public static final int d;
    public final a a;
    
    static {
        b = new a();
        final int availableProcessors = Runtime.getRuntime().availableProcessors();
        c = availableProcessors + 1;
        d = availableProcessors * 2 + 1;
    }
    
    public a() {
        this.a = new a();
    }
    
    public static final class a implements Executor
    {
        @Override
        public final void execute(final Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }
}
