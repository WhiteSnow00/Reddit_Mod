// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import android.view.View;
import android.view.View$OnClickListener;

public final class b0 implements View$OnClickListener
{
    public final /* synthetic */ int f;
    public final /* synthetic */ c0 g;
    
    public b0(final c0 g, final int f) {
        this.g = g;
        this.f = f;
    }
    
    public final void onClick(final View view) {
        final s a = s.a(this.f, this.g.k.j.h);
        final a i = this.g.k.i;
        s s;
        if (a.f.compareTo(i.f.f) < 0) {
            s = i.f;
        }
        else {
            final s g = i.g;
            s = a;
            if (a.f.compareTo(g.f) > 0) {
                s = i.g;
            }
        }
        this.g.k.F(s);
        this.g.k.p0(MaterialCalendar.CalendarSelector.DAY);
    }
}
