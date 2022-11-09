// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;

public final class 0aq
{
    static {
        Covode.recordClassIndex(5569);
    }
    
    public static final <T> T LIZ(final Class<T> clazz, final String s) {
        CTM.LIZ((Object)clazz, (Object)s);
        Object liz;
        try {
            liz = 0b8.a.LIZIZ.LIZ(s, (Class)clazz);
        }
        catch (final Exception ex) {
            final StringBuilder sb = new StringBuilder("fromJson(). jsonString=");
            sb.append(s);
            sb.append(", e=");
            sb.append(ex.getMessage());
            0ba.LIZ(6, "SpeedManager_Base", sb.toString());
            liz = null;
        }
        return (T)liz;
    }
    
    public static final String LIZ(final Object o) {
        CTM.LIZ(o);
        final String liziz = 0b8.a.LIZIZ.LIZIZ(o);
        n.LIZIZ((Object)liziz, "");
        return liziz;
    }
}
