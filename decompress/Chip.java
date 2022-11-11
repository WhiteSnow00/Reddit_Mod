// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.chip;

import android.view.ViewGroup;
import android.widget.TextView;
import b4.c$a;
import java.util.ArrayList;
import android.widget.TextView$BufferType;
import java.lang.ref.WeakReference;
import eg.n0;
import android.widget.CompoundButton;
import android.graphics.PorterDuff$Mode;
import android.view.PointerIcon;
import b4.c$c;
import android.view.accessibility.AccessibilityNodeInfo;
import a4.u1;
import android.text.TextPaint;
import java.util.WeakHashMap;
import java.util.Arrays;
import android.view.KeyEvent;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import android.view.MotionEvent;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.view.ViewOutlineProvider;
import android.view.View;
import a4.p0;
import qf.j;
import android.text.TextUtils$TruncateAt;
import android.text.TextUtils;
import sf.c;
import qf.g;
import pj2.u;
import android.util.Log;
import android.graphics.Typeface;
import bj2.d;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View$OnClickListener;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.Rect;
import vf.n;
import androidx.appcompat.widget.f;

public class Chip extends f implements a$a, n
{
    public static final int[] A;
    public static final int[] B;
    public static final Rect z;
    public a j;
    public InsetDrawable k;
    public RippleDrawable l;
    public View$OnClickListener m;
    public CompoundButton$OnCheckedChangeListener n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public final b v;
    public final Rect w;
    public final RectF x;
    public final Chip$a y;
    
    static {
        z = new Rect();
        A = new int[] { 16842913 };
        B = new int[] { 16842911 };
    }
    
