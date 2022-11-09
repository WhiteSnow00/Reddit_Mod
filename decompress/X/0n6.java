// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public enum 0n6
{
    BATTLE_END(2), 
    OPT_OUT_UPDATE(3), 
    SCORE_UPDATE(1), 
    UNKNOWN(0);
    
    public final int LIZIZ;
    
    static {
        Covode.recordClassIndex(7774);
    }
    
    public 0n6(final int liziz) {
        this.LIZIZ = liziz;
    }
    
    public final int getValue() {
        return this.LIZIZ;
    }
}
