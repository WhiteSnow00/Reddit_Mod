// 
// Decompiled by Procyon v0.6.0
// 

package wb2;

import com.sendbird.android.GroupChannelListQuery$Order;

public final class b
{
    public static final int[] a;
    
    static {
        final int[] a2 = new int[GroupChannelListQuery$Order.values().length];
        (a = a2)[((Enum)GroupChannelListQuery$Order.LATEST_LAST_MESSAGE).ordinal()] = 1;
        a2[((Enum)GroupChannelListQuery$Order.CHRONOLOGICAL).ordinal()] = 2;
        a2[((Enum)GroupChannelListQuery$Order.CHANNEL_NAME_ALPHABETICAL).ordinal()] = 3;
    }
}
