// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.concurrent.TimeUnit;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ScheduledExecutorService;
import com.bytedance.covode.number.Covode;

public final class 17t implements 0HW
{
    public final 0HT LIZ;
    
    static {
        Covode.recordClassIndex(1841);
    }
    
    public 17t(final 0HT liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
    }
    
    @Override
    public final 0HW.a LIZ() {
        return new a(this.LIZ);
    }
    
    public static final class a implements 0HW.a
    {
        public volatile ScheduledExecutorService LIZ;
        public final Object LIZIZ;
        public final 0HT LIZJ;
        
        static {
            Covode.recordClassIndex(1842);
        }
        
        public a(final 0HT lizj) {
            CTM.LIZ((Object)lizj);
            this.LIZJ = lizj;
            this.LIZ = lizj.LIZ();
            this.LIZIZ = new Object();
        }
        
        @Override
        public final void LIZ() {
            final ScheduledExecutorService liz = this.LIZ;
            if (liz != null) {
                liz.shutdown();
            }
        }
        
        @Override
        public final void LIZ(final QgG<2P9> qgG) {
            MethodCollector.i(2442);
            CTM.LIZ((Object)qgG);
            if (this.LIZ != null) {
                final Object liziz = this.LIZIZ;
                monitorenter(liziz);
                try {
                    final ScheduledExecutorService liz = this.LIZ;
                    if (liz != null) {
                        liz.schedule(new 0HR(qgG), 0L, TimeUnit.MILLISECONDS);
                    }
                    return;
                }
                finally {
                    monitorexit(liziz);
                    MethodCollector.o(2442);
                }
            }
            MethodCollector.o(2442);
        }
        
        public static final class a
        {
            static {
                Covode.recordClassIndex(1843);
            }
        }
    }
}
