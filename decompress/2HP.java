// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import android.text.SpannableString;
import android.text.TextUtils;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.covode.number.Covode;

public final class 2Hp extends 2Hn
{
    static {
        Covode.recordClassIndex(10755);
    }
    
    public 2Hp(final ChatMessage chatMessage) {
        super(chatMessage);
    }
    
    @Override
    public final boolean LJIL() {
        return true;
    }
    
    @Override
    public final SpannableStringBuilder LJJIIZ() {
        0jR.LIZ(IPublicScreenService.class).getTextMessageConfig();
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        final User lizj = ((ChatMessage)super.LJIILIIL).LIZJ;
        final String liz = 0et.LIZ(((ChatMessage)super.LJIILIIL).LIZIZ);
        Object liz2;
        if (lizj == null || TextUtils.isEmpty((CharSequence)0W3.LIZ(lizj)) || TextUtils.isEmpty((CharSequence)0W3.LIZ(lizj)) || TextUtils.isEmpty((CharSequence)liz)) {
            liz2 = HYW.LIZ;
        }
        else {
            final GG1 liziz = this.LIZIZ(lizj, 11M.LIZ(2131100830));
            liz2 = new SpannableString((CharSequence)liz);
            ((Spannable)liz2).setSpan((Object)liziz, 0, liz.length(), 33);
        }
        spannableStringBuilder.append((CharSequence)liz2);
        return spannableStringBuilder;
    }
    
    @Override
    public final boolean LJJIIZI() {
        return false;
    }
    
    @Override
    public final boolean LJJJJ() {
        return false;
    }
}
