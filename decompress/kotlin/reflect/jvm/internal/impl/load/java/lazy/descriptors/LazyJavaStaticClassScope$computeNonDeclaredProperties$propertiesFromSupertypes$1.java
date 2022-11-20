// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import yh2.e;
import ch2.a0;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1 extends Lambda implements l<MemberScope, Collection<? extends a0>>
{
    public final e $name;
    
    public LazyJavaStaticClassScope$computeNonDeclaredProperties$propertiesFromSupertypes$1(final e $name) {
        this.$name = $name;
        super(1);
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((MemberScope)o);
    }
    
    public final Collection<? extends a0> invoke(final MemberScope memberScope) {
        ng2.e.f((Object)memberScope, "it");
        return memberScope.b(this.$name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
    }
}
