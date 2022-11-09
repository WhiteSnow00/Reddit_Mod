// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import java.util.Map;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.ConcurrentHashMap;

public final class 0pP
{
    public final ConcurrentHashMap<Long, Long> LIZ;
    public DataChannel LIZIZ;
    public final HashMap<Long, 2fc> LIZJ;
    
    static {
        Covode.recordClassIndex(8126);
    }
    
    public 0pP() {
        this.LIZJ = new HashMap<Long, 2fc>();
        this.LIZ = new ConcurrentHashMap<Long, Long>();
    }
    
    public final void LIZ() {
        try {
            final StringBuilder sb = new StringBuilder("clear, disposableMap size = ");
            sb.append(this.LIZJ.size());
            sb.append('}');
            0ba.LIZ(4, "MultiCoHostTimeOut", sb.toString());
            final Iterator<Map.Entry<Object, Object>> iterator = this.LIZJ.entrySet().iterator();
            while (iterator.hasNext()) {
                this.LIZ(((Map.Entry<Number, V>)iterator.next()).getKey().longValue());
            }
        }
        catch (final Exception ex) {
            final StringBuilder sb2 = new StringBuilder("clear, e = ");
            sb2.append(ex.toString());
            0ba.LIZ(4, "MultiCoHostTimeOut", sb2.toString());
        }
        finally {
            this.LIZJ.clear();
            this.LIZ.clear();
        }
    }
    
    public final void LIZ(final long n) {
        0ba.LIZ(4, "MultiCoHostTimeOut", "removeCountDown, uid = ".concat(String.valueOf(n)));
        final 2fc 2fc = this.LIZJ.get(n);
        if (2fc != null) {
            2fc.dispose();
        }
        this.LIZJ.remove(n);
        this.LIZ.remove(n);
    }
    
    public final void LIZ(final long n, final long n2, final 0pN 0pN) {
        CTM.LIZ((Object)0pN);
        if (n <= 0L) {
            return;
        }
        this.LIZ.put(n, n2);
        final DataChannel liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZJ((Class)2FJ.class, (Object)new 1Rs(n, n2, 0pN));
        }
    }
    
    public final void LIZ(final 0pN 0pN, final long n, final long n2) {
        CTM.LIZ((Object)0pN);
        final StringBuilder sb = new StringBuilder("addCountDown, source = ");
        sb.append(0pN);
        sb.append(", uid = ");
        sb.append(n);
        sb.append(", countdownSecond = ");
        sb.append(n2);
        0ba.LIZ(4, "MultiCoHostTimeOut", sb.toString());
        final 2fc 2fc = this.LIZJ.get(n);
        if (2fc != null) {
            2fc.dispose();
        }
        final HashMap<Long, 2fc> lizj = this.LIZJ;
        final 2fc liz = FBH.LIZ(1L, TimeUnit.SECONDS).LIZIZ(n2).LJ((5Vs)new 1Ru(n2)).LIZ(F8U.LIZ(F8V.LIZ)).LIZ((2d6)new 1Rv(this, n, 0pN), (2d6)new 1Rw(n), (F7Q)new 1Rx(this, n, 0pN));
        n.LIZIZ((Object)liz, "");
        lizj.put(n, liz);
    }
}
