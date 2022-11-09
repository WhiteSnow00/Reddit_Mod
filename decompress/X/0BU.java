// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 0bu
{
    public static final 0bu LIZIZ;
    public static final 0bu LIZJ;
    public a LIZ;
    
    static {
        Covode.recordClassIndex(5676);
        LIZIZ = new 0bu(a.RUNNING);
        LIZJ = new 0bu(a.SUCCESS);
    }
    
    public 0bu(final a liz) {
        this.LIZ = liz;
    }
    
    public static 0bu LIZ() {
        return new 0bu(a.FAILED);
    }
    
    public final boolean LIZIZ() {
        return this.LIZ == a.RUNNING;
    }
    
    public enum a
    {
        FAILED(-1), 
        RUNNING(0), 
        SUCCESS(1);
        
        public final int mStatus;
        
        static {
            Covode.recordClassIndex(5677);
        }
        
        public a(final int mStatus) {
            this.mStatus = mStatus;
        }
    }
}
