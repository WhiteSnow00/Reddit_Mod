// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.model.message.ChatMessage;
import kotlin.jvm.internal.n;
import java.util.LinkedHashSet;
import com.bytedance.covode.number.Covode;
import java.util.Set;

public final class 10s
{
    public static final Set<Long> LIZ;
    public static final 10s LIZIZ;
    
    static {
        Covode.recordClassIndex(10754);
        LIZIZ = new 10s();
        LIZ = new LinkedHashSet<Long>();
    }
    
    public final void LIZ(final 2Hn 2Hn) {
        CTM.LIZ((Object)2Hn);
        final Set<Long> liz = 10s.LIZ;
        final H31 ljiiliil = 2Hn.LJIILIIL;
        n.LIZIZ((Object)ljiiliil, "");
        liz.remove(((ChatMessage)ljiiliil).LIZ);
    }
    
    public final boolean LIZ(final ChatMessage chatMessage) {
        CTM.LIZ((Object)chatMessage);
        return 10s.LIZ.contains(chatMessage.LIZ);
    }
}
