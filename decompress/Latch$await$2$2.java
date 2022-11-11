// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import z0.a0;
import mj2.k;
import kotlin.Metadata;
import pg2.j;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "", "it", "Lpg2/j;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class Latch$await$2$2 extends Lambda implements l<Throwable, j>
{
    public final /* synthetic */ k<j> $co;
    public final /* synthetic */ a0 this$0;
    
    public Latch$await$2$2(final a0 this$0, final k<? super j> $co) {
        this.this$0 = this$0;
        this.$co = (k<j>)$co;
        super(1);
    }
    
    public final void invoke(Throwable a) {
        final a0 this$0 = this.this$0;
        a = (Throwable)this$0.a;
        final k<j> $co = this.$co;
        synchronized (a) {
            this$0.b.remove($co);
            final j a2 = j.a;
        }
    }
}
