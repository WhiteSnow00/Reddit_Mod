// 
// Decompiled by Procyon v0.6.0
// 

package android.ss.com.vboost;

import android.content.Context;
import com.bytedance.librarian.Librarian;
import android.os.SystemClock;
import X.5pn;
import com.bytedance.covode.number.Covode;

public class CapabilityNativeInf
{
    static {
        Covode.recordClassIndex(6);
        try {
            5pn.LIZ("vboost");
            final long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.LIZ("vboost");
            5pn.LIZ(uptimeMillis, "vboost");
            5pn.LIZIZ("vboost");
        }
        catch (final UnsatisfiedLinkError unsatisfiedLinkError) {
            unsatisfiedLinkError.printStackTrace();
        }
    }
    
    public static native boolean nativeIsSupportCapability(final CapabilityType p0);
    
    public static native void nativeLoadMethod();
    
    public static native void nativeRegisterApplication(final Context p0);
    
    public static native void nativeRequestVibrateCapability(final int p0, final float p1, final float p2, final float p3, final String p4);
}
