// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.base.model.user.BadgeStruct;
import java.util.List;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.message.LiveIntroMessage;

public final class 2Hk extends 2HI<LiveIntroMessage> implements 11J, 1n9
{
    public long LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public CharSequence LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    
    static {
        Covode.recordClassIndex(10870);
    }
    
    public 2Hk(final LiveIntroMessage liveIntroMessage) {
        super((H31)liveIntroMessage);
    }
    
    private String LJJIIZI() {
        if (((LiveIntroMessage)super.LJIILIIL).LJ != null && ((LiveIntroMessage)super.LJIILIIL).LJ == 1) {
            return "default";
        }
        return "edit";
    }
    
    @Override
    public final void LIZ(final CharSequence ljiji) {
        this.LJIJI = ljiji;
    }
    
    @Override
    public final void LIZ(final boolean ljijj) {
        this.LJIJJ = ljijj;
    }
    
    @Override
    public final User LIZIZ() {
        return this.t_().LJIILLIIL;
    }
    
    @Override
    public final void LIZIZ(final 10r 10r) {
        this.LIZ(((LiveIntroMessage)super.LJIILIIL).LJFF, 10r, 2);
        super.LIZIZ(10r);
    }
    
    @Override
    public final void LIZIZ(final boolean ljij) {
        this.LJIJ = ljij;
    }
    
    @Override
    public final void LIZJ(final boolean ljiizilj) {
        this.LJIIZILJ = ljiizilj;
    }
    
    @Override
    public final void LIZLLL(final 10r 10r) {
        this.LIZ(((LiveIntroMessage)super.LJIILIIL).LJFF, 10r, 2);
        super.LIZLLL(10r);
    }
    
    @Override
    public final boolean LJII() {
        return this.LJIJJ;
    }
    
    @Override
    public final void LJIIIIZZ() {
        this.LJIJJLI = true;
    }
    
    @Override
    public final boolean LJIIIZ() {
        return this.LJIJJLI;
    }
    
    @Override
    public final void LJIIJ() {
        final CharSequence ljiji = this.LJIJI();
        if (ljiji != null) {
            if (this.LJJIJL()) {
                final Gkn liz = Gkn.LJFF.LIZ("livesdk_anchor_room_detail_show");
                liz.LIZ();
                liz.LIZ("live_info_content", ljiji.toString());
                liz.LIZ("live_info_type", this.LJJIIZI());
                liz.LIZLLL();
                return;
            }
            final Gkn liz2 = Gkn.LJFF.LIZ("livesdk_room_detail_audience_show");
            liz2.LIZ();
            liz2.LIZ("live_info_content", ljiji.toString());
            liz2.LIZ("live_info_type", this.LJJIIZI());
            liz2.LIZLLL();
            this.LJIILLIIL = System.currentTimeMillis();
        }
    }
    
    @Override
    public final void LJIIJJI() {
        final CharSequence ljiji = this.LJIJI();
        if (!this.LJJIJL() && ljiji != null) {
            final Gkn liz = Gkn.LJFF.LIZ("livesdk_room_detail_audience_show_duration");
            liz.LIZ();
            liz.LIZ("live_info_content", ljiji.toString());
            liz.LIZ("duration", (int)(System.currentTimeMillis() - this.LJIILLIIL));
            liz.LIZ("live_info_type", this.LJJIIZI());
            liz.LIZLLL();
        }
    }
    
    @Override
    public final boolean LJIJ() {
        return this.LJIIZILJ;
    }
    
    @Override
    public final boolean LJIJJ() {
        return !this.LJJIJL();
    }
    
    @Override
    public final boolean LJJI() {
        return !this.t_().LJIILJJIL;
    }
    
    @Override
    public final boolean LJJIFFI() {
        return true;
    }
    
    @Override
    public final long LJJII() {
        return 2000L;
    }
    
    @Override
    public final boolean LJJIJ() {
        return this.LJIJ;
    }
    
    @Override
    public final CharSequence LJJIJIIJI() {
        return this.LJIJI;
    }
    
    @Override
    public final CharSequence LJJIJIIJIL() {
        return this.LJIJI();
    }
    
    @Override
    public final boolean LJJIJIL() {
        return true;
    }
    
    @Override
    public final boolean o_() {
        return false;
    }
    
    @Override
    public final CharSequence p_() {
        return ((LiveIntroMessage)super.LJIILIIL).LIZJ;
    }
    
    @Override
    public final boolean r_() {
        return false;
    }
}
