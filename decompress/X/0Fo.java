// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.PorterDuff$Mode;
import com.bytedance.covode.number.Covode;

public final class 0fo
{
    static {
        Covode.recordClassIndex(6142);
    }
    
    public static PorterDuff$Mode LIZ(final int n, final PorterDuff$Mode porterDuff$Mode) {
        if (n == 3) {
            return PorterDuff$Mode.SRC_OVER;
        }
        if (n == 5) {
            return PorterDuff$Mode.SRC_IN;
        }
        if (n == 9) {
            return PorterDuff$Mode.SRC_ATOP;
        }
        switch (n) {
            default: {
                return porterDuff$Mode;
            }
            case 14: {
                return PorterDuff$Mode.MULTIPLY;
            }
            case 15: {
                return PorterDuff$Mode.SCREEN;
            }
            case 16: {
                return PorterDuff$Mode.ADD;
            }
        }
    }
}
