// 
// Decompiled by Procyon v0.6.0
// 

package ff;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import b4.g;

public final class c implements g
{
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetBehavior b;
    
    public c(final BottomSheetBehavior b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public final boolean a(final View view) {
        this.b.F(this.a);
        return true;
    }
}
