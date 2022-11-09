// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.TextUtils;
import java.util.Map;
import com.bytedance.covode.number.Covode;

public final class 0uF
{
    public static final 0uF LIZ;
    public static String LIZIZ;
    public static final 5DO LIZJ;
    
    static {
        Covode.recordClassIndex(9462);
        LIZ = new 0uF();
        0uF.LIZIZ = "";
        LIZJ = 3Os.LIZ((QgG)25n.LIZ);
    }
    
    private final Map<Long, String> LIZIZ() {
        return (Map)0uF.LIZJ.getValue();
    }
    
    public final void LIZ() {
        this.LIZIZ().clear();
        0uF.LIZIZ = "";
    }
    
    public final void LIZ(final long n) {
        final String liziz = 0uF.LIZIZ;
        if ((TextUtils.isEmpty((CharSequence)liziz) ^ true) && liziz != null) {
            0uF.LIZ.LIZIZ().put(n, 0uF.LIZIZ);
        }
    }
    
    public final void LIZ(final String s) {
        String liziz = s;
        if (s == null) {
            liziz = "";
        }
        0uF.LIZIZ = liziz;
    }
    
    public final String LIZIZ(final long n) {
        String s;
        if ((s = this.LIZIZ().get(n)) == null) {
            s = "";
        }
        return s;
    }
    
    public final void LIZJ(final long n) {
        this.LIZIZ().remove(n);
    }
}
