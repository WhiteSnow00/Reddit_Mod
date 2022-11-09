// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.lang.ref.WeakReference;
import java.lang.ref.Reference;
import android.text.Spanned;
import android.text.Selection;
import android.text.Spannable;
import com.bytedance.covode.number.Covode;
import android.widget.TextView;
import android.text.InputFilter;

public final class 09h implements InputFilter
{
    public final TextView LIZ;
    public 09K.d LIZIZ;
    
    static {
        Covode.recordClassIndex(1011);
    }
    
    public 09h(final TextView liz) {
        this.LIZ = liz;
    }
    
    public static void LIZ(final Spannable spannable, final int n, final int n2) {
        if (n < 0) {
            if (n2 >= 0) {
                Selection.setSelection(spannable, n2);
            }
            return;
        }
        if (n2 >= 0) {
            Selection.setSelection(spannable, n, n2);
            return;
        }
        Selection.setSelection(spannable, n);
    }
    
    public final CharSequence filter(CharSequence subSequence, final int n, final int n2, final Spanned spanned, final int n3, final int n4) {
        if (this.LIZ.isInEditMode()) {
            return subSequence;
        }
        final int lizj = 09K.LIZ().LIZJ();
        if (lizj != 0) {
            if (lizj == 1) {
                CharSequence liz;
                if (n4 == 0 && n3 == 0 && spanned.length() == 0 && subSequence == this.LIZ.getText()) {
                    liz = subSequence;
                }
                else if ((liz = subSequence) != null) {
                    if (n != 0 || n2 != subSequence.length()) {
                        subSequence = subSequence.subSequence(n, n2);
                    }
                    liz = 09K.LIZ().LIZ(subSequence, subSequence.length());
                }
                return liz;
            }
            if (lizj != 3) {
                return subSequence;
            }
        }
        final 09K liz2 = 09K.LIZ();
        if (this.LIZIZ == null) {
            this.LIZIZ = new a(this.LIZ);
        }
        liz2.LIZ(this.LIZIZ);
        return subSequence;
    }
    
    public static final class a extends d
    {
        public final Reference<TextView> LIZ;
        
        static {
            Covode.recordClassIndex(1012);
        }
        
        public a(final TextView textView) {
            this.LIZ = new WeakReference<TextView>(textView);
        }
        
        @Override
        public final void LIZ() {
            super.LIZ();
            final TextView textView = this.LIZ.get();
            if (textView != null && textView.isAttachedToWindow()) {
                final CharSequence liz = 09K.LIZ().LIZ(textView.getText());
                final int selectionStart = Selection.getSelectionStart(liz);
                final int selectionEnd = Selection.getSelectionEnd(liz);
                textView.setText(liz);
                if (liz instanceof Spannable) {
                    09h.LIZ((Spannable)liz, selectionStart, selectionEnd);
                }
            }
        }
    }
}
