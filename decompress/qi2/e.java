// 
// Decompiled by Procyon v0.6.0
// 

package qi2;

import kotlin.collections.EmptyList;
import ch2.g;
import mg2.l;
import hi2.d;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.collections.EmptySet;
import java.util.Set;
import m5.a;
import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

public class e implements MemberScope
{
    public final String b;
    
    public e(final ErrorScopeKind errorScopeKind, final String... array) {
        ng2.e.f((Object)errorScopeKind, "kind");
        ng2.e.f((Object)array, "formatParams");
        final String debugMessage = errorScopeKind.getDebugMessage();
        final String[] copy = Arrays.copyOf(array, array.length);
        this.b = a.k((Object[])copy, copy.length, debugMessage, "format(this, *args)");
    }
    
    public Set<yh2.e> a() {
        return (Set<yh2.e>)EmptySet.INSTANCE;
    }
    
    public /* bridge */ Collection b(final yh2.e e, final NoLookupLocation noLookupLocation) {
        return this.i(e, noLookupLocation);
    }
    
    public /* bridge */ Collection c(final yh2.e e, final NoLookupLocation noLookupLocation) {
        return this.h(e, noLookupLocation);
    }
    
    public Set<yh2.e> d() {
        return (Set<yh2.e>)EmptySet.INSTANCE;
    }
    
    public ch2.e e(final yh2.e e, final NoLookupLocation noLookupLocation) {
        e.f((Object)e, "name");
        e.f((Object)noLookupLocation, "location");
        final String format = String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[] { e }, 1));
        e.e((Object)format, "format(this, *args)");
        return (ch2.e)new qi2.a(yh2.e.i(format));
    }
    
    public Set<yh2.e> f() {
        return (Set<yh2.e>)EmptySet.INSTANCE;
    }
    
    public Collection<g> g(final d d, final l<? super yh2.e, Boolean> l) {
        ng2.e.f((Object)d, "kindFilter");
        ng2.e.f((Object)l, "nameFilter");
        return (Collection<g>)EmptyList.INSTANCE;
    }
    
    public Set h(final yh2.e e, final NoLookupLocation noLookupLocation) {
        e.f((Object)e, "name");
        e.f((Object)noLookupLocation, "location");
        return zd.b.a1(new b(h.c));
    }
    
    public Set i(final yh2.e e, final NoLookupLocation noLookupLocation) {
        e.f((Object)e, "name");
        e.f((Object)noLookupLocation, "location");
        return h.f;
    }
    
    @Override
    public String toString() {
        return p1.h.c(a.t("ErrorScope{"), this.b, '}');
    }
}
