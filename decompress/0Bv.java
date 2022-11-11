// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.DialogInterface$OnDismissListener;
import android.app.Dialog;
import android.content.DialogInterface$OnClickListener;
import android.text.TextUtils;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 0bv
{
    static {
        Covode.recordClassIndex(5681);
    }
    
    public static void LIZ(final Context context, final Throwable t, final String s) {
        if (t instanceof 1Ev) {
            final 1Ev 1Ev = (1Ev)t;
            if (1Ev.getErrorCode() != 20006) {
                final String prompt = 1Ev.getPrompt();
                final String alert = 1Ev.getAlert();
                if (!TextUtils.isEmpty((CharSequence)alert)) {
                    final String string = context.getResources().getString(2131835694);
                    final Ht9 ht9 = new Ht9(context);
                    ht9.LIZ = context.getResources().getString(2131835712);
                    ht9.LIZIZ = alert;
                    ht9.LIZ((CharSequence)string, (DialogInterface$OnClickListener)null, false);
                    ht9.LJFF = (DialogInterface$OnDismissListener)new 0bw(null);
                    final HtA liz = ht9.LIZ();
                    ((0eC)liz).show();
                    KN6.LIZ.LIZ((Dialog)liz);
                    return;
                }
                if (!TextUtils.isEmpty((CharSequence)prompt)) {
                    Hf4.LIZ(context, prompt, 0L);
                    return;
                }
                Hf4.LIZ(context, s, 0L);
                return;
            }
        }
        Hf4.LIZ(context, s, 0L);
    }
    
    public static boolean LIZ(final Exception ex) {
        return ex instanceof 1Ev && ((0VX)ex).getErrorCode() == 20047;
    }
}
