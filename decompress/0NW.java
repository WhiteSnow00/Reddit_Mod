// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import android.text.style.ForegroundColorSpan;
import android.graphics.Color;
import kotlin.n.y;
import kotlin.n.z;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePromptElem;
import java.util.List;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattlePrompt;
import android.text.TextUtils$TruncateAt;
import android.text.style.AbsoluteSizeSpan;
import android.text.TextUtils;
import android.text.SpannableStringBuilder;
import com.bytedance.covode.number.Covode;

public final class 0nW
{
    public static final 0nW LIZ;
    
    static {
        Covode.recordClassIndex(7907);
        LIZ = new 0nW();
    }
    
    public static final SpannableStringBuilder LIZ(final 1xz 1xz, final SpannableStringBuilder spannableStringBuilder, final boolean b) {
        CTM.LIZ((Object)1xz, (Object)spannableStringBuilder);
        if (TextUtils.isEmpty((CharSequence)spannableStringBuilder)) {
            return new SpannableStringBuilder((CharSequence)"");
        }
        if (b) {
            spannableStringBuilder.setSpan((Object)new AbsoluteSizeSpan(11, true), 0, spannableStringBuilder.length(), 34);
            int gravity = 19;
            if (Ghp.LIZ(1xz.getContext())) {
                gravity = 21;
            }
            1xz.setGravity(gravity);
            1xz.LIZ = false;
            1xz.setEllipsize(TextUtils$TruncateAt.MARQUEE);
            1xz.setSelected(true);
            1xz.setFocusable(true);
            1xz.setFocusableInTouchMode(true);
        }
        else {
            spannableStringBuilder.setSpan((Object)new AbsoluteSizeSpan(13, true), 0, spannableStringBuilder.length(), 34);
            1xz.setGravity(17);
            1xz.LIZ();
        }
        return spannableStringBuilder;
    }
    
    public static final SpannableStringBuilder LIZ(final BattlePrompt battlePrompt) {
        if (battlePrompt == null || TextUtils.isEmpty((CharSequence)battlePrompt.LIZ)) {
            return new SpannableStringBuilder((CharSequence)"");
        }
        final String liz = battlePrompt.LIZ;
        Object o;
        if ((o = battlePrompt.LIZIZ) == null) {
            o = 6uH.INSTANCE;
        }
        final 0nW liz2 = 0nW.LIZ;
        String liz3;
        if ((liz3 = VR3.LIZ().LIZ(liz)) == null) {
            liz3 = "";
        }
        final String liz4 = liz2.LIZ(liz3, (List<BattlePromptElem>)o);
        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty((CharSequence)liz4)) {
            final int liz5 = z.LIZ((CharSequence)liz4, "{", 0, false, 6);
            final int liz6 = z.LIZ((CharSequence)liz4, "}", 0, false, 6);
            String liz7 = liz4;
            if (z.LJ((CharSequence)liz4, (CharSequence)"{")) {
                liz7 = liz4;
                if (z.LJ((CharSequence)liz4, (CharSequence)"}")) {
                    liz7 = y.LIZ(y.LIZ(liz4, "{", ""), "}", "");
                }
            }
            spannableStringBuilder.append((CharSequence)liz7);
            if (liz5 >= 0 && liz6 > liz5) {
                spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(Color.parseColor("#FACE15")), liz5, liz6 - 1, 34);
            }
        }
        return spannableStringBuilder;
    }
    
    private final String LIZ(String liz, final List<BattlePromptElem> list) {
        String s = liz;
        if (z.LIZ((CharSequence)liz, (CharSequence)"<", false)) {
            s = liz;
            if (z.LIZ((CharSequence)liz, (CharSequence)">", false)) {
                final Iterator<BattlePromptElem> iterator = list.iterator();
                while (true) {
                    s = liz;
                    if (!iterator.hasNext()) {
                        break;
                    }
                    final BattlePromptElem battlePromptElem = iterator.next();
                    if (TextUtils.isEmpty((CharSequence)battlePromptElem.LIZ)) {
                        continue;
                    }
                    final StringBuilder sb = new StringBuilder("<");
                    sb.append(battlePromptElem.LIZ);
                    sb.append('>');
                    if (!z.LJ((CharSequence)liz, (CharSequence)sb.toString())) {
                        continue;
                    }
                    if (battlePromptElem.LIZ == null) {
                        throw new IllegalArgumentException(2P9.LIZ.toString());
                    }
                    final StringBuilder sb2 = new StringBuilder("<");
                    sb2.append(battlePromptElem.LIZ);
                    sb2.append('>');
                    final String string = sb2.toString();
                    String liziz;
                    if ((liziz = battlePromptElem.LIZIZ) == null) {
                        liziz = "";
                    }
                    liz = y.LIZ(liz, string, liziz);
                }
            }
        }
        return s;
    }
}
