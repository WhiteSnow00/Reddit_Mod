// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class 0ag
{
    @c(LIZ = "upload_speed")
    public Long LIZ;
    @c(LIZ = "download_speed")
    public Long LIZIZ;
    
    static {
        Covode.recordClassIndex(5542);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("RealTime(uploadSpeed=");
        sb.append(this.LIZ);
        sb.append(", downloadSpeed=");
        sb.append(this.LIZIZ);
        sb.append(')');
        return sb.toString();
    }
}
