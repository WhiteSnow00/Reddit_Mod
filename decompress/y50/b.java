// 
// Decompiled by Procyon v0.6.0
// 

package y50;

import com.reddit.type.CustomizationFlag;
import com.reddit.type.ImagePosition;

public final class b
{
    public static final int[] a;
    public static final int[] b;
    
    static {
        final int[] a2 = new int[ImagePosition.values().length];
        a2[((Enum)ImagePosition.TILED).ordinal()] = 1;
        a2[((Enum)ImagePosition.COVER).ordinal()] = 2;
        a = a2;
        final int[] b2 = new int[CustomizationFlag.values().length];
        b2[((Enum)CustomizationFlag.CUSTOM).ordinal()] = 1;
        b = b2;
    }
}
