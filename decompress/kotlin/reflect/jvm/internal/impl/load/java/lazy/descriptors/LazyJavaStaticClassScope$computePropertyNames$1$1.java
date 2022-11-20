// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import yh2.e;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mg2.l;
import kotlin.jvm.internal.Lambda;

final class LazyJavaStaticClassScope$computePropertyNames$1$1 extends Lambda implements l<MemberScope, Collection<? extends e>>
{
    public static final LazyJavaStaticClassScope$computePropertyNames$1$1 INSTANCE;
    
    static {
        INSTANCE = new LazyJavaStaticClassScope$computePropertyNames$1$1();
    }
    
    public LazyJavaStaticClassScope$computePropertyNames$1$1() {
        super(1);
    }
    
    public /* bridge */ Object invoke(final Object o) {
        return this.invoke((MemberScope)o);
    }
    
    public final Collection<e> invoke(final MemberScope memberScope) {
        ng2.e.f((Object)memberScope, "it");
        return memberScope.d();
    }
}
