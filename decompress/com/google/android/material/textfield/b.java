// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.textfield;

import android.animation.Animator;
import android.os.BaseBundle;
import android.widget.TextView;
import vf.f$b;
import android.content.Context;
import android.graphics.Rect;
import vf.j$a;
import com.google.android.material.internal.CheckableImageButton;
import android.view.animation.LinearInterpolator;
import android.animation.Animator$AnimatorListener;
import zf.j;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import zf.g;
import android.animation.TimeInterpolator;
import android.view.View$OnClickListener;
import eg.n0;
import android.widget.EditText;
import java.util.WeakHashMap;
import android.widget.AutoCompleteTextView$OnDismissListener;
import zf.i;
import android.view.View$OnTouchListener;
import zf.h;
import a4.p0;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.content.res.ColorStateList;
import yd.a;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityEvent;
import android.os.Bundle;
import a4.u;
import android.os.Build$VERSION;
import android.widget.Spinner;
import b4.c;
import android.view.View;
import android.view.View$OnFocusChangeListener;
import android.widget.AutoCompleteTextView;
import android.text.Editable;
import android.text.TextWatcher;
import android.animation.ValueAnimator;
import android.view.accessibility.AccessibilityManager;
import vf.f;
import android.graphics.drawable.StateListDrawable;
import zf.k;

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
        this.d = new TextWatcher() {
            public final void afterTextChanged(final Editable editable) {
                final b f = b.this;
                final AutoCompleteTextView d = b.d(f, f.a.getEditText());
                ((View)d).post((Runnable)new Runnable() {
                    @Override
                    public final void run() {
                        final boolean popupShowing = d.isPopupShowing();
                        b.this.g(popupShowing);
                        b.this.i = popupShowing;
                    }
                });
            }
            
            public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            }
            
            public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            }
        };
        this.e = new View$OnFocusChangeListener() {
            public final void onFocusChange(final View view, final boolean endIconActivated) {
                b.this.a.setEndIconActivated(endIconActivated);
                if (!endIconActivated) {
                    b.this.g(false);
                    b.this.i = false;
                }
            }
        };
        this.f = new TextInputLayout.e(super.a) {
            @Override
            public final void onInitializeAccessibilityNodeInfo(final View view, final c c) {
                super.onInitializeAccessibilityNodeInfo(view, c);
                if (((TextView)b.this.a.getEditText()).getKeyListener() == null) {
                    c.n((CharSequence)Spinner.class.getName());
                }
                boolean m = false;
                Label_0085: {
                    if (Build$VERSION.SDK_INT >= 26) {
                        m = a4.u.m(c.a);
                    }
                    else {
                        final Bundle extras = c.a.getExtras();
                        if (extras != null) {
                            if ((((BaseBundle)extras).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 0x4) == 0x4) {
                                m = true;
                                break Label_0085;
                            }
                        }
                        m = false;
                    }
                }
                if (m) {
                    c.r((String)null);
                }
            }
            
            @Override
            public final void onPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                final b c = b.this;
                final AutoCompleteTextView d = b.d(c, c.a.getEditText());
                if (accessibilityEvent.getEventType() == 1 && b.this.n.isTouchExplorationEnabled()) {
                    b.e(b.this, d);
                }
            }
        };
        this.g = new TextInputLayout.f() {
            @Override
            public final void a(final TextInputLayout textInputLayout) {
                final AutoCompleteTextView d = b.d(b.this, textInputLayout.getEditText());
                final b a = b.this;
                final int boxBackgroundMode = a.a.getBoxBackgroundMode();
                if (boxBackgroundMode == 2) {
                    d.setDropDownBackgroundDrawable((Drawable)a.m);
                }
                else if (boxBackgroundMode == 1) {
                    d.setDropDownBackgroundDrawable((Drawable)a.l);
                }
                final b a2 = b.this;
                a2.getClass();
                if (((TextView)d).getKeyListener() == null) {
                    final int boxBackgroundMode2 = a2.a.getBoxBackgroundMode();
                    final vf.f boxBackground = a2.a.getBoxBackground();
                    final int m1 = yd.a.m1(2130968820, (View)d);
                    final int[][] array = { { 16842919 }, new int[0] };
                    if (boxBackgroundMode2 == 2) {
                        final int m2 = yd.a.m1(2130968836, (View)d);
                        final vf.f f = new vf.f(boxBackground.f.a);
                        final int t1 = yd.a.T1(0.1f, m1, m2);
                        f.l(new ColorStateList(array, new int[] { t1, 0 }));
                        f.setTint(m2);
                        final ColorStateList list = new ColorStateList(array, new int[] { t1, m2 });
                        final vf.f f2 = new vf.f(boxBackground.f.a);
                        f2.setTint(-1);
                        final LayerDrawable layerDrawable = new LayerDrawable(new Drawable[] { (Drawable)new RippleDrawable(list, (Drawable)f, (Drawable)f2), (Drawable)boxBackground });
                        final WeakHashMap a3 = a4.p0.a;
                        a4.p0.d.q((View)d, (Drawable)layerDrawable);
                    }
                    else if (boxBackgroundMode2 == 1) {
                        final int boxBackgroundColor = a2.a.getBoxBackgroundColor();
                        final RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(array, new int[] { yd.a.T1(0.1f, m1, boxBackgroundColor), boxBackgroundColor }), (Drawable)boxBackground, (Drawable)boxBackground);
                        final WeakHashMap a4 = a4.p0.a;
                        a4.p0.d.q((View)d, (Drawable)rippleDrawable);
                    }
                }
                final b a5 = b.this;
                a5.getClass();
                ((View)d).setOnTouchListener((View$OnTouchListener)new zf.h(a5, d));
                ((View)d).setOnFocusChangeListener((View$OnFocusChangeListener)a5.e);
                d.setOnDismissListener((AutoCompleteTextView$OnDismissListener)new i(a5));
                d.setThreshold(0);
                ((TextView)d).removeTextChangedListener((TextWatcher)b.this.d);
                ((TextView)d).addTextChangedListener((TextWatcher)b.this.d);
                textInputLayout.setEndIconCheckable(true);
                textInputLayout.setErrorIconDrawable(null);
                textInputLayout.setTextInputAccessibilityDelegate((TextInputLayout.e)b.this.f);
                textInputLayout.setEndIconVisible(true);
            }
        };
        this.h = new TextInputLayout.g() {
            @Override
            public final void a(final TextInputLayout textInputLayout, final int n) {
                final AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView)textInputLayout.getEditText();
                if (autoCompleteTextView != null && n == 3) {
                    ((TextView)autoCompleteTextView).removeTextChangedListener((TextWatcher)b.this.d);
                    if (((View)autoCompleteTextView).getOnFocusChangeListener() == b.this.e) {
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
        final float n = (float)super.b.getResources().getDimensionPixelOffset(2131166283);
        final float n2 = (float)super.b.getResources().getDimensionPixelOffset(2131166241);
        final int dimensionPixelOffset = super.b.getResources().getDimensionPixelOffset(2131166243);
        final f f = this.f(dimensionPixelOffset, n, n, n2);
        final f f2 = this.f(dimensionPixelOffset, 0.0f, n, n2);
        this.m = f;
        (this.l = new StateListDrawable()).addState(new int[] { 16842922 }, (Drawable)f);
        this.l.addState(new int[0], (Drawable)f2);
        super.a.setEndIconDrawable(n0.L(super.b, 2131232683));
        final TextInputLayout a = super.a;
        a.setEndIconContentDescription(((View)a).getResources().getText(2131953477));
        super.a.setEndIconOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public final void onClick(final View view) {
                b.e(b.this, (AutoCompleteTextView)b.this.a.getEditText());
            }
        });
        final TextInputLayout a2 = super.a;
        final TextInputLayout.f g = this.g;
        a2.g0.add((TextInputLayout.f)g);
        if (a2.j != null) {
            g.a(a2);
        }
        super.a.k0.add((TextInputLayout.g)this.h);
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
        final LinearInterpolator a3 = ze.a.a;
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
        final WeakHashMap a4 = p0.a;
        p0.d.s((View)c, 2);
        this.n = (AccessibilityManager)super.b.getSystemService("accessibility");
    }
    
    public final boolean b(final int n) {
        return n != 0;
    }
    
    public final f f(final int n, final float n2, final float n3, final float n4) {
        final j$a j$a = new j$a();
        j$a.e = (vf.c)new vf.a(n2);
        j$a.f = (vf.c)new vf.a(n2);
        j$a.h = (vf.c)new vf.a(n3);
        j$a.g = (vf.c)new vf.a(n3);
        final vf.j shapeAppearanceModel = new vf.j(j$a);
        final Context b = super.b;
        final String b2 = vf.f.B;
        final int b3 = sf.b.b(b, 2130968836, f.class.getSimpleName());
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
