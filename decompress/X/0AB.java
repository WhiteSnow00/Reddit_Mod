// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class 0ab
{
    @c(LIZ = "data")
    public final String LIZ;
    
    static {
        Covode.recordClassIndex(5537);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("DownloadData(data='");
        sb.append(this.LIZ);
        sb.append("')");
        return sb.toString();
    }
}
