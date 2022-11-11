// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import z0.r0;
import androidx.compose.runtime.ComposerImpl;
import sg2.e;
import hg2.j;
import z0.d;
import rg2.p;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;

public final class ContextMenu_androidKt
{
    public static final void a(final TextFieldSelectionManager textFieldSelectionManager, final p<? super d, ? super Integer, j> p4, final d d, final int n) {
        e.f((Object)textFieldSelectionManager, "manager");
        e.f((Object)p4, "content");
        final ComposerImpl s = d.s(-1985516685);
        int n3;
        if ((n & 0x70) == 0x0) {
            int n2;
            if (s.m((Object)p4)) {
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
        if ((n3 & 0x51) == 0x10 && s.c()) {
            s.k();
        }
        else {
            p4.invoke((Object)s, Integer.valueOf(n3 >> 3 & 0xE));
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new ContextMenu_androidKt$ContextMenuArea$1(textFieldSelectionManager, (p)p4, n);
        }
    }
}
