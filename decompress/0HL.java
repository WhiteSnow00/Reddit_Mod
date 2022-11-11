// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import com.bytedance.covode.number.Covode;

public final class 0hl implements Runnable
{
    public final /* synthetic */ 8u7 LIZ;
    public final /* synthetic */ 0hm LIZIZ;
    public final /* synthetic */ SRS LIZJ;
    
    static {
        Covode.recordClassIndex(6526);
    }
    
    public 0hl(final 8u7 liz, final 0hm liziz, final SRS lizj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    @Override
    public final void run() {
        final SRS lizj = this.LIZJ;
        if (lizj != null) {
            lizj.invoke((Object)true);
        }
        this.LIZIZ.LIZ((List<1LH>)this.LIZ.getFirst(), (List<? extends Effect>)this.LIZ.getSecond(), (Effect)this.LIZ.getThird());
    }
}
