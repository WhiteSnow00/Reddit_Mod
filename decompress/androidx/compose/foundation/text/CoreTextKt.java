// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import n2.g;
import i2.p;
import v0.k;
import z0.r0;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.ComposerImpl;
import z0.v0;
import androidx.compose.runtime.Updater;
import z0.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.unit.LayoutDirection;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import u2.b;
import ah2.f;
import i2.a;
import kotlin.collections.EmptyList;
import z0.d;
import zg2.q;
import i2.j;
import i2.a$b;
import java.util.List;
import kotlin.Pair;

public final class CoreTextKt
{
    public static final Pair<List<a$b<j>>, List<a$b<q<String, d, Integer, pg2.j>>>> a;
    
    static {
        final EmptyList instance = EmptyList.INSTANCE;
        a = new Pair((Object)instance, (Object)instance);
    }
    
    public static final void a(final a a, final List<a$b<q<String, d, Integer, pg2.j>>> list, final d d, final int n) {
        f.f((Object)a, "text");
        f.f((Object)list, "inlineContents");
        final ComposerImpl r = d.r(-110905764);
        final int size = list.size();
        final Integer value = 0;
        for (int i = 0; i < size; ++i) {
            final a$b a$b = list.get(i);
            final q q = (q)a$b.a;
            final int b = a$b.b;
            final int c = a$b.c;
            final CoreTextKt$InlineChildren$1$2 a2 = CoreTextKt$InlineChildren$1$2.a;
            r.A(-1323940314);
            final j1.d.a f = d.a.f;
            final b b2 = (b)r.t((o0)CompositionLocalsKt.e);
            final LayoutDirection layoutDirection = (LayoutDirection)r.t((o0)CompositionLocalsKt.k);
            final k1 k1 = (k1)r.t((o0)CompositionLocalsKt.o);
            ComposeUiNode.w2.getClass();
            final zg2.a b3 = ComposeUiNode$Companion.b;
            final ComposableLambdaImpl b4 = LayoutKt.b((j1.d)f);
            if (!(r.a instanceof c)) {
                yl.a.B0();
                throw null;
            }
            r.h();
            if (r.K) {
                r.i(b3);
            }
            else {
                r.e();
            }
            r.x = false;
            Updater.b((d)r, (Object)a2, ComposeUiNode$Companion.e);
            Updater.b((d)r, (Object)b2, ComposeUiNode$Companion.d);
            Updater.b((d)r, (Object)layoutDirection, ComposeUiNode$Companion.f);
            Updater.b((d)r, (Object)k1, ComposeUiNode$Companion.g);
            r.o();
            b4.invoke((Object)new v0((d)r), (Object)r, (Object)value);
            r.A(2058660585);
            r.A(-72427749);
            q.invoke((Object)a.d(b, c).f, (Object)r, (Object)value);
            r.R(false);
            r.R(false);
            r.R(true);
            r.R(false);
        }
        final r0 u = r.U();
        if (u != null) {
            u.d = (zg2.p<? super d, ? super Integer, pg2.j>)new CoreTextKt$InlineChildren$2(a, (List)list, n);
        }
    }
    
    public static final k b(k k, final a a, final p p9, final b b, final g.a a2, final boolean b2, final int n, final int n2, final List<a$b<j>> list) {
        f.f((Object)k, "current");
        f.f((Object)a, "text");
        f.f((Object)p9, "style");
        f.f((Object)b, "density");
        f.f((Object)a2, "fontFamilyResolver");
        f.f((Object)list, "placeholders");
        if (!f.a((Object)k.a, (Object)a) || !f.a((Object)k.b, (Object)p9) || k.d != b2 || k.e != n || k.c != n2 || !f.a((Object)k.f, (Object)b) || !f.a((Object)k.h, (Object)list) || k.g != a2) {
            k = new k(a, p9, n2, b2, n, b, a2, list);
        }
        return k;
    }
}
