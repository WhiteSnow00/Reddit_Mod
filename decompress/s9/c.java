// 
// Decompiled by Procyon v0.6.0
// 

package s9;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;

public final class c implements SurfaceTexture$OnFrameAvailableListener
{
    public SurfaceTexture f;
    public SurfaceTexture$OnFrameAvailableListener g;
    
    public c(final int n) {
        (this.f = new SurfaceTexture(n)).setOnFrameAvailableListener((SurfaceTexture$OnFrameAvailableListener)this);
    }
    
    public final void onFrameAvailable(final SurfaceTexture surfaceTexture) {
        final SurfaceTexture$OnFrameAvailableListener g = this.g;
        if (g != null) {
            g.onFrameAvailable(this.f);
        }
    }
}
