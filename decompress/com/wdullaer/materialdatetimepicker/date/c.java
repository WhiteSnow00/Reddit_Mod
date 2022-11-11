// 
// Decompiled by Procyon v0.6.0
// 

package com.wdullaer.materialdatetimepicker.date;

import android.view.accessibility.AccessibilityRecord;
import android.view.ViewGroup;
import va.o;
import android.view.accessibility.AccessibilityEvent;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.view.View;
import al0.g7;
import android.util.Log;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$p;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

public abstract class c extends RecyclerView implements DatePickerDialog$a
{
    public d$a r;
    public d s;
    public d$a t;
    public c.c$a u;
    public a v;
    
    public c(final Context context, final a controller) {
        super(context);
        final DatePickerDialog$ScrollOrientation j = ((DatePickerDialog)controller).J;
        boolean b;
        if (j == DatePickerDialog$ScrollOrientation.VERTICAL) {
            b = true;
        }
        else {
            b = false;
        }
        this.setLayoutManager((RecyclerView$o)new LinearLayoutManager(context, (int)(b ? 1 : 0), false));
        ((View)this).setLayoutParams((ViewGroup$LayoutParams)new RecyclerView$p(-1, -1));
        ((View)this).setVerticalScrollBarEnabled(false);
        ((View)this).setHorizontalScrollBarEnabled(false);
        ((ViewGroup)this).setClipChildren(false);
        this.setUpRecyclerView(j);
        this.setController(controller);
    }
    
    public final void b() {
        final DatePickerDialog datePickerDialog = (DatePickerDialog)this.v;
        final d$a d$a = new d$a(datePickerDialog.f, datePickerDialog.p0());
        final d$a r = this.r;
        r.getClass();
        r.b = d$a.b;
        r.c = d$a.c;
        r.d = d$a.d;
        final d$a t = this.t;
        t.getClass();
        t.b = d$a.b;
        t.c = d$a.c;
        t.d = d$a.d;
        final int n = (d$a.b - ((DatePickerDialog)this.v).N.S0()) * 12 + d$a.c - ((DatePickerDialog)this.v).N.V0().get(2);
        int n2 = 0;
        View child;
        while (true) {
            final int n3 = n2 + 1;
            child = ((ViewGroup)this).getChildAt(n2);
            if (child == null) {
                break;
            }
            final int top = child.getTop();
            if (Log.isLoggable("MonthFragment", 3)) {
                final StringBuilder r2 = a.r("child at ");
                r2.append(n3 - 1);
                r2.append(" has top ");
                r2.append(top);
                Log.d("MonthFragment", r2.toString());
            }
            if (top >= 0) {
                break;
            }
            n2 = n3;
        }
        if (child != null) {
            this.getChildAdapterPosition(child);
        }
        final d s = this.s;
        s.l = this.r;
        s.notifyDataSetChanged();
        if (Log.isLoggable("MonthFragment", 3)) {
            g7.v("GoTo position ", n, "MonthFragment");
        }
        this.setMonthDisplayed(this.t);
        ((View)this).clearFocus();
        ((View)this).post((Runnable)new va.a((Object)this, n, 3));
    }
    
    public abstract he2.d f(final a p0);
    
    public final void g() {
        final d s = this.s;
        if (s == null) {
            this.s = (d)this.f(this.v);
        }
        else {
            s.l = this.r;
            s.notifyDataSetChanged();
            final c.c$a u = this.u;
            if (u != null) {
                ((b)u).a(this.getMostVisiblePosition());
            }
        }
        this.setAdapter((RecyclerView$Adapter)this.s);
    }
    
    public int getCount() {
        return this.s.getItemCount();
    }
    
    public e getMostVisibleMonth() {
        final boolean b = ((DatePickerDialog)this.v).J == DatePickerDialog$ScrollOrientation.VERTICAL;
        int n;
        if (b) {
            n = ((View)this).getHeight();
        }
        else {
            n = ((View)this).getWidth();
        }
        e e = null;
        final int n2 = 0;
        int n4;
        int n3 = n4 = n2;
        int i = n2;
        while (i < n) {
            final View child = ((ViewGroup)this).getChildAt(n4);
            if (child == null) {
                break;
            }
            if (b) {
                i = child.getBottom();
            }
            else {
                i = child.getRight();
            }
            int n5;
            if (b) {
                n5 = child.getTop();
            }
            else {
                n5 = child.getLeft();
            }
            final int n6 = Math.min(i, n) - Math.max(0, n5);
            int n7 = n3;
            if (n6 > n3) {
                e = (e)child;
                n7 = n6;
            }
            ++n4;
            n3 = n7;
        }
        return e;
    }
    
    public int getMostVisiblePosition() {
        return this.getChildAdapterPosition((View)this.getMostVisibleMonth());
    }
    
    public c.c$a getOnPageListener() {
        return this.u;
    }
    
    public final void h(final d$a d$a) {
        if (d$a == null) {
            return;
        }
        for (int childCount = ((ViewGroup)this).getChildCount(), i = 0; i < childCount; ++i) {
            final View child = ((ViewGroup)this).getChildAt(i);
            if (child instanceof e) {
                final e e = (e)child;
                e.getClass();
                boolean b = false;
                Label_0123: {
                    if (d$a.b == e.p && d$a.c == e.o) {
                        final int d = d$a.d;
                        if (d <= e.x) {
                            final e.a a = e.A;
                            a.getAccessibilityNodeProvider((View)a.q).c(d, 64, (Bundle)null);
                            b = true;
                            break Label_0123;
                        }
                    }
                    b = false;
                }
                if (b) {
                    return;
                }
            }
        }
    }
    
    public final void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ((AccessibilityRecord)accessibilityEvent).setItemCount(-1);
    }
    
    public final void onLayout(final boolean b, int i, int childCount, final int n, final int n2) {
        super.onLayout(b, i, childCount, n, n2);
        while (true) {
            View child;
            d$a accessibilityFocus;
            for (childCount = ((ViewGroup)this).getChildCount(), i = 0; i < childCount; ++i) {
                child = ((ViewGroup)this).getChildAt(i);
                if (child instanceof e) {
                    accessibilityFocus = ((e)child).getAccessibilityFocus();
                    if (accessibilityFocus != null) {
                        this.h(accessibilityFocus);
                        return;
                    }
                }
            }
            accessibilityFocus = null;
            continue;
        }
    }
    
    public void setController(final a v) {
        this.v = v;
        ((DatePickerDialog)v).h.add(this);
        this.r = new d$a(((DatePickerDialog)this.v).p0());
        this.t = new d$a(((DatePickerDialog)this.v).p0());
        this.g();
    }
    
    public void setMonthDisplayed(final d$a d$a) {
        final int c = d$a.c;
    }
    
    public void setOnPageListener(final c.c$a u) {
        this.u = u;
    }
    
    public void setUpRecyclerView(final DatePickerDialog$ScrollOrientation datePickerDialog$ScrollOrientation) {
        ((View)this).setVerticalScrollBarEnabled(false);
        ((View)this).setFadingEdgeLength(0);
        int n;
        if (datePickerDialog$ScrollOrientation == DatePickerDialog$ScrollOrientation.VERTICAL) {
            n = 48;
        }
        else {
            n = 8388611;
        }
        new ge2.a(n, new o(this, 23)).a((RecyclerView)this);
    }
}
