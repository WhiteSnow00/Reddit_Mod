// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import android.graphics.drawable.Drawable$Callback;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.bytedance.covode.number.Covode;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;

public final class 13c extends 04S
{
    public final SeekBar LIZIZ;
    public Drawable LIZJ;
    public ColorStateList LIZLLL;
    public PorterDuff$Mode LJ;
    public boolean LJFF;
    public boolean LJI;
    
    static {
        Covode.recordClassIndex(536);
    }
    
    public 13c(final SeekBar liziz) {
        super((ProgressBar)liziz);
        this.LIZIZ = liziz;
    }
    
    private void LIZ() {
        final Drawable lizj = this.LIZJ;
        if (lizj != null && (this.LJFF || this.LJI)) {
            final Drawable liziz = 08U.LIZIZ(lizj.mutate());
            this.LIZJ = liziz;
            if (this.LJFF) {
                liziz.setTintList(this.LIZLLL);
            }
            if (this.LJI) {
                this.LIZJ.setTintMode(this.LJ);
            }
            if (this.LIZJ.isStateful()) {
                this.LIZJ.setState(this.LIZIZ.getDrawableState());
            }
        }
    }
    
    @Override
    public final void LIZ(final AttributeSet set, final int n) {
        super.LIZ(set, n);
        final 043 liz = 043.LIZ(this.LIZIZ.getContext(), set, new int[] { 16843074, 2130971238, 2130971239, 2130971240 }, n, 0);
        final Drawable liziz = liz.LIZIZ(0);
        if (liziz != null) {
            this.LIZIZ.setThumb(liziz);
        }
        final Drawable liz2 = liz.LIZ(1);
        final Drawable lizj = this.LIZJ;
        if (lizj != null) {
            lizj.setCallback((Drawable$Callback)null);
        }
        if ((this.LIZJ = liz2) != null) {
            liz2.setCallback((Drawable$Callback)this.LIZIZ);
            08U.LIZIZ(liz2, ((View)this.LIZIZ).getLayoutDirection());
            if (liz2.isStateful()) {
                liz2.setState(this.LIZIZ.getDrawableState());
            }
            this.LIZ();
        }
        this.LIZIZ.invalidate();
        if (liz.LJFF(3)) {
            this.LJ = 04a.LIZ(liz.LIZ(3, -1), this.LJ);
            this.LJI = true;
        }
        if (liz.LJFF(2)) {
            this.LIZLLL = liz.LJ(2);
            this.LJFF = true;
        }
        liz.LIZ.recycle();
        this.LIZ();
    }
}
