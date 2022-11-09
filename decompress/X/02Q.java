// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Rect;
import android.view.View;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.Locale;
import android.text.method.TransformationMethod;

public final class 02Q implements TransformationMethod
{
    public Locale LIZ;
    
    static {
        Covode.recordClassIndex(316);
    }
    
    public 02Q(final Context context) {
        this.LIZ = context.getResources().getConfiguration().locale;
    }
    
    public final CharSequence getTransformation(final CharSequence charSequence, final View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.LIZ);
        }
        return null;
    }
    
    public final void onFocusChanged(final View view, final CharSequence charSequence, final boolean b, final int n, final Rect rect) {
    }
}
