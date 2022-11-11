// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.PointerIcon;
import android.os.Build$VERSION;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 087
{
    public Object LIZ;
    
    static {
        Covode.recordClassIndex(860);
    }
    
    public 087(final Object liz) {
        this.LIZ = liz;
    }
    
    public static 087 LIZ(final Context context) {
        if (Build$VERSION.SDK_INT >= 24) {
            return new 087(PointerIcon.getSystemIcon(context, 1002));
        }
        return new 087(null);
    }
}
