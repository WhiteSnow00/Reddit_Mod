// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.button;

import android.view.accessibility.AccessibilityRecord;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import java.util.Iterator;
import android.util.Log;
import android.os.Parcelable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.text.TextPaint;
import android.widget.TextView;
import e4.j$b;
import java.io.Serializable;
import android.widget.Button;
import android.widget.CompoundButton;
import uf.f$b;
import java.util.WeakHashMap;
import android.content.res.TypedArray;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import uf.f;
import android.view.View;
import a4.l0$e;
import a4.l0;
import rf.c;
import pf.j;
import pf.g;
import oy0.b;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import java.util.LinkedHashSet;
import ff.a;
import uf.n;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatButton;

public class MaterialButton extends AppCompatButton implements Checkable, n
{
    public static final int[] u;
    public static final int[] v;
    public final a i;
    public final LinkedHashSet<MaterialButton.MaterialButton$a> j;
    public MaterialButton.MaterialButton$b k;
    public PorterDuff$Mode l;
    public ColorStateList m;
    public Drawable n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public int t;
    
    static {
        u = new int[] { 16842911 };
        v = new int[] { 16842912 };
    }
    
    public MaterialButton(final Context context, final AttributeSet set) {
        this(context, set, 2130969382);
    }
    
    public MaterialButton(final Context context, final AttributeSet set, int g) {
        super(zf.a.a(context, set, g, 2132018099), set, g);
        this.j = new LinkedHashSet<MaterialButton.MaterialButton$a>();
        this.r = false;
        this.s = false;
        final Context context2 = ((View)this).getContext();
        final TypedArray d = g.d(context2, set, b.L, g, 2132018099, new int[0]);
        this.q = d.getDimensionPixelSize(12, 0);
        this.l = pf.j.c(d.getInt(15, -1), PorterDuff$Mode.SRC_IN);
        this.m = rf.c.a(((View)this).getContext(), d, 14);
        this.n = rf.c.c(((View)this).getContext(), d, 10);
        this.t = d.getInteger(11, 1);
        this.o = d.getDimensionPixelSize(13, 0);
        final uf.a a = new uf.a((float)0);
        final TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(set, b.S, g, 2132018099);
        final int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        g = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        final a i = new a(this, new uf.j(uf.j.a(context2, resourceId, g, (uf.c)a)));
        this.i = i;
        i.c = d.getDimensionPixelOffset(1, 0);
        i.d = d.getDimensionPixelOffset(2, 0);
        i.e = d.getDimensionPixelOffset(3, 0);
        i.f = d.getDimensionPixelOffset(4, 0);
        if (d.hasValue(8)) {
            g = d.getDimensionPixelSize(8, -1);
            i.g = g;
            i.c(i.b.d((float)g));
            i.p = true;
        }
        i.h = d.getDimensionPixelSize(20, 0);
        i.i = pf.j.c(d.getInt(7, -1), PorterDuff$Mode.SRC_IN);
        i.j = rf.c.a(((View)this).getContext(), d, 6);
        i.k = rf.c.a(((View)this).getContext(), d, 19);
        i.l = rf.c.a(((View)this).getContext(), d, 16);
        i.q = d.getBoolean(5, false);
        final int dimensionPixelSize = d.getDimensionPixelSize(9, 0);
        final WeakHashMap a2 = l0.a;
        final int f = l0$e.f((View)this);
        final int paddingTop = ((View)this).getPaddingTop();
        final int e = l0$e.e((View)this);
        final int paddingBottom = ((View)this).getPaddingBottom();
        if (d.hasValue(0)) {
            i.o = true;
            this.setSupportBackgroundTintList(i.j);
            this.setSupportBackgroundTintMode(i.i);
        }
        else {
            final f f2 = new f(i.b);
            f2.i(((View)this).getContext());
            r3.a.b.h((Drawable)f2, i.j);
            final PorterDuff$Mode j = i.i;
            if (j != null) {
                r3.a.b.i((Drawable)f2, j);
            }
            final float k = (float)i.h;
            final ColorStateList l = i.k;
            f2.f.k = k;
            f2.invalidateSelf();
            final f$b f3 = f2.f;
            if (f3.d != l) {
                f3.d = l;
                f2.onStateChange(((Drawable)f2).getState());
            }
            final f f4 = new f(i.b);
            f4.setTint(0);
            final float m = (float)i.h;
            if (i.n) {
                g = dg.l0.k0(2130968836, (View)this);
            }
            else {
                g = 0;
            }
            f4.f.k = m;
            f4.invalidateSelf();
            final ColorStateList value = ColorStateList.valueOf(g);
            final f$b f5 = f4.f;
            if (f5.d != value) {
                f5.d = value;
                f4.onStateChange(((Drawable)f4).getState());
            }
            r3.a.b.g((Drawable)(i.m = new f(i.b)), -1);
            this.setInternalBackground((Drawable)(i.r = new RippleDrawable(sf.a.b(i.l), (Drawable)new InsetDrawable((Drawable)new LayerDrawable(new Drawable[] { (Drawable)f4, (Drawable)f2 }), i.c, i.e, i.d, i.f), (Drawable)i.m)));
            final f b = i.b(false);
            if (b != null) {
                b.k((float)dimensionPixelSize);
            }
        }
        l0$e.k((View)this, f + i.c, paddingTop + i.e, e + i.d, paddingBottom + i.f);
        d.recycle();
        ((TextView)this).setCompoundDrawablePadding(this.q);
        this.b(this.n != null);
    }
    
