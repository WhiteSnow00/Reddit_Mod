// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.bpea.basics.PrivacyCert$Builder;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import org.json.JSONObject;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.covode.number.Covode;

public final class 1vY extends 1mj
{
    public final /* synthetic */ 1k4 LIZ;
    
    static {
        Covode.recordClassIndex(7277);
    }
    
    public 1vY(final 1k4 liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ(final LinkMessage linkMessage) {
        if (linkMessage.LIZIZ() != Rl7.ANCHOR_LINKMIC) {
            return;
        }
        super.LIZ(linkMessage);
        if (this.LIZ.LIZIZ) {
            CTM.LIZ((Object)linkMessage);
            final JSONObject jsonObject = new JSONObject();
            1jz.LIZLLL.LIZ(jsonObject, linkMessage);
            0d3.LIZ(jsonObject, "msgId", ((H31)linkMessage).getMessageId());
            1jz.LIZLLL.LIZ("finish_message", jsonObject, 0);
            final 0kd lizj = this.LIZ.LIZLLL.LIZJ();
            if (this.LIZ.LIZLLL.LJ == linkMessage.LIZIZ && 0kd.CONNECTION_FINISH.compareTo(lizj) > 0) {
                this.LIZ.LIZLLL.LIZIZ(linkMessage.LJIJ);
                this.LIZ.LIZIZ(203);
                if (!this.LIZ.LIZLLL.LJJJLZIJ && 0lK.LIZ()) {
                    this.LIZ.LIZLLL.LJIIJ = true;
                    if (this.LIZ.LJJIJL != null) {
                        this.LIZ.LJJIJL.LIZJ((Class)2EN.class, (Object)0cB.LIZ(2131828975));
                    }
                    1O2.LIZ(1O2.d.SYSTEM_REMATCH);
                    0xy.LIZ(null, 0kf.RANDOM_LINK_MIC_INVITE, "", "");
                }
            }
            return;
        }
        CTM.LIZ((Object)linkMessage);
        final JSONObject jsonObject2 = new JSONObject();
        1jz.LIZLLL.LIZIZ(jsonObject2);
        0d3.LIZ(jsonObject2, "msgId", ((H31)linkMessage).getMessageId());
        0d3.LIZ(jsonObject2, "event_id", "finish_message");
        0d8.LIZ("ttlive_client_anchor_link_mic_audience_monitor", 1, jsonObject2);
        final 1k4 liz = this.LIZ;
        final PrivacyCert$Builder with = PrivacyCert$Builder.with("bpea-522");
        with.usage("");
        with.tag("link mic stop");
        with.policies(new 6E8[] { PrivacyPolicyStore.getAudioPrivacyPolicy() });
        liz.LIZIZ((Cert)with.build());
    }
}
