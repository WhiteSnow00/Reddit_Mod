// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class 0QK
{
    public static SRS<? super Map<Class<?>, ? extends Map<0QJ, Long>>, 2P9> LIZ;
    public static final 0QK LIZIZ;
    public static SRU<? super 1DY<?>, ? super 0QJ, ? super Long, 2P9> LIZJ;
    
    static {
        Covode.recordClassIndex(4283);
        LIZIZ = new 0QK();
    }
    
    public final void LIZ(final 1DY<?> 1dy, final 0QJ 0qj, final long n) {
        CTM.LIZ((Object)1dy, (Object)0qj);
        final SRU<? super 1DY<?>, ? super 0QJ, ? super Long, 2P9> lizj = 0QK.LIZJ;
        if (lizj != null) {
            lizj.invoke((Object)1dy, (Object)0qj, (Object)n);
        }
    }
}
