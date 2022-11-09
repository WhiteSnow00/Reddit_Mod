// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;

public final class 1lh extends 0qc.a
{
    public long LIZ;
    public String LIZIZ;
    public LinkPlayerInfo LIZJ;
    public long LIZLLL;
    public a LJ;
    
    static {
        Covode.recordClassIndex(8502);
    }
    
    public 1lh(final long liz, final String liziz, final LinkPlayerInfo lizj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        if (lizj != null) {
            this.LIZIZ = lizj.LJIIIZ;
            if (this.LIZJ.LIZJ != null) {
                this.LIZ = this.LIZJ.LIZJ.getId();
            }
        }
    }
    
    public 1lh(final long n, final String s, final LinkPlayerInfo linkPlayerInfo, final a lj) {
        this(n, s, linkPlayerInfo);
        this.LJ = lj;
    }
    
    private void LJI() {
        if (super.LJIIIIZZ == null) {
            return;
        }
        if (this.LIZJ == null) {
            ((b)super.LJIIIIZZ).setVisibility(false);
            return;
        }
        ((b)super.LJIIIIZZ).setVisibility(true);
        if (this.LIZJ.LIZJ != null) {
            ((b)super.LJIIIIZZ).LIZ(this.LIZJ.LIZJ);
        }
        ((0qc.a)this).LIZ(this.LIZJ.LJIIL, this.LIZJ.LIZIZ);
        ((b)super.LJIIIIZZ).LIZ(((0qc.a)this).LJ());
    }
    
    @Override
    public final User LIZ() {
        final LinkPlayerInfo lizj = this.LIZJ;
        if (lizj != null) {
            return lizj.LIZJ;
        }
        return null;
    }
    
    @Override
    public final void LIZ(final int n, final long lizlll) {
        if (lizlll < this.LIZLLL) {
            return;
        }
        this.LIZLLL = lizlll;
        if (super.LJIIIIZZ != null) {
            ((b)super.LJIIIIZZ).LIZ(n, this.LIZLLL);
        }
        if (((0qc.a)this).LJ()) {
            1NO.LIZ().LIZ(this.LIZLLL);
        }
    }
    
    @Override
    public final void LIZ(LinkPlayerInfo lizj) {
        final LinkPlayerInfo lizj2 = this.LIZJ;
        if (lizj2 != null) {
            if (lizj != null && lizj.LIZJ != null && lizj2.LIZJ != null && lizj2.LIZJ.getId() == lizj.LIZJ.getId()) {
                if (lizj.LIZIZ > lizj2.LIZIZ) {
                    lizj2.LIZIZ = lizj.LIZIZ;
                }
                lizj2.LJIIIZ = lizj.LJIIIZ;
                lizj2.LIZJ = lizj.LIZJ;
                if (lizj.LIZLLL > lizj2.LIZLLL) {
                    lizj2.LIZLLL = lizj.LIZLLL;
                }
                lizj2.LJ = lizj.LJ;
                lizj2.LJFF = lizj.LJFF;
                lizj2.LJI = lizj.LJI;
                lizj2.LJII = lizj.LJII;
            }
        }
        else {
            this.LIZJ = lizj;
        }
        lizj = this.LIZJ;
        if (lizj != null) {
            this.LIZIZ = lizj.LJIIIZ;
            if (this.LIZJ.LIZJ != null) {
                this.LIZ = this.LIZJ.LIZJ.getId();
            }
        }
        this.LJI();
    }
    
    @Override
    public final void LIZIZ() {
        final a lj = this.LJ;
        LinkPlayerInfo linkPlayerInfo;
        if (lj != null) {
            linkPlayerInfo = lj.LIZ(this.LIZIZ, this.LIZ);
        }
        else {
            final 1Tr 1Tr = (1Tr)1jw.LIZ.LIZ("LINK_USER_INFO_CENTER");
            if (1Tr == null) {
                return;
            }
            linkPlayerInfo = 1Tr.LIZ(this.LIZIZ, this.LIZ);
        }
        if (linkPlayerInfo != null) {
            ((0qc.a)this).LIZ(linkPlayerInfo);
        }
    }
    
    @Override
    public final long LIZJ() {
        return this.LIZ;
    }
    
    @Override
    public final String LIZLLL() {
        return this.LIZIZ;
    }
    
    @Override
    public final boolean LJ() {
        final long liz = this.LIZ;
        return liz != 0L && liz == Fk2.LIZ().LIZIZ().LIZJ();
    }
    
    @Override
    public final boolean LJFF() {
        final LinkPlayerInfo lizj = this.LIZJ;
        return lizj != null && lizj.LJFF == 2;
    }
    
    @Override
    public final void h_() {
        super.h_();
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(8503);
        }
        
        LinkPlayerInfo LIZ(final String p0, final long p1);
    }
}
