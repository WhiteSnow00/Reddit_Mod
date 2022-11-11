// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.liveinteract.multiguestv3.internal.IMultiGuestV3InternalService;
import com.bytedance.android.live.base.model.user.FollowInfo;
import kotlin.jvm.internal.n;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;

public final class 0py
{
    static {
        Covode.recordClassIndex(8283);
    }
    
    public static final long LIZ() {
        final Fk2 liz = Fk2.LIZ();
        if (liz != null) {
            final GIK liziz = liz.LIZIZ();
            if (liziz != null) {
                return liziz.LIZJ();
            }
        }
        return 0L;
    }
    
    public static final 0pe LIZ(final User user) {
        CTM.LIZ((Object)user);
        final String displayId = user.getDisplayId();
        String s = "";
        String s2 = displayId;
        if (displayId == null) {
            s2 = "";
        }
        final String nickName = user.getNickName();
        if (nickName != null) {
            s = nickName;
        }
        return new 0pe(s2, s, user.getAvatarThumb());
    }
    
    public static final boolean LIZ(final DataChannel dataChannel) {
        if (dataChannel != null) {
            final Boolean b = (Boolean)dataChannel.LIZIZ((Class)2FH.class);
            if (b != null) {
                return b;
            }
        }
        return false;
    }
    
    public static final 0pL LIZIZ() {
        final DataChannel ll = 1NN.LLFF.LIZ().LL;
        0pL none;
        if (ll == null || (none = (0pL)ll.LIZIZ((Class)2FG.class)) == null) {
            none = 0pL.NONE;
        }
        return none;
    }
    
    public static final boolean LIZIZ(final User user) {
        CTM.LIZ((Object)user);
        final FollowInfo followInfo = user.getFollowInfo();
        n.LIZIZ((Object)followInfo, "");
        return followInfo.getFollowStatus() == 2L;
    }
    
    public static final boolean LIZJ() {
        final 0xL 0xL = 1jw.LIZ.LIZIZ("LINKER_MANAGER");
        boolean b = true;
        if (0xL != null) {
            final 0xJ liziz = 0xL.LIZIZ(0xG.a.MULTIGUEST);
            if (liziz != null && liziz instanceof 1TT) {
                final boolean b2 = ((1TT)liziz).LIZLLL() ^ true;
                0ba.LIZ(4, "MultiCoHostService", "canPreJoinChannel = ".concat(String.valueOf(b2)));
                return b2;
            }
        }
        if (!0sD.LIZJ.LIZ().LIZLLL() || !0jR.LIZ(IMultiGuestV3InternalService.class).isRtcEngineOn()) {
            b = false;
        }
        final boolean b3 = b ^ true;
        final StringBuilder sb = new StringBuilder("canPreJoinChannel = ");
        sb.append(b3);
        sb.append(", isOneVnRtcTurnOn = ");
        sb.append(b);
        0ba.LIZ(4, "MultiCoHostService", sb.toString());
        final StringBuilder sb2 = new StringBuilder("isInOneVnMode = ");
        sb2.append(0sD.LIZJ.LIZ().LIZLLL());
        sb2.append(", isRtcEngineOn = ");
        sb2.append(0jR.LIZ(IMultiGuestV3InternalService.class).isRtcEngineOn());
        0ba.LIZ(4, "MultiCoHostService", sb2.toString());
        return b3;
    }
}
