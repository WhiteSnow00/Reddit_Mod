// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public enum 0ap
{
    ServerDetectionFailure(1, "server detect failure"), 
    SocketHadClosedFailure(3, "socket had closed"), 
    SocketOnFailureCallbackFailure(4, "on socket failure"), 
    UrlEmptyFailure(2, "url is empty or blank");
    
    public final int LIZIZ;
    public final String LIZJ;
    
    static {
        Covode.recordClassIndex(5550);
    }
    
    public 0ap(final int liziz, final String lizj) {
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    public final int getCode() {
        return this.LIZIZ;
    }
    
    public final String getMessage() {
        return this.LIZJ;
    }
}
