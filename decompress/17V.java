// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.os.Looper;
import android.os.Handler;
import com.bytedance.covode.number.Covode;

public final class 17v implements 0HW
{
    static {
        Covode.recordClassIndex(1846);
    }
    
    @Override
    public final 0HW.a LIZ() {
        return new a();
    }
    
    public static final class a implements 0HW.a
    {
        public volatile Handler LIZ;
        public final Object LIZIZ;
        
        static {
            Covode.recordClassIndex(1847);
        }
        
        public a() {
            this.LIZ = new Handler(Looper.getMainLooper());
            this.LIZIZ = new Object();
        }
        
        @Override
        public final void LIZ() {
            MethodCollector.i(4562);
            if (this.LIZ != null) {
                final Object liziz = this.LIZIZ;
                monitorenter(liziz);
                try {
                    final Handler liz = this.LIZ;
                    if (liz != null) {
                        liz.removeCallbacksAndMessages((Object)null);
                    }
                    return;
                }
                finally {
                    monitorexit(liziz);
                    MethodCollector.o(4562);
                }
            }
            MethodCollector.o(4562);
        }
        
        @Override
        public final void LIZ(final QgG<2P9> qgG) {
            MethodCollector.i(4552);
            CTM.LIZ((Object)qgG);
            if (this.LIZ != null) {
                final Object liziz = this.LIZIZ;
                monitorenter(liziz);
                try {
                    final Handler liz = this.LIZ;
                    if (liz != null) {
                        liz.postDelayed((Runnable)new 0HU(qgG), 0L);
                    }
                    return;
                }
                finally {
                    monitorexit(liziz);
                    MethodCollector.o(4552);
                }
            }
            MethodCollector.o(4552);
        }
    }
}
