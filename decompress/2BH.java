// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.d.b.a.a;
import com.bytedance.covode.number.Covode;

public final class 2Bh extends F5e implements SRT<BFk, Cye<? super 2P9>, Object>
{
    public int LIZ;
    public final /* synthetic */ 1iD LIZIZ;
    public final /* synthetic */ 0aZ LIZJ;
    public final /* synthetic */ 1iD LIZLLL;
    
    static {
        Covode.recordClassIndex(5563);
    }
    
    public 2Bh(final 1iD liziz, final 0aZ lizj, final 1iD lizlll, final Cye cye) {
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        super(2, cye);
    }
    
    public final Cye<2P9> create(final Object o, final Cye<?> cye) {
        CTM.LIZ((Object)cye);
        return (Cye<2P9>)new 2Bh(this.LIZIZ, this.LIZJ, this.LIZLLL, cye);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        return ((a)((a)this).create(o, (Cye)o2)).invokeSuspend((Object)2P9.LIZ);
    }
    
    public final Object invokeSuspend(final Object o) {
        final F1i coroutine_SUSPENDED = F1i.COROUTINE_SUSPENDED;
        final int liz = this.LIZ;
        if (liz != 0) {
            if (liz != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            F1j.LIZ(o);
        }
        else {
            F1j.LIZ(o);
            final 1iD liziz = this.LIZIZ;
            final String ljii = this.LIZJ.LJII;
            final int ljiiiz = this.LIZJ.LJIIIZ;
            final long ljiiiizz = this.LIZJ.LJIIIIZZ;
            CTM.LIZ((Object)ljii);
            liziz.LIZIZ = ljii;
            liziz.LIZJ = ljiiiz;
            liziz.LIZLLL = ljiiiizz;
            if (H25.LJFF) {
                final StringBuilder sb = new StringBuilder("No.2 -> Session(");
                sb.append(this.LIZIZ.LIZIZ);
                sb.append("), receive Config Message. configData=");
                sb.append(this.LIZJ);
                sb.append(", ");
                sb.append(this.LIZLLL);
                0ba.LIZ(4, "NetworkSpeedDetectorManager", sb.toString());
            }
            final 1iD liziz2 = this.LIZIZ;
            final 0aZ lizj = this.LIZJ;
            final F2K ljff = liziz2.LJFF;
            if (ljff != null) {
                ljff.LIZ((CancellationException)null);
            }
            liziz2.LJFF = F0v.LIZ((BFk)Cc0.LIZ, (F2r)F2A.LIZJ, (SRT)new 2BY(liziz2, lizj, null), 2);
            final long ljff2 = this.LIZJ.LJFF;
            this.LIZ = 1;
            if (EVu.LIZ(ljff2, (Cye)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        if (this.LIZIZ.LJ.get()) {
            final String liziz3 = this.LIZIZ.LIZIZ;
            final long ljff3 = this.LIZJ.LJFF;
            CTM.LIZ((Object)liziz3);
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("session_id", liziz3);
            linkedHashMap.put("wait_duration", ljff3);
            0d8.LIZ(GGd.LIZIZ("ttlive_speed_detection_wait_duration_not_receive_report_service"), 1, linkedHashMap);
        }
        this.LIZIZ.LJII();
        this.LIZIZ.LIZJ(0ao.DisconnectTypeWaitReportTimeOut.getCode(), 0ao.DisconnectTypeWaitReportTimeOut.getMessage());
        this.LIZIZ.LIZIZ(0ao.DisconnectTypeWaitReportTimeOut.getCode(), 0ao.DisconnectTypeWaitReportTimeOut.getMessage());
        return 2P9.LIZ;
    }
}
