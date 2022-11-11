// 
// Decompiled by Procyon v0.6.0
// 

package hf2;

import android.os.Handler;
import android.os.Looper;
import kf2.o;
import io.reactivex.internal.util.ExceptionHelper;
import a4.a0;
import java.util.concurrent.Callable;
import ff2.b0;

public final class a
{
    public static final b0 a;
    
    static {
        final Callable<b0> callable = new Callable<b0>() {
            @Override
            public final Object call() throws Exception {
                return b.a;
            }
        };
        final o h = a0.h;
        Label_0062: {
            if (h == null) {
                try {
                    if (b.a != null) {
                        break Label_0062;
                    }
                    throw new NullPointerException("Scheduler Callable returned null");
                }
                finally {
                    final b0 a2;
                    throw ExceptionHelper.d((Throwable)a2);
                }
            }
            try {
                final b0 a2 = (b0)h.apply((Object)callable);
                if (a2 != null) {
                    a = a2;
                    return;
                }
                throw new NullPointerException("Scheduler Callable returned null");
            }
            finally {
                final Throwable t;
                throw ExceptionHelper.d(t);
            }
        }
    }
    
    public static b0 a() {
        b0 a = hf2.a.a;
        if (a != null) {
            final o i = a0.i;
            if (i == null) {
                return a;
            }
            try {
                a = (b0)i.apply((Object)a);
                return a;
            }
            finally {
                final Throwable t;
                throw ExceptionHelper.d(t);
            }
        }
        throw new NullPointerException("scheduler == null");
    }
    
    public static final class b
    {
        public static final hf2.b a;
        
        static {
            a = new hf2.b(new Handler(Looper.getMainLooper()));
        }
    }
}
