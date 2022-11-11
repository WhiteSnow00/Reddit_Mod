// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source.rtsp;

import java.nio.charset.Charset;
import android.util.Base64;
import a81.e;
import java.security.NoSuchAlgorithmException;
import com.google.android.exoplayer2.ParserException;
import ad.c0;
import java.security.MessageDigest;
import android.net.Uri;

public final class c
{
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    
    public c(final int a, final String b, final String c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final String a(final h.a a, final Uri uri, int n) throws ParserException {
        final int a2 = this.a;
        if (a2 != 1) {
            if (a2 == 2) {
                try {
                    final MessageDigest instance = MessageDigest.getInstance("MD5");
                    final String e = h.e(n);
                    final String a3 = a.a;
                    final String b = this.b;
                    final String b2 = a.b;
                    final int length = String.valueOf(a3).length();
                    final int length2 = String.valueOf(b).length();
                    n = String.valueOf(b2).length();
                    final StringBuilder sb = new StringBuilder(length + 2 + length2 + n);
                    sb.append(a3);
                    sb.append(":");
                    sb.append(b);
                    sb.append(":");
                    sb.append(b2);
                    final String string = sb.toString();
                    final Charset l = g.l;
                    final String t = c0.T(instance.digest(string.getBytes(l)));
                    final String value = String.valueOf(uri);
                    final int length3 = e.length();
                    n = value.length();
                    final StringBuilder sb2 = new StringBuilder(length3 + 1 + n);
                    sb2.append(e);
                    sb2.append(":");
                    sb2.append(value);
                    final String t2 = c0.T(instance.digest(sb2.toString().getBytes(l)));
                    final String c = this.c;
                    n = String.valueOf(t).length();
                    final StringBuilder sb3 = new StringBuilder(n + 2 + String.valueOf(c).length() + String.valueOf(t2).length());
                    sb3.append(t);
                    sb3.append(":");
                    sb3.append(c);
                    sb3.append(":");
                    sb3.append(t2);
                    final String t3 = c0.T(instance.digest(sb3.toString().getBytes(l)));
                    String s;
                    if (this.d.isEmpty()) {
                        s = c0.n("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", a.a, this.b, this.c, uri, t3);
                    }
                    else {
                        s = c0.n("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", a.a, this.b, this.c, uri, t3, this.d);
                    }
                    return s;
                }
                catch (final NoSuchAlgorithmException ex) {
                    throw ParserException.createForManifestWithUnsupportedFeature(null, ex);
                }
            }
            throw ParserException.createForManifestWithUnsupportedFeature(null, new UnsupportedOperationException());
        }
        final String a4 = a.a;
        final String b3 = a.b;
        return Base64.encodeToString(a.j(e.h(b3, e.h(a4, 1)), a4, ":", b3).getBytes(g.l), 0);
    }
}
