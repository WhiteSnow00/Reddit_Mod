// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 0pc
{
    public 0pe LIZ;
    public long LIZIZ;
    public 0pL LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public 0pg LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public Integer LJIIJJI;
    public boolean LJIIL;
    public final long LJIILIIL;
    public long LJIILJJIL;
    
    static {
        Covode.recordClassIndex(8204);
    }
    
    public 0pc(final long ljiiliil) {
        this.LJIILIIL = ljiiliil;
        this.LJIILJJIL = 0L;
        this.LIZJ = 0pL.SUPPORT_MULTI;
        this.LJFF = 0pg.IDLE;
        this.LJIIIIZZ = -1L;
        this.LJIIIZ = "";
        this.LJIIJ = "";
    }
    
    public final void LIZ(final 0pg ljff) {
        CTM.LIZ((Object)ljff);
        this.LJFF = ljff;
    }
    
    public final void LIZ(final String ljiiiz) {
        CTM.LIZ((Object)ljiiiz);
        this.LJIIIZ = ljiiiz;
    }
    
    public final boolean LIZ() {
        return this.LJFF == 0pg.INVITING || this.LJFF == 0pg.INVITED || this.LJFF == 0pg.APPLYING || this.LJFF == 0pg.APPLIED;
    }
    
    public final boolean LIZ(final Long n) {
        final long ljiiliil = this.LJIILIIL;
        return n != null && n == ljiiliil;
    }
    
    public final void LIZIZ(final String ljiij) {
        CTM.LIZ((Object)ljiij);
        this.LJIIJ = ljiij;
    }
    
    public final boolean LIZIZ() {
        return this.LJFF == 0pg.LINKED;
    }
    
    public final boolean LIZJ() {
        return this.LIZIZ == 0py.LIZ();
    }
    
    public final boolean LIZLLL() {
        return this.LJIILIIL == 0py.LIZ();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("MultiCoHostUser(uid=");
        sb.append(this.LJIILIIL);
        sb.append(", roomId=");
        sb.append(this.LJIILJJIL);
        sb.append(", userInfo=");
        sb.append(this.LIZ);
        sb.append(", rivalUserId=");
        sb.append(this.LIZIZ);
        sb.append(", permissionType=");
        sb.append(this.LIZJ);
        sb.append(", playType=");
        sb.append(this.LIZLLL);
        sb.append(", isLowVersion=");
        sb.append(this.LJ);
        sb.append(", state=");
        sb.append(this.LJFF);
        sb.append(", linkedTime=");
        sb.append(this.LJI);
        sb.append(", linkRemainingTime=");
        sb.append(this.LJII);
        sb.append(", followStatus=");
        sb.append(this.LJIIIIZZ);
        sb.append(", requestId='");
        sb.append(this.LJIIIZ);
        sb.append("', linkMicId='");
        sb.append(this.LJIIJ);
        sb.append("', randomAvatarResId=");
        sb.append(this.LJIIJJI);
        sb.append(')');
        return sb.toString();
    }
}
