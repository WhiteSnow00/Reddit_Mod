// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.types.checker;

import rg2.l;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ti2.x;
import java.util.Set;
import rg2.a;
import kotlin.jvm.internal.Lambda;

final class TypeIntersector$intersectTypesWithoutIntersectionType$errorMessage$1 extends Lambda implements a<String>
{
    public final /* synthetic */ Set<x> $inputTypes;
    
    public TypeIntersector$intersectTypesWithoutIntersectionType$errorMessage$1(final Set<? extends x> $inputTypes) {
        this.$inputTypes = (Set<x>)$inputTypes;
        super(0);
    }
    
    public final String invoke() {
        final StringBuilder r = a.r("This collections cannot be empty! input types: ");
        r.append(CollectionsKt___CollectionsKt.I3((Iterable)this.$inputTypes, (CharSequence)null, (String)null, (String)null, (l)null, 63));
        return r.toString();
    }
}
