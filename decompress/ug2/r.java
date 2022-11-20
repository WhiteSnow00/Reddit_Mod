// 
// Decompiled by Procyon v0.6.0
// 

package ug2;

import ng2.e;
import java.util.Arrays;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

public final class r implements WildcardType, Type
{
    public static final r h;
    public final Type f;
    public final Type g;
    
    static {
        h = new r(null, null);
    }
    
    public r(final Type f, final Type g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof WildcardType) {
            final Type[] upperBounds = this.getUpperBounds();
            final WildcardType wildcardType = (WildcardType)o;
            if (Arrays.equals(upperBounds, wildcardType.getUpperBounds()) && Arrays.equals(this.getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final Type[] getLowerBounds() {
        final Type g = this.g;
        Type[] array;
        if (g == null) {
            array = new Type[0];
        }
        else {
            array = new Type[] { g };
        }
        return array;
    }
    
    @Override
    public final String getTypeName() {
        String s;
        if (this.g != null) {
            final StringBuilder t = a.t("? super ");
            t.append(kotlin.reflect.a.a(this.g));
            s = t.toString();
        }
        else {
            final Type f = this.f;
            if (f != null && !e.a((Object)f, (Object)Object.class)) {
                final StringBuilder t2 = a.t("? extends ");
                t2.append(kotlin.reflect.a.a(this.f));
                s = t2.toString();
            }
            else {
                s = "?";
            }
        }
        return s;
    }
    
    @Override
    public final Type[] getUpperBounds() {
        Type f;
        if ((f = this.f) == null) {
            f = Object.class;
        }
        return new Type[] { f };
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.getUpperBounds()) ^ Arrays.hashCode(this.getLowerBounds());
    }
    
    @Override
    public final String toString() {
        return this.getTypeName();
    }
}
