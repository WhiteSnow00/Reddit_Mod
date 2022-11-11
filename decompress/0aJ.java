// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class 0aj
{
    @c(LIZ = "code")
    public int LIZ;
    @c(LIZ = "msg")
    public String LIZIZ;
    
    static {
        Covode.recordClassIndex(5545);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ServerErrorData(code=");
        sb.append(this.LIZ);
        sb.append(", msg=");
        sb.append(this.LIZIZ);
        sb.append(')');
        return sb.toString();
    }
}
