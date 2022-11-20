// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b4.g;

public final class b implements g
{
    public final CoordinatorLayout a;
    public final AppBarLayout b;
    public final View c;
    public final int d;
    public final AppBarLayout$BaseBehavior e;
    
    public b(final AppBarLayout$BaseBehavior e, final CoordinatorLayout a, final AppBarLayout b, final View c, final int d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final boolean a(final View view) {
        this.e.H(this.a, this.b, this.c, this.d, new int[] { 0, 0 });
        return true;
    }
}
