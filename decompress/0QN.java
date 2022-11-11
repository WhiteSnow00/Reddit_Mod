// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.base.model.user.User;
import java.util.Iterator;
import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.Vector;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class 0qn
{
    public 1Tr LIZ;
    public a LIZIZ;
    public List<0qc.a> LIZJ;
    public final 1Tr.a LIZLLL;
    
    static {
        Covode.recordClassIndex(8476);
    }
    
    public 0qn(final Room room, final 1Tr liz, final a liziz) {
        this.LIZLLL = new 1Ty(this);
        this.LIZJ = new Vector<0qc.a>();
        this.LIZIZ = liziz;
        this.LIZ = liz;
    }
    
    private 0qc.a LIZ(final String s, final LinkPlayerInfo linkPlayerInfo) {
        final 1lh 1lh = new 1lh(0L, s, linkPlayerInfo);
        final Iterator<0qc.a> iterator = this.LIZJ.iterator();
        final 1Tr 1Tr = (1Tr)1jw.LIZ.LIZ("LINK_USER_INFO_CENTER");
        if (1Tr != null) {
            while (iterator.hasNext()) {
                final 0qc.a a = iterator.next();
                1Tr.LIZIZ(a.LIZLLL());
                if (!TextUtils.isEmpty((CharSequence)s)) {
                    s.equals(a.LIZLLL());
                }
            }
        }
        this.LIZJ.add(1lh);
        return 1lh;
    }
    
    private 0qc.a LIZIZ(final String s) {
        for (final 0qc.a a : this.LIZJ) {
            if (TextUtils.equals((CharSequence)a.LIZLLL(), (CharSequence)s)) {
                return a;
            }
        }
        return null;
    }
    
    public final 0qc.a LIZ(final String ljiiiz) {
        final 1Tr liz = this.LIZ;
        final Long value = 0L;
        LinkPlayerInfo liz2;
        final LinkPlayerInfo linkPlayerInfo = liz2 = liz.LIZ(ljiiiz, value);
        if (linkPlayerInfo == null) {
            final StringBuilder sb = new StringBuilder("mInfoCenter.getTargetPlayer(userId=0,interactId=");
            sb.append(ljiiiz);
            sb.append(") return null");
            0sN.LIZ("NormalGuestPresenterStore", sb.toString());
            final long lizj = 5ob.LIZ.LIZJ(ljiiiz);
            long longValue = 0L;
            Label_0158: {
                if (lizj != 0L) {
                    longValue = lizj;
                    if (lizj != -1L) {
                        break Label_0158;
                    }
                }
                longValue = lizj;
                if (0sD.LIZJ.LIZ().LIZLLL()) {
                    final 1Tr liz3 = this.LIZ;
                    Vwg vwg = null;
                    Label_0137: {
                        if (liz3 == null || !GTi.LIZJ(liz3.LJIIJ)) {
                            final 1Tr liz4 = this.LIZ;
                            if (liz4 == null || !liz4.LIZJ(Fk2.LIZ().LIZIZ().LIZJ())) {
                                vwg = 0jz.LIZJ().userManager().LIZLLL(ljiiiz);
                                break Label_0137;
                            }
                        }
                        vwg = 0jz.LIZJ().userManager().LIZJ(ljiiiz);
                    }
                    Long liziz;
                    if (vwg != null) {
                        liziz = vwg.LIZIZ;
                    }
                    else {
                        liziz = value;
                    }
                    if (liziz == null) {
                        liziz = value;
                    }
                    longValue = liziz;
                }
            }
            if (longValue == Fk2.LIZ().LIZIZ().LIZJ()) {
                liz2 = new LinkPlayerInfo();
                liz2.LIZJ = User.from(Fk2.LIZ().LIZIZ().LIZ());
                liz2.LJIIIZ = ljiiiz;
            }
            else {
                0sN.LIZ("NormalGuestPresenterStore", "current user not self,so info==null for uid=".concat(String.valueOf(longValue)));
                liz2 = linkPlayerInfo;
            }
        }
        0qc.a a;
        if ((a = this.LIZIZ(ljiiiz)) == null) {
            a = this.LIZ(ljiiiz, liz2);
        }
        a.LIZ(liz2);
        return a;
    }
    
    public final void LIZ() {
        this.LIZ.LIZ(this.LIZLLL);
    }
    
    public final void LIZIZ() {
        this.LIZ.LIZIZ(this.LIZLLL);
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(8478);
        }
        
        void LIZ();
    }
}
