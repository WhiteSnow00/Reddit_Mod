// 
// Decompiled by Procyon v0.6.0
// 

package ti2;

import kotlin.reflect.jvm.internal.impl.builtins.e$a;
import di2.c;
import rg2.l;

public final class s0 implements l<c, Boolean>
{
    @Override
    public final Object invoke(final Object o) {
        final c c = (c)o;
        if (c != null) {
            return c.equals((Object)e$a.y) ^ true;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
    }
}
