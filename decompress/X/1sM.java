// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.TextUtils$TruncateAt;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 1sm extends 1ib
{
    public 1iO LIZ;
    
    static {
        Covode.recordClassIndex(5929);
    }
    
    public 1sm(final Context context) {
        super(context);
    }
    
    @Override
    public final void LIZ(final AttributeSet set, final int n) {
        super.LIZ(set, n);
        (this.LIZ = new 1iO(this)).LIZ(set, n, 0);
        this.setGravity(17);
        this.setLines(1);
        this.setEllipsize(TextUtils$TruncateAt.END);
    }
}
