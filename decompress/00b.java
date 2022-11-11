// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public class 00b
{
    static {
        Covode.recordClassIndex(58);
    }
    
    public static Object LIZ(final 00f 00f) {
        Object o;
        if (00O.LIZ().LIZ(00f)) {
            if (!00f.LJIIIZ) {
                o = 00O.LIZ().LIZIZ(00f);
            }
            else {
                o = 00O.LIZ().LIZJ(00f);
            }
        }
        else {
            00s.LIZ(5);
            o = null;
        }
        final 00j liz = 00j.a.LIZ;
        00s.LIZ(3);
        liz.LIZIZ.lock();
        try {
            liz.LJ.remove(00f);
            liz.LIZJ.remove(00f.LIZ);
            return o;
        }
        finally {
            liz.LIZIZ.unlock();
        }
    }
}
