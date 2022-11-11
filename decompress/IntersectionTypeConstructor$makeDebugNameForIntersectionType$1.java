// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.types;

import sg2.e;
import ti2.t;
import rg2.l;
import kotlin.jvm.internal.Lambda;

final class IntersectionTypeConstructor$makeDebugNameForIntersectionType$1 extends Lambda implements l<t, String>
{
    public static final IntersectionTypeConstructor$makeDebugNameForIntersectionType$1 INSTANCE;
    
    static {
        INSTANCE = new IntersectionTypeConstructor$makeDebugNameForIntersectionType$1();
    }
    
    public IntersectionTypeConstructor$makeDebugNameForIntersectionType$1() {
        super(1);
    }
    
    public final String invoke(final t t) {
        e.f((Object)t, "it");
        return t.toString();
    }
}
