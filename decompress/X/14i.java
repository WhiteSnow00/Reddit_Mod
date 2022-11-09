// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Outline;
import android.view.Gravity;
import android.graphics.Rect;
import android.graphics.Bitmap;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;

public final class 14i extends 08V
{
    static {
        Covode.recordClassIndex(893);
    }
    
    public 14i(final Resources resources, final Bitmap bitmap) {
        super(resources, bitmap);
    }
    
    @Override
    public final void LIZ(final int n, final int n2, final int n3, final Rect rect, final Rect rect2) {
        Gravity.apply(n, n2, n3, rect, rect2, 0);
    }
    
    public final void getOutline(final Outline outline) {
        this.LIZ();
        outline.setRoundRect(super.LJ, super.LIZLLL);
    }
}
