// 
// Decompiled by Procyon v0.6.0
// 

package com.bef.effectsdk;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;

public final class RequirementResourceMapper
{
    static {
        Covode.recordClassIndex(2806);
    }
    
    public static native String[] nativePeekResourcesNeededByRequirements(final String[] p0);
    
    public static String[] peekResourcesNeededByRequirements(String[] nativePeekResourcesNeededByRequirements) {
        MethodCollector.i(2308);
        nativePeekResourcesNeededByRequirements = nativePeekResourcesNeededByRequirements(nativePeekResourcesNeededByRequirements);
        MethodCollector.o(2308);
        return nativePeekResourcesNeededByRequirements;
    }
}
