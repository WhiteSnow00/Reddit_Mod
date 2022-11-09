// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import a1.b;
import z0.n;
import z0.i;
import z0.r0;
import a1.a;
import kotlin.Metadata;
import pg2.j;
import z0.f;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "Lz0/f;", "composition", "Lpg2/j;", "invoke", "(Lz0/f;)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class RecomposeScopeImpl$end$1$2 extends Lambda implements l<f, j>
{
    public final /* synthetic */ a $instances;
    public final /* synthetic */ int $token;
    public final /* synthetic */ r0 this$0;
    
    public RecomposeScopeImpl$end$1$2(final r0 this$0, final int $token, final a $instances) {
        this.this$0 = this$0;
        this.$token = $token;
        this.$instances = $instances;
        super(1);
    }
    
    public final void invoke(final f f) {
        ah2.f.f((Object)f, "composition");
        final r0 this$0 = this.this$0;
        if (this$0.e == this.$token && ah2.f.a((Object)this.$instances, (Object)this$0.f) && f instanceof i) {
            final a $instances = this.$instances;
            final int $token = this.$token;
            final r0 this$2 = this.this$0;
            final int a = $instances.a;
            int i = 0;
            int a2 = 0;
            while (i < a) {
                final Object o = $instances.b[i];
                if (o == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                }
                final int n = $instances.c[i];
                final boolean b = n != $token;
                if (b) {
                    final i j = (i)f;
                    ah2.f.f((Object)this$2, "scope");
                    j.l.d(o, this$2);
                    n n2;
                    if (o instanceof n) {
                        n2 = (n)o;
                    }
                    else {
                        n2 = null;
                    }
                    if (n2 != null) {
                        if (!j.l.b(n2)) {
                            j.n.e(n2);
                        }
                        final b g = this$2.g;
                        if (g != null) {
                            final int a3 = g.a(n2);
                            if (a3 >= 0) {
                                final int a4 = g.a;
                                final Object[] array = (Object[])g.b;
                                final Object[] array2 = (Object)g.c;
                                final int n3 = a3 + 1;
                                qg2.j.j1(array, a3, array, n3, a4);
                                qg2.j.j1(array2, a3, array2, n3, a4);
                                final int a5 = a4 - 1;
                                array2[a5] = (array[a5] = null);
                                g.a = a5;
                            }
                            if (g.a == 0) {
                                this$2.g = null;
                            }
                        }
                    }
                }
                int n4 = a2;
                if (!b) {
                    if (a2 != i) {
                        $instances.b[a2] = o;
                        $instances.c[a2] = n;
                    }
                    n4 = a2 + 1;
                }
                ++i;
                a2 = n4;
            }
            for (int a6 = $instances.a, k = a2; k < a6; ++k) {
                $instances.b[k] = null;
            }
            $instances.a = a2;
            if (this.$instances.a == 0) {
                this.this$0.f = null;
            }
        }
    }
}
