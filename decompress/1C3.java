// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.Choreographer;
import android.view.Choreographer$FrameCallback;
import com.bytedance.covode.number.Covode;

public final class 1C3 implements a
{
    static {
        Covode.recordClassIndex(2419);
    }
    
    @Override
    public final void LIZ(final Choreographer$FrameCallback choreographer$FrameCallback) {
        Choreographer.getInstance().postFrameCallback(choreographer$FrameCallback);
    }
    
    @Override
    public final void LIZIZ(final Choreographer$FrameCallback choreographer$FrameCallback) {
        Choreographer.getInstance().removeFrameCallback(choreographer$FrameCallback);
    }
}
