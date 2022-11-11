// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.CompoundButton;
import com.bytedance.covode.number.Covode;
import android.widget.CompoundButton$OnCheckedChangeListener;

public final class 0wd implements CompoundButton$OnCheckedChangeListener
{
    public final /* synthetic */ 39d LIZ;
    
    static {
        Covode.recordClassIndex(10137);
    }
    
    public 0wd(final 39d liz) {
        this.LIZ = liz;
    }
    
    public final void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
        this.LIZ.element = b;
    }
}
