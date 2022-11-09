// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import java.util.Map;
import com.bytedance.android.live.liveinteract.multilive.api.MultiLiveApi;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

@0kX(LIZ = "DATA_MULTI_LIVE_INVITEE_SHARE_HELPER")
public final class 1Za implements 0us
{
    public static final a LJIIJ;
    public int LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public int LJ;
    public String LJFF;
    public final DataChannel LJI;
    public final Room LJII;
    public final 0CH LJIIIIZZ;
    public final boolean LJIIIZ;
    public String LJIIJJI;
    public long LJIIL;
    public final boolean LJIILIIL;
    
    static {
        Covode.recordClassIndex(9580);
        LJIIJ = new a((byte)0);
    }
    
    public 1Za(final DataChannel lji, final Room ljii, final 0CH ljiiiizz, final boolean ljiiiz) {
        CTM.LIZ((Object)lji, (Object)ljii, (Object)ljiiiizz);
        this.LJI = lji;
        this.LJII = ljii;
        this.LJIIIIZZ = ljiiiizz;
        this.LJIIIZ = ljiiiz;
        this.LJIILIIL = false;
        this.LJIIJJI = "";
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LIZLLL = "";
    }
    
    private final int LJI() {
        if (n.LIZ((Object)this.LJIIJJI, (Object)"deeplink_share_source")) {
            return 2;
        }
        if (n.LIZ((Object)this.LJIIJJI, (Object)"private_message_share_source")) {
            return 1;
        }
        return 0;
    }
    
    @Override
    public final void LIZ() {
        final Fzp liz = Fhf.LIZ;
        final String s = "";
        n.LIZIZ((Object)liz, "");
        final EnterRoomLinkSession liz2 = liz.LIZ();
        String ljjijlij = null;
        Label_0054: {
            if (liz2 != null) {
                final EnterRoomConfig liziz = liz2.LIZIZ;
                if (liziz != null) {
                    final EnterRoomConfig$RoomsData lizlll = liziz.LIZLLL;
                    if (lizlll != null && (ljjijlij = lizlll.LJJIJLIJ) != null) {
                        break Label_0054;
                    }
                }
            }
            ljjijlij = "";
        }
        final Fzp liz3 = Fhf.LIZ;
        n.LIZIZ((Object)liz3, "");
        final EnterRoomLinkSession liz4 = liz3.LIZ();
        if (liz4 != null) {
            final EnterRoomConfig liziz2 = liz4.LIZIZ;
            if (liziz2 != null) {
                final EnterRoomConfig$RoomsData lizlll2 = liziz2.LIZLLL;
                if (lizlll2 != null) {
                    lizlll2.LJJIJLIJ = "";
                }
            }
        }
        if (!this.LJII.isWithLinkMic() || !GCe.LIZ().LIZJ) {
            final StringBuilder sb = new StringBuilder("isWithLinkMic = ");
            sb.append(this.LJII.isWithLinkMic());
            sb.append(" inStart=");
            sb.append(GCe.LIZ().LIZJ);
            0ba.LIZ(3, "MultiLiveInviteeShareHelper", sb.toString());
            return;
        }
        if (n.LIZ((Object)ljjijlij, (Object)"multilive_invite") ^ true) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(ljjijlij);
            sb2.append(" shareIntent != LiveShareConstants.INVITE_MULTI_LIVE_SHARE_INTENT");
            0ba.LIZ(3, "MultiLiveInviteeShareHelper", sb2.toString());
            return;
        }
        final Fzp liz5 = Fhf.LIZ;
        n.LIZIZ((Object)liz5, "");
        final EnterRoomLinkSession liz6 = liz5.LIZ();
        if (liz6 != null) {
            final EnterRoomConfig liziz3 = liz6.LIZIZ;
            if (liziz3 != null) {
                String ljjil;
                if ((ljjil = liziz3.LIZLLL.LJJIL) == null) {
                    ljjil = "";
                }
                this.LJIIJJI = ljjil;
                String ljjjjl;
                if ((ljjjjl = liziz3.LIZJ.LJJJJL) == null) {
                    ljjjjl = "";
                }
                this.LIZIZ = ljjjjl;
                this.LIZLLL = ljjjjl;
                String ljjjjli = liziz3.LIZJ.LJJJJLI;
                if (ljjjjli == null) {
                    ljjjjli = s;
                }
                this.LIZJ = ljjjjli;
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(this.LJIIJJI);
                sb3.append(' ');
                sb3.append(this.LIZIZ);
                sb3.append(' ');
                sb3.append(this.LIZJ);
                sb3.append(' ');
                sb3.append(this.LJFF);
                0ba.LIZ(3, "MultiLiveInviteeShareHelper", sb3.toString());
                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (this.LJIIIZ) {
                    final Long liz7 = 0sM.LIZ(this.LJIILIIL);
                    if (liz7 == null) {
                        0ba.LIZ(3, "MultiLiveInviteeShareHelper", "getOneVNLinkMicChannelId = null when is oneVnMode");
                        return;
                    }
                    linkedHashMap.put("channel_id", String.valueOf(liz7.longValue()));
                }
                ((FIc)0yr.LIZ().LIZ(MultiLiveApi.class).getSharedInviteePanelState(this.LJII.getId(), this.LJI(), linkedHashMap).LIZ((FCD)new FC5()).LIZ((FBZ)FFb.LIZ(this.LJIIIIZZ))).LIZ((2d6)new 1ZY(this), (2d6)1ZZ.LIZ);
            }
        }
    }
    
    @Override
    public final void LIZ(final long ljiil) {
        this.LJIIL = ljiil;
    }
    
    @Override
    public final int LIZIZ() {
        final int lji = this.LJI();
        this.LJIIJJI = "";
        return lji;
    }
    
    @Override
    public final String LIZJ() {
        if (this.LJ == 3) {
            this.LJ = 0;
            return "shared_auto_panel";
        }
        return "";
    }
    
    @Override
    public final String LIZLLL() {
        if (this.LIZ == 3 && this.LIZLLL.length() > 0) {
            final String lizlll = this.LIZLLL;
            this.LIZLLL = "";
            return lizlll;
        }
        return "room";
    }
    
    @Override
    public final String LJ() {
        final long ljiil = this.LJIIL;
        if (ljiil == 0L) {
            return null;
        }
        this.LJIIL = 0L;
        return String.valueOf(ljiil);
    }
    
    public final void LJFF() {
        FGP.LIZ().LIZ((Object)new 0kF());
    }
    
    public static final class a
    {
        static {
            Covode.recordClassIndex(9581);
        }
        
        public final 0us LIZ() {
            return 1jw.LIZ.LIZIZ("DATA_MULTI_LIVE_INVITEE_SHARE_HELPER");
        }
        
        public final 0us LIZ(final DataChannel dataChannel, final Room room, final 0CH 0ch, final boolean b) {
            if (dataChannel == null) {
                return null;
            }
            if (room == null) {
                return null;
            }
            final 1Za 1Za = new 1Za(dataChannel, room, 0ch, b, (byte)0);
            0kT.a.LIZ(1jw.LIZ, 1Za);
            return 1Za;
        }
        
        public final int LIZIZ() {
            final 0us liz = this.LIZ();
            if (liz != null) {
                return liz.LIZIZ();
            }
            return 0;
        }
    }
}
