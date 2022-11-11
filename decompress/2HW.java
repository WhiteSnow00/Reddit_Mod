// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;

public final class 2Hw implements SqH
{
    public final /* synthetic */ BaseListFragmentPanel LIZ;
    
    static {
        Covode.recordClassIndex(82522);
    }
    
    public 2Hw(final BaseListFragmentPanel liz) {
        this.LIZ = liz;
    }
    
    public final void LIZ() {
        this.LIZ.LLIZ = SystemClock.elapsedRealtime();
        this.LIZ.LLIZLLLIL = true;
        this.LIZ.LLJJLIIIJLLLLLLLZ();
    }
    
    public final void LIZ(final float n) {
        this.LIZ.LLJ = false;
        if (n >= 1.01f && 2Ms.LIZ().LIZ && 2Ms.LIZJ()) {
            this.LIZ.LLJLILLLLZIIL();
        }
    }
    
    public final void LIZIZ() {
        this.LIZ.LLIZLLLIL = false;
        this.LIZ.LLJL();
        final Aweme ljzl = this.LIZ.LJZL();
        if (ljzl != null && this.LIZ.LLIZ > 0L) {
            Act.LIZ.LJIIIIZZ().logPinchZoom(this.LIZ.c_(true), ljzl, 0, SystemClock.elapsedRealtime() - this.LIZ.LLIZ, false, (Integer)null, false);
            this.LIZ.LLIZ = -1L;
        }
    }
    
    public final void LIZIZ(final float n) {
        if (this.LIZ.LLIZLLLIL && n >= 1.01f && !this.LIZ.LLJ && 2Ms.LIZ().LIZ && 2Ms.LIZIZ()) {
            this.LIZ.LLJLILLLLZIIL();
            this.LIZ.LLJ = true;
        }
    }
}
