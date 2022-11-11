// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class GuestMicCameraManageResponse
{
    @c(LIZ = "data")
    public ResponseData LIZ;
    
    static {
        Covode.recordClassIndex(9775);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        if (this.LIZ != null) {
            sb.append(", data=");
            sb.append(this.LIZ);
        }
        sb.replace(0, 2, "GuestMicCameraManageResponse{");
        sb.append('}');
        return sb.toString();
    }
    
    public static final class ResponseData
    {
        static {
            Covode.recordClassIndex(9776);
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.replace(0, 2, "ResponseData{");
            sb.append('}');
            return sb.toString();
        }
    }
}
