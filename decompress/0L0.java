// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.HandlerThread;
import kotlin.jvm.internal.n;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import android.os.Handler;
import java.util.concurrent.ConcurrentHashMap;

public final class 0L0
{
    public static final 0L0 LIZ;
    public static final ConcurrentHashMap<Integer, Handler> LIZIZ;
    public static long LIZJ;
    public static final ArrayList<Handler> LIZLLL;
    
    static {
        Covode.recordClassIndex(2417);
        LIZ = new 0L0();
        LIZIZ = new ConcurrentHashMap<Integer, Handler>();
        LIZLLL = new ArrayList<Handler>();
    }
    
    public final Handler LIZ(final 0LK 0lk) {
        MethodCollector.i(8094);
        CTM.LIZ((Object)0lk);
        final ConcurrentHashMap<Integer, Handler> liziz = 0L0.LIZIZ;
        monitorenter(liziz);
        try {
            final int hashCode = 0lk.hashCode();
            if (!liziz.containsKey(hashCode)) {
                final int max = Math.max(0KM.e.LIZIZ, 1);
                final long lizj = 0L0.LIZJ;
                0L0.LIZJ = 1L + lizj;
                final int n = (int)(lizj % max);
                final ArrayList<Handler> lizlll = 0L0.LIZLLL;
                Handler handler;
                if (lizlll.size() > n) {
                    final Handler value = lizlll.get(n);
                    kotlin.jvm.internal.n.LIZ((Object)value, "");
                    liziz.put((Object)hashCode, (Object)value);
                    final Object value2 = liziz.get(hashCode);
                    if (value2 == null) {
                        kotlin.jvm.internal.n.LIZ();
                    }
                    kotlin.jvm.internal.n.LIZ(value2, "");
                    handler = (Handler)value2;
                }
                else {
                    System.currentTimeMillis();
                    final HandlerThread handlerThread = new HandlerThread("LottieWorkThread-".concat(String.valueOf(n)));
                    handlerThread.start();
                    handler = new Handler(handlerThread.getLooper());
                    lizlll.add(handler);
                    liziz.put((Object)hashCode, (Object)handler);
                }
                return handler;
            }
            final Object value3 = liziz.get(hashCode);
            if (value3 == null) {
                n.LIZ();
            }
            return (Handler)value3;
        }
        finally {
            monitorexit(liziz);
            MethodCollector.o(8094);
        }
    }
}
