// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 0kH
{
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final String LJ;
    public static final String LJFF;
    public static final String LJI;
    public static final String LJII;
    public static final String LJIIIIZZ;
    public static final String LJIIIZ;
    public final String LIZ;
    
    static {
        Covode.recordClassIndex(7115);
        LJIIIZ = "LinkStateChangedEvent";
        LIZIZ = "normal";
        LIZJ = "multi_guest";
        LIZLLL = "co_host";
        LJ = "co_host_inviting";
        LJFF = "match";
        LJI = "match_inviting";
        LJII = "punishing";
        LJIIIIZZ = "rematch_inviting";
    }
    
    public 0kH(final String liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
        final String ljiiiz = 0kH.LJIIIZ;
        final StringBuilder sb = new StringBuilder("curType=");
        sb.append(liz);
        0ba.LIZ(3, ljiiiz, sb.toString());
    }
}
