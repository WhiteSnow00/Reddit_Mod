// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.style.ForegroundColorSpan;
import java.util.Locale;
import android.text.SpannableString;
import com.bytedance.covode.number.Covode;

public final class 1Oa implements 0lC.a
{
    public static final a LIZIZ;
    public b LIZ;
    public final FH6 LIZJ;
    
    static {
        Covode.recordClassIndex(7301);
        LIZIZ = new a((byte)0);
    }
    
    public 1Oa() {
        this.LIZJ = new FH6();
    }
    
    @Override
    public final void LIZ() {
        final long lizj = 1O2.LIZJ;
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_cancel_connection_popup_click");
        liz.LIZ();
        liz.LIZ("waiting_time", lizj * 1000L);
        liz.LIZ("enter_from", "connection_icon");
        liz.LIZ("invitee_list", 0xg.LIZ(0kf.RANDOM_LINK_MIC_INVITE));
        liz.LIZLLL();
        1O2.LIZ(1O2.b.DISCONNECT);
        final b liz2 = this.LIZ;
        if (liz2 != null) {
            liz2.dismiss();
        }
    }
    
    @Override
    public final void LIZ(final 2fc 2fc) {
        CTM.LIZ((Object)2fc);
        this.LIZJ.LIZ(2fc);
    }
    
    @Override
    public final void LIZIZ() {
        this.LIZJ.LIZ();
        this.LIZ = null;
    }
    
    public static final class a
    {
        static {
            Covode.recordClassIndex(7302);
        }
        
        public final SpannableString LIZ(final 8si<? extends 1O2.g, Long> 8si) {
            CTM.LIZ((Object)8si);
            int n;
            if (8si.getFirst() == 1O2.g.COUNTDOWN_WAITING) {
                n = 2131828970;
            }
            else {
                n = 2131828979;
            }
            final long longValue = ((Number)8si.getSecond()).longValue();
            final String liz = 0II.LIZ(Locale.US, "%02d", new Object[] { longValue / 60L });
            final String liz2 = 0II.LIZ(Locale.US, "%02d", new Object[] { longValue % 60L });
            final String liz3 = 0cB.LIZ(n, liz, liz2);
            final int index = liz3.indexOf(liz);
            int lastIndex = liz3.lastIndexOf(liz2);
            int n3;
            if (index < lastIndex) {
                final int n2 = lastIndex + liz2.length();
                lastIndex = index;
                n3 = n2;
            }
            else {
                n3 = liz.length() + index;
            }
            final 0lM.a a = new 0lM.a(lastIndex, n3);
            final int liz4 = a.LIZ;
            final int liziz = a.LIZIZ;
            final SpannableString spannableString = new SpannableString((CharSequence)liz3);
            if (liz4 >= 0 && liziz >= 0 && liz4 <= liziz) {
                spannableString.setSpan((Object)new ForegroundColorSpan(0cB.LIZIZ(2131100838)), liz4, liziz, 33);
            }
            return spannableString;
        }
    }
}
