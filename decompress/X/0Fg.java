// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.Spanned;
import com.bytedance.covode.number.Covode;
import android.view.View;
import android.text.InputFilter;

public final class 0fg implements InputFilter
{
    public final View LIZ;
    
    static {
        Covode.recordClassIndex(6115);
    }
    
    public 0fg(final View liz) {
        this.LIZ = liz;
    }
    
    public final CharSequence filter(final CharSequence charSequence, final int n, final int n2, final Spanned spanned, final int n3, final int n4) {
        if (this.LIZ.isInEditMode()) {
            return charSequence;
        }
        CharSequence liz = charSequence;
        if (charSequence instanceof String) {
            liz = 0et.LIZ((String)charSequence);
        }
        return liz;
    }
}
