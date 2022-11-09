// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import z0.r0;
import androidx.compose.runtime.ComposerImpl;
import ah2.f;
import pg2.j;
import z0.d;
import zg2.p;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;

public final class ContextMenu_androidKt
{
    public static final void a(final TextFieldSelectionManager textFieldSelectionManager, final p<? super d, ? super Integer, j> p4, final d d, final int n) {
        f.f((Object)textFieldSelectionManager, "manager");
        f.f((Object)p4, "content");
        final ComposerImpl r = d.r(-1985516685);
        int n3;
        if ((n & 0x70) == 0x0) {
            int n2;
            if (r.l((Object)p4)) {
                n2 = 32;
            }
            else {
                n2 = 16;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        if ((n3 & 0x51) == 0x10 && r.b()) {
            r.j();
        }
        else {
            p4.invoke((Object)r, (Object)(n3 >> 3 & 0xE));
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super d, ? super Integer, j>)new ContextMenu_androidKt$ContextMenuArea$1(textFieldSelectionManager, (p)p4, n);
        }
    }
}
