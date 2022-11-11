// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Map;
import android.content.Context;
import java.util.List;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;

public class 0ys
{
    public static volatile 0ys LIZ;
    
    static {
        Covode.recordClassIndex(10452);
    }
    
    public static 0ys LIZ() {
        MethodCollector.i(7720);
        if (0ys.LIZ == null) {
            monitorenter(0ys.class);
            try {
                if (0ys.LIZ == null) {
                    0ys.LIZ = new 0ys();
                }
                monitorexit(0ys.class);
            }
            finally {
                monitorexit(0ys.class);
                MethodCollector.o(7720);
            }
        }
        final 0ys liz = 0ys.LIZ;
        MethodCollector.o(7720);
        return liz;
    }
    
    public final <T> 0TU<T> LIZ(final Class<T> clazz) {
        return 0jR.LIZ(INetworkService.class).getProtoDecoder((Class)clazz);
    }
    
    public final H0J<7F6> LIZ(final int n, final String s, final List<0Vs> list, final String s2, final byte[] array, final long n2, final String s3) {
        return (H0J<7F6>)0jR.LIZ(INetworkService.class).uploadFile(n, s, (List)list, s2, array, n2, s3);
    }
    
    public final H0J<7F6> LIZ(final String s, final List<0Vs> list) {
        return (H0J<7F6>)0jR.LIZ(INetworkService.class).get(s, (List)list);
    }
    
    public final H0J<7F6> LIZ(final String s, final List<0Vs> list, final String s2, final byte[] array) {
        return (H0J<7F6>)0jR.LIZ(INetworkService.class).post(s, (List)list, s2, array);
    }
    
    public final WKW LIZ(final Context context, final String s, final Map<String, String> map, final Kfx kfx) {
        return 0jR.LIZ(INetworkService.class).registerWsChannel(context, s, (Map)map, kfx);
    }
    
    public final H0J<7F6> LIZIZ(final String s, final List<0Vs> list) {
        return (H0J<7F6>)0jR.LIZ(INetworkService.class).downloadFile(false, Integer.MAX_VALUE, s, (List)list, (Object)null);
    }
    
    public final Map<String, String> LIZIZ() {
        return 0jR.LIZ(INetworkService.class).getCommonParams();
    }
    
    public final String LIZJ() {
        return 0jR.LIZ(INetworkService.class).getHostDomain();
    }
}
