// 
// Decompiled by Procyon v0.6.0
// 

package t5;

import java.util.WeakHashMap;
import a4.l0$f;
import a4.l0;
import android.graphics.Rect;
import android.view.View;
import android.util.Property;
import android.os.Build$VERSION;

public final class z
{
    public static final d0 a;
    public static final z$a b;
    
    static {
        if (Build$VERSION.SDK_INT >= 29) {
            a = (d0)new e0();
        }
        else {
            a = new d0();
        }
        b = new Property<View, Float>() {
            public final Object get(final Object o) {
                return ((a0)z.a).u4((View)o);
            }
            
            public final void set(final Object o, final Object o2) {
                ((a0)z.a).v4((View)o, (float)o2);
            }
        };
        new Property<View, Rect>(Rect.class) {
            public final Object get(final Object o) {
                final View view = (View)o;
                final WeakHashMap a = l0.a;
                return l0$f.a(view);
            }
            
            public final void set(final Object o, final Object o2) {
                final View view = (View)o;
                final Rect rect = (Rect)o2;
                final WeakHashMap a = l0.a;
                l0$f.c(view, rect);
            }
        };
    }
    
    public static void a(final View view, final int n, final int n2, final int n3, final int n4) {
        ((c0)z.a).y4(view, n, n2, n3, n4);
    }
}
