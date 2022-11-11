// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;

public final class u implements AdapterView$OnItemClickListener
{
    public final /* synthetic */ MaterialCalendarGridView f;
    public final /* synthetic */ v g;
    
    public u(final v g, final MaterialCalendarGridView f) {
        this.g = g;
        this.f = f;
    }
    
    public final void onItemClick(final AdapterView<?> adapterView, final View view, final int n, long longValue) {
        final t a = this.f.a();
        if (n >= a.b() && n <= a.d()) {
            final MaterialCalendar.d m = this.g.m;
            longValue = this.f.a().c(n);
            final MaterialCalendar$c materialCalendar$c = (MaterialCalendar$c)m;
            if (materialCalendar$c.a.i.i.K(longValue)) {
                materialCalendar$c.a.h.m();
                final Iterator iterator = materialCalendar$c.a.f.iterator();
                while (iterator.hasNext()) {
                    ((w<S>)iterator.next()).a(materialCalendar$c.a.h.i());
                }
                materialCalendar$c.a.n.getAdapter().notifyDataSetChanged();
                final RecyclerView i = materialCalendar$c.a.m;
                if (i != null) {
                    i.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }
}
