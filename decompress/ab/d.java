// 
// Decompiled by Procyon v0.6.0
// 

package ab;

import ad.c0;
import android.media.MediaDrm$MediaDrmStateException;

public final class d
{
    public static boolean a(final Throwable t) {
        return t instanceof MediaDrm$MediaDrmStateException;
    }
    
    public static int b(final Throwable t) {
        final String diagnosticInfo = ((MediaDrm$MediaDrmStateException)t).getDiagnosticInfo();
        final int a = c0.a;
        int int1 = 0;
        Label_0093: {
            if (diagnosticInfo == null) {
                break Label_0093;
            }
            final String[] split = diagnosticInfo.split("_", -1);
            final int length = split.length;
            if (length < 2) {
                break Label_0093;
            }
            final String s = split[length - 1];
            boolean b;
            if (length >= 3 && "neg".equals(split[length - 2])) {
                b = true;
            }
            else {
                b = false;
            }
            try {
                s.getClass();
                int1 = Integer.parseInt(s);
                if (b) {
                    int1 = -int1;
                }
                return c0.s(int1);
            }
            catch (final NumberFormatException ex) {
                return c0.s(int1);
            }
        }
    }
}
