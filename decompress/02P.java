// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.Display;
import android.graphics.Point;
import android.view.WindowManager;
import java.lang.reflect.Field;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import android.os.Build$VERSION;
import com.bytedance.covode.number.Covode;
import android.content.Context;
import android.widget.PopupWindow$OnDismissListener;
import android.view.View;

public class 02p
{
    public View LIZ;
    public int LIZIZ;
    public PopupWindow$OnDismissListener LIZJ;
    public final Context LIZLLL;
    public final 12x LJ;
    public final boolean LJFF;
    public final int LJI;
    public final int LJII;
    public boolean LJIIIIZZ;
    public 02r.a LJIIIZ;
    public 134 LJIIJ;
    public final PopupWindow$OnDismissListener LJIIJJI;
    
    static {
        Covode.recordClassIndex(361);
    }
    
    public 02p(final Context context, final 12x 12x, final View view, final boolean b) {
        this(context, 12x, view, b, 2130969014, 0);
    }
    
    public 02p(final Context lizlll, final 12x lj, final View liz, final boolean ljff, final int lji, final int ljii) {
        this.LIZIZ = 8388611;
        this.LJIIJJI = (PopupWindow$OnDismissListener)new 02o(this);
        this.LIZLLL = lizlll;
        this.LJ = lj;
        this.LIZ = liz;
        this.LJFF = ljff;
        this.LJI = lji;
        this.LJII = ljii;
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
    
    public final 134 LIZ() {
        if (this.LJIIJ == null) {
            final Display defaultDisplay = ((WindowManager)LIZ(this.LIZLLL, "window")).getDefaultDisplay();
            final Point point = new Point();
            defaultDisplay.getRealSize(point);
            134 ljiij;
            if (Math.min(point.x, point.y) >= this.LIZLLL.getResources().getDimensionPixelSize(2131165209)) {
                ljiij = new 1fW(this.LIZLLL, this.LIZ, this.LJI, this.LJII, this.LJFF);
            }
            else {
                ljiij = new 1fY(this.LIZLLL, this.LJ, this.LIZ, this.LJI, this.LJII, this.LJFF);
            }
            ljiij.LIZ(this.LJ);
            ljiij.LIZ(this.LJIIJJI);
            ljiij.LIZ(this.LIZ);
            ljiij.LIZ(this.LJIIIZ);
            ljiij.LIZIZ(this.LJIIIIZZ);
            ljiij.LIZ(this.LIZIZ);
            this.LJIIJ = ljiij;
        }
        return this.LJIIJ;
    }
    
    public final void LIZ(int n, final int n2, final boolean b, final boolean b2) {
        final 134 liz = this.LIZ();
        liz.LIZJ(b2);
        if (b) {
            int n3 = n;
            if ((Gravity.getAbsoluteGravity(this.LIZIZ, this.LIZ.getLayoutDirection()) & 0x7) == 0x5) {
                n3 = n - this.LIZ.getWidth();
            }
            liz.LIZIZ(n3);
            liz.LIZJ(n2);
            n = (int)(this.LIZLLL.getResources().getDisplayMetrics().density * 48.0f / 2.0f);
            liz.LJI = new Rect(n3 - n, n2 - n, n3 + n, n2 + n);
        }
        liz.a_();
    }
    
    public final void LIZ(final 02r.a ljiiiz) {
        this.LJIIIZ = ljiiiz;
        final 134 ljiij = this.LJIIJ;
        if (ljiij != null) {
            ljiij.LIZ(ljiiiz);
        }
    }
    
    public final void LIZ(final boolean ljiiiizz) {
        this.LJIIIIZZ = ljiiiizz;
        final 134 ljiij = this.LJIIJ;
        if (ljiij != null) {
            ljiij.LIZIZ(ljiiiizz);
        }
    }
    
    public final boolean LIZIZ() {
        if (this.LJ()) {
            return true;
        }
        if (this.LIZ == null) {
            return false;
        }
        this.LIZ(0, 0, false, false);
        return true;
    }
    
    public final void LIZJ() {
        if (this.LJ()) {
            this.LJIIJ.LIZLLL();
        }
    }
    
    public void LIZLLL() {
        this.LJIIJ = null;
        final PopupWindow$OnDismissListener lizj = this.LIZJ;
        if (lizj != null) {
            lizj.onDismiss();
        }
    }
    
    public final boolean LJ() {
        final 134 ljiij = this.LJIIJ;
        return ljiij != null && ljiij.LJ();
    }
}
