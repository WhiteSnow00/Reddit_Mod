// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.app;

import androidx.core.app.RemoteActionCompat;
import X.0GY;
import com.bytedance.covode.number.Covode;

public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer
{
    static {
        Covode.recordClassIndex(98);
    }
    
    public static RemoteActionCompat read(final 0GY 0gy) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(0gy);
    }
    
    public static void write(final RemoteActionCompat remoteActionCompat, final 0GY 0gy) {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, 0gy);
    }
}
