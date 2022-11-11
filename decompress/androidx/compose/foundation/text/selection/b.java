// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text.selection;

import z0.r0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import rg2.a;
import androidx.compose.runtime.ComposerImpl;
import al0.g7;
import hg2.j;
import androidx.compose.runtime.Updater;
import z0.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.h1;
import androidx.compose.ui.unit.LayoutDirection;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import sg2.e;
import rg2.p;
import z0.d;

public final class b
{
    public static final void a(final int n, final int n2, final d d, j1.d f, final p p5) {
        e.f((Object)p5, "content");
        final ComposerImpl s = d.s(-2105228848);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n5;
            if (s.m((Object)f)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n);
        }
        else {
            n4 = n;
        }
        int n6;
        if ((n2 & 0x2) != 0x0) {
            n6 = (n4 | 0x30);
        }
        else {
            n6 = n4;
            if ((n & 0x70) == 0x0) {
                int n7;
                if (s.m((Object)p5)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n4 | n7);
            }
        }
        if ((n6 & 0x5B) == 0x12 && s.c()) {
            s.k();
        }
        else {
            if (n3 != 0) {
                f = (j1.d)j1.d.a.f;
            }
            final SimpleLayoutKt$SimpleLayout$1 a = SimpleLayoutKt$SimpleLayout$1.a;
            s.A(-1323940314);
            final u2.b b = (u2.b)s.u((o0)CompositionLocalsKt.e);
            final LayoutDirection layoutDirection = (LayoutDirection)s.u((o0)CompositionLocalsKt.k);
            final h1 h1 = (h1)s.u((o0)CompositionLocalsKt.o);
            ComposeUiNode.u2.getClass();
            final a b2 = ComposeUiNode$Companion.b;
            final ComposableLambdaImpl b3 = LayoutKt.b(f);
            final int n8 = (((n6 << 3 & 0x70) | (n6 >> 3 & 0xE)) << 9 & 0x1C00) | 0x6;
            if (!(s.a instanceof c)) {
                bg.d.k0();
                throw null;
            }
            s.j();
            if (s.K) {
                s.E(b2);
            }
            else {
                s.f();
            }
            s.x = false;
            Updater.b((d)s, a, ComposeUiNode$Companion.e);
            Updater.b((d)s, b, ComposeUiNode$Companion.d);
            Updater.b((d)s, layoutDirection, ComposeUiNode$Companion.f);
            al0.b.m(n8 >> 3 & 0x70, b3, d.v(s, h1, ComposeUiNode$Companion.g, s), s, 2058660585);
            g7.r(n8 >> 9 & 0xE, p5, s, false, true, false);
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new SimpleLayoutKt$SimpleLayout$2(f, p5, n, n2);
        }
    }
}
