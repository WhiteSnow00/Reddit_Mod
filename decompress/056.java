// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.RadialGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Path$FillType;
import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Paint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

public final class 056 extends Drawable
{
    public static final double LJFF;
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;
    public ColorStateList LIZLLL;
    public boolean LJ;
    public final int LJI;
    public Paint LJII;
    public Paint LJIIIIZZ;
    public Paint LJIIIZ;
    public final RectF LJIIJ;
    public Path LJIIJJI;
    public float LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public boolean LJIILL;
    
    static {
        Covode.recordClassIndex(595);
        LJFF = Math.cos(Math.toRadians(45.0));
    }
    
    public static float LIZ(final float n, final float n2, final boolean b) {
        if (b) {
            return (float)(n * 1.5f + (1.0 - 056.LJFF) * n2);
        }
        return n * 1.5f;
    }
    
    public static float LIZIZ(final float n, final float n2, final boolean b) {
        float n3 = n;
        if (b) {
            n3 = (float)(n + (1.0 - 056.LJFF) * n2);
        }
        return n3;
    }
    
    public final void draw(final Canvas canvas) {
        if (this.LJ) {
            final Rect bounds = this.getBounds();
            final float n = this.LIZIZ * 1.5f;
            this.LJIIJ.set(bounds.left + this.LIZIZ, bounds.top + n, bounds.right - this.LIZIZ, bounds.bottom - n);
            final float liz = this.LIZ;
            final RectF rectF = new RectF(-liz, -liz, liz, liz);
            final RectF rectF2 = new RectF(rectF);
            final float ljiil = this.LJIIL;
            rectF2.inset(-ljiil, -ljiil);
            final Path ljiijji = this.LJIIJJI;
            if (ljiijji == null) {
                this.LJIIJJI = new Path();
            }
            else {
                ljiijji.reset();
            }
            this.LJIIJJI.setFillType(Path$FillType.EVEN_ODD);
            this.LJIIJJI.moveTo(-this.LIZ, 0.0f);
            this.LJIIJJI.rLineTo(-this.LJIIL, 0.0f);
            this.LJIIJJI.arcTo(rectF2, 180.0f, 90.0f, false);
            this.LJIIJJI.arcTo(rectF, 270.0f, -90.0f, false);
            this.LJIIJJI.close();
            final float liz2 = this.LIZ;
            final float n2 = liz2 / (this.LJIIL + liz2);
            final Paint ljiiiizz = this.LJIIIIZZ;
            final float liz3 = this.LIZ;
            final float ljiil2 = this.LJIIL;
            final int ljiiliil = this.LJIILIIL;
            ljiiiizz.setShader((Shader)new RadialGradient(0.0f, 0.0f, liz3 + ljiil2, new int[] { ljiiliil, ljiiliil, this.LJIILJJIL }, new float[] { 0.0f, n2, 1.0f }, Shader$TileMode.CLAMP));
            final Paint ljiiiz = this.LJIIIZ;
            final float liz4 = this.LIZ;
            final float n3 = -liz4;
            final float ljiil3 = this.LJIIL;
            final float n4 = -liz4;
            final int ljiiliil2 = this.LJIILIIL;
            ljiiiz.setShader((Shader)new LinearGradient(0.0f, n3 + ljiil3, 0.0f, n4 - ljiil3, new int[] { ljiiliil2, ljiiliil2, this.LJIILJJIL }, new float[] { 0.0f, 0.5f, 1.0f }, Shader$TileMode.CLAMP));
            this.LJIIIZ.setAntiAlias(false);
            this.LJ = false;
        }
        canvas.translate(0.0f, this.LIZJ / 2.0f);
        final float liz5 = this.LIZ;
        final float n5 = -liz5 - this.LJIIL;
        final float n6 = liz5 + this.LJI + this.LIZJ / 2.0f;
        final float width = this.LJIIJ.width();
        final float n7 = n6 * 2.0f;
        boolean b;
        if (width - n7 > 0.0f) {
            b = true;
        }
        else {
            b = false;
        }
        boolean b2;
        if (this.LJIIJ.height() - n7 > 0.0f) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        final int save = canvas.save();
        canvas.translate(this.LJIIJ.left + n6, this.LJIIJ.top + n6);
        canvas.drawPath(this.LJIIJJI, this.LJIIIIZZ);
        if (b) {
            canvas.drawRect(0.0f, n5, this.LJIIJ.width() - n7, -this.LIZ, this.LJIIIZ);
        }
        canvas.restoreToCount(save);
        final int save2 = canvas.save();
        canvas.translate(this.LJIIJ.right - n6, this.LJIIJ.bottom - n6);
        canvas.rotate(180.0f);
        canvas.drawPath(this.LJIIJJI, this.LJIIIIZZ);
        if (b) {
            canvas.drawRect(0.0f, n5, this.LJIIJ.width() - n7, -this.LIZ + this.LJIIL, this.LJIIIZ);
        }
        canvas.restoreToCount(save2);
        final int save3 = canvas.save();
        canvas.translate(this.LJIIJ.left + n6, this.LJIIJ.bottom - n6);
        canvas.rotate(270.0f);
        canvas.drawPath(this.LJIIJJI, this.LJIIIIZZ);
        if (b2) {
            canvas.drawRect(0.0f, n5, this.LJIIJ.height() - n7, -this.LIZ, this.LJIIIZ);
        }
        canvas.restoreToCount(save3);
        final int save4 = canvas.save();
        canvas.translate(this.LJIIJ.right - n6, this.LJIIJ.top + n6);
        canvas.rotate(90.0f);
        canvas.drawPath(this.LJIIJJI, this.LJIIIIZZ);
        if (b2) {
            canvas.drawRect(0.0f, n5, this.LJIIJ.height() - n7, -this.LIZ, this.LJIIIZ);
        }
        canvas.restoreToCount(save4);
        canvas.translate(0.0f, -this.LIZJ / 2.0f);
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    public final boolean getPadding(final Rect rect) {
        final int n = (int)Math.ceil(LIZ(this.LIZIZ, this.LIZ, this.LJIILL));
        final int n2 = (int)Math.ceil(LIZIZ(this.LIZIZ, this.LIZ, this.LJIILL));
        rect.set(n2, n, n2, n);
        return true;
    }
    
    public final boolean isStateful() {
        final ColorStateList lizlll = this.LIZLLL;
        return (lizlll != null && lizlll.isStateful()) || super.isStateful();
    }
    
    public final void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        this.LJ = true;
    }
    
    public final boolean onStateChange(final int[] array) {
        final ColorStateList lizlll = this.LIZLLL;
        final int colorForState = lizlll.getColorForState(array, lizlll.getDefaultColor());
        if (this.LJII.getColor() == colorForState) {
            return false;
        }
        this.LJII.setColor(colorForState);
        this.LJ = true;
        this.invalidateSelf();
        return true;
    }
    
    public final void setAlpha(final int alpha) {
        this.LJII.setAlpha(alpha);
        this.LJIIIIZZ.setAlpha(alpha);
        this.LJIIIZ.setAlpha(alpha);
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.LJII.setColorFilter(colorFilter);
    }
}
