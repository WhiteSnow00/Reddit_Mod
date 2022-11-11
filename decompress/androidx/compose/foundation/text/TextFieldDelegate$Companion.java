// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import o2.i;
import o2.d;
import java.util.List;
import o2.w;
import rg2.l;
import o2.j;
import o2.e;
import androidx.compose.ui.text.input.TextFieldValue;
import o2.u;

public final class TextFieldDelegate$Companion
{
    public static w a(final u u, final TextFieldValue textFieldValue, final e e, final j j, final l l, final l i) {
        sg2.e.f((Object)u, "textInputService");
        sg2.e.f((Object)textFieldValue, "value");
        sg2.e.f((Object)e, "editProcessor");
        sg2.e.f((Object)j, "imeOptions");
        sg2.e.f((Object)l, "onValueChange");
        sg2.e.f((Object)i, "onImeActionPerformed");
        u.a.c(textFieldValue, j, (l<? super List<? extends d>, hg2.j>)new TextFieldDelegate$Companion$restartInput$1(e, l), i);
        final w w = new w(u, u.a);
        u.b.set(w);
        return w;
    }
}
