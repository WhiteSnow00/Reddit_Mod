// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import android.widget.AdapterView;
import android.view.KeyEvent;
import android.graphics.Rect;
import java.util.Iterator;
import z3.c;
import android.graphics.Canvas;
import android.widget.ListAdapter;
import android.widget.Adapter;
import a4.a;
import android.view.View;
import a4.q0;
import android.util.AttributeSet;
import android.content.Context;
import java.util.Calendar;
import android.widget.GridView;

final class MaterialCalendarGridView extends GridView
{
    public final Calendar f;
    
    public MaterialCalendarGridView(final Context context, final AttributeSet set) {
        super(context, set, 0);
        this.f = a0.d(null);
        if (o.p0(((View)this).getContext())) {
            ((View)this).setNextFocusLeftId(2131428146);
            ((View)this).setNextFocusRightId(2131428421);
        }
        q0.l((View)this, (a)new n());
    }
    
    public final t a() {
        return (t)super.getAdapter();
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a().notifyDataSetChanged();
    }
    
    public final void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final t a = this.a();
        final d<?> g = a.g;
        final com.google.android.material.datepicker.c h = a.h;
        a.c(a.b());
        a.c(a.d());
        final Iterator iterator = g.I0().iterator();
        while (iterator.hasNext()) {
            ((c)iterator.next()).getClass();
        }
    }
    
    public final void onFocusChanged(final boolean b, final int n, final Rect rect) {
        if (b) {
            if (n == 33) {
                this.setSelection(this.a().d());
            }
            else if (n == 130) {
                this.setSelection(this.a().b());
            }
            else {
                super.onFocusChanged(true, n, rect);
            }
        }
        else {
            super.onFocusChanged(false, n, rect);
        }
    }
    
    public final boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        if (!super.onKeyDown(n, keyEvent)) {
            return false;
        }
        if (((AdapterView)this).getSelectedItemPosition() == -1 || ((AdapterView)this).getSelectedItemPosition() >= this.a().b()) {
            return true;
        }
        if (19 == n) {
            this.setSelection(this.a().b());
            return true;
        }
        return false;
    }
    
    public final void setAdapter(final ListAdapter adapter) {
        if (adapter instanceof t) {
            super.setAdapter(adapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), t.class.getCanonicalName()));
    }
    
    public final void setSelection(final int selection) {
        if (selection < this.a().b()) {
            super.setSelection(this.a().b());
        }
        else {
            super.setSelection(selection);
        }
    }
}
