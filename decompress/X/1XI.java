// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.model.message.battle.BattleNoticeAnchorGuide;
import com.bytedance.android.livesdk.model.message.battle.BattleNoticeRuleGuide;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.view.View$OnClickListener;
import com.bytedance.android.livesdk.model.message.LinkMicBattleNoticeMessage;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Objects;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import android.widget.ImageView;
import android.view.View;

public final class 1xI extends 1n0<2H7>
{
    public final View LIZJ;
    public final ImageView LIZLLL;
    public final 1ib LJ;
    public final 1ib LJFF;
    
    static {
        Covode.recordClassIndex(7879);
    }
    
    public 1xI(View viewById) {
        CTM.LIZ((Object)viewById);
        super(viewById);
        final View viewById2 = viewById.findViewById(2131363920);
        n.LIZIZ((Object)viewById2, "");
        this.LIZJ = viewById2;
        final View viewById3 = viewById.findViewById(2131363887);
        n.LIZIZ((Object)viewById3, "");
        this.LIZLLL = (ImageView)viewById3;
        final View viewById4 = viewById.findViewById(2131365874);
        n.LIZIZ((Object)viewById4, "");
        this.LJ = (1ib)viewById4;
        viewById = viewById.findViewById(2131366581);
        n.LIZIZ((Object)viewById, "");
        this.LJFF = (1ib)viewById;
    }
}
