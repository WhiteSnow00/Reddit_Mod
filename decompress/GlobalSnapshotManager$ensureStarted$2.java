// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import oj2.t;
import ah2.f;
import oj2.e;
import kotlin.Metadata;
import pg2.j;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "", "it", "Lpg2/j;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class GlobalSnapshotManager$ensureStarted$2 extends Lambda implements l<Object, j>
{
    public final /* synthetic */ e<j> $channel;
    
    public GlobalSnapshotManager$ensureStarted$2(final e<j> $channel) {
        this.$channel = $channel;
        super(1);
    }
    
    public final void invoke(final Object o) {
        f.f(o, "it");
        ((t)this.$channel).e((Object)j.a);
    }
}
