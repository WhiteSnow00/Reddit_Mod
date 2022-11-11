// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 0lO
{
    static {
        Covode.recordClassIndex(7361);
    }
    
    public final 1Ou LIZ(final String s) {
        CTM.LIZ((Object)s);
        try {
            return (1Ou)0b8.a.LIZIZ.LIZ(s, (Class)1Ou.class);
        }
        catch (final Exception ex) {
            0ba.LIZ("RtcMessageReader", ex);
            return null;
        }
    }
    
    public final <T> T LIZ(final String s, final Class<T> clazz) {
        CTM.LIZ((Object)s, (Object)clazz);
        try {
            return (T)0b8.a.LIZIZ.LIZ(s, (Class)clazz);
        }
        catch (final Exception ex) {
            0ba.LIZ("RtcMessageReader", ex);
            return null;
        }
    }
}
