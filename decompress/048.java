// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.accessibility.AccessibilityManager;
import android.view.MotionEvent;
import android.text.TextUtils;
import java.lang.reflect.Field;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build$VERSION;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;
import android.view.View;
import android.view.View$OnLongClickListener;
import android.view.View$OnHoverListener;
import android.view.View$OnAttachStateChangeListener;

public final class 048 implements View$OnAttachStateChangeListener, View$OnHoverListener, View$OnLongClickListener
{
    public static 048 LJIIIZ;
    public static 048 LJIIJ;
    public final View LIZ;
    public final CharSequence LIZIZ;
    public final int LIZJ;
    public final Runnable LIZLLL;
    public final Runnable LJ;
    public int LJFF;
    public int LJI;
    public 049 LJII;
    public boolean LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(507);
    }
    
    public 048(final View liz, final CharSequence liziz) {
        this.LIZLLL = new 046(this);
        this.LJ = new 047(this);
        this.LIZ = liz;
        this.LIZIZ = liziz;
        final ViewConfiguration value = ViewConfiguration.get(liz.getContext());
        int scaledHoverSlop;
        if (Build$VERSION.SDK_INT >= 28) {
            scaledHoverSlop = value.getScaledHoverSlop();
        }
        else {
            scaledHoverSlop = value.getScaledTouchSlop() / 2;
        }
        this.LIZJ = scaledHoverSlop;
        this.LIZLLL();
        liz.setOnLongClickListener((View$OnLongClickListener)this);
        liz.setOnHoverListener((View$OnHoverListener)this);
    }
    
    public static Object LIZ(Context context, String ex) {
        Label_0158: {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(ex)) {
                if (!2JT.LIZ) {
                    break Label_0158;
                }
                synchronized (ClipboardManager.class) {
                    final Object systemService = context.getSystemService((String)ex);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            final Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            ex = (Exception)declaredField.get(systemService);
                            declaredField.set(systemService, new 2Lq((Handler)ex));
                        }
                        catch (final Exception ex) {
                            6Nw.LIZ((Throwable)ex, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    2JT.LIZ = false;
                    return context;
                }
            }
            Label_0149: {
                if (2JT.LIZIZ || !"connectivity".equals(ex)) {
                    break Label_0149;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    context = (Context)context.getSystemService((String)ex);
                    return context;
                    context = (Context)context.getSystemService((String)ex);
                    return context;
                    context = (Context)context.getSystemService((String)ex);
                    return context;
                }
                finally {
                    return context.getSystemService((String)ex);
                }
            }
        }
    }
    
    public static void LIZ(final 048 ljiiiz) {
        final 048 ljiiiz2 = 048.LJIIIZ;
        if (ljiiiz2 != null) {
            ljiiiz2.LIZJ();
        }
        if ((048.LJIIIZ = ljiiiz) != null) {
            ljiiiz.LIZIZ();
        }
    }
    
    public static void LIZ(final View view, final CharSequence charSequence) {
        final 048 ljiiiz = 048.LJIIIZ;
        if (ljiiiz != null && ljiiiz.LIZ == view) {
            LIZ(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            final 048 ljiij = 048.LJIIJ;
            if (ljiij != null && ljiij.LIZ == view) {
                ljiij.LIZ();
            }
            view.setOnLongClickListener((View$OnLongClickListener)null);
            view.setLongClickable(false);
            view.setOnHoverListener((View$OnHoverListener)null);
            return;
        }
        new 048(view, charSequence);
    }
    
    private void LIZIZ() {
        this.LIZ.postDelayed(this.LIZLLL, (long)ViewConfiguration.getLongPressTimeout());
    }
    
    private void LIZJ() {
        this.LIZ.removeCallbacks(this.LIZLLL);
    }
    
    private void LIZLLL() {
        this.LJFF = Integer.MAX_VALUE;
        this.LJI = Integer.MAX_VALUE;
    }
    
    public final void LIZ() {
        if (048.LJIIJ == this) {
            048.LJIIJ = null;
            final 049 ljii = this.LJII;
            if (ljii != null) {
                ljii.LIZ();
                this.LJII = null;
                this.LIZLLL();
                this.LIZ.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            }
        }
        if (048.LJIIIZ == this) {
            LIZ(null);
        }
        this.LIZ.removeCallbacks(this.LJ);
    }
    
    public final void LIZ(final boolean ljiiiizz) {
        if (!this.LIZ.isAttachedToWindow()) {
            return;
        }
        LIZ(null);
        final 048 ljiij = 048.LJIIJ;
        if (ljiij != null) {
            ljiij.LIZ();
        }
        048.LJIIJ = this;
        this.LJIIIIZZ = ljiiiizz;
        (this.LJII = new 049(this.LIZ.getContext())).LIZ(this.LIZ, this.LJFF, this.LJI, this.LJIIIIZZ, this.LIZIZ);
        this.LIZ.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        long n;
        if (this.LJIIIIZZ) {
            n = 2500L;
        }
        else {
            long n2;
            int n3;
            if ((this.LIZ.getWindowSystemUiVisibility() & 0x1) == 0x1) {
                n2 = 3000L;
                n3 = ViewConfiguration.getLongPressTimeout();
            }
            else {
                n2 = 15000L;
                n3 = ViewConfiguration.getLongPressTimeout();
            }
            n = n2 - n3;
        }
        this.LIZ.removeCallbacks(this.LJ);
        this.LIZ.postDelayed(this.LJ, n);
    }
    
    public final boolean onHover(final View view, final MotionEvent motionEvent) {
        if (this.LJII != null && this.LJIIIIZZ) {
            return false;
        }
        final AccessibilityManager accessibilityManager = (AccessibilityManager)LIZ(this.LIZ.getContext(), "accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        final int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.LIZLLL();
                this.LIZ();
            }
        }
        else if (this.LIZ.isEnabled() && this.LJII == null) {
            final int ljff = (int)motionEvent.getX();
            final int lji = (int)motionEvent.getY();
            if (Math.abs(ljff - this.LJFF) > this.LIZJ || Math.abs(lji - this.LJI) > this.LIZJ) {
                this.LJFF = ljff;
                this.LJI = lji;
                LIZ(this);
            }
        }
        return false;
    }
    
    public final boolean onLongClick(final View view) {
        this.LJFF = view.getWidth() / 2;
        this.LJI = view.getHeight() / 2;
        this.LIZ(true);
        return true;
    }
    
    public final void onViewAttachedToWindow(final View view) {
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        this.LIZ();
    }
}
