// 
// Decompiled by Procyon v0.6.0
// 

package ra;

import ma.b;

public final class i implements b<e>
{
    public final Object get() {
        final a a = e.a;
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
