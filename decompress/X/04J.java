// 
// Decompiled by Procyon v0.6.0
// 

package X;

import androidx.core.g.t;
import android.util.AttributeSet;
import android.os.Build$VERSION;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import android.view.View;

public class 04J
{
    public final View LIZ;
    public final 04M LIZIZ;
    public int LIZJ;
    public 042 LIZLLL;
    public 042 LJ;
    public 042 LJFF;
    
    static {
        Covode.recordClassIndex(521);
    }
    
    public 04J(final View liz) {
        this.LIZJ = -1;
        this.LIZ = liz;
        this.LIZIZ = 04M.LIZIZ();
    }
    
    private boolean LIZ(final Drawable drawable) {
        if (this.LJFF == null) {
            this.LJFF = new 042();
        }
        final 042 ljff = this.LJFF;
        ljff.LIZ();
        final ColorStateList backgroundTintList = this.LIZ.getBackgroundTintList();
        if (backgroundTintList != null) {
            ljff.LIZLLL = true;
            ljff.LIZ = backgroundTintList;
        }
        final PorterDuff$Mode backgroundTintMode = this.LIZ.getBackgroundTintMode();
        if (backgroundTintMode != null) {
            ljff.LIZJ = true;
            ljff.LIZIZ = backgroundTintMode;
        }
        if (ljff.LIZLLL || ljff.LIZJ) {
            03r.LIZ(drawable, ljff, this.LIZ.getDrawableState());
            return true;
        }
        return false;
    }
    
    private void LIZIZ(final ColorStateList liz) {
        if (liz != null) {
            if (this.LIZLLL == null) {
                this.LIZLLL = new 042();
            }
            this.LIZLLL.LIZ = liz;
            this.LIZLLL.LIZLLL = true;
        }
        else {
            this.LIZLLL = null;
        }
        this.LIZLLL();
    }
    
    private boolean LJ() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT > 21) {
            return this.LIZLLL != null;
        }
        return sdk_INT == 21;
    }
    
    public final void LIZ() {
        this.LIZJ = -1;
        this.LIZIZ(null);
        this.LIZLLL();
    }
    
    public final void LIZ(final int lizj) {
        this.LIZJ = lizj;
        final 04M liziz = this.LIZIZ;
        ColorStateList lizj2;
        if (liziz != null) {
            lizj2 = liziz.LIZJ(this.LIZ.getContext(), lizj);
        }
        else {
            lizj2 = null;
        }
        this.LIZIZ(lizj2);
        this.LIZLLL();
    }
    
    public final void LIZ(final ColorStateList liz) {
        if (this.LJ == null) {
            this.LJ = new 042();
        }
        this.LJ.LIZ = liz;
        this.LJ.LIZLLL = true;
        this.LIZLLL();
    }
    
    public final void LIZ(final PorterDuff$Mode liziz) {
        if (this.LJ == null) {
            this.LJ = new 042();
        }
        this.LJ.LIZIZ = liziz;
        this.LJ.LIZJ = true;
        this.LIZLLL();
    }
    
    public final void LIZ(AttributeSet liz, final int n) {
        liz = (AttributeSet)043.LIZ(this.LIZ.getContext(), liz, new int[] { 16842964, 2130969090, 2130969091 }, n, 0);
        try {
            if (((043)liz).LJFF(0)) {
                this.LIZJ = ((043)liz).LJFF(0, -1);
                final ColorStateList lizj = this.LIZIZ.LIZJ(this.LIZ.getContext(), this.LIZJ);
                if (lizj != null) {
                    this.LIZIZ(lizj);
                }
            }
            if (((043)liz).LJFF(1)) {
                t.LIZ(this.LIZ, ((043)liz).LJ(1));
            }
            if (((043)liz).LJFF(2)) {
                t.LIZ(this.LIZ, 04a.LIZ(((043)liz).LIZ(2, -1), null));
            }
        }
        finally {
            ((043)liz).LIZ.recycle();
        }
    }
    
    public final ColorStateList LIZIZ() {
        final 042 lj = this.LJ;
        if (lj != null) {
            return lj.LIZ;
        }
        return null;
    }
    
    public final PorterDuff$Mode LIZJ() {
        final 042 lj = this.LJ;
        if (lj != null) {
            return lj.LIZIZ;
        }
        return null;
    }
    
    public final void LIZLLL() {
        final Drawable background = this.LIZ.getBackground();
        if (background != null) {
            if (this.LJ() && this.LIZ(background)) {
                return;
            }
            final 042 lj = this.LJ;
            if (lj != null) {
                03r.LIZ(background, lj, this.LIZ.getDrawableState());
                return;
            }
            final 042 lizlll = this.LIZLLL;
            if (lizlll != null) {
                03r.LIZ(background, lizlll, this.LIZ.getDrawableState());
            }
        }
    }
}
