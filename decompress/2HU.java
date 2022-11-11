// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Collections;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdk.model.message.common.TextPieceUser;
import com.bytedance.android.livesdk.model.message.common.TextFormat;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.message.LikeMessage;

public class 2HU extends 2Gk<LikeMessage>
{
    static {
        Covode.recordClassIndex(10869);
    }
    
    public 2HU(final LikeMessage likeMessage) {
        super((H31)likeMessage);
    }
    
    @Override
    public final User LIZIZ() {
        return ((LikeMessage)super.LJIILIIL).LIZLLL;
    }
    
    @Override
    public final void LIZIZ(final 10r 10r) {
        if (super.LJIILIIL.isLocalInsertMsg && ((HDi)super.LJIILIIL).baseMessage != null && ((HDi)super.LJIILIIL).baseMessage.LJIIIZ == null) {
            String liziz;
            String liz;
            if (this.LJJIJL()) {
                liziz = 0cB.LIZ(2131831159);
                liz = "pm_mt_msg_host";
            }
            else {
                liziz = 0cB.LIZ(2131831164);
                liz = "pm_mt_msg_viewer";
            }
            final Text ljiiiz = new Text();
            ljiiiz.LIZ = liz;
            ljiiiz.LIZIZ = liziz;
            final TextFormat lizj = new TextFormat();
            lizj.LIZ = "#ffffff";
            ljiiiz.LIZJ = lizj;
            final TextPieceUser lizlll = new TextPieceUser();
            lizlll.LIZ = ((LikeMessage)super.LJIILIIL).LIZLLL;
            final TextPiece textPiece = new TextPiece();
            textPiece.LIZLLL = lizlll;
            final TextFormat liziz2 = new TextFormat();
            liziz2.LIZ = 0II.LIZ("#%x", new Object[] { this.LJJJIL() });
            textPiece.LIZIZ = liziz2;
            textPiece.LIZ = HYX.USER.getPieceType();
            ljiiiz.LIZLLL = Collections.singletonList(textPiece);
            ((HDi)super.LJIILIIL).baseMessage.LJIIIZ = ljiiiz;
        }
        super.LIZIZ(10r);
    }
    
    @Override
    public final boolean LJIILLIIL() {
        return true;
    }
    
    @Override
    public final boolean LJJJJ() {
        return true;
    }
    
    @Override
    public final boolean v_() {
        return true;
    }
    
    @Override
    public final int y_() {
        return 2131234672;
    }
}
