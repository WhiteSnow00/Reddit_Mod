// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.WindowManager;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.view.OrientationEventListener;

public final class 0VJ extends OrientationEventListener
{
    public final /* synthetic */ 0VK LIZ;
    
    static {
        Covode.recordClassIndex(4794);
    }
    
    public 0VJ(final 0VK liz, final Context context) {
        this.LIZ = liz;
        super(context, 3);
    }
    
    public final void onOrientationChanged(int rotation) {
        final WindowManager liziz = this.LIZ.LIZIZ;
        final 0VI lizlll = this.LIZ.LIZLLL;
        if (this.LIZ.LIZIZ != null && lizlll != null) {
            rotation = liziz.getDefaultDisplay().getRotation();
            if (rotation != this.LIZ.LIZ) {
                this.LIZ.LIZ = rotation;
                lizlll.LIZ();
            }
        }
    }
}
