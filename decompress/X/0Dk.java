// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Build$VERSION;
import com.bytedance.covode.number.Covode;

public final class 0Dk
{
    public static final boolean LIZ;
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    
    static {
        Covode.recordClassIndex(1463);
        boolean lizj = true;
        LIZ = true;
        LIZIZ = true;
        if (Build$VERSION.SDK_INT < 28) {
            lizj = false;
        }
        LIZJ = lizj;
    }
}
