// 
// Decompiled by Procyon v0.6.0
// 

package p4;

import android.text.Spanned;
import androidx.emoji2.text.f$b;
import android.os.BaseBundle;
import androidx.emoji2.text.k;
import android.text.Selection;
import android.text.Editable;
import o4.b;
import androidx.emoji2.text.f$a;
import android.os.Bundle;
import androidx.emoji2.text.f;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import android.view.inputmethod.InputConnectionWrapper;

public final class c extends InputConnectionWrapper
{
    public final TextView a;
    public final a b;
    
    public c(final EditText a, final InputConnection inputConnection, final EditorInfo editorInfo) {
        final a b = new a();
        super(inputConnection, false);
        this.a = (TextView)a;
        this.b = b;
        final f j = f.j;
        final int n = 1;
        if (j != null) {
            final f a2 = f.a();
            int n2;
            if (a2.b() == 1) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (n2 != 0) {
                if (editorInfo != null) {
                    if (editorInfo.extras == null) {
                        editorInfo.extras = new Bundle();
                    }
                    final f$a e = a2.e;
                    e.getClass();
                    final Bundle extras = editorInfo.extras;
                    final b a3 = e.c.a;
                    final int a4 = ((o4.c)a3).a(4);
                    int int1;
                    if (a4 != 0) {
                        int1 = ((o4.c)a3).b.getInt(a4 + ((o4.c)a3).a);
                    }
                    else {
                        int1 = 0;
                    }
                    ((BaseBundle)extras).putInt("android.support.text.emoji.emojiCompat_metadataVersion", int1);
                    final Bundle extras2 = editorInfo.extras;
                    ((f$b)e).a.getClass();
                    ((BaseBundle)extras2).putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
                }
            }
        }
    }
    
    public final boolean deleteSurroundingText(final int n, final int n2) {
        final a b = this.b;
        final Editable editableText = this.a.getEditableText();
        b.getClass();
        boolean b2 = false;
        if (c.a.a((InputConnection)this, editableText, n, n2, false) || super.deleteSurroundingText(n, n2)) {
            b2 = true;
        }
        return b2;
    }
    
    public final boolean deleteSurroundingTextInCodePoints(final int n, final int n2) {
        final a b = this.b;
        final Editable editableText = this.a.getEditableText();
        b.getClass();
        boolean b2 = true;
        if (!c.a.a((InputConnection)this, editableText, n, n2, true)) {
            b2 = (super.deleteSurroundingTextInCodePoints(n, n2) && b2);
        }
        return b2;
    }
    
    public static final class a
    {
        public static boolean a(final InputConnection inputConnection, final Editable editable, int n, int i, final boolean b) {
            final Object j = f.i;
            boolean b3;
            final boolean b2 = b3 = false;
            if (editable != null) {
                if (inputConnection == null) {
                    b3 = b2;
                }
                else {
                    b3 = b2;
                    if (n >= 0) {
                        if (i < 0) {
                            b3 = b2;
                        }
                        else {
                            final int selectionStart = Selection.getSelectionStart((CharSequence)editable);
                            final int selectionEnd = Selection.getSelectionEnd((CharSequence)editable);
                            if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
                                b3 = b2;
                            }
                            else {
                                int n4;
                                if (b) {
                                    final int max = Math.max(n, 0);
                                    n = ((CharSequence)editable).length();
                                    Label_0244: {
                                        Label_0242: {
                                            if (selectionStart >= 0) {
                                                if (n >= selectionStart) {
                                                    n = selectionStart;
                                                    int k;
                                                    if ((k = max) >= 0) {
                                                    Label_0149:
                                                        while (true) {
                                                            int n2 = 0;
                                                            while (k != 0) {
                                                                if (--n < 0) {
                                                                    if (n2 != 0) {
                                                                        break Label_0242;
                                                                    }
                                                                    n = 0;
                                                                    break;
                                                                }
                                                                else {
                                                                    final char char1 = ((CharSequence)editable).charAt(n);
                                                                    if (n2 != 0) {
                                                                        if (!Character.isHighSurrogate(char1)) {
                                                                            break Label_0242;
                                                                        }
                                                                        --k;
                                                                        continue Label_0149;
                                                                    }
                                                                    else if (!Character.isSurrogate(char1)) {
                                                                        --k;
                                                                    }
                                                                    else {
                                                                        if (Character.isHighSurrogate(char1)) {
                                                                            break Label_0242;
                                                                        }
                                                                        n2 = 1;
                                                                    }
                                                                }
                                                            }
                                                            break Label_0244;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        n = -1;
                                    }
                                    final int max2 = Math.max(i, 0);
                                    final int length = ((CharSequence)editable).length();
                                    Label_0390: {
                                        Label_0388: {
                                            if (selectionEnd >= 0) {
                                                if (length >= selectionEnd) {
                                                    i = selectionEnd;
                                                    int l;
                                                    if ((l = max2) >= 0) {
                                                    Label_0289:
                                                        while (true) {
                                                            int n3 = 0;
                                                            while (l != 0) {
                                                                if (i >= length) {
                                                                    i = length;
                                                                    if (n3 != 0) {
                                                                        break Label_0388;
                                                                    }
                                                                    break;
                                                                }
                                                                else {
                                                                    final char char2 = ((CharSequence)editable).charAt(i);
                                                                    if (n3 != 0) {
                                                                        if (!Character.isLowSurrogate(char2)) {
                                                                            break Label_0388;
                                                                        }
                                                                        --l;
                                                                        ++i;
                                                                        continue Label_0289;
                                                                    }
                                                                    else if (!Character.isSurrogate(char2)) {
                                                                        --l;
                                                                        ++i;
                                                                    }
                                                                    else {
                                                                        if (Character.isLowSurrogate(char2)) {
                                                                            break Label_0388;
                                                                        }
                                                                        ++i;
                                                                        n3 = 1;
                                                                    }
                                                                }
                                                            }
                                                            break Label_0390;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i = -1;
                                    }
                                    b3 = b2;
                                    if (n == -1) {
                                        return b3;
                                    }
                                    if ((n4 = i) == -1) {
                                        b3 = b2;
                                        return b3;
                                    }
                                }
                                else {
                                    n = Math.max(selectionStart - n, 0);
                                    n4 = Math.min(selectionEnd + i, ((CharSequence)editable).length());
                                }
                                final k[] array = (k[])((Spanned)editable).getSpans(n, n4, (Class)k.class);
                                b3 = b2;
                                if (array != null) {
                                    b3 = b2;
                                    if (array.length > 0) {
                                        int length2;
                                        k m;
                                        int spanStart;
                                        int spanEnd;
                                        for (length2 = array.length, i = 0; i < length2; ++i) {
                                            m = array[i];
                                            spanStart = ((Spanned)editable).getSpanStart((Object)m);
                                            spanEnd = ((Spanned)editable).getSpanEnd((Object)m);
                                            n = Math.min(spanStart, n);
                                            n4 = Math.max(spanEnd, n4);
                                        }
                                        n = Math.max(n, 0);
                                        i = Math.min(n4, ((CharSequence)editable).length());
                                        inputConnection.beginBatchEdit();
                                        editable.delete(n, i);
                                        inputConnection.endBatchEdit();
                                        b3 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return b3;
        }
    }
}
