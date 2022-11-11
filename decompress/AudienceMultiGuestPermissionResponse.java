// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import X.9Mp;

public final class AudienceMultiGuestPermissionResponse extends 9Mp
{
    @c(LIZ = "data")
    public AudienceMultiGuestPermissionResponseData LIZ;
    
    static {
        Covode.recordClassIndex(9766);
    }
    
    public AudienceMultiGuestPermissionResponse() {
        this.LIZ = null;
    }
    
    public AudienceMultiGuestPermissionResponse(final char c) {
        this((byte)0);
    }
    
    public final Object[] getObjects() {
        return new Object[] { this.LIZ };
    }
}
