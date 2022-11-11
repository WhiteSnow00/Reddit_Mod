// 
// Decompiled by Procyon v0.6.0
// 

package yc;

import java.io.IOException;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.net.URLDecoder;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import ad.c0;
import ad.d0;
import com.google.android.exoplayer2.upstream.b;

public final class g extends e
{
    public b e;
    public byte[] f;
    public int g;
    public int h;
    
    public g() {
        super(false);
    }
    
    public final long a(final b e) throws IOException {
        this.q(e);
        this.e = e;
        final Uri a = e.a;
        final String scheme = a.getScheme();
        final boolean equals = "data".equals(scheme);
        final String value = String.valueOf(scheme);
        String concat;
        if (value.length() != 0) {
            concat = "Unsupported scheme: ".concat(value);
        }
        else {
            concat = new String("Unsupported scheme: ");
        }
        d0.d(equals, concat);
        final String schemeSpecificPart = a.getSchemeSpecificPart();
        final int a2 = c0.a;
        final String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            final String value2 = String.valueOf(a);
            final StringBuilder sb = new StringBuilder(value2.length() + 23);
            sb.append("Unexpected URI format: ");
            sb.append(value2);
            throw ParserException.createForMalformedDataOfUnknownType(sb.toString(), null);
        }
        final String s = split[1];
        Label_0173: {
            if (split[0].contains(";base64")) {
                try {
                    this.f = Base64.decode(s, 0);
                    break Label_0173;
                }
                catch (final IllegalArgumentException ex) {
                    final String value3 = String.valueOf(s);
                    String concat2;
                    if (value3.length() != 0) {
                        concat2 = "Error while parsing Base64 encoded string: ".concat(value3);
                    }
                    else {
                        concat2 = new String("Error while parsing Base64 encoded string: ");
                    }
                    throw ParserException.createForMalformedDataOfUnknownType(concat2, ex);
                }
            }
            this.f = c0.C(URLDecoder.decode(s, rg.b.a.name()));
        }
        final long f = e.f;
        final byte[] f2 = this.f;
        if (f <= f2.length) {
            final int g = (int)f;
            this.g = g;
            final int h = f2.length - g;
            this.h = h;
            final long g2 = e.g;
            if (g2 != -1L) {
                this.h = (int)Math.min(h, g2);
            }
            this.r(e);
            long g3 = e.g;
            if (g3 == -1L) {
                g3 = this.h;
            }
            return g3;
        }
        this.f = null;
        throw new DataSourceException(2008);
    }
    
    public final void close() {
        if (this.f != null) {
            this.f = null;
            this.p();
        }
        this.e = null;
    }
    
    public final Uri getUri() {
        final b e = this.e;
        Uri a;
        if (e != null) {
            a = e.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    public final int read(final byte[] array, final int n, int a) {
        if (a == 0) {
            return 0;
        }
        final int h = this.h;
        if (h == 0) {
            return -1;
        }
        final int min = Math.min(a, h);
        final byte[] f = this.f;
        a = c0.a;
        System.arraycopy(f, this.g, array, n, min);
        this.g += min;
        this.h -= min;
        this.o(min);
        return min;
    }
}
