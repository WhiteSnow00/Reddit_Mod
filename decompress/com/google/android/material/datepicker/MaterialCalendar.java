// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import android.widget.TextView;
import android.os.BaseBundle;
import androidx.fragment.app.Fragment;
import android.os.Parcelable;
import androidx.recyclerview.widget.y;
import android.view.View$OnClickListener;
import com.google.android.material.button.MaterialButton;
import androidx.recyclerview.widget.GridLayoutManager;
import android.widget.ListAdapter;
import a4.p0;
import b4.c$b;
import android.widget.GridView;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import java.util.Calendar;
import java.util.GregorianCalendar;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class MaterialCalendar<S> extends x<S>
{
    public int g;
    public d<S> h;
    public a i;
    public s j;
    public MaterialCalendar.MaterialCalendar$CalendarSelector k;
    public c l;
    public RecyclerView m;
    public RecyclerView n;
    public View o;
    public View p;
    
    public final void n0(final s j) {
        final s f = ((v)this.n.getAdapter()).k.f;
        final Calendar f2 = f.f;
        if (!(f2 instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        final int i = j.i;
        final int k = f.i;
        final int h = j.h;
        final int h2 = f.h;
        final int n = h - h2 + (i - k) * 12;
        final s l = this.j;
        if (f2 instanceof GregorianCalendar) {
            final int n2 = n - (l.h - h2 + (l.i - k) * 12);
            final int abs = Math.abs(n2);
            boolean b = true;
            final boolean b2 = abs > 3;
            if (n2 <= 0) {
                b = false;
            }
            this.j = j;
            if (b2 && b) {
                this.n.scrollToPosition(n - 3);
                ((View)this.n).post((Runnable)new g(this, n));
            }
            else if (b2) {
                this.n.scrollToPosition(n + 3);
                ((View)this.n).post((Runnable)new g(this, n));
            }
            else {
                ((View)this.n).post((Runnable)new g(this, n));
            }
            return;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }
    
    public final void o0(final MaterialCalendar.MaterialCalendar$CalendarSelector k) {
        this.k = k;
        if (k == MaterialCalendar.MaterialCalendar$CalendarSelector.YEAR) {
            this.m.getLayoutManager().scrollToPosition(this.j.i - ((c0)this.m.getAdapter()).k.i.f.i);
            this.o.setVisibility(0);
            this.p.setVisibility(8);
        }
        else if (k == MaterialCalendar.MaterialCalendar$CalendarSelector.DAY) {
            this.o.setVisibility(8);
            this.p.setVisibility(0);
            this.n0(this.j);
        }
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = ((Fragment)this).getArguments();
        }
        this.g = ((BaseBundle)arguments).getInt("THEME_RES_ID_KEY");
        this.h = (d<S>)arguments.getParcelable("GRID_SELECTOR_KEY");
        this.i = (a)arguments.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.j = (s)arguments.getParcelable("CURRENT_MONTH_KEY");
    }
    
    public final View onCreateView(LayoutInflater cloneInContext, final ViewGroup viewGroup, final Bundle bundle) {
        final ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(((Fragment)this).getContext(), this.g);
        this.l = new c((Context)contextThemeWrapper);
        cloneInContext = cloneInContext.cloneInContext((Context)contextThemeWrapper);
        final s f = this.i.f;
        int n;
        int n2;
        if (com.google.android.material.datepicker.o.o0((Context)contextThemeWrapper)) {
            n = 2131624912;
            n2 = 1;
        }
        else {
            n = 2131624907;
            n2 = 0;
        }
        final View inflate = cloneInContext.inflate(n, viewGroup, false);
        final GridView gridView = (GridView)inflate.findViewById(2131430190);
        p0.l((View)gridView, (a4.a)new a4.a() {
            @Override
            public final void onInitializeAccessibilityNodeInfo(final View view, final b4.c c) {
                super.onInitializeAccessibilityNodeInfo(view, c);
                c.o((c$b)null);
            }
        });
        gridView.setAdapter((ListAdapter)new f());
        gridView.setNumColumns(f.j);
        ((View)gridView).setEnabled(false);
        (this.n = (RecyclerView)inflate.findViewById(2131430193)).setLayoutManager((RecyclerView.o)new MaterialCalendar$b(this, ((Fragment)this).getContext(), n2, n2));
        ((View)this.n).setTag((Object)"MONTHS_VIEW_GROUP_TAG");
        final v adapter = new v(contextThemeWrapper, this.h, this.i, new MaterialCalendar$d() {});
        this.n.setAdapter((RecyclerView.Adapter)adapter);
        final int integer = contextThemeWrapper.getResources().getInteger(2131492894);
        final RecyclerView m = (RecyclerView)inflate.findViewById(2131430196);
        this.m = m;
        if (m != null) {
            m.setHasFixedSize(true);
            this.m.setLayoutManager((RecyclerView.o)new GridLayoutManager((Context)contextThemeWrapper, integer, 1));
            this.m.setAdapter((RecyclerView.Adapter)new c0(this));
            this.m.addItemDecoration((RecyclerView.n)new h(this));
        }
        if (inflate.findViewById(2131430178) != null) {
            final MaterialButton materialButton = (MaterialButton)inflate.findViewById(2131430178);
            ((View)materialButton).setTag((Object)"SELECTOR_TOGGLE_TAG");
            p0.l((View)materialButton, (a4.a)new i(this));
            final MaterialButton materialButton2 = (MaterialButton)inflate.findViewById(2131430180);
            ((View)materialButton2).setTag((Object)"NAVIGATION_PREV_TAG");
            final MaterialButton materialButton3 = (MaterialButton)inflate.findViewById(2131430179);
            ((View)materialButton3).setTag((Object)"NAVIGATION_NEXT_TAG");
            this.o = inflate.findViewById(2131430196);
            this.p = inflate.findViewById(2131430189);
            this.o0(MaterialCalendar.MaterialCalendar$CalendarSelector.DAY);
            ((TextView)materialButton).setText((CharSequence)this.j.g);
            this.n.addOnScrollListener((RecyclerView.t)new j(this, adapter, materialButton));
            ((View)materialButton).setOnClickListener((View$OnClickListener)new k(this));
            ((View)materialButton3).setOnClickListener((View$OnClickListener)new l(this, adapter));
            ((View)materialButton2).setOnClickListener((View$OnClickListener)new m(this, adapter));
        }
        if (!com.google.android.material.datepicker.o.o0((Context)contextThemeWrapper)) {
            new y().b(this.n);
        }
        final RecyclerView n3 = this.n;
        final s j = this.j;
        final s f2 = adapter.k.f;
        if (f2.f instanceof GregorianCalendar) {
            n3.scrollToPosition(j.h - f2.h + (j.i - f2.i) * 12);
            return inflate;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }
    
    public final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ((BaseBundle)bundle).putInt("THEME_RES_ID_KEY", this.g);
        bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable)this.h);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", (Parcelable)this.i);
        bundle.putParcelable("CURRENT_MONTH_KEY", (Parcelable)this.j);
    }
}
