// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import ng2.e;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class TypeIntersectionScope$getContributedFunctions$1 extends Lambda implements l<f, a>
{
    public static final TypeIntersectionScope$getContributedFunctions$1 INSTANCE;
    
    static {
        INSTANCE = new TypeIntersectionScope$getContributedFunctions$1();
    }
    
    public TypeIntersectionScope$getContributedFunctions$1() {
        super(1);
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((f)o);
    }
    
    public final a invoke(final f f) {
        e.f((Object)f, "$this$selectMostSpecificInEachOverridableGroup");
        return (a)f;
    }
}
