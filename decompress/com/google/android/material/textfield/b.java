// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.textfield;

import uf.c;
import android.animation.Animator;
import android.widget.TextView;
import uf.f$b;
import android.content.Context;
import android.graphics.Rect;
import uf.j$a;
import com.google.android.material.internal.CheckableImageButton;
import android.view.animation.LinearInterpolator;
import android.animation.Animator$AnimatorListener;
import yf.j;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import yf.g;
import android.animation.TimeInterpolator;
import android.view.View$OnClickListener;
import vl.a;
import android.widget.EditText;
import java.util.WeakHashMap;
import android.widget.AutoCompleteTextView;
import android.text.TextWatcher;
import android.widget.AutoCompleteTextView$OnDismissListener;
import yf.i;
import android.view.View$OnFocusChangeListener;
import android.view.View$OnTouchListener;
import yf.h;
import a4.l0$d;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.content.res.ColorStateList;
import android.view.View;
import dg.l0;
import android.graphics.drawable.Drawable;
import android.animation.ValueAnimator;
import android.view.accessibility.AccessibilityManager;
import uf.f;
import android.graphics.drawable.StateListDrawable;
import yf.k;

public final class b extends k
{
    public final b$a d;
    public final b$b e;
    public final b$c f;
    public final b$d g;
    public final b$e h;
    public boolean i;
    public boolean j;
    public long k;
    public StateListDrawable l;
    public f m;
    public AccessibilityManager n;
    public ValueAnimator o;
    public ValueAnimator p;
    
