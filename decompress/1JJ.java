// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Collection;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;

public final class 1jJ implements IFetchEffectChannelListener
{
    public final long LIZ;
    public final Cye<List<1Km<LiveEffect>>> LIZIZ;
    public final List<1Km<LiveEffect>> LIZJ;
    public final boolean LIZLLL;
    
    static {
        Covode.recordClassIndex(6598);
    }
    
    public 1jJ(final Cye<? super List<1Km<LiveEffect>>> liziz, final List<1Km<LiveEffect>> lizj, final boolean lizlll) {
        CTM.LIZ((Object)liziz, (Object)lizj);
        this.LIZIZ = (Cye<List<1Km<LiveEffect>>>)liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LIZ = System.currentTimeMillis();
    }
    
    private final void LIZ(final boolean b) {
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_live_beauty_panel_download");
        liz.LIZ();
        liz.LIZ("duration", System.currentTimeMillis() - this.LIZ);
        String s;
        if (b) {
            s = "done";
        }
        else {
            s = "failed";
        }
        liz.LIZ("status", s);
        liz.LIZLLL();
    }
    
    public final void onFail(final ExceptionResult exceptionResult) {
        this.LIZ(false);
        final Cye<List<1Km<LiveEffect>>> liziz = this.LIZIZ;
        Exception exception;
        if (exceptionResult == null || (exception = exceptionResult.getException()) == null) {
            exception = new 0hx("unknown reason");
        }
        final Object liz = F1j.LIZ((Throwable)exception);
        F1k.constructor-impl(liz);
        liziz.resumeWith(liz);
    }
}