    public Chip(Context context, final AttributeSet set) {
        super(ag.a.a(context, set, 2130968791, 2132018113), set, 2130968791);
        this.w = new Rect();
        this.x = new RectF();
        this.y = new d() {
            public final void a0(final int n) {
            }
            
            public final void b0(final Typeface typeface, final boolean b) {
                final Chip a = Chip.this;
                final a j = a.j;
                CharSequence text;
                if (j.J0) {
                    text = j.K;
                }
                else {
                    text = ((TextView)a).getText();
                }
                ((TextView)a).setText(text);
                ((View)Chip.this).requestLayout();
                ((View)Chip.this).invalidate();
            }
        };
        final Context context2 = ((View)this).getContext();
        if (set != null) {
            if (set.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (set.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (set.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (set.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (set.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!set.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || set.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || set.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || set.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (set.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        final a chipDrawable = new a(context2, set);
        context = chipDrawable.k0;
        final int[] t = pj2.u.t;
        final TypedArray d = qf.g.d(context, set, t, 2130968791, 2132018113, new int[0]);
        chipDrawable.L0 = d.hasValue(43);
        final ColorStateList a = c.a(chipDrawable.k0, d, 27);
        if (chipDrawable.D != a) {
            chipDrawable.D = a;
            chipDrawable.onStateChange(((Drawable)chipDrawable).getState());
        }
        final ColorStateList a2 = c.a(chipDrawable.k0, d, 10);
        if (chipDrawable.E != a2) {
            chipDrawable.E = a2;
            chipDrawable.onStateChange(((Drawable)chipDrawable).getState());
        }
        final float dimension = d.getDimension(22, 0.0f);
        if (chipDrawable.F != dimension) {
            chipDrawable.F = dimension;
            chipDrawable.invalidateSelf();
            chipDrawable.A();
        }
        if (d.hasValue(11)) {
            chipDrawable.G(d.getDimension(11, 0.0f));
        }
        chipDrawable.L(c.a(chipDrawable.k0, d, 25));
        chipDrawable.M(d.getDimension(26, 0.0f));
        chipDrawable.V(c.a(chipDrawable.k0, d, 42));
        CharSequence text;
        if ((text = d.getText(4)) == null) {
            text = "";
        }
        if (!TextUtils.equals(chipDrawable.K, text)) {
            chipDrawable.K = text;
            chipDrawable.q0.d = true;
            chipDrawable.invalidateSelf();
            chipDrawable.A();
        }
        context = chipDrawable.k0;
        sf.d d2 = null;
        Label_0556: {
            if (d.hasValue(0)) {
                final int resourceId = d.getResourceId(0, 0);
                if (resourceId != 0) {
                    d2 = new sf.d(context, resourceId);
                    break Label_0556;
                }
            }
            d2 = null;
        }
        chipDrawable.q0.b(d2, chipDrawable.k0);
        final int int1 = d.getInt(2, 0);
        if (int1 != 1) {
            if (int1 != 2) {
                if (int1 == 3) {
                    chipDrawable.I0 = TextUtils$TruncateAt.END;
                }
            }
            else {
                chipDrawable.I0 = TextUtils$TruncateAt.MIDDLE;
            }
        }
        else {
            chipDrawable.I0 = TextUtils$TruncateAt.START;
        }
        chipDrawable.K(d.getBoolean(19, false));
        if (set != null && set.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && set.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            chipDrawable.K(d.getBoolean(16, false));
        }
        chipDrawable.H(c.c(chipDrawable.k0, d, 14));
        if (d.hasValue(18)) {
            chipDrawable.J(c.a(chipDrawable.k0, d, 18));
        }
        chipDrawable.I(d.getDimension(17, 0.0f));
        chipDrawable.S(d.getBoolean(37, false));
        if (set != null && set.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && set.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            chipDrawable.S(d.getBoolean(32, false));
        }
        chipDrawable.N(c.c(chipDrawable.k0, d, 31));
        chipDrawable.R(c.a(chipDrawable.k0, d, 36));
        chipDrawable.P(d.getDimension(34, 0.0f));
        chipDrawable.C(d.getBoolean(5, false));
        chipDrawable.F(d.getBoolean(9, false));
        if (set != null && set.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && set.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            chipDrawable.F(d.getBoolean(7, false));
        }
        chipDrawable.D(c.c(chipDrawable.k0, d, 6));
        if (d.hasValue(8)) {
            chipDrawable.E(c.a(chipDrawable.k0, d, 8));
        }
        chipDrawable.a0 = ze.g.a(chipDrawable.k0, d, 45);
        chipDrawable.b0 = ze.g.a(chipDrawable.k0, d, 39);
        final float dimension2 = d.getDimension(24, 0.0f);
        if (chipDrawable.c0 != dimension2) {
            chipDrawable.c0 = dimension2;
            chipDrawable.invalidateSelf();
            chipDrawable.A();
        }
        chipDrawable.U(d.getDimension(41, 0.0f));
        chipDrawable.T(d.getDimension(40, 0.0f));
        final float dimension3 = d.getDimension(47, 0.0f);
        if (chipDrawable.f0 != dimension3) {
            chipDrawable.f0 = dimension3;
            chipDrawable.invalidateSelf();
            chipDrawable.A();
        }
        final float dimension4 = d.getDimension(46, 0.0f);
        if (chipDrawable.g0 != dimension4) {
            chipDrawable.g0 = dimension4;
            chipDrawable.invalidateSelf();
            chipDrawable.A();
        }
        chipDrawable.Q(d.getDimension(35, 0.0f));
        chipDrawable.O(d.getDimension(33, 0.0f));
        final float dimension5 = d.getDimension(12, 0.0f);
        if (chipDrawable.j0 != dimension5) {
            chipDrawable.j0 = dimension5;
            chipDrawable.invalidateSelf();
            chipDrawable.A();
        }
        chipDrawable.K0 = d.getDimensionPixelSize(3, Integer.MAX_VALUE);
        d.recycle();
        final TypedArray d3 = qf.g.d(context2, set, t, 2130968791, 2132018113, new int[0]);
        this.s = d3.getBoolean(38, false);
        this.u = (int)Math.ceil(d3.getDimension(23, (float)Math.ceil(qf.j.a(48, ((View)this).getContext()))));
        d3.recycle();
        this.setChipDrawable(chipDrawable);
        chipDrawable.k(p0.i.i((View)this));
        final TypedArray d4 = qf.g.d(context2, set, t, 2130968791, 2132018113, new int[0]);
        final boolean hasValue = d4.hasValue(43);
        d4.recycle();
        this.v = new b(this);
        this.g();
        if (!hasValue) {
            ((View)this).setOutlineProvider((ViewOutlineProvider)new jf.a(this));
        }
        this.setChecked(this.o);
        ((TextView)this).setText(chipDrawable.K);
        this.setEllipsize(chipDrawable.I0);
        this.j();
        if (!this.j.J0) {
            this.setLines(1);
            ((TextView)this).setHorizontallyScrolling(true);
        }
        this.setGravity(8388627);
        this.i();
        if (this.s) {
            ((TextView)this).setMinHeight(this.u);
        }
        this.t = p0.e.d((View)this);
    }
    
    private RectF getCloseIconTouchBounds() {
        this.x.setEmpty();
        if (this.e()) {
            final a j = this.j;
            final RectF x = this.x;
            final Rect bounds = ((Drawable)j).getBounds();
            x.setEmpty();
            if (j.Y()) {
                final float n = j.j0 + j.i0 + j.U + j.h0 + j.g0;
                if (r3.a.c.a((Drawable)j) == 0) {
                    final float right = (float)bounds.right;
                    x.right = right;
                    x.left = right - n;
                }
                else {
                    final float left = (float)bounds.left;
                    x.left = left;
                    x.right = left + n;
                }
                x.top = (float)bounds.top;
                x.bottom = (float)bounds.bottom;
            }
        }
        return this.x;
    }
    
    private Rect getCloseIconTouchBoundsInt() {
        final RectF closeIconTouchBounds = this.getCloseIconTouchBounds();
        this.w.set((int)closeIconTouchBounds.left, (int)closeIconTouchBounds.top, (int)closeIconTouchBounds.right, (int)closeIconTouchBounds.bottom);
        return this.w;
    }
    
    private sf.d getTextAppearance() {
        final a j = this.j;
        sf.d f;
        if (j != null) {
            f = j.q0.f;
        }
        else {
            f = null;
        }
        return f;
    }
    
    private void setCloseIconHovered(final boolean q) {
        if (this.q != q) {
            this.q = q;
            ((View)this).refreshDrawableState();
        }
    }
    
    private void setCloseIconPressed(final boolean p) {
        if (this.p != p) {
            this.p = p;
            ((View)this).refreshDrawableState();
        }
    }
    
    public final void a() {
        this.d(this.u);
        ((View)this).requestLayout();
        ((View)this).invalidateOutline();
    }
    
    public final void d(final int minWidth) {
        this.u = minWidth;
        final boolean s = this.s;
        int n = 0;
        if (!s) {
            final InsetDrawable k = this.k;
            if (k != null) {
                if (k != null) {
                    this.k = null;
                    ((TextView)this).setMinWidth(0);
                    ((TextView)this).setMinHeight((int)this.getChipMinHeight());
                    final int[] a = tf.a.a;
                    this.h();
                }
            }
            else {
                final int[] a2 = tf.a.a;
                this.h();
            }
            return;
        }
        final int max = Math.max(0, minWidth - (int)this.j.F);
        final int max2 = Math.max(0, minWidth - this.j.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            final InsetDrawable i = this.k;
            if (i != null) {
                if (i != null) {
                    this.k = null;
                    ((TextView)this).setMinWidth(0);
                    ((TextView)this).setMinHeight((int)this.getChipMinHeight());
                    final int[] a3 = tf.a.a;
                    this.h();
                }
            }
            else {
                final int[] a4 = tf.a.a;
                this.h();
            }
            return;
        }
        int n2;
        if (max2 > 0) {
            n2 = max2 / 2;
        }
        else {
            n2 = 0;
        }
        if (max > 0) {
            n = max / 2;
        }
        if (this.k != null) {
            final Rect rect = new Rect();
            this.k.getPadding(rect);
            if (rect.top == n && rect.bottom == n && rect.left == n2 && rect.right == n2) {
                final int[] a5 = tf.a.a;
                this.h();
                return;
            }
        }
        if (((TextView)this).getMinHeight() != minWidth) {
            ((TextView)this).setMinHeight(minWidth);
        }
        if (((TextView)this).getMinWidth() != minWidth) {
            ((TextView)this).setMinWidth(minWidth);
        }
        this.k = new InsetDrawable((Drawable)this.j, n2, n, n2, n);
        final int[] a6 = tf.a.a;
        this.h();
    }
    
    public final boolean dispatchHoverEvent(final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        final boolean b = true;
        boolean b2 = false;
        Label_0169: {
            if (action == 10) {
                try {
                    final Field declaredField = i4.a.class.getDeclaredField("k");
                    declaredField.setAccessible(true);
                    if ((int)declaredField.get(this.v) != Integer.MIN_VALUE) {
                        final Method declaredMethod = i4.a.class.getDeclaredMethod("q", Integer.TYPE);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(this.v, Integer.MIN_VALUE);
                        b2 = true;
                        break Label_0169;
                    }
                }
                catch (final NoSuchFieldException ex) {
                    Log.e("Chip", "Unable to send Accessibility Exit event", (Throwable)ex);
                }
                catch (final InvocationTargetException ex2) {
                    Log.e("Chip", "Unable to send Accessibility Exit event", (Throwable)ex2);
                }
                catch (final IllegalAccessException ex3) {
                    Log.e("Chip", "Unable to send Accessibility Exit event", (Throwable)ex3);
                }
                catch (final NoSuchMethodException ex4) {
                    Log.e("Chip", "Unable to send Accessibility Exit event", (Throwable)ex4);
                }
            }
            b2 = false;
        }
        boolean b3 = b;
        if (!b2) {
            b3 = b;
            if (!this.v.d(motionEvent)) {
                b3 = (super.dispatchHoverEvent(motionEvent) && b);
            }
        }
        return b3;
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final b v = this.v;
        v.getClass();
        final int action = keyEvent.getAction();
        final int n = 0;
        int n2 = 0;
        int n3 = n;
        if (action != 1) {
            final int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int n4 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        default: {
                            n3 = n;
                            return (n3 != 0 && this.v.j != Integer.MIN_VALUE) || super.dispatchKeyEvent(keyEvent);
                        }
                        case 19:
                        case 20:
                        case 21:
                        case 22: {
                            n3 = n;
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        if (keyCode != 22) {
                                            n4 = 130;
                                        }
                                    }
                                    else {
                                        n4 = 17;
                                    }
                                }
                                else {
                                    n4 = 33;
                                }
                                final int repeatCount = keyEvent.getRepeatCount();
                                n3 = 0;
                                while (n2 < repeatCount + 1 && v.h(n4, (Rect)null)) {
                                    ++n2;
                                    n3 = 1;
                                }
                                return (n3 != 0 && this.v.j != Integer.MIN_VALUE) || super.dispatchKeyEvent(keyEvent);
                            }
                            return (n3 != 0 && this.v.j != Integer.MIN_VALUE) || super.dispatchKeyEvent(keyEvent);
                        }
                        case 23: {
                            break;
                        }
                    }
                }
                n3 = n;
                if (keyEvent.hasNoModifiers()) {
                    n3 = n;
                    if (keyEvent.getRepeatCount() == 0) {
                        final int j = v.j;
                        if (j != Integer.MIN_VALUE) {
                            v.j(j, 16);
                        }
                        n3 = 1;
                    }
                }
            }
            else if (keyEvent.hasNoModifiers()) {
                n3 = (v.h(2, (Rect)null) ? 1 : 0);
            }
            else {
                n3 = n;
                if (keyEvent.hasModifiers(1)) {
                    n3 = (v.h(1, (Rect)null) ? 1 : 0);
                }
            }
        }
        return (n3 != 0 && this.v.j != Integer.MIN_VALUE) || super.dispatchKeyEvent(keyEvent);
    }
    
    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        final a j = this.j;
        int b;
        final int n = b = 0;
        if (j != null) {
            b = n;
            if (a.z(j.R)) {
                final a i = this.j;
                int enabled;
                final int n2 = enabled = (((View)this).isEnabled() ? 1 : 0);
                if (this.r) {
                    enabled = n2 + 1;
                }
                int n3 = enabled;
                if (this.q) {
                    n3 = enabled + 1;
                }
                int n4 = n3;
                if (this.p) {
                    n4 = n3 + 1;
                }
                int n5 = n4;
                if (((CompoundButton)this).isChecked()) {
                    n5 = n4 + 1;
                }
                final int[] e0 = new int[n5];
                int n6;
                if (((View)this).isEnabled()) {
                    e0[0] = 16842910;
                    n6 = 1;
                }
                else {
                    n6 = 0;
                }
                int n7 = n6;
                if (this.r) {
                    e0[n6] = 16842908;
                    n7 = n6 + 1;
                }
                int n8 = n7;
                if (this.q) {
                    e0[n7] = 16843623;
                    n8 = n7 + 1;
                }
                int n9 = n8;
                if (this.p) {
                    e0[n8] = 16842919;
                    n9 = n8 + 1;
                }
                if (((CompoundButton)this).isChecked()) {
                    e0[n9] = 16842913;
                }
                b = n;
                if (!Arrays.equals(i.E0, e0)) {
                    i.E0 = e0;
                    b = n;
                    if (i.Y()) {
                        b = (i.B(((Drawable)i).getState(), e0) ? 1 : 0);
                    }
                }
            }
        }
        if (b != 0) {
            ((View)this).invalidate();
        }
    }
    