    public b(final TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new b$a(this);
        this.e = new b$b(this);
        this.f = new b$c(this, super.a);
        this.g = new TextInputLayout$f(this) {
            public final b a;
            
            public final void a(final TextInputLayout textInputLayout) {
                final AutoCompleteTextView d = b.d(this.a, textInputLayout.getEditText());
                final b a = this.a;
                final int boxBackgroundMode = a.a.getBoxBackgroundMode();
                if (boxBackgroundMode == 2) {
                    d.setDropDownBackgroundDrawable((Drawable)a.m);
                }
                else if (boxBackgroundMode == 1) {
                    d.setDropDownBackgroundDrawable((Drawable)a.l);
                }
                final b a2 = this.a;
                a2.getClass();
                if (((TextView)d).getKeyListener() == null) {
                    final int boxBackgroundMode2 = a2.a.getBoxBackgroundMode();
                    final f boxBackground = a2.a.getBoxBackground();
                    final int k0 = l0.k0(2130968820, (View)d);
                    final int[][] array = { { 16842919 }, new int[0] };
                    if (boxBackgroundMode2 == 2) {
                        final int k2 = l0.k0(2130968836, (View)d);
                        final f f = new f(boxBackground.f.a);
                        final int i0 = l0.I0(0.1f, k0, k2);
                        f.l(new ColorStateList(array, new int[] { i0, 0 }));
                        f.setTint(k2);
                        final ColorStateList list = new ColorStateList(array, new int[] { i0, k2 });
                        final f f2 = new f(boxBackground.f.a);
                        f2.setTint(-1);
                        final LayerDrawable layerDrawable = new LayerDrawable(new Drawable[] { (Drawable)new RippleDrawable(list, (Drawable)f, (Drawable)f2), (Drawable)boxBackground });
                        final WeakHashMap a3 = a4.l0.a;
                        l0$d.q((View)d, (Drawable)layerDrawable);
                    }
                    else if (boxBackgroundMode2 == 1) {
                        final int boxBackgroundColor = a2.a.getBoxBackgroundColor();
                        final RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(array, new int[] { l0.I0(0.1f, k0, boxBackgroundColor), boxBackgroundColor }), (Drawable)boxBackground, (Drawable)boxBackground);
                        final WeakHashMap a4 = a4.l0.a;
                        l0$d.q((View)d, (Drawable)rippleDrawable);
                    }
                }
                final b a5 = this.a;
                a5.getClass();
                ((View)d).setOnTouchListener((View$OnTouchListener)new h(a5, d));
                ((View)d).setOnFocusChangeListener((View$OnFocusChangeListener)a5.e);
                d.setOnDismissListener((AutoCompleteTextView$OnDismissListener)new i(a5));
                d.setThreshold(0);
                ((TextView)d).removeTextChangedListener((TextWatcher)this.a.d);
                ((TextView)d).addTextChangedListener((TextWatcher)this.a.d);
                textInputLayout.setEndIconCheckable(true);
                textInputLayout.setErrorIconDrawable((Drawable)null);
                textInputLayout.setTextInputAccessibilityDelegate((TextInputLayout.e)this.a.f);
                textInputLayout.setEndIconVisible(true);
            }
        };
        this.h = new TextInputLayout$g(this) {
            public final b a;
            
            public final void a(final TextInputLayout textInputLayout, final int n) {
                final AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView)textInputLayout.getEditText();
                if (autoCompleteTextView != null && n == 3) {
                    ((TextView)autoCompleteTextView).removeTextChangedListener((TextWatcher)this.a.d);
                    if (((View)autoCompleteTextView).getOnFocusChangeListener() == this.a.e) {
                        ((View)autoCompleteTextView).setOnFocusChangeListener((View$OnFocusChangeListener)null);
                    }
                    ((View)autoCompleteTextView).setOnTouchListener((View$OnTouchListener)null);
                    autoCompleteTextView.setOnDismissListener((AutoCompleteTextView$OnDismissListener)null);
                }
            }
        };
        this.i = false;
        this.j = false;
        this.k = Long.MAX_VALUE;
    }
    
    public static AutoCompleteTextView d(final b b, final EditText editText) {
        b.getClass();
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView)editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }
    
    public static void e(final b b, final AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            b.getClass();
        }
        else {
            b.getClass();
            final long n = System.currentTimeMillis() - b.k;
            if (n < 0L || n > 300L) {
                b.i = false;
            }
            if (!b.i) {
                b.g(b.j ^ true);
                if (b.j) {
                    ((View)autoCompleteTextView).requestFocus();
                    autoCompleteTextView.showDropDown();
                }
                else {
                    autoCompleteTextView.dismissDropDown();
                }
            }
            else {
                b.i = false;
            }
        }
    }
    
    public final void a() {
        final float n = (float)super.b.getResources().getDimensionPixelOffset(2131166280);
        final float n2 = (float)super.b.getResources().getDimensionPixelOffset(2131166238);
        final int dimensionPixelOffset = super.b.getResources().getDimensionPixelOffset(2131166240);
        final f f = this.f(dimensionPixelOffset, n, n, n2);
        final f f2 = this.f(dimensionPixelOffset, 0.0f, n, n2);
        this.m = f;
        (this.l = new StateListDrawable()).addState(new int[] { 16842922 }, (Drawable)f);
        this.l.addState(new int[0], (Drawable)f2);
        super.a.setEndIconDrawable(a.U1(super.b, 2131232691));
        final TextInputLayout a = super.a;
        a.setEndIconContentDescription(((View)a).getResources().getText(2131953492));
        super.a.setEndIconOnClickListener((View$OnClickListener)new b$f(this));
        final TextInputLayout a2 = super.a;
        final TextInputLayout$f g = (TextInputLayout$f)this.g;
        a2.g0.add(g);
        if (a2.j != null) {
            g.a(a2);
        }
        super.a.k0.add(this.h);
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
        final LinearInterpolator a3 = ye.a.a;
        ofFloat.setInterpolator((TimeInterpolator)a3);
        ofFloat.setDuration((long)67);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new g(this));
        this.p = ofFloat;
        final ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[] { 1.0f, 0.0f });
        ofFloat2.setInterpolator((TimeInterpolator)a3);
        ofFloat2.setDuration((long)50);
        ofFloat2.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new g(this));
        ((Animator)(this.o = ofFloat2)).addListener((Animator$AnimatorListener)new j(this));
        final CheckableImageButton c = super.c;
        final WeakHashMap a4 = a4.l0.a;
        l0$d.s((View)c, 2);
        this.n = (AccessibilityManager)super.b.getSystemService("accessibility");
    }
    
    public final boolean b(final int n) {
        return n != 0;
    }
    
    public final f f(final int n, final float n2, final float n3, final float n4) {
        final j$a j$a = new j$a();
        j$a.e = (c)new uf.a(n2);
        j$a.f = (c)new uf.a(n2);
        j$a.h = (c)new uf.a(n3);
        j$a.g = (c)new uf.a(n3);
        final uf.j shapeAppearanceModel = new uf.j(j$a);
        final Context b = super.b;
        final String b2 = uf.f.B;
        final int b3 = rf.b.b(b, 2130968836, f.class.getSimpleName());
        final f f = new f();
        f.i(b);
        f.l(ColorStateList.valueOf(b3));
        f.k(n4);
        f.setShapeAppearanceModel(shapeAppearanceModel);
        final f$b f2 = f.f;
        if (f2.h == null) {
            f2.h = new Rect();
        }
        f.f.h.set(0, n, 0, n);
        f.invalidateSelf();
        return f;
    }
    
    public final void g(final boolean j) {
        if (this.j != j) {
            this.j = j;
            this.p.cancel();
            this.o.start();
        }
    }
}
