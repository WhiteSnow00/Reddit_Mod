// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 12M extends 01m<Object>
{
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ 01k LIZJ;
    public final /* synthetic */ 01p LIZLLL;
    
    static {
        Covode.recordClassIndex(230);
    }
    
    public 12M(final 01p lizlll, final String liz, final int liziz, final 01k lizj) {
        this.LIZLLL = lizlll;
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    @Override
    public final void LIZ() {
        this.LIZLLL.LIZ(this.LIZ);
    }
    
    @Override
    public final void LIZ(final Object o) {
        this.LIZLLL.LJFF.add(this.LIZ);
        final Integer n = this.LIZLLL.LIZLLL.get(this.LIZ);
        final 01p lizlll = this.LIZLLL;
        int n2;
        if (n != null) {
            n2 = n;
        }
        else {
            n2 = this.LIZIZ;
        }
        lizlll.LIZ(n2, (01k<Object, Object>)this.LIZJ, o);
    }
}
