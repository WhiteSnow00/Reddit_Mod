// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.android;

import kotlin.Metadata;
import hg2.j;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004" }, d2 = { "", "it", "Lhg2/j;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class HandlerContext$scheduleResumeAfterDelay$1 extends Lambda implements l<Throwable, j>
{
    public final /* synthetic */ Runnable $block;
    public final /* synthetic */ a this$0;
    
    public HandlerContext$scheduleResumeAfterDelay$1(final a this$0, final Runnable $block) {
        this.this$0 = this$0;
        this.$block = $block;
        super(1);
    }
    
    public final void invoke(final Throwable t) {
        this.this$0.h.removeCallbacks(this.$block);
    }
}
