// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;
import X.9Mp;

public final class AnchorClientList extends 9Mp
{
    @c(LIZ = "rtc_users")
    public List<WaitUser> LIZ;
    @c(LIZ = "apply_users")
    public List<WaitUser> LIZIZ;
    @c(LIZ = "invite_users")
    public List<WaitUser> LIZJ;
    @c(LIZ = "ready_users")
    public List<WaitUser> LIZLLL;
    @c(LIZ = "link_users")
    public List<LinkedUser> LJ;
    
    static {
        Covode.recordClassIndex(9764);
    }
    
    public AnchorClientList(final byte b) {
        this();
    }
    
    public AnchorClientList(final List<WaitUser> liz, final List<WaitUser> liziz, final List<WaitUser> lizj, final List<WaitUser> lizlll, final List<LinkedUser> lj) {
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
