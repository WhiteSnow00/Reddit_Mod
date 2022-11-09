// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public enum 0kd
{
    APPLYING(12), 
    CONNECTION_FINISH(30), 
    CONNECTION_FINISH_SUCCEED(31), 
    CONNECTION_START(20), 
    CONNECTION_SUCCEED(21), 
    DISABLED(1), 
    INVITING(11), 
    MATCH(10), 
    STATE_OFFLINE(31), 
    STATE_ONLINE(21), 
    STATE_WAITING(15), 
    UNLOADED(40);
    
    public int LIZIZ;
    
    static {
        Covode.recordClassIndex(7161);
    }
    
    public 0kd(final int liziz) {
        this.LIZIZ = liziz;
    }
    
    public final int getState() {
        return this.LIZIZ;
    }
    
    public final void setState(final int liziz) {
        this.LIZIZ = liziz;
    }
}
