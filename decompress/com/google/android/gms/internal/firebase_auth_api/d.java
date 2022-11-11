// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaau;
import java.io.IOException;
import java.util.logging.Level;
import ge.i1;
import ge.x0;
import ge.f0;
import ge.c2;
import ge.o;
import java.util.logging.Logger;
import ge.h;

public abstract class d extends h
{
    public static final Logger b;
    public static final boolean c;
    public o a;
    
    static {
        b = Logger.getLogger(com.google.android.gms.internal.firebase-auth-api.d.class.getName());
        c = c2.e;
    }
    
    public static int b(final String s) {
        int n;
        try {
            n = g.c((CharSequence)s);
        }
        catch (final zzaet zzaet) {
            n = s.getBytes(f0.a).length;
        }
        return d(n) + n;
    }
    
    public static int c(final int n) {
        return d(n << 3);
    }
    
    public static int d(final int n) {
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
    
    public static int e(long n) {
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
    public static int w(int n, final x0 x0, final i1 i1) {
        final int d = d(n << 3);
        final a a = (a)x0;
        if ((n = a.a()) == -1) {
            n = i1.c(a);
            a.b(n);
        }
        return d + d + n;
    }
    
    public static int x(final int n) {
        if (n >= 0) {
            return d(n);
        }
        return 10;
    }
    
    public final void f(final String s, final com.google.android.gms.internal.firebase-auth-api.zzaet zzaet) throws IOException {
        d.b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable)zzaet);
        final byte[] bytes = s.getBytes(f0.a);
        try {
            final int length = bytes.length;
            this.t(length);
            this.a(length, bytes);
        }
        catch (final IndexOutOfBoundsException ex) {
            throw new zzabc((Throwable)ex);
        }
    }
    
    public abstract void g(final byte p0) throws IOException;
    
    public abstract void h(final int p0, final boolean p1) throws IOException;
    
    public abstract void i(final int p0, final zzaau p1) throws IOException;
    
    public abstract void j(final int p0, final int p1) throws IOException;
    
    public abstract void k(final int p0) throws IOException;
    
    public abstract void l(final int p0, final long p1) throws IOException;
    
    public abstract void m(final long p0) throws IOException;
    
    public abstract void n(final int p0, final int p1) throws IOException;
    
    public abstract void o(final int p0) throws IOException;
    
    public abstract void p(final int p0, final x0 p1, final i1 p2) throws IOException;
    
    public abstract void q(final int p0, final String p1) throws IOException;
    
    public abstract void r(final int p0, final int p1) throws IOException;
    
    public abstract void s(final int p0, final int p1) throws IOException;
    
    public abstract void t(final int p0) throws IOException;
    
    public abstract void u(final int p0, final long p1) throws IOException;
    
    public abstract void v(final long p0) throws IOException;
}
