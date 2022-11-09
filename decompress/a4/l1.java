// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import android.view.ViewGroup;

public final class l1
{
    public static int a(final ViewGroup viewGroup) {
        return viewGroup.getNestedScrollAxes();
    }
    
    public static boolean b(final ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }
    
    public static void c(final ViewGroup viewGroup, final boolean transitionGroup) {
        viewGroup.setTransitionGroup(transitionGroup);
    }
}
