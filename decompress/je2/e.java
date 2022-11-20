// 
// Decompiled by Procyon v0.6.0
// 

package je2;

import android.graphics.RectF;
import com.yalantis.ucrop.view.UCropView;
import fe2.d;

public final class e implements d
{
    public final UCropView f;
    
    public e(final UCropView f) {
        this.f = f;
    }
    
    public final void z(final RectF cropRect) {
        this.f.f.setCropRect(cropRect);
    }
}
