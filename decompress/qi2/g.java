// 
// Decompiled by Procyon v0.6.0
// 

package qi2;

import kotlin.reflect.jvm.internal.impl.builtins.c;
import ch2.j0;
import java.util.List;
import kotlin.collections.EmptyList;
import oi2.t;
import java.util.Collection;
import m5.a;
import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import ng2.e;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import oi2.l0;

public final class g implements l0
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
        this.c = m5.a.k(new Object[] { m5.a.k((Object[])copy, copy.length, debugMessage, "format(this, *args)") }, 1, debugText, "format(this, *args)");
    }
    
    public final Collection<t> e() {
        return (Collection<t>)EmptyList.INSTANCE;
    }
    
    public final ch2.e f() {
        h.a.getClass();
        return (ch2.e)h.c;
    }
    
    public final boolean g() {
        return false;
    }
    
    public final List<j0> getParameters() {
        return (List<j0>)EmptyList.INSTANCE;
    }
    
    public final c p() {
        final kotlin.reflect.jvm.internal.impl.builtins.a f = kotlin.reflect.jvm.internal.impl.builtins.a.f;
        return (c)kotlin.reflect.jvm.internal.impl.builtins.a.f;
    }
    
    @Override
    public final String toString() {
        return this.c;
    }
}
