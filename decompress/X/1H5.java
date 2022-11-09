// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Path;
import java.util.List;
import com.bytedance.covode.number.Covode;
import android.graphics.PathMeasure;
import android.graphics.PointF;

public final class 1h5 extends 1BN<PointF>
{
    public final PointF LJ;
    public final float[] LJFF;
    public 1BO LJI;
    public PathMeasure LJII;
    
    static {
        Covode.recordClassIndex(2261);
    }
    
    public 1h5(final List<? extends 0LG<PointF>> list) {
        super(list);
        this.LJ = new PointF();
        this.LJFF = new float[2];
        if (0KM.a.LIZ) {
            this.LJII = new PathMeasure();
        }
    }
}
