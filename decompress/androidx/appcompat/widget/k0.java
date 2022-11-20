// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.transition.Transition;
import androidx.appcompat.view.menu.g;
import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import android.util.AttributeSet;
import android.content.Context;
import android.util.Log;
import android.widget.PopupWindow;
import android.os.Build$VERSION;
import java.lang.reflect.Method;

public final class k0 extends i0 implements j0
{
    public static Method H;
    public j0 G;
    
    static {
        try {
            if (Build$VERSION.SDK_INT <= 28) {
                k0.H = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        }
        catch (final NoSuchMethodException ex) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }
    
    public k0(final Context context, final int n, final int n2) {
        super(context, (AttributeSet)null, n, n2);
    }
    
    public final void g(final MenuBuilder menuBuilder, final MenuItem menuItem) {
        final j0 g = this.G;
        if (g != null) {
            g.g(menuBuilder, menuItem);
        }
    }
    
    public final void j(final MenuBuilder menuBuilder, final g g) {
        final j0 g2 = this.G;
        if (g2 != null) {
            g2.j(menuBuilder, g);
        }
    }
    
    public final e0 p(final Context context, final boolean b) {
        final k0.k0$c k0$c = new k0.k0$c(context, b);
        k0$c.setHoverListener((j0)this);
        return (e0)k0$c;
    }
    
    public static final class a
    {
        public static void a(final PopupWindow popupWindow, final Transition enterTransition) {
            popupWindow.setEnterTransition(enterTransition);
        }
        
        public static void b(final PopupWindow popupWindow, final Transition exitTransition) {
            popupWindow.setExitTransition(exitTransition);
        }
    }
}
