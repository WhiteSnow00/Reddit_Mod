// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

public final class 0xd
{
    public static long LIZ;
    public static 8si<Long, Long> LIZIZ;
    public static 8si<Long, Long> LIZJ;
    public static int LIZLLL;
    public static final 0xd LJ;
    
    static {
        Covode.recordClassIndex(10315);
        LJ = new 0xd();
        final Long value = -1L;
        0xd.LIZ = -1L;
        final Long value2 = 0L;
        0xd.LIZIZ = (8si<Long, Long>)new 8si((Object)value2, (Object)value);
        0xd.LIZJ = (8si<Long, Long>)new 8si((Object)value2, (Object)value);
    }
    
    public final void LIZ() {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final long longValue = ((Number)0xd.LIZIZ.getSecond()).longValue();
        final Long value = 0L;
        if (longValue > 0L) {
            0xd.LIZIZ = (8si<Long, Long>)new 8si((Object)(((Number)0xd.LIZIZ.getFirst()).longValue() + (elapsedRealtime - ((Number)0xd.LIZIZ.getSecond()).longValue())), (Object)value);
        }
        if (((Number)0xd.LIZJ.getSecond()).longValue() > 0L) {
            0xd.LIZJ = (8si<Long, Long>)new 8si((Object)(((Number)0xd.LIZJ.getFirst()).longValue() + (elapsedRealtime - ((Number)0xd.LIZJ.getSecond()).longValue())), (Object)value);
        }
    }
    
    public final void LIZ(final int n, final long n2) {
        final Long value = 0L;
        if (n > 2) {
            0xd.LIZIZ = (8si<Long, Long>)new 8si(0xd.LIZIZ.getFirst(), (Object)value);
            0xd.LIZJ = (8si<Long, Long>)new 8si(0xd.LIZJ.getFirst(), (Object)n2);
            return;
        }
        0xd.LIZIZ = (8si<Long, Long>)new 8si(0xd.LIZIZ.getFirst(), (Object)n2);
        0xd.LIZJ = (8si<Long, Long>)new 8si(0xd.LIZJ.getFirst(), (Object)value);
    }
    
    public final boolean LIZ(final int lizlll) {
        if (lizlll == 0 || 0xd.LIZLLL == lizlll) {
            return false;
        }
        this.LIZ(0xd.LIZLLL = lizlll, 0xd.LIZ = SystemClock.elapsedRealtime());
        return true;
    }
}
