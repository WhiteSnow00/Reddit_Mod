// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class 1iW extends OV3
{
    public int LIZ;
    
    static {
        Covode.recordClassIndex(6053);
    }
    
    public 1iW(final Context context, final AttributeSet set) {
        this(context, set, (byte)0);
    }
    
    public 1iW(final Context context, final AttributeSet set, final byte b) {
        super(context, set, (byte)0);
        this.setVisibility(this.getVisibility());
    }
    
    public void onVisibilityChanged(final View view, final int n) {
        super.onVisibilityChanged(view, n);
        if (view != this) {
            if (n != 0) {
                super.setVisibility(8);
                return;
            }
            super.setVisibility(this.LIZ);
        }
    }
    
    public void setVisibility(final int n) {
        if (this.getContext() != null) {
            super.setVisibility(n);
            this.LIZ = n;
        }
    }
}
