// 
// Decompiled by Procyon v0.6.0
// 

package zc;

import java.util.regex.Matcher;
import android.util.Log;
import android.text.TextUtils;
import java.util.regex.Pattern;

public final class o
{
    public static final Pattern a;
    public static final Pattern b;
    
    static {
        a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
        b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");
    }
    
    public static String a(final long n, final long n2) {
        if (n == 0L && n2 == -1L) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("bytes=");
        sb.append(n);
        sb.append("-");
        if (n2 != -1L) {
            sb.append(n + n2 - 1L);
        }
        return sb.toString();
    }
    
    public static long b(final String s, final String s2) {
        long long1 = 0L;
        Label_0072: {
            if (!TextUtils.isEmpty((CharSequence)s)) {
                try {
                    long1 = Long.parseLong(s);
                    break Label_0072;
                }
                catch (final NumberFormatException ex) {
                    final StringBuilder sb = new StringBuilder(u10.o.e(s, 28));
                    sb.append("Unexpected Content-Length [");
                    sb.append(s);
                    sb.append("]");
                    Log.e("HttpUtil", sb.toString());
                }
            }
            long1 = -1L;
        }
        long max = long1;
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            final Matcher matcher = o.a.matcher(s2);
            max = long1;
            if (matcher.matches()) {
                try {
                    final String group = matcher.group(2);
                    group.getClass();
                    final long long2 = Long.parseLong(group);
                    final String group2 = matcher.group(1);
                    group2.getClass();
                    final long n = long2 - Long.parseLong(group2) + 1L;
                    if (long1 < 0L) {
                        max = n;
                    }
                    else {
                        max = long1;
                        if (long1 != n) {
                            final StringBuilder sb2 = new StringBuilder(String.valueOf(s).length() + 26 + String.valueOf(s2).length());
                            sb2.append("Inconsistent headers [");
                            sb2.append(s);
                            sb2.append("] [");
                            sb2.append(s2);
                            sb2.append("]");
                            Log.w("HttpUtil", sb2.toString());
                            max = Math.max(long1, n);
                        }
                    }
                }
                catch (final NumberFormatException ex2) {
                    final StringBuilder sb3 = new StringBuilder(u10.o.e(s2, 27));
                    sb3.append("Unexpected Content-Range [");
                    sb3.append(s2);
                    sb3.append("]");
                    Log.e("HttpUtil", sb3.toString());
                    max = long1;
                }
            }
        }
        return max;
    }
    
    public static long c(String group) {
        final boolean empty = TextUtils.isEmpty((CharSequence)group);
        long long1 = -1L;
        if (empty) {
            return -1L;
        }
        final Matcher matcher = o.b.matcher(group);
        if (matcher.matches()) {
            group = matcher.group(1);
            group.getClass();
            long1 = Long.parseLong(group);
        }
        return long1;
    }
}
