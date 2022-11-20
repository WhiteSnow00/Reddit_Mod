// 
// Decompiled by Procyon v0.6.0
// 

package w6;

import java.util.List;
import s6.n;
import s6.d;
import s6.a;
import android.graphics.PointF;

public final class f implements i<PointF, PointF>
{
    public final b f;
    public final b g;
    
    public f(final b f, final b g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final a<PointF, PointF> b() {
        return new n((d)this.f.b(), (d)this.g.b());
    }
    
    @Override
    public final List<c7.a<PointF>> f() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
    
    @Override
    public final boolean h() {
        return this.f.h() && this.g.h();
    }
}
