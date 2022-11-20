// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Calendar;
import android.view.View$OnClickListener;
import java.util.Locale;
import androidx.recyclerview.widget.RecyclerView$f0;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class c0 extends RecyclerView$Adapter<a>
{
    public final MaterialCalendar<?> k;
    
    public c0(final MaterialCalendar<?> k) {
        this.k = k;
    }
    
    public final int getItemCount() {
        return this.k.i.j;
    }
    
    public final void onBindViewHolder(final RecyclerView$f0 recyclerView$f0, int n) {
        final a a = (a)recyclerView$f0;
        n += this.k.i.f.i;
        final String string = ((View)a.f).getContext().getString(2131956032);
        a.f.setText((CharSequence)String.format(Locale.getDefault(), "%d", n));
        ((View)a.f).setContentDescription((CharSequence)String.format(string, n));
        final c l = this.k.l;
        final Calendar c = a0.c();
        b b;
        if (c.get(1) == n) {
            b = l.f;
        }
        else {
            b = l.d;
        }
        final Iterator iterator = this.k.h.c0().iterator();
        while (iterator.hasNext()) {
            c.setTimeInMillis((long)iterator.next());
            if (c.get(1) == n) {
                b = l.e;
            }
        }
        b.b(a.f);
        ((View)a.f).setOnClickListener((View$OnClickListener)new b0(this, n));
    }
    
    public final RecyclerView$f0 onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        return new a((TextView)d.d(viewGroup, 2131624907, viewGroup, false));
    }
    
    public static final class a extends RecyclerView$f0
    {
        public final TextView f;
        
        public a(final TextView f) {
            super((View)f);
            this.f = f;
        }
    }
}
