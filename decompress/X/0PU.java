// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Map;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostServerOptVersionSetting;
import java.util.HashMap;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

public final class 0pU
{
    static {
        Covode.recordClassIndex(8167);
    }
    
    public static FBF<1dl<Void>> LIZ(final int n, final boolean b) {
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        if (room == null) {
            return null;
        }
        final long id = room.getId();
        String secUid;
        if (room.getOwner() != null) {
            secUid = room.getOwner().getSecUid();
        }
        else {
            secUid = "";
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("cohost_arch_version", String.valueOf(CohostServerOptVersionSetting.INSTANCE.getValue()));
        switch (n) {
            default: {
                return null;
            }
            case 5: {
                return 0yr.LIZ().LIZ(CoHostApi.class).updateMultiCoHostLinkSetting(id, secUid, n, false, false, b, false, false, false, false, hashMap);
            }
            case 6: {
                return 0yr.LIZ().LIZ(CoHostApi.class).updateMultiCoHostLinkSetting(id, secUid, n, false, false, false, b, false, false, false, hashMap);
            }
            case 7: {
                return 0yr.LIZ().LIZ(CoHostApi.class).updateMultiCoHostLinkSetting(id, secUid, n, b, false, false, false, false, false, false, hashMap);
            }
            case 8: {
                return 0yr.LIZ().LIZ(CoHostApi.class).updateMultiCoHostLinkSetting(id, secUid, n, false, b, false, false, false, false, false, hashMap);
            }
            case 9: {
                return 0yr.LIZ().LIZ(CoHostApi.class).updateMultiCoHostLinkSetting(id, secUid, n, false, false, false, false, b, false, false, hashMap);
            }
            case 10: {
                return 0yr.LIZ().LIZ(CoHostApi.class).updateMultiCoHostLinkSetting(id, secUid, n, false, false, false, false, false, b, false, hashMap);
            }
            case 11: {
                return 0yr.LIZ().LIZ(CoHostApi.class).updateMultiCoHostLinkSetting(id, secUid, n, false, false, false, false, false, false, b, hashMap);
            }
        }
    }
}
