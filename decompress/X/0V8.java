// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;

public final class 0v8 implements Runnable
{
    public final /* synthetic */ 26P LIZ;
    
    static {
        Covode.recordClassIndex(9618);
    }
    
    public 0v8(final 26P liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void run() {
        final ViewGroup lizj = this.LIZ.LIZJ;
        final ConstraintLayout.a a = null;
        while (true) {
            Label_0051: {
                if (lizj == null) {
                    break Label_0051;
                }
                final View viewById = ((View)lizj).findViewById(2131363034);
                if (viewById == null) {
                    break Label_0051;
                }
                final Object layoutParams = viewById.getLayoutParams();
                Object o = layoutParams;
                if (!(layoutParams instanceof ConstraintLayout.a)) {
                    o = null;
                }
                final ConstraintLayout.a layoutParams2 = (ConstraintLayout.a)o;
                if (layoutParams2 == null) {
                    return;
                }
                layoutParams2.height = LIK.LIZ(this.LIZ.LJIIJ() * 0.10098522167487685);
                final ViewGroup lizj2 = this.LIZ.LIZJ;
                if (lizj2 != null) {
                    final View viewById2 = ((View)lizj2).findViewById(2131363034);
                    if (viewById2 != null) {
                        viewById2.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                    }
                }
                final 26P liz = this.LIZ;
                final int liz2 = LIK.LIZ(liz.LJIIJ() * 0.1921182266009852);
                final ViewGroup lizj3 = liz.LIZJ;
                while (true) {
                    Label_0428: {
                        if (lizj3 == null) {
                            break Label_0428;
                        }
                        final FrameLayout frameLayout = (FrameLayout)((View)lizj3).findViewById(2131369362);
                        if (frameLayout == null) {
                            break Label_0428;
                        }
                        final ViewGroup$LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                        Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                        final ConstraintLayout.a layoutParams4 = (ConstraintLayout.a)layoutParams3;
                        layoutParams4.width = LIK.LIZ(liz.LJIIJJI() * 0.2660164043449346);
                        layoutParams4.height = liz2;
                        layoutParams4.bottomMargin = (int)(liz.LJIIJ() * 0.007389162561576354);
                        layoutParams4.rightMargin = (int)(liz.LJIIJJI() * 0.017734426956328972);
                        final ViewGroup lizj4 = liz.LIZJ;
                        if (lizj4 != null) {
                            final FrameLayout frameLayout2 = (FrameLayout)((View)lizj4).findViewById(2131369362);
                            if (frameLayout2 != null) {
                                frameLayout2.setLayoutParams((ViewGroup$LayoutParams)layoutParams4);
                            }
                        }
                        final ViewGroup lizj5 = liz.LIZJ;
                        while (true) {
                            Label_0423: {
                                if (lizj5 == null) {
                                    break Label_0423;
                                }
                                final FrameLayout frameLayout3 = (FrameLayout)((View)lizj5).findViewById(2131369361);
                                if (frameLayout3 == null) {
                                    break Label_0423;
                                }
                                final ViewGroup$LayoutParams layoutParams5 = frameLayout3.getLayoutParams();
                                Objects.requireNonNull(layoutParams5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                final ConstraintLayout.a layoutParams6 = (ConstraintLayout.a)layoutParams5;
                                layoutParams6.height = liz2;
                                layoutParams6.bottomMargin = (int)(liz.LJIIJ() * 0.007389162561576354);
                                final ViewGroup lizj6 = liz.LIZJ;
                                if (lizj6 != null) {
                                    final FrameLayout frameLayout4 = (FrameLayout)((View)lizj6).findViewById(2131369361);
                                    if (frameLayout4 != null) {
                                        frameLayout4.setLayoutParams((ViewGroup$LayoutParams)layoutParams6);
                                    }
                                }
                                final ViewGroup lizj7 = liz.LIZJ;
                                Object layoutParams7 = a;
                                if (lizj7 != null) {
                                    final FrameLayout frameLayout5 = (FrameLayout)((View)lizj7).findViewById(2131369360);
                                    layoutParams7 = a;
                                    if (frameLayout5 != null) {
                                        layoutParams7 = frameLayout5.getLayoutParams();
                                    }
                                }
                                Objects.requireNonNull(layoutParams7, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                final ConstraintLayout.a layoutParams8 = (ConstraintLayout.a)layoutParams7;
                                layoutParams8.height = liz2;
                                final ViewGroup lizj8 = liz.LIZJ;
                                if (lizj8 != null) {
                                    final FrameLayout frameLayout6 = (FrameLayout)((View)lizj8).findViewById(2131369360);
                                    if (frameLayout6 != null) {
                                        frameLayout6.setLayoutParams((ViewGroup$LayoutParams)layoutParams8);
                                    }
                                }
                                return;
                            }
                            final ViewGroup$LayoutParams layoutParams5 = null;
                            continue;
                        }
                    }
                    final ViewGroup$LayoutParams layoutParams3 = null;
                    continue;
                }
            }
            final Object layoutParams = null;
            continue;
        }
    }
}
