// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import org.json.JSONObject;
import java.util.Map;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;

public final class 0d6 implements Runnable
{
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ String LIZJ;
    
    static {
        Covode.recordClassIndex(5790);
    }
    
    public 0d6(final boolean liz, final boolean liziz, final String lizj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    @Override
    public final void run() {
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_init_time_all");
        final HashMap hashMap = new HashMap((Map<? extends K, ? extends V>)0d7.LIZ);
        0d7.LIZ.clear();
        final HashMap hashMap2 = new HashMap((Map<? extends K, ? extends V>)0d7.LIZIZ);
        0d7.LIZIZ.clear();
        final JSONObject jsonObject = new JSONObject();
        for (final String s : 0d7.LIZJ) {
            final String liz2 = 0d7.LIZ(s, true);
            final String liz3 = 0d7.LIZ(s, false);
            final long liz4 = 0d7.LIZ(hashMap, liz2);
            final long liz5 = 0d7.LIZ(hashMap, liz3);
            final long liz6 = 0d7.LIZ(hashMap2, liz2);
            final long liz7 = 0d7.LIZ(hashMap2, liz3);
            if (liz4 > 0L && liz5 > 0L) {
                final long n = liz5 - liz4;
                0d7.LIZ(jsonObject, s, n);
                liz.LIZ(s, n);
            }
            if (liz6 > 0L && liz7 > 0L) {
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append("_no_sleep");
                final String string = sb.toString();
                final long n2 = liz7 - liz6;
                0d7.LIZ(jsonObject, string, n2);
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(s);
                sb2.append("_no_sleep");
                liz.LIZ(sb2.toString(), n2);
            }
        }
        0d7.LIZ(jsonObject, "device_score", TTliveAnchorDeviceScoreSetting.INSTANCE.getValue());
        0d7.LIZ(jsonObject, "is_main_thread", this.LIZ);
        0d7.LIZ(jsonObject, "is_opt", true);
        0d7.LIZ(jsonObject, "is_preload", this.LIZIZ);
        if (!this.LIZIZ) {
            0d7.LIZ(jsonObject, "load_stack", this.LIZJ);
        }
        0d8.LIZIZ("ttlive_live_init_time_all", 0, jsonObject);
        liz.LIZ("device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
        liz.LIZ("is_main_thread", Boolean.valueOf(this.LIZ));
        liz.LIZ("is_opt", Boolean.valueOf(true));
        liz.LIZ("is_preload", Boolean.valueOf(this.LIZIZ));
        if (!this.LIZIZ) {
            liz.LIZ("load_stack", this.LIZJ);
        }
        liz.LIZLLL();
    }
}
