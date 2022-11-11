// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.style.ForegroundColorSpan;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import kotlin.n.z;
import kotlin.jvm.internal.n;
import java.util.Arrays;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.covode.number.Covode;

public final class 2Hf extends 2Ha
{
    static {
        Covode.recordClassIndex(10842);
    }
    
    public 2Hf(final RoomMessage roomMessage) {
        CTM.LIZ((Object)roomMessage);
        super(roomMessage);
    }
    
    @Override
    public final CharSequence p_() {
        int n;
        if (0jR.LIZ(IPublicScreenService.class).getTextMessageConfig() != null) {
            n = 2131100831;
        }
        else {
            n = -16777216;
        }
        String s;
        if (this.LJJIJL()) {
            s = 0cB.LIZ(2131832141);
        }
        else {
            s = 0cB.LIZ(2131832143);
        }
        String s2 = s;
        if (s == null) {
            s2 = "";
        }
        String liz;
        if ((liz = 0cB.LIZ(2131832142)) == null) {
            liz = "";
        }
        final String liz2 = 0II.LIZ(liz, Arrays.copyOf(new Object[] { s2 }, 1));
        kotlin.jvm.internal.n.LIZIZ((Object)liz2, "");
        final int liz3 = z.LIZ((CharSequence)liz2, s2, 0, false, 6);
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)liz2);
        0fd.LIZ((Spannable)spannableStringBuilder, liz3, s2.length() + liz3, 18, 700);
        spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(0cB.LIZIZ(n)), 0, spannableStringBuilder.length(), 33);
        return (CharSequence)spannableStringBuilder;
    }
}
