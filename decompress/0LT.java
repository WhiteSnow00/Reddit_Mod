// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Arrays;
import com.bytedance.covode.number.Covode;

public final class 0LT<V>
{
    public final V LIZ;
    public final Throwable LIZIZ;
    
    static {
        Covode.recordClassIndex(2458);
    }
    
    public 0LT(final V liz) {
        this.LIZ = liz;
    }
    
    public 0LT(final Throwable liziz) {
        this.LIZIZ = liziz;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof 0LT)) {
            return false;
        }
        final 0LT 0lt = (0LT)o;
        final V liz = this.LIZ;
        if (liz != null && liz.equals(0lt.LIZ)) {
            return true;
        }
        final Throwable liziz = this.LIZIZ;
        return liziz != null && 0lt.LIZIZ != null && liziz.toString().equals(this.LIZIZ.toString());
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.LIZ, this.LIZIZ });
    }
}
