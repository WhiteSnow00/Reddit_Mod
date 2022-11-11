// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.WindowManager;
import android.util.DisplayMetrics;
import android.content.res.Resources;
import android.view.View$MeasureSpec;
import java.lang.reflect.Field;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import android.os.Build$VERSION;
import android.view.ViewGroup$LayoutParams;
import android.app.Activity;
import android.content.ContextWrapper;
import android.view.ViewGroup;
import android.view.LayoutInflater$Factory;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import android.graphics.Rect;
import android.view.WindowManager$LayoutParams;
import android.widget.TextView;
import android.view.View;
import android.content.Context;

public final class 049
{
    public final Context LIZ;
    public final View LIZIZ;
    public final TextView LIZJ;
    public final WindowManager$LayoutParams LIZLLL;
    public final Rect LJ;
    public final int[] LJFF;
    public final int[] LJI;
    
    static {
        Covode.recordClassIndex(510);
    }
    
    public 049(final Context liz) {
        final WindowManager$LayoutParams lizlll = new WindowManager$LayoutParams();
        this.LIZLLL = lizlll;
        this.LJ = new Rect();
        this.LJFF = new int[2];
        this.LJI = new int[2];
        this.LIZ = liz;
        final View liz2 = LIZ(LayoutInflater.from(liz));
        this.LIZIZ = liz2;
        this.LIZJ = (TextView)liz2.findViewById(2131368197);
        lizlll.setTitle((CharSequence)this.getClass().getSimpleName());
        lizlll.packageName = liz.getPackageName();
        lizlll.type = 1002;
        lizlll.width = -2;
        lizlll.height = -2;
        lizlll.format = -3;
        lizlll.windowAnimations = 2131886085;
        lizlll.flags = 24;
    }
    
    public static View LIZ(final LayoutInflater layoutInflater) {
        if (NEN.LIZ(NEN.LIZ(), true, "tiktok_tux_text_view_opt", false) && layoutInflater != null && layoutInflater.getFactory() == null && layoutInflater.getFactory2() == null) {
            try {
                layoutInflater.setFactory((LayoutInflater$Factory)new SgJ());
            }
            catch (final Exception ex) {
                return layoutInflater.inflate(2131558466, (ViewGroup)null);
            }
        }
        return layoutInflater.inflate(2131558466, (ViewGroup)null);
    }
    
    public static View LIZ(final View view) {
        final View rootView = view.getRootView();
        final ViewGroup$LayoutParams layoutParams = rootView.getLayoutParams();
        if (layoutParams instanceof WindowManager$LayoutParams && ((WindowManager$LayoutParams)layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity)context).getWindow().getDecorView();
            }
        }
        return rootView;
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
                            ex = (Exception)new 2Lq((Handler)declaredField.get(systemService));
                            declaredField.set(systemService, ex);
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
    
    private void LIZ(final View view, int n, int height, final boolean b, final WindowManager$LayoutParams windowManager$LayoutParams) {
        windowManager$LayoutParams.token = view.getApplicationWindowToken();
        final int dimensionPixelOffset = this.LIZ.getResources().getDimensionPixelOffset(2131166051);
        if (view.getWidth() < dimensionPixelOffset) {
            n = view.getWidth() / 2;
        }
        int n3;
        if (view.getHeight() >= dimensionPixelOffset) {
            final int dimensionPixelOffset2 = this.LIZ.getResources().getDimensionPixelOffset(2131166050);
            final int n2 = height + dimensionPixelOffset2;
            n3 = height - dimensionPixelOffset2;
            height = n2;
        }
        else {
            height = view.getHeight();
            n3 = 0;
        }
        windowManager$LayoutParams.gravity = 49;
        final Resources resources = this.LIZ.getResources();
        int n4;
        if (b) {
            n4 = 2131166054;
        }
        else {
            n4 = 2131166053;
        }
        final int dimensionPixelOffset3 = resources.getDimensionPixelOffset(n4);
        final View liz = LIZ(view);
        if (liz == null) {
            return;
        }
        liz.getWindowVisibleDisplayFrame(this.LJ);
        if (this.LJ.left < 0 && this.LJ.top < 0) {
            final Resources resources2 = this.LIZ.getResources();
            final int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize;
            if (identifier != 0) {
                dimensionPixelSize = resources2.getDimensionPixelSize(identifier);
            }
            else {
                dimensionPixelSize = 0;
            }
            final DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
            this.LJ.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        liz.getLocationOnScreen(this.LJI);
        view.getLocationOnScreen(this.LJFF);
        final int[] ljff = this.LJFF;
        final int n5 = ljff[0];
        final int[] lji = this.LJI;
        ljff[0] = n5 - lji[0];
        ljff[1] -= lji[1];
        windowManager$LayoutParams.x = ljff[0] + n - liz.getWidth() / 2;
        n = View$MeasureSpec.makeMeasureSpec(0, 0);
        this.LIZIZ.measure(n, n);
        n = this.LIZIZ.getMeasuredHeight();
        final int[] ljff2 = this.LJFF;
        final int y = ljff2[1] + n3 - dimensionPixelOffset3 - n;
        height = ljff2[1] + height + dimensionPixelOffset3;
        if (b) {
            if (y < 0) {
                windowManager$LayoutParams.y = height;
                return;
            }
        }
        else if (n + height <= this.LJ.height()) {
            windowManager$LayoutParams.y = height;
            return;
        }
        windowManager$LayoutParams.y = y;
    }
    
    public static void LIZ(final WindowManager windowManager, final View view) {
        68G.LIZIZ(new Object[] { view });
        windowManager.removeView(view);
    }
    
    public static void LIZ(final WindowManager windowManager, final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        68G.LIZ(new Object[] { view, viewGroup$LayoutParams });
        windowManager.addView(view, viewGroup$LayoutParams);
    }
    
    private boolean LIZIZ() {
        return this.LIZIZ.getParent() != null;
    }
    
    public final void LIZ() {
        if (!this.LIZIZ()) {
            return;
        }
        LIZ((WindowManager)LIZ(this.LIZ, "window"), this.LIZIZ);
    }
    
    public final void LIZ(final View view, final int n, final int n2, final boolean b, final CharSequence text) {
        if (this.LIZIZ()) {
            this.LIZ();
        }
        this.LIZJ.setText(text);
        this.LIZ(view, n, n2, b, this.LIZLLL);
        LIZ((WindowManager)LIZ(this.LIZ, "window"), this.LIZIZ, (ViewGroup$LayoutParams)this.LIZLLL);
    }
}
