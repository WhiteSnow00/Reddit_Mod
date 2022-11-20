// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.layout;

import kotlin.jvm.internal.Lambda;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import z0.p0;
import mg2.q;
import androidx.compose.runtime.ComposerImpl;
import mg2.l;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.ComposeUiNode;
import a01.a;
import z0.c;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.unit.LayoutDirection;
import z0.m0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import u2.b;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.runtime.ComposerKt;
import ng2.e;
import c2.v;
import cg2.j;
import mg2.p;
import j1.d;

public final class LayoutKt
{
    public static final void a(d f, final p<? super z0.d, ? super Integer, j> p6, final v v, final z0.d d, final int n, final int n2) {
        e.f((Object)p6, "content");
        e.f((Object)v, "measurePolicy");
        final ComposerImpl s = d.s(1949933075);
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
                if (s.m((Object)p6)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n4 | n7);
            }
        }
        int n8;
        if ((n2 & 0x4) != 0x0) {
            n8 = (n6 | 0x180);
        }
        else {
            n8 = n6;
            if ((n & 0x380) == 0x0) {
                int n9;
                if (s.m((Object)v)) {
                    n9 = 256;
                }
                else {
                    n9 = 128;
                }
                n8 = (n6 | n9);
            }
        }
        if ((n8 & 0x2DB) == 0x92 && s.d()) {
            s.j();
        }
        else {
            if (n3 != 0) {
                f = (d)j1.d.a.f;
            }
            final q a = ComposerKt.a;
            final d c = ComposedModifierKt.c((z0.d)s, f);
            final b b = (b)s.u((m0)CompositionLocalsKt.e);
            final LayoutDirection layoutDirection = (LayoutDirection)s.u((m0)CompositionLocalsKt.k);
            final k1 k1 = (k1)s.u((m0)CompositionLocalsKt.o);
            final mg2.a s2 = LayoutNode.S;
            s.A(-692256719);
            if (!(s.a instanceof c)) {
                a01.a.L();
                throw null;
            }
            s.i();
            if (s.L) {
                s.b(s2);
            }
            else {
                s.f();
            }
            s.x = false;
            ComposeUiNode.M2.getClass();
            Updater.b((z0.d)s, (Object)c, (p)ComposeUiNode.Companion.c);
            Updater.b((z0.d)s, (Object)v, (p)ComposeUiNode.Companion.e);
            Updater.b((z0.d)s, (Object)b, (p)ComposeUiNode.Companion.d);
            Updater.b((z0.d)s, (Object)layoutDirection, (p)ComposeUiNode.Companion.f);
            Updater.b((z0.d)s, (Object)k1, (p)ComposeUiNode.Companion.g);
            Updater.a((z0.d)s, (l)LayoutKt$MultiMeasureLayout$1$1.INSTANCE);
            s.p();
            p6.invoke((Object)s, (Object)(((n8 << 3 & 0x380) | 0x6) >> 6 & 0xE));
            s.S(true);
            s.S(false);
        }
        final p0 v2 = s.V();
        if (v2 != null) {
            v2.d = (p)new LayoutKt$MultiMeasureLayout$2(f, (p)p6, v, n, n2);
        }
    }
    
    public static final ComposableLambdaImpl b(final d d) {
        e.f((Object)d, "modifier");
        return xd.a.D((Lambda)new LayoutKt$materializerOf$1(d), -1586257396, true);
    }
}
