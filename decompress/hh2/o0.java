// 
// Decompiled by Procyon v0.6.0
// 

package hh2;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import sg2.e;

public abstract class o0
{
    private final boolean isPublicAPI;
    private final String name;
    
    public o0(final String name, final boolean isPublicAPI) {
        e.f((Object)name, "name");
        this.name = name;
        this.isPublicAPI = isPublicAPI;
    }
    
    public Integer compareTo(final o0 o0) {
        e.f((Object)o0, "visibility");
        final Map a = Visibilities.a;
        Integer n;
        if (this == o0) {
            n = 0;
        }
        else {
            final Map a2 = Visibilities.a;
            final Integer n2 = a2.get(this);
            final Integer n3 = a2.get(o0);
            if (n2 != null && n3 != null && !e.a((Object)n2, (Object)n3)) {
                n = n2 - n3;
            }
            else {
                n = null;
            }
        }
        return n;
    }
    
    public String getInternalDisplayName() {
        return this.name;
    }
    
    public final boolean isPublicAPI() {
        return this.isPublicAPI;
    }
    
    public o0 normalize() {
        return this;
    }
    
    @Override
    public final String toString() {
        return this.getInternalDisplayName();
    }
}
