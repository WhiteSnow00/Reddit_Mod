// 
// Decompiled by Procyon v0.6.0
// 

package cd;

import android.opengl.GLSurfaceView$Renderer;
import android.util.AttributeSet;
import android.content.Context;
import android.opengl.GLSurfaceView;

public final class h extends GLSurfaceView implements i
{
    public final h.h$a f;
    
    public h(final Context context) {
        super(context, (AttributeSet)null);
        final h.h$a h$a = new h.h$a((GLSurfaceView)this);
        this.f = h$a;
        this.setPreserveEGLContextOnPause(true);
        this.setEGLContextClientVersion(2);
        this.setRenderer((GLSurfaceView$Renderer)h$a);
        this.setRenderMode(0);
    }
    
    @Deprecated
    public i getVideoDecoderOutputBufferRenderer() {
        return (i)this;
    }
    
    public void setOutputBuffer(final ab.i i) {
        final h.h$a f = this.f;
        if (f.k.getAndSet(i) == null) {
            f.f.requestRender();
            return;
        }
        throw null;
    }
}
