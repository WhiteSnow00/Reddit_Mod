// 
// Decompiled by Procyon v0.6.0
// 

package qi2;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import oi2.l0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import zd.b;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import ng2.e;
import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import ch2.a0;
import java.util.Set;

public final class h
{
    public static final h a;
    public static final c b;
    public static final a c;
    public static final f d;
    public static final f e;
    public static final Set<a0> f;
    
    static {
        a = new h();
        b = qi2.c.f;
        final String format = String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[] { "unknown class" }, 1));
        ng2.e.e((Object)format, "format(this, *args)");
        c = new a(yh2.e.i(format));
        d = c(ErrorTypeKind.CYCLIC_SUPERTYPES, new String[0]);
        e = c(ErrorTypeKind.ERROR_PROPERTY_TYPE, new String[0]);
        f = zd.b.a1(new d());
    }
    
    public static final qi2.e a(final ErrorScopeKind errorScopeKind, final boolean b, final String... array) {
        ng2.e.f((Object)errorScopeKind, "kind");
        ng2.e.f((Object)array, "formatParams");
        Object o;
        if (b) {
            o = new i(errorScopeKind, (String[])Arrays.copyOf(array, array.length));
        }
        else {
            o = new qi2.e(errorScopeKind, (String[])Arrays.copyOf(array, array.length));
        }
        return (qi2.e)o;
    }
    
    public static final qi2.e b(final ErrorScopeKind errorScopeKind, final String... array) {
        ng2.e.f((Object)errorScopeKind, "kind");
        return a(errorScopeKind, false, (String[])Arrays.copyOf(array, array.length));
    }
    
    public static final f c(final ErrorTypeKind errorTypeKind, String... array) {
        ng2.e.f((Object)errorTypeKind, "kind");
        final EmptyList instance = EmptyList.INSTANCE;
        array = Arrays.copyOf(array, array.length);
        ng2.e.f((Object)instance, "arguments");
        ng2.e.f((Object)array, "formatParams");
        return e(errorTypeKind, (List)instance, (l0)d(errorTypeKind, (String[])Arrays.copyOf(array, array.length)), (String[])Arrays.copyOf(array, array.length));
    }
    
    public static g d(final ErrorTypeKind errorTypeKind, final String... array) {
        ng2.e.f((Object)errorTypeKind, "kind");
        ng2.e.f((Object)array, "formatParams");
        return new g(errorTypeKind, (String[])Arrays.copyOf(array, array.length));
    }
    
    public static f e(final ErrorTypeKind errorTypeKind, final List list, final l0 l0, final String... array) {
        ng2.e.f((Object)errorTypeKind, "kind");
        ng2.e.f((Object)list, "arguments");
        ng2.e.f((Object)array, "formatParams");
        return new f(l0, (MemberScope)b(ErrorScopeKind.ERROR_TYPE_SCOPE, l0.toString()), errorTypeKind, list, false, (String[])Arrays.copyOf(array, array.length));
    }
    
    public static final boolean f(final ch2.g g) {
        return g != null && (g instanceof a || g.b() instanceof a || g == h.b);
    }
}
