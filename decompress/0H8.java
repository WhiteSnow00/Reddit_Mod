// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Build$VERSION;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import android.text.TextUtils;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public final class 0H8
{
    static {
        Covode.recordClassIndex(1813);
    }
    
    public static Bundle LIZ(final String s, final String[] array) {
        return LIZ(s, array, -1, 0, null);
    }
    
    public static Bundle LIZ(final String s, final String[] array, final int n, final int n2, final String s2) {
        final Bundle bundle = new Bundle();
        if (LIZ()) {
            bundle.putString("android:query-arg-sql-selection", s);
            bundle.putStringArray("android:query-arg-sql-selection-args", array);
            if (TextUtils.isEmpty((CharSequence)s2)) {
                bundle.putString("android:query-arg-sql-sort-order", "_id DESC");
            }
            else {
                bundle.putString("android:query-arg-sql-sort-order", s2);
            }
            if (LIZ() && n > 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append(n);
                sb.append(" offset ");
                sb.append(n2);
                bundle.putString("android:query-arg-sql-limit", sb.toString());
            }
        }
        return bundle;
    }
    
    public static String LIZ(String s) {
        final int length = s.length();
        final char[] charArray = s.toCharArray();
        int i = 0;
        int n = 0;
        int n2 = 0;
        while (i < length) {
            final char c = charArray[i];
            int n3 = 0;
            Label_0059: {
                if (c == '/') {
                    n3 = n2;
                    if (n == 47) {
                        break Label_0059;
                    }
                }
                charArray[n2] = c;
                n3 = n2 + 1;
            }
            ++i;
            n = c;
            n2 = n3;
        }
        int n4 = n2;
        if (n == 47) {
            n4 = n2;
            if (length > 1) {
                n4 = n2 - 1;
            }
        }
        if (n4 != length) {
            s = new String(charArray, 0, n4);
        }
        return s;
    }
    
    public static void LIZ(final InputStream inputStream) {
        if (inputStream == null) {
            return;
        }
        try {
            inputStream.close();
        }
        catch (final IOException ex) {}
    }
    
    public static void LIZ(final OutputStream outputStream) {
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.close();
        }
        catch (final IOException ex) {}
    }
    
    public static boolean LIZ() {
        return Build$VERSION.SDK_INT >= 29;
    }
    
    public static boolean LIZIZ() {
        return Build$VERSION.SDK_INT >= 30;
    }
}
