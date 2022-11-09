// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.Context;
import android.os.Build$VERSION;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.message.SocialMessage;

public class 2Hc extends 2Gk<SocialMessage>
{
    static {
        Covode.recordClassIndex(10883);
    }
    
    public 2Hc(final SocialMessage socialMessage) {
        super((H31)socialMessage);
    }
    
    @Override
    public final User LIZIZ() {
        return ((SocialMessage)super.LJIILIIL).LIZIZ;
    }
    
    public final boolean LJ() {
        return ((SocialMessage)super.LJIILIIL).LIZ == 3L;
    }
    
    @Override
    public final boolean LJIILLIIL() {
        return !this.LJJIJL() && (this.LJ() || this.LJJIIZ() || ((SocialMessage)super.LJIILIIL).LIZ == 2L);
    }
    
    public final boolean LJJIIZ() {
        return ((SocialMessage)super.LJIILIIL).LIZ == 1L;
    }
    
    @Override
    public final boolean LJJJJ() {
        return this.LJJIIZ() || this.LJ();
    }
    
    @Override
    public final CharSequence p_() {
        final 10q textMessageConfig = 0jR.LIZ(IPublicScreenService.class).getTextMessageConfig();
        int liziz;
        int n;
        if (textMessageConfig == null) {
            liziz = 0;
            n = 0;
        }
        else {
            liziz = textMessageConfig.LIZIZ();
            n = 2131100831;
        }
        final User liziz2 = ((SocialMessage)super.LJIILIIL).LIZIZ;
        final SocialMessage socialMessage = (SocialMessage)super.LJIILIIL;
        String s = "";
        if (socialMessage != null) {
            final Context lj = 0cB.LJ();
            final int n2 = (int)socialMessage.LIZ;
            if (n2 != 1) {
                if (n2 == 3) {
                    if (Build$VERSION.SDK_INT >= 24) {
                        s = 0cB.LIZ(2131836057);
                    }
                    else {
                        s = lj.getResources().getString(2131836057);
                    }
                }
            }
            else if (Build$VERSION.SDK_INT >= 24) {
                s = 0cB.LIZ(2131829761);
            }
            else {
                s = lj.getResources().getString(2131829761);
            }
        }
        return (CharSequence)11M.LIZ(liziz2, " ", s, liziz, n, (HYY)this);
    }
    
    @Override
    public final boolean v_() {
        return this.LJJIIZ() || this.LJ();
    }
    
    @Override
    public final int y_() {
        if (((SocialMessage)super.LJIILIIL).LIZ == 1L || ((SocialMessage)super.LJIILIIL).LIZ == 51L) {
            return 2131234658;
        }
        if (((SocialMessage)super.LJIILIIL).LIZ == 3L) {
            return 2131234702;
        }
        return super.y_();
    }
}
