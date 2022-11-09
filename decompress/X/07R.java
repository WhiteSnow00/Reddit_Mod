// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Objects;
import com.bytedance.covode.number.Covode;

public class 07R<F, S>
{
    public final F LIZ;
    public final S LIZIZ;
    
    static {
        Covode.recordClassIndex(796);
    }
    
    public 07R(final F liz, final S liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public static <A, B> 07R<A, B> LIZ(final A a, final B b) {
        return new 07R<A, B>(a, b);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof 07R)) {
            return false;
        }
        final 07R 07R = (07R)o;
        return Objects.equals(07R.LIZ, this.LIZ) && Objects.equals(07R.LIZIZ, this.LIZIZ);
    }
    
    @Override
    public int hashCode() {
        final F liz = this.LIZ;
        int hashCode = 0;
        int hashCode2;
        if (liz == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = liz.hashCode();
        }
        final S liziz = this.LIZIZ;
        if (liziz != null) {
            hashCode = liziz.hashCode();
        }
        return hashCode2 ^ hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pair{");
        sb.append(String.valueOf(this.LIZ));
        sb.append(" ");
        sb.append(String.valueOf(this.LIZIZ));
        sb.append("}");
        return sb.toString();
    }
}
