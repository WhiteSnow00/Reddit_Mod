// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;

public final class 0ud implements Runnable
{
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ 1ZI LIZJ;
    
    static {
        Covode.recordClassIndex(9514);
    }
    
    public 0ud(final int liz, final int liziz, final 1ZI lizj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    @Override
    public final void run() {
        final ViewGroup lizj = this.LIZJ.LIZJ;
        while (true) {
            Label_0138: {
                if (lizj == null) {
                    break Label_0138;
                }
                final View viewById = ((View)lizj).findViewById(2131372473);
                if (viewById == null) {
                    break Label_0138;
                }
                final ViewGroup$LayoutParams layoutParams = viewById.getLayoutParams();
                ViewGroup$LayoutParams layoutParams2;
                if ((layoutParams2 = layoutParams) != null) {
                    final int liz = this.LIZ;
                    int liziz = this.LIZIZ;
                    if (liz > liziz) {
                        liziz = liz;
                    }
                    layoutParams.height = liziz;
                    layoutParams2 = layoutParams;
                }
                final ViewGroup lizj2 = this.LIZJ.LIZJ;
                if (lizj2 != null) {
                    final View viewById2 = ((View)lizj2).findViewById(2131372473);
                    if (viewById2 != null) {
                        viewById2.setLayoutParams(layoutParams2);
                    }
                }
                final ViewGroup lizj3 = this.LIZJ.LIZJ;
                if (lizj3 != null) {
                    final View viewById3 = ((View)lizj3).findViewById(2131372473);
                    if (viewById3 != null && viewById3.getVisibility() == 0) {
                        this.LIZJ.LJIIZILJ();
                        this.LIZJ.LJIILJJIL();
                    }
                }
                return;
            }
            ViewGroup$LayoutParams layoutParams2 = null;
            continue;
        }
    }
}
