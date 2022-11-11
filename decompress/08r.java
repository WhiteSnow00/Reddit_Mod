// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import android.view.animation.Interpolator;

public final class 08r implements Interpolator
{
    static {
        Covode.recordClassIndex(930);
    }
    
    public final float getInterpolation(float n) {
        --n;
        return n * n * n * n * n + 1.0f;
    }
}
