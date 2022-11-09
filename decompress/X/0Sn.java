// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.text.SimpleDateFormat;
import com.bytedance.covode.number.Covode;

public final class 0sN
{
    static {
        Covode.recordClassIndex(8854);
        H30.LIZ((QgG)21p.LIZ);
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
    
    public static final void LIZ(final String s) {
        CTM.LIZ((Object)s);
        0sH.LIZ.LIZ();
    }
    
    public static final void LIZ(final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        if (!0sH.LIZ.LIZ()) {
            return;
        }
        LIZ(s2);
    }
    
    public static final void LIZ(final String s, final String s2, final Throwable t) {
        CTM.LIZ((Object)s, (Object)s2, (Object)t);
        if (!0sH.LIZ.LIZ()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(s2);
        sb.append(t.getMessage());
        LIZ(sb.toString());
    }
    
    public static final void LIZIZ(final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        if (!0sH.LIZ.LIZ()) {
            return;
        }
        LIZ(s2);
    }
    
    public static final void LIZJ(final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        if (!0sH.LIZ.LIZ()) {
            return;
        }
        LIZ(s2);
    }
}
