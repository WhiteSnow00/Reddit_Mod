// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Build$VERSION;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class 045
{
    static {
        Covode.recordClassIndex(506);
    }
    
    public static void LIZ(final View view, final CharSequence tooltipText) {
        if (Build$VERSION.SDK_INT >= 26) {
            view.setTooltipText(tooltipText);
            return;
        }
        048.LIZ(view, tooltipText);
    }
}
