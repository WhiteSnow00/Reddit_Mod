// 
// Decompiled by Procyon v0.6.0
// 

package lb;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import qb.a;
import qb.a$b;
import bd.c0;
import java.util.List;
import com.google.common.collect.ImmutableList;
import db.z;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.n$a;
import ah0.b;
import dg.l0;
import java.util.Arrays;
import bd.t;

public final class g extends h
{
    public static final byte[] n;
    public static final byte[] o;
    
    static {
        n = new byte[] { 79, 112, 117, 115, 72, 101, 97, 100 };
        o = new byte[] { 79, 112, 117, 115, 84, 97, 103, 115 };
    }
    
    public static boolean e(final t t, final byte[] array) {
        final int c = t.c;
        final int b = t.b;
        if (c - b < array.length) {
            return false;
        }
        final byte[] array2 = new byte[array.length];
        t.b(0, array.length, array2);
        t.B(b);
        return Arrays.equals(array2, array);
    }
    
    public final long b(final t t) {
        final byte[] a = t.a;
        final int n = a[0] & 0xFF;
        final int n2 = n & 0x3;
        final int n3 = 2;
        int n4;
        if (n2 != 0) {
            n4 = n3;
            if (n2 != 1) {
                n4 = n3;
                if (n2 != 2) {
                    n4 = (a[1] & 0x3F);
                }
            }
        }
        else {
            n4 = 1;
        }
        final int n5 = n >> 3;
        final int n6 = n5 & 0x3;
        int n7;
        if (n5 >= 16) {
            n7 = 2500 << n6;
        }
        else if (n5 >= 12) {
            n7 = 10000 << (n6 & 0x1);
        }
        else if (n6 == 3) {
            n7 = 60000;
        }
        else {
            n7 = 10000 << n6;
        }
        return super.i * (n4 * (long)n7) / 1000000L;
    }
    
    public final boolean c(final t t, final long n, final h$a h$a) throws ParserException {
        final boolean e = e(t, g.n);
        boolean b = false;
        if (e) {
            final byte[] copy = Arrays.copyOf(t.a, t.c);
            final byte b2 = copy[9];
            final ArrayList c = l0.C(copy);
            if (h$a.a == null) {
                b = true;
            }
            ah0.b.H(b);
            final n$a n$a = new n$a();
            n$a.k = "audio/opus";
            n$a.x = (b2 & 0xFF);
            n$a.y = 48000;
            n$a.m = c;
            h$a.a = new n(n$a);
            return true;
        }
        if (!e(t, g.o)) {
            ah0.b.I((Object)h$a.a);
            return false;
        }
        ah0.b.I((Object)h$a.a);
        t.C(8);
        a a = z.a((List)ImmutableList.copyOf((Object[])z.b(t, false, false).a));
        if (a == null) {
            return true;
        }
        final n a2 = h$a.a;
        a2.getClass();
        final n$a n$a2 = new n$a(a2);
        final a o = h$a.a.o;
        if (o != null) {
            final a$b[] f = o.f;
            if (f.length != 0) {
                final a$b[] f2 = a.f;
                final int a3 = c0.a;
                final a$b[] copy2 = Arrays.copyOf(f2, f2.length + f.length);
                System.arraycopy(f, 0, copy2, f2.length, f.length);
                a = new a((a$b[])copy2);
            }
        }
        n$a2.i = a;
        h$a.a = new n(n$a2);
        return true;
    }
}
