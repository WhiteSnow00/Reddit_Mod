// 
// Decompiled by Procyon v0.6.0
// 

package p4;

import android.widget.TextView;
import android.view.View;
import android.text.Editable;
import android.text.Spannable;
import androidx.emoji2.text.f;
import android.text.Selection;
import android.widget.EditText;
import android.text.TextWatcher;

public final class g implements TextWatcher
{
    public final EditText f;
    public final boolean g;
    public g.g$a h;
    public boolean i;
    
    public g(final EditText f) {
        this.f = f;
        this.g = false;
        this.i = true;
    }
    
    public static void a(final EditText editText, int length) {
        if (length == 1 && editText != null && ((View)editText).isAttachedToWindow()) {
            final Editable editableText = ((TextView)editText).getEditableText();
            final int selectionStart = Selection.getSelectionStart((CharSequence)editableText);
            final int selectionEnd = Selection.getSelectionEnd((CharSequence)editableText);
            final f a = f.a();
            if (editableText == null) {
                length = 0;
            }
            else {
                a.getClass();
                length = ((CharSequence)editableText).length();
            }
            a.f(0, length, (CharSequence)editableText);
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
    
    public final void afterTextChanged(final Editable editable) {
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public final void onTextChanged(final CharSequence charSequence, final int n, int b, final int n2) {
        if (!((View)this.f).isInEditMode()) {
            final boolean i = this.i;
            final boolean b2 = false;
            int n3 = 0;
            Label_0062: {
                if (i) {
                    n3 = (b2 ? 1 : 0);
                    if (this.g) {
                        break Label_0062;
                    }
                    final boolean b3 = androidx.emoji2.text.f.j != null;
                    n3 = (b2 ? 1 : 0);
                    if (b3) {
                        break Label_0062;
                    }
                }
                n3 = 1;
            }
            if (n3 == 0) {
                if (b <= n2 && charSequence instanceof Spannable) {
                    b = androidx.emoji2.text.f.a().b();
                    if (b != 0) {
                        if (b == 1) {
                            androidx.emoji2.text.f.a().f(n, n2 + n, charSequence);
                            return;
                        }
                        if (b != 3) {
                            return;
                        }
                    }
                    final f a = androidx.emoji2.text.f.a();
                    if (this.h == null) {
                        this.h = new g.g$a(this.f);
                    }
                    a.g((f.e)this.h);
                }
            }
        }
    }
}
