// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.google.gson.Gson;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.live.broadcast.game.partnership.widget.GamePartnershipAudiencePromoteGameCardWidget;

public final class 0ZQ implements Runnable
{
    public final /* synthetic */ GamePartnershipAudiencePromoteGameCardWidget LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ BriefGameTask LIZJ;
    
    static {
        Covode.recordClassIndex(5399);
    }
    
    public 0ZQ(final GamePartnershipAudiencePromoteGameCardWidget liz, final String liziz, final BriefGameTask lizj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    @Override
    public final void run() {
        final StringBuilder sb = new StringBuilder("updateShowGameCard  isFromMessage ");
        sb.append(this.LIZIZ);
        0ba.LIZ(3, "PartnershipAudience", sb.toString());
        this.LIZ.LIZ(new Gson().LIZIZ((Object)this.LIZJ));
        this.LIZ.LIZ(true, this.LIZJ, this.LIZIZ);
    }
}
