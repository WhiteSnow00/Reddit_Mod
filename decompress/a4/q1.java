// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import android.view.View;
import android.view.ViewParent;

public final class q1
{
    public static boolean a(final ViewParent viewParent, final View view, final float n, final float n2, final boolean b) {
        return viewParent.onNestedFling(view, n, n2, b);
    }
    
    public static boolean b(final ViewParent viewParent, final View view, final float n, final float n2) {
        return viewParent.onNestedPreFling(view, n, n2);
    }
    
    public static void c(final ViewParent viewParent, final View view, final int n, final int n2, final int[] array) {
        viewParent.onNestedPreScroll(view, n, n2, array);
    }
    
    public static void d(final ViewParent viewParent, final View view, final int n, final int n2, final int n3, final int n4) {
        viewParent.onNestedScroll(view, n, n2, n3, n4);
    }
    
    public static void e(final ViewParent viewParent, final View view, final View view2, final int n) {
        viewParent.onNestedScrollAccepted(view, view2, n);
    }
    
    public static boolean f(final ViewParent viewParent, final View view, final View view2, final int n) {
        return viewParent.onStartNestedScroll(view, view2, n);
    }
    
    public static void g(final ViewParent viewParent, final View view) {
        viewParent.onStopNestedScroll(view);
    }
}
