// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.textfield;

import android.widget.TextView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import yf.b;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import yf.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import yf.d;
import android.animation.TimeInterpolator;
import android.view.View$OnClickListener;
import android.widget.EditText;
import android.text.TextWatcher;
import android.view.View$OnFocusChangeListener;
import android.animation.ValueAnimator;
import android.animation.AnimatorSet;
import yf.k;

public final class a extends k
{
    public final a$a d;
    public final a$b e;
    public final a$c f;
    public final a$d g;
    public AnimatorSet h;
    public ValueAnimator i;
    
    public a(final TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new a$a(this);
        this.e = new a$b(this);
        this.f = new TextInputLayout$f(this) {
            public final a a;
            
            public final void a(final TextInputLayout textInputLayout) {
                final EditText editText = textInputLayout.getEditText();
                final boolean hasFocus = ((View)editText).hasFocus();
                boolean endIconVisible = true;
                if (!hasFocus || ((CharSequence)editText.getText()).length() <= 0) {
                    endIconVisible = false;
                }
                textInputLayout.setEndIconVisible(endIconVisible);
                textInputLayout.setEndIconCheckable(false);
                ((View)editText).setOnFocusChangeListener((View$OnFocusChangeListener)this.a.e);
                ((TextView)editText).removeTextChangedListener((TextWatcher)this.a.d);
                ((TextView)editText).addTextChangedListener((TextWatcher)this.a.d);
            }
        };
        this.g = new TextInputLayout$g(this) {
            public final a a;
            
            public final void a(final TextInputLayout textInputLayout, final int n) {
                final EditText editText = textInputLayout.getEditText();
                if (editText != null && n == 2) {
                    ((TextView)editText).removeTextChangedListener((TextWatcher)this.a.d);
                    if (((View)editText).getOnFocusChangeListener() == this.a.e) {
                        ((View)editText).setOnFocusChangeListener((View$OnFocusChangeListener)null);
                    }
                }
            }
        };
    }
    
    public final void a() {
        super.a.setEndIconDrawable(vl.a.U1(super.b, 2131232694));
        final TextInputLayout a = super.a;
        a.setEndIconContentDescription(((View)a).getResources().getText(2131952516));
        super.a.setEndIconOnClickListener((View$OnClickListener)new a$e(this));
        final TextInputLayout a2 = super.a;
        final TextInputLayout$f f = (TextInputLayout$f)this.f;
        a2.g0.add(f);
        if (a2.j != null) {
            f.a(a2);
        }
        super.a.k0.add(this.g);
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.8f, 1.0f });
        ofFloat.setInterpolator((TimeInterpolator)ye.a.d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new d(this));
        final ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
        final LinearInterpolator a3 = ye.a.a;
        ofFloat2.setInterpolator((TimeInterpolator)a3);
        ofFloat2.setDuration(100L);
        ofFloat2.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new c(this));
        (this.h = new AnimatorSet()).playTogether(new Animator[] { (Animator)ofFloat, (Animator)ofFloat2 });
        ((Animator)this.h).addListener((Animator$AnimatorListener)new yf.a(this));
        final ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[] { 1.0f, 0.0f });
        ofFloat3.setInterpolator((TimeInterpolator)a3);
        ofFloat3.setDuration(100L);
        ofFloat3.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new c(this));
        ((Animator)(this.i = ofFloat3)).addListener((Animator$AnimatorListener)new b(this));
    }
    
    public final void c(final boolean b) {
        if (super.a.getSuffixText() == null) {
            return;
        }
        this.d(b);
    }
    
    public final void d(final boolean b) {
        final boolean b2 = super.a.g() == b;
        if (b) {
            this.i.cancel();
            this.h.start();
            if (b2) {
                this.h.end();
            }
        }
        else {
            this.h.cancel();
            this.i.start();
            if (b2) {
                this.i.end();
            }
        }
    }
}
