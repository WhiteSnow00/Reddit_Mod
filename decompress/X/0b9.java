// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.List;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.WindowInsetsAnimation$Callback;
import android.view.View$OnApplyWindowInsetsListener;
import android.view.View;
import android.os.Build$VERSION;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.graphics.Rect;
import android.animation.ValueAnimator;
import android.widget.LinearLayout;

public class 0b9 extends LinearLayout
{
    public 0bC LIZ;
    public 0bB LIZIZ;
    public final int LIZJ;
    public boolean LIZLLL;
    public ValueAnimator LJ;
    public boolean LJFF;
    public Rect LJI;
    public 0bA LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    
    static {
        Covode.recordClassIndex(5612);
    }
    
    public 0b9(final Context context, final AttributeSet set) {
        this(context, set, (byte)0);
    }
    
    public 0b9(final Context context, final AttributeSet set, final byte b) {
        super(context, set, 0);
        MethodCollector.i(11587);
        this.LJI = new Rect();
        this.LJII = new 0bA();
        this.LIZJ = 0cD.LIZ(context);
        MethodCollector.o(11587);
    }
    
    public final void LIZ() {
        this.LJII = new 1HA();
    }
    
    public 0bA getKeyBoardObservable() {
        return this.LJII;
    }
    
    public void onMeasure(final int n, final int n2) {
        MethodCollector.i(11594);
        if (!this.LJFF) {
            final int ljiiiz = this.LJIIIZ;
            final int ljiiiizz = this.LJIIIIZZ;
            if (ljiiiz == ljiiiizz) {
                this.LJII.LIZ(this.getContext(), n2);
            }
            else {
                this.LJIIIZ = ljiiiizz;
            }
        }
        super.onMeasure(n, n2);
        MethodCollector.o(11594);
    }
    
    public void setKeyboardAnimatorObserver(final 0bC liz) {
        this.LIZ = liz;
    }
    
