// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public enum 00v
{
    EVENT_NET("event_net", 1), 
    EVENT_TEMP("event_temp", 0);
    
    public String LIZ;
    public int LIZIZ;
    
    static {
        Covode.recordClassIndex(75);
    }
    
    public 00v(final String liz, final int liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public static 00v valueOf(final int n) {
        for (final 00v 00v : values()) {
            if (n == 00v.LIZIZ) {
                return 00v;
            }
        }
        throw new RuntimeException("Can't find enum type for index: ".concat(String.valueOf(n)));
    }
    
    public final int getIndex() {
        return this.LIZIZ;
    }
    
    public final String getName() {
        return this.LIZ;
    }
}
