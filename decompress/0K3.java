// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class 0k3
{
    public static final String LIZLLL;
    public static final String LJ;
    public static final String LJFF;
    public static final String LJI;
    public static final String LJII;
    public static final String LJIIIIZZ;
    public static final String LJIIIZ;
    public static final String LJIIJ;
    public boolean LIZ;
    public Boolean LIZIZ;
    public final String LIZJ;
    
    static {
        Covode.recordClassIndex(7062);
        LIZLLL = "anchor_host_notice";
        LJ = "connection_icon";
        LJFF = "rank";
        LJI = "multi_invite";
        LJII = "others";
        LJIIIIZZ = "pk_icon";
        LJIIIZ = "pk_guide";
        LJIIJ = "multi_pk_guide";
    }
    
    public 0k3(final String lizj) {
        CTM.LIZ((Object)lizj);
        this.LIZJ = lizj;
    }
    
    public final boolean LIZ() {
        return TextUtils.equals((CharSequence)this.LIZJ, (CharSequence)0k3.LIZLLL);
    }
}
