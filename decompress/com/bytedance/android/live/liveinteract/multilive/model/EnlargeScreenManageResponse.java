// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class EnlargeScreenManageResponse
{
    @c(LIZ = "data")
    public ResponseData LIZ;
    
    static {
        Covode.recordClassIndex(9770);
    }
    
    public static final class ResponseData
    {
        @c(LIZ = "enlarge_linkmic_id")
        public String LIZ;
        
        static {
            Covode.recordClassIndex(9771);
        }
        
        public ResponseData() {
            this.LIZ = "";
        }
    }
}
