// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.drawable.Drawable;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 0ep
{
    public final 0en LIZ;
    
    static {
        Covode.recordClassIndex(5998);
    }
    
    public 0ep() {
        this.LIZ = new 0en();
    }
    
    public final Drawable LIZ(final Context context, final int n) {
        if (context == null) {
            return null;
        }
        final 0eq lj = 0dw.a.LIZ.LJ;
        Drawable drawable;
        if (lj == null || (drawable = lj.LIZ(context, n)) == null) {
            drawable = 01s.LIZIZ(context, n);
        }
        return drawable;
    }
    
    public final boolean LIZ(final int n, final boolean b) {
        return this.LIZ.LIZ(n, b);
    }
    
    public static final class a
    {
        public static final 0ep LIZ;
        
        static {
            Covode.recordClassIndex(5999);
            LIZ = new 0ep((byte)0);
        }
    }
}
