// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import ah2.f;

public final class b implements l
{
    public final int a;
    
    public b() {
        this.a = 1008;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        Class<?> class1;
        if (o != null) {
            class1 = o.getClass();
        }
        else {
            class1 = null;
        }
        if (!f.a((Object)b.class, (Object)class1)) {
            return false;
        }
        if (o != null) {
            return this.a == ((b)o).a;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        return d.k(a.k("AndroidPointerIcon(type="), this.a, ')');
    }
}
