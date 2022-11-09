// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.Selection;
import java.lang.ref.WeakReference;
import java.lang.ref.Reference;
import android.text.Spannable;
import android.text.Editable;
import com.bytedance.covode.number.Covode;
import android.widget.EditText;
import android.text.TextWatcher;

public final class 09l implements TextWatcher
{
    public int LIZ;
    public int LIZIZ;
    public final EditText LIZJ;
    public 09K.d LIZLLL;
    
    static {
        Covode.recordClassIndex(1017);
    }
    
    public 09l(final EditText lizj) {
        this.LIZ = Integer.MAX_VALUE;
        this.LIZJ = lizj;
    }
    
    public final void afterTextChanged(final Editable editable) {
    }
    
    public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public final void onTextChanged(final CharSequence charSequence, final int n, int lizj, final int n2) {
        if (this.LIZJ.isInEditMode()) {
            return;
        }
        if (lizj <= n2 && charSequence instanceof Spannable) {
            lizj = 09K.LIZ().LIZJ();
            if (lizj != 0) {
                if (lizj == 1) {
                    09K.LIZ().LIZ(charSequence, n, n + n2, this.LIZ, this.LIZIZ);
                    return;
                }
                if (lizj != 3) {
                    return;
                }
            }
            final 09K liz = 09K.LIZ();
            if (this.LIZLLL == null) {
                this.LIZLLL = new a(this.LIZJ);
            }
            liz.LIZ(this.LIZLLL);
        }
    }
    
    public static final class a extends d
    {
        public final Reference<EditText> LIZ;
        
        static {
            Covode.recordClassIndex(1018);
        }
        
        public a(final EditText editText) {
            this.LIZ = new WeakReference<EditText>(editText);
        }
        
        @Override
        public final void LIZ() {
            super.LIZ();
            final EditText editText = this.LIZ.get();
            if (editText != null && editText.isAttachedToWindow()) {
                final Editable editableText = editText.getEditableText();
                final int selectionStart = Selection.getSelectionStart((CharSequence)editableText);
                final int selectionEnd = Selection.getSelectionEnd((CharSequence)editableText);
                09K.LIZ().LIZ((CharSequence)editableText);
                09h.LIZ((Spannable)editableText, selectionStart, selectionEnd);
            }
        }
    }
}