    public final boolean e() {
        final a j = this.j;
        if (j != null) {
            final Drawable r = j.R;
            Drawable b;
            if (r != null) {
                b = r;
                if (r instanceof r3.d) {
                    b = ((r3.d)r).b();
                }
            }
            else {
                b = null;
            }
            if (b != null) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean f() {
        final a j = this.j;
        return j != null && j.W;
    }
    
    public final void g() {
        if (this.e()) {
            final a j = this.j;
            if (j != null && j.Q && this.m != null) {
                p0.l((View)this, (a4.a)this.v);
                return;
            }
        }
        p0.l((View)this, (a4.a)null);
    }
    
    public Drawable getBackgroundDrawable() {
        Object o;
        if ((o = this.k) == null) {
            o = this.j;
        }
        return (Drawable)o;
    }
    
    public Drawable getCheckedIcon() {
        final a j = this.j;
        Drawable y;
        if (j != null) {
            y = j.Y;
        }
        else {
            y = null;
        }
        return y;
    }
    
    public ColorStateList getCheckedIconTint() {
        final a j = this.j;
        ColorStateList z;
        if (j != null) {
            z = j.Z;
        }
        else {
            z = null;
        }
        return z;
    }
    
    public ColorStateList getChipBackgroundColor() {
        final a j = this.j;
        ColorStateList e;
        if (j != null) {
            e = j.E;
        }
        else {
            e = null;
        }
        return e;
    }
    
    public float getChipCornerRadius() {
        final a j = this.j;
        float max = 0.0f;
        if (j != null) {
            max = Math.max(0.0f, j.x());
        }
        return max;
    }
    
    public Drawable getChipDrawable() {
        return (Drawable)this.j;
    }
    
    public float getChipEndPadding() {
        final a j = this.j;
        float j2;
        if (j != null) {
            j2 = j.j0;
        }
        else {
            j2 = 0.0f;
        }
        return j2;
    }
    
    public Drawable getChipIcon() {
        final a j = this.j;
        Drawable b;
        final Drawable drawable = b = null;
        if (j != null) {
            final Drawable m = j.M;
            b = drawable;
            if (m != null) {
                b = m;
                if (m instanceof r3.d) {
                    b = ((r3.d)m).b();
                }
            }
        }
        return b;
    }
    
    public float getChipIconSize() {
        final a j = this.j;
        float o;
        if (j != null) {
            o = j.O;
        }
        else {
            o = 0.0f;
        }
        return o;
    }
    
    public ColorStateList getChipIconTint() {
        final a j = this.j;
        ColorStateList n;
        if (j != null) {
            n = j.N;
        }
        else {
            n = null;
        }
        return n;
    }
    
    public float getChipMinHeight() {
        final a j = this.j;
        float f;
        if (j != null) {
            f = j.F;
        }
        else {
            f = 0.0f;
        }
        return f;
    }
    
    public float getChipStartPadding() {
        final a j = this.j;
        float c0;
        if (j != null) {
            c0 = j.c0;
        }
        else {
            c0 = 0.0f;
        }
        return c0;
    }
    
    public ColorStateList getChipStrokeColor() {
        final a j = this.j;
        ColorStateList h;
        if (j != null) {
            h = j.H;
        }
        else {
            h = null;
        }
        return h;
    }
    
    public float getChipStrokeWidth() {
        final a j = this.j;
        float i;
        if (j != null) {
            i = j.I;
        }
        else {
            i = 0.0f;
        }
        return i;
    }
    
    @Deprecated
    public CharSequence getChipText() {
        return ((TextView)this).getText();
    }
    
    public Drawable getCloseIcon() {
        final a j = this.j;
        Drawable b;
        final Drawable drawable = b = null;
        if (j != null) {
            final Drawable r = j.R;
            b = drawable;
            if (r != null) {
                b = r;
                if (r instanceof r3.d) {
                    b = ((r3.d)r).b();
                }
            }
        }
        return b;
    }
    
    public CharSequence getCloseIconContentDescription() {
        final a j = this.j;
        Object v;
        if (j != null) {
            v = j.V;
        }
        else {
            v = null;
        }
        return (CharSequence)v;
    }
    
    public float getCloseIconEndPadding() {
        final a j = this.j;
        float i0;
        if (j != null) {
            i0 = j.i0;
        }
        else {
            i0 = 0.0f;
        }
        return i0;
    }
    
    public float getCloseIconSize() {
        final a j = this.j;
        float u;
        if (j != null) {
            u = j.U;
        }
        else {
            u = 0.0f;
        }
        return u;
    }
    
    public float getCloseIconStartPadding() {
        final a j = this.j;
        float h0;
        if (j != null) {
            h0 = j.h0;
        }
        else {
            h0 = 0.0f;
        }
        return h0;
    }
    
    public ColorStateList getCloseIconTint() {
        final a j = this.j;
        ColorStateList t;
        if (j != null) {
            t = j.T;
        }
        else {
            t = null;
        }
        return t;
    }
    
    public TextUtils$TruncateAt getEllipsize() {
        final a j = this.j;
        TextUtils$TruncateAt i0;
        if (j != null) {
            i0 = j.I0;
        }
        else {
            i0 = null;
        }
        return i0;
    }
    
    public final void getFocusedRect(final Rect rect) {
        final b v = this.v;
        if (v.j != 1 && v.i != 1) {
            super.getFocusedRect(rect);
        }
        else {
            rect.set(this.getCloseIconTouchBoundsInt());
        }
    }
    
    public ze.g getHideMotionSpec() {
        final a j = this.j;
        ze.g b0;
        if (j != null) {
            b0 = j.b0;
        }
        else {
            b0 = null;
        }
        return b0;
    }
    
    public float getIconEndPadding() {
        final a j = this.j;
        float e0;
        if (j != null) {
            e0 = j.e0;
        }
        else {
            e0 = 0.0f;
        }
        return e0;
    }
    
    public float getIconStartPadding() {
        final a j = this.j;
        float d0;
        if (j != null) {
            d0 = j.d0;
        }
        else {
            d0 = 0.0f;
        }
        return d0;
    }
    
    public ColorStateList getRippleColor() {
        final a j = this.j;
        ColorStateList i;
        if (j != null) {
            i = j.J;
        }
        else {
            i = null;
        }
        return i;
    }
    
    public vf.j getShapeAppearanceModel() {
        return this.j.f.a;
    }
    
    public ze.g getShowMotionSpec() {
        final a j = this.j;
        ze.g a0;
        if (j != null) {
            a0 = j.a0;
        }
        else {
            a0 = null;
        }
        return a0;
    }
    
    public float getTextEndPadding() {
        final a j = this.j;
        float g0;
        if (j != null) {
            g0 = j.g0;
        }
        else {
            g0 = 0.0f;
        }
        return g0;
    }
    
    public float getTextStartPadding() {
        final a j = this.j;
        float f0;
        if (j != null) {
            f0 = j.f0;
        }
        else {
            f0 = 0.0f;
        }
        return f0;
    }
    
    public final void h() {
        this.l = new RippleDrawable(tf.a.b(this.j.J), this.getBackgroundDrawable(), (Drawable)null);
        final a j = this.j;
        if (j.F0) {
            j.F0 = false;
            j.G0 = null;
            j.onStateChange(((Drawable)j).getState());
        }
        final RippleDrawable l = this.l;
        final WeakHashMap a = p0.a;
        p0.d.q((View)this, (Drawable)l);
        this.i();
    }
    
    public final void i() {
        if (!TextUtils.isEmpty(((TextView)this).getText())) {
            final a j = this.j;
            if (j != null) {
                final int n = (int)(j.w() + (j.j0 + j.g0));
                final a i = this.j;
                final int n2 = (int)(i.v() + (i.c0 + i.f0));
                int n3 = n;
                int n4 = n2;
                if (this.k != null) {
                    final Rect rect = new Rect();
                    this.k.getPadding(rect);
                    n4 = n2 + rect.left;
                    n3 = n + rect.right;
                }
                final int paddingTop = ((View)this).getPaddingTop();
                final int paddingBottom = ((View)this).getPaddingBottom();
                final WeakHashMap a = p0.a;
                p0.e.k((View)this, n4, paddingTop, n3, paddingBottom);
            }
        }
    }
    
    public final void j() {
        final TextPaint paint = ((TextView)this).getPaint();
        final a j = this.j;
        if (j != null) {
            paint.drawableState = ((Drawable)j).getState();
        }
        final sf.d textAppearance = this.getTextAppearance();
        if (textAppearance != null) {
            textAppearance.c(((View)this).getContext(), paint, this.y);
        }
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u1.c1((View)this, (vf.f)this.j);
    }
    
    public final int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 2);
        if (((CompoundButton)this).isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, Chip.A);
        }
        if (this.f()) {
            View.mergeDrawableStates(onCreateDrawableState, Chip.B);
        }
        return onCreateDrawableState;
    }
    
    public final void onFocusChanged(final boolean b, final int n, final Rect rect) {
        super.onFocusChanged(b, n, rect);
        final b v = this.v;
        final int j = v.j;
        if (j != Integer.MIN_VALUE) {
            v.a(j);
        }
        if (b) {
            v.h(n, rect);
        }
    }
    
    public final boolean onHoverEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                this.setCloseIconHovered(false);
            }
        }
        else {
            this.setCloseIconHovered(this.getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (!this.f() && !((View)this).isClickable()) {
            accessibilityNodeInfo.setClassName((CharSequence)"android.view.View");
        }
        else {
            String className;
            if (this.f()) {
                className = "android.widget.CompoundButton";
            }
            else {
                className = "android.widget.Button";
            }
            accessibilityNodeInfo.setClassName((CharSequence)className);
        }
        accessibilityNodeInfo.setCheckable(this.f());
        accessibilityNodeInfo.setClickable(((View)this).isClickable());
        if (((View)this).getParent() instanceof ChipGroup) {
            final ChipGroup chipGroup = (ChipGroup)((View)this).getParent();
            final b4.c c = new b4.c(accessibilityNodeInfo);
            final boolean h = chipGroup.h;
            final int n = -1;
            int n2 = 0;
            Label_0182: {
                if (h) {
                    int i = 0;
                    n2 = 0;
                    while (i < ((ViewGroup)chipGroup).getChildCount()) {
                        int n3 = n2;
                        if (((ViewGroup)chipGroup).getChildAt(i) instanceof Chip) {
                            if ((Chip)((ViewGroup)chipGroup).getChildAt(i) == this) {
                                break Label_0182;
                            }
                            n3 = n2 + 1;
                        }
                        ++i;
                        n2 = n3;
                    }
                    n2 = -1;
                }
                else {
                    n2 = -1;
                }
            }
            final Object tag = ((View)this).getTag(2131431039);
            int intValue;
            if (!(tag instanceof Integer)) {
                intValue = n;
            }
            else {
                intValue = (int)tag;
            }
            c.p(c$c.a(intValue, 1, n2, 1, false, ((CompoundButton)this).isChecked()));
        }
    }
    
    public final PointerIcon onResolvePointerIcon(final MotionEvent motionEvent, final int n) {
        if (this.getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && ((View)this).isEnabled()) {
            return PointerIcon.getSystemIcon(((View)this).getContext(), 1002);
        }
        return null;
    }
    
    public final void onRtlPropertiesChanged(final int t) {
        super.onRtlPropertiesChanged(t);
        if (this.t != t) {
            this.t = t;
            this.i();
        }
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final boolean contains = this.getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        final boolean b = true;
        boolean b2 = false;
        Label_0136: {
            Label_0134: {
                Label_0129: {
                    if (actionMasked != 0) {
                        Label_0112: {
                            if (actionMasked != 1) {
                                if (actionMasked != 2) {
                                    if (actionMasked != 3) {
                                        break Label_0134;
                                    }
                                }
                                else {
                                    if (!this.p) {
                                        break Label_0134;
                                    }
                                    if (!contains) {
                                        this.setCloseIconPressed(false);
                                    }
                                    break Label_0129;
                                }
                            }
                            else if (this.p) {
                                ((View)this).playSoundEffect(0);
                                final View$OnClickListener m = this.m;
                                if (m != null) {
                                    m.onClick((View)this);
                                }
                                this.v.p(1, 1);
                                b2 = true;
                                break Label_0112;
                            }
                            b2 = false;
                        }
                        this.setCloseIconPressed(false);
                        break Label_0136;
                    }
                    if (!contains) {
                        break Label_0134;
                    }
                    this.setCloseIconPressed(true);
                }
                b2 = true;
                break Label_0136;
            }
            b2 = false;
        }
        boolean b3 = b;
        if (!b2) {
            b3 = (super.onTouchEvent(motionEvent) && b);
        }
        return b3;
    }
    
    public void setBackground(final Drawable background) {
        if (background != this.getBackgroundDrawable() && background != this.l) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        else {
            super.setBackground(background);
        }
    }
    
    public void setBackgroundColor(final int n) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }
    
    @Override
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        if (backgroundDrawable != this.getBackgroundDrawable() && backgroundDrawable != this.l) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
        else {
            super.setBackgroundDrawable(backgroundDrawable);
        }
    }
    
    @Override
    public void setBackgroundResource(final int n) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }
    
    public void setBackgroundTintList(final ColorStateList list) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }
    
    public void setBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }
    
    public void setCheckable(final boolean b) {
        final a j = this.j;
        if (j != null) {
            j.C(b);
        }
    }
    
    public void setCheckableResource(final int n) {
        final a j = this.j;
        if (j != null) {
            j.C(j.k0.getResources().getBoolean(n));
        }
    }
    
    public void setChecked(final boolean b) {
        final a j = this.j;
        if (j == null) {
            this.o = b;
        }
        else if (j.W) {
            final boolean checked = ((CompoundButton)this).isChecked();
            super.setChecked(b);
            if (checked != b) {
                final CompoundButton$OnCheckedChangeListener n = this.n;
                if (n != null) {
                    n.onCheckedChanged((CompoundButton)this, b);
                }
            }
        }
    }
    
    public void setCheckedIcon(final Drawable drawable) {
        final a j = this.j;
        if (j != null) {
            j.D(drawable);
        }
    }
    
    @Deprecated
    public void setCheckedIconEnabled(final boolean checkedIconVisible) {
        this.setCheckedIconVisible(checkedIconVisible);
    }
    
    @Deprecated
    public void setCheckedIconEnabledResource(final int checkedIconVisible) {
        this.setCheckedIconVisible(checkedIconVisible);
    }
    
    public void setCheckedIconResource(final int n) {
        final a j = this.j;
        if (j != null) {
            j.D(n0.L(j.k0, n));
        }
    }
    
    public void setCheckedIconTint(final ColorStateList list) {
        final a j = this.j;
        if (j != null) {
            j.E(list);
        }
    }
    
    public void setCheckedIconTintResource(final int n) {
        final a j = this.j;
        if (j != null) {
            j.E(n3.a.getColorStateList(j.k0, n));
        }
    }
    
    public void setCheckedIconVisible(final int n) {
        final a j = this.j;
        if (j != null) {
            j.F(j.k0.getResources().getBoolean(n));
        }
    }
    
    public void setCheckedIconVisible(final boolean b) {
        final a j = this.j;
        if (j != null) {
            j.F(b);
        }
    }
    
    public void setChipBackgroundColor(final ColorStateList e) {
        final a j = this.j;
        if (j != null && j.E != e) {
            j.E = e;
            j.onStateChange(((Drawable)j).getState());
        }
    }
    
    public void setChipBackgroundColorResource(final int n) {
        final a j = this.j;
        if (j != null) {
            final ColorStateList colorStateList = n3.a.getColorStateList(j.k0, n);
            if (j.E != colorStateList) {
                j.E = colorStateList;
                j.onStateChange(((Drawable)j).getState());
            }
        }
    }
    
    @Deprecated
    public void setChipCornerRadius(final float n) {
        final a j = this.j;
        if (j != null) {
            j.G(n);
        }
    }
    
    @Deprecated
    public void setChipCornerRadiusResource(final int n) {
        final a j = this.j;
        if (j != null) {
            j.G(j.k0.getResources().getDimension(n));
        }
    }
    
    public void setChipDrawable(final a j) {
        final a i = this.j;
        if (i != j) {
            if (i != null) {
                i.H0 = new WeakReference<a.a$a>(null);
            }
            this.j = j;
            j.J0 = false;
            j.H0 = new WeakReference<a.a$a>((a.a$a)this);
            this.d(this.u);
        }
    }
    
    public void setChipEndPadding(final float j0) {
        final a i = this.j;
        if (i != null && i.j0 != j0) {
            i.j0 = j0;
            i.invalidateSelf();
            i.A();
        }
    }
    
    public void setChipEndPaddingResource(final int n) {
        final a j = this.j;
        if (j != null) {
            final float dimension = j.k0.getResources().getDimension(n);
            if (j.j0 != dimension) {
                j.j0 = dimension;
                j.invalidateSelf();
                j.A();
            }
        }
    }
    
    public void setChipIcon(final Drawable drawable) {
        final a j = this.j;
        if (j != null) {
            j.H(drawable);
        }
    }
    
    @Deprecated
    public void setChipIconEnabled(final boolean chipIconVisible) {
        this.setChipIconVisible(chipIconVisible);
    }
    
    @Deprecated
    public void setChipIconEnabledResource(final int chipIconVisible) {
        this.setChipIconVisible(chipIconVisible);
    }
    
    public void setChipIconResource(final int n) {
        final a j = this.j;
        if (j != null) {
            j.H(n0.L(j.k0, n));
        }
    }
    
    public void setChipIconSize(final float n) {
        final a j = this.j;
        if (j != null) {
            j.I(n);
        }
    }
    
    public void setChipIconSizeResource(final int n) {
        final a j = this.j;
        if (j != null) {
            j.I(j.k0.getResources().getDimension(n));
        }
    }
    
    public void setChipIconTint(final ColorStateList list) {
        final a j = this.j;
        if (j != null) {
            j.J(list);
        }
    }
    
    public void setChipIconTintResource(final int n) {
        final a j = this.j;
        if (j != null) {
            j.J(n3.a.getColorStateList(j.k0, n));
        }
    }
    
    public void setChipIconVisible(final int n) {
        final a j = this.j;
        if (j != null) {
            j.K(j.k0.getResources().getBoolean(n));
        }
    }
    
    public void setChipIconVisible(final boolean b) {
        final a j = this.j;
        if (j != null) {
            j.K(b);
        }
    }
    
    public void setChipMinHeight(final float f) {
        final a j = this.j;
        if (j != null && j.F != f) {
            j.F = f;
            j.invalidateSelf();
            j.A();
        }
    }
    
    public void setChipMinHeightResource(final int n) {
        final a j = this.j;
        if (j != null) {
            final float dimension = j.k0.getResources().getDimension(n);
            if (j.F != dimension) {
                j.F = dimension;
                j.invalidateSelf();
                j.A();
            }
        }
    }
    
    public void setChipStartPadding(final float c0) {
        final a j = this.j;
        if (j != null && j.c0 != c0) {
            j.c0 = c0;
            j.invalidateSelf();
            j.A();
        }
    }
    
    public void setChipStartPaddingResource(final int n) {
        final a j = this.j;
        if (j != null) {
            final float dimension = j.k0.getResources().getDimension(n);
            if (j.c0 != dimension) {
                j.c0 = dimension;
                j.invalidateSelf();
                j.A();
            }
        }
    }
    
    public void setChipStrokeColor(final ColorStateList list) {
        final a j = this.j;
        if (j != null) {
            j.L(list);
        }
    }
    
    public void setChipStrokeColorResource(final int n) {
        final a j = this.j;
        if (j != null) {
            j.L(n3.a.getColorStateList(j.k0, n));
        }
    }
    
    public void setChipStrokeWidth(final float n) {
        final a j = this.j;
        if (j != null) {
            j.M(n);
        }
    }
    
    public void setChipStrokeWidthResource(final int n) {
        final a j = this.j;
        if (j != null) {
            j.M(j.k0.getResources().getDimension(n));
        }
    }
    
    @Deprecated
    public void setChipText(final CharSequence text) {
        ((TextView)this).setText(text);
    }
    
    @Deprecated
    public void setChipTextResource(final int n) {
        ((TextView)this).setText((CharSequence)((View)this).getResources().getString(n));
    }
    
    public void setCloseIcon(final Drawable drawable) {
        final a j = this.j;
        if (j != null) {
            j.N(drawable);
        }
        this.g();
    }
    
    public void setCloseIconContentDescription(final CharSequence charSequence) {
        final a j = this.j;
        if (j != null && j.V != charSequence) {
            final y3.a c = y3.a.c();
            j.V = c.d(charSequence, c.c);
            j.invalidateSelf();
        }
    }
    
    @Deprecated
    public void setCloseIconEnabled(final boolean closeIconVisible) {
        this.setCloseIconVisible(closeIconVisible);
    }
    
    @Deprecated
    public void setCloseIconEnabledResource(final int closeIconVisible) {
        this.setCloseIconVisible(closeIconVisible);
    }
    
    public void setCloseIconEndPadding(final float n) {
        final a j = this.j;
        if (j != null) {
            j.O(n);
        }
    }
    
    public void setCloseIconEndPaddingResource(final int n) {
        final a j = this.j;
        if (j != null) {
            j.O(j.k0.getResources().getDimension(n));
        }
    }
    
    public void setCloseIconResource(final int n) {
        final a j = this.j;
        if (j != null) {
            j.N(n0.L(j.k0, n));
        }
        this.g();
    }
    
    public void setCloseIconSize(final float n) {
        final a j = this.j;
        if (j != null) {
            j.P(n);
        }
    }
    
    public void setCloseIconSizeResource(final int n) {
        final a j = this.j;
        if (j != null) {
            j.P(j.k0.getResources().getDimension(n));
        }
    }
    
    public void setCloseIconStartPadding(final float n) {
        final a j = this.j;
        if (j != null) {
            j.Q(n);
        }
    }
    
    public void setCloseIconStartPaddingResource(final int n) {
        final a j = this.j;
        if (j != null) {
            j.Q(j.k0.getResources().getDimension(n));
        }
    }
    
    public void setCloseIconTint(final ColorStateList list) {
        final a j = this.j;
        if (j != null) {
            j.R(list);
        }
    }
    
    public void setCloseIconTintResource(final int n) {
        final a j = this.j;
        if (j != null) {
            j.R(n3.a.getColorStateList(j.k0, n));
        }
    }
    
    public void setCloseIconVisible(final int n) {
        this.setCloseIconVisible(((View)this).getResources().getBoolean(n));
    }
    
    public void setCloseIconVisible(final boolean b) {
        final a j = this.j;
        if (j != null) {
            j.S(b);
        }
        this.g();
    }
    
    @Override
    public final void setCompoundDrawables(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }
    
    @Override
    public final void setCompoundDrawablesRelative(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }
    
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(final int n, final int n2, final int n3, final int n4) {
        if (n != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (n3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(n, n2, n3, n4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }
    
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }
    
    public final void setCompoundDrawablesWithIntrinsicBounds(final int n, final int n2, final int n3, final int n4) {
        if (n != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (n3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(n, n2, n3, n4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }
    
    public final void setCompoundDrawablesWithIntrinsicBounds(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }
    
    public void setElevation(final float elevation) {
        super.setElevation(elevation);
        final a j = this.j;
        if (j != null) {
            j.k(elevation);
        }
    }
    
    public void setEllipsize(final TextUtils$TruncateAt textUtils$TruncateAt) {
        if (this.j == null) {
            return;
        }
        if (textUtils$TruncateAt != TextUtils$TruncateAt.MARQUEE) {
            super.setEllipsize(textUtils$TruncateAt);
            final a j = this.j;
            if (j != null) {
                j.I0 = textUtils$TruncateAt;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }
    
    public void setEnsureMinTouchTargetSize(final boolean s) {
        this.s = s;
        this.d(this.u);
    }
    
    public void setGravity(final int gravity) {
        if (gravity != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
        else {
            super.setGravity(gravity);
        }
    }
    
    public void setHideMotionSpec(final ze.g b0) {
        final a j = this.j;
        if (j != null) {
            j.b0 = b0;
        }
    }
    
    public void setHideMotionSpecResource(final int n) {
        final a j = this.j;
        if (j != null) {
            j.b0 = ze.g.b(n, j.k0);
        }
    }
    
    public void setIconEndPadding(final float n) {
        final a j = this.j;
        if (j != null) {
            j.T(n);
        }
    }
    
    public void setIconEndPaddingResource(final int n) {
        final a j = this.j;
        if (j != null) {
            j.T(j.k0.getResources().getDimension(n));
        }
    }
    
    public void setIconStartPadding(final float n) {
        final a j = this.j;
        if (j != null) {
            j.U(n);
        }
    }
    
    public void setIconStartPaddingResource(final int n) {
        final a j = this.j;
        if (j != null) {
            j.U(j.k0.getResources().getDimension(n));
        }
    }
    
    public void setLayoutDirection(final int layoutDirection) {
        if (this.j == null) {
            return;
        }
        super.setLayoutDirection(layoutDirection);
    }
    
    public void setLines(final int lines) {
        if (lines <= 1) {
            super.setLines(lines);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }
    
    public void setMaxLines(final int maxLines) {
        if (maxLines <= 1) {
            super.setMaxLines(maxLines);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }
    
    public void setMaxWidth(final int n) {
        super.setMaxWidth(n);
        final a j = this.j;
        if (j != null) {
            j.K0 = n;
        }
    }
    
    public void setMinLines(final int minLines) {
        if (minLines <= 1) {
            super.setMinLines(minLines);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }
    
    public void setOnCheckedChangeListenerInternal(final CompoundButton$OnCheckedChangeListener n) {
        this.n = n;
    }
    
    public void setOnCloseIconClickListener(final View$OnClickListener m) {
        this.m = m;
        this.g();
    }
    
    public void setRippleColor(final ColorStateList list) {
        final a j = this.j;
        if (j != null) {
            j.V(list);
        }
        if (!this.j.F0) {
            this.h();
        }
    }
    
    public void setRippleColorResource(final int n) {
        final a j = this.j;
        if (j != null) {
            j.V(n3.a.getColorStateList(j.k0, n));
            if (!this.j.F0) {
                this.h();
            }
        }
    }
    
    public void setShapeAppearanceModel(final vf.j shapeAppearanceModel) {
        this.j.setShapeAppearanceModel(shapeAppearanceModel);
    }
    
    public void setShowMotionSpec(final ze.g a0) {
        final a j = this.j;
        if (j != null) {
            j.a0 = a0;
        }
    }
    
    public void setShowMotionSpecResource(final int n) {
        final a j = this.j;
        if (j != null) {
            j.a0 = ze.g.b(n, j.k0);
        }
    }
    
    public void setSingleLine(final boolean singleLine) {
        if (singleLine) {
            super.setSingleLine(singleLine);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }
    
    public final void setText(CharSequence charSequence, final TextView$BufferType textView$BufferType) {
        final a j = this.j;
        if (j == null) {
            return;
        }
        CharSequence k;
        if ((k = charSequence) == null) {
            k = "";
        }
        if (j.J0) {
            charSequence = null;
        }
        else {
            charSequence = k;
        }
        super.setText(charSequence, textView$BufferType);
        final a i = this.j;
        if (i != null && !TextUtils.equals(i.K, k)) {
            i.K = k;
            i.q0.d = true;
            i.invalidateSelf();
            i.A();
        }
    }
    
    public void setTextAppearance(final int textAppearance) {
        super.setTextAppearance(textAppearance);
        final a j = this.j;
        if (j != null) {
            j.q0.b(new sf.d(j.k0, textAppearance), j.k0);
        }
        this.j();
    }
    
    public final void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final a j = this.j;
        if (j != null) {
            j.q0.b(new sf.d(j.k0, n), j.k0);
        }
        this.j();
    }
    
    public void setTextAppearance(final sf.d d) {
        final a j = this.j;
        if (j != null) {
            j.q0.b(d, j.k0);
        }
        this.j();
    }
    
    public void setTextAppearanceResource(final int n) {
        this.setTextAppearance(((View)this).getContext(), n);
    }
    
    public void setTextEndPadding(final float g0) {
        final a j = this.j;
        if (j != null && j.g0 != g0) {
            j.g0 = g0;
            j.invalidateSelf();
            j.A();
        }
    }
    
    public void setTextEndPaddingResource(final int n) {
        final a j = this.j;
        if (j != null) {
            final float dimension = j.k0.getResources().getDimension(n);
            if (j.g0 != dimension) {
                j.g0 = dimension;
                j.invalidateSelf();
                j.A();
            }
        }
    }
    
    public void setTextStartPadding(final float f0) {
        final a j = this.j;
        if (j != null && j.f0 != f0) {
            j.f0 = f0;
            j.invalidateSelf();
            j.A();
        }
    }
    
    public void setTextStartPaddingResource(final int n) {
        final a j = this.j;
        if (j != null) {
            final float dimension = j.k0.getResources().getDimension(n);
            if (j.f0 != dimension) {
                j.f0 = dimension;
                j.invalidateSelf();
                j.A();
            }
        }
    }
    
    public final class b extends i4.a
    {
        public b(final Chip chip) {
            super((View)chip);
        }
        
        public final int e(final float n, final float n2) {
            final Chip o = Chip.this;
            final Rect z = Chip.z;
            return (o.e() && Chip.this.getCloseIconTouchBounds().contains(n, n2)) ? 1 : 0;
        }
        
        public final void f(final ArrayList list) {
            final int n = 0;
            list.add(0);
            final Chip o = Chip.this;
            final Rect z = Chip.z;
            if (o.e()) {
                final Chip o2 = Chip.this;
                final a j = o2.j;
                int n2 = n;
                if (j != null) {
                    n2 = n;
                    if (j.Q) {
                        n2 = 1;
                    }
                }
                if (n2 != 0 && o2.m != null) {
                    list.add(1);
                }
            }
        }
        
        public final boolean j(final int n, final int n2) {
            final boolean b = false;
            final boolean b2 = false;
            boolean b3 = b;
            if (n2 == 16) {
                if (n == 0) {
                    return ((View)Chip.this).performClick();
                }
                b3 = b;
                if (n == 1) {
                    final Chip o = Chip.this;
                    ((View)o).playSoundEffect(0);
                    final View$OnClickListener m = o.m;
                    b3 = b2;
                    if (m != null) {
                        m.onClick((View)o);
                        b3 = true;
                    }
                    o.v.p(1, 1);
                }
            }
            return b3;
        }
        
        public final void l(final b4.c c) {
            c.a.setCheckable(Chip.this.f());
            c.a.setClickable(((View)Chip.this).isClickable());
            if (!Chip.this.f() && !((View)Chip.this).isClickable()) {
                c.n((CharSequence)"android.view.View");
            }
            else {
                String s;
                if (Chip.this.f()) {
                    s = "android.widget.CompoundButton";
                }
                else {
                    s = "android.widget.Button";
                }
                c.n((CharSequence)s);
            }
            c.w(((TextView)Chip.this).getText());
        }
        
        public final void m(final int n, final b4.c c) {
            String s = "";
            if (n == 1) {
                final CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    c.q(closeIconContentDescription);
                }
                else {
                    final CharSequence text = ((TextView)Chip.this).getText();
                    final Context context = ((View)Chip.this).getContext();
                    if (!TextUtils.isEmpty(text)) {
                        s = (String)text;
                    }
                    c.q((CharSequence)context.getString(2131955995, new Object[] { s }).trim());
                }
                c.m(Chip.this.getCloseIconTouchBoundsInt());
                c.b(c$a.g);
                c.a.setEnabled(((View)Chip.this).isEnabled());
            }
            else {
                c.q((CharSequence)"");
                c.m(Chip.z);
            }
        }
        
        public final void n(final int n, final boolean r) {
            if (n == 1) {
                final Chip o = Chip.this;
                o.r = r;
                ((View)o).refreshDrawableState();
            }
        }
    }
}
