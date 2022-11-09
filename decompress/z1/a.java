// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import ah2.f;

public final class a implements l
{
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
        if (!f.a((Object)a.class, (Object)class1)) {
            return false;
        }
        if (o != null) {
            final a a = (a)o;
            return f.a((Object)null, (Object)null);
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
    }
    
    @Override
    public final int hashCode() {
        throw null;
    }
    
    @Override
    public final String toString() {
        return "AndroidPointerIcon(pointerIcon=null)";
    }
}
