// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import z0.s;
import z0.q;
import zg2.l;
import ah2.f;
import kotlin.Metadata;
import pg2.j;
import z0.d;
import zg2.p;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lpg2/j;", "invoke", "(Lz0/d;I)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1 extends Lambda implements p<d, Integer, j>
{
    public final /* synthetic */ a this$0;
    public final /* synthetic */ a.a this$1;
    
    public LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1(final a this$0, final a.a this$2) {
        this.this$0 = this$0;
        this.this$1 = this$2;
        super(2);
    }
    
    public final void invoke(final d d, int n) {
        if ((n & 0xB) == 0x2 && d.b()) {
            d.j();
        }
        else {
            final s0.d d2 = (s0.d)this.this$0.b.invoke();
            final Integer n2 = d2.d().get(this.this$1.a);
            if (n2 != null) {
                final a.a this$1 = this.this$1;
                n = n2.intValue();
                ((SnapshotMutableStateImpl<Integer>)this$1.c).setValue(Integer.valueOf(n));
                n = n2.intValue();
            }
            else {
                n = ((SnapshotMutableStateImpl<Number>)this.this$1.c).getValue().intValue();
            }
            d.A(-715769699);
            if (n < d2.K0()) {
                final Object a = d2.a(n);
                if (f.a(a, this.this$1.a)) {
                    this.this$0.a.a(a, (p)at1.a.a0(d, -1238863364, (Lambda)new p<d, Integer, j>() {
                        public final void invoke(final d d, final int n) {
                            if ((n & 0xB) == 0x2 && d.b()) {
                                d.j();
                            }
                            else {
                                d2.f(n, d, 0);
                            }
                        }
                    }), d, 568);
                }
            }
            d.I();
            final a.a this$2 = this.this$1;
            s.c(this$2.a, (l)new l<q, z0.p>() {
                public final z0.p invoke(final q q) {
                    f.f((Object)q, "$this$DisposableEffect");
                    return (z0.p)new LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1$2$a(this$2);
                }
            }, d);
        }
    }
}
