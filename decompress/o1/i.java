// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import sg2.e;
import android.graphics.Path;
import android.graphics.PathMeasure;

public final class i implements d0
{
    public final PathMeasure a;
    
    public i(final PathMeasure a) {
        this.a = a;
    }
    
    @Override
    public final void a(final h h) {
        final PathMeasure a = this.a;
        Path a2;
        if (h != null) {
            a2 = h.a;
        }
        else {
            a2 = null;
        }
        a.setPath(a2, false);
    }
    
    @Override
    public final boolean b(final float n, final float n2, final h h) {
        e.f((Object)h, "destination");
        return this.a.getSegment(n, n2, h.a, true);
    }
    
    @Override
    public final float getLength() {
        return this.a.getLength();
    }
}
