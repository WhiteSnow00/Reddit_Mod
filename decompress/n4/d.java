// 
// Decompiled by Procyon v0.6.0
// 

package n4;

import android.view.View;
import android.text.Spannable;
import android.text.Selection;
import java.lang.ref.WeakReference;
import m4.a$d;
import m4.a;
import android.text.Spanned;
import android.widget.TextView;
import android.text.InputFilter;

public final class d implements InputFilter
{
    public final TextView a;
    public a b;
    
    public d(final TextView a) {
        this.a = a;
    }
    
    public final CharSequence filter(CharSequence subSequence, final int n, final int n2, final Spanned spanned, final int n3, final int n4) {
        if (((View)this.a).isInEditMode()) {
            return subSequence;
        }
        final int b = m4.a.a().b();
        if (b != 0) {
            final int n5 = 1;
            if (b == 1) {
                int n6 = n5;
                if (n4 == 0) {
                    n6 = n5;
                    if (n3 == 0) {
                        n6 = n5;
                        if (((CharSequence)spanned).length() == 0) {
                            n6 = n5;
                            if (subSequence == this.a.getText()) {
                                n6 = 0;
                            }
                        }
                    }
                }
                CharSequence f = subSequence;
                if (n6 != 0 && (f = subSequence) != null) {
                    if (n != 0 || n2 != subSequence.length()) {
                        subSequence = subSequence.subSequence(n, n2);
                    }
                    f = m4.a.a().f(0, subSequence.length(), subSequence, Integer.MAX_VALUE, 0);
                }
                return f;
            }
            if (b != 3) {
                return subSequence;
            }
        }
        final m4.a a = m4.a.a();
        if (this.b == null) {
            this.b = new a(this.a);
        }
        a.g((a$d)this.b);
        return subSequence;
    }
    
    public static final class a extends a$d
    {
        public final WeakReference a;
        
        public a(final TextView textView) {
            this.a = new WeakReference((T)textView);
        }
        
        public final void a() {
            final TextView textView = (TextView)this.a.get();
            if (textView != null && ((View)textView).isAttachedToWindow()) {
                final m4.a a = m4.a.a();
                final CharSequence text = textView.getText();
                int length;
                if (text == null) {
                    length = 0;
                }
                else {
                    a.getClass();
                    length = text.length();
                }
                final CharSequence f = a.f(0, length, text, Integer.MAX_VALUE, 0);
                final int selectionStart = Selection.getSelectionStart(f);
                final int selectionEnd = Selection.getSelectionEnd(f);
                textView.setText(f);
                if (f instanceof Spannable) {
                    final Spannable spannable = (Spannable)f;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                    }
                    else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                    }
                    else if (selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionEnd);
                    }
                }
            }
        }
    }
}
