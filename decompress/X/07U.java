// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 07u
{
    public final Object LIZ;
    
    static {
        Covode.recordClassIndex(842);
    }
    
    public 07u(final Object liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final 07u 07u = (07u)o;
        final Object liz = this.LIZ;
        if (liz == null) {
            return 07u.LIZ == null;
        }
        return liz.equals(07u.LIZ);
    }
    
    @Override
    public final int hashCode() {
        final Object liz = this.LIZ;
        if (liz == null) {
            return 0;
        }
        return liz.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("DisplayCutoutCompat{");
        sb.append(this.LIZ);
        sb.append("}");
        return sb.toString();
    }
}
