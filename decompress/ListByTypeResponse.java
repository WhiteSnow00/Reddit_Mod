// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class ListByTypeResponse
{
    @c(LIZ = "data")
    public MultiLiveGuestInfoList LIZ;
    
    static {
        Covode.recordClassIndex(9783);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        if (this.LIZ != null) {
            sb.append(", data=");
            sb.append(this.LIZ);
        }
        sb.replace(0, 2, "ListByTypeResponse{");
        sb.append('}');
        return sb.toString();
    }
}
