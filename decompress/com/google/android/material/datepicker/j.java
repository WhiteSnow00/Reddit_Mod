// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import android.widget.TextView;
import android.view.View;
import java.util.Calendar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import androidx.recyclerview.widget.RecyclerView$t;

public final class j extends RecyclerView$t
{
    public final v f;
    public final MaterialButton g;
    public final MaterialCalendar h;
    
    public j(final MaterialCalendar h, final v f, final MaterialButton g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    public final void onScrollStateChanged(final RecyclerView recyclerView, final int n) {
        if (n == 0) {
            ((View)recyclerView).announceForAccessibility(((TextView)this.g).getText());
        }
    }
    
    public final void onScrolled(final RecyclerView recyclerView, int n, final int n2) {
        if (n < 0) {
            n = ((LinearLayoutManager)this.h.n.getLayoutManager()).findFirstVisibleItemPosition();
        }
        else {
            n = ((LinearLayoutManager)this.h.n.getLayoutManager()).findLastVisibleItemPosition();
        }
        final MaterialCalendar h = this.h;
        final Calendar b = a0.b(this.f.k.f.f);
        b.add(2, n);
        h.j = new s(b);
        final MaterialButton g = this.g;
        final Calendar b2 = a0.b(this.f.k.f.f);
        b2.add(2, n);
        ((TextView)g).setText((CharSequence)new s(b2).g);
    }
}
