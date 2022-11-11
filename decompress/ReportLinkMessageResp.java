// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.bytedance.android.livesdk.model.message.linkcore.LinkMicCommonResp;
import X.9Mp;

public final class ReportLinkMessageResp extends 9Mp
{
    @c(LIZ = "common_resp")
    public LinkMicCommonResp LIZ;
    @c(LIZ = "interval")
    public long LIZIZ;
    
    static {
        Covode.recordClassIndex(9788);
    }
    
    public ReportLinkMessageResp() {
        this.LIZ = null;
        this.LIZIZ = 0L;
    }
    
    public ReportLinkMessageResp(final char c) {
        this((byte)0);
    }
    
    public final Object[] getObjects() {
        return new Object[] { this.LIZ, this.LIZIZ };
    }
}