    private String getA11yClassName() {
        final a i = this.i;
        Serializable s;
        if (i != null && i.q) {
            s = CompoundButton.class;
        }
        else {
            s = Button.class;
        }
        return ((Class)s).getName();
    }
    
    public final boolean a() {
        final a i = this.i;
        return i != null && !i.o;
    }
    
    public final void b(final boolean b) {
        final Drawable n = this.n;
        final boolean b2 = false;
        if (n != null) {
            r3.a.b.h(this.n = n.mutate(), this.m);
            final PorterDuff$Mode l = this.l;
            if (l != null) {
                r3.a.b.i(this.n, l);
            }
            int n2 = this.o;
            if (n2 == 0) {
                n2 = this.n.getIntrinsicWidth();
            }
            int n3 = this.o;
            if (n3 == 0) {
                n3 = this.n.getIntrinsicHeight();
            }
            final Drawable n4 = this.n;
            final int p = this.p;
            n4.setBounds(p, 0, n2 + p, n3);
        }
        final int t = this.t;
        final boolean b3 = t == 1 || t == 2;
        if (b) {
            if (b3) {
                j$b.e((TextView)this, this.n, (Drawable)null, (Drawable)null, (Drawable)null);
            }
            else {
                j$b.e((TextView)this, (Drawable)null, (Drawable)null, this.n, (Drawable)null);
            }
            return;
        }
        final Drawable[] a = j$b.a((TextView)this);
        final Drawable drawable = a[0];
        final Drawable drawable2 = a[2];
        int n5 = 0;
        Label_0232: {
            if (!b3 || drawable == this.n) {
                n5 = (b2 ? 1 : 0);
                if (b3) {
                    break Label_0232;
                }
                n5 = (b2 ? 1 : 0);
                if (drawable2 == this.n) {
                    break Label_0232;
                }
            }
            n5 = 1;
        }
        if (n5 != 0) {
            if (b3) {
                j$b.e((TextView)this, this.n, (Drawable)null, (Drawable)null, (Drawable)null);
            }
            else {
                j$b.e((TextView)this, (Drawable)null, (Drawable)null, this.n, (Drawable)null);
            }
        }
    }
    
