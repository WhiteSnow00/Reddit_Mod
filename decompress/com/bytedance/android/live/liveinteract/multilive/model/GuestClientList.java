// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import X.9Mp;

public final class GuestClientList extends 9Mp
{
    @c(LIZ = "uid")
    public long LIZ;
    @c(LIZ = "link_mic_id")
    public String LIZIZ;
    @c(LIZ = "status")
    public int LIZJ;
    @c(LIZ = "source")
    public int LIZLLL;
    
    static {
        Covode.recordClassIndex(9773);
    }
    
    public GuestClientList(final byte b) {
        this();
    }
    
    public GuestClientList(final long liz, final String liziz, final int lizj, final int lizlll) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
    }
    
    public final Object[] getObjects() {
        return new Object[] { this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL };
    }
}
