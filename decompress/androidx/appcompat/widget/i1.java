// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import java.util.WeakHashMap;
import a4.p0;
import android.util.Log;
import android.graphics.Rect;
import android.view.View;
import android.os.Build$VERSION;
import java.lang.reflect.Method;

public final class i1
{
    public static Method a;
    public static final boolean b;
    
    static {
        b = (Build$VERSION.SDK_INT >= 27);
        try {
            if (!(i1.a = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class)).isAccessible()) {
                i1.a.setAccessible(true);
            }
        }
        catch (final NoSuchMethodException ex) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }
    
    public static boolean a(final View view) {
        final WeakHashMap a = p0.a;
        final int d = p0.e.d(view);
        boolean b = true;
        if (d != 1) {
            b = false;
        }
        return b;
    }
}
