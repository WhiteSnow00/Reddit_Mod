// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiLiveServerAutoJoinChannel;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.Map;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import java.util.HashMap;
import org.json.JSONObject;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

public final class 1ld extends a
{
    public Room LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public DataChannel LJFF;
    public 1Uo LJI;
    public boolean LJII;
    public List<Rl5> LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public String LJIIL;
    public LiveEffect LJIILIIL;
    public FH6 LJIILJJIL;
    
    static {
        Covode.recordClassIndex(8486);
    }
    
    public 1ld(final Room liz, final boolean ljii, final List<Rl5> ljiiiz, final int lj, final DataChannel ljff) {
        this.LIZIZ = 1;
        this.LJIIJJI = 2;
        this.LJIIL = "";
        this.LJIILJJIL = new FH6();
        this.LJI = (1Uo)1jw.LIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
        this.LIZ = liz;
        this.LJII = ljii;
        this.LJIIIZ = ljiiiz;
        this.LJ = lj;
        this.LJFF = ljff;
    }
    
    @Override
    public final int LIZ() {
        return this.LIZIZ;
    }
    
    @Override
    public final void LIZ(final int liziz) {
        this.LIZIZ = liziz;
    }
    
    @Override
    public final void LIZ(final 1ZS 1zs) {
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        final 1NO liz = 1NO.LIZ();
        int liz2;
        int liziz;
        if (this.LJII) {
            final Rl5 rl5 = this.LJIIIZ.get(this.LJIIJ);
            liz2 = rl5.LIZ;
            liziz = rl5.LIZIZ;
            liz.LJ = true;
            liz.LJFF = liziz;
        }
        else {
            liz.LJ = false;
            liz.LJFF = 0;
            liziz = 0;
            liz2 = 0;
        }
        this.LIZIZ = this.LJI.LJI("apply");
        final StringBuilder sb = new StringBuilder("roomId:");
        sb.append(this.LIZ.getId());
        sb.append("; ownerUid:");
        sb.append(this.LIZ.getOwnerUserId());
        sb.append("; type:");
        sb.append(this.LIZIZ);
        0xo.LIZJ("LinkIn_Guest_Apply", sb.toString());
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "support_vendor", "12");
        1ml.LIZ(1ml.LJIIIIZZ, false, "apply_request", jsonObject);
        1ml.LJII = System.currentTimeMillis();
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("link_type", String.valueOf(this.LIZIZ));
        hashMap.put("guest_supported_vendor", "12");
        hashMap.put("guest_supported_layout", "15");
        hashMap.put("payed_money", String.valueOf(liz2));
        hashMap.put("link_duration", String.valueOf(liziz));
        if (1zs != null) {
            hashMap.put("required_mic_idx", String.valueOf(1zs.LIZ));
            final int liziz2 = 1zs.LIZIZ;
            if (liziz2 == 11 || liziz2 == 12) {
                hashMap.put("layout", "1");
            }
            else if (liziz2 == 13 || liziz2 == 14) {
                hashMap.put("layout", "0");
            }
        }
        hashMap.put("user_return_type", String.valueOf(1Za.LJIIJ.LIZIZ()));
        final 1Uo 1Uo = 1jw.LIZ.LIZIZ("MULTI_GUEST_DATA_HOLDER");
        final String value = String.valueOf(System.currentTimeMillis());
        if (1Uo != null) {
            1Uo.LJII(value);
        }
        this.LJIILJJIL.LIZ(0yr.LIZ().LIZ(LinkApi.class).apply(this.LIZ.getId(), this.LIZ.getOwnerUserId(), (Map)hashMap).LIZ((FCC)new FC5()).LIZ((2d6)new 1U1(this, 1Uo, value), (2d6)new 1U2(this, 1zs)));
        final HashMap hashMap2 = new HashMap();
        final Room liz3 = this.LIZ;
        if (liz3 != null) {
            String s;
            if (liz3.getStreamType() == Fra.AUDIO) {
                s = "radio";
            }
            else {
                s = "video";
            }
            hashMap2.put("room_type", s);
        }
        hashMap2.put("audience_connection_type", "voice");
        final Gkn liz4 = Gkn.LJFF.LIZ("audience_connection_apply");
        liz4.LIZ((Map)hashMap2);
        liz4.LJ("live_detail");
        liz4.LIZJ("live");
        liz4.LIZLLL("click");
        liz4.LIZ();
        liz4.LIZLLL();
    }
    
    @Override
    public final void LIZ(final LiveEffect ljiiliil) {
        this.LJIILIIL = ljiiliil;
    }
    
    @Override
    public final void LIZ(final String ljiil) {
        this.LJIIL = ljiil;
    }
    
    @Override
    public final String LIZIZ() {
        return this.LJIIL;
    }
    
    @Override
    public final void LIZIZ(final int ljiijji) {
        this.LJIIJJI = ljiijji;
        0jR.LIZ(IHostConfig.class).LIZIZ().LIZ((H2j)GbP.LIVE_INTERACT_BEAUTY_LEVEL, ljiijji);
    }
    
    @Override
    public final ImageModel LIZJ() {
        return Fk2.LIZ().LIZIZ().LIZ().getAvatarThumb();
    }
    
    @Override
    public final boolean LIZLLL() {
        return this.LJII;
    }
    
    @Override
    public final void LJ() {
        if (this.LIZ != null && !this.LIZLLL) {
            final String ljjiffi = GCe.LIZ().LJJIFFI;
            this.LIZIZ = this.LJI.LJI("reply");
            1NO.LIZ().LIZIZ = this.LJIIJJI;
            1NO.LIZ().LIZJ = this.LJIILIIL;
            1NO.LIZ().LIZLLL = this.LJIIL;
            1ml.LIZ(1L, this.LIZ.getOwnerUserId(), 5ob.LIZ.LIZ(this.LIZ.getOwnerUserId()));
            this.LIZJ = true;
            this.LJIILJJIL.LIZ(0yr.LIZ().LIZ(LinkApi.class).linkInRoomGuestReplyAnchor(this.LIZ.getId(), 1, this.LIZ.getId(), this.LIZ.getOwnerUserId(), this.LIZIZ, ljjiffi, MultiLiveServerAutoJoinChannel.INSTANCE.getValue(), 0).LIZIZ(FAr.LIZIZ(FGw.LIZJ)).LIZ(F8U.LIZ(F8V.LIZ)).LIZ((2d6)new 1U3(this), (2d6)new 1U4(this)));
        }
    }
    
    @Override
    public final void h_() {
        super.h_();
        this.LJIILJJIL.LIZ();
    }
}
