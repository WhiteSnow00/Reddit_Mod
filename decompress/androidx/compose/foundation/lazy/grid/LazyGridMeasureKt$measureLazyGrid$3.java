// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import tg2.c;
import at1.a;
import u2.g;
import r0.y;
import r0.e;
import r0.o;
import ah2.f;
import r0.p;
import java.util.List;
import kotlin.Metadata;
import pg2.j;
import c2.e0;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003" }, d2 = { "Lc2/e0$a;", "Lpg2/j;", "invoke", "(Lc2/e0$a;)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class LazyGridMeasureKt$measureLazyGrid$3 extends Lambda implements l<e0.a, j>
{
    public final /* synthetic */ List<p> $positionedItems;
    
    public LazyGridMeasureKt$measureLazyGrid$3(final List<p> $positionedItems) {
        this.$positionedItems = $positionedItems;
        super(1);
    }
    
    public final void invoke(final e0.a a) {
        f.f((Object)a, "$this$invoke");
        final List<p> $positionedItems = this.$positionedItems;
        int n;
        for (int size = $positionedItems.size(), i = 0; i < size; i = n + 1) {
            final p p = $positionedItems.get(i);
            p.getClass();
            final int size2 = p.m.size();
            p p2 = p;
            int j = 0;
            n = i;
            while (j < size2) {
                final e0 a2 = p2.m.get(j).a;
                final int k = p2.j;
                int n2;
                if (p2.l) {
                    n2 = a2.g;
                }
                else {
                    n2 = a2.f;
                }
                final int n3 = k - n2;
                final int l = p2.k;
                long n5;
                if (p2.c(j) != null) {
                    final LazyGridItemPlacementAnimator n4 = p2.n;
                    final Object d = p2.d;
                    n5 = p2.b;
                    n4.getClass();
                    f.f(d, "key");
                    final e e = n4.d.get(d);
                    if (e != null) {
                        final y y = e.d.get(j);
                        final long a3 = ((g)y.b.d()).a;
                        final long c = e.c;
                        n5 = a.h((int)(a3 >> 32) + (int)(c >> 32), g.b(c) + g.b(a3));
                        final long c2 = y.c;
                        final long c3 = e.c;
                        final int n6 = (int)(c2 >> 32);
                        final int n7 = l;
                        final long h = a.h(n6 + (int)(c3 >> 32), g.b(c3) + g.b(c2));
                        if (((SnapshotMutableStateImpl<Object>)y.d).getValue()) {
                            final int b = n4.b(h);
                            final int n8 = n3;
                            if ((b < n8 && n4.b(n5) < n8) || (n4.b(h) > n7 && n4.b(n5) > n7)) {
                                mj2.g.i(n4.a, (CoroutineContext)null, (CoroutineStart)null, (zg2.p)new LazyGridItemPlacementAnimator$getAnimatedOffset$1(y, null), 3);
                            }
                        }
                    }
                    p2 = p;
                }
                else {
                    n5 = p2.b;
                }
                int b2;
                if (p2.l) {
                    b2 = g.b(n5);
                }
                else {
                    final int c4 = g.c;
                    b2 = (int)(n5 >> 32);
                }
                if (b2 > n3) {
                    int b3;
                    if (p2.l) {
                        b3 = g.b(n5);
                    }
                    else {
                        b3 = (int)(n5 >> 32);
                    }
                    if (b3 < l) {
                        if (p2.l) {
                            final long o = p2.o;
                            e0.a.l(a, a2, a.h((int)(n5 >> 32) + (int)(o >> 32), g.b(o) + g.b(n5)));
                        }
                        else {
                            final long o2 = p2.o;
                            e0.a.h(a, a2, a.h((int)(n5 >> 32) + (int)(o2 >> 32), g.b(o2) + g.b(n5)));
                        }
                    }
                }
                ++j;
            }
        }
    }
}
