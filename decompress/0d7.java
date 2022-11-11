// 
// Decompiled by Procyon v0.6.0
// 

package X;

import org.json.JSONObject;
import android.os.SystemClock;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;

public final class 0d7
{
    public static final Map<String, Long> LIZ;
    public static final Map<String, Long> LIZIZ;
    public static final List<String> LIZJ;
    
    static {
        Covode.recordClassIndex(5789);
        LIZ = new ConcurrentHashMap<String, Long>();
        LIZIZ = new ConcurrentHashMap<String, Long>();
        LIZJ = new CopyOnWriteArrayList<String>();
    }
    
    public static long LIZ(final Map<String, Long> map, final String s) {
        final Long n = map.get(s);
        if (n == null) {
            return 0L;
        }
        return n;
    }
    
    public static String LIZ(final String s, final boolean b) {
        if (b) {
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append("_start");
            return sb.toString();
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(s);
        sb2.append("_end");
        return sb2.toString();
    }
    
    public static void LIZ(final String s) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final long uptimeMillis = SystemClock.uptimeMillis();
        final String liz = LIZ(s, true);
        LIZ(liz, elapsedRealtime);
        LIZIZ(liz, uptimeMillis);
        0d7.LIZJ.add(s);
    }
    
    public static void LIZ(final String s, final long n) {
        0d7.LIZ.put(s, n);
    }
    
    public static void LIZ(final JSONObject jsonObject, final String s, final Object o) {
        try {
            jsonObject.put(s, o);
        }
        catch (final Exception ex) {}
    }
    
    public static void LIZIZ(String liz) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final long uptimeMillis = SystemClock.uptimeMillis();
        liz = LIZ(liz, false);
        LIZ(liz, elapsedRealtime);
        LIZIZ(liz, uptimeMillis);
    }
    
    public static void LIZIZ(final String s, final long n) {
        0d7.LIZIZ.put(s, n);
    }
}
