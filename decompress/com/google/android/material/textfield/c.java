// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.textfield;

import android.view.View;
import android.widget.TextView;
import android.view.View$OnClickListener;
import vl.a;
import android.text.method.TransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import android.text.TextWatcher;
import yf.k;

public final class c extends k
{
    public final c$a d;
    public final c$b e;
    public final c$c f;
    
    public c(final TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new c$a(this);
        this.e = new TextInputLayout$f(this) {
            public final c a;
            
            public final void a(final TextInputLayout textInputLayout) {
                final EditText editText = textInputLayout.getEditText();
                textInputLayout.setEndIconVisible(true);
                textInputLayout.setEndIconCheckable(true);
                final c a = this.a;
                a.c.setChecked(c.d(a) ^ true);
                ((TextView)editText).removeTextChangedListener((TextWatcher)this.a.d);
                ((TextView)editText).addTextChangedListener((TextWatcher)this.a.d);
            }
        };
        this.f = new TextInputLayout$g(this) {
            public final c a;
            
            public final void a(final TextInputLayout textInputLayout, final int n) {
                final EditText editText = textInputLayout.getEditText();
                if (editText != null && n == 1) {
                    ((TextView)editText).setTransformationMethod((TransformationMethod)PasswordTransformationMethod.getInstance());
                    ((TextView)editText).removeTextChangedListener((TextWatcher)this.a.d);
                }
            }
        };
    }
    
    public static boolean d(final c c) {
        final EditText editText = c.a.getEditText();
        return editText != null && ((TextView)editText).getTransformationMethod() instanceof PasswordTransformationMethod;
    }
    
    public final void a() {
        super.a.setEndIconDrawable(a.U1(super.b, 2131231197));
        final TextInputLayout a = super.a;
        a.setEndIconContentDescription(((View)a).getResources().getText(2131956448));
        super.a.setEndIconOnClickListener((View$OnClickListener)new c$d(this));
        final TextInputLayout a2 = super.a;
        final TextInputLayout$f e = (TextInputLayout$f)this.e;
        a2.g0.add(e);
        if (a2.j != null) {
            e.a(a2);
        }
        super.a.k0.add(this.f);
        final EditText editText = super.a.getEditText();
        if (editText != null && (((TextView)editText).getInputType() == 16 || ((TextView)editText).getInputType() == 128 || ((TextView)editText).getInputType() == 144 || ((TextView)editText).getInputType() == 224)) {
            ((TextView)editText).setTransformationMethod((TransformationMethod)PasswordTransformationMethod.getInstance());
        }
    }
}
