// 
// Decompiled by Procyon v0.6.0
// 

package q0;

import c2.a;
import java.util.Map;
import ng2.e;
import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import c2.w;

public final class p implements o, w
{
    public final t a;
    public final int b;
    public final boolean c;
    public final float d;
    public final List<k> e;
    public final int f;
    public final int g;
    public final int h;
    public final w i;
    
    public p(final t a, final int b, final boolean c, final float d, final w i, final List e, final int f, final int g, final int h, final Orientation orientation) {
        ng2.e.f((Object)i, "measureResult");
        ng2.e.f((Object)e, "visibleItemsInfo");
        ng2.e.f((Object)orientation, "orientation");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final int a() {
        return this.h;
    }
    
    public final List<k> b() {
        return this.e;
    }
    
    public final Map<a, Integer> c() {
        return this.i.c();
    }
    
    public final int d() {
        return this.f;
    }
    
    public final void e() {
        this.i.e();
    }
    
    public final int f() {
        return this.g;
    }
    
    public final int getHeight() {
        return this.i.getHeight();
    }
    
    public final int getWidth() {
        return this.i.getWidth();
    }
}
