// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 0M5
{
    public int LIZ;
    public String LIZIZ;
    
    static {
        Covode.recordClassIndex(2504);
    }
    
    public static a LIZ() {
        return new a((byte)0);
    }
    
    @Override
    public final String toString() {
        final int liz = this.LIZ;
        final 6Ig ljiiljjil = S46.LJIILJJIL;
        final Integer value = liz;
        S46 liz2;
        if (!ljiiljjil.containsKey((Object)value)) {
            liz2 = S46.LIZ;
        }
        else {
            liz2 = (S46)S46.LJIILJJIL.get((Object)value);
        }
        final String string = liz2.toString();
        final String liziz = this.LIZIZ;
        final StringBuilder sb = new StringBuilder();
        sb.append("Response Code: ");
        sb.append(string);
        sb.append(", Debug Message: ");
        sb.append(liziz);
        return sb.toString();
    }
    
    public static final class a
    {
        public int LIZ;
        public String LIZIZ = "";
        
        static {
            Covode.recordClassIndex(2505);
        }
        
        public a() {
            this.LIZIZ = "";
        }
        
        public final 0M5 LIZ() {
            final 0M5 0m5 = new 0M5();
            0m5.LIZ = this.LIZ;
            0m5.LIZIZ = this.LIZIZ;
            return 0m5;
        }
    }
}
