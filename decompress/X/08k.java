// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Canvas;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.widget.EdgeEffect;

public final class 08k
{
    public EdgeEffect LIZ;
    
    static {
        Covode.recordClassIndex(921);
    }
    
    public 08k(final Context context) {
        this.LIZ = new EdgeEffect(context);
    }
    
    public final void LIZ(final int n, final int n2) {
        this.LIZ.setSize(n, n2);
    }
    
    public final boolean LIZ() {
        this.LIZ.onRelease();
        return this.LIZ.isFinished();
    }
    
    public final boolean LIZ(final float n) {
        this.LIZ.onPull(n);
        return true;
    }
    
    public final boolean LIZ(final Canvas canvas) {
        return this.LIZ.draw(canvas);
    }
}
