// 
// Decompiled by Procyon v0.6.0
// 

package wf2;

import java.util.concurrent.ThreadFactory;
import io.reactivex.internal.schedulers.RxThreadFactory;
import ff2.b0;

public final class e extends b0
{
    public static final RxThreadFactory c;
    public final ThreadFactory b;
    
    static {
        c = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5))));
    }
    
    public e() {
        this(e.c);
    }
    
    public e(final ThreadFactory b) {
        this.b = b;
    }
    
    public final b0.c a() {
        return new f(this.b);
    }
}
