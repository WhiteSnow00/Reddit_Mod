// 
// Decompiled by Procyon v0.6.0
// 

package lb;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import qb.a$b;
import bd.c0;
import java.util.List;
import com.google.common.collect.ImmutableList;
import db.z;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.n$a;
import bd.d0;
import yl.a;
import java.util.Arrays;
import bd.s;

public final class g extends h
{
    public static final byte[] n;
    public static final byte[] o;
    
    static {
        n = new byte[] { 79, 112, 117, 115, 72, 101, 97, 100 };
        o = new byte[] { 79, 112, 117, 115, 84, 97, 103, 115 };
    }
    
    public static boolean e(final s s, final byte[] array) {
        final int c = s.c;
        final int b = s.b;
        if (c - b < array.length) {
            return false;
        }
        final byte[] array2 = new byte[array.length];
        s.b(0, array.length, array2);
        s.B(b);
        return Arrays.equals(array2, array);
    }
    
    @Override
    public final long b(final s s) {
        final byte[] a = s.a;
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
    
    @Override
    public final boolean c(final s s, final long n, final a a) throws ParserException {
        final boolean e = e(s, g.n);
        boolean b = false;
        if (e) {
            final byte[] copy = Arrays.copyOf(s.a, s.c);
            final byte b2 = copy[9];
            final ArrayList c = a.C(copy);
            if (a.a == null) {
                b = true;
            }
            d0.f(b);
            final n$a n$a = new n$a();
            n$a.k = "audio/opus";
            n$a.x = (b2 & 0xFF);
            n$a.y = 48000;
            n$a.m = c;
            a.a = new n(n$a);
            return true;
        }
        if (!e(s, g.o)) {
            d0.g(a.a);
            return false;
        }
        d0.g(a.a);
        s.C(8);
        qb.a a2 = z.a((List)ImmutableList.copyOf((Object[])z.b(s, false, false).a));
        if (a2 == null) {
            return true;
        }
        final n a3 = a.a;
        a3.getClass();
        final n$a n$a2 = new n$a(a3);
        final qb.a o = a.a.o;
        if (o != null) {
            final a$b[] f = o.f;
            if (f.length != 0) {
                final a$b[] f2 = a2.f;
                final int a4 = c0.a;
                final a$b[] copy2 = Arrays.copyOf(f2, f2.length + f.length);
                System.arraycopy(f, 0, copy2, f2.length, f.length);
                a2 = new qb.a((a$b[])copy2);
            }
        }
        n$a2.i = a2;
        a.a = new n(n$a2);
        return true;
    }
}
