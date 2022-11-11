// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.model.message.ChatMessage;
import kotlin.jvm.internal.n;
import android.widget.TextView;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveEnableBadgeOptimize;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveEnableUiOptimize;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import android.content.Context;

public final class 10r
{
    public final long LIZ;
    public boolean LIZIZ;
    public final long LIZJ;
    public boolean LIZLLL;
    public HCo LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public int LJII;
    public long LJIIIIZZ;
    public final Context LJIIIZ;
    public final 0CH LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final Room LJIILL;
    public final User LJIILLIIL;
    public final DataChannel LJIIZILJ;
    public final 10K LJIJ;
    public final 1eX LJIJI;
    public long LJIJJ;
    
    static {
        Covode.recordClassIndex(10747);
    }
    
    public 10r(final Context ljiiiz, final 0CH ljiij, final boolean ljiijji, final boolean ljiil, final boolean ljiiliil, final boolean ljiiljjil, final Room ljiill, final User ljiilliil, final DataChannel ljiizilj, final 10K ljij, final 1eX ljiji) {
        CTM.LIZ((Object)ljiiiz, (Object)ljiij, (Object)ljij, (Object)ljiji);
        this.LJIIIZ = ljiiiz;
        this.LJIIJ = ljiij;
        this.LJIIJJI = ljiijji;
        this.LJIIL = ljiil;
        this.LJIILIIL = ljiiliil;
        this.LJIILJJIL = ljiiljjil;
        this.LJIILL = ljiill;
        this.LJIILLIIL = ljiilliil;
        this.LJIIZILJ = ljiizilj;
        this.LJIJ = ljij;
        this.LJIJI = ljiji;
        final long n = 0L;
        long id;
        if (ljiill != null) {
            id = ljiill.getId();
        }
        else {
            id = 0L;
        }
        this.LIZ = id;
        long id2 = n;
        if (ljiilliil != null) {
            id2 = ljiilliil.getId();
        }
        this.LIZJ = id2;
        this.LJFF = LiveEnableUiOptimize.getValue();
        this.LJI = LiveEnableBadgeOptimize.getValue();
    }
    
    public final User LIZ() {
        final DataChannel ljiizilj = this.LJIIZILJ;
        if (ljiizilj != null) {
            return (User)ljiizilj.LIZIZ((Class)G6B.class);
        }
        return null;
    }
    
    public final void LIZ(final 1eV 1eV) {
        CTM.LIZ((Object)1eV);
        final IPublicScreenService publicScreenService = 0jR.LIZ(IPublicScreenService.class);
        if (publicScreenService != null) {
            publicScreenService.updateModel(this.LIZ, 1eV);
        }
    }
    
    public final void LIZ(final 2Gk<? extends H31> 2Gk, final 10b 10b) {
        CTM.LIZ((Object)10b);
        this.LJIJI.LIZ(2Gk, 10b);
    }
    
    public final void LIZ(final TextView textView) {
        CTM.LIZ((Object)textView);
        if (0jR.LIZ(IPublicScreenService.class).textDropShadow(this.LJIIL)) {
            final Context context = textView.getContext();
            n.LIZIZ((Object)context, "");
            final float dimension = context.getResources().getDimension(2131166237);
            final Context context2 = textView.getContext();
            n.LIZIZ((Object)context2, "");
            textView.setShadowLayer(dimension, 0.0f, context2.getResources().getDimension(2131166238), 06x.LIZJ(textView.getContext(), 2131100877));
            return;
        }
        textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
    }
    
    public final void LIZ(final ChatMessage chatMessage, final 1eV 1eV) {
        CTM.LIZ((Object)chatMessage, (Object)1eV);
        this.LJIJI.LIZ(chatMessage, 1eV);
    }
    
    public final long LIZIZ() {
        if (this.LJIJJ == 0L) {
            final User liz = this.LIZ();
            long ljijj;
            if (liz != null) {
                ljijj = liz.getId();
            }
            else {
                final GIK liziz = Fk2.LIZ().LIZIZ();
                n.LIZIZ((Object)liziz, "");
                ljijj = liziz.LIZJ();
            }
            this.LJIJJ = ljijj;
        }
        return this.LJIJJ;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof 10r) {
                final 10r 10r = (10r)o;
                if (n.LIZ((Object)this.LJIIIZ, (Object)10r.LJIIIZ) && n.LIZ((Object)this.LJIIJ, (Object)10r.LJIIJ) && this.LJIIJJI == 10r.LJIIJJI && this.LJIIL == 10r.LJIIL && this.LJIILIIL == 10r.LJIILIIL && this.LJIILJJIL == 10r.LJIILJJIL && n.LIZ((Object)this.LJIILL, (Object)10r.LJIILL) && n.LIZ((Object)this.LJIILLIIL, (Object)10r.LJIILLIIL) && n.LIZ((Object)this.LJIIZILJ, (Object)10r.LJIIZILJ) && n.LIZ((Object)this.LJIJ, (Object)10r.LJIJ) && n.LIZ((Object)this.LJIJI, (Object)10r.LJIJI)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final Context ljiiiz = this.LJIIIZ;
        int hashCode = 0;
        int hashCode2;
        if (ljiiiz != null) {
            hashCode2 = ljiiiz.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final 0CH ljiij = this.LJIIJ;
        int hashCode3;
        if (ljiij != null) {
            hashCode3 = ljiij.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int ljiijji = this.LJIIJJI ? 1 : 0;
        int n = 1;
        int n2 = ljiijji;
        if (ljiijji != 0) {
            n2 = 1;
        }
        int ljiil;
        if ((ljiil = (this.LJIIL ? 1 : 0)) != 0) {
            ljiil = 1;
        }
        int ljiiliil;
        if ((ljiiliil = (this.LJIILIIL ? 1 : 0)) != 0) {
            ljiiliil = 1;
        }
        if (!this.LJIILJJIL) {
            n = 0;
        }
        final Room ljiill = this.LJIILL;
        int hashCode4;
        if (ljiill != null) {
            hashCode4 = ljiill.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final User ljiilliil = this.LJIILLIIL;
        int hashCode5;
        if (ljiilliil != null) {
            hashCode5 = ljiilliil.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final DataChannel ljiizilj = this.LJIIZILJ;
        int hashCode6;
        if (ljiizilj != null) {
            hashCode6 = ljiizilj.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final 10K ljij = this.LJIJ;
        int hashCode7;
        if (ljij != null) {
            hashCode7 = ljij.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final 1eX ljiji = this.LJIJI;
        if (ljiji != null) {
            hashCode = ljiji.hashCode();
        }
        return (((((((((hashCode2 * 31 + hashCode3) * 31 + n2) * 31 + ljiil) * 31 + ljiiliil) * 31 + n) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("PublicScreenContext(context=");
        sb.append(this.LJIIIZ);
        sb.append(", owner=");
        sb.append(this.LJIIJ);
        sb.append(", isRtl=");
        sb.append(this.LJIIJJI);
        sb.append(", isPortrait=");
        sb.append(this.LJIIL);
        sb.append(", isTranslationEnabled=");
        sb.append(this.LJIILIIL);
        sb.append(", isAnchor=");
        sb.append(this.LJIILJJIL);
        sb.append(", room=");
        sb.append(this.LJIILL);
        sb.append(", anchor=");
        sb.append(this.LJIILLIIL);
        sb.append(", dataChannel=");
        sb.append(this.LJIIZILJ);
        sb.append(", publicScreenConfigurationProvider=");
        sb.append(this.LJIJ);
        sb.append(", presenter=");
        sb.append(this.LJIJI);
        sb.append(")");
        return sb.toString();
    }
}
