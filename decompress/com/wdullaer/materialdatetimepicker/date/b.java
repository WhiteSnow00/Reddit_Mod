// 
// Decompiled by Procyon v0.6.0
// 

package com.wdullaer.materialdatetimepicker.date;

import androidx.recyclerview.widget.RecyclerView;
import android.widget.ImageView;
import android.view.View$MeasureSpec;
import a4.t1;
import java.util.WeakHashMap;
import a4.q0$e;
import a4.q0;
import java.util.Locale;
import android.util.Log;
import ge2.d;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.content.Context;
import androidx.fragment.app.r;
import he2.c;
import android.widget.ImageButton;
import android.view.View$OnClickListener;
import android.view.ViewGroup;

public final class b extends ViewGroup implements View$OnClickListener, c$a
{
    public ImageButton f;
    public ImageButton g;
    public c h;
    public a i;
    
    public b(final r r, final a i) {
        super((Context)r);
        this.i = i;
        this.addView((View)(this.h = new c(((View)this).getContext(), this.i)));
        final ViewGroup viewGroup = (ViewGroup)LayoutInflater.from(((View)this).getContext()).inflate(2131624768, (ViewGroup)this, false);
        while (viewGroup.getChildCount() > 0) {
            final View child = viewGroup.getChildAt(0);
            viewGroup.removeViewAt(0);
            this.addView(child);
        }
        this.f = (ImageButton)((View)this).findViewById(2131430041);
        this.g = (ImageButton)((View)this).findViewById(2131430038);
        if (((DatePickerDialog)this.i).I == DatePickerDialog$Version.VERSION_1) {
            final int n = (int)TypedValue.applyDimension(1, 16.0f, ((View)this).getResources().getDisplayMetrics());
            ((View)this.f).setMinimumHeight(n);
            ((View)this.f).setMinimumWidth(n);
            ((View)this.g).setMinimumHeight(n);
            ((View)this.g).setMinimumWidth(n);
        }
        if (((DatePickerDialog)this.i).v) {
            final int color = n3.a.getColor(((View)this).getContext(), 2131100193);
            ((ImageView)this.f).setColorFilter(color);
            ((ImageView)this.g).setColorFilter(color);
        }
        ((View)this.f).setOnClickListener((View$OnClickListener)this);
        ((View)this.g).setOnClickListener((View$OnClickListener)this);
        ((com.wdullaer.materialdatetimepicker.date.c)this.h).setOnPageListener((c$a)this);
    }
    
    public final void a(int p) {
        this.b(p);
        final c h = this.h;
        final e mostVisibleMonth = ((com.wdullaer.materialdatetimepicker.date.c)h).getMostVisibleMonth();
        if (mostVisibleMonth != null) {
            final int o = mostVisibleMonth.o;
            p = mostVisibleMonth.p;
            final Locale l = ((DatePickerDialog)((com.wdullaer.materialdatetimepicker.date.c)h).v).L;
            final Calendar instance = Calendar.getInstance();
            instance.set(2, o);
            instance.set(1, p);
            d.e((ViewGroup)h, new SimpleDateFormat("MMMM yyyy", l).format(instance.getTime()));
        }
        else {
            Log.w("DayPickerView", "Tried to announce before layout was initialized");
        }
    }
    
    public final void b(int visibility) {
        final DatePickerDialog$ScrollOrientation j = ((DatePickerDialog)this.i).J;
        final DatePickerDialog$ScrollOrientation horizontal = DatePickerDialog$ScrollOrientation.HORIZONTAL;
        final int n = 1;
        final int n2 = 0;
        final boolean b = j == horizontal;
        final boolean b2 = visibility > 0;
        if (visibility < ((com.wdullaer.materialdatetimepicker.date.c)this.h).getCount() - 1) {
            visibility = n;
        }
        else {
            visibility = 0;
        }
        final ImageButton f = this.f;
        int visibility2;
        if (b && b2) {
            visibility2 = 0;
        }
        else {
            visibility2 = 4;
        }
        ((View)f).setVisibility(visibility2);
        final ImageButton g = this.g;
        if (b && visibility != 0) {
            visibility = n2;
        }
        else {
            visibility = 4;
        }
        ((View)g).setVisibility(visibility);
    }
    
    public int getMostVisiblePosition() {
        return ((com.wdullaer.materialdatetimepicker.date.c)this.h).getMostVisiblePosition();
    }
    
    public final void onClick(final View view) {
        int n;
        if (this.g == view) {
            n = 1;
        }
        else {
            if (this.f != view) {
                return;
            }
            n = -1;
        }
        final int n2 = ((com.wdullaer.materialdatetimepicker.date.c)this.h).getMostVisiblePosition() + n;
        if (n2 >= 0 && n2 < ((com.wdullaer.materialdatetimepicker.date.c)this.h).getCount()) {
            ((RecyclerView)this.h).smoothScrollToPosition(n2);
            this.b(n2);
        }
    }
    
    public final void onLayout(final boolean b, int n, int cellWidth, int edgePadding, int monthHeight) {
        final WeakHashMap<View, t1> a = q0.a;
        ImageButton imageButton;
        ImageButton imageButton2;
        if (q0$e.d((View)this) == 1) {
            imageButton = this.g;
            imageButton2 = this.f;
        }
        else {
            imageButton = this.f;
            imageButton2 = this.g;
        }
        int dimensionPixelSize;
        if (((DatePickerDialog)this.i).I == DatePickerDialog$Version.VERSION_1) {
            dimensionPixelSize = 0;
        }
        else {
            dimensionPixelSize = ((View)this).getContext().getResources().getDimensionPixelSize(2131166054);
        }
        n = edgePadding - n;
        ((View)this.h).layout(0, dimensionPixelSize, n, monthHeight - cellWidth);
        final he2.e e = (he2.e)((ViewGroup)this.h).getChildAt(0);
        monthHeight = ((e)e).getMonthHeight();
        cellWidth = ((e)e).getCellWidth();
        edgePadding = ((e)e).getEdgePadding();
        final int measuredWidth = ((View)imageButton).getMeasuredWidth();
        final int measuredHeight = ((View)imageButton).getMeasuredHeight();
        final int n2 = (monthHeight - measuredHeight) / 2 + (((View)e).getPaddingTop() + dimensionPixelSize);
        final int n3 = (cellWidth - measuredWidth) / 2 + edgePadding;
        ((View)imageButton).layout(n3, n2, measuredWidth + n3, measuredHeight + n2);
        final int measuredWidth2 = ((View)imageButton2).getMeasuredWidth();
        final int measuredHeight2 = ((View)imageButton2).getMeasuredHeight();
        monthHeight = (monthHeight - measuredHeight2) / 2 + (((View)e).getPaddingTop() + dimensionPixelSize);
        n = n - edgePadding - (cellWidth - measuredWidth2) / 2 - 2;
        ((View)imageButton2).layout(n - measuredWidth2, monthHeight, n, measuredHeight2 + monthHeight);
    }
    
    public final void onMeasure(int n, int n2) {
        this.measureChild((View)this.h, n, n2);
        ((View)this).setMeasuredDimension(((View)this.h).getMeasuredWidthAndState(), ((View)this.h).getMeasuredHeightAndState());
        n2 = ((View)this.h).getMeasuredWidth();
        n = ((View)this.h).getMeasuredHeight();
        n2 = View$MeasureSpec.makeMeasureSpec(n2, Integer.MIN_VALUE);
        n = View$MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE);
        ((View)this.f).measure(n2, n);
        ((View)this.g).measure(n2, n);
    }
}
