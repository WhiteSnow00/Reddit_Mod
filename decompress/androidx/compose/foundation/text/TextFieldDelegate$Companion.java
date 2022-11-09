// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import o2.i;
import o2.d;
import java.util.List;
import ah2.f;
import o2.w;
import zg2.l;
import o2.j;
import o2.e;
import androidx.compose.ui.text.input.TextFieldValue;
import o2.u;

public final class TextFieldDelegate$Companion
{
    public static w a(final u u, final TextFieldValue textFieldValue, final e e, final j j, final l l, final l i) {
        f.f((Object)u, "textInputService");
        f.f((Object)textFieldValue, "value");
        f.f((Object)e, "editProcessor");
        f.f((Object)j, "imeOptions");
        f.f((Object)l, "onValueChange");
        f.f((Object)i, "onImeActionPerformed");
        u.a.c(textFieldValue, j, (l<? super List<? extends d>, pg2.j>)new TextFieldDelegate$Companion$restartInput$1(e, l), (l<? super i, pg2.j>)i);
        final w w = new w(u, u.a);
        u.b.set(w);
        return w;
    }
}
