// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class 1mo extends 1Ev
{
    public String LIZ;
    public String LIZIZ;
    
    static {
        Covode.recordClassIndex(10463);
    }
    
    public 1mo(final int n, final String liz, final String liziz) {
        super(n);
        if (TextUtils.isEmpty((CharSequence)liz)) {
            this.LIZ = "";
        }
        else {
            this.LIZ = liz;
        }
        if (TextUtils.isEmpty((CharSequence)liziz)) {
            this.LIZIZ = "";
            return;
        }
        this.LIZIZ = liziz;
    }
    
    @Override
    public final String getMessage() {
        final StringBuilder sb = new StringBuilder(" TYPE = CustomApiServerException, url = ");
        sb.append(this.LIZ);
        sb.append(", xTtLogId = ");
        sb.append(this.LIZIZ);
        sb.append("  ");
        sb.append(super.getMessage());
        return sb.toString();
    }
    
    public final String getUrl() {
        return this.LIZ;
    }
    
    public final String getxTtLogId() {
        return this.LIZIZ;
    }
}