    public final void c() {
        if (this.n != null) {
            if (((TextView)this).getLayout() != null) {
                final int t = this.t;
                int n = true ? 1 : 0;
                if (t != 1 && t != 3) {
                    final TextPaint paint = ((TextView)this).getPaint();
                    String s = ((TextView)this).getText().toString();
                    if (((TextView)this).getTransformationMethod() != null) {
                        s = ((TextView)this).getTransformationMethod().getTransformation((CharSequence)s, (View)this).toString();
                    }
                    final int min = Math.min((int)((Paint)paint).measureText(s), ((TextView)this).getLayout().getEllipsizedWidth());
                    int n2;
                    if ((n2 = this.o) == 0) {
                        n2 = this.n.getIntrinsicWidth();
                    }
                    final int measuredWidth = ((View)this).getMeasuredWidth();
                    final WeakHashMap a = l0.a;
                    final int n3 = (measuredWidth - min - l0$e.e((View)this) - n2 - this.q - l0$e.f((View)this)) / 2;
                    final boolean b = l0$e.d((View)this) == 1;
                    if (this.t != 4) {
                        n = (false ? 1 : 0);
                    }
                    int p = n3;
                    if ((b ? 1 : 0) != n) {
                        p = -n3;
                    }
                    if (this.p != p) {
                        this.p = p;
                        this.b(false);
                    }
                    return;
                }
                this.p = 0;
                this.b(false);
            }
        }
    }
    
    public ColorStateList getBackgroundTintList() {
        return this.getSupportBackgroundTintList();
    }
    
    public PorterDuff$Mode getBackgroundTintMode() {
        return this.getSupportBackgroundTintMode();
    }
    
    public int getCornerRadius() {
        int g;
        if (this.a()) {
            g = this.i.g;
        }
        else {
            g = 0;
        }
        return g;
    }
    
    public Drawable getIcon() {
        return this.n;
    }
    
    public int getIconGravity() {
        return this.t;
    }
    
    public int getIconPadding() {
        return this.q;
    }
    
    public int getIconSize() {
        return this.o;
    }
    
    public ColorStateList getIconTint() {
        return this.m;
    }
    
    public PorterDuff$Mode getIconTintMode() {
        return this.l;
    }
    
    public ColorStateList getRippleColor() {
        ColorStateList l;
        if (this.a()) {
            l = this.i.l;
        }
        else {
            l = null;
        }
        return l;
    }
    
    public uf.j getShapeAppearanceModel() {
        if (this.a()) {
            return this.i.b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }
    
    public ColorStateList getStrokeColor() {
        ColorStateList k;
        if (this.a()) {
            k = this.i.k;
        }
        else {
            k = null;
        }
        return k;
    }
    
    public int getStrokeWidth() {
        int h;
        if (this.a()) {
            h = this.i.h;
        }
        else {
            h = 0;
        }
        return h;
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        if (this.a()) {
            return this.i.j;
        }
        return super.getSupportBackgroundTintList();
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        if (this.a()) {
            return this.i.i;
        }
        return super.getSupportBackgroundTintMode();
    }
    
    public final boolean isChecked() {
        return this.r;
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a()) {
            px0.c.P2((View)this, this.i.b(false));
        }
    }
    
