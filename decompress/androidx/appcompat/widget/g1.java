// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import java.util.WeakHashMap;
import a4.l0$e;
import a4.l0;
import android.util.Log;
import android.graphics.Rect;
import android.view.View;
import android.os.Build$VERSION;
import java.lang.reflect.Method;

public final class g1
{
    public static Method a;
    public static final boolean b;
    
    static {
        b = (Build$VERSION.SDK_INT >= 27);
        try {
            if (!(g1.a = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class)).isAccessible()) {
                g1.a.setAccessible(true);
            }
        }
        catch (final NoSuchMethodException ex) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }
    
    public static boolean a(final View view) {
        final WeakHashMap a = l0.a;
        final int d = l0$e.d(view);
        boolean b = true;
        if (d != 1) {
            b = false;
        }
        return b;
    }
}
