// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import java.util.Locale;
import a81.e;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import android.os.Build$VERSION;
import java.util.Calendar;
import android.widget.BaseAdapter;

public final class f extends BaseAdapter
{
    public static final int i;
    public final Calendar f;
    public final int g;
    public final int h;
    
    static {
        int j;
        if (Build$VERSION.SDK_INT >= 26) {
            j = 4;
        }
        else {
            j = 1;
        }
        i = j;
    }
    
    public f() {
        final Calendar d = a0.d(null);
        this.f = d;
        this.g = d.getMaximum(7);
        this.h = d.getFirstDayOfWeek();
    }
    
    public final int getCount() {
        return this.g;
    }
    
    public final Object getItem(int n) {
        final int g = this.g;
        Object value;
        if (n >= g) {
            value = null;
        }
        else {
            final int n2 = n + this.h;
            if ((n = n2) > g) {
                n = n2 - g;
            }
            value = n;
        }
        return value;
    }
    
    public final long getItemId(final int n) {
        return 0L;
    }
    
    public final View getView(int n, final View view, final ViewGroup viewGroup) {
        TextView textView = (TextView)view;
        if (view == null) {
            textView = (TextView)e.j(viewGroup, 2131624896, viewGroup, false);
        }
        final Calendar f = this.f;
        final int n2 = n + this.h;
        final int g = this.g;
        if ((n = n2) > g) {
            n = n2 - g;
        }
        f.set(7, n);
        textView.setText((CharSequence)this.f.getDisplayName(7, com.google.android.material.datepicker.f.i, Locale.getDefault()));
        ((View)textView).setContentDescription((CharSequence)String.format(((View)viewGroup).getContext().getString(2131956001), this.f.getDisplayName(7, 2, Locale.getDefault())));
        return (View)textView;
    }
}
