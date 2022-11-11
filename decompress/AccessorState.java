// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import kotlin.Metadata;
import ig2.h;
import c5.k;

public final class AccessorState<Key, Value>
{
    public AccessorState() {
        final int length = LoadType.values().length;
        final BlockState[] array = new BlockState[length];
        final int n = 0;
        for (int i = 0; i < length; ++i) {
            array[i] = BlockState.UNBLOCKED;
        }
        final int length2 = LoadType.values().length;
        final k.a[] array2 = new k.a[length2];
        for (int j = n; j < length2; ++j) {
            array2[j] = null;
        }
        new h();
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Landroidx/paging/AccessorState$BlockState;", "", "(Ljava/lang/String;I)V", "UNBLOCKED", "COMPLETED", "REQUIRES_REFRESH", "paging-common" }, k = 1, mv = { 1, 5, 1 }, xi = 48)
    public enum BlockState
    {
        COMPLETED, 
        REQUIRES_REFRESH, 
        UNBLOCKED;
    }
}
