// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.lang.reflect.InvocationTargetException;
import android.os.Handler$Callback;
import android.os.Build$VERSION;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import android.os.Handler;
import java.util.concurrent.ExecutorService;

public final class 12D extends 01Y
{
    public final Object LIZ;
    public final ExecutorService LIZIZ;
    public volatile Handler LIZJ;
    
    static {
        Covode.recordClassIndex(189);
    }
    
    public 12D() {
        this.LIZ = new Object();
        final 01X lji = new 01X();
        final 6uu liz = 6ut.LIZ(6v6.FIXED);
        liz.LIZJ = 4;
        liz.LJI = lji;
        this.LIZIZ = 6v3.LIZ(liz.LIZ());
    }
    
    public static Handler LIZ(final Looper looper) {
        if (Build$VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return Handler.class.getDeclaredConstructor(Looper.class, Handler$Callback.class, Boolean.TYPE).newInstance(looper, null, true);
        }
        catch (final InvocationTargetException ex) {
            return new Handler(looper);
        }
        catch (final IllegalAccessException | InstantiationException | NoSuchMethodException ex2) {
            return new Handler(looper);
        }
    }
    
    @Override
    public final void LIZ(final Runnable runnable) {
        if (ILu.LIZIZ.getValue()) {
            if (runnable != null) {
                6v3.LIZ().execute(runnable);
            }
        }
        else {
            this.LIZIZ.execute(runnable);
        }
    }
    
    @Override
    public final void LIZIZ(final Runnable runnable) {
        if (this.LIZJ == null) {
            synchronized (this.LIZ) {
                if (this.LIZJ == null) {
                    this.LIZJ = LIZ(Looper.getMainLooper());
                }
            }
        }
        this.LIZJ.post(runnable);
    }
    
    @Override
    public final boolean LIZIZ() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
