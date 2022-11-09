// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.benchmark.collection_api.BXCollectionAPI;
import com.bytedance.covode.number.Covode;

public final class 0N4
{
    public static volatile 0N4 LIZ;
    public volatile 1CO LIZIZ;
    
    static {
        Covode.recordClassIndex(2929);
        0N4.LIZ = new 0N4();
    }
    
    public 0N4() {
        this.LIZIZ = new 1CO();
    }
    
    public final BXCollectionAPI LIZ() {
        synchronized (this) {
            MethodCollector.i(10457);
            final 1CO liziz = this.LIZIZ;
            MethodCollector.o(10457);
            return liziz;
        }
    }
}
