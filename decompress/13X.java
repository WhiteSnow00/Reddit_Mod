// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import android.content.Context;
import java.lang.ref.WeakReference;

public final class 13X extends 03s
{
    public final WeakReference<Context> LIZ;
    
    static {
        Covode.recordClassIndex(501);
    }
    
    @Override
    public final Drawable getDrawable(final int n) {
        final Drawable drawable = super.getDrawable(n);
        final Context context = this.LIZ.get();
        if (drawable != null && context != null) {
            03r.LIZ().LIZ(context, n, drawable);
        }
        return drawable;
    }
}
