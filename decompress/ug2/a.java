// 
// Decompiled by Procyon v0.6.0
// 

package ug2;

import ng2.e;
import java.lang.reflect.Type;
import java.lang.reflect.GenericArrayType;

public final class a implements GenericArrayType, Type
{
    public final Type f;
    
    public a(final Type f) {
        e.f((Object)f, "elementType");
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof GenericArrayType && e.a((Object)this.f, (Object)((GenericArrayType)o).getGenericComponentType());
    }
    
    @Override
    public final Type getGenericComponentType() {
        return this.f;
    }
    
    @Override
    public final String getTypeName() {
        final StringBuilder sb = new StringBuilder();
        sb.append(kotlin.reflect.a.a(this.f));
        sb.append("[]");
        return sb.toString();
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.getTypeName();
    }
}