    public final int[] onCreateDrawableState(int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 2);
        final a i = this.i;
        if (i != null && i.q) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            View.mergeDrawableStates(onCreateDrawableState, MaterialButton.u);
        }
        if (this.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, MaterialButton.v);
        }
        return onCreateDrawableState;
    }
    
    public final void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ((AccessibilityRecord)accessibilityEvent).setClassName((CharSequence)this.getA11yClassName());
        ((AccessibilityRecord)accessibilityEvent).setChecked(this.isChecked());
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)this.getA11yClassName());
        final a i = this.i;
        accessibilityNodeInfo.setCheckable(i != null && i.q);
        accessibilityNodeInfo.setChecked(this.isChecked());
        accessibilityNodeInfo.setClickable(((View)this).isClickable());
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
    }
    
    public final void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        this.c();
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final c c = (c)parcelable;
        super.onRestoreInstanceState(c.f);
        this.setChecked(c.h);
    }
    
    public final Parcelable onSaveInstanceState() {
        final c c = new c(super.onSaveInstanceState());
        c.h = this.r;
        return (Parcelable)c;
    }
    
    public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        super.onTextChanged(charSequence, n, n2, n3);
        this.c();
    }
    
    public final boolean performClick() {
        this.toggle();
        return super.performClick();
    }
    
    public void setBackground(final Drawable backgroundDrawable) {
        this.setBackgroundDrawable(backgroundDrawable);
    }
    
    public void setBackgroundColor(final int n) {
        if (this.a()) {
            final a i = this.i;
            if (i.b(false) != null) {
                i.b(false).setTint(n);
            }
        }
        else {
            super.setBackgroundColor(n);
        }
    }
    
    public void setBackgroundDrawable(final Drawable drawable) {
        if (this.a()) {
            if (drawable != ((View)this).getBackground()) {
                Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
                final a i = this.i;
                i.o = true;
                i.a.setSupportBackgroundTintList(i.j);
                i.a.setSupportBackgroundTintMode(i.i);
                super.setBackgroundDrawable(drawable);
            }
            else {
                ((View)this).getBackground().setState(drawable.getState());
            }
        }
        else {
            super.setBackgroundDrawable(drawable);
        }
    }
    
    public void setBackgroundResource(final int n) {
        Drawable u1;
        if (n != 0) {
            u1 = vl.a.U1(((View)this).getContext(), n);
        }
        else {
            u1 = null;
        }
        this.setBackgroundDrawable(u1);
    }
    
    public void setBackgroundTintList(final ColorStateList supportBackgroundTintList) {
        this.setSupportBackgroundTintList(supportBackgroundTintList);
    }
    
    public void setBackgroundTintMode(final PorterDuff$Mode supportBackgroundTintMode) {
        this.setSupportBackgroundTintMode(supportBackgroundTintMode);
    }
    
    public void setCheckable(final boolean q) {
        if (this.a()) {
            this.i.q = q;
        }
    }
    
    public void setChecked(final boolean r) {
        final a i = this.i;
        if (i != null && i.q && ((View)this).isEnabled() && this.r != r) {
            this.r = r;
            ((View)this).refreshDrawableState();
            if (this.s) {
                return;
            }
            this.s = true;
            final Iterator<Object> iterator = this.j.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(this, this.r);
            }
            this.s = false;
        }
    }
    
    public void setCornerRadius(final int g) {
        if (this.a()) {
            final a i = this.i;
            if (!i.p || i.g != g) {
                i.g = g;
                i.p = true;
                i.c(i.b.d((float)g));
            }
        }
    }
    
    public void setCornerRadiusResource(final int n) {
        if (this.a()) {
            this.setCornerRadius(((View)this).getResources().getDimensionPixelSize(n));
        }
    }
    
    public void setElevation(final float elevation) {
        super.setElevation(elevation);
        if (this.a()) {
            this.i.b(false).k(elevation);
        }
    }
    
    public void setIcon(final Drawable n) {
        if (this.n != n) {
            this.n = n;
            this.b(true);
        }
    }
    
    public void setIconGravity(final int t) {
        if (this.t != t) {
            this.t = t;
            this.c();
        }
    }
    
    public void setIconPadding(final int q) {
        if (this.q != q) {
            ((TextView)this).setCompoundDrawablePadding(this.q = q);
        }
    }
    
    public void setIconResource(final int n) {
        Drawable u1;
        if (n != 0) {
            u1 = vl.a.U1(((View)this).getContext(), n);
        }
        else {
            u1 = null;
        }
        this.setIcon(u1);
    }
    
    public void setIconSize(final int o) {
        if (o >= 0) {
            if (this.o != o) {
                this.o = o;
                this.b(true);
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }
    
    public void setIconTint(final ColorStateList m) {
        if (this.m != m) {
            this.m = m;
            this.b(false);
        }
    }
    
    public void setIconTintMode(final PorterDuff$Mode l) {
        if (this.l != l) {
            this.l = l;
            this.b(false);
        }
    }
    
    public void setIconTintResource(final int n) {
        this.setIconTint(n3.a.getColorStateList(((View)this).getContext(), n));
    }
    
    public void setInternalBackground(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
    }
    
    public void setOnPressedChangeListenerInternal(final MaterialButton.MaterialButton$b k) {
        this.k = k;
    }
    
    public void setPressed(final boolean pressed) {
        final MaterialButton.MaterialButton$b k = this.k;
        if (k != null) {
            ((View)((MaterialButtonToggleGroup.f)k).a).invalidate();
        }
        super.setPressed(pressed);
    }
    
    public void setRippleColor(final ColorStateList l) {
        if (this.a()) {
            final a i = this.i;
            if (i.l != l) {
                i.l = l;
                if (((View)i.a).getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable)((View)i.a).getBackground()).setColor(sf.a.b(l));
                }
            }
        }
    }
    
    public void setRippleColorResource(final int n) {
        if (this.a()) {
            this.setRippleColor(n3.a.getColorStateList(((View)this).getContext(), n));
        }
    }
    
    public void setShapeAppearanceModel(final uf.j j) {
        if (this.a()) {
            this.i.c(j);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }
    
    public void setShouldDrawSurfaceColorStroke(final boolean n) {
        if (this.a()) {
            final a i = this.i;
            i.n = n;
            i.d();
        }
    }
    
    public void setStrokeColor(final ColorStateList k) {
        if (this.a()) {
            final a i = this.i;
            if (i.k != k) {
                i.k = k;
                i.d();
            }
        }
    }
    
    public void setStrokeColorResource(final int n) {
        if (this.a()) {
            this.setStrokeColor(n3.a.getColorStateList(((View)this).getContext(), n));
        }
    }
    
    public void setStrokeWidth(final int h) {
        if (this.a()) {
            final a i = this.i;
            if (i.h != h) {
                i.h = h;
                i.d();
            }
        }
    }
    
    public void setStrokeWidthResource(final int n) {
        if (this.a()) {
            this.setStrokeWidth(((View)this).getResources().getDimensionPixelSize(n));
        }
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        if (this.a()) {
            final a i = this.i;
            if (i.j != list) {
                i.j = list;
                if (i.b(false) != null) {
                    r3.a.b.h((Drawable)i.b(false), i.j);
                }
            }
        }
        else {
            super.setSupportBackgroundTintList(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        if (this.a()) {
            final a i = this.i;
            if (i.i != porterDuff$Mode) {
                i.i = porterDuff$Mode;
                if (i.b(false) != null && i.i != null) {
                    r3.a.b.i((Drawable)i.b(false), i.i);
                }
            }
        }
        else {
            super.setSupportBackgroundTintMode(porterDuff$Mode);
        }
    }
    
    public final void toggle() {
        this.setChecked(this.r ^ true);
    }
    
    public static final class c extends h4.a
    {
        public static final Parcelable$Creator<c> CREATOR;
        public boolean h;
        
        static {
            CREATOR = (Parcelable$Creator)new MaterialButton$c$a();
        }
        
        public c(final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            final int int1 = parcel.readInt();
            boolean h = true;
            if (int1 != 1) {
                h = false;
            }
            this.h = h;
        }
        
        public c(final Parcelable parcelable) {
            super(parcelable);
        }
        
        public final void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeParcelable(super.f, n);
            parcel.writeInt((int)(this.h ? 1 : 0));
        }
    }
}
