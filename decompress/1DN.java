// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig$RoomsData;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.other.LiveEnablePerformanceOptimize;
import kotlin.jvm.internal.n;
import android.animation.Animator;
import com.bytedance.covode.number.Covode;

public final class 1dn extends 0z6
{
    public final /* synthetic */ 0zE LIZ;
    
    static {
        Covode.recordClassIndex(10493);
    }
    
    public 1dn(final 0zE liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void onAnimationEnd(final Animator animator) {
        super.onAnimationEnd(animator);
        this.LIZ.LJFF.getValue();
        final DataChannel ljiiiz = this.LIZ.LJIIIZ;
        if (ljiiiz == null) {
            return;
        }
        final Long n = (Long)ljiiiz.LIZIZ((Class)G6j.class);
        final Fzp liz = Fhf.LIZ;
        kotlin.jvm.internal.n.LIZIZ((Object)liz, "");
        final EnterRoomLinkSession liz2 = liz.LIZ();
        kotlin.jvm.internal.n.LIZIZ((Object)liz2, "");
        final EnterRoomConfig liziz = liz2.LIZIZ;
        EnterRoomConfig$RoomsData lizlll;
        if (liziz != null) {
            lizlll = liziz.LIZLLL;
        }
        else {
            lizlll = null;
        }
        if (LiveEnablePerformanceOptimize.INSTANCE.isOptimizeEnable() && lizlll != null && n != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            final long longValue = n;
            final Gkn liz3 = Gkn.LJFF.LIZ("livesdk_live_top_show");
            liz3.LJI(lizlll.LJJLIIIJJIZ);
            liz3.LIZ();
            liz3.LIZ("enter_from_merge", lizlll.LJJJJJ);
            liz3.LIZ("enter_method", lizlll.LJJJJJL);
            liz3.LIZ("duration", elapsedRealtime - longValue);
            liz3.LIZLLL();
        }
    }
}
