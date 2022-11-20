// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import ng2.e;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import ch2.a0;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class TypeIntersectionScope$getContributedVariables$1 extends Lambda implements l<a0, a>
{
    public static final TypeIntersectionScope$getContributedVariables$1 INSTANCE;
    
    static {
        INSTANCE = new TypeIntersectionScope$getContributedVariables$1();
    }
    
    public TypeIntersectionScope$getContributedVariables$1() {
        super(1);
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((a0)o);
    }
    
    public final a invoke(final a0 a0) {
        e.f((Object)a0, "$this$selectMostSpecificInEachOverridableGroup");
        return (a)a0;
    }
}
