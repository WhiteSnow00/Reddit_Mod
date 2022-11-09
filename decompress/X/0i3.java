// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Collection;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import java.util.ArrayList;
import com.bytedance.android.livesdkapi.host.IHostContext;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import com.ss.android.ugc.effectmanager.EffectManager;

public final class 0i3
{
    public EffectManager LIZ;
    public final List<1Km<LiveEffect>> LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    
    static {
        Covode.recordClassIndex(6615);
    }
    
    public 0i3(final String lizj, final boolean lizlll) {
        CTM.LIZ((Object)lizj);
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        final 0Vq liz = 0jR.LIZ((Class<0Vq>)IHostContext.class);
        n.LIZIZ((Object)liz, "");
        final EffectManager effectManager = ((IHostContext)liz).getEffectManager();
        n.LIZIZ((Object)effectManager, "");
        this.LIZ = effectManager;
        this.LIZIZ = new ArrayList<1Km<LiveEffect>>();
    }
    
    public static boolean LIZ() {
        try {
            return 2Nf.LIZ.LIZIZ();
        }
        catch (final Exception ex) {
            return false;
        }
    }
    
    public final Object LIZ(final Cye<? super List<1Km<LiveEffect>>> cye) {
        final F1g f1g = new F1g(F1C.LIZ((Cye)cye));
        this.LIZ.fetchEffectList(this.LIZJ, false, (IFetchEffectChannelListener)new 1jJ((Cye<? super List<1Km<LiveEffect>>>)f1g, this.LIZIZ, this.LIZLLL));
        final Object liz = f1g.LIZ();
        if (liz == F1i.COROUTINE_SUSPENDED) {
            CTM.LIZ((Object)cye);
        }
        return liz;
    }
    
    public static final class a implements IFetchEffectChannelListener
    {
        public final Cye<List<1Km<LiveEffect>>> LIZ;
        public final List<1Km<LiveEffect>> LIZIZ;
        public final boolean LIZJ;
        
        static {
            Covode.recordClassIndex(6616);
        }
        
        public a(final Cye<? super List<1Km<LiveEffect>>> liz, final List<1Km<LiveEffect>> liziz, final boolean lizj) {
            CTM.LIZ((Object)liz, (Object)liziz);
            this.LIZ = (Cye<List<1Km<LiveEffect>>>)liz;
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
        }
        
        public final void onFail(final ExceptionResult exceptionResult) {
            final Cye<List<1Km<LiveEffect>>> liz = this.LIZ;
            final 6uH instance = 6uH.INSTANCE;
            F1k.constructor-impl((Object)instance);
            liz.resumeWith((Object)instance);
        }
    }
}
