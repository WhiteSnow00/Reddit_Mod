// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public enum 0k2
{
    APPLY("apply"), 
    IDLE("idle"), 
    INVITEE("invitee"), 
    INVITER("inviter");
    
    public final String LIZIZ;
    
    static {
        Covode.recordClassIndex(7061);
    }
    
    public 0k2(final String liziz) {
        this.LIZIZ = liziz;
    }
    
    public final String getLabel() {
        return this.LIZIZ;
    }
}
