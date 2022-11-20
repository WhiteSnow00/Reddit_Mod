// 
// Decompiled by Procyon v0.6.0
// 

package vg2;

import kotlin.reflect.KVariance;

public final class a
{
    public static final int[] a;
    
    static {
        final int[] a2 = new int[KVariance.values().length];
        a2[((Enum)KVariance.INVARIANT).ordinal()] = 1;
        a2[((Enum)KVariance.IN).ordinal()] = 2;
        a2[((Enum)KVariance.OUT).ordinal()] = 3;
        a = a2;
    }
}
