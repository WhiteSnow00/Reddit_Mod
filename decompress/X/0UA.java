// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.n;
import java.util.ArrayList;
import java.util.List;
import com.bytedance.covode.number.Covode;

public final class 0ua
{
    @0kW(LIZ = "MULTI_GUEST_DATA_HOLDER")
    public 1Uo LIZ;
    @0kW(LIZ = "LINK_USER_INFO_CENTER")
    public 1Tr LIZIZ;
    public final 0qt.a LIZJ;
    
    static {
        Covode.recordClassIndex(9510);
    }
    
    public 0ua(final 0qt.a lizj) {
        this.LIZJ = lizj;
        1jw.LIZ.LIZ(this);
    }
    
    private final int LIZIZ(final String s) {
        final 0qt.a lizj = this.LIZJ;
        if (lizj != null) {
            return lizj.LJI(s);
        }
        return -1;
    }
    
    private final List<1aK> LIZLLL() {
        final ArrayList list = new ArrayList();
        final 5oa liz = 5ob.LIZ;
        n.LIZIZ((Object)liz, "");
        for (final String s : liz.LIZIZ) {
            n.LIZIZ((Object)s, "");
            final int lizlll = 5ob.LIZ.LIZLLL(s);
            final 1Uo liz2 = this.LIZ;
            if (liz2 == null) {
                n.LIZ("");
            }
            final Boolean lizj = liz2.LIZJ(s);
            list.add(new 1aK(s, lizlll, lizj != null && lizj));
        }
        return list;
    }
    
    public final 1aI LIZ() {
        final 1aI 1aI = new 1aI();
        1aI.LIZ();
        1aI.LIZ("onPositionUpdate");
        final 1aJ liziz = new 1aJ();
        liziz.LIZ(this.LIZJ());
        liziz.LIZIZ.addAll(this.LIZLLL());
        1aI.LIZIZ = liziz;
        return 1aI;
    }
    
    public final 1aI LIZ(final String s) {
        CTM.LIZ((Object)s);
        final 1aI 1aI = new 1aI();
        1aI.LIZ();
        1aI.LIZ("onSyncVideoMuteStatus");
        final 1aJ liziz = new 1aJ();
        final List<1aK> liziz2 = this.LIZIZ();
        final ArrayList list = new ArrayList();
        for (final 1aK next : liziz2) {
            if (!n.LIZ((Object)next.LIZ, (Object)s)) {
                list.add(next);
            }
        }
        liziz.LIZIZ.addAll(list);
        1aI.LIZIZ = liziz;
        return 1aI;
    }
    
    public final List<1aK> LIZIZ() {
        final ArrayList list = new ArrayList();
        final 1Tr liziz = this.LIZIZ;
        if (liziz == null) {
            n.LIZ("");
        }
        for (final LinkPlayerInfo linkPlayerInfo : QgD.LIZLLL((Object)liziz.LJIIIIZZ())) {
            final String ljiiiz = linkPlayerInfo.LJIIIZ;
            n.LIZIZ((Object)ljiiiz, "");
            final String ljiiiz2 = linkPlayerInfo.LJIIIZ;
            n.LIZIZ((Object)ljiiiz2, "");
            final int liziz2 = this.LIZIZ(ljiiiz2);
            final 1Uo liz = this.LIZ;
            if (liz == null) {
                n.LIZ("");
            }
            final Boolean lizj = liz.LIZJ(linkPlayerInfo.LJIIIZ);
            list.add(new 1aK(ljiiiz, liziz2, lizj != null && lizj));
        }
        return list;
    }
    
    public final String LIZJ() {
        final 1Uo liz = this.LIZ;
        if (liz == null) {
            n.LIZ("");
        }
        final int n = 0ub.LIZ[liz.LJIILL.ordinal()];
        if (n == 1) {
            return "float_fix";
        }
        if (n == 2) {
            return "float";
        }
        if (n == 3) {
            return "grid_fix";
        }
        if (n != 4) {
            return "normal";
        }
        return "grid";
    }
}
