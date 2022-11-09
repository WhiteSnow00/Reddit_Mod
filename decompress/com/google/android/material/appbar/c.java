// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.appbar;

import android.view.View;
import b4.g;

public final class c implements g
{
    public final /* synthetic */ AppBarLayout a;
    public final /* synthetic */ boolean b;
    
    public c(final AppBarLayout a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean a(final View view) {
        this.a.setExpanded(this.b);
        return true;
    }
}
