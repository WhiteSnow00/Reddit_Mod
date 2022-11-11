// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 10F
{
    public long LIZ;
    public String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final String LJ;
    
    static {
        Covode.recordClassIndex(10691);
    }
    
    public 10F(final String lizj, final long lizlll, final String lj) {
        CTM.LIZ((Object)lizj, (Object)lj);
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
    }
    
    public final void LIZ(final String liziz, final boolean b) {
        CTM.LIZ((Object)liziz);
        if (this.LIZ != 0L) {
            return;
        }
        this.LIZ = System.currentTimeMillis();
        this.LIZIZ = liziz;
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_live_gift_record_show");
        liz.LIZ("anchor_id", this.LIZJ);
        liz.LIZ("live_type", "screen_share");
        liz.LIZ("room_id", this.LIZLLL);
        liz.LIZ("event_page", this.LJ);
        liz.LIZ("enter_from", liziz);
        liz.LIZ("is_send_gift", (int)(b ? 1 : 0));
        liz.LIZLLL();
    }
    
    public final void LIZ(final boolean b) {
        if (this.LIZ == 0L) {
            return;
        }
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_live_gift_record_duration");
        liz.LIZ("anchor_id", this.LIZJ);
        liz.LIZ("live_type", "screen_share");
        liz.LIZ("room_id", this.LIZLLL);
        liz.LIZ("event_page", this.LJ);
        liz.LIZ("enter_from", this.LIZIZ);
        liz.LIZ("is_send_gift", (int)(b ? 1 : 0));
        liz.LIZ("duration", (System.currentTimeMillis() - this.LIZ) / 1000L);
        liz.LIZLLL();
        this.LIZ = 0L;
    }
}
