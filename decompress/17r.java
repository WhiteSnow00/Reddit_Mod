// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import java.util.concurrent.ScheduledExecutorService;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadFactory;

public final class 17r implements 0HT
{
    public final ThreadFactory LIZ;
    
    static {
        Covode.recordClassIndex(1838);
    }
    
    public 17r(final ThreadFactory liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
    }
    
    @Override
    public final ScheduledExecutorService LIZ() {
        final ThreadFactory liz = this.LIZ;
        final 6uu liz2 = 6ut.LIZ(6v6.SCHEDULED);
        liz2.LIZ(5);
        liz2.LIZ(liz);
        final ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService)6v3.LIZ(liz2.LIZ());
        n.LIZ((Object)scheduledExecutorService, "");
        return scheduledExecutorService;
    }
}
