// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.message.RichChatMessage;

public final class 2Hl extends 2HG<RichChatMessage>
{
    public static final String[] LJIILJJIL;
    public final boolean LJIILL;
    
    static {
        Covode.recordClassIndex(10880);
        LJIILJJIL = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
    }
    
    public 2Hl(final RichChatMessage richChatMessage) {
        super((H31)richChatMessage);
        final boolean b = false;
        int n = 0;
        boolean ljiill;
        while (true) {
            final String[] ljiiljjil = 2Hl.LJIILJJIL;
            ljiill = b;
            if (n >= ljiiljjil.length) {
                break;
            }
            if (TextUtils.equals((CharSequence)ljiiljjil[n], (CharSequence)richChatMessage.LJFF)) {
                ljiill = true;
                break;
            }
            ++n;
        }
        this.LJIILL = ljiill;
    }
    
    @Override
    public final User LIZIZ() {
        return null;
    }
    
    @Override
    public final ImageModel LJ() {
        return ((RichChatMessage)super.LJIILIIL).LIZLLL;
    }
    
    @Override
    public final int LJFF() {
        return ((RichChatMessage)super.LJIILIIL).LJIIJ;
    }
    
    @Override
    public final ImageModel LJI() {
        return ((RichChatMessage)super.LJIILIIL).LJII;
    }
    
    @Override
    public final boolean LJJIIZ() {
        return this.LJIILL;
    }
    
    @Override
    public final void LJJIIZI() {
        FGP.LIZ().LIZ((Object)new 10C((RichChatMessage)super.LJIILIIL));
    }
    
    @Override
    public final String LJJIJ() {
        return ((RichChatMessage)super.LJIILIIL).LIZIZ;
    }
    
    @Override
    public final ImageModel LJJIJIIJI() {
        return ((RichChatMessage)super.LJIILIIL).LJIIIIZZ;
    }
    
    @Override
    public final CharSequence p_() {
        return ((RichChatMessage)super.LJIILIIL).LJIIIZ;
    }
}
