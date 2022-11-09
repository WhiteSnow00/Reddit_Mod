// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public class 1Cb implements 0OQ
{
    public String LIZ;
    public int LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public double LJFF;
    public double LJI;
    
    static {
        Covode.recordClassIndex(3968);
    }
    
    public 1Cb() {
        this.LIZIZ = -1;
    }
    
    public final void LIZ(final long n) {
        final long lizlll = this.LIZLLL;
        if (lizlll >= 0L && n > 0L) {
            this.LJFF = lizlll / (double)n;
        }
    }
    
    public final void LIZ(final 0OQ 0oq) {
        final long lizj = this.LIZJ;
        long lizj2;
        if (0oq == null) {
            lizj2 = 0L;
        }
        else {
            lizj2 = ((1Cb)0oq).LIZJ;
        }
        final long n = lizj - lizj2;
        this.LIZLLL = n;
        if (this.LJ == 0L) {
            this.LJ = n;
        }
    }
    
    public final void LIZIZ(final long n) {
        final long lizlll = this.LIZLLL;
        if (lizlll >= 0L && n > 0L) {
            this.LJI = lizlll / (double)n;
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("proc_stat:{pid=");
        sb.append(this.LIZIZ);
        sb.append(" process_name:");
        sb.append(this.LIZ);
        sb.append(" delta cpu_time:");
        sb.append(this.LIZLLL);
        sb.append(" cpu_usage:");
        sb.append(this.LJFF * 100.0);
        sb.append("% cpu_rate:");
        sb.append(this.LJI);
        sb.append("}");
        return sb.toString();
    }
}
