// 
// Decompiled by Procyon v0.6.0
// 

package u5;

import java.util.WeakHashMap;
import a4.p0;
import android.graphics.Rect;
import android.view.View;
import android.util.Property;
import android.os.Build$VERSION;

public final class x
{
    public static final b0 a;
    public static final x$a b;
    
    static {
        if (Build$VERSION.SDK_INT >= 29) {
            a = (b0)new c0();
        }
        else {
            a = new b0();
        }
        b = new Property<View, Float>() {
            public final Object get(final Object o) {
                return ((y)x.a).P2((View)o);
            }
            
            public final void set(final Object o, final Object o2) {
                ((y)x.a).Q2((View)o, (float)o2);
            }
        };
        new Property<View, Rect>(Rect.class) {
            public final Object get(final Object o) {
                final View view = (View)o;
                final WeakHashMap a = p0.a;
                return p0.f.a(view);
            }
            
            public final void set(final Object o, final Object o2) {
                final View view = (View)o;
                final Rect rect = (Rect)o2;
                final WeakHashMap a = p0.a;
                p0.f.c(view, rect);
            }
        };
    }
    
    public static void a(final View view, final int n, final int n2, final int n3, final int n4) {
        ((a0)x.a).U2(view, n, n2, n3, n4);
    }
}
