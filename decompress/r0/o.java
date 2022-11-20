// 
// Decompiled by Procyon v0.6.0
// 

package r0;

import c2.a;
import java.util.Map;
import ng2.e;
import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import c2.w;

public final class o implements n, w
{
    public final v a;
    public final int b;
    public final boolean c;
    public final float d;
    public final List<g> e;
    public final int f;
    public final w g;
    
    public o(final v a, final int b, final boolean c, final float d, final w g, final List e, final int f, final Orientation orientation) {
        ng2.e.f((Object)g, "measureResult");
        ng2.e.f((Object)e, "visibleItemsInfo");
        ng2.e.f((Object)orientation, "orientation");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final int a() {
        return this.f;
    }
    
    @Override
    public final List<g> b() {
        return this.e;
    }
    
    @Override
    public final Map<a, Integer> c() {
        return this.g.c();
    }
    
    @Override
    public final void e() {
        this.g.e();
    }
    
    @Override
    public final int getHeight() {
        return this.g.getHeight();
    }
    
    @Override
    public final int getWidth() {
        return this.g.getWidth();
    }
}
