// 
// Decompiled by Procyon v0.6.0
// 

package com.wdullaer.materialdatetimepicker.date;

import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.AbsListView$LayoutParams;
import android.view.ViewGroup;
import java.security.InvalidParameterException;
import androidx.recyclerview.widget.RecyclerView$f0;
import java.util.Calendar;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public abstract class d extends RecyclerView$Adapter<b> implements e$b
{
    public final a k;
    public d.d$a l;
    
    public d(final a k) {
        this.k = k;
        final long currentTimeMillis = System.currentTimeMillis();
        final DatePickerDialog datePickerDialog = (DatePickerDialog)k;
        this.l = new d.d$a(currentTimeMillis, datePickerDialog.p0());
        this.l = new d.d$a(datePickerDialog.f, datePickerDialog.p0());
        this.notifyDataSetChanged();
        this.setHasStableIds(true);
    }
    
    public final int getItemCount() {
        final Calendar y0 = ((DatePickerDialog)this.k).N.y0();
        final Calendar v0 = ((DatePickerDialog)this.k).N.V0();
        return y0.get(2) + y0.get(1) * 12 - (v0.get(2) + v0.get(1) * 12) + 1;
    }
    
    public final long getItemId(final int n) {
        return n;
    }
    
    public final void onBindViewHolder(final RecyclerView$f0 recyclerView$f0, int t) {
        final b b = (b)recyclerView$f0;
        final a k = this.k;
        final d.d$a l = this.l;
        b.getClass();
        final DatePickerDialog datePickerDialog = (DatePickerDialog)k;
        final int o = (datePickerDialog.N.V0().get(2) + t) % 12;
        t = (datePickerDialog.N.V0().get(2) + t) / 12;
        final int p2 = datePickerDialog.N.S0() + t;
        t = l.b;
        final int n = 0;
        if (t == p2 && l.c == o) {
            t = 1;
        }
        else {
            t = 0;
        }
        if (t != 0) {
            t = l.d;
        }
        else {
            t = -1;
        }
        final e e = (e)b.itemView;
        final int s = datePickerDialog.s;
        if (o == -1 && p2 == -1) {
            e.getClass();
            throw new InvalidParameterException("You must specify month and year for this view");
        }
        e.t = t;
        e.o = o;
        e.p = p2;
        final Calendar instance = Calendar.getInstance(((DatePickerDialog)e.f).p0(), ((DatePickerDialog)e.f).L);
        e.s = false;
        e.u = -1;
        e.y.set(2, e.o);
        e.y.set(1, e.p);
        e.y.set(5, 1);
        e.L = e.y.get(7);
        if (s != -1) {
            e.v = s;
        }
        else {
            e.v = e.y.getFirstDayOfWeek();
        }
        e.x = e.y.getActualMaximum(5);
        t = 0;
        int x;
        while (true) {
            x = e.x;
            if (t >= x) {
                break;
            }
            final int u = t + 1;
            final boolean b2 = e.p == instance.get(1) && e.o == instance.get(2) && u == instance.get(5);
            t = u;
            if (!b2) {
                continue;
            }
            e.s = true;
            e.u = u;
            t = u;
        }
        final int i = e.L;
        final int v = e.v;
        if ((t = i) < v) {
            t = i + e.w;
        }
        final int n2 = t - v + x;
        final int w = e.w;
        final int n3 = n2 / w;
        t = n;
        if (n2 % w > 0) {
            t = 1;
        }
        e.B = n3 + t;
        e.A.g();
        b.itemView.invalidate();
    }
    
    public final RecyclerView$f0 onCreateViewHolder(final ViewGroup viewGroup, final int n) {
        final he2.e e = new he2.e(((View)viewGroup).getContext(), ((d)this).k);
        ((View)e).setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-1, -1));
        ((View)e).setClickable(true);
        ((e)e).setOnDayClickListener((e$b)this);
        return new b(e);
    }
    
    public static final class b extends RecyclerView$f0
    {
        public b(final he2.e e) {
            super((View)e);
        }
    }
}
