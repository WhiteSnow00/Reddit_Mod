// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import android.graphics.Paint$Style;
import com.bytedance.covode.number.Covode;
import android.graphics.Paint;
import android.graphics.RectF;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.drawable.Drawable;

public final class 0p1 extends Drawable implements ValueAnimator$AnimatorUpdateListener
{
    public final ValueAnimator LIZ;
    public QgG<2P9> LIZIZ;
    public final float LIZJ;
    public final int LIZLLL;
    public final float LJ;
    public final int LJFF;
    public final float LJI;
    public int LJII;
    public int LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public int LJIIJJI;
    public RectF LJIIL;
    public final Paint LJIILIIL;
    
    static {
        Covode.recordClassIndex(8052);
    }
    
    public 0p1(final float lizj, final int lizlll, final float lj, final int ljff) {
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
        this.LJFF = ljff;
        this.LJI = -0.5f;
        this.LJIIIZ = lizj + lj;
        this.LJIIL = new RectF();
        final Paint ljiiliil = new Paint();
        ljiiliil.setStyle(Paint$Style.FILL);
        ljiiliil.setAntiAlias(true);
        this.LJIILIIL = ljiiliil;
        final ValueAnimator liz = new ValueAnimator();
        liz.setFloatValues(new float[] { 0.0f, this.LJIIIZ });
        liz.setDuration(500L);
        liz.setRepeatCount(-1);
        liz.setRepeatMode(1);
        liz.setInterpolator((TimeInterpolator)new LinearInterpolator());
        this.LIZ = liz;
    }
    
    public final void LIZ() {
        this.LIZ.cancel();
        this.LIZ.removeUpdateListener((ValueAnimator$AnimatorUpdateListener)this);
        this.LIZ.addUpdateListener((ValueAnimator$AnimatorUpdateListener)this);
        this.LIZ.start();
    }
    
    public final void draw(final Canvas canvas) {
        CTM.LIZ((Object)canvas);
        canvas.save();
        final int ljiiiizz = this.LJIIIIZZ;
        final float n = ljiiiizz / 2.0f;
        canvas.clipPath(0yH.LIZ((float)this.LJII, (float)ljiiiizz, n, n));
        canvas.drawColor(this.LJFF);
        canvas.skew(this.LJI, 0.0f);
        this.LJIILIIL.setColor(this.LIZLLL);
        for (int ljiijji = this.LJIIJJI, i = 0; i < ljiijji; ++i) {
            final float ljiiiz = this.LJIIIZ;
            this.LJIIL.offsetTo(i * ljiiiz - ljiiiz / 2.0f + this.LJIIJ, 0.0f);
            canvas.drawRect(this.LJIIL, this.LJIILIIL);
        }
        canvas.restore();
    }
    
    public final int getIntrinsicHeight() {
        return this.LJIIIIZZ;
    }
    
    public final int getIntrinsicWidth() {
        return this.LJII;
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
        Object animatedValue;
        if (valueAnimator != null) {
            animatedValue = valueAnimator.getAnimatedValue();
        }
        else {
            animatedValue = null;
        }
        final Float n = (Float)animatedValue;
        float floatValue;
        if (n != null) {
            floatValue = n;
        }
        else {
            floatValue = 0.0f;
        }
        this.LJIIJ = floatValue % this.LJIIIZ;
        this.invalidateSelf();
        final QgG<2P9> liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.invoke();
        }
    }
    
    public final void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        if (rect != null) {
            this.LJII = rect.width();
            this.LJIIIIZZ = rect.height();
            this.LJIIJJI = (int)Math.ceil(this.LJII / (double)this.LJIIIZ) + 2;
            this.LJIIL.set(0.0f, 0.0f, this.LIZJ, (float)this.LJIIIIZZ);
        }
    }
    
    public final void setAlpha(final int alpha) {
        this.LJIILIIL.setAlpha(alpha);
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        this.LJIILIIL.setColorFilter(colorFilter);
    }
}
