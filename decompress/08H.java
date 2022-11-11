// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.SystemClock;
import android.view.animation.AnimationUtils;
import android.view.MotionEvent;
import android.util.DisplayMetrics;
import android.content.res.Resources;
import android.view.animation.AccelerateInterpolator;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;
import android.view.animation.Interpolator;
import android.view.View;
import android.view.View$OnTouchListener;

public abstract class 08h implements View$OnTouchListener
{
    public static final int LJIIZILJ;
    public final a LIZ;
    public final View LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public final Interpolator LJII;
    public Runnable LJIIIIZZ;
    public float[] LJIIIZ;
    public float[] LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public float[] LJIILIIL;
    public float[] LJIILJJIL;
    public float[] LJIILL;
    public boolean LJIILLIIL;
    
    static {
        Covode.recordClassIndex(916);
        LJIIZILJ = ViewConfiguration.getTapTimeout();
    }
    
    public 08h(final View liziz) {
        final a liz = new a();
        this.LIZ = liz;
        this.LJII = (Interpolator)new AccelerateInterpolator();
        this.LJIIIZ = new float[] { 0.0f, 0.0f };
        this.LJIIJ = new float[] { Float.MAX_VALUE, Float.MAX_VALUE };
        this.LJIILIIL = new float[] { 0.0f, 0.0f };
        this.LJIILJJIL = new float[] { 0.0f, 0.0f };
        this.LJIILL = new float[] { Float.MAX_VALUE, Float.MAX_VALUE };
        this.LIZIZ = liziz;
        final DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        final int n = (int)(displayMetrics.density * 1575.0f + 0.5f);
        final int n2 = (int)(displayMetrics.density * 315.0f + 0.5f);
        final float n3 = (float)n;
        final float[] ljiill = this.LJIILL;
        ljiill[1] = (ljiill[0] = n3 / 1000.0f);
        final float n4 = (float)n2;
        final float[] ljiiljjil = this.LJIILJJIL;
        ljiiljjil[1] = (ljiiljjil[0] = n4 / 1000.0f);
        this.LJIIJJI = 1;
        final float[] ljiij = this.LJIIJ;
        ljiij[1] = (ljiij[0] = Float.MAX_VALUE);
        final float[] ljiiiz = this.LJIIIZ;
        ljiiiz[1] = (ljiiiz[0] = 0.2f);
        final float[] ljiiliil = this.LJIILIIL;
        ljiiliil[1] = (ljiiliil[0] = 0.001f);
        this.LJIIL = 08h.LJIIZILJ;
        liz.LIZ = 500;
        liz.LIZIZ = 500;
    }
    
    private float LIZ(final float n, final float n2) {
        if (n2 == 0.0f) {
            return 0.0f;
        }
        final int ljiijji = this.LJIIJJI;
        if (ljiijji != 0 && ljiijji != 1) {
            if (ljiijji == 2 && n < 0.0f) {
                return n / -n2;
            }
        }
        else if (n < n2) {
            if (n >= 0.0f) {
                return 1.0f - n / n2;
            }
            if (this.LJ && ljiijji == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }
    
    public static float LIZ(final float n, final float n2, final float n3) {
        if (n > n3) {
            return n3;
        }
        if (n < n2) {
            return n2;
        }
        return n;
    }
    
    private float LIZ(float n, final float n2, float liz, final float n3) {
        n = LIZ(n * n2, 0.0f, liz);
        liz = this.LIZ(n3, n);
        n = this.LIZ(n2 - n3, n) - liz;
        if (n < 0.0f) {
            n = -this.LJII.getInterpolation(-n);
        }
        else {
            if (n <= 0.0f) {
                return 0.0f;
            }
            n = this.LJII.getInterpolation(n);
        }
        return LIZ(n, -1.0f, 1.0f);
    }
    
    private float LIZ(final int n, float liz, float n2, float n3) {
        liz = this.LIZ(this.LJIIIZ[n], n2, this.LJIIJ[n], liz);
        final float n4 = fcmpl(liz, 0.0f);
        if (n4 == 0) {
            return 0.0f;
        }
        final float n5 = this.LJIILIIL[n];
        final float n6 = this.LJIILJJIL[n];
        n2 = this.LJIILL[n];
        n3 *= n5;
        if (n4 > 0) {
            return LIZ(liz * n3, n6, n2);
        }
        return -LIZ(-liz * n3, n6, n2);
    }
    
    public static int LIZ(final int n, int n2) {
        if (n > n2) {
            return n2;
        }
        if ((n2 = n) < 0) {
            n2 = 0;
        }
        return n2;
    }
    
    private void LIZIZ() {
        if (this.LIZJ) {
            this.LJ = false;
            return;
        }
        this.LIZ.LIZ();
    }
    
    public final 08h LIZ(final boolean ljff) {
        if (this.LJFF && !ljff) {
            this.LIZIZ();
        }
        this.LJFF = ljff;
        return this;
    }
    
    public abstract void LIZ(final int p0);
    
    public final boolean LIZ() {
        final a liz = this.LIZ;
        final int lizj = liz.LIZJ();
        liz.LIZIZ();
        return lizj != 0 && this.LIZIZ(lizj);
    }
    
    public abstract boolean LIZIZ(final int p0);
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (!this.LJFF) {
            return false;
        }
        final int actionMasked = motionEvent.getActionMasked();
        Label_0066: {
            if (actionMasked == 0) {
                this.LIZLLL = true;
                this.LJIILLIIL = false;
                break Label_0066;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    break Label_0066;
                }
                if (actionMasked != 3) {
                    return this.LJI && this.LJ;
                }
            }
            this.LIZIZ();
            return this.LJI && this.LJ;
        }
        final float liz = this.LIZ(0, motionEvent.getX(), (float)view.getWidth(), (float)this.LIZIZ.getWidth());
        final float liz2 = this.LIZ(1, motionEvent.getY(), (float)view.getHeight(), (float)this.LIZIZ.getHeight());
        final a liz3 = this.LIZ;
        liz3.LIZJ = liz;
        liz3.LIZLLL = liz2;
        if (!this.LJ && this.LIZ()) {
            if (this.LJIIIIZZ == null) {
                this.LJIIIIZZ = new b();
            }
            this.LJ = true;
            this.LIZJ = true;
            while (true) {
                Label_0211: {
                    if (this.LJIILLIIL) {
                        break Label_0211;
                    }
                    final int ljiil = this.LJIIL;
                    if (ljiil <= 0) {
                        break Label_0211;
                    }
                    this.LIZIZ.postOnAnimationDelayed(this.LJIIIIZZ, (long)ljiil);
                    this.LJIILLIIL = true;
                    return this.LJI && this.LJ;
                }
                this.LJIIIIZZ.run();
                continue;
            }
        }
        return this.LJI && this.LJ;
    }
    
