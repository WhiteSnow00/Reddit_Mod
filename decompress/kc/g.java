// 
// Decompiled by Procyon v0.6.0
// 

package kc;

import java.util.List;
import com.google.android.exoplayer2.n;
import com.google.common.collect.ImmutableList;
import bd.p;
import android.util.Base64;
import com.google.common.collect.ImmutableMap$b;
import bd.c0;
import com.google.common.collect.ImmutableMap;
import com.google.android.exoplayer2.n$a;
import bd.d0;
import android.net.Uri;

public final class g
{
    public final e a;
    public final Uri b;
    
    public g(final a a, final Uri uri) {
        d0.c(a.i.containsKey((Object)"control"));
        final n$a n$a = new n$a();
        final int e = a.e;
        if (e > 0) {
            n$a.f = e;
        }
        final a.b j = a.j;
        final int a2 = j.a;
        final String b = j.b;
        final String p2 = mk2.e.P(b);
        p2.getClass();
        final int hashCode = p2.hashCode();
        int n = 0;
        Label_0162: {
            if (hashCode != -1922091719) {
                if (hashCode != 64593) {
                    if (hashCode == 2194728) {
                        if (p2.equals("H264")) {
                            n = 2;
                            break Label_0162;
                        }
                    }
                }
                else if (p2.equals("AC3")) {
                    n = 1;
                    break Label_0162;
                }
            }
            else if (p2.equals("MPEG4-GENERIC")) {
                n = 0;
                break Label_0162;
            }
            n = -1;
        }
        String k;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    throw new IllegalArgumentException(b);
                }
                k = "video/avc";
            }
            else {
                k = "audio/ac3";
            }
        }
        else {
            k = "audio/mp4a-latm";
        }
        n$a.k = k;
        final int c = a.j.c;
        int n2;
        if ("audio".equals(a.a)) {
            int d = a.j.d;
            if (d == -1) {
                if (k.equals("audio/ac3")) {
                    d = 6;
                }
                else {
                    d = 1;
                }
            }
            n$a.y = c;
            n$a.x = d;
            n2 = d;
        }
        else {
            n2 = -1;
        }
        final String s = (String)a.i.get((Object)"fmtp");
        ImmutableMap immutableMap;
        if (s == null) {
            immutableMap = ImmutableMap.of();
        }
        else {
            final int a3 = c0.a;
            final String[] split = s.split(" ", 2);
            d0.d(split.length == 2, s);
            final String s2 = split[1];
            int i = 0;
            final String[] split2 = s2.split(";\\s?", 0);
            final ImmutableMap$b immutableMap$b = new ImmutableMap$b(4);
            while (i < split2.length) {
                final String[] split3 = split2[i].split("=", 2);
                immutableMap$b.b((Object)split3[0], (Object)split3[1]);
                ++i;
            }
            immutableMap = immutableMap$b.a(true);
        }
        final int hashCode2 = k.hashCode();
        int n3 = 0;
        Label_0522: {
            if (hashCode2 != -53558318) {
                if (hashCode2 != 187078296) {
                    if (hashCode2 == 1331836730) {
                        if (k.equals("video/avc")) {
                            n3 = 1;
                            break Label_0522;
                        }
                    }
                }
                else if (k.equals("audio/ac3")) {
                    n3 = 2;
                    break Label_0522;
                }
            }
            else if (k.equals("audio/mp4a-latm")) {
                n3 = 0;
                break Label_0522;
            }
            n3 = -1;
        }
        if (n3 != 0) {
            if (n3 == 1) {
                d0.c(immutableMap.isEmpty() ^ true);
                d0.c(immutableMap.containsKey((Object)"sprop-parameter-sets"));
                final String s3 = (String)immutableMap.get((Object)"sprop-parameter-sets");
                s3.getClass();
                final int a4 = c0.a;
                final String[] split4 = s3.split(",", -1);
                d0.c(split4.length == 2);
                final byte[] decode = Base64.decode(split4[0], 0);
                final int length = decode.length;
                final byte[] a5 = p.a;
                final byte[] array = new byte[length + 4];
                System.arraycopy(a5, 0, array, 0, 4);
                System.arraycopy(decode, 0, array, 4, decode.length);
                final byte[] decode2 = Base64.decode(split4[1], 0);
                final byte[] array2 = new byte[decode2.length + 4];
                System.arraycopy(a5, 0, array2, 0, 4);
                System.arraycopy(decode2, 0, array2, 4, decode2.length);
                final ImmutableList of = ImmutableList.of((Object)array, (Object)array2);
                n$a.m = (List)of;
                final byte[] array3 = ((List<byte[]>)of).get(0);
                final p.c d2 = p.d(4, array3.length, array3);
                n$a.t = d2.g;
                n$a.q = d2.f;
                n$a.p = d2.e;
                final String s4 = (String)immutableMap.get((Object)"profile-level-id");
                if (s4 != null) {
                    String concat;
                    if (s4.length() != 0) {
                        concat = "avc1.".concat(s4);
                    }
                    else {
                        concat = new String("avc1.");
                    }
                    n$a.h = concat;
                }
                else {
                    n$a.h = d0.a(d2.a, d2.b, d2.c);
                }
            }
        }
        else {
            d0.c(n2 != -1);
            d0.c(immutableMap.isEmpty() ^ true);
            d0.c(immutableMap.containsKey((Object)"profile-level-id"));
            final String s5 = (String)immutableMap.get((Object)"profile-level-id");
            s5.getClass();
            String concat2;
            if (s5.length() != 0) {
                concat2 = "mp4a.40.".concat(s5);
            }
            else {
                concat2 = new String("mp4a.40.");
            }
            n$a.h = concat2;
            n$a.m = (List)ImmutableList.of((Object)ya.a.a(c, n2));
        }
        d0.c(c > 0);
        this.a = new e(new n(n$a), a2, c, immutableMap);
        final String s6 = (String)a.i.get((Object)"control");
        Uri b2 = Uri.parse(s6);
        if (!b2.isAbsolute()) {
            if (s6.equals("*")) {
                b2 = uri;
            }
            else {
                b2 = uri.buildUpon().appendEncodedPath(s6).build();
            }
        }
        this.b = b2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && g.class == o.getClass()) {
            final g g = (g)o;
            if (!this.a.equals(g.a) || !this.b.equals((Object)g.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() + 217) * 31;
    }
}
