// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.node;

import e2.x;
import u2.a;
import c2.h0;
import ng2.e;
import c2.j;
import c2.u;

public final class c implements u
{
    public final j f;
    public final NodeMeasuringIntrinsics$IntrinsicMinMax g;
    public final NodeMeasuringIntrinsics$IntrinsicWidthHeight h;
    
    public c(final j f, final NodeMeasuringIntrinsics$IntrinsicMinMax g, final NodeMeasuringIntrinsics$IntrinsicWidthHeight h) {
        e.f((Object)g, "minMax");
        e.f((Object)h, "widthHeight");
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final int L(final int n) {
        return this.f.L(n);
    }
    
    public final Object b() {
        return this.f.b();
    }
    
    public final int l0(final int n) {
        return this.f.l0(n);
    }
    
    public final int r0(final int n) {
        return this.f.r0(n);
    }
    
    public final h0 s0(final long n) {
        if (this.h == NodeMeasuringIntrinsics$IntrinsicWidthHeight.Width) {
            int n2;
            if (this.g == NodeMeasuringIntrinsics$IntrinsicMinMax.Max) {
                n2 = this.f.r0(a.g(n));
            }
            else {
                n2 = this.f.l0(a.g(n));
            }
            return new x(n2, a.g(n));
        }
        int n3;
        if (this.g == NodeMeasuringIntrinsics$IntrinsicMinMax.Max) {
            n3 = this.f.t(a.h(n));
        }
        else {
            n3 = this.f.L(a.h(n));
        }
        return new x(a.h(n), n3);
    }
    
    public final int t(final int n) {
        return this.f.t(n);
    }
}
