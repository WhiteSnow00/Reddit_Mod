// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import X.9Mp;

public final class ChannelMessage extends 9Mp
{
    @c(LIZ = "channel_id")
    public long LIZ;
    @c(LIZ = "report_type")
    public int LIZIZ;
    @c(LIZ = "layout_id")
    public String LIZJ;
    @c(LIZ = "layout_version")
    public int LIZLLL;
    
    static {
        Covode.recordClassIndex(9768);
    }
    
    public ChannelMessage(final byte b) {
        this();
    }
    
    public ChannelMessage(final long liz, final int liziz, final String lizj, final int lizlll) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
    }
    
    public final Object[] getObjects() {
        return new Object[] { this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL };
    }
}
