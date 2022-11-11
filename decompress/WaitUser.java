// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import X.9Mp;

public final class WaitUser extends 9Mp
{
    @c(LIZ = "uid")
    public long LIZ;
    @c(LIZ = "link_mic_id")
    public String LIZIZ;
    
    static {
        Covode.recordClassIndex(9790);
    }
    
    public WaitUser(final byte b) {
        this();
    }
    
    public WaitUser(final long liz, final String liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final Object[] getObjects() {
        return new Object[] { this.LIZ, this.LIZIZ };
    }
}
