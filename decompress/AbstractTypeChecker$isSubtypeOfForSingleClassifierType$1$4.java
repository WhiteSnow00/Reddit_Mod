// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.types;

import java.util.Iterator;
import rg2.a;
import sg2.e;
import java.util.List;
import wi2.g;
import hg2.j;
import rg2.l;
import kotlin.jvm.internal.Lambda;

final class AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4 extends Lambda implements l<TypeCheckerState.a, j>
{
    public final /* synthetic */ TypeCheckerState $state;
    public final /* synthetic */ g $superType;
    public final /* synthetic */ List<g> $supertypesWithSameConstructor;
    public final /* synthetic */ wi2.l $this_with;
    
    public AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4(final List<? extends g> $supertypesWithSameConstructor, final TypeCheckerState $state, final wi2.l $this_with, final g $superType) {
        this.$supertypesWithSameConstructor = (List<g>)$supertypesWithSameConstructor;
        this.$state = $state;
        this.$this_with = $this_with;
        this.$superType = $superType;
        super(1);
    }
    
    public final void invoke(final TypeCheckerState.a a) {
        e.f((Object)a, "$this$runForkingPoint");
        final Iterator<g> iterator = this.$supertypesWithSameConstructor.iterator();
        while (iterator.hasNext()) {
            a.a(new a<Boolean>() {
                public final /* synthetic */ TypeCheckerState $state = AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4.this.$state;
                public final /* synthetic */ g $subTypeArguments = iterator.next();
                public final /* synthetic */ g $superType = AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4.this.$superType;
                public final /* synthetic */ wi2.l $this_with = AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4.this.$this_with;
                
                public final Boolean invoke() {
                    return kotlin.reflect.jvm.internal.impl.types.a.h(this.$state, this.$this_with.a0(this.$subTypeArguments), this.$superType);
                }
            });
        }
    }
}
