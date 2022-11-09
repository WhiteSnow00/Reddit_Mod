// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.bytedance.android.livesdk.model.linksetting.MultiGuestPermissionInfoAudienceSide;
import X.9Mp;

public final class AudienceMultiGuestPermissionResponseData extends 9Mp
{
    @c(LIZ = "permission_info")
    public MultiGuestPermissionInfoAudienceSide LIZ;
    
    static {
        Covode.recordClassIndex(9767);
    }
    
    public AudienceMultiGuestPermissionResponseData() {
        this.LIZ = null;
    }
    
    public AudienceMultiGuestPermissionResponseData(final char c) {
        this((byte)0);
    }
    
    public final boolean LIZ() {
        final MultiGuestPermissionInfoAudienceSide liz = this.LIZ;
        if (liz != null) {
            final Long liziz = liz.LIZIZ;
            if (liziz != null && liziz == 0L && liz.LIZLLL != null) {
                return true;
            }
        }
        return false;
    }
    
    public final Object[] getObjects() {
        return new Object[] { this.LIZ };
    }
}
