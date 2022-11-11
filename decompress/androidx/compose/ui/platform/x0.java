// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import sg2.e;
import android.view.RenderNode;

public final class x0
{
    public static final x0 a;
    
    static {
        a = new x0();
    }
    
    public final int a(final RenderNode renderNode) {
        e.f((Object)renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }
    
    public final int b(final RenderNode renderNode) {
        e.f((Object)renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }
    
    public final void c(final RenderNode renderNode, final int ambientShadowColor) {
        e.f((Object)renderNode, "renderNode");
        renderNode.setAmbientShadowColor(ambientShadowColor);
    }
    
    public final void d(final RenderNode renderNode, final int spotShadowColor) {
        e.f((Object)renderNode, "renderNode");
        renderNode.setSpotShadowColor(spotShadowColor);
    }
}
