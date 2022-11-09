// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.io.IOException;
import java.io.Closeable;
import com.bytedance.covode.number.Covode;

public final class 0Rz
{
    static {
        Covode.recordClassIndex(4468);
    }
    
    public static void LIZ(final Closeable... array) {
        int n = 0;
        do {
            final Closeable closeable = array[0];
            if (closeable != null) {
                try {
                    closeable.close();
                }
                catch (final IOException ex) {
                    0II.LIZ(ex);
                }
            }
        } while (++n <= 0);
    }
}
