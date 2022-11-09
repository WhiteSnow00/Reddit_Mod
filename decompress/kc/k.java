// 
// Decompiled by Procyon v0.6.0
// 

package kc;

import java.util.regex.Matcher;
import com.google.android.exoplayer2.ParserException;
import bd.d0;
import java.util.regex.Pattern;

public final class k
{
    public static final k c;
    public static final Pattern d;
    public final long a;
    public final long b;
    
    static {
        c = new k(0L, -9223372036854775807L);
        d = Pattern.compile("npt=([.\\d]+|now)\\s?-\\s?([.\\d]+)?");
    }
    
    public k(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public static k a(final String s) throws ParserException {
        final Matcher matcher = k.d.matcher(s);
        d0.c(matcher.matches());
        boolean b = true;
        final String group = matcher.group(1);
        group.getClass();
        long n;
        if (group.equals("now")) {
            n = 0L;
        }
        else {
            n = (long)(Float.parseFloat(group) * 1000.0f);
        }
        final String group2 = matcher.group(2);
        if (group2 != null) {
            try {
                final long n2 = (long)(Float.parseFloat(group2) * 1000.0f);
                if (n2 <= n) {
                    b = false;
                }
                d0.c(b);
                return new k(n, n2);
            }
            catch (final NumberFormatException ex) {
                throw ParserException.createForMalformedManifest(group2, (Throwable)ex);
            }
        }
        final long n2 = -9223372036854775807L;
        return new k(n, n2);
    }
}
