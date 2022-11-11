// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.transformation;

import java.util.ArrayList;
import java.util.WeakHashMap;
import android.view.ViewTreeObserver$OnPreDrawListener;
import a4.p0;
import of.a;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout$c;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout$c<View>
{
    public int a;
    
    public ExpandableBehavior() {
        this.a = 0;
    }
    
    public ExpandableBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = 0;
    }
    
    public abstract boolean b(final CoordinatorLayout p0, final View p1, final View p2);
    
    public final boolean d(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
        final a a = (a)view2;
        final boolean a2 = a.a();
        final int n = 2;
        boolean b = false;
        Label_0064: {
            Label_0047: {
                if (a2) {
                    final int a3 = this.a;
                    if (a3 == 0) {
                        break Label_0047;
                    }
                    if (a3 == 2) {
                        break Label_0047;
                    }
                }
                else if (this.a == 1) {
                    break Label_0047;
                }
                b = false;
                break Label_0064;
            }
            b = true;
        }
        if (b) {
            int a4 = n;
            if (a.a()) {
                a4 = 1;
            }
            this.a = a4;
            this.v((View)a, view, a.a(), true);
            return true;
        }
        return false;
    }
    
    public final boolean h(final CoordinatorLayout coordinatorLayout, final View view, int i) {
        final WeakHashMap a = p0.a;
        if (!p0.g.c(view)) {
            final ArrayList e = coordinatorLayout.e(view);
            final int size = e.size();
            i = 0;
            while (true) {
                while (i < size) {
                    final View view2 = (View)e.get(i);
                    if (this.b(coordinatorLayout, view, view2)) {
                        final a a2 = (a)view2;
                        if (a2 == null) {
                            return false;
                        }
                        final boolean a3 = a2.a();
                        final int n = 2;
                        Label_0133: {
                            Label_0117: {
                                if (a3) {
                                    i = this.a;
                                    if (i == 0) {
                                        break Label_0117;
                                    }
                                    if (i == 2) {
                                        break Label_0117;
                                    }
                                }
                                else if (this.a == 1) {
                                    break Label_0117;
                                }
                                i = 0;
                                break Label_0133;
                            }
                            i = 1;
                        }
                        if (i != 0) {
                            i = n;
                            if (a2.a()) {
                                i = 1;
                            }
                            this.a = i;
                            view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new ViewTreeObserver$OnPreDrawListener() {
                                public final boolean onPreDraw() {
                                    view.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
                                    final ExpandableBehavior i = ExpandableBehavior.this;
                                    if (i.a == i) {
                                        final a h = a2;
                                        i.v((View)h, view, h.a(), false);
                                    }
                                    return false;
                                }
                            });
                            return false;
                        }
                        return false;
                    }
                    else {
                        ++i;
                    }
                }
                final a a2 = null;
                continue;
            }
        }
        return false;
    }
    
    public abstract void v(final View p0, final View p1, final boolean p2, final boolean p3);
}
