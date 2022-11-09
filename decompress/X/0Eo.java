// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Objects;
import com.bytedance.covode.number.Covode;

public final class 0eO
{
    public final Object LIZ;
    
    static {
        Covode.recordClassIndex(5960);
    }
    
    public 0eO(final Object liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && Objects.equals(this.LIZ, ((0eO)o).LIZ));
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
