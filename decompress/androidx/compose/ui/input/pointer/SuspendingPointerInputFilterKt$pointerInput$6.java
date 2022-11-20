// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.input.pointer;

import z0.s;
import z0.d$a;
import androidx.compose.ui.platform.k1;
import z0.m0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import u2.b;
import androidx.compose.runtime.ComposerKt;
import ng2.e;
import cg2.j;
import gg2.c;
import z1.w;
import mg2.p;
import kotlin.Metadata;
import j1.d;
import mg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class SuspendingPointerInputFilterKt$pointerInput$6 extends Lambda implements q<d, z0.d, Integer, d>
{
    public final p<w, c<? super j>, Object> $block;
    public final Object[] $keys;
    
    public SuspendingPointerInputFilterKt$pointerInput$6(final Object[] $keys, final p<? super w, ? super c<? super j>, ?> $block) {
        this.$keys = $keys;
        this.$block = (p<w, c<? super j>, Object>)$block;
        super(3);
    }
    
    public final d invoke(final d d, final z0.d d2, final int n) {
        e.f((Object)d, "$this$composed");
        d2.A(664422852);
        final q a = ComposerKt.a;
        final b b = (b)d2.u((m0)CompositionLocalsKt.e);
        final k1 k1 = (k1)d2.u((m0)CompositionLocalsKt.o);
        d2.A(1157296644);
        final boolean m = d2.m((Object)b);
        final Object b2 = d2.B();
        SuspendingPointerInputFilter suspendingPointerInputFilter;
        if (m || (suspendingPointerInputFilter = (SuspendingPointerInputFilter)b2) == d$a.a) {
            suspendingPointerInputFilter = new SuspendingPointerInputFilter(k1, b);
            d2.w((Object)suspendingPointerInputFilter);
        }
        d2.H();
        final Object[] $keys = this.$keys;
        final p<w, c<? super j>, Object> $block = this.$block;
        final SuspendingPointerInputFilter suspendingPointerInputFilter2 = suspendingPointerInputFilter;
        final cg.j j = new cg.j(2);
        j.p((Object)suspendingPointerInputFilter2);
        j.q((Object)$keys);
        s.g(j.s(new Object[j.r()]), (p)new SuspendingPointerInputFilterKt$pointerInput$6$2$1(suspendingPointerInputFilter2, (p)$block, (c)null), d2);
        d2.H();
        return (d)suspendingPointerInputFilter2;
    }
    
    public /* bridge */ Object invoke(final Object o, final Object o2, final Object o3) {
        return this.invoke((d)o, (z0.d)o2, ((Number)o3).intValue());
    }
}
