// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import z0.e1;
import z0.k;
import b1.d;
import z0.e0;
import z0.g0;
import z0.w0;
import z0.t0;
import z0.y0;
import z0.c;
import zg2.q;
import java.util.List;
import kotlin.Metadata;
import pg2.j;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lpg2/j;", "invoke", "()V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class ComposerImpl$insertMovableContentReferences$1$1$2$1 extends Lambda implements a<j>
{
    public final /* synthetic */ List<q<c<?>, y0, t0, j>> $offsetChanges;
    public final /* synthetic */ w0 $reader;
    public final /* synthetic */ g0 $to;
    public final /* synthetic */ ComposerImpl this$0;
    
    public ComposerImpl$insertMovableContentReferences$1$1$2$1(final ComposerImpl this$0, final List<q<c<?>, y0, t0, j>> $offsetChanges, final w0 $reader, final g0 $to) {
        this.this$0 = this$0;
        this.$offsetChanges = $offsetChanges;
        this.$reader = $reader;
        this.$to = $to;
        super(0);
    }
    
    public final void invoke() {
        final ComposerImpl this$0 = this.this$0;
        final List<q<c<?>, y0, t0, j>> $offsetChanges = this.$offsetChanges;
        final w0 $reader = this.$reader;
        final g0 $to = this.$to;
        final List e = this$0.e;
        w0 d = null;
        Label_0113: {
            int[] n;
            try {
                this$0.e = $offsetChanges;
                d = this$0.D;
                n = this$0.n;
                this$0.n = null;
                final ComposerImpl composerImpl = this$0;
                final w0 w0 = $reader;
                composerImpl.D = w0;
                final ComposerImpl composerImpl2 = this$0;
                final g0 g0 = $to;
                final e0<Object> e2 = g0.a;
                final g0 g2 = $to;
                final d<k<Object>, e1<Object>> d2 = g2.g;
                final g0 g3 = $to;
                final Object o = g3.b;
                final boolean b = true;
                composerImpl2.b0((e0)e2, (d)d2, o, b);
                final j j = pg2.j.a;
                final ComposerImpl composerImpl3 = this$0;
                final w0 w2 = d;
                composerImpl3.D = w2;
                final ComposerImpl composerImpl4 = this$0;
                final int[] array = n;
                composerImpl4.n = array;
                final ComposerImpl composerImpl5 = this$0;
                final List list = e;
                composerImpl5.e = list;
                return;
            }
            finally {
                final w0 w3;
                d = w3;
                break Label_0113;
            }
            try {
                final ComposerImpl composerImpl = this$0;
                final w0 w0 = $reader;
                composerImpl.D = w0;
                final ComposerImpl composerImpl2 = this$0;
                final g0 g0 = $to;
                final e0<Object> e2 = g0.a;
                final g0 g2 = $to;
                final d<k<Object>, e1<Object>> d2 = g2.g;
                final g0 g3 = $to;
                final Object o = g3.b;
                final boolean b = true;
                composerImpl2.b0((e0)e2, (d)d2, o, b);
                final j j = pg2.j.a;
                final ComposerImpl composerImpl3 = this$0;
                final w0 w2 = d;
                composerImpl3.D = w2;
                final ComposerImpl composerImpl4 = this$0;
                final int[] array = n;
                composerImpl4.n = array;
                final ComposerImpl composerImpl5 = this$0;
                final List list = e;
                composerImpl5.e = list;
                return;
            }
            finally {
                this$0.D = d;
                this$0.n = n;
            }
        }
        this$0.e = e;
        throw d;
    }
}
