// 
// Decompiled by Procyon v0.6.0
// 

package x6;

import java.util.List;
import t6.n;
import t6.d;
import t6.a;
import android.graphics.PointF;

public final class g implements j<PointF, PointF>
{
    public final b f;
    public final b g;
    
    public g(final b f, final b g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final a<PointF, PointF> b() {
        return new n((d)this.f.b(), (d)this.g.b());
    }
    
    @Override
    public final boolean e() {
        return this.f.e() && this.g.e();
    }
    
    @Override
    public final List<d7.a<PointF>> g() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
