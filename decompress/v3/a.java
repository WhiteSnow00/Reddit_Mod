// 
// Decompiled by Procyon v0.6.0
// 

package v3;

import java.util.Locale;
import android.os.Build$VERSION;

public final class a
{
    @Deprecated
    public static boolean a() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b = false;
        if (sdk_INT < 31) {
            boolean b2 = b;
            if (sdk_INT < 30) {
                return b2;
            }
            final String codename = Build$VERSION.CODENAME;
            boolean b3 = false;
            Label_0067: {
                if (!"REL".equals(codename)) {
                    final Locale root = Locale.ROOT;
                    if (codename.toUpperCase(root).compareTo("S".toUpperCase(root)) >= 0) {
                        b3 = true;
                        break Label_0067;
                    }
                }
                b3 = false;
            }
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
    
    public static boolean b() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b = false;
        if (sdk_INT < 33) {
            boolean b2 = b;
            if (sdk_INT < 32) {
                return b2;
            }
            final String codename = Build$VERSION.CODENAME;
            boolean b3 = false;
            Label_0067: {
                if (!"REL".equals(codename)) {
                    final Locale root = Locale.ROOT;
                    if (codename.toUpperCase(root).compareTo("Tiramisu".toUpperCase(root)) >= 0) {
                        b3 = true;
                        break Label_0067;
                    }
                }
                b3 = false;
            }
            b2 = b;
            if (!b3) {
                return b2;
            }
        }
        return true;
    }
}
