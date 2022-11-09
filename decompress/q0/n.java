// 
// Decompiled by Procyon v0.6.0
// 

package q0;

import c2.a;
import java.util.Map;
import ah2.f;
import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import c2.t;

public final class n implements m, t
{
    public final s a;
    public final int b;
    public final boolean c;
    public final float d;
    public final List<j> e;
    public final int f;
    public final int g;
    public final int h;
    public final /* synthetic */ t i;
    
    public n(final s a, final int b, final boolean c, final float d, final t i, final List e, final int f, final int g, final int h, final Orientation orientation) {
        ah2.f.f((Object)i, "measureResult");
        ah2.f.f((Object)e, "visibleItemsInfo");
        ah2.f.f((Object)orientation, "orientation");
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
    
    @Override
    public final int a() {
        return this.h;
    }
    
    @Override
    public final List<j> b() {
        return this.e;
    }
    
    @Override
    public final Map<a, Integer> c() {
        return this.i.c();
    }
    
    @Override
    public final int d() {
        return this.f;
    }
    
    @Override
    public final void e() {
        this.i.e();
    }
    
    @Override
    public final int f() {
        return this.g;
    }
    
    @Override
    public final int getHeight() {
        return this.i.getHeight();
    }
    
    @Override
    public final int getWidth() {
        return this.i.getWidth();
    }
}
