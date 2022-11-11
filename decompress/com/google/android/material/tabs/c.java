// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.tabs;

import android.view.View;
import android.view.View$OnLayoutChangeListener;

public final class c implements View$OnLayoutChangeListener
{
    public final /* synthetic */ View f;
    public final /* synthetic */ TabLayout.i g;
    
    public c(final TabLayout.i g, final View f) {
        this.g = g;
        this.f = f;
    }
    
    public final void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        if (this.f.getVisibility() == 0) {
            this.g.d(this.f);
        }
    }
}
