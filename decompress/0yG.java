// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ttnet.TTNetInit;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdkapi.host.IHostAction;
import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public final class 0yg
{
    static {
        Covode.recordClassIndex(10431);
    }
    
    public static final JSONObject LIZ() {
        final JSONObject jsonObject = new JSONObject();
        try {
            final 0Vq liz = 0jR.LIZ((Class<0Vq>)IHostAction.class);
            n.LIZIZ((Object)liz, "");
            final I5W videoOnDemandParams = ((IHostAction)liz).getVideoOnDemandParams();
            jsonObject.put("network_speed_in_kbps", videoOnDemandParams.LIZIZ * 8);
            jsonObject.put("recommend_bitrate", videoOnDemandParams.LIZ);
            final 6y0 networkQuality = TTNetInit.getNetworkQuality();
            if (networkQuality != null) {
                jsonObject.put("tcp_rtt", networkQuality.LIZ);
                jsonObject.put("quic_rtt", networkQuality.LIZ);
                jsonObject.put("http_rtt", networkQuality.LIZIZ);
                jsonObject.put("downstream_throughput_kbps", networkQuality.LIZJ);
            }
            final U6a packetLossRateMetrics = TTNetInit.getPacketLossRateMetrics(1);
            if (packetLossRateMetrics != null) {
                jsonObject.put("quic_send_loss_rate", packetLossRateMetrics.LIZ);
                jsonObject.put("quic_receive_loss_rate", packetLossRateMetrics.LIZIZ);
            }
            jsonObject.put("net_effective_connection_type", TTNetInit.getEffectiveConnectionType());
            jsonObject.put("video_download_speed", 5Zs.LJFF());
        }
        catch (final Exception ex) {
            0ba.LIZ("GetNetworkParams", ex);
        }
        return jsonObject;
    }
}
