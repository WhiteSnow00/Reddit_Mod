// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.transformation;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import android.view.ViewParent;
import a4.l0$d;
import a4.l0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import oy0.b;
import ye.g;
import android.util.AttributeSet;
import android.content.Context;
import java.util.HashMap;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior
{
    public HashMap i;
    
    public FabTransformationSheetBehavior() {
    }
    
    public FabTransformationSheetBehavior(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final FabTransformationBehavior$b C(final Context context, final boolean b) {
        int n;
        if (b) {
            n = 2130837525;
        }
        else {
            n = 2130837524;
        }
        final FabTransformationBehavior$b fabTransformationBehavior$b = new FabTransformationBehavior$b();
        fabTransformationBehavior$b.a = g.b(n, context);
        fabTransformationBehavior$b.b = new b();
        return fabTransformationBehavior$b;
    }
    
    public final void v(final View view, final View view2, final boolean b, final boolean b2) {
        final ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            final CoordinatorLayout coordinatorLayout = (CoordinatorLayout)parent;
            final int childCount = ((ViewGroup)coordinatorLayout).getChildCount();
            if (b) {
                this.i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; ++i) {
                final View child = ((ViewGroup)coordinatorLayout).getChildAt(i);
                final boolean b3 = child.getLayoutParams() instanceof CoordinatorLayout.f && ((CoordinatorLayout.f)child.getLayoutParams()).a instanceof FabTransformationScrimBehavior;
                if (child != view2) {
                    if (!b3) {
                        if (!b) {
                            final HashMap j = this.i;
                            if (j != null && j.containsKey(child)) {
                                final int intValue = this.i.get(child);
                                final WeakHashMap a = l0.a;
                                l0$d.s(child, intValue);
                            }
                        }
                        else {
                            this.i.put(child, child.getImportantForAccessibility());
                            final WeakHashMap a2 = l0.a;
                            l0$d.s(child, 4);
                        }
                    }
                }
            }
            if (!b) {
                this.i = null;
            }
        }
        super.v(view, view2, b, b2);
    }
}
