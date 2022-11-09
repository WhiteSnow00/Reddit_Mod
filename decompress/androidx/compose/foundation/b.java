// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import zg2.p;
import z0.r0;
import androidx.compose.runtime.ComposerImpl;
import pg2.j;
import q1.e;
import a80.a;
import androidx.compose.ui.draw.DrawModifierKt;
import ah2.f;
import zg2.l;
import z0.d;

public final class b
{
    public static final void a(final int n, final d d, final j1.d d2, final l l) {
        f.f((Object)d2, "modifier");
        f.f((Object)l, "onDraw");
        final ComposerImpl r = d.r(-932836462);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (r.l((Object)d2)) {
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
        int n4 = n3;
        if ((n & 0x70) == 0x0) {
            int n5;
            if (r.l((Object)l)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if ((n4 & 0x5B) == 0x12 && r.b()) {
            r.j();
        }
        else {
            a.g(DrawModifierKt.a(d2, l), (d)r, 0);
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (p<? super d, ? super Integer, j>)new CanvasKt$Canvas$1(d2, (l<? super e, j>)l, n);
        }
    }
}
