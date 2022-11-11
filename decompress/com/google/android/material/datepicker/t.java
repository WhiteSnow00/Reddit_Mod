// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import java.util.Iterator;
import android.content.Context;
import java.util.Date;
import android.icu.util.TimeZone;
import android.icu.text.DateFormat;
import java.util.Locale;
import a81.e;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import java.util.Calendar;
import android.widget.BaseAdapter;

public final class t extends BaseAdapter
{
    public static final int j;
    public final s f;
    public final d<?> g;
    public c h;
    public final a i;
    
    static {
        j = a0.d(null).getMaximum(4);
    }
    
    public t(final s f, final d<?> g, final a i) {
        this.f = f;
        this.g = g;
        this.i = i;
    }
    
    public final int b() {
        return this.f.c();
    }
    
    public final Long c(final int n) {
        if (n >= this.f.c() && n <= this.d()) {
            final s f = this.f;
            final int c = f.c();
            final Calendar b = a0.b(f.f);
            b.set(5, n - c + 1);
            return b.getTimeInMillis();
        }
        return null;
    }
    
    public final int d() {
        return this.f.c() + this.f.k - 1;
    }
    
    public final int getCount() {
        return this.b() + this.f.k;
    }
    
    public final long getItemId(final int n) {
        return n / this.f.j;
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        final Context context = ((View)viewGroup).getContext();
        if (this.h == null) {
            this.h = new c(context);
        }
        TextView textView = (TextView)view;
        if (view == null) {
            textView = (TextView)e.j(viewGroup, 2131624895, viewGroup, false);
        }
        int n2 = n - this.b();
        Label_0248: {
            if (n2 >= 0) {
                final s f = this.f;
                if (n2 < f.k) {
                    ++n2;
                    ((View)textView).setTag((Object)f);
                    textView.setText((CharSequence)String.valueOf(n2));
                    final Calendar b = a0.b(this.f.f);
                    b.set(5, n2);
                    final long timeInMillis = b.getTimeInMillis();
                    if (this.f.i == new s(a0.c()).i) {
                        final DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMEd", Locale.getDefault());
                        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
                        ((View)textView).setContentDescription((CharSequence)instanceForSkeleton.format(new Date(timeInMillis)));
                    }
                    else {
                        final DateFormat instanceForSkeleton2 = DateFormat.getInstanceForSkeleton("yMMMEd", Locale.getDefault());
                        instanceForSkeleton2.setTimeZone(TimeZone.getTimeZone("UTC"));
                        ((View)textView).setContentDescription((CharSequence)instanceForSkeleton2.format(new Date(timeInMillis)));
                    }
                    ((View)textView).setVisibility(0);
                    textView.setEnabled(true);
                    break Label_0248;
                }
            }
            ((View)textView).setVisibility(8);
            textView.setEnabled(false);
        }
        final Long c = this.c(n);
        if (c != null) {
            if (this.i.i.K(c)) {
                textView.setEnabled(true);
                final Iterator<Long> iterator = this.g.e0().iterator();
                while (iterator.hasNext()) {
                    if (a0.a(c) == a0.a(iterator.next())) {
                        this.h.b.b(textView);
                        return (View)textView;
                    }
                }
                if (a0.c().getTimeInMillis() == c) {
                    this.h.c.b(textView);
                }
                else {
                    this.h.a.b(textView);
                }
            }
            else {
                textView.setEnabled(false);
                this.h.g.b(textView);
            }
        }
        return (View)textView;
    }
    
    public final boolean hasStableIds() {
        return true;
    }
}
