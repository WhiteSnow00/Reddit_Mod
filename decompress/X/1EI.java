// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Map;

public final class 1ei implements 10j
{
    public final Map<Class<? extends IMessage>, 10c<? extends IMessage>> LIZ;
    public final 10r LIZIZ;
    
    static {
        Covode.recordClassIndex(10777);
    }
    
    public 1ei(final 10r liziz) {
        CTM.LIZ((Object)liziz);
        this.LIZIZ = liziz;
        this.LIZ = new HashMap<Class<? extends IMessage>, 10c<? extends IMessage>>();
    }
    
    public final void LIZ() {
        final Iterator<Object> iterator = this.LIZ.entrySet().iterator();
        while (iterator.hasNext()) {
            iterator.next().getValue().LJ();
        }
        this.LIZ.clear();
    }
    
    @Override
    public final <MESSAGE extends IMessage> void LIZ(final Class<MESSAGE> clazz, final 10c<MESSAGE> 10c) {
        CTM.LIZ((Object)clazz, (Object)10c);
        this.LIZ.put(clazz, 10c);
    }
}
