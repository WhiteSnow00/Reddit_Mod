// 
// Decompiled by Procyon v0.6.0
// 

package y50;

import com.reddit.domain.model.Multireddit$Visibility;

public final class e0
{
    public static final int[] a;
    
    static {
        final int[] a2 = new int[Multireddit$Visibility.values().length];
        a2[((Enum)Multireddit$Visibility.PUBLIC).ordinal()] = 1;
        a2[((Enum)Multireddit$Visibility.PRIVATE).ordinal()] = 2;
        a2[((Enum)Multireddit$Visibility.HIDDEN).ordinal()] = 3;
        a = a2;
    }
}
