// 
// Decompiled by Procyon v0.6.0
// 

package ti2;

import kotlin.reflect.jvm.internal.impl.descriptors.d;

public interface e
{
    String a(final d p0);
    
    boolean b(final d p0);
    
    String getDescription();
    
    public static final class a
    {
        public static String a(final e e, final d d) {
            e.f((Object)d, "functionDescriptor");
            String description;
            if (!e.b(d)) {
                description = e.getDescription();
            }
            else {
                description = null;
            }
            return description;
        }
    }
}
