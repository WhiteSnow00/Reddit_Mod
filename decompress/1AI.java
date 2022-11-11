// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class 1aI extends 9Mp
{
    @c(LIZ = "method")
    public String LIZ;
    @c(LIZ = "param")
    public 1aJ LIZIZ;
    @c(LIZ = "ts")
    public Long LIZJ;
    @c(LIZ = "msg_id")
    public String LIZLLL;
    @c(LIZ = "version")
    public final int LJ;
    @c(LIZ = "os")
    public final String LJFF;
    
    static {
        Covode.recordClassIndex(9831);
    }
    
    public 1aI(final String liz, final Long lizj, final String lizlll, final String ljff) {
        CTM.LIZ((Object)liz, (Object)ljff);
        this.LIZ = liz;
        this.LIZIZ = null;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = 1;
        this.LJFF = ljff;
    }
    
    public final void LIZ() {
        final StringBuilder sb = new StringBuilder();
        final GIK liziz = Fk2.LIZ().LIZIZ();
        n.LIZIZ((Object)liziz, "");
        sb.append(String.valueOf(liziz.LIZJ()));
        sb.append("_");
        sb.append(this.LIZJ);
        this.LIZLLL = sb.toString();
    }
    
    public final void LIZ(final String liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
    }
    
    public final Object[] getObjects() {
        return new Object[] { this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF };
    }
}
