// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.graphics.drawable.Drawable;

public class 0eJ
{
    public final int LIZ;
    public final Drawable LIZIZ;
    
    static {
        Covode.recordClassIndex(5956);
    }
    
    public 0eJ() {
        this.LIZ = -1;
    }
    
    public 0eJ(final int liz) {
        this.LIZ = liz;
    }
    
    public Drawable LIZ(final Context context) {
        final int liz = this.LIZ;
        if (liz != -1) {
            return 01s.LIZIZ(context, liz);
        }
        return this.LIZIZ;
    }
}
