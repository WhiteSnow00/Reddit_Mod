// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import com.bytedance.covode.number.Covode;

public final class 12g implements 07l
{
    public final /* synthetic */ 12i LIZ;
    
    static {
        Covode.recordClassIndex(299);
    }
    
    public 12g(final 12i liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ() {
        ((View)this.LIZ.LIZJ.getParent()).invalidate();
    }
}
