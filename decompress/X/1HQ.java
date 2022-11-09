// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Map;
import android.net.Uri;
import java.util.List;
import org.json.JSONObject;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;

public class 1hq extends 1Dm
{
    public static volatile 1hq LIZ;
    
    static {
        Covode.recordClassIndex(4542);
    }
    
    public static 1hq LIZ() {
        MethodCollector.i(14036);
        if (1hq.LIZ == null) {
            monitorenter(1hq.class);
            try {
                if (1hq.LIZ == null) {
                    1hq.LIZ = new 1hq();
                }
                monitorexit(1hq.class);
            }
            finally {
                monitorexit(1hq.class);
                MethodCollector.o(14036);
            }
        }
        final 1hq liz = 1hq.LIZ;
        MethodCollector.o(14036);
        return liz;
    }
    
    public final void LIZ(final 0Sq 0Sq, long n) {
        if (0Sq == null) {
            return;
        }
        final int liz = 0Sq.LIZ;
        final JSONObject liziz = this.LIZIZ(n);
        final JSONObject jsonObject = new JSONObject();
        n = -1L;
        final 0Sp lj = 0Sq.LJ;
        Object ljii = null;
        Label_0100: {
            if (lj != null) {
                final 1Dk lj2 = lj.LJ;
                if (lj2 != null) {
                    if (lj2.LIZLLL) {
                        n = lj2.LIZJ;
                    }
                    else {
                        n = lj2.LJ;
                    }
                    ljii = lj2.LJII;
                    final String lji = lj2.LJI;
                    break Label_0100;
                }
            }
            final String lji = null;
            while (true) {
                try {
                    jsonObject.put("cid", n);
                    jsonObject.putOpt("ad_extra_data", ljii);
                    jsonObject.putOpt("log_extra", (Object)lji);
                    0Ru.LIZ(0Sq.LJFF, jsonObject);
                    if (lj != null) {
                        jsonObject.put("method", (Object)lj.LIZJ);
                    }
                    if (!0Sq.LIZ()) {
                        if (lj != null) {
                            jsonObject.put("url", (Object)lj.LIZIZ);
                        }
                        if (liz == 302) {
                            final Map<String, List<String>> lizj = 0Sq.LIZJ;
                            if (lizj != null && lizj.containsKey("Location")) {
                                final List list = lizj.get("Location");
                                if (list != null && !list.isEmpty()) {
                                    jsonObject.putOpt("url_302", list.get(0));
                                }
                            }
                        }
                    }
                    if (lj != null) {
                        jsonObject.put("host", (Object)Uri.parse(lj.LIZIZ).getHost());
                    }
                    this.LIZ("c2s_network_response_status", liz, liziz, jsonObject);
                }
                finally {
                    continue;
                }
                break;
            }
        }
    }
    
    public final void LIZIZ() {
        this.LIZ("c2s_network_type_on_retry", 0Rx.LIZ.LIZIZ(), null);
    }
}
