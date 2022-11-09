// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import X.9Mp;

public final class LinkedUser extends 9Mp
{
    @c(LIZ = "uid")
    public long LIZ;
    @c(LIZ = "link_mic_id")
    public String LIZIZ;
    @c(LIZ = "audio_mute_status")
    public int LIZJ;
    @c(LIZ = "video_mute_status")
    public int LIZLLL;
    @c(LIZ = "position")
    public int LJ;
    
    static {
        Covode.recordClassIndex(9781);
    }
    
    public LinkedUser(final byte b) {
        this();
    }
    
    public LinkedUser(final long liz, final String liziz, final int lizj, final int lizlll, final int lj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
    }
    
    public final Object[] getObjects() {
        return new Object[] { this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ };
    }
}
