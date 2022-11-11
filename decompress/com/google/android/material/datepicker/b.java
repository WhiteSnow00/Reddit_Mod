// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import a4.t1;
import java.util.WeakHashMap;
import tf.f$b;
import android.view.View;
import a4.q0$d;
import a4.q0;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import tf.f;
import android.widget.TextView;
import android.content.res.TypedArray;
import tf.a;
import qf.c;
import pd.r;
import android.content.Context;
import ej2.c0;
import tf.j;
import android.content.res.ColorStateList;
import android.graphics.Rect;

public final class b
{
    public final Rect a;
    public final ColorStateList b;
    public final ColorStateList c;
    public final ColorStateList d;
    public final int e;
    public final j f;
    
    public b(final ColorStateList c, final ColorStateList b, final ColorStateList d, final int e, final j f, final Rect a) {
        c0.F2(a.left);
        c0.F2(a.top);
        c0.F2(a.right);
        c0.F2(a.bottom);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static b a(int dimensionPixelSize, final Context context) {
        c0.D2(dimensionPixelSize != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(dimensionPixelSize, r.H);
        final Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        final ColorStateList a = c.a(context, obtainStyledAttributes, 4);
        final ColorStateList a2 = c.a(context, obtainStyledAttributes, 9);
        final ColorStateList a3 = c.a(context, obtainStyledAttributes, 7);
        dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        final j j = new j(tf.j.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), (tf.c)new a((float)0)));
        obtainStyledAttributes.recycle();
        return new b(a, a2, a3, dimensionPixelSize, j, rect);
    }
    
    public final void b(final TextView textView) {
        final f f = new f();
        final f f2 = new f();
        f.setShapeAppearanceModel(this.f);
        f2.setShapeAppearanceModel(this.f);
        f.l(this.c);
        final float k = (float)this.e;
        final ColorStateList d = this.d;
        f.f.k = k;
        f.invalidateSelf();
        final f$b f3 = f.f;
        if (f3.d != d) {
            f3.d = d;
            f.onStateChange(((Drawable)f).getState());
        }
        textView.setTextColor(this.b);
        final RippleDrawable rippleDrawable = new RippleDrawable(this.b.withAlpha(30), (Drawable)f, (Drawable)f2);
        final Rect a = this.a;
        final InsetDrawable insetDrawable = new InsetDrawable((Drawable)rippleDrawable, a.left, a.top, a.right, a.bottom);
        final WeakHashMap<View, t1> a2 = q0.a;
        q0$d.q((View)textView, (Drawable)insetDrawable);
    }
}
