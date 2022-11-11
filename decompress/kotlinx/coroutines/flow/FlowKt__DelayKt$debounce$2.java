// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import kotlin.Metadata;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005" }, d2 = { "<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Long;" }, k = 3, mv = { 1, 6, 0 }, xi = 48)
final class FlowKt__DelayKt$debounce$2 extends Lambda implements l<Object, Long>
{
    public final /* synthetic */ long $timeoutMillis;
    
    public FlowKt__DelayKt$debounce$2(final long $timeoutMillis) {
        this.$timeoutMillis = $timeoutMillis;
        super(1);
    }
    
    public final Long invoke(final Object o) {
        return this.$timeoutMillis;
    }
}
