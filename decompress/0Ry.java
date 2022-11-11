// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.net.URLEncoder;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public final class 0Ry
{
    static {
        Covode.recordClassIndex(4467);
    }
    
    public static String LIZ(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return null;
        }
        try {
            final MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(s.getBytes());
            final byte[] digest = instance.digest();
            final StringBuilder sb = new StringBuilder();
            for (int length = digest.length, i = 0; i < length; ++i) {
                final int n = digest[i] & 0xFF;
                if (n < 16) {
                    sb.append(0);
                }
                sb.append(Integer.toString(n, 16));
            }
            return sb.toString();
        }
        catch (final NoSuchAlgorithmException ex) {
            0II.LIZ(ex);
            return null;
        }
    }
    
    public static String LIZIZ(String encode) {
        if (TextUtils.isEmpty((CharSequence)encode)) {
            return encode;
        }
        try {
            encode = URLEncoder.encode(encode, "UTF-8");
            return encode;
        }
        finally {
            return encode;
        }
    }
    
    public static String LIZJ(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return string;
        }
        try {
            final StringBuilder sb = new StringBuilder();
            for (int length = string.length(), i = 0; i < length; ++i) {
                final char char1 = string.charAt(i);
                if (char1 > '\u001f' && char1 < '\u007f') {
                    sb.append(char1);
                }
                else {
                    sb.append(0II.LIZ("\\u%04x", new Object[] { (int)char1 }));
                }
            }
            string = sb.toString();
            return string;
        }
        finally {
            return string;
        }
    }
    
    public static String LIZLLL(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return s;
        }
        final StringBuilder sb = new StringBuilder();
        for (final char c : s.toCharArray()) {
            if (c >= ' ' && c != '\u007f') {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
