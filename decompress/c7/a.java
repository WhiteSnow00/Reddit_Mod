// 
// Decompiled by Procyon v0.6.0
// 

package c7;

import android.animation.TimeInterpolator;
import java.util.Iterator;
import android.animation.Animator;
import a4.t;
import android.os.Build$VERSION;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator$AnimatorListener;
import java.util.concurrent.CopyOnWriteArraySet;
import android.animation.ValueAnimator;

public abstract class a extends ValueAnimator
{
    public final CopyOnWriteArraySet f;
    public final CopyOnWriteArraySet g;
    
    public a() {
        this.f = new CopyOnWriteArraySet();
        this.g = new CopyOnWriteArraySet();
    }
    
    public final void addListener(final Animator$AnimatorListener animator$AnimatorListener) {
        this.g.add(animator$AnimatorListener);
    }
    
    public final void addUpdateListener(final ValueAnimator$AnimatorUpdateListener valueAnimator$AnimatorUpdateListener) {
        this.f.add(valueAnimator$AnimatorUpdateListener);
    }
    
    public final void b(final boolean b) {
        for (final Animator$AnimatorListener animator$AnimatorListener : this.g) {
            if (Build$VERSION.SDK_INT >= 26) {
                t.d(animator$AnimatorListener, (Animator)this, b);
            }
            else {
                animator$AnimatorListener.onAnimationEnd((Animator)this);
            }
        }
    }
    
    public final void c() {
        final Iterator iterator = this.f.iterator();
        while (iterator.hasNext()) {
            ((ValueAnimator$AnimatorUpdateListener)iterator.next()).onAnimationUpdate((ValueAnimator)this);
        }
    }
    
    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }
    
    public final void removeAllListeners() {
        this.g.clear();
    }
    
    public final void removeAllUpdateListeners() {
        this.f.clear();
    }
    
    public final void removeListener(final Animator$AnimatorListener animator$AnimatorListener) {
        this.g.remove(animator$AnimatorListener);
    }
    
    public final void removeUpdateListener(final ValueAnimator$AnimatorUpdateListener valueAnimator$AnimatorUpdateListener) {
        this.f.remove(valueAnimator$AnimatorUpdateListener);
    }
    
    public final ValueAnimator setDuration(final long n) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
    
    public final void setInterpolator(final TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }
    
    public final void setStartDelay(final long n) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }
}
