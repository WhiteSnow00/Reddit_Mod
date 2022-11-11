// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import v3.d;
import java.util.ArrayList;
import android.view.ViewParent;
import android.graphics.RectF;
import a4.q0$g;
import android.graphics.Rect;
import a4.t1;
import java.util.WeakHashMap;
import android.view.ViewGroup;
import a4.q0$i;
import a4.q0;
import java.util.List;
import android.view.View;

public abstract class u0
{
    public static void d(View view, final List list) {
        final int size = list.size();
        int i = 0;
        while (true) {
            while (i < size) {
                if (list.get(i) == view) {
                    final boolean b = true;
                    if (b) {
                        return;
                    }
                    final WeakHashMap<View, t1> a = q0.a;
                    if (q0$i.k(view) != null) {
                        list.add(view);
                    }
                    for (int j = size; j < list.size(); ++j) {
                        view = (View)list.get(j);
                        if (view instanceof ViewGroup) {
                            final ViewGroup viewGroup = (ViewGroup)view;
                            final int childCount = viewGroup.getChildCount();
                            int k = 0;
                        Label_0107:
                            while (k < childCount) {
                                final View child = viewGroup.getChildAt(k);
                                while (true) {
                                    for (int l = 0; l < size; ++l) {
                                        if (list.get(l) == child) {
                                            final boolean b2 = true;
                                            if (!b2 && q0$i.k(child) != null) {
                                                list.add(child);
                                            }
                                            ++k;
                                            continue Label_0107;
                                        }
                                    }
                                    final boolean b2 = false;
                                    continue;
                                }
                            }
                        }
                    }
                    return;
                }
                else {
                    ++i;
                }
            }
            final boolean b = false;
            continue;
        }
    }
    
    public static void g(final Rect rect, final View view) {
        final WeakHashMap<View, t1> a = q0.a;
        if (!q0$g.b(view)) {
            return;
        }
        final RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, (float)view.getWidth(), (float)view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset((float)view.getLeft(), (float)view.getTop());
        View view2;
        for (ViewParent viewParent = view.getParent(); viewParent instanceof View; viewParent = view2.getParent()) {
            view2 = (View)viewParent;
            rectF.offset((float)(-view2.getScrollX()), (float)(-view2.getScrollY()));
            view2.getMatrix().mapRect(rectF);
            rectF.offset((float)view2.getLeft(), (float)view2.getTop());
        }
        final int[] array = new int[2];
        view.getRootView().getLocationOnScreen(array);
        rectF.offset((float)array[0], (float)array[1]);
        rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }
    
    public static boolean h(final List list) {
        return list == null || list.isEmpty();
    }
    
    public abstract void a(final View p0, final Object p1);
    
    public abstract void b(final ArrayList p0, final Object p1);
    
    public abstract void c(final ViewGroup p0, final Object p1);
    
    public abstract boolean e(final Object p0);
    
    public abstract Object f(final Object p0);
    
    public abstract Object i(final Object p0, final Object p1, final Object p2);
    
    public abstract Object j(final Object p0, final Object p1);
    
    public abstract void k(final Object p0, final View p1, final ArrayList<View> p2);
    
    public abstract void l(final Object p0, final Object p1, final ArrayList p2, final Object p3, final ArrayList p4);
    
    public abstract void m(final View p0, final Object p1);
    
    public abstract void n(final Object p0, final Rect p1);
    
    public void o(final Object o, final d d, final m m) {
        m.run();
    }
    
    public abstract void p(final Object p0, final View p1, final ArrayList<View> p2);
    
    public abstract void q(final Object p0, final ArrayList<View> p1, final ArrayList<View> p2);
    
    public abstract Object r(final Object p0);
}
