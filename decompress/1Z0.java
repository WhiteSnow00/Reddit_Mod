// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import android.widget.LinearLayout;

public final class 1Z0 implements e
{
    public final /* synthetic */ LinearLayout LIZ;
    
    static {
        Covode.recordClassIndex(9449);
    }
    
    public 1Z0(final LinearLayout liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ(final int n, final float n2, final int n3) {
    }
    
    @Override
    public final void LIZIZ(final int n) {
    }
    
    @Override
    public final void f_(final int n) {
        final LinearLayout liz = this.LIZ;
        n.LIZIZ((Object)liz, "");
        for (int childCount = liz.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.LIZ.getChildAt(i);
            int n2;
            if (i == n) {
                n2 = 2131100574;
            }
            else {
                n2 = 2131100837;
            }
            if (child instanceof 1ib) {
                ((1ib)child).setTextColor(0cB.LIZIZ(n2));
            }
        }
    }
}
