// 
// Decompiled by Procyon v0.6.0
// 

package kc;

import com.google.common.collect.ImmutableCollection$a;
import bd.b0;
import bd.d0;
import com.google.android.exoplayer2.ParserException;
import bd.c0;
import com.google.common.collect.ImmutableList$a;
import com.google.common.collect.ImmutableList;
import android.net.Uri;

public final class l
{
    public final long a;
    public final int b;
    public final Uri c;
    
    public l(final int b, final long a, final Uri c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static ImmutableList a(final Uri uri, final String s) throws ParserException {
        final ImmutableList$a immutableList$a = new ImmutableList$a();
        final int a = c0.a;
        for (final String s2 : s.split(",", -1)) {
            final String[] split2 = s2.split(";", -1);
            final int length2 = split2.length;
            int int1 = -1;
            int j = 0;
            Uri b = null;
            long long1 = -9223372036854775807L;
            while (j < length2) {
                final String s3 = split2[j];
                try {
                    final String[] split3 = s3.split("=", 2);
                    final String s4 = split3[0];
                    final String s5 = split3[1];
                    final int hashCode = s4.hashCode();
                    int n = 0;
                    Label_0179: {
                        if (hashCode != 113759) {
                            if (hashCode != 116079) {
                                if (hashCode == 1524180539) {
                                    if (s4.equals("rtptime")) {
                                        n = 2;
                                        break Label_0179;
                                    }
                                }
                            }
                            else if (s4.equals("url")) {
                                n = 0;
                                break Label_0179;
                            }
                        }
                        else if (s4.equals("seq")) {
                            n = 1;
                            break Label_0179;
                        }
                        n = -1;
                    }
                    if (n != 0) {
                        if (n != 1) {
                            if (n != 2) {
                                throw ParserException.createForMalformedManifest(s4, (Throwable)null);
                            }
                            long1 = Long.parseLong(s5);
                        }
                        else {
                            int1 = Integer.parseInt(s5);
                        }
                    }
                    else {
                        b = b(uri, s5);
                    }
                    ++j;
                    continue;
                }
                catch (final Exception ex) {
                    throw ParserException.createForMalformedManifest(s3, (Throwable)ex);
                }
                break;
            }
            if (b == null || b.getScheme() == null || (int1 == -1 && long1 == -9223372036854775807L)) {
                throw ParserException.createForMalformedManifest(s2, (Throwable)null);
            }
            ((ImmutableCollection$a)immutableList$a).c((Object)new l(int1, long1, b));
        }
        return immutableList$a.f();
    }
    
    public static Uri b(Uri uri, final String s) {
        final String scheme = uri.getScheme();
        scheme.getClass();
        d0.c(scheme.equals("rtsp"));
        final Uri parse = Uri.parse(s);
        if (parse.isAbsolute()) {
            return parse;
        }
        final String value = String.valueOf(s);
        String concat;
        if (value.length() != 0) {
            concat = "rtsp://".concat(value);
        }
        else {
            concat = new String("rtsp://");
        }
        final Uri parse2 = Uri.parse(concat);
        final String string = uri.toString();
        final String host = parse2.getHost();
        host.getClass();
        if (host.equals(uri.getHost())) {
            return parse2;
        }
        if (string.endsWith("/")) {
            uri = b0.d(string, s);
        }
        else {
            uri = b0.d(string.concat("/"), s);
        }
        return uri;
    }
}
