// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.bytedance.covode.number.Covode;
import android.widget.TextView;
import android.view.inputmethod.InputConnectionWrapper;

public final class 09g extends InputConnectionWrapper
{
    public final TextView LIZ;
    
    static {
        Covode.recordClassIndex(1010);
    }
    
    public 09g(final TextView liz, final InputConnection inputConnection, final EditorInfo editorInfo) {
        super(inputConnection, false);
        this.LIZ = liz;
        final 09K liz2 = 09K.LIZ();
        if (liz2.LIZLLL() && editorInfo != null && editorInfo.extras != null) {
            liz2.LIZ.LIZ(editorInfo);
        }
    }
    
    public final boolean deleteSurroundingText(final int n, final int n2) {
        return 09K.LIZ((InputConnection)this, this.LIZ.getEditableText(), n, n2, false) || super.deleteSurroundingText(n, n2);
    }
    
    public final boolean deleteSurroundingTextInCodePoints(final int n, final int n2) {
        return 09K.LIZ((InputConnection)this, this.LIZ.getEditableText(), n, n2, true) || super.deleteSurroundingTextInCodePoints(n, n2);
    }
}
