// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.network;

import X.0ym;
import com.bytedance.android.livesdk.livesetting.message.LiveMtPbRequestsSetting;
import X.0ba;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDataSerializationType;
import X.6yM;
import X.5l6;
import X.70Z;
import X.5fU;
import java.util.Collection;
import java.util.LinkedList;
import X.1de;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.covode.number.Covode;
import X.5ky;

public class ResponseInterceptor implements 5ky
{
    static {
        Covode.recordClassIndex(10420);
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
        final String path = liz.getPath();
        Request request;
        if (path.equals("/webcast/room/enter/")) {
            final int value = LiveDataSerializationType.INSTANCE.getValue();
            0ba.LIZ("ttlivesdk room enter v1 serialization_type: ".concat(String.valueOf(value)));
            if (value == 1) {
                request = liz;
            }
            else {
                request = this.LIZ(liz);
            }
        }
        else if (path.equals("/webcast/room/info/")) {
            final int value2 = LiveDataSerializationType.INSTANCE.getValue();
            0ba.LIZ("ttlivesdk room info serialization_type: ".concat(String.valueOf(value2)));
            if (value2 == 1) {
                request = liz;
            }
            else if (value2 == 2 && LiveMtPbRequestsSetting.INSTANCE.getValue().isEnable()) {
                final LinkedList lizj = new LinkedList(liz.getHeaders());
                lizj.add((Object)new 5fU("response-format", "protobuf"));
                final 70Z builder = liz.newBuilder();
                builder.LIZJ = lizj;
                request = builder.LIZ();
            }
            else {
                request = this.LIZ(liz);
            }
        }
        else if (path.equals("/webcast/room/ping/audience/") || path.equals("/webcast/room/check_alive/")) {
            request = liz;
            if (LiveDataSerializationType.INSTANCE.getValue() == 2) {
                request = liz;
                if (LiveMtPbRequestsSetting.INSTANCE.getValue().isEnable()) {
                    final LinkedList lizj2 = new LinkedList(liz.getHeaders());
                    lizj2.add((Object)new 5fU("response-format", "protobuf"));
                    final 70Z builder2 = liz.newBuilder();
                    builder2.LIZJ = lizj2;
                    request = builder2.LIZ();
                }
            }
        }
        else {
            request = this.LIZ(liz);
        }
        final 6yM liz2 = 5l6.LIZ(request);
        0ym.LIZ(request, liz2, 1);
        return liz2;
    }
}
