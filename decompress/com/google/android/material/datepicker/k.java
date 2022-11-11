// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import android.view.View;
import android.view.View$OnClickListener;

public final class k implements View$OnClickListener
{
    public final /* synthetic */ MaterialCalendar f;
    
    public k(final MaterialCalendar f) {
        this.f = f;
    }
    
    public final void onClick(final View view) {
        final MaterialCalendar f = this.f;
        final MaterialCalendar.CalendarSelector k = f.k;
        final MaterialCalendar.CalendarSelector year = MaterialCalendar.CalendarSelector.YEAR;
        if (k == year) {
            f.p0(MaterialCalendar.CalendarSelector.DAY);
        }
        else if (k == MaterialCalendar.CalendarSelector.DAY) {
            f.p0(year);
        }
    }
}
