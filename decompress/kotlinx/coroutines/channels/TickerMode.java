// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.channels;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005" }, d2 = { "Lkotlinx/coroutines/channels/TickerMode;", "", "(Ljava/lang/String;I)V", "FIXED_PERIOD", "FIXED_DELAY", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public enum TickerMode
{
    private static final TickerMode[] $VALUES;
    
    FIXED_DELAY, 
    FIXED_PERIOD;
    
    private static final TickerMode[] $values() {
        return new TickerMode[] { TickerMode.FIXED_PERIOD, TickerMode.FIXED_DELAY };
    }
    
    static {
        $VALUES = $values();
    }
}
