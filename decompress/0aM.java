// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class 0am
{
    @c(LIZ = "ack_id")
    public int LIZ;
    @c(LIZ = "upload_speed")
    public Long LIZIZ;
    @c(LIZ = "download_speed")
    public Long LIZJ;
    
    static {
        Covode.recordClassIndex(5548);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("UploadAckData(ackId=");
        sb.append(this.LIZ);
        sb.append(", uploadSpeed=");
        sb.append(this.LIZIZ);
        sb.append(", downloadSpeed=");
        sb.append(this.LIZJ);
        sb.append(')');
        return sb.toString();
    }
}
