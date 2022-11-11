// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.message.ScreenMessage;

public final class 2Hb extends 2Gk<ScreenMessage>
{
    static {
        Covode.recordClassIndex(10881);
    }
    
    public 2Hb(final ScreenMessage screenMessage) {
        super((H31)screenMessage);
    }
    
    @Override
    public final User LIZIZ() {
        return ((ScreenMessage)super.LJIILIIL).LIZJ;
    }
    
    @Override
    public final CharSequence p_() {
        final int liz = 0jR.LIZ(IPublicScreenService.class).getTextMessageConfig().LIZ();
        0jR.LIZ(IPublicScreenService.class).getTextMessageConfig();
        return (CharSequence)11M.LIZIZ(((ScreenMessage)super.LJIILIIL).LIZJ, "\uff1a", ((ScreenMessage)super.LJIILIIL).LIZIZ, liz, 2131100831, (HYY)this);
    }
}
