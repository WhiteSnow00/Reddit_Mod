// 
// Decompiled by Procyon v0.6.0
// 

package wc;

import com.google.android.exoplayer2.ParserException;
import bd.c0;
import bd.t;
import java.util.regex.Pattern;

public final class h
{
    public static final Pattern a;
    
    static {
        a = Pattern.compile("^NOTE([ \t].*)?$");
    }
    
    public static boolean a(final t t) {
        final String d = t.d();
        return d != null && d.startsWith("WEBVTT");
    }
    
    public static float b(final String s) throws NumberFormatException {
        if (s.endsWith("%")) {
            return Float.parseFloat(s.substring(0, s.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }
    
    public static long c(final String s) throws NumberFormatException {
        final int a = c0.a;
        final String[] split = s.split("\\.", 2);
        int i = 0;
        final String[] split2 = split[0].split(":", -1);
        final int length = split2.length;
        long n = 0L;
        while (i < length) {
            n = n * 60L + Long.parseLong(split2[i]);
            ++i;
        }
        long n2 = n * 1000L;
        if (split.length == 2) {
            n2 += Long.parseLong(split[1]);
        }
        return n2 * 1000L;
    }
    
    public static void d(final t t) throws ParserException {
        final int b = t.b;
        if (!a(t)) {
            t.B(b);
            final String value = String.valueOf(t.d());
            String concat;
            if (value.length() != 0) {
                concat = "Expected WEBVTT. Got ".concat(value);
            }
            else {
                concat = new String("Expected WEBVTT. Got ");
            }
            throw ParserException.createForMalformedContainer(concat, (Throwable)null);
        }
    }
}
