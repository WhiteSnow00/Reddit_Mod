// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Objects;
import com.bytedance.covode.number.Covode;
import android.view.ViewTreeObserver;
import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View$OnAttachStateChangeListener;

public final class 086 implements View$OnAttachStateChangeListener, ViewTreeObserver$OnPreDrawListener
{
    public final View LIZ;
    public ViewTreeObserver LIZIZ;
    public final Runnable LIZJ;
    
    static {
        Covode.recordClassIndex(859);
    }
    
    public 086(final View liz, final Runnable lizj) {
        this.LIZ = liz;
        this.LIZIZ = liz.getViewTreeObserver();
        this.LIZJ = lizj;
    }
    
    public static 086 LIZ(final View view, final Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        final 086 086 = new 086(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)086);
        view.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)086);
        return 086;
    }
    
    private void LIZ() {
        if (this.LIZIZ.isAlive()) {
            this.LIZIZ.removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        }
        else {
            this.LIZ.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        }
        this.LIZ.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
    }
    
    public final boolean onPreDraw() {
        this.LIZ();
        this.LIZJ.run();
        return true;
    }
    
    public final void onViewAttachedToWindow(final View view) {
        this.LIZIZ = view.getViewTreeObserver();
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        this.LIZ();
    }
}
