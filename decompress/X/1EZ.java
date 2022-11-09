// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.HashMap;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Map;

public final class 1ez implements 10k
{
    public final Map<Class<? extends IMessage>, 10e<? extends IMessage>> LIZ;
    
    static {
        Covode.recordClassIndex(10803);
    }
    
    public 1ez() {
        this.LIZ = new HashMap<Class<? extends IMessage>, 10e<? extends IMessage>>();
    }
    
    @Override
    public final <MESSAGE extends IMessage> void LIZ(final Class<MESSAGE> clazz, final 10e<MESSAGE> 10e) {
        CTM.LIZ((Object)clazz, (Object)10e);
        this.LIZ.put(clazz, 10e);
    }
}
