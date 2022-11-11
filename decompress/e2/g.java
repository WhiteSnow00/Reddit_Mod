// 
// Decompiled by Procyon v0.6.0
// 

package e2;

import sg2.e;
import androidx.compose.ui.node.LayoutNodeWrapper;
import j1.d;

public class g<T extends g<T, M>, M extends d>
{
    public final LayoutNodeWrapper f;
    public final M g;
    public T h;
    public boolean i;
    
    public g(final LayoutNodeWrapper f, final M g) {
        e.f((Object)f, "layoutNodeWrapper");
        e.f((Object)g, "modifier");
        this.f = f;
        this.g = g;
    }
    
    public void a() {
        this.i = true;
    }
    
    public void b() {
        this.i = false;
    }
}
