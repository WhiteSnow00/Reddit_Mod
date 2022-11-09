// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.behavior;

import java.util.WeakHashMap;
import a4.p0;
import android.view.View;
import b4.g;

public final class a implements g
{
    public final /* synthetic */ SwipeDismissBehavior a;
    
    public a(final SwipeDismissBehavior a) {
        this.a = a;
    }
    
    public final boolean a(final View view) {
        final boolean v = this.a.v(view);
        final boolean b = false;
        if (v) {
            final WeakHashMap a = p0.a;
            final boolean b2 = p0.e.d(view) == 1;
            final int d = this.a.d;
            int n = 0;
            Label_0076: {
                if (d != 0 || !b2) {
                    n = (b ? 1 : 0);
                    if (d != 1) {
                        break Label_0076;
                    }
                    n = (b ? 1 : 0);
                    if (b2) {
                        break Label_0076;
                    }
                }
                n = 1;
            }
            int width = view.getWidth();
            if (n != 0) {
                width = -width;
            }
            view.offsetLeftAndRight(width);
            view.setAlpha(0.0f);
            final SwipeDismissBehavior.SwipeDismissBehavior$b b3 = this.a.b;
            if (b3 != null) {
                b3.a(view);
            }
            return true;
        }
        return false;
    }
}
