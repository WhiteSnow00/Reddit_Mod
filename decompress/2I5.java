// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class 2I5 extends 9Mp implements 2KK
{
    public final boolean LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Aweme LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    
    static {
        Covode.recordClassIndex(96394);
    }
    
    public 2I5(final String liziz, final String lizj, final Aweme lizlll, final boolean lj, final String ljff) {
        CTM.LIZ((Object)liziz, (Object)lizj);
        this.LIZ = true;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
        this.LJFF = ljff;
    }
    
    public final Object[] getObjects() {
        return new Object[] { this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF };
    }
}
