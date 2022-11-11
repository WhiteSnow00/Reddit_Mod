// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$LayoutParams;
import kotlin.jvm.internal.n;
import java.util.Objects;
import com.bytedance.covode.number.Covode;
import android.widget.FrameLayout$LayoutParams;

public final class 0nh implements Runnable
{
    public final /* synthetic */ 0nk LIZ;
    public final /* synthetic */ FrameLayout$LayoutParams LIZIZ;
    
    static {
        Covode.recordClassIndex(7929);
    }
    
    public 0nh(final 0nk liz, final FrameLayout$LayoutParams liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    @Override
    public final void run() {
        final 1ib 1ib = (1ib)this.LIZ.LIZ(2131364342);
        ViewGroup$LayoutParams layoutParams;
        if (1ib != null) {
            layoutParams = 1ib.getLayoutParams();
        }
        else {
            layoutParams = null;
        }
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        final FrameLayout$LayoutParams layoutParams2 = (FrameLayout$LayoutParams)layoutParams;
        final int leftMargin = this.LIZIZ.leftMargin;
        final int liz = 0cB.LIZ(8.0f);
        final 1ib 1ib2 = (1ib)this.LIZ.LIZ(2131364342);
        n.LIZIZ((Object)1ib2, "");
        layoutParams2.leftMargin = leftMargin - liz - 1ib2.getWidth();
        final 1ib 1ib3 = (1ib)this.LIZ.LIZ(2131364342);
        n.LIZIZ((Object)1ib3, "");
        1ib3.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
    }
}
