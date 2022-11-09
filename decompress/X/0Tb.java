// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;

public final class 0tb implements Runnable
{
    public final /* synthetic */ 25M LIZ;
    
    static {
        Covode.recordClassIndex(9367);
    }
    
    public 0tb(final 25M liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void run() {
        final ViewGroup lizj = this.LIZ.LIZJ;
        if (lizj != null) {
            final FrameLayout frameLayout = (FrameLayout)((View)lizj).findViewById(2131369359);
            if (frameLayout != null) {
                final Integer value = frameLayout.getHeight();
                if (value != null) {
                    final int intValue = value.intValue();
                    final ViewGroup lizj2 = this.LIZ.LIZJ;
                    if (lizj2 != null) {
                        final View viewById = ((View)lizj2).findViewById(2131364437);
                        if (viewById != null) {
                            final ViewGroup$LayoutParams layoutParams = viewById.getLayoutParams();
                            if (layoutParams != null) {
                                layoutParams.width = (int)(intValue * 0.004424778761061947);
                            }
                        }
                    }
                    final ViewGroup lizj3 = this.LIZ.LIZJ;
                    if (lizj3 != null) {
                        final View viewById2 = ((View)lizj3).findViewById(2131364437);
                        if (viewById2 != null) {
                            viewById2.requestLayout();
                        }
                    }
                    final ViewGroup lizj4 = this.LIZ.LIZJ;
                    if (lizj4 != null) {
                        final View viewById3 = ((View)lizj4).findViewById(2131364426);
                        if (viewById3 != null) {
                            final ViewGroup$LayoutParams layoutParams2 = viewById3.getLayoutParams();
                            if (layoutParams2 != null) {
                                layoutParams2.height = (int)(intValue * 0.004424778761061947);
                            }
                        }
                    }
                    final ViewGroup lizj5 = this.LIZ.LIZJ;
                    if (lizj5 != null) {
                        final View viewById4 = ((View)lizj5).findViewById(2131364426);
                        if (viewById4 != null) {
                            viewById4.requestLayout();
                        }
                    }
                    final ViewGroup lizj6 = this.LIZ.LIZJ;
                    if (lizj6 != null) {
                        final View viewById5 = ((View)lizj6).findViewById(2131364427);
                        if (viewById5 != null) {
                            final ViewGroup$LayoutParams layoutParams3 = viewById5.getLayoutParams();
                            if (layoutParams3 != null) {
                                layoutParams3.height = (int)(intValue * 0.004424778761061947);
                            }
                        }
                    }
                    final ViewGroup lizj7 = this.LIZ.LIZJ;
                    if (lizj7 != null) {
                        final View viewById6 = ((View)lizj7).findViewById(2131364427);
                        if (viewById6 != null) {
                            viewById6.requestLayout();
                        }
                    }
                    this.LIZ.LJIIZILJ();
                }
            }
        }
    }
}
