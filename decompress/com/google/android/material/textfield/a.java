// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.textfield;

import android.widget.TextView;
import android.view.animation.LinearInterpolator;
import zf.b;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import zf.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import zf.d;
import android.animation.TimeInterpolator;
import android.view.View$OnClickListener;
import eg.n0;
import android.text.TextUtils;
import android.widget.EditText;
import android.view.View;
import android.view.View$OnFocusChangeListener;
import android.text.Editable;
import android.text.TextWatcher;
import android.animation.ValueAnimator;
import android.animation.AnimatorSet;
import zf.k;

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
        this.d = new TextWatcher() {
            public final void afterTextChanged(final Editable editable) {
                if (a.this.a.getSuffixText() != null) {
                    return;
                }
                a.this.d(((CharSequence)editable).length() > 0);
            }
            
            public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            }
            
            public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            }
        };
        this.e = new View$OnFocusChangeListener() {
            public final void onFocusChange(final View view, final boolean b) {
                final boolean empty = TextUtils.isEmpty((CharSequence)((EditText)view).getText());
                final boolean b2 = true;
                a.this.d((empty ^ true) && b && b2);
            }
        };
        this.f = new TextInputLayout.f() {
            @Override
            public final void a(final TextInputLayout textInputLayout) {
                final EditText editText = textInputLayout.getEditText();
                final boolean hasFocus = ((View)editText).hasFocus();
                boolean endIconVisible = true;
                if (!hasFocus || ((CharSequence)editText.getText()).length() <= 0) {
                    endIconVisible = false;
                }
                textInputLayout.setEndIconVisible(endIconVisible);
                textInputLayout.setEndIconCheckable(false);
                ((View)editText).setOnFocusChangeListener((View$OnFocusChangeListener)com.google.android.material.textfield.a.this.e);
                ((TextView)editText).removeTextChangedListener((TextWatcher)com.google.android.material.textfield.a.this.d);
                ((TextView)editText).addTextChangedListener((TextWatcher)com.google.android.material.textfield.a.this.d);
            }
        };
        this.g = new TextInputLayout.g() {
            @Override
            public final void a(final TextInputLayout textInputLayout, final int n) {
                final EditText editText = textInputLayout.getEditText();
                if (editText != null && n == 2) {
                    ((TextView)editText).removeTextChangedListener((TextWatcher)com.google.android.material.textfield.a.this.d);
                    if (((View)editText).getOnFocusChangeListener() == com.google.android.material.textfield.a.this.e) {
                        ((View)editText).setOnFocusChangeListener((View$OnFocusChangeListener)null);
                    }
                }
            }
        };
    }
    
    public final void a() {
        super.a.setEndIconDrawable(n0.L(super.b, 2131232686));
        final TextInputLayout a = super.a;
        a.setEndIconContentDescription(((View)a).getResources().getText(2131952497));
        super.a.setEndIconOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public final void onClick(final View view) {
                final Editable text = a.this.a.getEditText().getText();
                if (text != null) {
                    text.clear();
                }
            }
        });
        final TextInputLayout a2 = super.a;
        final TextInputLayout.f f = this.f;
        a2.g0.add((TextInputLayout.f)f);
        if (a2.j != null) {
            f.a(a2);
        }
        super.a.k0.add((TextInputLayout.g)this.g);
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.8f, 1.0f });
        ofFloat.setInterpolator((TimeInterpolator)ze.a.d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new d(this));
        final ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
        final LinearInterpolator a3 = ze.a.a;
        ofFloat2.setInterpolator((TimeInterpolator)a3);
        ofFloat2.setDuration(100L);
        ofFloat2.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new c(this));
        (this.h = new AnimatorSet()).playTogether(new Animator[] { (Animator)ofFloat, (Animator)ofFloat2 });
        ((Animator)this.h).addListener((Animator$AnimatorListener)new zf.a(this));
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
