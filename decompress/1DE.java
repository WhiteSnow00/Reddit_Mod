// 
// Decompiled by Procyon v0.6.0
// 

package X;

import org.json.JSONObject;
import java.lang.reflect.Type;
import kotlin.jvm.internal.n;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.message.LiveMtPbRequestsSetting;
import com.bytedance.retrofit2.client.Request;
import java.util.concurrent.ConcurrentHashMap;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class 1de<R, T> implements 7Ah<R, T>
{
    public static final Map<String, c> LIZIZ;
    public static final 5DO LIZJ;
    public static final a LIZLLL;
    public final 0yd.a LIZ;
    public final 7Ah<R, T> LJ;
    public final String LJFF;
    
    static {
        Covode.recordClassIndex(10466);
        LIZLLL = new a((byte)0);
        LIZIZ = new ConcurrentHashMap<String, c>();
        LIZJ = 3Os.LIZ((QgG)29T.LIZ);
    }
    
    public 1de(final 7Ah<R, T> lj, final 0yd.a liz, final String ljff) {
        CTM.LIZ((Object)lj, (Object)liz, (Object)ljff);
        this.LJ = lj;
        this.LIZ = liz;
        this.LJFF = ljff;
    }
    
    public static final boolean LIZ(final Request request) {
        final a lizlll = 1de.LIZLLL;
        CTM.LIZ((Object)request);
        final String path = request.getPath();
        final boolean enable = LiveMtPbRequestsSetting.INSTANCE.getValue().isEnable();
        int n = 0;
        if (!enable) {
            final StringBuilder sb = new StringBuilder("disable pb for path(");
            sb.append(path);
            sb.append("), because of main switch is disabled.");
            0ba.LIZ(3, "ttlivesdk", sb.toString());
            return false;
        }
        final c c = 1de.LIZIZ.get(path);
        if (c == null) {
            return false;
        }
        if (!lizlll.LIZ().optBoolean(c.LIZIZ, false)) {
            final StringBuilder sb2 = new StringBuilder("disable pb for path(");
            sb2.append(path);
            sb2.append("), because of module switch is disabled.");
            0ba.LIZ(3, "ttlivesdk", sb2.toString());
            return false;
        }
        if (c.LIZJ.length() > 0) {
            if (c.LIZ == null) {
                c.LIZ = GlH.LIZ(c.LIZJ);
            }
            final Class<?> liz = c.LIZ;
            if (liz != null) {
                final int booleanValue;
                n = (booleanValue = (SettingsManager.INSTANCE.getBooleanValue((Class)liz) ? 1 : 0));
                if (n != 0) {
                    return booleanValue != 0;
                }
            }
            final StringBuilder sb3 = new StringBuilder("disable pb for path(");
            sb3.append(path);
            sb3.append("), because of ab setting for(");
            sb3.append(c.LIZJ);
            sb3.append(") is disabled.");
            0ba.LIZ(3, "ttlivesdk", sb3.toString());
            int booleanValue = n;
            return booleanValue != 0;
        }
        return true;
    }
    
    public final T LIZ(final 7CD<R> 7cd) {
        CTM.LIZ((Object)7cd);
        final Request request = 7cd.request();
        final a lizlll = 1de.LIZLLL;
        n.LIZIZ((Object)request, "");
        lizlll.LIZ(request, this.LIZ, this.LJFF);
        return (T)this.LJ.LIZ((7CD)7cd);
    }
    
    public final Type LIZ() {
        final Type liz = this.LJ.LIZ();
        n.LIZIZ((Object)liz, "");
        return liz;
    }
    
    public static final class a
    {
        static {
            Covode.recordClassIndex(10467);
        }
        
        public final JSONObject LIZ() {
            return (JSONObject)1de.LIZJ.getValue();
        }
        
        public final boolean LIZ(final Request request, final 0yd.a a, final String s) {
            CTM.LIZ((Object)request, (Object)a, (Object)s);
            if (!1de.LIZIZ.containsKey(request.getPath())) {
                final Map<String, c> liziz = 1de.LIZIZ;
                final String path = request.getPath();
                n.LIZIZ((Object)path, "");
                final String key = a.key;
                n.LIZIZ((Object)key, "");
                liziz.put(path, new c(key, s));
                return true;
            }
            return false;
        }
    }
    
    public static final class c
    {
        public Class<?> LIZ;
        public final String LIZIZ;
        public final String LIZJ;
        
        static {
            Covode.recordClassIndex(10469);
        }
        
        public c(final String liziz, final String lizj) {
            CTM.LIZ((Object)liziz, (Object)lizj);
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
        }
    }
}
