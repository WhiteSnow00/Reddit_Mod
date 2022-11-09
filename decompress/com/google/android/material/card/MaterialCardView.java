// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.card;

import android.graphics.drawable.DrawableWrapper;
import android.view.accessibility.AccessibilityRecord;
import android.graphics.drawable.InsetDrawable;
import eg.n0;
import android.util.Log;
import java.util.WeakHashMap;
import a4.p0;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import a4.u1;
import vf.j;
import android.graphics.Rect;
import android.os.Build$VERSION;
import android.graphics.RectF;
import vf.f$b;
import android.graphics.drawable.RippleDrawable;
import vf.f;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.content.res.ColorStateList;
import sf.c;
import qf.g;
import pj2.u;
import ag.a;
import android.util.AttributeSet;
import android.content.Context;
import hf.b;
import vf.n;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;

public class MaterialCardView extends CardView implements Checkable, n
{
    public static final int[] q;
    public static final int[] r;
    public static final int[] s;
    public final b m;
    public boolean n;
    public boolean o;
    public boolean p;
    
    static {
        q = new int[] { 16842911 };
        r = new int[] { 16842912 };
        s = new int[] { 2130969832 };
    }
    
    public MaterialCardView(final Context context, final AttributeSet set) {
        super(a.a(context, set, 2130969401, 2132018111), set, 2130969401);
        this.o = false;
        this.p = false;
        this.n = true;
        final TypedArray d = g.d(((View)this).getContext(), set, u.H, 2130969401, 2132018111, new int[0]);
        final b m = new b(this, set);
        this.m = m;
        m.c.l(super.getCardBackgroundColor());
        m.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        m.h();
        final ColorStateList a = c.a(((View)m.a).getContext(), d, 8);
        m.m = a;
        if (a == null) {
            m.m = ColorStateList.valueOf(-1);
        }
        m.g = d.getDimensionPixelSize(9, 0);
        final boolean boolean1 = d.getBoolean(0, false);
        m.r = boolean1;
        ((View)m.a).setLongClickable(boolean1);
        m.k = c.a(((View)m.a).getContext(), d, 3);
        m.e(c.c(((View)m.a).getContext(), d, 2));
        if ((m.j = c.a(((View)m.a).getContext(), d, 4)) == null) {
            m.j = ColorStateList.valueOf(yd.a.m1(2130968820, (View)m.a));
        }
        final ColorStateList a2 = c.a(((View)m.a).getContext(), d, 1);
        final f d2 = m.d;
        ColorStateList value;
        if ((value = a2) == null) {
            value = ColorStateList.valueOf(0);
        }
        d2.l(value);
        final int[] a3 = tf.a.a;
        final RippleDrawable n = m.n;
        if (n != null) {
            n.setColor(m.j);
        }
        m.c.k(m.a.getCardElevation());
        final f d3 = m.d;
        final float k = (float)m.g;
        final ColorStateList i = m.m;
        d3.f.k = k;
        d3.invalidateSelf();
        final f$b f = d3.f;
        if (f.d != i) {
            f.d = i;
            d3.onStateChange(((Drawable)d3).getState());
        }
        m.a.setBackgroundInternal((Drawable)m.d((Drawable)m.c));
        Object h;
        if (((View)m.a).isClickable()) {
            h = m.c();
        }
        else {
            h = m.d;
        }
        m.h = (Drawable)h;
        ((View)m.a).setForeground((Drawable)m.d((Drawable)h));
        d.recycle();
    }
    
    private RectF getBoundsAsRectF() {
        final RectF rectF = new RectF();
        rectF.set(((Drawable)this.m.c).getBounds());
        return rectF;
    }
    
    public final void d() {
        if (Build$VERSION.SDK_INT > 26) {
            final b m = this.m;
            final RippleDrawable n = m.n;
            if (n != null) {
                final Rect bounds = ((Drawable)n).getBounds();
                final int bottom = bounds.bottom;
                ((Drawable)m.n).setBounds(bounds.left, bounds.top, bounds.right, bottom - 1);
                ((Drawable)m.n).setBounds(bounds.left, bounds.top, bounds.right, bottom);
            }
        }
    }
    
    public ColorStateList getCardBackgroundColor() {
        return this.m.c.f.c;
    }
    
    public ColorStateList getCardForegroundColor() {
        return this.m.d.f.c;
    }
    
    public float getCardViewRadius() {
        return super.getRadius();
    }
    
    public Drawable getCheckedIcon() {
        return this.m.i;
    }
    
    public ColorStateList getCheckedIconTint() {
        return this.m.k;
    }
    
    public int getContentPaddingBottom() {
        return this.m.b.bottom;
    }
    
