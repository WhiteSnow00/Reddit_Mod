// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class 1aK extends 9Mp
{
    @c(LIZ = "interact_id")
    public final String LIZ;
    @c(LIZ = "position")
    public final int LIZIZ;
    @c(LIZ = "video_mute")
    public final boolean LIZJ;
    
    static {
        Covode.recordClassIndex(9833);
    }
    
    public 1aK() {
        this(null, 0, false, 7);
    }
    
    public 1aK(final String liz, final int liziz, final boolean lizj) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    public final Object[] getObjects() {
        return new Object[] { this.LIZ, this.LIZIZ, this.LIZJ };
    }
}
