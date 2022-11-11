// 
// Decompiled by Procyon v0.6.0
// 

package hm2;

import dl2.b;
import java.util.Map;
import ok2.m;

public final class e
{
    public final int a;
    public final int b;
    public final int c;
    public final m d;
    
    public e(final m d) {
        if (d == null) {
            throw new NullPointerException("treeDigest == null");
        }
        this.d = d;
        final dl2.c a = hm2.c.a(d);
        final String e = ((b)a).e();
        int f;
        if (e.equals("SHAKE128")) {
            f = 32;
        }
        else if (e.equals("SHAKE256")) {
            f = 64;
        }
        else {
            f = ((b)a).f();
        }
        this.a = f;
        final int n = 16;
        this.b = 16;
        final double n2 = f * 8;
        final int n3 = 0;
        int n4 = 16;
        int n5 = 0;
        while (true) {
            n4 >>= 1;
            if (n4 == 0) {
                break;
            }
            ++n5;
        }
        final int n6 = (int)Math.ceil(n2 / n5);
        int n7 = n6 * 15;
        int n8 = 0;
        int n10;
        int n11;
        while (true) {
            final int n9 = n7 >> 1;
            n10 = n;
            n11 = n3;
            if (n9 == 0) {
                break;
            }
            ++n8;
            n7 = n9;
        }
        while (true) {
            n10 >>= 1;
            if (n10 == 0) {
                break;
            }
            ++n11;
        }
        final int c = (int)Math.floor(n8 / n11) + 1 + n6;
        this.c = c;
        final String e2 = ((b)a).e();
        if (e2 == null) {
            final Map<String, d> b = hm2.d.b;
            throw new NullPointerException("algorithmName == null");
        }
        if (hm2.d.b.get(hm2.d.a(e2, f, c)) != null) {
            return;
        }
        final StringBuilder r = a.r("cannot find OID for digest algorithm: ");
        r.append(((b)a).e());
        throw new IllegalArgumentException(r.toString());
    }
}
