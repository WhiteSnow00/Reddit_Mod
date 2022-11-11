// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.channels;

import gj2.t;
import mg2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 6, 0 }, xi = 48)
@c(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", l = { 106, 108, 109 }, m = "fixedDelayTicker")
final class TickerChannelsKt$fixedDelayTicker$1 extends ContinuationImpl
{
    public long J$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    
    public TickerChannelsKt$fixedDelayTicker$1(final lg2.c<? super TickerChannelsKt$fixedDelayTicker$1> c) {
        super((lg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return a.a(0L, 0L, (t)null, (lg2.c)this);
    }
}
