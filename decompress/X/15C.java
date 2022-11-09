// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 15c implements b
{
    static {
        Covode.recordClassIndex(1175);
    }
    
    @Override
    public final boolean LIZ(final float[] array) {
        if (array[2] < 0.95f) {
            if (array[2] > 0.05f) {
                if (array[0] < 10.0f || array[0] > 37.0f || array[1] > 0.82f) {
                    return true;
                }
            }
        }
        return false;
    }
}
