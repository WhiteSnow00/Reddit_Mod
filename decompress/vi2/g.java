// 
// Decompiled by Procyon v0.6.0
// 

package vi2;

import kotlin.reflect.jvm.internal.impl.builtins.a;
import kotlin.reflect.jvm.internal.impl.builtins.c;
import hh2.j0;
import java.util.List;
import kotlin.collections.EmptyList;
import ti2.t;
import java.util.Collection;
import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import sg2.e;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import ti2.k0;

public final class g implements k0
{
    public final ErrorTypeKind a;
    public final String[] b;
    public final String c;
    
    public g(final ErrorTypeKind a, final String... b) {
        e.f((Object)a, "kind");
        e.f((Object)b, "formatParams");
        this.a = a;
        this.b = b;
        final String debugText = ErrorEntity.ERROR_TYPE.getDebugText();
        final String debugMessage = a.getDebugMessage();
        final String[] copy = Arrays.copyOf(b, b.length);
        this.c = a81.e.p(new Object[] { a81.e.p((Object[])copy, copy.length, debugMessage, "format(this, *args)") }, 1, debugText, "format(this, *args)");
    }
    
    public final Collection<t> e() {
        return (Collection<t>)EmptyList.INSTANCE;
    }
    
    public final hh2.e f() {
        h.a.getClass();
        return (hh2.e)h.c;
    }
    
    public final boolean g() {
        return false;
    }
    
    public final List<j0> getParameters() {
        return (List<j0>)EmptyList.INSTANCE;
    }
    
    public final c o() {
        final a f = kotlin.reflect.jvm.internal.impl.builtins.a.f;
        return (c)kotlin.reflect.jvm.internal.impl.builtins.a.f;
    }
    
    @Override
    public final String toString() {
        return this.c;
    }
}
