// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import android.ss.com.vboost.CapabilityType;

public class 00f implements Comparable
{
    public CapabilityType LIZ;
    public 00w LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public int LJ;
    public 00K LJFF;
    public 00n LJI;
    public 010 LJII;
    public 00y LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public 00k LJIIJJI;
    public 00d LJIIL;
    public long LJIILIIL;
    public 00m LJIILJJIL;
    public 00g LJIILL;
    public long LJIILLIIL;
    public 00l LJIIZILJ;
    public 00a LJIJ;
    public 00U LJIJI;
    
    static {
        Covode.recordClassIndex(61);
    }
    
    public 00f(final CapabilityType liz) {
        this.LIZ = liz;
        switch (00e.LIZ[liz.ordinal()]) {
            case 13:
            case 14:
            case 15:
            case 16:
            case 17: {
                this.LJIILJJIL = 00m.LIZLLL;
                break;
            }
            case 8:
            case 9:
            case 10:
            case 11:
            case 12: {
                this.LJIILJJIL = 00m.LIZJ;
                break;
            }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 18: {
                this.LJIILJJIL = 00m.LIZ;
                break;
            }
        }
        switch (00e.LIZ[liz.ordinal()]) {
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17: {
                this.LJIIJJI = 00k.USE_OURS;
                break;
            }
            case 3:
            case 4:
            case 5:
            case 6:
            case 7: {
                this.LJIIJJI = 00k.USER_CANCEL;
                break;
            }
            case 1:
            case 2: {
                this.LJIIJJI = 00k.ONE_TIME;
                break;
            }
        }
        final long currentTimeMillis = System.currentTimeMillis();
        this.LJIILLIIL = currentTimeMillis;
        this.LJIILIIL = currentTimeMillis;
    }
    
    public final long LIZ() {
        final long lizj = this.LIZJ;
        final long ljiilliil = this.LJIILLIIL;
        final long ljiiliil = this.LJIILIIL;
        00s.LIZ(3);
        return lizj - (ljiilliil - ljiiliil);
    }
    
    @Override
    public int compareTo(final Object o) {
        final 00f 00f = (00f)o;
        final int n = 00e.LIZIZ[00f.LJIILJJIL.ordinal()];
        int n2 = 0;
        while (true) {
            Label_0351: {
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                00s.LIZ(5);
                                final long ljiiliil = this.LJIILIIL;
                                final long ljiiliil2 = 00f.LJIILIIL;
                                if (ljiiliil <= ljiiliil2) {
                                    if (ljiiliil == ljiiliil2) {
                                        break Label_0066;
                                    }
                                    break Label_0351;
                                }
                            }
                            else {
                                final long ljiiliil3 = this.LJIILIIL;
                                final long ljiiliil4 = 00f.LJIILIIL;
                                if (ljiiliil3 >= ljiiliil4) {
                                    if (ljiiliil3 == ljiiliil4) {
                                        break Label_0066;
                                    }
                                    break Label_0351;
                                }
                            }
                        }
                        else {
                            final long ljiiliil5 = this.LJIILIIL;
                            final long ljiiliil6 = 00f.LJIILIIL;
                            if (ljiiliil5 > ljiiliil6) {
                                n2 = 1;
                                break Label_0066;
                            }
                            if (ljiiliil5 == ljiiliil6) {
                                break Label_0351;
                            }
                            n2 = -1;
                            break Label_0066;
                        }
                    }
                    else {
                        if (this.LIZIZ.ordinal() > 00f.LIZIZ.ordinal()) {
                            n2 = 1;
                            break Label_0066;
                        }
                        if (this.LIZIZ.ordinal() != 00f.LIZIZ.ordinal()) {
                            n2 = -1;
                            break Label_0066;
                        }
                        final long ljiiliil7 = this.LJIILIIL;
                        final long ljiiliil8 = 00f.LJIILIIL;
                        if (ljiiliil7 <= ljiiliil8) {
                            if (ljiiliil7 == ljiiliil8) {
                                break Label_0066;
                            }
                            break Label_0351;
                        }
                    }
                }
                else {
                    final 00w liziz = this.LIZIZ;
                    if (liziz == null || 00f.LIZIZ == null || liziz.ordinal() < 00f.LIZIZ.ordinal()) {
                        n2 = 1;
                        break Label_0066;
                    }
                    if (this.LIZIZ.ordinal() != 00f.LIZIZ.ordinal()) {
                        n2 = -1;
                        break Label_0066;
                    }
                    final long lizj = this.LIZJ;
                    final long lizj2 = 00f.LIZJ;
                    if (lizj < lizj2) {
                        n2 = 1;
                        break Label_0066;
                    }
                    if (lizj != lizj2) {
                        n2 = -1;
                        break Label_0066;
                    }
                    final long ljiiliil9 = this.LJIILIIL;
                    final long ljiiliil10 = 00f.LJIILIIL;
                    if (ljiiliil9 <= ljiiliil10) {
                        if (ljiiliil9 == ljiiliil10) {
                            break Label_0066;
                        }
                        break Label_0351;
                    }
                }
                n2 = 1;
                00s.LIZ(3);
                return n2;
            }
            n2 = -1;
            continue;
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Request{type=");
        sb.append(this.LIZ);
        sb.append(", level=");
        sb.append(this.LIZIZ);
        sb.append(", timeout=");
        sb.append(this.LIZJ);
        sb.append(", tid=");
        sb.append(this.LIZLLL);
        sb.append(", priority=");
        sb.append(this.LJ);
        sb.append(", cluster=");
        sb.append(this.LJFF);
        sb.append(", timeoutStrategy=");
        sb.append(this.LJIIJJI);
        sb.append(", createTime=");
        sb.append(this.LJIILIIL);
        sb.append(", updateStrategy=");
        sb.append(this.LJIILJJIL);
        sb.append(", info=");
        sb.append(this.LJIILL);
        sb.append(", commitTime=");
        sb.append(this.LJIILLIIL);
        sb.append(", task=");
        sb.append(this.LJIIZILJ);
        sb.append('}');
        return sb.toString();
    }
}
