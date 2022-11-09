// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.input.pointer;

import h.s;
import z0.d$a;
import androidx.compose.ui.platform.k1;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import u2.b;
import ah2.f;
import pg2.j;
import tg2.c;
import z1.v;
import zg2.p;
import kotlin.Metadata;
import j1.d;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class SuspendingPointerInputFilterKt$pointerInput$6 extends Lambda implements q<d, z0.d, Integer, d>
{
    public final /* synthetic */ p<v, c<? super j>, Object> $block;
    public final /* synthetic */ Object[] $keys;
    
    public SuspendingPointerInputFilterKt$pointerInput$6(final Object[] $keys, final p<? super v, ? super c<? super j>, ?> $block) {
        this.$keys = $keys;
        this.$block = (p<v, c<? super j>, Object>)$block;
        super(3);
    }
    
    public final d invoke(final d d, final z0.d d2, final int n) {
        f.f((Object)d, "$this$composed");
        d2.A(664422852);
        final b b = (b)d2.t(CompositionLocalsKt.e);
        final k1 k1 = (k1)d2.t(CompositionLocalsKt.o);
        d2.A(1157296644);
        final boolean l = d2.l(b);
        final Object b2 = d2.B();
        SuspendingPointerInputFilter suspendingPointerInputFilter;
        if (l || (suspendingPointerInputFilter = (SuspendingPointerInputFilter)b2) == d$a.a) {
            suspendingPointerInputFilter = new SuspendingPointerInputFilter(k1, b);
            d2.v(suspendingPointerInputFilter);
        }
        d2.I();
        final Object[] $keys = this.$keys;
        final p<v, c<? super j>, Object> $block = this.$block;
        final SuspendingPointerInputFilter suspendingPointerInputFilter2 = suspendingPointerInputFilter;
        final s s = new s(2);
        s.d(suspendingPointerInputFilter2);
        s.f($keys);
        z0.s.g(s.l(new Object[s.k()]), (p)new SuspendingPointerInputFilterKt$pointerInput$6$2.SuspendingPointerInputFilterKt$pointerInput$6$2$1(suspendingPointerInputFilter2, (p)$block, (c)null), d2);
        d2.I();
        return (d)suspendingPointerInputFilter2;
    }
}
