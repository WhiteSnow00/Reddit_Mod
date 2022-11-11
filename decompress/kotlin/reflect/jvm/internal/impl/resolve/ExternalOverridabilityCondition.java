// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.resolve;

import hh2.c;
import kotlin.reflect.jvm.internal.impl.descriptors.a;

public interface ExternalOverridabilityCondition
{
    Result a(final a p0, final a p1, final c p2);
    
    Contract b();
    
    public enum Contract
    {
        BOTH, 
        CONFLICTS_ONLY, 
        SUCCESS_ONLY;
    }
    
    public enum Result
    {
        CONFLICT, 
        INCOMPATIBLE, 
        OVERRIDABLE, 
        UNKNOWN;
    }
}
