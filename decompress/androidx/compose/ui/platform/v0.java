// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.graphics.RenderEffect;
import a4.k1;
import sg2.e;
import o1.g0;
import android.graphics.RenderNode;

public final class v0
{
    public static final v0 a;
    
    static {
        a = new v0();
    }
    
    public final void a(final RenderNode renderNode, final g0 g0) {
        e.f((Object)renderNode, "renderNode");
        RenderEffect a;
        if (g0 != null) {
            if ((a = g0.a) == null) {
                a = g0.a();
                g0.a = a;
            }
        }
        else {
            a = null;
        }
        k1.b(renderNode, a);
    }
}
