// 
// Decompiled by Procyon v0.6.0
// 

package ti2;

import kotlin.reflect.jvm.internal.impl.types.Variance;

public abstract class o0 implements n0
{
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof n0)) {
            return false;
        }
        final n0 n0 = (n0)o;
        return ((n0)this).b() == n0.b() && ((n0)this).c() == n0.c() && ((n0)this).getType().equals((Object)n0.getType());
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = ((n0)this).c().hashCode();
        int n;
        if (t0.p(((n0)this).getType())) {
            n = hashCode * 31 + 19;
        }
        else {
            int hashCode2;
            if (((n0)this).b()) {
                hashCode2 = 17;
            }
            else {
                hashCode2 = ((n0)this).getType().hashCode();
            }
            n = hashCode * 31 + hashCode2;
        }
        return n;
    }
    
    @Override
    public final String toString() {
        if (((n0)this).b()) {
            return "*";
        }
        if (((n0)this).c() == Variance.INVARIANT) {
            return ((n0)this).getType().toString();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(((n0)this).c());
        sb.append(" ");
        sb.append(((n0)this).getType());
        return sb.toString();
    }
}
