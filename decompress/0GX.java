// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;

public final class 0gX
{
    public static final 0gX LIZ;
    public static String LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    
    static {
        Covode.recordClassIndex(6213);
        LIZ = new 0gX();
        0gX.LIZIZ = "";
        0gX.LIZJ = "";
        0gX.LIZLLL = "";
    }
    
    private final String LIZ() {
        if (0gX.LIZLLL.length() == 0) {
            return 0gX.LIZJ;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(0gX.LIZJ);
        sb.append("#{");
        sb.append(0gX.LIZLLL);
        sb.append('}');
        return sb.toString();
    }
    
    private final String LIZIZ() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (0gX.LIZIZ.length() > 0) {
            final StringBuilder sb2 = new StringBuilder("previous: ");
            sb2.append(0gX.LIZIZ);
            sb2.append(", ");
            sb.append(sb2.toString());
        }
        final String liz = this.LIZ();
        if (liz.length() > 0) {
            sb.append("current: ".concat(String.valueOf(liz)));
        }
        if (sb.length() == 1) {
            return "";
        }
        sb.append("] ");
        final String string = sb.toString();
        n.LIZIZ((Object)string, "");
        return string;
    }
    
    public final void LIZ(final String s) {
        CTM.LIZ((Object)s);
        final String liziz = this.LIZIZ();
        final StringBuilder sb = new StringBuilder();
        sb.append(liziz);
        sb.append(s);
        0ba.LIZ(4, "effect_log", sb.toString());
        0gX.LIZLLL = "";
    }
    
    public final 0gX LIZIZ(final String lizj) {
        CTM.LIZ((Object)lizj);
        if (n.LIZ((Object)lizj, (Object)0gX.LIZJ) ^ true) {
            0gX.LIZLLL = "";
            0gX.LIZIZ = 0gX.LIZJ;
            0gX.LIZJ = lizj;
        }
        return this;
    }
    
    public final 0gX LIZJ(final String lizlll) {
        CTM.LIZ((Object)lizlll);
        0gX.LIZLLL = lizlll;
        return this;
    }
}
