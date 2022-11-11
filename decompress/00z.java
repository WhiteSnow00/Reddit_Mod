// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public enum 00z
{
    BEGIN(1), 
    END(2);
    
    public int LIZ;
    
    static {
        Covode.recordClassIndex(88);
    }
    
    public 00z(final int liz) {
        this.LIZ = liz;
    }
    
    public final int getStatus() {
        return this.LIZ;
    }
}
