// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.depend.model.live.match.PreviewPeriod;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.List;
import android.view.ViewGroup;

public final class 0oW implements Runnable
{
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ ViewGroup LIZIZ;
    public final /* synthetic */ 1xz LIZJ;
    public final /* synthetic */ 1Rc LIZLLL;
    public final /* synthetic */ List LJ;
    
    static {
        Covode.recordClassIndex(8000);
    }
    
    public 0oW(final int liz, final ViewGroup liziz, final 1xz lizj, final 1Rc lizlll, final List lj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
    }
    
    @Override
    public final void run() {
        if (this.LIZLLL.LIZ && this.LIZ + 1 < this.LJ.size()) {
            0p0.LIZ((View)this.LIZIZ, -2);
            1Rc.LIZ(this.LIZLLL, new 1Rc.a(this.LJ.get(this.LIZ + 1).LIZIZ, null, this.LJ.get(this.LIZ + 1).LIZJ), new 1Rc.b(this.LIZLLL.LJ, this.LIZJ, (View)this.LIZLLL.LIZLLL, this.LIZIZ));
        }
    }
}
