// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.measurement;

import java.io.IOException;
import ie.k6;
import ie.m7;
import ie.b7;
import ie.f8;
import ie.o5;
import java.util.logging.Logger;
import ie.j5;

public abstract class d extends j5
{
    public static final Logger b;
    public static final boolean c;
    public o5 a;
    
    static {
        b = Logger.getLogger(d.class.getName());
        c = f8.e;
    }
    
    public static int a(final int n) {
        if ((n & 0xFFFFFF80) == 0x0) {
            return 1;
        }
        if ((n & 0xFFFFC000) == 0x0) {
            return 2;
        }
        if ((0xFFE00000 & n) == 0x0) {
            return 3;
        }
        if ((n & 0xF0000000) == 0x0) {
            return 4;
        }
        return 5;
    }
    
    public static int b(long n) {
        if ((0xFFFFFFFFFFFFFF80L & n) == 0x0L) {
            return 1;
        }
        if (n < 0L) {
            return 10;
        }
        int n2;
        if ((0xFFFFFFF800000000L & n) != 0x0L) {
            n >>>= 28;
            n2 = 6;
        }
        else {
            n2 = 2;
        }
        int n3 = n2;
        long n4 = n;
        if ((0xFFFFFFFFFFE00000L & n) != 0x0L) {
            n3 = n2 + 2;
            n4 = n >>> 14;
        }
        int n5 = n3;
        if ((n4 & 0xFFFFFFFFFFFFC000L) != 0x0L) {
            n5 = n3 + 1;
        }
        return n5;
    }
    
    @Deprecated
    public static int r(int n, final b7 b7, final m7 m7) {
        final int a = a(n << 3);
        final b b8 = (b)b7;
        if ((n = b8.a()) == -1) {
            n = m7.c((Object)b8);
            b8.h(n);
        }
        return a + a + n;
    }
    
    public static int s(final int n) {
        if (n >= 0) {
            return a(n);
        }
        return 10;
    }
    
    public static int t(final String s) {
        int n;
        try {
            n = f.c((CharSequence)s);
        }
        catch (final zznb zznb) {
            n = s.getBytes(k6.a).length;
        }
        return a(n) + n;
    }
    
    public static int u(final int n) {
        return a(n << 3);
    }
    
    public abstract void c(final byte p0) throws IOException;
    
    public abstract void d(final int p0, final boolean p1) throws IOException;
    
    public abstract void e(final int p0, final zzjd p1) throws IOException;
    
    public abstract void f(final int p0, final int p1) throws IOException;
    
    public abstract void g(final int p0) throws IOException;
    
    public abstract void h(final int p0, final long p1) throws IOException;
    
    public abstract void i(final long p0) throws IOException;
    
    public abstract void j(final int p0, final int p1) throws IOException;
    
    public abstract void k(final int p0) throws IOException;
    
    public abstract void l(final int p0, final String p1) throws IOException;
    
    public abstract void m(final int p0, final int p1) throws IOException;
    
    public abstract void n(final int p0, final int p1) throws IOException;
    
    public abstract void o(final int p0) throws IOException;
    
    public abstract void p(final int p0, final long p1) throws IOException;
    
    public abstract void q(final long p0) throws IOException;
}
