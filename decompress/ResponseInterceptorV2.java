// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.network;

import X.0ym;
import com.bytedance.android.livesdk.livesetting.message.LiveMtPbRequestsSetting;
import X.0ba;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDataSerializationType;
import X.0jR;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import X.6yM;
import X.5l6;
import X.70Z;
import X.5fU;
import java.util.Collection;
import java.util.LinkedList;
import X.1de;
import com.bytedance.retrofit2.client.Request;
import X.1dT;
import com.bytedance.covode.number.Covode;
import X.0yk;
import X.5ky;

public class ResponseInterceptorV2 implements 5ky
{
    public final 0yk LIZ;
    
    static {
        Covode.recordClassIndex(10421);
    }
    
    public ResponseInterceptorV2() {
        this.LIZ = new 1dT();
    }
    
    private Request LIZ(final Request request) {
        Request liz = request;
        if (1de.LIZ(request)) {
            final LinkedList lizj = new LinkedList(request.getHeaders());
            lizj.add(new 5fU("response-format", "protobuf"));
            final 70Z builder = request.newBuilder();
            builder.LIZJ = lizj;
            liz = builder.LIZ();
        }
        return liz;
    }
    
    public 6yM intercept(final 5l6 5l6) {
        final Request liz = 5l6.LIZ();
        final String liz2 = this.LIZ.LIZ(liz);
        if (0jR.LIZ(IHostNetwork.class) != null) {
            0jR.LIZ(IHostNetwork.class).minorModeInterceptMonitor(liz2);
        }
        final 70Z builder = liz.newBuilder();
        builder.LIZ(liz2);
        final Request liz3 = builder.LIZ();
        final String path = liz3.getPath();
        Request request;
        if (path.equals("/webcast/room/enter/")) {
            final int value = LiveDataSerializationType.INSTANCE.getValue();
            0ba.LIZ("ttlivesdk room enter v1 serialization_type: ".concat(String.valueOf(value)));
            if (value == 1) {
                request = liz3;
            }
            else if (!LiveMtPbRequestsSetting.INSTANCE.getValue().isEnable()) {
                request = liz3;
            }
            else {
                final LinkedList lizj = new LinkedList(liz3.getHeaders());
                lizj.add((Object)new 5fU("response-format", "protobuf"));
                final 70Z builder2 = liz3.newBuilder();
                builder2.LIZJ = lizj;
                request = builder2.LIZ();
            }
        }
        else if (path.equals("/webcast/room/info/")) {
            final int value2 = LiveDataSerializationType.INSTANCE.getValue();
            0ba.LIZ("ttlivesdk room info serialization_type: ".concat(String.valueOf(value2)));
            if (value2 == 1) {
                request = liz3;
            }
            else if (value2 == 2 && LiveMtPbRequestsSetting.INSTANCE.getValue().isEnable()) {
                final LinkedList lizj2 = new LinkedList(liz3.getHeaders());
                lizj2.add((Object)new 5fU("response-format", "protobuf"));
                final 70Z builder3 = liz3.newBuilder();
                builder3.LIZJ = lizj2;
                request = builder3.LIZ();
            }
            else {
                request = this.LIZ(liz3);
            }
        }
        else if (path.equals("/webcast/room/ping/audience/") || path.equals("/webcast/room/check_alive/")) {
            request = liz3;
            if (LiveDataSerializationType.INSTANCE.getValue() == 2) {
                request = liz3;
                if (LiveMtPbRequestsSetting.INSTANCE.getValue().isEnable()) {
                    final LinkedList lizj3 = new LinkedList(liz3.getHeaders());
                    lizj3.add((Object)new 5fU("response-format", "protobuf"));
                    final 70Z builder4 = liz3.newBuilder();
                    builder4.LIZJ = lizj3;
                    request = builder4.LIZ();
                }
            }
        }
        else {
            request = this.LIZ(liz3);
        }
        final 6yM liz4 = 5l6.LIZ(request);
        0ym.LIZ(request, liz4, 2);
        return liz4;
    }
}
