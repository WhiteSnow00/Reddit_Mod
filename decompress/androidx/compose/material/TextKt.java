// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import z0.r0;
import androidx.compose.runtime.ComposerImpl;
import z0.o0;
import z0.p0;
import sg2.e;
import hg2.j;
import z0.d;
import i2.p;
import rg2.a;
import z0.a1;
import androidx.compose.runtime.CompositionLocalKt;
import z0.h1;
import z0.r;

public final class TextKt
{
    public static final r a;
    
    static {
        a = CompositionLocalKt.b((a1)h1.a, (a)TextKt$LocalTextStyle.TextKt$LocalTextStyle$1.INSTANCE);
    }
    
    public static final void a(final p p4, final rg2.p<? super d, ? super Integer, j> p5, final d d, final int n) {
        e.f((Object)p4, "value");
        e.f((Object)p5, "content");
        final ComposerImpl s = d.s(1772272796);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (s.m((Object)p4)) {
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
            if (s.m((Object)p5)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if ((n4 & 0x5B) == 0x12 && s.c()) {
            s.k();
        }
        else {
            final r a = TextKt.a;
            CompositionLocalKt.a((p0<?>[])new p0[] { ((o0)a).b((Object)((p)s.u((o0)a)).b(p4)) }, p5, (d)s, (n4 & 0x70) | 0x8);
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (rg2.p)new TextKt$ProvideTextStyle.TextKt$ProvideTextStyle$1(p4, (rg2.p)p5, n);
        }
    }
}
