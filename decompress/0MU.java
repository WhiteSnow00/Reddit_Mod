// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.liveinteract.cohost.widget.LinkCoHostBeInviteVideoPreloadWidget;

public final class 0mU implements Runnable
{
    public final /* synthetic */ LinkCoHostBeInviteVideoPreloadWidget LIZ;
    
    static {
        Covode.recordClassIndex(7577);
    }
    
    public 0mU(final LinkCoHostBeInviteVideoPreloadWidget liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void run() {
        final LinkCoHostBeInviteVideoPreloadWidget liz = this.LIZ;
        0xo.LIZ("LinkCoHostBeInviteVideoPreloadWidget_onPlayOverTime");
        final Iterator<Object> iterator = liz.LIZ.iterator();
        while (iterator.hasNext()) {
            iterator.next().LIZIZ();
        }
        liz.LIZIZ();
    }
}
