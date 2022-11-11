// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.channels;

import gj2.t;
import mg2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
@c(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", l = { 84, 88, 94, 96 }, m = "fixedPeriodTicker")
final class TickerChannelsKt$fixedPeriodTicker$1 extends ContinuationImpl
{
    public long J$0;
    public long J$1;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    
    public TickerChannelsKt$fixedPeriodTicker$1(final lg2.c<? super TickerChannelsKt$fixedPeriodTicker$1> c) {
        super((lg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return a.b(0L, 0L, (t)null, (lg2.c)this);
    }
}
