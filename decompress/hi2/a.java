// 
// Decompiled by Procyon v0.6.0
// 

package hi2;

import ch2.g;
import mg2.l;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import yh2.e;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

public abstract class a implements MemberScope
{
    public final Set<e> a() {
        return this.i().a();
    }
    
    public Collection b(final e e, final NoLookupLocation noLookupLocation) {
        ng2.e.f((Object)e, "name");
        ng2.e.f((Object)noLookupLocation, "location");
        return this.i().b(e, noLookupLocation);
    }
    
    public Collection c(final e e, final NoLookupLocation noLookupLocation) {
        ng2.e.f((Object)e, "name");
        ng2.e.f((Object)noLookupLocation, "location");
        return this.i().c(e, noLookupLocation);
    }
    
    public final Set<e> d() {
        return this.i().d();
    }
    
    public final ch2.e e(final e e, final NoLookupLocation noLookupLocation) {
        ng2.e.f((Object)e, "name");
        ng2.e.f((Object)noLookupLocation, "location");
        return ((h)this.i()).e(e, noLookupLocation);
    }
    
    public final Set<e> f() {
        return this.i().f();
    }
    
    public Collection<g> g(final d d, final l<? super e, Boolean> l) {
        ng2.e.f((Object)d, "kindFilter");
        ng2.e.f((Object)l, "nameFilter");
        return ((h)this.i()).g(d, (l)l);
    }
    
    public final MemberScope h() {
        MemberScope memberScope;
        if (this.i() instanceof a) {
            final MemberScope i = this.i();
            ng2.e.d((Object)i, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
            memberScope = ((a)i).h();
        }
        else {
            memberScope = this.i();
        }
        return memberScope;
    }
    
    public abstract MemberScope i();
}
