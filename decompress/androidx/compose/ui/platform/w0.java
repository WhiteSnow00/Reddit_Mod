// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import sg2.e;
import android.view.RenderNode;

public final class w0
{
    public static final w0 a;
    
    static {
        a = new w0();
    }
    
    public final void a(final RenderNode renderNode) {
        e.f((Object)renderNode, "renderNode");
        renderNode.discardDisplayList();
    }
}
