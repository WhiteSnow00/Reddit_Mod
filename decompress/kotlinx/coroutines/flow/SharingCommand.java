// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002?\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005?\u0006\u0006" }, d2 = { "Lkotlinx/coroutines/flow/SharingCommand;", "", "(Ljava/lang/String;I)V", "START", "STOP", "STOP_AND_RESET_REPLAY_CACHE", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 6, 0 }, xi = 48)
public enum SharingCommand
{
    private static final SharingCommand[] $VALUES;
    
    START, 
    STOP, 
    STOP_AND_RESET_REPLAY_CACHE;
    
    private static final SharingCommand[] $values() {
        return new SharingCommand[] { SharingCommand.START, SharingCommand.STOP, SharingCommand.STOP_AND_RESET_REPLAY_CACHE };
    }
    
    static {
        $VALUES = $values();
    }
}
