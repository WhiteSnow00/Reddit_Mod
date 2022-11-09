// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.TypedArray;
import com.bytedance.covode.number.Covode;

public final class 06t
{
    static {
        Covode.recordClassIndex(757);
    }
    
    public static final void LIZ(final TypedArray typedArray, final int n) {
        if (typedArray.hasValue(n)) {
            return;
        }
        throw new IllegalArgumentException("Attribute not defined in set.");
    }
    
    public static final boolean LIZ(final TypedArray typedArray) {
        CTM.LIZ((Object)typedArray);
        LIZ(typedArray, 0);
        return typedArray.getBoolean(0, false);
    }
    
    public static final int LIZIZ(final TypedArray typedArray) {
        CTM.LIZ((Object)typedArray);
        LIZ(typedArray, 2);
        return typedArray.getInt(2, 0);
    }
    
    public static final int LIZIZ(final TypedArray typedArray, final int n) {
        CTM.LIZ((Object)typedArray);
        LIZ(typedArray, n);
        return typedArray.getColor(n, 0);
    }
}
