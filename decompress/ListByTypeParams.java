// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class ListByTypeParams
{
    @c(LIZ = "room_id")
    public Long LIZ;
    @c(LIZ = "channel_id")
    public Long LIZIZ;
    @c(LIZ = "anchor_id")
    public Long LIZJ;
    @c(LIZ = "list_type")
    public int LIZLLL;
    
    static {
        Covode.recordClassIndex(9782);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        if (this.LIZ != null) {
            sb.append(", room_id=");
            sb.append(this.LIZ);
        }
        if (this.LIZIZ != null) {
            sb.append(", channel_id=");
            sb.append(this.LIZIZ);
        }
        if (this.LIZJ != null) {
            sb.append(", anchor_id=");
            sb.append(this.LIZJ);
        }
        sb.append(", list_type=");
        sb.append(this.LIZLLL);
        sb.replace(0, 2, "ListByTypeParams{");
        sb.append('}');
        return sb.toString();
    }
}
