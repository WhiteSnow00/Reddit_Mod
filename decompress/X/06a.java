// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 06a extends RuntimeException
{
    static {
        Covode.recordClassIndex(733);
    }
    
    public 06a() {
        this((String)null);
    }
    
    public 06a(String s) {
        if (s == null) {
            s = "The operation has been canceled.";
        }
        super(s);
    }
}
