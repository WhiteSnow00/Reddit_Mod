// 
// Decompiled by Procyon v0.6.0
// 

package c2;

import u2.a;
import ah2.f;
import androidx.compose.ui.layout.IntrinsicWidthHeight;
import androidx.compose.ui.layout.IntrinsicMinMax;

public final class d implements r
{
    public final i f;
    public final IntrinsicMinMax g;
    public final IntrinsicWidthHeight h;
    
    public d(final i f, final IntrinsicMinMax g, final IntrinsicWidthHeight h) {
        ah2.f.f((Object)f, "measurable");
        ah2.f.f((Object)g, "minMax");
        ah2.f.f((Object)h, "widthHeight");
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final int C(final int n) {
        return this.f.C(n);
    }
    
    @Override
    public final int D(final int n) {
        return this.f.D(n);
    }
    
    @Override
    public final int F(final int n) {
        return this.f.F(n);
    }
    
    @Override
    public final e0 I(final long n) {
        if (this.h == IntrinsicWidthHeight.Width) {
            int n2;
            if (this.g == IntrinsicMinMax.Max) {
                n2 = this.f.F(a.g(n));
            }
            else {
                n2 = this.f.D(a.g(n));
            }
            return new g(n2, a.g(n));
        }
        int n3;
        if (this.g == IntrinsicMinMax.Max) {
            n3 = this.f.u(a.h(n));
        }
        else {
            n3 = this.f.C(a.h(n));
        }
        return new g(a.h(n), n3);
    }
    
    @Override
    public final Object c() {
        return this.f.c();
    }
    
    @Override
    public final int u(final int n) {
        return this.f.u(n);
    }
}
