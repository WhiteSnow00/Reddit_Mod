// 
// Decompiled by Procyon v0.6.0
// 

package n4;

import android.os.BaseBundle;
import android.text.Editable;
import s5.b;
import android.os.Bundle;
import m4.a;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import android.view.inputmethod.InputConnectionWrapper;

public final class c extends InputConnectionWrapper
{
    public final TextView a;
    
    public c(final EditText a, final InputConnection inputConnection, final EditorInfo editorInfo) {
        super(inputConnection, false);
        this.a = (TextView)a;
        final a a2 = m4.a.a();
        final int b = a2.b();
        boolean b2 = true;
        if (b != 1) {
            b2 = false;
        }
        if (b2 && editorInfo != null && editorInfo.extras != null) {
            final a.a e = a2.e;
            e.getClass();
            final Bundle extras = editorInfo.extras;
            final b a3 = e.c.a;
            final int a4 = ((s5.c)a3).a(4);
            int int1;
            if (a4 != 0) {
                int1 = ((s5.c)a3).b.getInt(a4 + ((s5.c)a3).a);
            }
            else {
                int1 = 0;
            }
            ((BaseBundle)extras).putInt("android.support.text.emoji.emojiCompat_metadataVersion", int1);
            final Bundle extras2 = editorInfo.extras;
            e.a.getClass();
            ((BaseBundle)extras2).putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }
    
    public final boolean deleteSurroundingText(final int n, final int n2) {
        final Editable editableText = this.a.getEditableText();
        boolean b = false;
        if (m4.a.c((InputConnection)this, editableText, n, n2, false) || super.deleteSurroundingText(n, n2)) {
            b = true;
        }
        return b;
    }
    
    public final boolean deleteSurroundingTextInCodePoints(final int n, final int n2) {
        final Editable editableText = this.a.getEditableText();
        boolean b = true;
        if (!m4.a.c((InputConnection)this, editableText, n, n2, true)) {
            b = (super.deleteSurroundingTextInCodePoints(n, n2) && b);
        }
        return b;
    }
}
