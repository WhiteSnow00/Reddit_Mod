// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.textfield;

import android.graphics.Paint;
import androidx.appcompat.widget.AppCompatImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout$LayoutParams;
import android.graphics.ColorFilter;
import androidx.appcompat.widget.i;
import androidx.appcompat.widget.d0;
import android.text.TextPaint;
import a4.q0$e;
import android.view.ViewGroup$MarginLayoutParams;
import android.widget.TextView;
import android.graphics.Canvas;
import android.os.Parcelable;
import android.view.ViewStructure;
import android.util.TypedValue;
import tf.f$b;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.graphics.Bitmap;
import java.util.Iterator;
import android.text.TextUtils;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import a4.q0$c;
import r3.a$b;
import a4.t1;
import java.util.WeakHashMap;
import android.content.res.TypedArray;
import android.view.animation.LinearInterpolator;
import a4.q0$g;
import xf.o;
import xf.e;
import android.view.View$OnClickListener;
import a4.q0$d;
import a4.q0;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import tf.j$a;
import tf.c;
import androidx.appcompat.widget.z0;
import of.g;
import pd.r;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import xf.l;
import android.widget.EditText;
import xf.k;
import android.util.SparseArray;
import java.util.LinkedHashSet;
import android.view.View$OnLongClickListener;
import android.widget.FrameLayout;
import android.graphics.drawable.ColorDrawable;
import android.graphics.PorterDuff$Mode;
import com.google.android.material.internal.CheckableImageButton;
import android.graphics.Typeface;
import android.graphics.RectF;
import android.graphics.Rect;
import android.animation.ValueAnimator;
import com.google.android.material.internal.a;
import tf.j;
import tf.f;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.AppCompatTextView;
import android.widget.LinearLayout;

public class TextInputLayout extends LinearLayout
{
    public final AppCompatTextView A;
    public int A0;
    public CharSequence B;
    public ColorStateList B0;
    public final AppCompatTextView C;
    public int C0;
    public boolean D;
    public int D0;
    public CharSequence E;
    public int E0;
    public boolean F;
    public int F0;
    public tf.f G;
    public int G0;
    public tf.f H;
    public boolean H0;
    public j I;
    public final a I0;
    public final int J;
    public boolean J0;
    public int K;
    public ValueAnimator K0;
    public final int L;
    public boolean L0;
    public int M;
    public boolean M0;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final Rect R;
    public final Rect S;
    public final RectF T;
    public Typeface U;
    public final CheckableImageButton V;
    public ColorStateList W;
    public boolean a0;
    public PorterDuff$Mode b0;
    public boolean c0;
    public ColorDrawable d0;
    public int e0;
    public final FrameLayout f;
    public View$OnLongClickListener f0;
    public final LinearLayout g;
    public final LinkedHashSet<f> g0;
    public final LinearLayout h;
    public int h0;
    public final FrameLayout i;
    public final SparseArray<k> i0;
    public EditText j;
    public final CheckableImageButton j0;
    public CharSequence k;
    public final LinkedHashSet<g> k0;
    public final l l;
    public ColorStateList l0;
    public boolean m;
    public boolean m0;
    public int n;
    public PorterDuff$Mode n0;
    public boolean o;
    public boolean o0;
    public AppCompatTextView p;
    public ColorDrawable p0;
    public int q;
    public int q0;
    public int r;
    public Drawable r0;
    public CharSequence s;
    public View$OnLongClickListener s0;
    public boolean t;
    public View$OnLongClickListener t0;
    public AppCompatTextView u;
    public final CheckableImageButton u0;
    public ColorStateList v;
    public ColorStateList v0;
    public int w;
    public ColorStateList w0;
    public ColorStateList x;
    public ColorStateList x0;
    public ColorStateList y;
    public int y0;
    public CharSequence z;
    public int z0;
    
