// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import z0.r0;
import androidx.compose.runtime.ComposerImpl;
import sg2.e;
import hg2.j;
import z0.d;
import rg2.p;

public final class MaterialTheme_androidKt
{
    public static final void a(final p<? super d, ? super Integer, j> p3, final d d, final int n) {
        e.f((Object)p3, "content");
        final ComposerImpl s = d.s(-1322912246);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (s.m((Object)p3)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        if ((n3 & 0xB) == 0x2 && s.c()) {
            s.k();
        }
        else {
            p3.invoke((Object)s, Integer.valueOf(n3 & 0xE));
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new MaterialTheme_androidKt$PlatformMaterialTheme$1((p)p3, n);
        }
    }
}
