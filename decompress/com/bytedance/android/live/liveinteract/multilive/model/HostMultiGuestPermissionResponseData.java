// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import X.9Mp;

public final class HostMultiGuestPermissionResponseData extends 9Mp
{
    @c(LIZ = "permission_info")
    public MultiGuestPermissionInfo LIZ;
    
    static {
        Covode.recordClassIndex(9780);
    }
    
    public HostMultiGuestPermissionResponseData() {
        this.LIZ = null;
    }
    
    public HostMultiGuestPermissionResponseData(final char c) {
        this((byte)0);
    }
    
    public final Object[] getObjects() {
        return new Object[] { this.LIZ };
    }
}
