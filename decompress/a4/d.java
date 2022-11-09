// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import android.graphics.Insets;
import java.util.List;
import android.graphics.Rect;
import z3.b;
import android.view.DisplayCutout;

public final class d
{
    public final DisplayCutout a;
    
    public d(final DisplayCutout a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && d.class == o.getClass() && z3.b.a(this.a, ((d)o).a));
    }
    
    @Override
    public final int hashCode() {
        final DisplayCutout a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("DisplayCutoutCompat{");
        k.append(this.a);
        k.append("}");
        return k.toString();
    }
    
    public static final class a
    {
        public static DisplayCutout a(final Rect rect, final List<Rect> list) {
            return new DisplayCutout(rect, (List)list);
        }
        
        public static List<Rect> b(final DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }
        
        public static int c(final DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }
        
        public static int d(final DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }
        
        public static int e(final DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }
        
        public static int f(final DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }
    
    public static final class b
    {
        public static DisplayCutout a(final Insets insets, final Rect rect, final Rect rect2, final Rect rect3, final Rect rect4, final Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }
        
        public static Insets b(final DisplayCutout displayCutout) {
            return e.a(displayCutout);
        }
    }
}
