// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.message.PollMessage;

public final class 0iq
{
    public final long LIZ;
    public long LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public PollMessage LJFF;
    public boolean LJI;
    public 0ip LJII;
    
    static {
        Covode.recordClassIndex(6795);
    }
    
    public 0iq(final long liz, final 0ip ljii) {
        CTM.LIZ((Object)ljii);
        this.LIZ = liz;
        this.LIZIZ = 0L;
        this.LIZJ = false;
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = null;
        this.LJI = false;
        this.LJII = ljii;
    }
    
    public final void LIZ(final 0ip ljii) {
        CTM.LIZ((Object)ljii);
        this.LJII = ljii;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof 0iq) {
                final PollMessage ljff = this.LJFF;
                if (ljff != null) {
                    final Object o2 = null;
                    final long liziz = ljff.LIZIZ;
                    final PollMessage ljff2 = ((0iq)o).LJFF;
                    Object value = o2;
                    if (ljff2 != null) {
                        value = ljff2.LIZIZ;
                    }
                    if (n.LIZ((Object)liziz, value)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final long liz = this.LIZ;
        final int n = (int)(liz ^ liz >>> 32);
        final long liziz = this.LIZIZ;
        final int n2 = (int)(liziz ^ liziz >>> 32);
        final int lizj = this.LIZJ ? 1 : 0;
        int n3 = 1;
        int n4 = lizj;
        if (lizj != 0) {
            n4 = 1;
        }
        int lizlll;
        if ((lizlll = (this.LIZLLL ? 1 : 0)) != 0) {
            lizlll = 1;
        }
        int lj;
        if ((lj = (this.LJ ? 1 : 0)) != 0) {
            lj = 1;
        }
        final PollMessage ljff = this.LJFF;
        int hashCode = 0;
        int hashCode2;
        if (ljff != null) {
            hashCode2 = ljff.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        if (!this.LJI) {
            n3 = 0;
        }
        final 0ip ljii = this.LJII;
        if (ljii != null) {
            hashCode = ljii.hashCode();
        }
        return ((((((n * 31 + n2) * 31 + n4) * 31 + lizlll) * 31 + lj) * 31 + hashCode2) * 31 + n3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("CustomPollInfo(roomId=");
        sb.append(this.LIZ);
        sb.append(", timeLeft=");
        sb.append(this.LIZIZ);
        sb.append(", hasVoted=");
        sb.append(this.LIZJ);
        sb.append(", showPollEntrance=");
        sb.append(this.LIZLLL);
        sb.append(", hasStartPermission=");
        sb.append(this.LJ);
        sb.append(", pollMessage=");
        sb.append(this.LJFF);
        sb.append(", pollAvailable=");
        sb.append(this.LJI);
        sb.append(", pollEndReason=");
        sb.append(this.LJII);
        sb.append(")");
        return sb.toString();
    }
}
