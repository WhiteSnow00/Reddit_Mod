// 
// Decompiled by Procyon v0.6.0
// 

package r0;

import c2.a;
import java.util.Map;
import ah2.f;
import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import c2.t;

public final class n implements m, t
{
    public final u a;
    public final int b;
    public final boolean c;
    public final float d;
    public final List<g> e;
    public final int f;
    public final /* synthetic */ t g;
    
    public n(final u a, final int b, final boolean c, final float d, final t g, final List e, final int f, final Orientation orientation) {
        ah2.f.f((Object)g, "measureResult");
        ah2.f.f((Object)e, "visibleItemsInfo");
        ah2.f.f((Object)orientation, "orientation");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final int a() {
        return this.f;
    }
    
    public final List<g> b() {
        return this.e;
    }
    
    public final Map<a, Integer> c() {
        return this.g.c();
    }
    
    public final void e() {
        this.g.e();
    }
    
    public final int getHeight() {
        return this.g.getHeight();
    }
    
    public final int getWidth() {
        return this.g.getWidth();
    }
}
