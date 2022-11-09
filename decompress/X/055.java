// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Outline;
import android.graphics.ColorFilter;
import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;
import android.graphics.PorterDuff$Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Paint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

public final class 055 extends Drawable
{
    public float LIZ;
    public float LIZIZ;
    public ColorStateList LIZJ;
    public final Paint LIZLLL;
    public final RectF LJ;
    public final Rect LJFF;
    public boolean LJI;
    public boolean LJII;
    public PorterDuffColorFilter LJIIIIZZ;
    public ColorStateList LJIIIZ;
    public PorterDuff$Mode LJIIJ;
    
    static {
        Covode.recordClassIndex(594);
    }
    
    public 055(final ColorStateList list, final float liz) {
        this.LJII = true;
        this.LJIIJ = PorterDuff$Mode.SRC_IN;
        this.LIZ = liz;
        this.LIZLLL = new Paint(5);
        this.LIZ(list);
        this.LJ = new RectF();
        this.LJFF = new Rect();
    }
    
    private PorterDuffColorFilter LIZ(final ColorStateList list, final PorterDuff$Mode porterDuff$Mode) {
        if (list == null || porterDuff$Mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(list.getColorForState(this.getState(), 0), porterDuff$Mode);
    }
    
    public final void LIZ(final float liziz, final boolean lji, final boolean ljii) {
        if (liziz == this.LIZIZ && this.LJI == lji && this.LJII == ljii) {
            return;
        }
        this.LIZIZ = liziz;
        this.LJI = lji;
        this.LJII = ljii;
        this.LIZ((Rect)null);
        this.invalidateSelf();
    }
    
    public final void LIZ(final ColorStateList list) {
        ColorStateList value = list;
        if (list == null) {
            value = ColorStateList.valueOf(0);
        }
        this.LIZJ = value;
        this.LIZLLL.setColor(value.getColorForState(this.getState(), this.LIZJ.getDefaultColor()));
    }
    
    public final void LIZ(final Rect rect) {
        Rect bounds = rect;
        if (rect == null) {
            bounds = this.getBounds();
        }
        this.LJ.set((float)bounds.left, (float)bounds.top, (float)bounds.right, (float)bounds.bottom);
        this.LJFF.set(bounds);
        if (this.LJI) {
            this.LJFF.inset((int)Math.ceil(056.LIZIZ(this.LIZIZ, this.LIZ, this.LJII)), (int)Math.ceil(056.LIZ(this.LIZIZ, this.LIZ, this.LJII)));
            this.LJ.set(this.LJFF);
        }
    }
    
    public final void draw(final Canvas canvas) {
        final Paint lizlll = this.LIZLLL;
        int n;
        if (this.LJIIIIZZ != null && lizlll.getColorFilter() == null) {
            lizlll.setColorFilter((ColorFilter)this.LJIIIIZZ);
            n = 1;
        }
        else {
            n = 0;
        }
        final RectF lj = this.LJ;
        final float liz = this.LIZ;
        canvas.drawRoundRect(lj, liz, liz, lizlll);
        if (n != 0) {
            lizlll.setColorFilter((ColorFilter)null);
        }
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    public final void getOutline(final Outline outline) {
        outline.setRoundRect(this.LJFF, this.LIZ);
    }
    
    public final boolean isStateful() {
        final ColorStateList ljiiiz = this.LJIIIZ;
        if (ljiiiz == null || !ljiiiz.isStateful()) {
            final ColorStateList lizj = this.LIZJ;
            if ((lizj == null || !lizj.isStateful()) && !super.isStateful()) {
                return false;
            }
        }
        return true;
    }
    
    public final void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        this.LIZ(rect);
    }
    
    public final boolean onStateChange(final int[] array) {
        final ColorStateList lizj = this.LIZJ;
        final int colorForState = lizj.getColorForState(array, lizj.getDefaultColor());
        boolean b;
        if (colorForState != this.LIZLLL.getColor()) {
            b = true;
            this.LIZLLL.setColor(colorForState);
        }
        else {
            b = false;
        }
        final ColorStateList ljiiiz = this.LJIIIZ;
        if (ljiiiz != null) {
            final PorterDuff$Mode ljiij = this.LJIIJ;
            if (ljiij != null) {
                this.LJIIIIZZ = this.LIZ(ljiiiz, ljiij);
                return true;
            }
        }
        return b;
    }
    
    public final void setAlpha(final int alpha) {
        this.LIZLLL.setAlpha(alpha);
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.LIZLLL.setColorFilter(colorFilter);
    }
    
    public final void setTintList(final ColorStateList ljiiiz) {
        this.LJIIIZ = ljiiiz;
        this.LJIIIIZZ = this.LIZ(ljiiiz, this.LJIIJ);
        this.invalidateSelf();
    }
    
    public final void setTintMode(final PorterDuff$Mode ljiij) {
        this.LJIIJ = ljiij;
        this.LJIIIIZZ = this.LIZ(this.LJIIIZ, ljiij);
        this.invalidateSelf();
    }
}
