// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 1Ht<V> extends a<V>
{
    public 15z<Boolean> LIZ;
    public 15z<Boolean> LIZIZ;
    
    static {
        Covode.recordClassIndex(5822);
    }
    
    public 1Ht(final 15z<Boolean> liz, final 15z<Boolean> liziz) {
        this.LIZ = new 15z<Boolean>();
        this.LIZIZ = new 15z<Boolean>();
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    @Override
    public final void LIZ() {
        super.LIZ();
        this.LIZIZ.postValue(true);
    }
    
    @Override
    public final void LIZ(final V v) {
        super.LIZ(v);
        this.LIZ.postValue(false);
    }
}
