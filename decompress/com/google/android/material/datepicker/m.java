// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import java.util.Calendar;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.View;
import android.view.View$OnClickListener;

public final class m implements View$OnClickListener
{
    public final /* synthetic */ v f;
    public final /* synthetic */ MaterialCalendar g;
    
    public m(final MaterialCalendar g, final v f) {
        this.g = g;
        this.f = f;
    }
    
    public final void onClick(final View view) {
        final int n = ((LinearLayoutManager)this.g.n.getLayoutManager()).findLastVisibleItemPosition() - 1;
        if (n >= 0) {
            final MaterialCalendar g = this.g;
            final Calendar b = a0.b(this.f.k.f.f);
            b.add(2, n);
            g.F(new s(b));
        }
    }
}
