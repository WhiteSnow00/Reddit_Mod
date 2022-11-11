// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;

public final class 080
{
    static {
        Covode.recordClassIndex(849);
    }
    
    public static boolean LIZ(final MotionEvent motionEvent) {
        return (motionEvent.getSource() & 0x2002) == 0x2002;
    }
}
