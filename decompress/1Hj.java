// 
// Decompiled by Procyon v0.6.0
// 

package X;

import org.json.JSONObject;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;

public class 1hj extends 1Dm
{
    public static volatile 1hj LIZ;
    
    static {
        Covode.recordClassIndex(4441);
    }
    
    public static 1hj LIZ() {
        MethodCollector.i(6584);
        if (1hj.LIZ == null) {
            monitorenter(1hj.class);
            try {
                if (1hj.LIZ == null) {
                    1hj.LIZ = new 1hj();
                }
                monitorexit(1hj.class);
            }
            finally {
                monitorexit(1hj.class);
                MethodCollector.o(6584);
            }
        }
        final 1hj liz = 1hj.LIZ;
        MethodCollector.o(6584);
        return liz;
    }
    
    private JSONObject LIZ(final String s) {
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("sp", (Object)s);
            return jsonObject;
        }
        finally {
            return jsonObject;
        }
    }
    
    public final void LIZ(final long n) {
        this.LIZ("host_dispatch_track_wait", n, null);
    }
    
    public final void LIZ(final String s, final long n) {
        this.LIZ("host_sp_cost_init", n, this.LIZ(s));
    }
    
    public final void LIZIZ(final String s, final long n) {
        this.LIZ("host_sp_cost_edit", n, this.LIZ(s));
    }
}
