// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model.proto;

import X.0jR;
import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import X.0ys;
import X.0TU;
import java.util.Map;
import X.0W0;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;

public final class ProtocolBuffersCollector
{
    static {
        Covode.recordClassIndex(4953);
    }
    
    public static void init() {
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        new 0W0().LIZ(hashMap);
        0ys.LIZ();
        0jR.LIZ(INetworkService.class).injectProtoDecoders((Map)hashMap);
        0ys.LIZ();
        0jR.LIZ(INetworkService.class).injectProtoEncoders((Map)hashMap2);
    }
}