    public int getContentPaddingLeft() {
        return this.m.b.left;
    }
    
    public int getContentPaddingRight() {
        return this.m.b.right;
    }
    
    public int getContentPaddingTop() {
        return this.m.b.top;
    }
    
    public float getProgress() {
        return this.m.c.f.j;
    }
    
    public float getRadius() {
        return this.m.c.h();
    }
    
    public ColorStateList getRippleColor() {
        return this.m.j;
    }
    
    public j getShapeAppearanceModel() {
        return this.m.l;
    }
    
    @Deprecated
    public int getStrokeColor() {
        final ColorStateList m = this.m.m;
        int defaultColor;
        if (m == null) {
            defaultColor = -1;
        }
        else {
            defaultColor = m.getDefaultColor();
        }
        return defaultColor;
    }
    
    public ColorStateList getStrokeColorStateList() {
        return this.m.m;
    }
    
    public int getStrokeWidth() {
        return this.m.g;
    }
    
    public final boolean isChecked() {
        return this.o;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u1.c1((View)this, this.m.c);
    }
    
    public final int[] onCreateDrawableState(int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 3);
        final b m = this.m;
        if (m != null && m.r) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            View.mergeDrawableStates(onCreateDrawableState, MaterialCardView.q);
        }
        if (this.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, MaterialCardView.r);
        }
        if (this.p) {
            View.mergeDrawableStates(onCreateDrawableState, MaterialCardView.s);
        }
        return onCreateDrawableState;
    }
    
    public final void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ((AccessibilityRecord)accessibilityEvent).setClassName((CharSequence)"androidx.cardview.widget.CardView");
        ((AccessibilityRecord)accessibilityEvent).setChecked(this.isChecked());
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"androidx.cardview.widget.CardView");
        final b m = this.m;
        accessibilityNodeInfo.setCheckable(m != null && m.r);
        accessibilityNodeInfo.setClickable(((View)this).isClickable());
        accessibilityNodeInfo.setChecked(this.isChecked());
    }
    
    public final void onMeasure(int measuredHeight, int e) {
        super.onMeasure(measuredHeight, e);
        final b m = this.m;
        final int measuredWidth = ((View)this).getMeasuredWidth();
        measuredHeight = ((View)this).getMeasuredHeight();
        if (m.o != null) {
            e = m.e;
            final int f = m.f;
            final int n = measuredWidth - e - f;
            final int n2 = e = measuredHeight - e - f;
            measuredHeight = n;
            if (m.a.getUseCompatPadding()) {
                final float maxCardElevation = m.a.getMaxCardElevation();
                final boolean g = m.g();
                final float n3 = 0.0f;
                float a;
                if (g) {
                    a = m.a();
                }
                else {
                    a = 0.0f;
                }
                e = n2 - (int)Math.ceil((maxCardElevation * 1.5f + a) * 2.0f);
                final float maxCardElevation2 = m.a.getMaxCardElevation();
                float a2 = n3;
                if (m.g()) {
                    a2 = m.a();
                }
                measuredHeight = n - (int)Math.ceil((maxCardElevation2 + a2) * 2.0f);
            }
            int e2 = m.e;
            final MaterialCardView a3 = m.a;
            final WeakHashMap a4 = p0.a;
            int n4;
            if (p0.e.d((View)a3) == 1) {
                n4 = measuredHeight;
            }
            else {
                n4 = e2;
                e2 = measuredHeight;
            }
            m.o.setLayerInset(2, e2, m.e, n4, e);
        }
    }
    
    public void setBackground(final Drawable backgroundDrawable) {
        this.setBackgroundDrawable(backgroundDrawable);
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        if (this.n) {
            if (!this.m.q) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.m.q = true;
            }
            super.setBackgroundDrawable(backgroundDrawable);
        }
    }
    
    public void setBackgroundInternal(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
    }
    
    public void setCardBackgroundColor(final int n) {
        this.m.c.l(ColorStateList.valueOf(n));
    }
    
    public void setCardBackgroundColor(final ColorStateList list) {
        this.m.c.l(list);
    }
    
    public void setCardElevation(final float cardElevation) {
        super.setCardElevation(cardElevation);
        final b m = this.m;
        m.c.k(m.a.getCardElevation());
    }
    
    public void setCardForegroundColor(final ColorStateList list) {
        final f d = this.m.d;
        ColorStateList value = list;
        if (list == null) {
            value = ColorStateList.valueOf(0);
        }
        d.l(value);
    }
    
    public void setCheckable(final boolean r) {
        this.m.r = r;
    }
    
    public void setChecked(final boolean b) {
        if (this.o != b) {
            this.toggle();
        }
    }
    
    public void setCheckedIcon(final Drawable drawable) {
        this.m.e(drawable);
    }
    
    public void setCheckedIconResource(final int n) {
        this.m.e(n0.L(((View)this).getContext(), n));
    }
    
    public void setCheckedIconTint(final ColorStateList k) {
        final b m = this.m;
        m.k = k;
        final Drawable i = m.i;
        if (i != null) {
            r3.a.b.h(i, k);
        }
    }
    
    public void setClickable(final boolean clickable) {
        super.setClickable(clickable);
        final b m = this.m;
        if (m != null) {
            final Drawable h = m.h;
            Object o;
            if (((View)m.a).isClickable()) {
                o = m.c();
            }
            else {
                o = m.d;
            }
            m.h = (Drawable)o;
            if (h != o) {
                if (((View)m.a).getForeground() instanceof InsetDrawable) {
                    ((DrawableWrapper)((View)m.a).getForeground()).setDrawable((Drawable)o);
                }
                else {
                    ((View)m.a).setForeground((Drawable)m.d((Drawable)o));
                }
            }
        }
    }
    
    public void setDragged(final boolean p) {
        if (this.p != p) {
            this.p = p;
            ((View)this).refreshDrawableState();
            this.d();
            ((View)this).invalidate();
        }
    }
    
    public void setMaxCardElevation(final float maxCardElevation) {
        super.setMaxCardElevation(maxCardElevation);
        this.m.i();
    }
    
    public void setOnCheckedChangeListener(final MaterialCardView.MaterialCardView$a materialCardView$a) {
    }
    
    public void setPreventCornerOverlap(final boolean preventCornerOverlap) {
        super.setPreventCornerOverlap(preventCornerOverlap);
        this.m.i();
        this.m.h();
    }
    
    public void setProgress(final float n) {
        final b m = this.m;
        m.c.m(n);
        final f d = m.d;
        if (d != null) {
            d.m(n);
        }
        final f p = m.p;
        if (p != null) {
            p.m(n);
        }
    }
    
    public void setRadius(final float radius) {
        super.setRadius(radius);
        final b m = this.m;
        m.f(m.l.d(radius));
        m.h.invalidateSelf();
        if (m.g() || (m.a.getPreventCornerOverlap() && !m.c.j())) {
            m.h();
        }
        if (m.g()) {
            m.i();
        }
    }
    
    public void setRippleColor(final ColorStateList list) {
        final b m = this.m;
        m.j = list;
        final int[] a = tf.a.a;
        final RippleDrawable n = m.n;
        if (n != null) {
            n.setColor(list);
        }
    }
    
    public void setRippleColorResource(final int n) {
        final b m = this.m;
        final ColorStateList colorStateList = n3.a.getColorStateList(((View)this).getContext(), n);
        m.j = colorStateList;
        final int[] a = tf.a.a;
        final RippleDrawable n2 = m.n;
        if (n2 != null) {
            n2.setColor(colorStateList);
        }
    }
    
    public void setShapeAppearanceModel(final j j) {
        ((View)this).setClipToOutline(j.c(this.getBoundsAsRectF()));
        this.m.f(j);
    }
    
    public void setStrokeColor(final int n) {
        final b m = this.m;
        final ColorStateList value = ColorStateList.valueOf(n);
        if (m.m != value) {
            m.m = value;
            final f d = m.d;
            d.f.k = (float)m.g;
            d.invalidateSelf();
            final f$b f = d.f;
            if (f.d != value) {
                f.d = value;
                d.onStateChange(((Drawable)d).getState());
            }
        }
    }
    
    public void setStrokeColor(final ColorStateList list) {
        final b m = this.m;
        if (m.m != list) {
            m.m = list;
            final f d = m.d;
            d.f.k = (float)m.g;
            d.invalidateSelf();
            final f$b f = d.f;
            if (f.d != list) {
                f.d = list;
                d.onStateChange(((Drawable)d).getState());
            }
        }
    }
    
    public void setStrokeWidth(final int g) {
        final b m = this.m;
        if (g != m.g) {
            m.g = g;
            final f d = m.d;
            final float k = (float)g;
            final ColorStateList i = m.m;
            d.f.k = k;
            d.invalidateSelf();
            final f$b f = d.f;
            if (f.d != i) {
                f.d = i;
                d.onStateChange(((Drawable)d).getState());
            }
        }
    }
    
    public void setUseCompatPadding(final boolean useCompatPadding) {
        super.setUseCompatPadding(useCompatPadding);
        this.m.i();
        this.m.h();
    }
    
    public final void toggle() {
        final b m = this.m;
        if (m != null && m.r && ((View)this).isEnabled()) {
            this.o ^= true;
            ((View)this).refreshDrawableState();
            this.d();
        }
    }
}
