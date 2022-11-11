// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class 0an
{
    @c(LIZ = "data")
    public String LIZ;
    
    static {
        Covode.recordClassIndex(5549);
    }
    
    public 0an() {
        this.LIZ = "";
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("UploadData(data='");
        sb.append(this.LIZ);
        sb.append("')");
        return sb.toString();
    }
}