    public void setWindowInsetsEnable(final boolean ljff) {
        this.LJFF = ljff;
        if (ljff) {
            this.setFitsSystemWindows(false);
            final a a = new a();
            if (Build$VERSION.SDK_INT < 30) {
                ((View)this).setTag(2131372093, (Object)a);
            }
            ((View)this).setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)new 0eR((View)this, a));
            if (Build$VERSION.SDK_INT >= 30) {
                ((View)this).setWindowInsetsAnimationCallback((WindowInsetsAnimation$Callback)new 0ed.e.a(a));
                return;
            }
            final Object tag = ((View)this).getTag(2131372093);
            final 0ed.d.a onApplyWindowInsetsListener = new 0ed.d.a((View)this, a);
            ((View)this).setTag(2131372105, (Object)onApplyWindowInsetsListener);
            if (tag == null) {
                ((View)this).setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)onApplyWindowInsetsListener);
            }
        }
    }
    
    public void setWindowInsetsKeyboardObserver(final 0bB liziz) {
        this.LIZIZ = liziz;
    }
    
    public final class a extends 0ed.b implements m
    {
        public int LIZLLL;
        public boolean LJ;
        public int LJFF;
        public int LJI;
        public 0el LJII;
        public int LJIIIIZZ;
        public boolean LJIIIZ;
        
        static {
            Covode.recordClassIndex(5615);
        }
        
        public a() {
            this.LJFF = 2;
            this.LJI = 8;
            this.LJIIIIZZ = 0;
            this.LJIIIZ = false;
        }
        
        @Override
        public final 0ed.a LIZ(final 0ed 0ed, final 0ed.a a) {
            this.LJIIIZ = false;
            super.LIZ(0ed, a);
            return a;
        }
        
        @Override
        public final 0el LIZ(final 0el ljii) {
            if (this.LJII != null && ljii.LIZ(8).LJ == this.LJII.LIZ(8).LJ) {
                return 0el.LIZ;
            }
            final int lj = ljii.LIZ(2).LJ;
            final int lj2 = ljii.LIZ(8).LJ;
            final int n = 0;
            final boolean b = false;
            this.LIZLLL = Math.max(lj2 - lj, 0);
            0b9.this.setPadding(ljii.LIZ(7).LIZIZ, 0b9.this.getPaddingTop(), ljii.LIZ(7).LIZLLL, ljii.LIZ(2).LJ);
            int ljff;
            if (this.LJ) {
                ljff = this.LJFF;
            }
            else {
                ljff = (this.LJFF | this.LJI);
            }
            final 0eP liz = ljii.LIZ(ljff);
            int lj3 = liz.LJ;
            if (lj > 0) {
                lj3 -= lj;
            }
            final 0bB liziz = 0b9.this.LIZIZ;
            boolean b2 = true;
            if (liziz != null) {
                final 0bB liziz2 = 0b9.this.LIZIZ;
                final int lizlll = this.LIZLLL;
                boolean b3 = b;
                if (lizlll > 0) {
                    b3 = true;
                }
                liziz2.LIZ(b3, lizlll);
            }
            else {
                final 0b9 liz2 = 0b9.this;
                final Rect lji = new Rect(liz.LIZIZ, liz.LIZJ, liz.LIZLLL, Math.max(lj3, 0));
                final Rect lji2 = liz2.LJI;
                if (lji2 != null && lji2.bottom != lji.bottom) {
                    if (liz2.LJ != null) {
                        liz2.LJ.cancel();
                    }
                    if (lji.bottom <= liz2.LIZJ) {
                        b2 = false;
                    }
                    liz2.LIZLLL = (b2 ^ true);
                    long n2;
                    if (liz2.LIZLLL) {
                        n2 = 120L;
                    }
                    else {
                        n2 = 100L;
                    }
                    final long duration = (long)(Math.abs(lji.bottom - lji2.bottom) / (Math.max(lji.bottom, lji2.bottom) * 1.0f) * n2);
                    if (liz2.LJ != null) {
                        liz2.LJ.cancel();
                    }
                    liz2.LJ = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f }).setDuration(duration);
                    if (liz2.LIZLLL) {
                        liz2.LJ.setInterpolator((TimeInterpolator)new AccelerateInterpolator());
                    }
                    else {
                        liz2.LJ.setInterpolator((TimeInterpolator)new DecelerateInterpolator());
                    }
                    int bottom = lji.bottom;
                    int bottom2 = lji2.bottom;
                    if (lji2.bottom == liz2.LIZJ) {
                        bottom = lji.bottom - liz2.LIZJ;
                        bottom2 = 0;
                    }
                    if (lji.bottom == liz2.LIZJ) {
                        bottom2 = lji2.bottom - liz2.LIZJ;
                        bottom = n;
                    }
                    liz2.LJ.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new 0bD(liz2, b2, bottom, bottom2));
                    liz2.LJ.addListener((Animator$AnimatorListener)new Animator$AnimatorListener(liz2) {
                        static {
                            Covode.recordClassIndex(5613);
                        }
                        
                        public final void onAnimationCancel(final Animator animator) {
                        }
                        
                        public final void onAnimationEnd(final Animator animator) {
                            this.LIZ.LIZLLL = false;
                        }
                        
                        public final void onAnimationRepeat(final Animator animator) {
                        }
                        
                        public final void onAnimationStart(final Animator animator) {
                        }
                    });
                    0eQ.LIZ((View)liz2, new Runnable(liz2) {
                        static {
                            Covode.recordClassIndex(5614);
                        }
                        
                        @Override
                        public final void run() {
                            if (this.LIZ.LJ != null) {
                                this.LIZ.LJ.start();
                            }
                        }
                    });
                    liz2.LJI = lji;
                }
            }
            return this.LJII = ljii;
        }
        
        @Override
        public final 0el LIZ(final 0el 0el, final List<0ed> list) {
            final Iterator<0ed> iterator = list.iterator();
            while (iterator.hasNext()) {
                if ((iterator.next().LIZ.LIZ() & 0x8) != 0x0) {
                    if (0b9.this.LJ != null && !0b9.this.LIZLLL) {
                        0b9.this.LJ.cancel();
                    }
                    final int n = 0el.LIZ(8).LJ - 0el.LIZ(2).LJ;
                    final boolean b = false;
                    final boolean b2 = false;
                    int ljiiiizz;
                    if ((ljiiiizz = n) < 0) {
                        ljiiiizz = 0;
                    }
                    if (this.LIZLLL == 0 && this.LJIIIIZZ == 0) {
                        break;
                    }
                    this.LJIIIIZZ = ljiiiizz;
                    if (0b9.this.LIZ == null) {
                        break;
                    }
                    this.LJIIIZ = (this.LIZLLL == 0);
                    if (ljiiiizz > 0) {
                        final 0bC liz = 0b9.this.LIZ;
                        final int lizlll = this.LIZLLL;
                        boolean b3 = b2;
                        if (lizlll != 0) {
                            b3 = true;
                        }
                        liz.LIZ(b3, lizlll, ljiiiizz);
                        break;
                    }
                    final 0bC liz2 = 0b9.this.LIZ;
                    final int lizlll2 = this.LIZLLL;
                    boolean b4 = b;
                    if (lizlll2 != 0) {
                        b4 = true;
                    }
                    liz2.LIZ(b4, lizlll2, 1);
                    break;
                }
            }
            return 0el;
        }
        
        @Override
        public final void LIZ(final 0ed 0ed) {
            if ((0ed.LIZ.LIZ() & this.LJI) != 0x0) {
                this.LJ = true;
            }
            super.LIZ(0ed);
        }
        
        @Override
        public final void LIZIZ(final 0ed 0ed) {
            if (this.LJ && (0ed.LIZ.LIZ() & this.LJI) != 0x0) {
                this.LJ = false;
            }
            if (this.LJIIIZ && 0b9.this.LIZ != null) {
                0b9.this.LIZ.LIZ(false, 0, 0);
            }
            super.LIZIZ(0ed);
        }
    }
}
