// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import ah2.f;
import android.view.RenderNode;

public final class z0
{
    public static final z0 a;
    
    static {
        a = new z0();
    }
    
    public final int a(final RenderNode renderNode) {
        f.f((Object)renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }
    
    public final int b(final RenderNode renderNode) {
        f.f((Object)renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }
    
    public final void c(final RenderNode renderNode, final int ambientShadowColor) {
        f.f((Object)renderNode, "renderNode");
        renderNode.setAmbientShadowColor(ambientShadowColor);
    }
    
    public final void d(final RenderNode renderNode, final int spotShadowColor) {
        f.f((Object)renderNode, "renderNode");
        renderNode.setSpotShadowColor(spotShadowColor);
    }
}
