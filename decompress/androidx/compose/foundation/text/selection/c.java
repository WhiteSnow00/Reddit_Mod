// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text.selection;

import androidx.compose.ui.semantics.a;
import rg2.q;
import androidx.compose.ui.ComposedModifierKt;
import sg2.e;
import androidx.compose.foundation.f;
import android.os.Build$VERSION;
import m0.m;
import j1.d;

public final class c
{
    public static final d a(final TextFieldSelectionManager textFieldSelectionManager) {
        final d.a f = d.a.f;
        final m h = m.h;
        h.getClass();
        final int sdk_INT = Build$VERSION.SDK_INT;
        final a a = androidx.compose.foundation.f.a;
        final boolean b = true;
        int n = 0;
        Label_0102: {
            if (sdk_INT >= 28) {
                if (!h.f) {
                    n = (b ? 1 : 0);
                    if (h.a) {
                        break Label_0102;
                    }
                    if (e.a((Object)h, (Object)m.g)) {
                        n = (b ? 1 : 0);
                        break Label_0102;
                    }
                    if (sdk_INT >= 29) {
                        n = (b ? 1 : 0);
                        break Label_0102;
                    }
                }
            }
            n = 0;
        }
        if (n == 0) {
            return (d)f;
        }
        return ComposedModifierKt.b((d)f, (q)new TextFieldSelectionManager_androidKt$textFieldMagnifier$1(textFieldSelectionManager));
    }
}
