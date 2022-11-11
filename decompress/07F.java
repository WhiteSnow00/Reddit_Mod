// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.Html;
import android.os.Build$VERSION;
import android.text.Spanned;
import com.bytedance.covode.number.Covode;

public final class 07F
{
    static {
        Covode.recordClassIndex(780);
    }
    
    public static Spanned LIZ(final String s, final int n) {
        if (Build$VERSION.SDK_INT >= 24) {
            return Html.fromHtml(s, n);
        }
        return Html.fromHtml(s);
    }
}
