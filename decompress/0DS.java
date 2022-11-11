// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import java.util.List;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent$Sender;
import com.bytedance.covode.number.Covode;

public interface 0ds
{
    default static {
        Covode.recordClassIndex(5888);
    }
    
    void LIZ(final String p0, final int p1, final ISendCommentEvent$Sender p2);
    
    void LIZ(final List<? extends EmoteModel> p0, final ISendCommentEvent$Sender p1);
}
