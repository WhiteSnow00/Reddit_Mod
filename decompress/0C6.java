// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.WindowInsets;
import java.util.Objects;
import android.os.Build$VERSION;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewTreeObserver;
import android.view.View;
import java.lang.ref.WeakReference;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public final class 0c6 implements ViewTreeObserver$OnGlobalLayoutListener
{
    public WeakReference<View> LIZ;
    public ViewTreeObserver LIZIZ;
    public int LIZJ;
    public ViewGroup$LayoutParams LIZLLL;
    
    static {
        Covode.recordClassIndex(5683);
    }
    
    public 0c6(final View view) {
        if (view != null) {
            this.LIZ = new WeakReference<View>(view);
            (this.LIZIZ = view.getViewTreeObserver()).addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
            this.LIZLLL = view.getLayoutParams();
        }
    }
    
    public final void onGlobalLayout() {
        final View view = this.LIZ.get();
        if (view == null) {
            if (this.LIZIZ.isAlive()) {
                this.LIZIZ.removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
            }
            return;
        }
        final Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        while (true) {
            Label_0153: {
                if (Build$VERSION.SDK_INT < 23) {
                    break Label_0153;
                }
                final WindowInsets rootWindowInsets = view.getRootWindowInsets();
                if (rootWindowInsets == null || rootWindowInsets.getStableInsetTop() == rect.top || rootWindowInsets.getStableInsetTop() >= rect.top) {
                    break Label_0153;
                }
                final int bottom = rect.bottom - (rect.top - rootWindowInsets.getStableInsetTop());
                if (bottom != this.LIZJ) {
                    this.LIZLLL.height = bottom;
                    view.setLayoutParams(this.LIZLLL);
                    Objects.requireNonNull(view);
                    view.post((Runnable)new 0cR(view));
                    this.LIZJ = bottom;
                }
                return;
            }
            final int bottom = rect.bottom;
            continue;
        }
    }
}
