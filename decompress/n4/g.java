// 
// Decompiled by Procyon v0.6.0
// 

package n4;

import android.widget.TextView;
import android.view.View;
import android.text.Selection;
import java.lang.ref.WeakReference;
import m4.a$d;
import m4.a;
import android.text.Spannable;
import android.text.Editable;
import android.widget.EditText;
import android.text.TextWatcher;

public final class g implements TextWatcher
{
    public final EditText f;
    public a g;
    public int h;
    public int i;
    
    public g(final EditText f) {
        this.h = Integer.MAX_VALUE;
        this.i = 0;
        this.f = f;
    }
    
    public final void afterTextChanged(final Editable editable) {
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public final void onTextChanged(final CharSequence charSequence, final int n, int b, final int n2) {
        if (((View)this.f).isInEditMode()) {
            return;
        }
        if (b <= n2 && charSequence instanceof Spannable) {
            b = m4.a.a().b();
            if (b != 0) {
                if (b == 1) {
                    m4.a.a().f(n, n + n2, (CharSequence)charSequence, this.h, this.i);
                    return;
                }
                if (b != 3) {
                    return;
                }
            }
            final m4.a a = m4.a.a();
            if (this.g == null) {
                this.g = new a(this.f);
            }
            a.g((a$d)this.g);
        }
    }
    
    public static final class a extends a$d
    {
        public final WeakReference a;
        
        public a(final EditText editText) {
            this.a = new WeakReference((T)editText);
        }
        
        public final void a() {
            final EditText editText = (EditText)this.a.get();
            if (editText != null && ((View)editText).isAttachedToWindow()) {
                final Editable editableText = ((TextView)editText).getEditableText();
                final int selectionStart = Selection.getSelectionStart((CharSequence)editableText);
                final int selectionEnd = Selection.getSelectionEnd((CharSequence)editableText);
                final m4.a a = m4.a.a();
                int length;
                if (editableText == null) {
                    length = 0;
                }
                else {
                    a.getClass();
                    length = ((CharSequence)editableText).length();
                }
                a.f(0, length, (CharSequence)editableText, Integer.MAX_VALUE, 0);
                if (selectionStart >= 0 && selectionEnd >= 0) {
                    Selection.setSelection((Spannable)editableText, selectionStart, selectionEnd);
                }
                else if (selectionStart >= 0) {
                    Selection.setSelection((Spannable)editableText, selectionStart);
                }
                else if (selectionEnd >= 0) {
                    Selection.setSelection((Spannable)editableText, selectionEnd);
                }
            }
        }
    }
}
