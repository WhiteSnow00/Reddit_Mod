// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import android.view.View;
import android.view.View$OnClickListener;

public final class p implements View$OnClickListener
{
    public final /* synthetic */ o f;
    
    public p(final o f) {
        this.f = f;
    }
    
    public final void onClick(final View view) {
        final o f = this.f;
        ((View)f.v).setEnabled(f.k.Y());
        this.f.t.toggle();
        final o f2 = this.f;
        f2.s0(f2.t);
        this.f.q0();
    }
}
