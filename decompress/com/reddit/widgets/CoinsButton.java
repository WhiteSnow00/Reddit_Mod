// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.widgets;

import android.widget.TextView;
import android.view.View;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.InsetDrawable;
import n3.a;
import android.graphics.drawable.Drawable;
import sg2.e;
import android.util.AttributeSet;
import android.content.Context;
import lw0.b;
import android.graphics.Paint;
import android.graphics.Rect;
import kotlin.Metadata;
import q22.k;

@Metadata(bv = {}, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002R*\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\r" }, d2 = { "Lcom/reddit/widgets/CoinsButton;", "Lq22/k;", "Landroid/graphics/drawable/Drawable;", "getProgressBarDrawable", "getPlusDrawable", "", "value", "r", "Z", "isLoading", "()Z", "setLoading", "(Z)V", "ui_release" }, k = 1, mv = { 1, 7, 1 })
public final class CoinsButton extends k
{
    @Deprecated
    public static final int s;
    public final Rect o;
    public final boolean p;
    public final Paint q;
    public boolean r;
    
    static {
        s = b.k2(76.5f);
    }
    
    public CoinsButton(final Context context, final AttributeSet set) {
        e.f((Object)context, "context");
        boolean p2 = false;
        super(context, set, 0);
        this.o = new Rect();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            p2 = true;
        }
        this.p = p2;
        final Paint q = new Paint();
        q.setColor(q3.e.h(lq0.k.G(2130969595, context), CoinsButton.s));
        q.setStrokeWidth(((View)this).getResources().getDisplayMetrics().density);
        this.q = q;
        this.a();
    }
    
    private final Drawable getPlusDrawable() {
        final float density = ((View)this).getResources().getDisplayMetrics().density;
        final float n = 6 * density;
        final float n2 = density * 14;
        final Drawable drawable = a.getDrawable(((View)this).getContext(), 2131231840);
        e.c((Object)drawable);
        final Drawable mutate = drawable.mutate();
        final Context context = ((View)this).getContext();
        e.e((Object)context, "context");
        mutate.setTintList(lq0.k.H(2130969595, context));
        mutate.setBounds(0, 0, b.k2(n2), b.k2(n2));
        InsetDrawable insetDrawable;
        if (this.p) {
            insetDrawable = new InsetDrawable(mutate, 0, 0, b.k2(n), 0);
        }
        else {
            insetDrawable = new InsetDrawable(mutate, b.k2(n), 0, 0, 0);
        }
        ((Drawable)insetDrawable).setBounds(0, 0, b.k2(n2 + n), b.k2(n2));
        return (Drawable)insetDrawable;
    }
    
    private final Drawable getProgressBarDrawable() {
        final TypedArray obtainStyledAttributes = ((View)this).getContext().obtainStyledAttributes(16974454, new int[] { 16843067 });
        e.e((Object)obtainStyledAttributes, "context.obtainStyledAttr\u2026terminateDrawable),\n    )");
        final Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        Animatable animatable = null;
        Drawable drawable2;
        if (drawable != null) {
            final Context context = ((View)this).getContext();
            e.e((Object)context, "context");
            drawable.setTint(lq0.k.G(2130969578, context));
            final Integer drawableStartSize = this.getDrawableStartSize();
            e.c((Object)drawableStartSize);
            final int intValue = drawableStartSize;
            final Integer drawableStartSize2 = this.getDrawableStartSize();
            e.c((Object)drawableStartSize2);
            drawable.setBounds(0, 0, intValue, (int)drawableStartSize2);
            if (drawable instanceof Animatable) {
                animatable = (Animatable)drawable;
            }
            drawable2 = drawable;
            if (animatable != null) {
                animatable.start();
                drawable2 = drawable;
            }
        }
        else {
            drawable2 = null;
        }
        return drawable2;
    }
    
    public final void a() {
        Drawable drawable;
        if (this.r) {
            drawable = this.getProgressBarDrawable();
        }
        else {
            drawable = a.getDrawable(((View)this).getContext(), 2131231528);
        }
        this.setCompoundDrawablesRelative(drawable, (Drawable)null, this.getPlusDrawable(), (Drawable)null);
    }
    
    public final void onDraw(final Canvas canvas) {
        e.f((Object)canvas, "canvas");
        super.onDraw(canvas);
        ((TextView)this).getLineBounds(0, this.o);
        float n;
        if (this.p) {
            n = (float)(this.o.left - ((TextView)this).getCompoundDrawablePadding());
        }
        else {
            n = (float)(((TextView)this).getCompoundDrawablePadding() + this.o.right);
        }
        canvas.drawLine(n, 0.0f, n, (float)((View)this).getHeight(), this.q);
    }
    
    public final void setLoading(final boolean r) {
        this.r = r;
        this.a();
    }
}
