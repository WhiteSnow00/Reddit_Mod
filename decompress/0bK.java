// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

public final class 0bK implements Callable<Void>
{
    public final /* synthetic */ 0bQ LIZ;
    
    static {
        Covode.recordClassIndex(5636);
    }
    
    public 0bK(final 0bQ liz) {
        this.LIZ = liz;
    }
    
    private Void LIZ() {
        MethodCollector.i(8572);
        final 0bQ liz = this.LIZ;
        monitorenter(liz);
        try {
            if (this.LIZ.LIZLLL == null) {
                return null;
            }
            this.LIZ.LIZJ();
            if (this.LIZ.LIZIZ()) {
                this.LIZ.LIZ();
                this.LIZ.LJ = 0;
            }
            return null;
        }
        finally {
            monitorexit(liz);
            MethodCollector.o(8572);
        }
    }
}
