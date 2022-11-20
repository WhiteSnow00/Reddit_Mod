// 
// Decompiled by Procyon v0.6.0
// 

package wg2;

import kotlin.reflect.jvm.internal.pcollections.a;

public final class c
{
    public static a<String, Object> a;
    
    static {
        final a c = kotlin.reflect.jvm.internal.pcollections.a.c;
        if (c != null) {
            wg2.c.a = (a<String, Object>)c;
            return;
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/pcollections/HashPMap", "empty"));
    }
}