    public static final class a
    {
        public int LIZ;
        public int LIZIZ;
        public float LIZJ;
        public float LIZLLL;
        public long LJ;
        public long LJFF;
        public int LJI;
        public long LJII;
        public float LJIIIIZZ;
        public int LJIIIZ;
        
        static {
            Covode.recordClassIndex(917);
        }
        
        public a() {
            this.LJ = Long.MIN_VALUE;
            this.LJII = -1L;
        }
        
        public final float LIZ(final long n) {
            final long lj = this.LJ;
            if (n < lj) {
                return 0.0f;
            }
            final long ljii = this.LJII;
            if (ljii < 0L || n < ljii) {
                return 08h.LIZ((n - lj) / (float)this.LIZ, 0.0f, 1.0f) * 0.5f;
            }
            final float ljiiiizz = this.LJIIIIZZ;
            return 1.0f - ljiiiizz + ljiiiizz * 08h.LIZ((n - ljii) / (float)this.LJIIIZ, 0.0f, 1.0f);
        }
        
        public final void LIZ() {
            final long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.LJIIIZ = 08h.LIZ((int)(currentAnimationTimeMillis - this.LJ), this.LIZIZ);
            this.LJIIIIZZ = this.LIZ(currentAnimationTimeMillis);
            this.LJII = currentAnimationTimeMillis;
        }
        
        public final int LIZIZ() {
            final float lizj = this.LIZJ;
            return (int)(lizj / Math.abs(lizj));
        }
        
        public final int LIZJ() {
            final float lizlll = this.LIZLLL;
            return (int)(lizlll / Math.abs(lizlll));
        }
    }
    
    public final class b implements Runnable
    {
        static {
            Covode.recordClassIndex(918);
        }
        
        @Override
        public final void run() {
            if (!08h.this.LJ) {
                return;
            }
            if (08h.this.LIZJ) {
                08h.this.LIZJ = false;
                final a liz = 08h.this.LIZ;
                liz.LJ = AnimationUtils.currentAnimationTimeMillis();
                liz.LJII = -1L;
                liz.LJFF = liz.LJ;
                liz.LJIIIIZZ = 0.5f;
                liz.LJI = 0;
            }
            final a liz2 = 08h.this.LIZ;
            if ((liz2.LJII > 0L && AnimationUtils.currentAnimationTimeMillis() > liz2.LJII + liz2.LJIIIZ) || !08h.this.LIZ()) {
                08h.this.LJ = false;
                return;
            }
            if (08h.this.LIZLLL) {
                08h.this.LIZLLL = false;
                final 08h liz3 = 08h.this;
                final long uptimeMillis = SystemClock.uptimeMillis();
                final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                liz3.LIZIZ.onTouchEvent(obtain);
                obtain.recycle();
            }
            if (liz2.LJFF != 0L) {
                final long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                final float liz4 = liz2.LIZ(currentAnimationTimeMillis);
                final long ljff = liz2.LJFF;
                liz2.LJFF = currentAnimationTimeMillis;
                liz2.LJI = (int)((currentAnimationTimeMillis - ljff) * (-4.0f * liz4 * liz4 + liz4 * 4.0f) * liz2.LIZLLL);
                08h.this.LIZ(liz2.LJI);
                08h.this.LIZIZ.postOnAnimation((Runnable)this);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }
    }
}