    public TextInputLayout(final Context context, final AttributeSet set) {
        super(yf.a.a(context, set, 2130969948, 2132018076), set, 2130969948);
        this.l = new l(this);
        this.R = new Rect();
        this.S = new Rect();
        this.T = new RectF();
        this.g0 = new LinkedHashSet<f>();
        this.h0 = 0;
        final SparseArray i0 = new SparseArray();
        this.i0 = (SparseArray<k>)i0;
        this.k0 = new LinkedHashSet<g>();
        final a i2 = new a((View)this);
        this.I0 = i2;
        final Context context2 = ((View)this).getContext();
        this.setOrientation(1);
        ((View)this).setWillNotDraw(false);
        ((ViewGroup)this).setAddStatesFromChildren(true);
        final FrameLayout f = new FrameLayout(context2);
        ((ViewGroup)(this.f = f)).setAddStatesFromChildren(true);
        ((ViewGroup)this).addView((View)f);
        final LinearLayout g = new LinearLayout(context2);
        (this.g = g).setOrientation(0);
        ((View)g).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -1, 8388611));
        ((ViewGroup)f).addView((View)g);
        final LinearLayout h = new LinearLayout(context2);
        (this.h = h).setOrientation(0);
        ((View)h).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -1, 8388613));
        ((ViewGroup)f).addView((View)h);
        final FrameLayout j = new FrameLayout(context2);
        ((View)(this.i = j)).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -1));
        final LinearInterpolator a = xe.a.a;
        i2.I = (TimeInterpolator)a;
        i2.j();
        i2.H = (TimeInterpolator)a;
        i2.j();
        if (i2.h != 8388659) {
            i2.h = 8388659;
            i2.j();
        }
        final int[] u = pd.r.U;
        of.g.a(context2, set, 2130969948, 2132018076);
        of.g.b(context2, set, u, 2130969948, 2132018076, new int[] { 18, 16, 31, 35, 39 });
        final TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(set, u, 2130969948, 2132018076);
        final z0 z0 = new z0(context2, obtainStyledAttributes);
        this.D = z0.a(38, true);
        this.setHint(z0.k(2));
        this.J0 = z0.a(37, true);
        final tf.a a2 = new tf.a((float)0);
        final TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(set, pd.r.L, 2130969948, 2132018076);
        final int resourceId = obtainStyledAttributes2.getResourceId(0, 0);
        final int resourceId2 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        this.I = new j(tf.j.a(context2, resourceId, resourceId2, (c)a2));
        this.J = context2.getResources().getDimensionPixelOffset(2131166296);
        this.L = z0.c(5, 0);
        this.N = z0.d(12, context2.getResources().getDimensionPixelSize(2131166297));
        this.O = z0.d(13, context2.getResources().getDimensionPixelSize(2131166298));
        this.M = this.N;
        final float dimension = obtainStyledAttributes.getDimension(9, -1.0f);
        final float dimension2 = obtainStyledAttributes.getDimension(8, -1.0f);
        final float dimension3 = obtainStyledAttributes.getDimension(6, -1.0f);
        final float dimension4 = obtainStyledAttributes.getDimension(7, -1.0f);
        final j k = this.I;
        k.getClass();
        final j$a j$a = new j$a(k);
        if (dimension >= 0.0f) {
            j$a.e = (c)new tf.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            j$a.f = (c)new tf.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            j$a.g = (c)new tf.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            j$a.h = (c)new tf.a(dimension4);
        }
        this.I = new j(j$a);
        final ColorStateList b = qf.c.b(context2, z0, 3);
        if (b != null) {
            final int defaultColor = b.getDefaultColor();
            this.C0 = defaultColor;
            this.Q = defaultColor;
            if (b.isStateful()) {
                this.D0 = b.getColorForState(new int[] { -16842910 }, -1);
                this.E0 = b.getColorForState(new int[] { 16842908, 16842910 }, -1);
                this.F0 = b.getColorForState(new int[] { 16843623, 16842910 }, -1);
            }
            else {
                this.E0 = this.C0;
                final ColorStateList colorStateList = n3.a.getColorStateList(context2, 2131100303);
                this.D0 = colorStateList.getColorForState(new int[] { -16842910 }, -1);
                this.F0 = colorStateList.getColorForState(new int[] { 16843623 }, -1);
            }
        }
        else {
            this.Q = 0;
            this.C0 = 0;
            this.D0 = 0;
            this.E0 = 0;
            this.F0 = 0;
        }
        if (z0.l(1)) {
            final ColorStateList b2 = z0.b(1);
            this.x0 = b2;
            this.w0 = b2;
        }
        final ColorStateList b3 = qf.c.b(context2, z0, 10);
        this.A0 = obtainStyledAttributes.getColor(10, 0);
        this.y0 = n3.a.getColor(context2, 2131100321);
        this.G0 = n3.a.getColor(context2, 2131100322);
        this.z0 = n3.a.getColor(context2, 2131100325);
        if (b3 != null) {
            this.setBoxStrokeColorStateList(b3);
        }
        if (z0.l(11)) {
            this.setBoxStrokeErrorColor(qf.c.b(context2, z0, 11));
        }
        if (z0.i(39, -1) != -1) {
            this.setHintTextAppearance(z0.i(39, 0));
        }
        final int l = z0.i(31, 0);
        final CharSequence m = z0.k(26);
        final boolean a3 = z0.a(27, false);
        final CheckableImageButton u2 = (CheckableImageButton)LayoutInflater.from(((View)this).getContext()).inflate(2131624192, (ViewGroup)h, false);
        ((View)(this.u0 = u2)).setVisibility(8);
        if (z0.l(28)) {
            this.setErrorIconDrawable(z0.e(28));
        }
        if (z0.l(29)) {
            this.setErrorIconTintList(qf.c.b(context2, z0, 29));
        }
        if (z0.l(30)) {
            this.setErrorIconTintMode(of.j.c(z0.h(30, -1), (PorterDuff$Mode)null));
        }
        ((View)u2).setContentDescription(((View)this).getResources().getText(2131953302));
        final WeakHashMap<View, t1> a4 = a4.q0.a;
        q0$d.s((View)u2, 2);
        ((View)u2).setClickable(false);
        u2.setPressable(false);
        ((View)u2).setFocusable(false);
        final int i3 = z0.i(35, 0);
        final boolean a5 = z0.a(34, false);
        final CharSequence k2 = z0.k(33);
        final int i4 = z0.i(47, 0);
        final CharSequence k3 = z0.k(46);
        final int i5 = z0.i(50, 0);
        final CharSequence k4 = z0.k(49);
        final int i6 = z0.i(60, 0);
        final CharSequence k5 = z0.k(59);
        final boolean a6 = z0.a(14, false);
        this.setCounterMaxLength(z0.h(15, -1));
        this.r = z0.i(18, 0);
        this.q = z0.i(16, 0);
        final CheckableImageButton v = (CheckableImageButton)LayoutInflater.from(((View)this).getContext()).inflate(2131624193, (ViewGroup)g, false);
        ((View)(this.V = v)).setVisibility(8);
        this.setStartIconOnClickListener(null);
        this.setStartIconOnLongClickListener(null);
        if (z0.l(56)) {
            this.setStartIconDrawable(z0.e(56));
            if (z0.l(55)) {
                this.setStartIconContentDescription(z0.k(55));
            }
            this.setStartIconCheckable(z0.a(54, true));
        }
        if (z0.l(57)) {
            this.setStartIconTintList(qf.c.b(context2, z0, 57));
        }
        if (z0.l(58)) {
            this.setStartIconTintMode(of.j.c(z0.h(58, -1), (PorterDuff$Mode)null));
        }
        this.setBoxBackgroundMode(z0.h(4, 0));
        final CheckableImageButton j2 = (CheckableImageButton)LayoutInflater.from(((View)this).getContext()).inflate(2131624192, (ViewGroup)j, false);
        ((ViewGroup)j).addView((View)(this.j0 = j2));
        ((View)j2).setVisibility(8);
        i0.append(-1, (Object)new e(this));
        i0.append(0, (Object)new o(this));
        i0.append(1, (Object)new com.google.android.material.textfield.c(this));
        i0.append(2, (Object)new com.google.android.material.textfield.a(this));
        i0.append(3, (Object)new b(this));
        if (z0.l(23)) {
            this.setEndIconMode(z0.h(23, 0));
            if (z0.l(22)) {
                this.setEndIconDrawable(z0.e(22));
            }
            if (z0.l(21)) {
                this.setEndIconContentDescription(z0.k(21));
            }
            this.setEndIconCheckable(z0.a(20, true));
        }
        else if (z0.l(43)) {
            this.setEndIconMode(z0.a(43, false) ? 1 : 0);
            this.setEndIconDrawable(z0.e(42));
            this.setEndIconContentDescription(z0.k(41));
            if (z0.l(44)) {
                this.setEndIconTintList(qf.c.b(context2, z0, 44));
            }
            if (z0.l(45)) {
                this.setEndIconTintMode(of.j.c(z0.h(45, -1), (PorterDuff$Mode)null));
            }
        }
        if (!z0.l(43)) {
            if (z0.l(24)) {
                this.setEndIconTintList(qf.c.b(context2, z0, 24));
            }
            if (z0.l(25)) {
                this.setEndIconTintMode(of.j.c(z0.h(25, -1), (PorterDuff$Mode)null));
            }
        }
        final AppCompatTextView a7 = new AppCompatTextView(context2);
        ((View)(this.A = a7)).setId(2131431727);
        ((View)a7).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2));
        q0$g.f((View)a7, 1);
        ((ViewGroup)g).addView((View)v);
        ((ViewGroup)g).addView((View)a7);
        final AppCompatTextView c = new AppCompatTextView(context2);
        ((View)(this.C = c)).setId(2131431728);
        ((View)c).setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -2, 80));
        q0$g.f((View)c, 1);
        ((ViewGroup)h).addView((View)c);
        ((ViewGroup)h).addView((View)u2);
        ((ViewGroup)h).addView((View)j);
        this.setHelperTextEnabled(a5);
        this.setHelperText(k2);
        this.setHelperTextTextAppearance(i3);
        this.setErrorEnabled(a3);
        this.setErrorTextAppearance(l);
        this.setErrorContentDescription(m);
        this.setCounterTextAppearance(this.r);
        this.setCounterOverflowTextAppearance(this.q);
        this.setPlaceholderText(k3);
        this.setPlaceholderTextAppearance(i4);
        this.setPrefixText(k4);
        this.setPrefixTextAppearance(i5);
        this.setSuffixText(k5);
        this.setSuffixTextAppearance(i6);
        if (z0.l(32)) {
            this.setErrorTextColor(z0.b(32));
        }
        if (z0.l(36)) {
            this.setHelperTextColor(z0.b(36));
        }
        if (z0.l(40)) {
            this.setHintTextColor(z0.b(40));
        }
        if (z0.l(19)) {
            this.setCounterTextColor(z0.b(19));
        }
        if (z0.l(17)) {
            this.setCounterOverflowTextColor(z0.b(17));
        }
        if (z0.l(48)) {
            this.setPlaceholderTextColor(z0.b(48));
        }
        if (z0.l(51)) {
            this.setPrefixTextColor(z0.b(51));
        }
        if (z0.l(61)) {
            this.setSuffixTextColor(z0.b(61));
        }
        this.setCounterEnabled(a6);
        this.setEnabled(z0.a(0, true));
        z0.n();
        q0$d.s((View)this, 2);
    }
    
    public static void d(final CheckableImageButton checkableImageButton, final boolean b, final ColorStateList list, final boolean b2, final PorterDuff$Mode porterDuff$Mode) {
        Drawable drawable2;
        final Drawable drawable = drawable2 = ((ImageView)checkableImageButton).getDrawable();
        Label_0063: {
            if (drawable != null) {
                if (!b) {
                    drawable2 = drawable;
                    if (!b2) {
                        break Label_0063;
                    }
                }
                final Drawable mutate = drawable.mutate();
                if (b) {
                    a$b.h(mutate, list);
                }
                drawable2 = mutate;
                if (b2) {
                    a$b.i(mutate, porterDuff$Mode);
                    drawable2 = mutate;
                }
            }
        }
        if (((ImageView)checkableImageButton).getDrawable() != drawable2) {
            ((AppCompatImageButton)checkableImageButton).setImageDrawable(drawable2);
        }
    }
    
    private k getEndIconDelegate() {
        k k = (k)this.i0.get(this.h0);
        if (k == null) {
            k = (k)this.i0.get(0);
        }
        return k;
    }
    
    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (((View)this.u0).getVisibility() == 0) {
            return this.u0;
        }
        if (this.h0 != 0 && this.g()) {
            return this.j0;
        }
        return null;
    }
    
    public static void j(final ViewGroup viewGroup, final boolean enabled) {
        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = viewGroup.getChildAt(i);
            child.setEnabled(enabled);
            if (child instanceof ViewGroup) {
                j((ViewGroup)child, enabled);
            }
        }
    }
    
    public static void k(final CheckableImageButton checkableImageButton, final View$OnLongClickListener view$OnLongClickListener) {
        final WeakHashMap<View, t1> a = q0.a;
        final boolean a2 = q0$c.a((View)checkableImageButton);
        boolean focusable = false;
        int n = 1;
        final boolean longClickable = view$OnLongClickListener != null;
        if (a2 || longClickable) {
            focusable = true;
        }
        ((View)checkableImageButton).setFocusable(focusable);
        ((View)checkableImageButton).setClickable(a2);
        checkableImageButton.setPressable(a2);
        ((View)checkableImageButton).setLongClickable(longClickable);
        if (!focusable) {
            n = 2;
        }
        q0$d.s((View)checkableImageButton, n);
    }
    
    private void setEditText(final EditText j) {
        if (this.j == null) {
            if (this.h0 != 3 && !(j instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.j = j;
            this.h();
            this.setTextInputAccessibilityDelegate(new TextInputLayout.TextInputLayout$e(this));
            final a i0 = this.I0;
            final Typeface typeface = ((TextView)this.j).getTypeface();
            final qf.a w = i0.w;
            if (w != null) {
                w.h = true;
            }
            boolean b;
            if (i0.s != typeface) {
                i0.s = typeface;
                b = true;
            }
            else {
                b = false;
            }
            final qf.a v = i0.v;
            if (v != null) {
                v.h = true;
            }
            boolean b2;
            if (i0.t != typeface) {
                i0.t = typeface;
                b2 = true;
            }
            else {
                b2 = false;
            }
            if (b || b2) {
                i0.j();
            }
            final a i2 = this.I0;
            final float textSize = ((TextView)this.j).getTextSize();
            if (i2.i != textSize) {
                i2.i = textSize;
                i2.j();
            }
            final int gravity = ((TextView)this.j).getGravity();
            final a i3 = this.I0;
            final int h = (gravity & 0xFFFFFF8F) | 0x30;
            if (i3.h != h) {
                i3.h = h;
                i3.j();
            }
            final a i4 = this.I0;
            if (i4.g != gravity) {
                i4.g = gravity;
                i4.j();
            }
            ((TextView)this.j).addTextChangedListener((TextWatcher)new TextWatcher() {
                public final void afterTextChanged(final Editable editable) {
                    final TextInputLayout f = TextInputLayout.this;
                    f.s(f.M0 ^ true, false);
                    final TextInputLayout f2 = TextInputLayout.this;
                    if (f2.m) {
                        f2.m(((CharSequence)editable).length());
                    }
                    final TextInputLayout f3 = TextInputLayout.this;
                    if (f3.t) {
                        f3.t(((CharSequence)editable).length());
                    }
                }
                
                public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
                }
                
                public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
                }
            });
            if (this.w0 == null) {
                this.w0 = ((TextView)this.j).getHintTextColors();
            }
            if (this.D) {
                if (TextUtils.isEmpty(this.E)) {
                    this.setHint(this.k = ((TextView)this.j).getHint());
                    ((TextView)this.j).setHint((CharSequence)null);
                }
                this.F = true;
            }
            if (this.p != null) {
                this.m(((CharSequence)this.j.getText()).length());
            }
            this.p();
            this.l.b();
            ((View)this.g).bringToFront();
            ((View)this.h).bringToFront();
            ((View)this.i).bringToFront();
            ((View)this.u0).bringToFront();
            final Iterator<Object> iterator = this.g0.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(this);
            }
            this.u();
            this.x();
            if (!((View)this).isEnabled()) {
                ((View)j).setEnabled(false);
            }
            this.s(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }
    
    private void setErrorIconVisible(final boolean b) {
        final CheckableImageButton u0 = this.u0;
        final int n = 0;
        final int n2 = 8;
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)u0).setVisibility(visibility);
        final FrameLayout i = this.i;
        int visibility2;
        if (b) {
            visibility2 = n2;
        }
        else {
            visibility2 = 0;
        }
        ((View)i).setVisibility(visibility2);
        this.x();
        int n3 = n;
        if (this.h0 != 0) {
            n3 = 1;
        }
        if (n3 == 0) {
            this.o();
        }
    }
    
    private void setHintInternal(final CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.E)) {
            this.E = charSequence;
            final a i0 = this.I0;
            if (charSequence == null || !TextUtils.equals(i0.x, charSequence)) {
                i0.x = charSequence;
                i0.y = null;
                final Bitmap a = i0.A;
                if (a != null) {
                    a.recycle();
                    i0.A = null;
                }
                i0.j();
            }
            if (!this.H0) {
                this.i();
            }
        }
    }
    
    private void setPlaceholderTextEnabled(final boolean t) {
        if (this.t == t) {
            return;
        }
        if (t) {
            ((View)(this.u = new AppCompatTextView(((View)this).getContext()))).setId(2131431726);
            final AppCompatTextView u = this.u;
            final WeakHashMap<View, t1> a = a4.q0.a;
            q0$g.f((View)u, 1);
            this.setPlaceholderTextAppearance(this.w);
            this.setPlaceholderTextColor(this.v);
            final AppCompatTextView u2 = this.u;
            if (u2 != null) {
                ((ViewGroup)this.f).addView((View)u2);
                ((View)this.u).setVisibility(0);
            }
        }
        else {
            final AppCompatTextView u3 = this.u;
            if (u3 != null) {
                ((View)u3).setVisibility(8);
            }
            this.u = null;
        }
        this.t = t;
    }
    
    public final void a(final float n) {
        if (this.I0.c == n) {
            return;
        }
        if (this.K0 == null) {
            (this.K0 = new ValueAnimator()).setInterpolator((TimeInterpolator)xe.a.b);
            this.K0.setDuration(167L);
            this.K0.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
                public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                    TextInputLayout.this.I0.n((float)valueAnimator.getAnimatedValue());
                }
            });
        }
        this.K0.setFloatValues(new float[] { this.I0.c, n });
        this.K0.start();
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams layoutParams) {
        if (view instanceof EditText) {
            final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(layoutParams);
            frameLayout$LayoutParams.gravity = ((frameLayout$LayoutParams.gravity & 0xFFFFFF8F) | 0x10);
            ((ViewGroup)this.f).addView(view, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
            ((View)this.f).setLayoutParams(layoutParams);
            this.r();
            this.setEditText((EditText)view);
        }
        else {
            super.addView(view, n, layoutParams);
        }
    }
    
    public final void b() {
        final tf.f g = this.G;
        if (g == null) {
            return;
        }
        g.setShapeAppearanceModel(this.I);
        final int k = this.K;
        final int n = 1;
        if (k == 2 && (this.M > -1 && this.P != 0)) {
            final tf.f g2 = this.G;
            final float i = (float)this.M;
            final int p = this.P;
            g2.f.k = i;
            g2.invalidateSelf();
            final ColorStateList value = ColorStateList.valueOf(p);
            final f$b f = g2.f;
            if (f.d != value) {
                f.d = value;
                g2.onStateChange(((Drawable)g2).getState());
            }
        }
        int q = this.Q;
        if (this.K == 1) {
            final TypedValue a = qf.b.a(2130968836, ((View)this).getContext());
            int data;
            if (a != null) {
                data = a.data;
            }
            else {
                data = 0;
            }
            q = q3.e.g(this.Q, data);
        }
        this.Q = q;
        this.G.l(ColorStateList.valueOf(q));
        if (this.h0 == 3) {
            ((View)this.j).getBackground().invalidateSelf();
        }
        final tf.f h = this.H;
        if (h != null) {
            int n2;
            if (this.M > -1 && this.P != 0) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (n2 != 0) {
                h.l(ColorStateList.valueOf(this.P));
            }
            ((View)this).invalidate();
        }
        ((View)this).invalidate();
    }
    
    public final void c() {
        d(this.j0, this.m0, this.l0, this.o0, this.n0);
    }
    
    public final void dispatchProvideAutofillStructure(final ViewStructure viewStructure, final int n) {
        if (this.k != null) {
            final EditText j = this.j;
            if (j != null) {
                final boolean f = this.F;
                this.F = false;
                final CharSequence hint = ((TextView)j).getHint();
                ((TextView)this.j).setHint(this.k);
                try {
                    super.dispatchProvideAutofillStructure(viewStructure, n);
                    return;
                }
                finally {
                    ((TextView)this.j).setHint(hint);
                    this.F = f;
                }
            }
        }
        super.dispatchProvideAutofillStructure(viewStructure, n);
    }
    
    public final void dispatchRestoreInstanceState(final SparseArray<Parcelable> sparseArray) {
        this.M0 = true;
        super.dispatchRestoreInstanceState((SparseArray)sparseArray);
        this.M0 = false;
    }
    
    public final void draw(final Canvas canvas) {
        super.draw(canvas);
        if (this.D) {
            this.I0.e(canvas);
        }
        final tf.f h = this.H;
        if (h != null) {
            final Rect bounds = ((Drawable)h).getBounds();
            bounds.top = bounds.bottom - this.M;
            this.H.draw(canvas);
        }
    }
    
    public final void drawableStateChanged() {
        if (this.L0) {
            return;
        }
        boolean b = true;
        this.L0 = true;
        super.drawableStateChanged();
        final int[] drawableState = ((View)this).getDrawableState();
        final a i0 = this.I0;
        final boolean b2 = i0 != null && (i0.p(drawableState) | false);
        if (this.j != null) {
            final WeakHashMap<View, t1> a = a4.q0.a;
            if (!q0$g.c((View)this) || !((View)this).isEnabled()) {
                b = false;
            }
            this.s(b, false);
        }
        this.p();
        this.z();
        if (b2) {
            ((View)this).invalidate();
        }
        this.L0 = false;
    }
    
    public final int e() {
        if (!this.D) {
            return 0;
        }
        final int k = this.K;
        float f;
        if (k != 0 && k != 1) {
            if (k != 2) {
                return 0;
            }
            f = this.I0.f() / 2.0f;
        }
        else {
            f = this.I0.f();
        }
        return (int)f;
    }
    
    public final boolean f() {
        return this.D && !TextUtils.isEmpty(this.E) && this.G instanceof xf.f;
    }
    
    public final boolean g() {
        return ((View)this.i).getVisibility() == 0 && ((View)this.j0).getVisibility() == 0;
    }
    
    public int getBaseline() {
        final EditText j = this.j;
        if (j != null) {
            return this.e() + (((View)this).getPaddingTop() + ((View)j).getBaseline());
        }
        return super.getBaseline();
    }
    
    public tf.f getBoxBackground() {
        final int k = this.K;
        if (k != 1 && k != 2) {
            throw new IllegalStateException();
        }
        return this.G;
    }
    
    public int getBoxBackgroundColor() {
        return this.Q;
    }
    
    public int getBoxBackgroundMode() {
        return this.K;
    }
    
    public float getBoxCornerRadiusBottomEnd() {
        final tf.f g = this.G;
        return g.f.a.h.a(g.g());
    }
    
    public float getBoxCornerRadiusBottomStart() {
        final tf.f g = this.G;
        return g.f.a.g.a(g.g());
    }
    
    public float getBoxCornerRadiusTopEnd() {
        final tf.f g = this.G;
        return g.f.a.f.a(g.g());
    }
    
    public float getBoxCornerRadiusTopStart() {
        return this.G.h();
    }
    
    public int getBoxStrokeColor() {
        return this.A0;
    }
    
    public ColorStateList getBoxStrokeErrorColor() {
        return this.B0;
    }
    
    public int getBoxStrokeWidth() {
        return this.N;
    }
    
    public int getBoxStrokeWidthFocused() {
        return this.O;
    }
    
    public int getCounterMaxLength() {
        return this.n;
    }
    
    public CharSequence getCounterOverflowDescription() {
        if (this.m && this.o) {
            final AppCompatTextView p = this.p;
            if (p != null) {
                return ((View)p).getContentDescription();
            }
        }
        return null;
    }
    
    public ColorStateList getCounterOverflowTextColor() {
        return this.x;
    }
    
    public ColorStateList getCounterTextColor() {
        return this.x;
    }
    
    public ColorStateList getDefaultHintTextColor() {
        return this.w0;
    }
    
    public EditText getEditText() {
        return this.j;
    }
    
    public CharSequence getEndIconContentDescription() {
        return ((View)this.j0).getContentDescription();
    }
    
    public Drawable getEndIconDrawable() {
        return ((ImageView)this.j0).getDrawable();
    }
    
    public int getEndIconMode() {
        return this.h0;
    }
    
    public CheckableImageButton getEndIconView() {
        return this.j0;
    }
    
    public CharSequence getError() {
        final l l = this.l;
        CharSequence k;
        if (l.l) {
            k = l.k;
        }
        else {
            k = null;
        }
        return k;
    }
    
    public CharSequence getErrorContentDescription() {
        return this.l.n;
    }
    
    public int getErrorCurrentTextColors() {
        return this.l.g();
    }
    
    public Drawable getErrorIconDrawable() {
        return ((ImageView)this.u0).getDrawable();
    }
    
    public final int getErrorTextCurrentColor() {
        return this.l.g();
    }
    
    public CharSequence getHelperText() {
        final l l = this.l;
        CharSequence q;
        if (l.r) {
            q = l.q;
        }
        else {
            q = null;
        }
        return q;
    }
    
    public int getHelperTextCurrentTextColor() {
        final AppCompatTextView s = this.l.s;
        int currentTextColor;
        if (s != null) {
            currentTextColor = ((TextView)s).getCurrentTextColor();
        }
        else {
            currentTextColor = -1;
        }
        return currentTextColor;
    }
    
    public CharSequence getHint() {
        CharSequence e;
        if (this.D) {
            e = this.E;
        }
        else {
            e = null;
        }
        return e;
    }
    
    public final float getHintCollapsedTextHeight() {
        return this.I0.f();
    }
    
    public final int getHintCurrentCollapsedTextColor() {
        final a i0 = this.I0;
        return i0.g(i0.l);
    }
    
    public ColorStateList getHintTextColor() {
        return this.x0;
    }
    
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return ((View)this.j0).getContentDescription();
    }
    
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return ((ImageView)this.j0).getDrawable();
    }
    
    public CharSequence getPlaceholderText() {
        CharSequence s;
        if (this.t) {
            s = this.s;
        }
        else {
            s = null;
        }
        return s;
    }
    
    public int getPlaceholderTextAppearance() {
        return this.w;
    }
    
    public ColorStateList getPlaceholderTextColor() {
        return this.v;
    }
    
    public CharSequence getPrefixText() {
        return this.z;
    }
    
    public ColorStateList getPrefixTextColor() {
        return ((TextView)this.A).getTextColors();
    }
    
    public TextView getPrefixTextView() {
        return (TextView)this.A;
    }
    
    public CharSequence getStartIconContentDescription() {
        return ((View)this.V).getContentDescription();
    }
    
    public Drawable getStartIconDrawable() {
        return ((ImageView)this.V).getDrawable();
    }
    
    public CharSequence getSuffixText() {
        return this.B;
    }
    
    public ColorStateList getSuffixTextColor() {
        return ((TextView)this.C).getTextColors();
    }
    
    public TextView getSuffixTextView() {
        return (TextView)this.C;
    }
    
    public Typeface getTypeface() {
        return this.U;
    }
    
    public final void h() {
        final int k = this.K;
        boolean b = true;
        if (k != 0) {
            if (k != 1) {
                if (k != 2) {
                    throw new IllegalArgumentException(al0.a.l(new StringBuilder(), this.K, " is illegal; only @BoxBackgroundMode constants are supported."));
                }
                if (this.D && !(this.G instanceof xf.f)) {
                    this.G = (tf.f)new xf.f(this.I);
                }
                else {
                    this.G = new tf.f(this.I);
                }
                this.H = null;
            }
            else {
                this.G = new tf.f(this.I);
                this.H = new tf.f();
            }
        }
        else {
            this.G = null;
            this.H = null;
        }
        final EditText j = this.j;
        if (j == null || this.G == null || ((View)j).getBackground() != null || this.K == 0) {
            b = false;
        }
        if (b) {
            final EditText i = this.j;
            final tf.f g = this.G;
            final WeakHashMap<View, t1> a = a4.q0.a;
            q0$d.q((View)i, (Drawable)g);
        }
        this.z();
        if (this.K != 0) {
            this.r();
        }
    }
    
    public final void i() {
        if (!this.f()) {
            return;
        }
        final RectF t = this.T;
        final a i0 = this.I0;
        final int width = ((View)this.j).getWidth();
        final int gravity = ((TextView)this.j).getGravity();
        final boolean c = i0.c(i0.x);
        i0.z = c;
        float left = 0.0f;
        Label_0189: {
            float n = 0.0f;
            float n2 = 0.0f;
            Label_0182: {
                if (gravity != 17 && (gravity & 0x7) != 0x1) {
                    int n3;
                    if ((gravity & 0x800005) != 0x800005 && (gravity & 0x5) != 0x5) {
                        if (c) {
                            n = (float)i0.e.right;
                            n2 = i0.b();
                            break Label_0182;
                        }
                        n3 = i0.e.left;
                    }
                    else {
                        if (!c) {
                            n = (float)i0.e.right;
                            n2 = i0.b();
                            break Label_0182;
                        }
                        n3 = i0.e.left;
                    }
                    left = (float)n3;
                    break Label_0189;
                }
                n = width / 2.0f;
                n2 = i0.b() / 2.0f;
            }
            left = n - n2;
        }
        t.left = left;
        final Rect e = i0.e;
        t.top = (float)e.top;
        float right = 0.0f;
        Label_0328: {
            if (gravity != 17 && (gravity & 0x7) != 0x1) {
                int n4 = 0;
                Label_0307: {
                    float n5;
                    if ((gravity & 0x800005) != 0x800005 && (gravity & 0x5) != 0x5) {
                        if (i0.z) {
                            n4 = e.right;
                            break Label_0307;
                        }
                        n5 = i0.b();
                    }
                    else {
                        if (!i0.z) {
                            n4 = e.right;
                            break Label_0307;
                        }
                        n5 = i0.b();
                    }
                    right = n5 + left;
                    break Label_0328;
                }
                right = (float)n4;
            }
            else {
                right = width / 2.0f + i0.b() / 2.0f;
            }
        }
        t.right = right;
        final float n6 = (float)i0.e.top;
        final float f = i0.f();
        final float left2 = t.left;
        final float n7 = (float)this.J;
        t.left = left2 - n7;
        t.top -= n7;
        t.right += n7;
        t.bottom = f + n6 + n7;
        t.offset((float)(-((View)this).getPaddingLeft()), (float)(-((View)this).getPaddingTop()));
        final xf.f f2 = (xf.f)this.G;
        f2.getClass();
        f2.t(t.left, t.top, t.right, t.bottom);
    }
    
    public final void l(final TextView textView, int defaultColor) {
        final int n = 1;
        while (true) {
            try {
                textView.setTextAppearance(defaultColor);
                defaultColor = textView.getTextColors().getDefaultColor();
                if (defaultColor == -65281) {
                    defaultColor = n;
                }
                else {
                    defaultColor = 0;
                }
                if (defaultColor != 0) {
                    textView.setTextAppearance(2132017671);
                    textView.setTextColor(n3.a.getColor(((View)this).getContext(), 2131099872));
                }
            }
            catch (final Exception ex) {
                defaultColor = n;
                continue;
            }
            break;
        }
    }
    
    public final void m(final int n) {
        final boolean o = this.o;
        final int n2 = this.n;
        CharSequence string = null;
        if (n2 == -1) {
            ((TextView)this.p).setText((CharSequence)String.valueOf(n));
            ((View)this.p).setContentDescription((CharSequence)null);
            this.o = false;
        }
        else {
            this.o = (n > n2);
            final Context context = ((View)this).getContext();
            final AppCompatTextView p = this.p;
            final int n3 = this.n;
            int n4;
            if (this.o) {
                n4 = 2131952390;
            }
            else {
                n4 = 2131952389;
            }
            ((View)p).setContentDescription((CharSequence)context.getString(n4, new Object[] { n, n3 }));
            if (o != this.o) {
                this.n();
            }
            final y3.a c = y3.a.c();
            final AppCompatTextView p2 = this.p;
            final String string2 = ((View)this).getContext().getString(2131952391, new Object[] { n, this.n });
            final y3.e c2 = c.c;
            if (string2 != null) {
                string = c.d((CharSequence)string2, c2).toString();
            }
            ((TextView)p2).setText(string);
        }
        if (this.j != null && o != this.o) {
            this.s(false, false);
            this.z();
            this.p();
        }
    }
    
    public final void n() {
        final AppCompatTextView p = this.p;
        if (p != null) {
            int n;
            if (this.o) {
                n = this.q;
            }
            else {
                n = this.r;
            }
            this.l((TextView)p, n);
            if (!this.o) {
                final ColorStateList x = this.x;
                if (x != null) {
                    ((TextView)this.p).setTextColor(x);
                }
            }
            if (this.o) {
                final ColorStateList y = this.y;
                if (y != null) {
                    ((TextView)this.p).setTextColor(y);
                }
            }
        }
    }
    
    public final boolean o() {
        if (this.j == null) {
            return false;
        }
        final Drawable startIconDrawable = this.getStartIconDrawable();
        final boolean b = true;
        final boolean b2 = true;
        boolean b3 = false;
        Label_0207: {
            Label_0204: {
                if ((startIconDrawable != null || this.z != null) && ((View)this.g).getMeasuredWidth() > 0) {
                    final int e0 = ((View)this.g).getMeasuredWidth() - ((View)this.j).getPaddingLeft();
                    if (this.d0 == null || this.e0 != e0) {
                        ((Drawable)(this.d0 = new ColorDrawable())).setBounds(0, 0, this.e0 = e0, 1);
                    }
                    final Drawable[] a = e4.j.b.a((TextView)this.j);
                    final Drawable drawable = a[0];
                    final ColorDrawable d0 = this.d0;
                    if (drawable == d0) {
                        break Label_0204;
                    }
                    e4.j.b.e((TextView)this.j, (Drawable)d0, a[1], a[2], a[3]);
                }
                else {
                    if (this.d0 == null) {
                        break Label_0204;
                    }
                    final Drawable[] a2 = e4.j.b.a((TextView)this.j);
                    e4.j.b.e((TextView)this.j, null, a2[1], a2[2], a2[3]);
                    this.d0 = null;
                }
                b3 = true;
                break Label_0207;
            }
            b3 = false;
        }
        if ((((View)this.u0).getVisibility() == 0 || (this.h0 != 0 && this.g()) || this.B != null) && ((View)this.h).getMeasuredWidth() > 0) {
            final int n = ((View)this.C).getMeasuredWidth() - ((View)this.j).getPaddingRight();
            final CheckableImageButton endIconToUpdateDummyDrawable = this.getEndIconToUpdateDummyDrawable();
            int n2 = n;
            if (endIconToUpdateDummyDrawable != null) {
                n2 = a4.j.c((ViewGroup$MarginLayoutParams)((View)endIconToUpdateDummyDrawable).getLayoutParams()) + (((View)endIconToUpdateDummyDrawable).getMeasuredWidth() + n);
            }
            final Drawable[] a3 = e4.j.b.a((TextView)this.j);
            final ColorDrawable p0 = this.p0;
            if (p0 != null && this.q0 != n2) {
                ((Drawable)p0).setBounds(0, 0, this.q0 = n2, 1);
                e4.j.b.e((TextView)this.j, a3[0], a3[1], (Drawable)this.p0, a3[3]);
                b3 = b;
            }
            else {
                if (p0 == null) {
                    ((Drawable)(this.p0 = new ColorDrawable())).setBounds(0, 0, this.q0 = n2, 1);
                }
                final Drawable r0 = a3[2];
                final ColorDrawable p2 = this.p0;
                if (r0 != p2) {
                    this.r0 = r0;
                    e4.j.b.e((TextView)this.j, a3[0], a3[1], (Drawable)p2, a3[3]);
                    b3 = b;
                }
            }
        }
        else {
            final boolean b4 = b3;
            if (this.p0 == null) {
                return b4;
            }
            final Drawable[] a4 = e4.j.b.a((TextView)this.j);
            if (a4[2] == this.p0) {
                e4.j.b.e((TextView)this.j, a4[0], a4[1], this.r0, a4[3]);
                b3 = b2;
            }
            this.p0 = null;
        }
        return b3;
    }
    
    public final void onLayout(final boolean b, int bottom, int right, int n, int n2) {
        super.onLayout(b, bottom, right, n, n2);
        final EditText j = this.j;
        if (j != null) {
            final Rect r = this.R;
            of.b.a((ViewGroup)this, (View)j, r);
            final tf.f h = this.H;
            if (h != null) {
                bottom = r.bottom;
                right = this.O;
                ((Drawable)h).setBounds(r.left, bottom - right, r.right, bottom);
            }
            if (this.D) {
                final a i0 = this.I0;
                final float textSize = ((TextView)this.j).getTextSize();
                if (i0.i != textSize) {
                    i0.i = textSize;
                    i0.j();
                }
                bottom = ((TextView)this.j).getGravity();
                final a i2 = this.I0;
                right = ((bottom & 0xFFFFFF8F) | 0x30);
                if (i2.h != right) {
                    i2.h = right;
                    i2.j();
                }
                final a i3 = this.I0;
                if (i3.g != bottom) {
                    i3.g = bottom;
                    i3.j();
                }
                final a i4 = this.I0;
                if (this.j == null) {
                    throw new IllegalStateException();
                }
                final Rect s = this.S;
                final WeakHashMap<View, t1> a = a4.q0.a;
                bottom = q0$e.d((View)this);
                n = 0;
                if (bottom == 1) {
                    bottom = 1;
                }
                else {
                    bottom = 0;
                }
                s.bottom = r.bottom;
                right = this.K;
                if (right != 1) {
                    if (right != 2) {
                        right = r.left;
                        n2 = (right += ((TextView)this.j).getCompoundPaddingLeft());
                        if (this.z != null) {
                            right = n2;
                            if (bottom == 0) {
                                right = n2 - ((View)this.A).getMeasuredWidth() + ((View)this.A).getPaddingLeft();
                            }
                        }
                        s.left = right;
                        s.top = ((View)this).getPaddingTop();
                        n2 = (right = r.right - ((TextView)this.j).getCompoundPaddingRight());
                        if (this.z != null) {
                            right = n2;
                            if (bottom != 0) {
                                right = n2 + (((View)this.A).getMeasuredWidth() - ((View)this.A).getPaddingRight());
                            }
                        }
                        s.right = right;
                    }
                    else {
                        bottom = r.left;
                        s.left = ((View)this.j).getPaddingLeft() + bottom;
                        s.top = r.top - this.e();
                        s.right = r.right - ((View)this.j).getPaddingRight();
                    }
                }
                else {
                    right = r.left;
                    n2 = (right += ((TextView)this.j).getCompoundPaddingLeft());
                    if (this.z != null) {
                        right = n2;
                        if (bottom == 0) {
                            right = n2 - ((View)this.A).getMeasuredWidth() + ((View)this.A).getPaddingLeft();
                        }
                    }
                    s.left = right;
                    s.top = r.top + this.L;
                    n2 = (right = r.right - ((TextView)this.j).getCompoundPaddingRight());
                    if (this.z != null) {
                        right = n2;
                        if (bottom != 0) {
                            right = n2 + (((View)this.A).getMeasuredWidth() - ((View)this.A).getPaddingRight());
                        }
                    }
                    s.right = right;
                }
                i4.getClass();
                final int left = s.left;
                final int top = s.top;
                right = s.right;
                n2 = s.bottom;
                final Rect e = i4.e;
                if (e.left == left && e.top == top && e.right == right && e.bottom == n2) {
                    bottom = 1;
                }
                else {
                    bottom = 0;
                }
                if (bottom == 0) {
                    e.set(left, top, right, n2);
                    i4.E = true;
                    i4.i();
                }
                final a i5 = this.I0;
                if (this.j == null) {
                    throw new IllegalStateException();
                }
                final Rect s2 = this.S;
                final TextPaint g = i5.G;
                ((Paint)g).setTextSize(i5.i);
                ((Paint)g).setTypeface(i5.t);
                final float n3 = -((Paint)i5.G).ascent();
                bottom = r.left;
                s2.left = ((TextView)this.j).getCompoundPaddingLeft() + bottom;
                if (this.K == 1 && ((TextView)this.j).getMinLines() <= 1) {
                    bottom = 1;
                }
                else {
                    bottom = 0;
                }
                if (bottom != 0) {
                    bottom = (int)(r.centerY() - n3 / 2.0f);
                }
                else {
                    bottom = r.top + ((TextView)this.j).getCompoundPaddingTop();
                }
                s2.top = bottom;
                s2.right = r.right - ((TextView)this.j).getCompoundPaddingRight();
                if (this.K == 1 && ((TextView)this.j).getMinLines() <= 1) {
                    bottom = 1;
                }
                else {
                    bottom = 0;
                }
                if (bottom != 0) {
                    bottom = (int)(s2.top + n3);
                }
                else {
                    bottom = r.bottom - ((TextView)this.j).getCompoundPaddingBottom();
                }
                s2.bottom = bottom;
                final int left2 = s2.left;
                n2 = s2.top;
                final int right2 = s2.right;
                final Rect d = i5.d;
                right = n;
                if (d.left == left2) {
                    right = n;
                    if (d.top == n2) {
                        right = n;
                        if (d.right == right2) {
                            right = n;
                            if (d.bottom == bottom) {
                                right = 1;
                            }
                        }
                    }
                }
                if (right == 0) {
                    d.set(left2, n2, right2, bottom);
                    i5.E = true;
                    i5.i();
                }
                this.I0.j();
                if (this.f() && !this.H0) {
                    this.i();
                }
            }
        }
    }
    
    public final void onMeasure(int n, final int n2) {
        super.onMeasure(n, n2);
        Label_0060: {
            if (this.j != null) {
                n = Math.max(((View)this.h).getMeasuredHeight(), ((View)this.g).getMeasuredHeight());
                if (((View)this.j).getMeasuredHeight() < n) {
                    ((View)this.j).setMinimumHeight(n);
                    n = 1;
                    break Label_0060;
                }
            }
            n = 0;
        }
        final boolean o = this.o();
        if (n != 0 || o) {
            ((View)this.j).post((Runnable)new Runnable() {
                @Override
                public final void run() {
                    ((View)TextInputLayout.this.j).requestLayout();
                }
            });
        }
        if (this.u != null) {
            final EditText j = this.j;
            if (j != null) {
                n = ((TextView)j).getGravity();
                ((TextView)this.u).setGravity(n);
                ((TextView)this.u).setPadding(((TextView)this.j).getCompoundPaddingLeft(), ((TextView)this.j).getCompoundPaddingTop(), ((TextView)this.j).getCompoundPaddingRight(), ((TextView)this.j).getCompoundPaddingBottom());
            }
        }
        this.u();
        this.x();
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof TextInputLayout.TextInputLayout$h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final TextInputLayout.TextInputLayout$h textInputLayout$h = (TextInputLayout.TextInputLayout$h)parcelable;
        super.onRestoreInstanceState(((h4.a)textInputLayout$h).f);
        this.setError(textInputLayout$h.h);
        if (textInputLayout$h.i) {
            ((View)this.j0).post((Runnable)new Runnable() {
                @Override
                public final void run() {
                    ((View)TextInputLayout.this.j0).performClick();
                    ((View)TextInputLayout.this.j0).jumpDrawablesToCurrentState();
                }
            });
        }
        ((View)this).requestLayout();
    }
    
    public final Parcelable onSaveInstanceState() {
        final TextInputLayout.TextInputLayout$h textInputLayout$h = new TextInputLayout.TextInputLayout$h(super.onSaveInstanceState());
        if (this.l.e()) {
            textInputLayout$h.h = this.getError();
        }
        final int h0 = this.h0;
        boolean i = true;
        if (h0 == 0 || !this.j0.isChecked()) {
            i = false;
        }
        textInputLayout$h.i = i;
        return (Parcelable)textInputLayout$h;
    }
    
    public final void p() {
        final EditText j = this.j;
        if (j != null) {
            if (this.K == 0) {
                final Drawable background = ((View)j).getBackground();
                if (background == null) {
                    return;
                }
                final int[] a = androidx.appcompat.widget.d0.a;
                final Drawable mutate = background.mutate();
                if (this.l.e()) {
                    mutate.setColorFilter((ColorFilter)androidx.appcompat.widget.i.c(this.l.g(), PorterDuff$Mode.SRC_IN));
                }
                else {
                    if (this.o) {
                        final AppCompatTextView p = this.p;
                        if (p != null) {
                            mutate.setColorFilter((ColorFilter)androidx.appcompat.widget.i.c(((TextView)p).getCurrentTextColor(), PorterDuff$Mode.SRC_IN));
                            return;
                        }
                    }
                    mutate.clearColorFilter();
                    ((View)this.j).refreshDrawableState();
                }
            }
        }
    }
    
    public final void q(final CheckableImageButton checkableImageButton, final ColorStateList list) {
        final Drawable drawable = ((ImageView)checkableImageButton).getDrawable();
        if (((ImageView)checkableImageButton).getDrawable() != null && list != null) {
            if (list.isStateful()) {
                final int colorForState = list.getColorForState(((View)this).getDrawableState(), list.getDefaultColor());
                final Drawable mutate = drawable.mutate();
                a$b.h(mutate, ColorStateList.valueOf(colorForState));
                ((AppCompatImageButton)checkableImageButton).setImageDrawable(mutate);
            }
        }
    }
    
    public final void r() {
        if (this.K != 1) {
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)((View)this.f).getLayoutParams();
            final int e = this.e();
            if (e != linearLayout$LayoutParams.topMargin) {
                linearLayout$LayoutParams.topMargin = e;
                ((View)this.f).requestLayout();
            }
        }
    }
    
    public final void s(final boolean b, final boolean b2) {
        final boolean enabled = ((View)this).isEnabled();
        final EditText j = this.j;
        final int n = 0;
        final boolean b3 = j != null && !TextUtils.isEmpty((CharSequence)j.getText());
        final EditText i = this.j;
        final boolean b4 = i != null && ((View)i).hasFocus();
        final boolean e = this.l.e();
        final ColorStateList w0 = this.w0;
        if (w0 != null) {
            this.I0.l(w0);
            final a i2 = this.I0;
            final ColorStateList w2 = this.w0;
            if (i2.k != w2) {
                i2.k = w2;
                i2.j();
            }
        }
        Label_0334: {
            if (!enabled) {
                final ColorStateList w3 = this.w0;
                int n2;
                if (w3 != null) {
                    n2 = w3.getColorForState(new int[] { -16842910 }, this.G0);
                }
                else {
                    n2 = this.G0;
                }
                this.I0.l(ColorStateList.valueOf(n2));
                final a i3 = this.I0;
                final ColorStateList value = ColorStateList.valueOf(n2);
                if (i3.k != value) {
                    i3.k = value;
                    i3.j();
                }
            }
            else if (e) {
                final a i4 = this.I0;
                final AppCompatTextView m = this.l.m;
                ColorStateList textColors;
                if (m != null) {
                    textColors = ((TextView)m).getTextColors();
                }
                else {
                    textColors = null;
                }
                i4.l(textColors);
            }
            else {
                if (this.o) {
                    final AppCompatTextView p2 = this.p;
                    if (p2 != null) {
                        this.I0.l(((TextView)p2).getTextColors());
                        break Label_0334;
                    }
                }
                if (b4) {
                    final ColorStateList x0 = this.x0;
                    if (x0 != null) {
                        this.I0.l(x0);
                    }
                }
            }
        }
        Label_0517: {
            if (!b3) {
                if (((View)this).isEnabled()) {
                    if (b4) {
                        break Label_0517;
                    }
                    if (e) {
                        break Label_0517;
                    }
                }
                if (b2 || !this.H0) {
                    final ValueAnimator k0 = this.K0;
                    if (k0 != null && k0.isRunning()) {
                        this.K0.cancel();
                    }
                    if (b && this.J0) {
                        this.a(0.0f);
                    }
                    else {
                        this.I0.n(0.0f);
                    }
                    if (this.f() && (((xf.f)this.G).E.isEmpty() ^ true) && this.f()) {
                        ((xf.f)this.G).t(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    this.H0 = true;
                    final AppCompatTextView u = this.u;
                    if (u != null && this.t) {
                        ((TextView)u).setText((CharSequence)null);
                        ((View)this.u).setVisibility(4);
                    }
                    this.v();
                    this.y();
                }
                return;
            }
        }
        if (b2 || this.H0) {
            final ValueAnimator k2 = this.K0;
            if (k2 != null && k2.isRunning()) {
                this.K0.cancel();
            }
            if (b && this.J0) {
                this.a(1.0f);
            }
            else {
                this.I0.n(1.0f);
            }
            this.H0 = false;
            if (this.f()) {
                this.i();
            }
            final EditText l = this.j;
            int length;
            if (l == null) {
                length = n;
            }
            else {
                length = ((CharSequence)l.getText()).length();
            }
            this.t(length);
            this.v();
            this.y();
        }
    }
    
    public void setBoxBackgroundColor(final int n) {
        if (this.Q != n) {
            this.Q = n;
            this.C0 = n;
            this.E0 = n;
            this.F0 = n;
            this.b();
        }
    }
    
    public void setBoxBackgroundColorResource(final int n) {
        this.setBoxBackgroundColor(n3.a.getColor(((View)this).getContext(), n));
    }
    
    public void setBoxBackgroundColorStateList(final ColorStateList list) {
        final int defaultColor = list.getDefaultColor();
        this.C0 = defaultColor;
        this.Q = defaultColor;
        this.D0 = list.getColorForState(new int[] { -16842910 }, -1);
        this.E0 = list.getColorForState(new int[] { 16842908, 16842910 }, -1);
        this.F0 = list.getColorForState(new int[] { 16843623, 16842910 }, -1);
        this.b();
    }
    
    public void setBoxBackgroundMode(final int k) {
        if (k == this.K) {
            return;
        }
        this.K = k;
        if (this.j != null) {
            this.h();
        }
    }
    
    public void setBoxStrokeColor(final int a0) {
        if (this.A0 != a0) {
            this.A0 = a0;
            this.z();
        }
    }
    
    public void setBoxStrokeColorStateList(final ColorStateList list) {
        if (list.isStateful()) {
            this.y0 = list.getDefaultColor();
            this.G0 = list.getColorForState(new int[] { -16842910 }, -1);
            this.z0 = list.getColorForState(new int[] { 16843623, 16842910 }, -1);
            this.A0 = list.getColorForState(new int[] { 16842908, 16842910 }, -1);
        }
        else if (this.A0 != list.getDefaultColor()) {
            this.A0 = list.getDefaultColor();
        }
        this.z();
    }
    
    public void setBoxStrokeErrorColor(final ColorStateList b0) {
        if (this.B0 != b0) {
            this.B0 = b0;
            this.z();
        }
    }
    
    public void setBoxStrokeWidth(final int n) {
        this.N = n;
        this.z();
    }
    
    public void setBoxStrokeWidthFocused(final int o) {
        this.O = o;
        this.z();
    }
    
    public void setBoxStrokeWidthFocusedResource(final int n) {
        this.setBoxStrokeWidthFocused(((View)this).getResources().getDimensionPixelSize(n));
    }
    
    public void setBoxStrokeWidthResource(final int n) {
        this.setBoxStrokeWidth(((View)this).getResources().getDimensionPixelSize(n));
    }
    
    public void setCounterEnabled(final boolean m) {
        if (this.m != m) {
            if (m) {
                ((View)(this.p = new AppCompatTextView(((View)this).getContext()))).setId(2131431723);
                final Typeface u = this.U;
                if (u != null) {
                    ((TextView)this.p).setTypeface(u);
                }
                ((TextView)this.p).setMaxLines(1);
                this.l.a((TextView)this.p, 2);
                a4.j.h((ViewGroup$MarginLayoutParams)((View)this.p).getLayoutParams(), ((View)this).getResources().getDimensionPixelOffset(2131166299));
                this.n();
                if (this.p != null) {
                    final EditText j = this.j;
                    int length;
                    if (j == null) {
                        length = 0;
                    }
                    else {
                        length = ((CharSequence)j.getText()).length();
                    }
                    this.m(length);
                }
            }
            else {
                this.l.i((TextView)this.p, 2);
                this.p = null;
            }
            this.m = m;
        }
    }
    
    public void setCounterMaxLength(int length) {
        if (this.n != length) {
            if (length > 0) {
                this.n = length;
            }
            else {
                this.n = -1;
            }
            if (this.m && this.p != null) {
                final EditText j = this.j;
                if (j == null) {
                    length = 0;
                }
                else {
                    length = ((CharSequence)j.getText()).length();
                }
                this.m(length);
            }
        }
    }
    
    public void setCounterOverflowTextAppearance(final int q) {
        if (this.q != q) {
            this.q = q;
            this.n();
        }
    }
    
    public void setCounterOverflowTextColor(final ColorStateList y) {
        if (this.y != y) {
            this.y = y;
            this.n();
        }
    }
    
    public void setCounterTextAppearance(final int r) {
        if (this.r != r) {
            this.r = r;
            this.n();
        }
    }
    
    public void setCounterTextColor(final ColorStateList x) {
        if (this.x != x) {
            this.x = x;
            this.n();
        }
    }
    
    public void setDefaultHintTextColor(final ColorStateList list) {
        this.w0 = list;
        this.x0 = list;
        if (this.j != null) {
            this.s(false, false);
        }
    }
    
    public void setEnabled(final boolean enabled) {
        j((ViewGroup)this, enabled);
        super.setEnabled(enabled);
    }
    
    public void setEndIconActivated(final boolean activated) {
        ((View)this.j0).setActivated(activated);
    }
    
    public void setEndIconCheckable(final boolean checkable) {
        this.j0.setCheckable(checkable);
    }
    
    public void setEndIconContentDescription(final int n) {
        CharSequence text;
        if (n != 0) {
            text = ((View)this).getResources().getText(n);
        }
        else {
            text = null;
        }
        this.setEndIconContentDescription(text);
    }
    
    public void setEndIconContentDescription(final CharSequence contentDescription) {
        if (this.getEndIconContentDescription() != contentDescription) {
            ((View)this.j0).setContentDescription(contentDescription);
        }
    }
    
    public void setEndIconDrawable(final int n) {
        Drawable l;
        if (n != 0) {
            l = wd.a.L(((View)this).getContext(), n);
        }
        else {
            l = null;
        }
        this.setEndIconDrawable(l);
    }
    
    public void setEndIconDrawable(final Drawable imageDrawable) {
        ((AppCompatImageButton)this.j0).setImageDrawable(imageDrawable);
    }
    
    public void setEndIconMode(final int h0) {
        final int h2 = this.h0;
        this.h0 = h0;
        final Iterator<Object> iterator = this.k0.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(this, h2);
        }
        this.setEndIconVisible(h0 != 0);
        if (this.getEndIconDelegate().b(this.K)) {
            this.getEndIconDelegate().a();
            this.c();
            return;
        }
        final StringBuilder r = a.r("The current box background mode ");
        r.append(this.K);
        r.append(" is not supported by the end icon mode ");
        r.append(h0);
        throw new IllegalStateException(r.toString());
    }
    
    public void setEndIconOnClickListener(final View$OnClickListener onClickListener) {
        final CheckableImageButton j0 = this.j0;
        final View$OnLongClickListener s0 = this.s0;
        ((View)j0).setOnClickListener(onClickListener);
        k(j0, s0);
    }
    
    public void setEndIconOnLongClickListener(final View$OnLongClickListener view$OnLongClickListener) {
        this.s0 = view$OnLongClickListener;
        final CheckableImageButton j0 = this.j0;
        ((View)j0).setOnLongClickListener(view$OnLongClickListener);
        k(j0, view$OnLongClickListener);
    }
    
    public void setEndIconTintList(final ColorStateList l0) {
        if (this.l0 != l0) {
            this.l0 = l0;
            this.m0 = true;
            this.c();
        }
    }
    
    public void setEndIconTintMode(final PorterDuff$Mode n0) {
        if (this.n0 != n0) {
            this.n0 = n0;
            this.o0 = true;
            this.c();
        }
    }
    
    public void setEndIconVisible(final boolean b) {
        if (this.g() != b) {
            final CheckableImageButton j0 = this.j0;
            int visibility;
            if (b) {
                visibility = 0;
            }
            else {
                visibility = 8;
            }
            ((View)j0).setVisibility(visibility);
            this.x();
            this.o();
        }
    }
    
    public void setError(final CharSequence charSequence) {
        if (!this.l.l) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            this.setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            final l l = this.l;
            l.c();
            l.k = charSequence;
            ((TextView)l.m).setText(charSequence);
            final int i = l.i;
            if (i != 1) {
                l.j = 1;
            }
            l.k(i, l.j, l.j((TextView)l.m, charSequence));
        }
        else {
            this.l.h();
        }
    }
    
    public void setErrorContentDescription(final CharSequence charSequence) {
        final l l = this.l;
        l.n = charSequence;
        final AppCompatTextView m = l.m;
        if (m != null) {
            ((View)m).setContentDescription(charSequence);
        }
    }
    
    public void setErrorEnabled(final boolean l) {
        final l i = this.l;
        if (i.l != l) {
            i.c();
            if (l) {
                ((View)(i.m = new AppCompatTextView(i.a))).setId(2131431724);
                ((View)i.m).setTextAlignment(5);
                final Typeface v = i.v;
                if (v != null) {
                    ((TextView)i.m).setTypeface(v);
                }
                final int o = i.o;
                i.o = o;
                final AppCompatTextView m = i.m;
                if (m != null) {
                    i.b.l((TextView)m, o);
                }
                final ColorStateList p = i.p;
                i.p = p;
                final AppCompatTextView j = i.m;
                if (j != null && p != null) {
                    ((TextView)j).setTextColor(p);
                }
                final CharSequence n = i.n;
                i.n = n;
                final AppCompatTextView k = i.m;
                if (k != null) {
                    ((View)k).setContentDescription(n);
                }
                ((View)i.m).setVisibility(4);
                final AppCompatTextView m2 = i.m;
                final WeakHashMap<View, t1> a = a4.q0.a;
                q0$g.f((View)m2, 1);
                i.a((TextView)i.m, 0);
            }
            else {
                i.h();
                i.i((TextView)i.m, 0);
                i.m = null;
                i.b.p();
                i.b.z();
            }
            i.l = l;
        }
    }
    
    public void setErrorIconDrawable(final int n) {
        Drawable l;
        if (n != 0) {
            l = wd.a.L(((View)this).getContext(), n);
        }
        else {
            l = null;
        }
        this.setErrorIconDrawable(l);
    }
    
    public void setErrorIconDrawable(final Drawable imageDrawable) {
        ((AppCompatImageButton)this.u0).setImageDrawable(imageDrawable);
        this.setErrorIconVisible(imageDrawable != null && this.l.l);
    }
    
    public void setErrorIconOnClickListener(final View$OnClickListener onClickListener) {
        final CheckableImageButton u0 = this.u0;
        final View$OnLongClickListener t0 = this.t0;
        ((View)u0).setOnClickListener(onClickListener);
        k(u0, t0);
    }
    
    public void setErrorIconOnLongClickListener(final View$OnLongClickListener view$OnLongClickListener) {
        this.t0 = view$OnLongClickListener;
        final CheckableImageButton u0 = this.u0;
        ((View)u0).setOnLongClickListener(view$OnLongClickListener);
        k(u0, view$OnLongClickListener);
    }
    
    public void setErrorIconTintList(final ColorStateList v0) {
        this.v0 = v0;
        Drawable imageDrawable;
        final Drawable drawable = imageDrawable = ((ImageView)this.u0).getDrawable();
        if (drawable != null) {
            imageDrawable = drawable.mutate();
            a$b.h(imageDrawable, v0);
        }
        if (((ImageView)this.u0).getDrawable() != imageDrawable) {
            ((AppCompatImageButton)this.u0).setImageDrawable(imageDrawable);
        }
    }
    
    public void setErrorIconTintMode(final PorterDuff$Mode porterDuff$Mode) {
        Drawable imageDrawable;
        final Drawable drawable = imageDrawable = ((ImageView)this.u0).getDrawable();
        if (drawable != null) {
            imageDrawable = drawable.mutate();
            a$b.i(imageDrawable, porterDuff$Mode);
        }
        if (((ImageView)this.u0).getDrawable() != imageDrawable) {
            ((AppCompatImageButton)this.u0).setImageDrawable(imageDrawable);
        }
    }
    
    public void setErrorTextAppearance(final int o) {
        final l l = this.l;
        l.o = o;
        final AppCompatTextView m = l.m;
        if (m != null) {
            l.b.l((TextView)m, o);
        }
    }
    
    public void setErrorTextColor(final ColorStateList list) {
        final l l = this.l;
        l.p = list;
        final AppCompatTextView m = l.m;
        if (m != null && list != null) {
            ((TextView)m).setTextColor(list);
        }
    }
    
    public void setHelperText(final CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.l.r) {
                this.setHelperTextEnabled(false);
            }
        }
        else {
            if (!this.l.r) {
                this.setHelperTextEnabled(true);
            }
            final l l = this.l;
            l.c();
            l.q = charSequence;
            ((TextView)l.s).setText(charSequence);
            final int i = l.i;
            if (i != 2) {
                l.j = 2;
            }
            l.k(i, l.j, l.j((TextView)l.s, charSequence));
        }
    }
    
    public void setHelperTextColor(final ColorStateList list) {
        final l l = this.l;
        l.u = list;
        final AppCompatTextView s = l.s;
        if (s != null && list != null) {
            ((TextView)s).setTextColor(list);
        }
    }
    
    public void setHelperTextEnabled(final boolean r) {
        final l l = this.l;
        if (l.r != r) {
            l.c();
            if (r) {
                ((View)(l.s = new AppCompatTextView(l.a))).setId(2131431725);
                ((View)l.s).setTextAlignment(5);
                final Typeface v = l.v;
                if (v != null) {
                    ((TextView)l.s).setTypeface(v);
                }
                ((View)l.s).setVisibility(4);
                final AppCompatTextView s = l.s;
                final WeakHashMap<View, t1> a = a4.q0.a;
                q0$g.f((View)s, 1);
                final int t = l.t;
                l.t = t;
                final AppCompatTextView s2 = l.s;
                if (s2 != null) {
                    ((TextView)s2).setTextAppearance(t);
                }
                final ColorStateList u = l.u;
                l.u = u;
                final AppCompatTextView s3 = l.s;
                if (s3 != null && u != null) {
                    ((TextView)s3).setTextColor(u);
                }
                l.a((TextView)l.s, 1);
            }
            else {
                l.c();
                final int i = l.i;
                if (i == 2) {
                    l.j = 0;
                }
                l.k(i, l.j, l.j((TextView)l.s, (CharSequence)null));
                l.i((TextView)l.s, 1);
                l.s = null;
                l.b.p();
                l.b.z();
            }
            l.r = r;
        }
    }
    
    public void setHelperTextTextAppearance(final int n) {
        final l l = this.l;
        l.t = n;
        final AppCompatTextView s = l.s;
        if (s != null) {
            ((TextView)s).setTextAppearance(n);
        }
    }
    
    public void setHint(final CharSequence hintInternal) {
        if (this.D) {
            this.setHintInternal(hintInternal);
            ((View)this).sendAccessibilityEvent(2048);
        }
    }
    
    public void setHintAnimationEnabled(final boolean j0) {
        this.J0 = j0;
    }
    
    public void setHintEnabled(final boolean d) {
        if (d != this.D) {
            if (!(this.D = d)) {
                this.F = false;
                if (!TextUtils.isEmpty(this.E) && TextUtils.isEmpty(((TextView)this.j).getHint())) {
                    ((TextView)this.j).setHint(this.E);
                }
                this.setHintInternal(null);
            }
            else {
                final CharSequence hint = ((TextView)this.j).getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.E)) {
                        this.setHint(hint);
                    }
                    ((TextView)this.j).setHint((CharSequence)null);
                }
                this.F = true;
            }
            if (this.j != null) {
                this.r();
            }
        }
    }
    
    public void setHintTextAppearance(final int n) {
        this.I0.k(n);
        this.x0 = this.I0.l;
        if (this.j != null) {
            this.s(false, false);
            this.r();
        }
    }
    
    public void setHintTextColor(final ColorStateList x0) {
        if (this.x0 != x0) {
            if (this.w0 == null) {
                this.I0.l(x0);
            }
            this.x0 = x0;
            if (this.j != null) {
                this.s(false, false);
            }
        }
    }
    
    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(final int n) {
        CharSequence text;
        if (n != 0) {
            text = ((View)this).getResources().getText(n);
        }
        else {
            text = null;
        }
        this.setPasswordVisibilityToggleContentDescription(text);
    }
    
    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(final CharSequence contentDescription) {
        ((View)this.j0).setContentDescription(contentDescription);
    }
    
    @Deprecated
    public void setPasswordVisibilityToggleDrawable(final int n) {
        Drawable l;
        if (n != 0) {
            l = wd.a.L(((View)this).getContext(), n);
        }
        else {
            l = null;
        }
        this.setPasswordVisibilityToggleDrawable(l);
    }
    
    @Deprecated
    public void setPasswordVisibilityToggleDrawable(final Drawable imageDrawable) {
        ((AppCompatImageButton)this.j0).setImageDrawable(imageDrawable);
    }
    
    @Deprecated
    public void setPasswordVisibilityToggleEnabled(final boolean b) {
        if (b && this.h0 != 1) {
            this.setEndIconMode(1);
        }
        else if (!b) {
            this.setEndIconMode(0);
        }
    }
    
    @Deprecated
    public void setPasswordVisibilityToggleTintList(final ColorStateList l0) {
        this.l0 = l0;
        this.m0 = true;
        this.c();
    }
    
    @Deprecated
    public void setPasswordVisibilityToggleTintMode(final PorterDuff$Mode n0) {
        this.n0 = n0;
        this.o0 = true;
        this.c();
    }
    
    public void setPlaceholderText(final CharSequence s) {
        final boolean t = this.t;
        int length = 0;
        if (t && TextUtils.isEmpty(s)) {
            this.setPlaceholderTextEnabled(false);
        }
        else {
            if (!this.t) {
                this.setPlaceholderTextEnabled(true);
            }
            this.s = s;
        }
        final EditText j = this.j;
        if (j != null) {
            length = ((CharSequence)j.getText()).length();
        }
        this.t(length);
    }
    
    public void setPlaceholderTextAppearance(final int n) {
        this.w = n;
        final AppCompatTextView u = this.u;
        if (u != null) {
            ((TextView)u).setTextAppearance(n);
        }
    }
    
    public void setPlaceholderTextColor(final ColorStateList list) {
        if (this.v != list) {
            this.v = list;
            final AppCompatTextView u = this.u;
            if (u != null && list != null) {
                ((TextView)u).setTextColor(list);
            }
        }
    }
    
    public void setPrefixText(final CharSequence text) {
        CharSequence z;
        if (TextUtils.isEmpty(text)) {
            z = null;
        }
        else {
            z = text;
        }
        this.z = z;
        ((TextView)this.A).setText(text);
        this.v();
    }
    
    public void setPrefixTextAppearance(final int textAppearance) {
        ((TextView)this.A).setTextAppearance(textAppearance);
    }
    
    public void setPrefixTextColor(final ColorStateList textColor) {
        ((TextView)this.A).setTextColor(textColor);
    }
    
    public void setStartIconCheckable(final boolean checkable) {
        this.V.setCheckable(checkable);
    }
    
    public void setStartIconContentDescription(final int n) {
        CharSequence text;
        if (n != 0) {
            text = ((View)this).getResources().getText(n);
        }
        else {
            text = null;
        }
        this.setStartIconContentDescription(text);
    }
    
    public void setStartIconContentDescription(final CharSequence contentDescription) {
        if (this.getStartIconContentDescription() != contentDescription) {
            ((View)this.V).setContentDescription(contentDescription);
        }
    }
    
    public void setStartIconDrawable(final int n) {
        Drawable l;
        if (n != 0) {
            l = wd.a.L(((View)this).getContext(), n);
        }
        else {
            l = null;
        }
        this.setStartIconDrawable(l);
    }
    
    public void setStartIconDrawable(final Drawable imageDrawable) {
        ((AppCompatImageButton)this.V).setImageDrawable(imageDrawable);
        if (imageDrawable != null) {
            this.setStartIconVisible(true);
            d(this.V, this.a0, this.W, this.c0, this.b0);
        }
        else {
            this.setStartIconVisible(false);
            this.setStartIconOnClickListener(null);
            this.setStartIconOnLongClickListener(null);
            this.setStartIconContentDescription(null);
        }
    }
    
    public void setStartIconOnClickListener(final View$OnClickListener onClickListener) {
        final CheckableImageButton v = this.V;
        final View$OnLongClickListener f0 = this.f0;
        ((View)v).setOnClickListener(onClickListener);
        k(v, f0);
    }
    
    public void setStartIconOnLongClickListener(final View$OnLongClickListener view$OnLongClickListener) {
        this.f0 = view$OnLongClickListener;
        final CheckableImageButton v = this.V;
        ((View)v).setOnLongClickListener(view$OnLongClickListener);
        k(v, view$OnLongClickListener);
    }
    
    public void setStartIconTintList(final ColorStateList w) {
        if (this.W != w) {
            this.W = w;
            this.a0 = true;
            d(this.V, true, w, this.c0, this.b0);
        }
    }
    
    public void setStartIconTintMode(final PorterDuff$Mode b0) {
        if (this.b0 != b0) {
            this.b0 = b0;
            this.c0 = true;
            d(this.V, this.a0, this.W, true, b0);
        }
    }
    
    public void setStartIconVisible(final boolean b) {
        final int visibility = ((View)this.V).getVisibility();
        int visibility2 = 0;
        if (visibility == 0 != b) {
            final CheckableImageButton v = this.V;
            if (!b) {
                visibility2 = 8;
            }
            ((View)v).setVisibility(visibility2);
            this.u();
            this.o();
        }
    }
    
    public void setSuffixText(final CharSequence text) {
        CharSequence b;
        if (TextUtils.isEmpty(text)) {
            b = null;
        }
        else {
            b = text;
        }
        this.B = b;
        ((TextView)this.C).setText(text);
        this.y();
    }
    
    public void setSuffixTextAppearance(final int textAppearance) {
        ((TextView)this.C).setTextAppearance(textAppearance);
    }
    
    public void setSuffixTextColor(final ColorStateList textColor) {
        ((TextView)this.C).setTextColor(textColor);
    }
    
    public void setTextInputAccessibilityDelegate(final TextInputLayout.TextInputLayout$e textInputLayout$e) {
        final EditText j = this.j;
        if (j != null) {
            a4.q0.l((View)j, (a4.a)textInputLayout$e);
        }
    }
    
    public void setTypeface(final Typeface typeface) {
        if (typeface != this.U) {
            this.U = typeface;
            final a i0 = this.I0;
            final qf.a w = i0.w;
            boolean b = true;
            if (w != null) {
                w.h = true;
            }
            boolean b2;
            if (i0.s != typeface) {
                i0.s = typeface;
                b2 = true;
            }
            else {
                b2 = false;
            }
            final qf.a v = i0.v;
            if (v != null) {
                v.h = true;
            }
            if (i0.t != typeface) {
                i0.t = typeface;
            }
            else {
                b = false;
            }
            if (b2 || b) {
                i0.j();
            }
            final l l = this.l;
            if (typeface != l.v) {
                l.v = typeface;
                final AppCompatTextView m = l.m;
                if (m != null) {
                    ((TextView)m).setTypeface(typeface);
                }
                final AppCompatTextView s = l.s;
                if (s != null) {
                    ((TextView)s).setTypeface(typeface);
                }
            }
            final AppCompatTextView p = this.p;
            if (p != null) {
                ((TextView)p).setTypeface(typeface);
            }
        }
    }
    
    public final void t(final int n) {
        if (n == 0 && !this.H0) {
            final AppCompatTextView u = this.u;
            if (u != null && this.t) {
                ((TextView)u).setText(this.s);
                ((View)this.u).setVisibility(0);
                ((View)this.u).bringToFront();
            }
        }
        else {
            final AppCompatTextView u2 = this.u;
            if (u2 != null && this.t) {
                ((TextView)u2).setText((CharSequence)null);
                ((View)this.u).setVisibility(4);
            }
        }
    }
    
    public final void u() {
        if (this.j == null) {
            return;
        }
        int f;
        if (((View)this.V).getVisibility() == 0) {
            f = 0;
        }
        else {
            final EditText j = this.j;
            final WeakHashMap<View, t1> a = a4.q0.a;
            f = q0$e.f((View)j);
        }
        final AppCompatTextView a2 = this.A;
        final int compoundPaddingTop = ((TextView)this.j).getCompoundPaddingTop();
        final int compoundPaddingBottom = ((TextView)this.j).getCompoundPaddingBottom();
        final WeakHashMap<View, t1> a3 = a4.q0.a;
        q0$e.k((View)a2, f, compoundPaddingTop, 0, compoundPaddingBottom);
    }
    
    public final void v() {
        final AppCompatTextView a = this.A;
        int visibility;
        if (this.z != null && !this.H0) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)a).setVisibility(visibility);
        this.o();
    }
    
    public final void w(final boolean b, final boolean b2) {
        final int defaultColor = this.B0.getDefaultColor();
        final int colorForState = this.B0.getColorForState(new int[] { 16843623, 16842910 }, defaultColor);
        final int colorForState2 = this.B0.getColorForState(new int[] { 16843518, 16842910 }, defaultColor);
        if (b) {
            this.P = colorForState2;
        }
        else if (b2) {
            this.P = colorForState;
        }
        else {
            this.P = defaultColor;
        }
    }
    
    public final void x() {
        if (this.j == null) {
            return;
        }
        int e;
        if (!this.g() && ((View)this.u0).getVisibility() != 0) {
            final EditText j = this.j;
            final WeakHashMap<View, t1> a = a4.q0.a;
            e = q0$e.e((View)j);
        }
        else {
            e = 0;
        }
        final AppCompatTextView c = this.C;
        final int paddingTop = ((View)this.j).getPaddingTop();
        final int paddingBottom = ((View)this.j).getPaddingBottom();
        final WeakHashMap<View, t1> a2 = a4.q0.a;
        q0$e.k((View)c, 0, paddingTop, e, paddingBottom);
    }
    
    public final void y() {
        final int visibility = ((View)this.C).getVisibility();
        final CharSequence b = this.B;
        int visibility2 = 0;
        final boolean b2 = b != null && !this.H0;
        final AppCompatTextView c = this.C;
        if (!b2) {
            visibility2 = 8;
        }
        ((View)c).setVisibility(visibility2);
        if (visibility != ((View)this.C).getVisibility()) {
            this.getEndIconDelegate().c(b2);
        }
        this.o();
    }
    
    public final void z() {
        if (this.G != null) {
            if (this.K != 0) {
                final boolean focused = ((View)this).isFocused();
                final boolean b = false;
                boolean b2 = false;
                Label_0054: {
                    if (!focused) {
                        final EditText j = this.j;
                        if (j == null || !((View)j).hasFocus()) {
                            b2 = false;
                            break Label_0054;
                        }
                    }
                    b2 = true;
                }
                boolean b3 = false;
                Label_0089: {
                    if (!((View)this).isHovered()) {
                        final EditText i = this.j;
                        if (i == null || !((View)i).isHovered()) {
                            b3 = false;
                            break Label_0089;
                        }
                    }
                    b3 = true;
                }
                Label_0231: {
                    if (!((View)this).isEnabled()) {
                        this.P = this.G0;
                    }
                    else if (this.l.e()) {
                        if (this.B0 != null) {
                            this.w(b2, b3);
                        }
                        else {
                            this.P = this.l.g();
                        }
                    }
                    else {
                        if (this.o) {
                            final AppCompatTextView p = this.p;
                            if (p != null) {
                                if (this.B0 != null) {
                                    this.w(b2, b3);
                                    break Label_0231;
                                }
                                this.P = ((TextView)p).getCurrentTextColor();
                                break Label_0231;
                            }
                        }
                        if (b2) {
                            this.P = this.A0;
                        }
                        else if (b3) {
                            this.P = this.z0;
                        }
                        else {
                            this.P = this.y0;
                        }
                    }
                }
                boolean errorIconVisible = b;
                if (this.getErrorIconDrawable() != null) {
                    final l l = this.l;
                    errorIconVisible = b;
                    if (l.l) {
                        errorIconVisible = b;
                        if (l.e()) {
                            errorIconVisible = true;
                        }
                    }
                }
                this.setErrorIconVisible(errorIconVisible);
                this.q(this.u0, this.v0);
                this.q(this.V, this.W);
                this.q(this.j0, this.l0);
                final k endIconDelegate = this.getEndIconDelegate();
                endIconDelegate.getClass();
                if (endIconDelegate instanceof b) {
                    if (this.l.e() && this.getEndIconDrawable() != null) {
                        final Drawable mutate = this.getEndIconDrawable().mutate();
                        a$b.g(mutate, this.l.g());
                        ((AppCompatImageButton)this.j0).setImageDrawable(mutate);
                    }
                    else {
                        this.c();
                    }
                }
                if (b2 && ((View)this).isEnabled()) {
                    this.M = this.O;
                }
                else {
                    this.M = this.N;
                }
                if (this.K == 1) {
                    if (!((View)this).isEnabled()) {
                        this.Q = this.D0;
                    }
                    else if (b3 && !b2) {
                        this.Q = this.F0;
                    }
                    else if (b2) {
                        this.Q = this.E0;
                    }
                    else {
                        this.Q = this.C0;
                    }
                }
                this.b();
            }
        }
    }
    
    public interface f
    {
        void a(final TextInputLayout p0);
    }
    
    public interface g
    {
        void a(final TextInputLayout p0, final int p1);
    }
}
