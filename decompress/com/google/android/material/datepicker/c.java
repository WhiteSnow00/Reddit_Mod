// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import pd.r;
import android.content.Context;
import android.graphics.Paint;

public final class c
{
    public final b a;
    public final b b;
    public final b c;
    public final b d;
    public final b e;
    public final b f;
    public final b g;
    public final Paint h;
    
    public c(final Context context) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(qf.b.b(context, 2130969392, MaterialCalendar.class.getCanonicalName()), r.G);
        this.a = com.google.android.material.datepicker.b.a(obtainStyledAttributes.getResourceId(3, 0), context);
        this.g = com.google.android.material.datepicker.b.a(obtainStyledAttributes.getResourceId(1, 0), context);
        this.b = com.google.android.material.datepicker.b.a(obtainStyledAttributes.getResourceId(2, 0), context);
        this.c = com.google.android.material.datepicker.b.a(obtainStyledAttributes.getResourceId(4, 0), context);
        final ColorStateList a = qf.c.a(context, obtainStyledAttributes, 5);
        this.d = com.google.android.material.datepicker.b.a(obtainStyledAttributes.getResourceId(7, 0), context);
        this.e = com.google.android.material.datepicker.b.a(obtainStyledAttributes.getResourceId(6, 0), context);
        this.f = com.google.android.material.datepicker.b.a(obtainStyledAttributes.getResourceId(8, 0), context);
        (this.h = new Paint()).setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
