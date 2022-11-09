// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class 0ai
{
    @c(LIZ = "upload_speed")
    public Long LIZ;
    @c(LIZ = "download_speed")
    public Long LIZIZ;
    @c(LIZ = "status")
    public Long LIZJ;
    
    static {
        Covode.recordClassIndex(5544);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ReportData(uploadSpeed=");
        sb.append(this.LIZ);
        sb.append(", downloadSpeed=");
        sb.append(this.LIZIZ);
        sb.append(", status=");
        sb.append(this.LIZJ);
        sb.append(')');
        return sb.toString();
    }
}
