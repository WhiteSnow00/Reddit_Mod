// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;

public class 0yr
{
    public static volatile 0yr LIZ;
    
    static {
        Covode.recordClassIndex(10442);
    }
    
    public static 0yr LIZ() {
        MethodCollector.i(7838);
        if (0yr.LIZ == null) {
            monitorenter(0yr.class);
            try {
                if (0yr.LIZ == null) {
                    0yr.LIZ = new 0yr();
                }
                monitorexit(0yr.class);
            }
            finally {
                monitorexit(0yr.class);
                MethodCollector.o(7838);
            }
        }
        final 0yr liz = 0yr.LIZ;
        MethodCollector.o(7838);
        return liz;
    }
    
    public final <T> T LIZ(final Class<T> clazz) {
        return (T)0jR.LIZ(INetworkService.class).getService((Class)clazz);
    }
    
    public final void LIZ(final 0yq 0yq) {
        0jR.LIZ(INetworkService.class).addLiveClientInterceptor(0yq);
    }
    
    public final <T> T LIZIZ(final Class<T> clazz) {
        return (T)0jR.LIZ(INetworkService.class).getForceServiceV2((Class)clazz);
    }
    
    public final void LIZIZ(final 0yq 0yq) {
        0jR.LIZ(INetworkService.class).removeLiveClientInterceptor(0yq);
    }
}
