// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 1hv extends a
{
    public final byte[] LIZIZ;
    public int LIZJ;
    
    static {
        Covode.recordClassIndex(4614);
    }
    
    public 1hv(final byte[] liziz) {
        this.LIZIZ = liziz;
    }
    
    @Override
    public final void LIZ(final long n) {
        this.LIZJ += (int)n;
    }
    
    @Override
    public final boolean LIZ() {
        return this.LIZIZ.length - this.LIZJ > 0;
    }
    
    @Override
    public final byte LIZIZ() {
        return this.LIZIZ[this.LIZJ++];
    }
    
    @Override
    public final byte[] LIZIZ(final long n) {
        final int n2 = (int)n;
        final byte[] array = new byte[n2];
        System.arraycopy(this.LIZIZ, this.LIZJ, array, 0, n2);
        this.LIZJ += n2;
        return array;
    }
    
    @Override
    public final String LIZJ(final long n) {
        final String s = new String(this.LIZIZ, this.LIZJ, (int)n, a.LIZ);
        this.LIZJ += (int)n;
        return s;
    }
}
