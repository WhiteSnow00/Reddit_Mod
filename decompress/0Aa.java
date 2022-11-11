// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class 0aa
{
    @c(LIZ = "ack_id")
    public int LIZ;
    
    static {
        Covode.recordClassIndex(5536);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("DownloadAckData(ackId=");
        sb.append(this.LIZ);
        sb.append(')');
        return sb.toString();
    }
}
