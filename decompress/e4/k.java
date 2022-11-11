// 
// Decompiled by Procyon v0.6.0
// 

package e4;

import android.content.ClipData$Item;
import android.content.Context;
import android.content.ClipData;
import android.text.Spannable;
import android.text.Selection;
import android.text.Spanned;
import android.text.Editable;
import android.widget.TextView;
import android.util.Log;
import a4.c;
import android.view.View;
import a4.h0;

public final class k implements h0
{
    public final c a(final View view, final c c) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("onReceive: ");
            sb.append(c);
            Log.d("ReceiveContent", sb.toString());
        }
        if (c.a.f() == 2) {
            return c;
        }
        final ClipData g = c.a.g();
        final int flags = c.a.getFlags();
        final TextView textView = (TextView)view;
        final Editable editable = (Editable)textView.getText();
        final Context context = ((View)textView).getContext();
        int n;
        int n2;
        for (int i = n = 0; i < g.getItemCount(); ++i, n = n2) {
            final ClipData$Item item = g.getItemAt(i);
            CharSequence charSequence2;
            if ((flags & 0x1) != 0x0) {
                final CharSequence charSequence = charSequence2 = item.coerceToText(context);
                if (charSequence instanceof Spanned) {
                    charSequence2 = charSequence.toString();
                }
            }
            else {
                charSequence2 = item.coerceToStyledText(context);
            }
            n2 = n;
            if (charSequence2 != null) {
                if (n == 0) {
                    final int selectionStart = Selection.getSelectionStart((CharSequence)editable);
                    final int selectionEnd = Selection.getSelectionEnd((CharSequence)editable);
                    final int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    final int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection((Spannable)editable, max2);
                    editable.replace(max, max2, charSequence2);
                    n2 = 1;
                }
                else {
                    editable.insert(Selection.getSelectionEnd((CharSequence)editable), (CharSequence)"\n");
                    editable.insert(Selection.getSelectionEnd((CharSequence)editable), charSequence2);
                    n2 = n;
                }
            }
        }
        return null;
    }
}
