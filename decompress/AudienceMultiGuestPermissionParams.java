// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import X.9Mp;

public final class AudienceMultiGuestPermissionParams extends 9Mp
{
    @c(LIZ = "room_id")
    public long LIZ;
    @c(LIZ = "app_id")
    public long LIZIZ;
    @c(LIZ = "live_id")
    public long LIZJ;
    
    static {
        Covode.recordClassIndex(9765);
    }
    
    public AudienceMultiGuestPermissionParams() {
        this.LIZ = 0L;
        this.LIZIZ = 0L;
        this.LIZJ = 0L;
    }
    
    public AudienceMultiGuestPermissionParams(final char c) {
        this((byte)0);
    }
    
    public final Object[] getObjects() {
        return new Object[] { this.LIZ, this.LIZIZ, this.LIZJ };
    }
}
