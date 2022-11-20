// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.snackbar;

import android.view.View;
import android.view.WindowInsets;
import android.os.Build$VERSION;

public final class e implements BaseTransientBottomBar$e
{
    public final BaseTransientBottomBar a;
    
    public e(final BaseTransientBottomBar a) {
        this.a = a;
    }
    
    public final void a() {
        if (Build$VERSION.SDK_INT >= 29) {
            final WindowInsets rootWindowInsets = ((View)this.a.c).getRootWindowInsets();
            if (rootWindowInsets != null) {
                this.a.k = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                this.a.e();
            }
        }
    }
}
