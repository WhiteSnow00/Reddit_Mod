// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.textfield;

import android.widget.TextView;
import android.view.View;
import android.view.View$OnClickListener;
import eg.n0;
import android.text.method.TransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import android.text.Editable;
import android.text.TextWatcher;
import zf.k;

public final class c extends k
{
    public final c$a d;
    public final c$b e;
    public final c$c f;
    
    public c(final TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new TextWatcher() {
            public final void afterTextChanged(final Editable editable) {
            }
            
            public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
                final c f = c.this;
                f.c.setChecked(c.d(f) ^ true);
            }
            
            public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            }
        };
        this.e = new TextInputLayout.f() {
            @Override
            public final void a(final TextInputLayout textInputLayout) {
                final EditText editText = textInputLayout.getEditText();
                textInputLayout.setEndIconVisible(true);
                textInputLayout.setEndIconCheckable(true);
                final c a = c.this;
                a.c.setChecked(c.d(a) ^ true);
                ((TextView)editText).removeTextChangedListener((TextWatcher)c.this.d);
                ((TextView)editText).addTextChangedListener((TextWatcher)c.this.d);
            }
        };
        this.f = new TextInputLayout.g() {
            @Override
            public final void a(final TextInputLayout textInputLayout, final int n) {
                final EditText editText = textInputLayout.getEditText();
                if (editText != null && n == 1) {
                    ((TextView)editText).setTransformationMethod((TransformationMethod)PasswordTransformationMethod.getInstance());
                    ((TextView)editText).removeTextChangedListener((TextWatcher)c.this.d);
                }
            }
        };
    }
    
    public static boolean d(final c c) {
        final EditText editText = c.a.getEditText();
        return editText != null && ((TextView)editText).getTransformationMethod() instanceof PasswordTransformationMethod;
    }
    
    public final void a() {
        super.a.setEndIconDrawable(n0.L(super.b, 2131231191));
        final TextInputLayout a = super.a;
        a.setEndIconContentDescription(((View)a).getResources().getText(2131956418));
        super.a.setEndIconOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public final void onClick(final View view) {
                final EditText editText = c.this.a.getEditText();
                if (editText == null) {
                    return;
                }
                final int selectionEnd = ((TextView)editText).getSelectionEnd();
                if (c.d(c.this)) {
                    ((TextView)editText).setTransformationMethod((TransformationMethod)null);
                }
                else {
                    ((TextView)editText).setTransformationMethod((TransformationMethod)PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
            }
        });
        final TextInputLayout a2 = super.a;
        final TextInputLayout.f e = this.e;
        a2.g0.add((TextInputLayout.f)e);
        if (a2.j != null) {
            e.a(a2);
        }
        super.a.k0.add((TextInputLayout.g)this.f);
        final EditText editText = super.a.getEditText();
        if (editText != null && (((TextView)editText).getInputType() == 16 || ((TextView)editText).getInputType() == 128 || ((TextView)editText).getInputType() == 144 || ((TextView)editText).getInputType() == 224)) {
            ((TextView)editText).setTransformationMethod((TransformationMethod)PasswordTransformationMethod.getInstance());
        }
    }
}
