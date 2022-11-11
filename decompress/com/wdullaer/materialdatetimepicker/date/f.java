// 
// Decompiled by Procyon v0.6.0
// 

package com.wdullaer.materialdatetimepicker.date;

import android.view.accessibility.AccessibilityRecord;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.AbsListView;
import java.util.Iterator;
import java.util.Calendar;
import android.widget.AdapterView;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.ListAdapter;
import android.view.ViewGroup$LayoutParams;
import android.content.Context;
import androidx.fragment.app.r;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListView;

public final class f extends ListView implements AdapterView$OnItemClickListener, DatePickerDialog$a
{
    public final a f;
    public f.f$a g;
    public int h;
    public int i;
    public TextViewWithCircularIndicator j;
    
    public f(final r r, final a f) {
        super((Context)r);
        this.f = f;
        final DatePickerDialog datePickerDialog = (DatePickerDialog)f;
        datePickerDialog.h.add(this);
        ((View)this).setLayoutParams(new ViewGroup$LayoutParams(-1, -2));
        final Resources resources = ((Context)r).getResources();
        int h;
        if (datePickerDialog.I == DatePickerDialog$Version.VERSION_1) {
            h = resources.getDimensionPixelOffset(2131166049);
        }
        else {
            h = resources.getDimensionPixelOffset(2131166050);
        }
        this.h = h;
        this.i = resources.getDimensionPixelOffset(2131166095);
        ((View)this).setVerticalFadingEdgeEnabled(true);
        ((View)this).setFadingEdgeLength(this.i / 3);
        ((AbsListView)this).setAdapter((ListAdapter)(this.g = new f.f$a(this, datePickerDialog.N.S0(), datePickerDialog.N.d0())));
        ((AdapterView)this).setOnItemClickListener((AdapterView$OnItemClickListener)this);
        ((AbsListView)this).setSelector((Drawable)new StateListDrawable());
        this.setDividerHeight(0);
        this.b();
    }
    
    public final void b() {
        ((BaseAdapter)this.g).notifyDataSetChanged();
        final DatePickerDialog datePickerDialog = (DatePickerDialog)this.f;
        ((View)this).post((Runnable)new he2.f(this, new d$a(datePickerDialog.f, datePickerDialog.p0()).b - ((DatePickerDialog)this.f).N.S0(), this.h / 2 - this.i / 2));
    }
    
    public int getFirstPositionOffset() {
        final View child = ((ViewGroup)this).getChildAt(0);
        if (child == null) {
            return 0;
        }
        return child.getTop();
    }
    
    public final void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4096) {
            ((AccessibilityRecord)accessibilityEvent).setFromIndex(0);
            ((AccessibilityRecord)accessibilityEvent).setToIndex(0);
        }
    }
    
    public final void onItemClick(final AdapterView<?> adapterView, final View view, int n, final long n2) {
        final DatePickerDialog datePickerDialog = (DatePickerDialog)this.f;
        if (datePickerDialog.y) {
            datePickerDialog.O.b();
        }
        final TextViewWithCircularIndicator j = (TextViewWithCircularIndicator)view;
        if (j != null) {
            final TextViewWithCircularIndicator i = this.j;
            if (j != i) {
                if (i != null) {
                    i.p = false;
                    ((View)i).requestLayout();
                }
                j.p = true;
                ((View)j).requestLayout();
                this.j = j;
            }
            final a f = this.f;
            n = Integer.valueOf(j.getText().toString());
            final DatePickerDialog datePickerDialog2 = (DatePickerDialog)f;
            datePickerDialog2.f.set(1, n);
            final Calendar f2 = datePickerDialog2.f;
            final int value = f2.get(5);
            n = f2.getActualMaximum(5);
            if (value > n) {
                f2.set(5, n);
            }
            datePickerDialog2.f = datePickerDialog2.N.v0(f2);
            final Iterator iterator = datePickerDialog2.h.iterator();
            while (iterator.hasNext()) {
                ((DatePickerDialog$a)iterator.next()).b();
            }
            datePickerDialog2.s0(0);
            datePickerDialog2.v0(true);
            ((BaseAdapter)this.g).notifyDataSetChanged();
        }
    }
}
