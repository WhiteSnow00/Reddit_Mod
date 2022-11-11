// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.TypedArray;
import android.content.res.Resources$NotFoundException;
import android.util.AttributeSet;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import android.widget.CompoundButton;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;

public final class 04L
{
    public ColorStateList LIZ;
    public PorterDuff$Mode LIZIZ;
    public final CompoundButton LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    
    static {
        Covode.recordClassIndex(524);
    }
    
    public 04L(final CompoundButton lizj) {
        this.LIZJ = lizj;
    }
    
    private void LIZIZ() {
        final Drawable liz = 08j.LIZ(this.LIZJ);
        if (liz != null && (this.LIZLLL || this.LJ)) {
            final Drawable mutate = 08U.LIZIZ(liz).mutate();
            if (this.LIZLLL) {
                mutate.setTintList(this.LIZ);
            }
            if (this.LJ) {
                mutate.setTintMode(this.LIZIZ);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.LIZJ.getDrawableState());
            }
            this.LIZJ.setButtonDrawable(mutate);
        }
    }
    
    public final void LIZ() {
        if (this.LJFF) {
            this.LJFF = false;
            return;
        }
        this.LJFF = true;
        this.LIZIZ();
    }
    
    public final void LIZ(final ColorStateList liz) {
        this.LIZ = liz;
        this.LIZLLL = true;
        this.LIZIZ();
    }
    
    public final void LIZ(final PorterDuff$Mode liziz) {
        this.LIZIZ = liziz;
        this.LJ = true;
        this.LIZIZ();
    }
    
    public final void LIZ(AttributeSet obtainStyledAttributes, int n) {
        obtainStyledAttributes = (AttributeSet)this.LIZJ.getContext().obtainStyledAttributes(obtainStyledAttributes, new int[] { 16843015, 2130969184, 2130969194, 2130969195 }, n, 0);
        try {
            Label_0113: {
                if (((TypedArray)obtainStyledAttributes).hasValue(1)) {
                    n = ((TypedArray)obtainStyledAttributes).getResourceId(1, 0);
                    if (n != 0) {
                        try {
                            final CompoundButton lizj = this.LIZJ;
                            lizj.setButtonDrawable(01s.LIZIZ(lizj.getContext(), n));
                            break Label_0113;
                        }
                        catch (final Resources$NotFoundException ex) {}
                    }
                }
                if (((TypedArray)obtainStyledAttributes).hasValue(0)) {
                    n = ((TypedArray)obtainStyledAttributes).getResourceId(0, 0);
                    if (n != 0) {
                        final CompoundButton lizj2 = this.LIZJ;
                        lizj2.setButtonDrawable(01s.LIZIZ(lizj2.getContext(), n));
                    }
                }
            }
            if (((TypedArray)obtainStyledAttributes).hasValue(2)) {
                this.LIZJ.setButtonTintList(((TypedArray)obtainStyledAttributes).getColorStateList(2));
            }
            if (((TypedArray)obtainStyledAttributes).hasValue(3)) {
                this.LIZJ.setButtonTintMode(04a.LIZ(((TypedArray)obtainStyledAttributes).getInt(3, -1), null));
            }
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
}
