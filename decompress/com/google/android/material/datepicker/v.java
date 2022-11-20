// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import a4.l0$b;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.BaseAdapter;
import java.util.WeakHashMap;
import a4.k0;
import a4.l0;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$p;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView$f0;
import java.util.Calendar;
import android.content.Context;
import android.view.ContextThemeWrapper;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class v extends RecyclerView$Adapter<a>
{
    public final com.google.android.material.datepicker.a k;
    public final d<?> l;
    public final MaterialCalendar$d m;
    public final int n;
    
    public v(final ContextThemeWrapper contextThemeWrapper, final d l, final com.google.android.material.datepicker.a k, final MaterialCalendar.MaterialCalendar$c m) {
        final s f = k.f;
        final s g = k.g;
        final s h = k.h;
        if (f.f.compareTo(h.f) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (h.f.compareTo(g.f) <= 0) {
            final int j = t.j;
            final int q = MaterialCalendar.q;
            final int dimensionPixelSize = ((Context)contextThemeWrapper).getResources().getDimensionPixelSize(2131166193);
            int dimensionPixelSize2;
            if (o.p0((Context)contextThemeWrapper)) {
                dimensionPixelSize2 = ((Context)contextThemeWrapper).getResources().getDimensionPixelSize(2131166193);
            }
            else {
                dimensionPixelSize2 = 0;
            }
            this.n = dimensionPixelSize * j + dimensionPixelSize2;
            this.k = k;
            this.l = (d<?>)l;
            this.m = (MaterialCalendar$d)m;
            this.setHasStableIds(true);
            return;
        }
        throw new IllegalArgumentException("currentPage cannot be after lastPage");
    }
    
    public final int getItemCount() {
        return this.k.k;
    }
    
    public final long getItemId(final int n) {
        final Calendar b = a0.b(this.k.f.f);
        b.add(2, n);
        return new s(b).f.getTimeInMillis();
    }
    
    public final void onBindViewHolder(final RecyclerView$f0 recyclerView$f0, final int n) {
        final a a = (a)recyclerView$f0;
        final Calendar b = a0.b(this.k.f.f);
        b.add(2, n);
        final s s = new s(b);
        a.f.setText((CharSequence)s.g);
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView)((View)a.g).findViewById(2131430168);
        if (materialCalendarGridView.a() != null && s.equals((Object)materialCalendarGridView.a().f)) {
            ((BaseAdapter)materialCalendarGridView.a()).notifyDataSetChanged();
        }
        else {
            final t adapter = new t(s, (d)this.l, this.k);
            ((GridView)materialCalendarGridView).setNumColumns(s.j);
            materialCalendarGridView.setAdapter((ListAdapter)adapter);
        }
        ((AdapterView)materialCalendarGridView).setOnItemClickListener((AdapterView$OnItemClickListener)new u(this, materialCalendarGridView));
    }
    
    public final RecyclerView$f0 onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        final LinearLayout linearLayout = (LinearLayout)d.d(viewGroup, 2131624903, viewGroup, false);
        a a;
        if (o.p0(((View)viewGroup).getContext())) {
            ((View)linearLayout).setLayoutParams((ViewGroup$LayoutParams)new RecyclerView$p(-1, this.n));
            a = new a(linearLayout, true);
        }
        else {
            a = new a(linearLayout, false);
        }
        return a;
    }
    
    public static final class a extends RecyclerView$f0
    {
        public final TextView f;
        public final MaterialCalendarGridView g;
        
        public a(final LinearLayout linearLayout, final boolean b) {
            super((View)linearLayout);
            final TextView f = (TextView)((View)linearLayout).findViewById(2131430173);
            this.f = f;
            final WeakHashMap a = l0.a;
            ((l0$b)new k0()).e((View)f, (Object)Boolean.TRUE);
            this.g = (MaterialCalendarGridView)((View)linearLayout).findViewById(2131430168);
            if (!b) {
                ((View)f).setVisibility(8);
            }
        }
    }
}
