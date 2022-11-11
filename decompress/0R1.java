// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;

public final class 0R1
{
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final List<String> LJ;
    public final HashMap<String, String> LJFF;
    public String LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(4375);
    }
    
    public 0R1(final String liz, final String liziz, final String lizj, final String lizlll, final List<String> lj, final String lji, final String ljii, final boolean ljiiiizz) {
        CTM.LIZ((Object)liz, (Object)liziz);
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
        this.LJFF = null;
        this.LJI = lji;
        this.LJII = ljii;
        this.LJIIIIZZ = ljiiiizz;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof 0R1)) {
            return false;
        }
        final 0R1 0r1 = (0R1)o;
        return n.LIZ((Object)this.LIZ, (Object)0r1.LIZ) && n.LIZ((Object)this.LIZIZ, (Object)0r1.LIZIZ) && n.LIZ((Object)this.LIZJ, (Object)0r1.LIZJ) && n.LIZ((Object)this.LIZLLL, (Object)0r1.LIZLLL) && n.LIZ((Object)this.LJ, (Object)0r1.LJ) && n.LIZ((Object)this.LJFF, (Object)0r1.LJFF) && n.LIZ((Object)this.LJI, (Object)0r1.LJI) && n.LIZ((Object)this.LJII, (Object)0r1.LJII) && this.LJIIIIZZ == 0r1.LJIIIIZZ;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.LIZ.hashCode();
        final int hashCode2 = this.LIZIZ.hashCode();
        final String lizj = this.LIZJ;
        int hashCode3 = 0;
        int hashCode4;
        if (lizj == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = lizj.hashCode();
        }
        final String lizlll = this.LIZLLL;
        int hashCode5;
        if (lizlll == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = lizlll.hashCode();
        }
        final List<String> lj = this.LJ;
        int hashCode6;
        if (lj == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = lj.hashCode();
        }
        final HashMap<String, String> ljff = this.LJFF;
        int hashCode7;
        if (ljff == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = ljff.hashCode();
        }
        final String lji = this.LJI;
        int hashCode8;
        if (lji == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = lji.hashCode();
        }
        final String ljii = this.LJII;
        if (ljii != null) {
            hashCode3 = ljii.hashCode();
        }
        int ljiiiizz;
        if ((ljiiiizz = (this.LJIIIIZZ ? 1 : 0)) != 0) {
            ljiiiizz = 1;
        }
        return (((((((hashCode * 31 + hashCode2) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode3) * 31 + ljiiiizz;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("PageInfo(pageID=");
        sb.append(this.LIZ);
        sb.append(", btm=");
        sb.append(this.LIZIZ);
        sb.append(", btmPre=");
        sb.append((Object)this.LIZJ);
        sb.append(", btmPPre=");
        sb.append((Object)this.LIZLLL);
        sb.append(", btmChain=");
        sb.append(this.LJ);
        sb.append(", data=");
        sb.append(this.LJFF);
        sb.append(", btmOfLastStayPage=");
        sb.append((Object)this.LJI);
        sb.append(", className=");
        sb.append((Object)this.LJII);
        sb.append(", isBack=");
        sb.append(this.LJIIIIZZ);
        sb.append(')');
        return sb.toString();
    }
}
