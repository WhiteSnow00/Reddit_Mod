// 
// Decompiled by Procyon v0.6.0
// 

package bg;

import android.graphics.Rect;
import android.graphics.Canvas;
import android.view.ViewParent;
import android.view.View;
import android.graphics.RectF;

public final class l
{
    public static final RectF a;
    
    static {
        a = new RectF();
    }
    
    public static View a(final int n, View view) {
        final String resourceName = view.getResources().getResourceName(n);
        while (view != null) {
            if (view.getId() == n) {
                return view;
            }
            final ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            view = (View)parent;
        }
        throw new IllegalArgumentException(b.l(resourceName, " is not a valid ancestor"));
    }
    
    public static RectF b(final View view) {
        final int[] array = new int[2];
        view.getLocationOnScreen(array);
        final int n = array[0];
        final int n2 = array[1];
        return new RectF((float)n, (float)n2, (float)(view.getWidth() + n), (float)(view.getHeight() + n2));
    }
    
    public static float c(final float n, final float n2, final float n3, final float n4, final float n5) {
        if (n5 < n3) {
            return n;
        }
        if (n5 > n4) {
            return n2;
        }
        return d.b(n2, n, (n5 - n3) / (n4 - n3), n);
    }
    
    public static int d(final int n, final int n2, final float n3, final float n4, final float n5) {
        if (n5 < n3) {
            return n;
        }
        if (n5 > n4) {
            return n2;
        }
        final float n6 = (float)n;
        return (int)d.b((float)n2, n6, (n5 - n3) / (n4 - n3), n6);
    }
    
    public static void e(final Canvas canvas, final Rect rect, final float n, final float n2, final float n3, final int n4, final a a) {
        if (n4 <= 0) {
            return;
        }
        final int save = canvas.save();
        canvas.translate(n, n2);
        canvas.scale(n3, n3);
        if (n4 < 255) {
            final RectF a2 = l.a;
            a2.set(rect);
            canvas.saveLayerAlpha(a2, n4);
        }
        a.a(canvas);
        canvas.restoreToCount(save);
    }
    
    public interface a
    {
        void a(final Canvas p0);
    }
}
