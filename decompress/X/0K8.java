// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public enum 0k8
{
    FLOATING("float"), 
    FLOATING_FIX("float_fix"), 
    GRID("grid"), 
    GRID_FIX("grid_fix"), 
    NORMAL("normal"), 
    ONE_TO_N("1vN");
    
    public String LIZIZ;
    
    static {
        Covode.recordClassIndex(7096);
    }
    
    public 0k8(final String liziz) {
        this.LIZIZ = liziz;
    }
    
    public final String getStrVal() {
        return this.LIZIZ;
    }
    
    public final void setStrVal(final String liziz) {
        CTM.LIZ((Object)liziz);
        this.LIZIZ = liziz;
    }
}
