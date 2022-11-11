// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 1hh extends 1Dj
{
    public final /* synthetic */ 1Do LIZ;
    
    static {
        Covode.recordClassIndex(4437);
    }
    
    public 1hh(final 1Do liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ() {
        final 1Dh lizlll = 1hk.LIZLLL().LIZLLL;
        final 1Do liz = this.LIZ;
        final String liziz = liz.LIZIZ();
        final 1Do value = lizlll.LIZ.get(liziz);
        if (value == null || value != liz) {
            lizlll.LIZ.put(liziz, liz);
            liz.LIZJ();
            liz.LIZ();
            liz.LIZLLL();
        }
    }
}
