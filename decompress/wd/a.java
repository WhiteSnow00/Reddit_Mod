// 
// Decompiled by Procyon v0.6.0
// 

package wd;

import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.Signature;
import android.content.pm.PackageInfo;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import yd.c;
import android.content.Context;

public final class a
{
    @Deprecated
    public static byte[] a(final Context context, final String s) throws PackageManager$NameNotFoundException {
        final PackageInfo b = c.a(context).b(64, s);
        final Signature[] signatures = b.signatures;
        Label_0074: {
            if (signatures == null || signatures.length != 1) {
                break Label_0074;
            }
            int n = 0;
        Label_0045_Outer:
            while (true) {
                Label_0051: {
                    if (n >= 2) {
                        break Label_0051;
                    }
                    while (true) {
                        try {
                            MessageDigest instance;
                            if ((instance = MessageDigest.getInstance("SHA1")) == null) {
                                ++n;
                                continue Label_0045_Outer;
                            }
                            while (true) {
                                if (instance == null) {
                                    return null;
                                }
                                return instance.digest(b.signatures[0].toByteArray());
                                instance = null;
                                continue;
                            }
                        }
                        catch (final NoSuchAlgorithmException ex) {
                            continue;
                        }
                        break;
                    }
                }
                break;
            }
        }
    }
}
