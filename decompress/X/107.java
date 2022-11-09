// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import android.text.TextUtils;
import kotlin.jvm.internal.n;
import java.util.ArrayList;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.live.base.model.user.TextBadge;
import com.bytedance.covode.number.Covode;

public final class 107
{
    static {
        Covode.recordClassIndex(10664);
    }
    
    public static final CharSequence LIZ(final TextBadge textBadge) {
        if (textBadge == null || textBadge.LIZIZ == null) {
            return null;
        }
        final String lizj = textBadge.LIZJ;
        final String liziz = textBadge.LIZIZ;
        int i = 0;
        String s = lizj;
        if (liziz != null) {
            if (liziz.length() == 0) {
                s = lizj;
            }
            else {
                final String liz = VR3.LIZ().LIZ(textBadge.LIZIZ);
                s = lizj;
                if (liz != null) {
                    if (liz.length() == 0) {
                        s = lizj;
                    }
                    else {
                        s = liz;
                    }
                }
            }
        }
        if (s == null || s.length() == 0) {
            return null;
        }
        final Text text = new Text();
        text.LIZ = textBadge.LIZIZ;
        text.LIZIZ = textBadge.LIZJ;
        text.LIZLLL = new ArrayList();
        final List<String> lizlll = textBadge.LIZLLL;
        if (lizlll != null && !lizlll.isEmpty()) {
            final List<String> lizlll2 = textBadge.LIZLLL;
            if (lizlll2 == null) {
                n.LIZIZ();
            }
            while (i < lizlll2.size()) {
                final List<String> lizlll3 = textBadge.LIZLLL;
                if (lizlll3 == null) {
                    n.LIZIZ();
                }
                if (!TextUtils.isEmpty((CharSequence)lizlll3.get(i))) {
                    final List lizlll4 = text.LIZLLL;
                    final TextPiece textPiece = new TextPiece();
                    textPiece.LIZ = HYX.STRING.getPieceType();
                    final List<String> lizlll5 = textBadge.LIZLLL;
                    if (lizlll5 == null) {
                        n.LIZIZ();
                    }
                    textPiece.LIZJ = lizlll5.get(i);
                    lizlll4.add(i, textPiece);
                }
                ++i;
            }
        }
        return (CharSequence)HYW.LIZ(s, text, (HYY)null);
    }
}
