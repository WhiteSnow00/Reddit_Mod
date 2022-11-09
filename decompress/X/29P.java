// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Map;
import com.bytedance.covode.number.Covode;

public final class 29P extends F5g implements QgG<2P9>
{
    public static final 29P LIZ;
    
    static {
        Covode.recordClassIndex(10365);
        LIZ = new 29P();
    }
    
    public 29P() {
        super(0);
    }
    
    public final void LIZ() {
        0y7.LIZ = 0y7.c.ANCHOR;
        0y7.LIZIZ = 0y7.b.ANCHOR_LINKMIC;
        final boolean ljiizilj = 1NN.LLFF.LIZ().LJIIZILJ;
        final Object o = null;
        final Long n = null;
        if (ljiizilj) {
            0y7.LIZJ = 0y7.a.INVITER;
            final Map<String, String> lizlll = 0y7.LIZLLL;
            final GIK liziz = Fk2.LIZ().LIZIZ();
            Long value;
            if (liziz != null) {
                value = liziz.LIZJ();
            }
            else {
                value = null;
            }
            lizlll.put("inviter_id", String.valueOf(value));
            final Map<String, String> lj = 0y7.LJ;
            final 1NN liz = 1NN.LLFF.LIZ();
            Long value2 = n;
            if (liz != null) {
                value2 = liz.LJFF;
            }
            lj.put("invitee_id", String.valueOf((long)value2));
            return;
        }
        0y7.LIZJ = 0y7.a.INVITEE;
        final Map<String, String> lizlll2 = 0y7.LIZLLL;
        final 1NN liz2 = 1NN.LLFF.LIZ();
        Long value3;
        if (liz2 != null) {
            value3 = liz2.LJFF;
        }
        else {
            value3 = null;
        }
        lizlll2.put("inviter_id", String.valueOf((long)value3));
        final Map<String, String> lj2 = 0y7.LJ;
        final GIK liziz2 = Fk2.LIZ().LIZIZ();
        Object value4 = o;
        if (liziz2 != null) {
            value4 = liziz2.LIZJ();
        }
        lj2.put("invitee_id", String.valueOf(value4));
    }
}
