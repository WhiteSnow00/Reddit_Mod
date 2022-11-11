// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import n2.g$a;
import z0.r0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.ComposerImpl;
import z0.v0;
import rg2.p;
import androidx.compose.runtime.Updater;
import z0.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.h1;
import androidx.compose.ui.unit.LayoutDirection;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import u2.b;
import sg2.e;
import kotlin.collections.EmptyList;
import z0.d;
import rg2.q;
import i2.j;
import i2.a;
import java.util.List;
import kotlin.Pair;

public final class CoreTextKt
{
    public static final Pair<List<a.b<j>>, List<a.b<q<String, d, Integer, hg2.j>>>> a;
    
    static {
        final EmptyList instance = EmptyList.INSTANCE;
        a = new Pair((Object)instance, (Object)instance);
    }
    
    public static final void a(final a a, final List<a.b<q<String, d, Integer, hg2.j>>> list, final d d, final int n) {
        e.f((Object)a, "text");
        e.f((Object)list, "inlineContents");
        final ComposerImpl s = d.s(-110905764);
        final int size = list.size();
        final Integer value = 0;
        for (int i = 0; i < size; ++i) {
            final a.b b = (a.b)list.get(i);
            final q q = (q)b.a;
            final int b2 = b.b;
            final int c = b.c;
            final CoreTextKt$InlineChildren$1$2 a2 = CoreTextKt$InlineChildren$1$2.a;
            s.A(-1323940314);
            final j1.d.a f = d.a.f;
            final b b3 = (b)s.u((o0)CompositionLocalsKt.e);
            final LayoutDirection layoutDirection = (LayoutDirection)s.u((o0)CompositionLocalsKt.k);
            final h1 h1 = (h1)s.u((o0)CompositionLocalsKt.o);
            ComposeUiNode.u2.getClass();
            final rg2.a b4 = ComposeUiNode$Companion.b;
            final ComposableLambdaImpl b5 = LayoutKt.b((j1.d)f);
            if (!(s.a instanceof c)) {
                bg.d.k0();
                throw null;
            }
            s.j();
            if (s.K) {
                s.E(b4);
            }
            else {
                s.f();
            }
            s.x = false;
            Updater.b((d)s, a2, ComposeUiNode$Companion.e);
            Updater.b((d)s, b3, ComposeUiNode$Companion.d);
            Updater.b((d)s, layoutDirection, ComposeUiNode$Companion.f);
            Updater.b((d)s, h1, ComposeUiNode$Companion.g);
            s.p();
            b5.invoke((Object)new v0((d)s), (Object)s, (Object)value);
            s.A(2058660585);
            s.A(-72427749);
            q.invoke(a.d(b2, c).f, s, value);
            s.R(false);
            s.R(false);
            s.R(true);
            s.R(false);
        }
        final r0 u = s.U();
        if (u != null) {
            u.d = (p)new CoreTextKt$InlineChildren$2(a, (List)list, n);
        }
    }
    
    public static final v0.j b(v0.j j, final a a, final i2.p p9, final b b, final g$a g$a, final boolean b2, final int n, final int n2, final List<a.b<j>> list) {
        e.f((Object)j, "current");
        e.f((Object)a, "text");
        e.f((Object)p9, "style");
        e.f((Object)b, "density");
        e.f((Object)g$a, "fontFamilyResolver");
        e.f((Object)list, "placeholders");
        if (!e.a((Object)j.a, (Object)a) || !e.a((Object)j.b, (Object)p9) || j.d != b2 || j.e != n || j.c != n2 || !e.a((Object)j.f, (Object)b) || !e.a((Object)j.h, (Object)list) || j.g != g$a) {
            j = new v0.j(a, p9, n2, b2, n, b, g$a, (List)list);
        }
        return j;
    }
}
