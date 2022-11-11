// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.io.Closeable;
import com.bytedance.covode.number.Covode;

public final class 0dU
{
    static {
        Covode.recordClassIndex(5854);
    }
    
    public static void LIZ(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        finally {}
    }
}
