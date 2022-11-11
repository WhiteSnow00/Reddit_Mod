// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

public final class g implements Runnable
{
    public final /* synthetic */ int f;
    public final /* synthetic */ MaterialCalendar g;
    
    public g(final MaterialCalendar g, final int f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final void run() {
        this.g.n.smoothScrollToPosition(this.f);
    }
}
