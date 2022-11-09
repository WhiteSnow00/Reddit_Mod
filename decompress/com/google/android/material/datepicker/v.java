// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import android.widget.AdapterView;
import android.widget.GridView;
import java.util.WeakHashMap;
import a4.o0;
import a4.p0;
import android.view.View;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import ak0.m;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListAdapter;
import java.util.Calendar;
import android.content.Context;
import android.view.ContextThemeWrapper;
import androidx.recyclerview.widget.RecyclerView;

public final class v extends Adapter<a>
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
            final int dimensionPixelSize = ((Context)contextThemeWrapper).getResources().getDimensionPixelSize(2131166196);
            int dimensionPixelSize2;
            if (o.o0((Context)contextThemeWrapper)) {
                dimensionPixelSize2 = ((Context)contextThemeWrapper).getResources().getDimensionPixelSize(2131166196);
            }
            else {
                dimensionPixelSize2 = 0;
            }
            this.n = dimensionPixelSize * j + dimensionPixelSize2;
            this.k = k;
            this.l = (d<?>)l;
            this.m = (MaterialCalendar$d)m;
            ((RecyclerView.Adapter)this).setHasStableIds(true);
            return;
        }
        throw new IllegalArgumentException("currentPage cannot be after lastPage");
    }
    
    @Override
    public final int getItemCount() {
        return this.k.k;
    }
    
    @Override
    public final long getItemId(final int n) {
        final Calendar b = a0.b(this.k.f.f);
        b.add(2, n);
        return new s(b).f.getTimeInMillis();
    }
    
    @Override
    public final void onBindViewHolder(final RecyclerView.f0 f0, final int n) {
        final a a = (a)f0;
        final Calendar b = a0.b(this.k.f.f);
        b.add(2, n);
        final s s = new s(b);
        a.f.setText((CharSequence)s.g);
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView)((View)a.g).findViewById(2131430176);
        if (materialCalendarGridView.a() != null && s.equals(materialCalendarGridView.a().f)) {
            materialCalendarGridView.a().notifyDataSetChanged();
        }
        else {
            final t adapter = new t(s, this.l, this.k);
            ((GridView)materialCalendarGridView).setNumColumns(s.j);
            materialCalendarGridView.setAdapter((ListAdapter)adapter);
        }
        ((AdapterView)materialCalendarGridView).setOnItemClickListener((AdapterView$OnItemClickListener)new u(this, materialCalendarGridView));
    }
    
    @Override
    public final RecyclerView.f0 onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        final LinearLayout linearLayout = (LinearLayout)ak0.m.h(viewGroup, 2131624909, viewGroup, false);
        a a;
        if (o.o0(((View)viewGroup).getContext())) {
            ((View)linearLayout).setLayoutParams((ViewGroup$LayoutParams)new RecyclerView.p(-1, this.n));
            a = new a(linearLayout, true);
        }
        else {
            a = new a(linearLayout, false);
        }
        return a;
    }
    
    public static final class a extends f0
    {
        public final TextView f;
        public final MaterialCalendarGridView g;
        
        public a(final LinearLayout linearLayout, final boolean b) {
            super((View)linearLayout);
            final TextView f = (TextView)((View)linearLayout).findViewById(2131430181);
            this.f = f;
            final WeakHashMap a = p0.a;
            ((p0.b<Boolean>)new o0()).e((View)f, Boolean.TRUE);
            this.g = (MaterialCalendarGridView)((View)linearLayout).findViewById(2131430176);
            if (!b) {
                ((View)f).setVisibility(8);
            }
        }
    }
}
