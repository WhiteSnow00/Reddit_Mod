// 
// Decompiled by Procyon v0.6.0
// 

package m;

import java.lang.reflect.InvocationTargetException;
import android.os.Handler$Callback;
import androidx.compose.ui.platform.r;
import android.os.Build$VERSION;
import android.os.Looper;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import android.support.v4.media.a;

public final class b extends a
{
    public final Object f;
    public final ExecutorService g;
    public volatile Handler h;
    
    public b() {
        this.f = new Object();
        this.g = Executors.newFixedThreadPool(4, (ThreadFactory)new b$a());
    }
    
    public static Handler r2(final Looper looper) {
        if (Build$VERSION.SDK_INT >= 28) {
            return r.b(looper);
        }
        try {
            return Handler.class.getDeclaredConstructor(Looper.class, Handler$Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        }
        catch (final InvocationTargetException ex) {
            return new Handler(looper);
        }
        catch (final IllegalAccessException | InstantiationException | NoSuchMethodException ex2) {
            return new Handler(looper);
        }
    }
}
