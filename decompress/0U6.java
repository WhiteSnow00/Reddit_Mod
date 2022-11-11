// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public enum 0U6
{
    CLOSED("closed"), 
    EXPIRED("expired"), 
    FAILED("failed"), 
    INIT("init"), 
    SUCCESS("success"), 
    UNKNOW("unknow");
    
    public String LIZ;
    
    static {
        Covode.recordClassIndex(4691);
    }
    
    public 0U6(final String liz) {
        this.LIZ = liz;
    }
    
    public static 0U6 getOrderStatus(final String s) {
        for (final 0U6 0u6 : values()) {
            if (TextUtils.equals((CharSequence)0u6.LIZ, (CharSequence)s)) {
                return 0u6;
            }
        }
        return 0U6.UNKNOW;
    }
    
    public final String getStatus() {
        return this.LIZ;
    }
}
