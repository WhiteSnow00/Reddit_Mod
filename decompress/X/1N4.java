// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.List;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.message.ChatMessage;

public final class 1n4 extends 1eU<ChatMessage>
{
    static {
        Covode.recordClassIndex(10805);
    }
    
    private boolean LIZ(final ChatMessage chatMessage, final 10r 10r) {
        CTM.LIZ((Object)chatMessage, (Object)10r);
        final List ljiiljjil = chatMessage.LJIILJJIL;
        return ljiiljjil != null && !ljiiljjil.isEmpty() && super.LIZ(chatMessage, 10r);
    }
}
