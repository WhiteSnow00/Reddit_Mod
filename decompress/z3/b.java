// 
// Decompiled by Procyon v0.6.0
// 

package z3;

import java.util.Objects;

public final class b
{
    public static boolean a(final Object o, final Object o2) {
        return Objects.equals(o, o2);
    }
    
    public static int b(final Object... array) {
        return Objects.hash(array);
    }
}
