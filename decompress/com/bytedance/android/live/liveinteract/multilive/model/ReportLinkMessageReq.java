// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.message.linkcore.Player;
import com.google.gson.a.c;
import com.bytedance.android.livesdk.model.message.linkcore.LinkCommon;
import X.9Mp;

public final class ReportLinkMessageReq extends 9Mp
{
    @c(LIZ = "common")
    public LinkCommon LIZ;
    @c(LIZ = "myself")
    public Player LIZIZ;
    @c(LIZ = "channel_message")
    public ChannelMessage LIZJ;
    @c(LIZ = "anchor_client_list")
    public AnchorClientList LIZLLL;
    @c(LIZ = "guest_client_list")
    public GuestClientList LJ;
    
    static {
        Covode.recordClassIndex(9787);
    }
    
    public ReportLinkMessageReq() {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
    }
    
    public ReportLinkMessageReq(final char c) {
        this((byte)0);
    }
    
    public final Object[] getObjects() {
        return new Object[] { this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ };
    }
}
