// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import android.widget.TextView;
import android.view.View;
import java.util.Calendar;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.button.MaterialButton;
import androidx.recyclerview.widget.RecyclerView;

public final class j extends t
{
    public final /* synthetic */ v f;
    public final /* synthetic */ MaterialButton g;
    public final /* synthetic */ MaterialCalendar h;
    
    public j(final MaterialCalendar h, final v f, final MaterialButton g) {
        this.h = h;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void onScrollStateChanged(final RecyclerView recyclerView, final int n) {
        if (n == 0) {
            ((View)recyclerView).announceForAccessibility(((TextView)this.g).getText());
        }
    }
    
    @Override
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
