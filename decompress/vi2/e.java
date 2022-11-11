// 
// Decompiled by Procyon v0.6.0
// 

package vi2;

import al0.f0;
import a4.a0;
import kotlin.collections.EmptyList;
import hh2.g;
import rg2.l;
import mi2.d;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.collections.EmptySet;
import java.util.Set;
import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

public class e implements MemberScope
{
    public final String b;
    
    public e(final ErrorScopeKind errorScopeKind, final String... array) {
        sg2.e.f((Object)errorScopeKind, "kind");
        sg2.e.f((Object)array, "formatParams");
        final String debugMessage = errorScopeKind.getDebugMessage();
        final String[] copy = Arrays.copyOf(array, array.length);
        this.b = a81.e.p((Object[])copy, copy.length, debugMessage, "format(this, *args)");
    }
    
    public Set<di2.e> a() {
        return (Set<di2.e>)EmptySet.INSTANCE;
    }
    
    public Set<di2.e> d() {
        return (Set<di2.e>)EmptySet.INSTANCE;
    }
    
    public hh2.e e(final di2.e e, final NoLookupLocation noLookupLocation) {
        e.f((Object)e, "name");
        e.f((Object)noLookupLocation, "location");
        final String format = String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[] { e }, 1));
        e.e((Object)format, "format(this, *args)");
        return (hh2.e)new a(di2.e.i(format));
    }
    
    public Set<di2.e> f() {
        return (Set<di2.e>)EmptySet.INSTANCE;
    }
    
    public Collection<g> g(final d d, final l<? super di2.e, Boolean> l) {
        sg2.e.f((Object)d, "kindFilter");
        sg2.e.f((Object)l, "nameFilter");
        return (Collection<g>)EmptyList.INSTANCE;
    }
    
    public Set h(final di2.e e, final NoLookupLocation noLookupLocation) {
        e.f((Object)e, "name");
        e.f((Object)noLookupLocation, "location");
        return a0.A0(new b(h.c));
    }
    
    public Set i(final di2.e e, final NoLookupLocation noLookupLocation) {
        e.f((Object)e, "name");
        e.f((Object)noLookupLocation, "location");
        return h.f;
    }
    
    @Override
    public String toString() {
        return f0.n(a.r("ErrorScope{"), this.b, '}');
    }
}
