// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;

public class ModelnamesAssigner
{
    static {
        Covode.recordClassIndex(2802);
    }
    
    public static native int nativeSetAssignedModelNames(final long p0, final String[] p1, final String[] p2);
    
    public static native int nativeSetAssignedModelNamesWithPriority(final long p0, final String[] p1, final String[] p2, final int[] p3);
    
    public static int setAssignedModelNames(final long n, final String[] array, final String[] array2) {
        MethodCollector.i(2334);
        final int nativeSetAssignedModelNames = nativeSetAssignedModelNames(n, array, array2);
        MethodCollector.o(2334);
        return nativeSetAssignedModelNames;
    }
    
    public static int setAssignedModelNamesWithPriority(final long n, final String[] array, final String[] array2, final int[] array3) {
        MethodCollector.i(2337);
        final int nativeSetAssignedModelNamesWithPriority = nativeSetAssignedModelNamesWithPriority(n, array, array2, array3);
        MethodCollector.o(2337);
        return nativeSetAssignedModelNamesWithPriority;
    }
}
