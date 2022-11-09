// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 1go extends 181
{
    public long LIZIZ;
    public final 181 LIZJ;
    
    static {
        Covode.recordClassIndex(1888);
    }
    
    public 1go(final 181 lizj) {
        CTM.LIZ((Object)lizj);
        this.LIZJ = lizj;
    }
    
    @Override
    public final void LIZ() {
        this.LIZJ.LIZ();
    }
    
    @Override
    public final void LIZ(final byte[] array, final int n, final int n2) {
        CTM.LIZ((Object)array);
        this.LIZJ.LIZ(array, n, n2);
        this.LIZIZ += n2;
    }
    
    @Override
    public final void LIZJ() {
        this.LIZJ.LIZJ();
    }
}
