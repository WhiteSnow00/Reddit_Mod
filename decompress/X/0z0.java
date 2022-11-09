// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.ss.android.ugc.aweme.net.interceptor.BeforeHandleRequestInterceptor;
import com.ss.android.ugc.aweme.net.monitor.TTNetMonitorInterceptor;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;

public final class 0z0
{
    static {
        Covode.recordClassIndex(10474);
    }
    
    public static 7A7 LIZ(final 72J 72J) {
        if (70W.LIZIZ.LIZ().LIZ) {
            try {
                final 6z5 6z5 = (6z5)Reflect.on((Object)72J).field("clientProvider", new Class[0]).get();
                final 6yp value = 6z5.get();
                if ("com.ss.android.ugc.aweme.app.api.OkClient".equals(6z5.getClass().getName()) || value instanceof 6y5 || value instanceof 6yj) {
                    return 72J.LIZ();
                }
            }
            finally {
                final Throwable t;
                70J.LIZ(t, "error occured.");
            }
        }
        final 7A7 liz = 72J.LIZ();
        if (liz.LJI != null) {
            liz.LJI.add(new TTNetMonitorInterceptor());
            liz.LJI.set(0, new BeforeHandleRequestInterceptor((5ky)liz.LJI.get(0)));
        }
        return liz;
    }
    
    public static 7A7 LIZ(final boolean b) {
        return 0jR.LIZ(IHostNetwork.class).getLiveRetrofit(b);
    }
}
