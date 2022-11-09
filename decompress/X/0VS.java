// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class 0Vs implements Serializable, Cloneable
{
    public static final long serialVersionUID = -6437800749411518984L;
    public final String LIZ;
    public final String LIZIZ;
    
    static {
        Covode.recordClassIndex(4913);
    }
    
    public 0Vs(final String liz, final String liziz) {
        if (liz != null) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
    
    public final Object clone() {
        return super.clone();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof 0Vs) {
            final 0Vs 0Vs = (0Vs)o;
            if (this.LIZ.equals(0Vs.LIZ) && HaN.LIZ((Object)this.LIZIZ, (Object)0Vs.LIZIZ)) {
                return true;
            }
        }
        return false;
    }
    
    public final String getName() {
        return this.LIZ;
    }
    
    public final String getValue() {
        return this.LIZIZ;
    }
    
    @Override
    public final int hashCode() {
        return HaN.LIZ(HaN.LIZ(17, (Object)this.LIZ), (Object)this.LIZIZ);
    }
    
    @Override
    public final String toString() {
        if (this.LIZIZ == null) {
            return this.LIZ;
        }
        final StringBuilder sb = new StringBuilder(this.LIZ.length() + 1 + this.LIZIZ.length());
        sb.append(this.LIZ);
        sb.append("=");
        sb.append(this.LIZIZ);
        return sb.toString();
    }
}
