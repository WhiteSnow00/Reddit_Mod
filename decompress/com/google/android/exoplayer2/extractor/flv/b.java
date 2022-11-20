// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import db.w$a;
import com.google.android.exoplayer2.n$a;
import m5.a;
import bd.q;
import db.w;
import bd.t;

public final class b extends TagPayloadReader
{
    public final t b;
    public final t c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;
    
    public b(final w w) {
        super(w);
        this.b = new t(q.a);
        this.c = new t(4);
    }
    
    public final boolean a(final t t) throws TagPayloadReader.UnsupportedFormatException {
        final int r = t.r();
        final int g = r >> 4 & 0xF;
        final int n = r & 0xF;
        if (n == 7) {
            this.g = g;
            return g != 5;
        }
        throw new TagPayloadReader.UnsupportedFormatException(a.c(39, "Video format not supported: ", n));
    }
    
    public final boolean b(final long n, final t t) throws ParserException {
        final int r = t.r();
        final byte[] a = t.a;
        final int b = t.b;
        final int n2 = b + 1;
        final byte b2 = a[b];
        final int n3 = n2 + 1;
        final byte b3 = a[n2];
        final int b4 = n3 + 1;
        t.b = b4;
        final long n4 = (a[n3] & 0xFF) | ((b2 & 0xFF) << 24 >> 8 | (b3 & 0xFF) << 8);
        if (r == 0 && !this.e) {
            final t t2 = new t(new byte[t.c - b4]);
            t.b(0, t.c - t.b, t2.a);
            final cd.a a2 = cd.a.a(t2);
            this.d = a2.b;
            final n$a n$a = new n$a();
            n$a.k = "video/avc";
            n$a.h = a2.f;
            n$a.p = a2.c;
            n$a.q = a2.d;
            n$a.t = a2.e;
            n$a.m = a2.a;
            super.a.a(n$a.a());
            this.e = true;
            return false;
        }
        if (r != 1 || !this.e) {
            return false;
        }
        int n5;
        if (this.g == 1) {
            n5 = 1;
        }
        else {
            n5 = 0;
        }
        if (!this.f && n5 == 0) {
            return false;
        }
        final byte[] a3 = this.c.a;
        a3[0] = 0;
        a3[2] = (a3[1] = 0);
        final int d = this.d;
        int n6 = 0;
        while (t.c - t.b > 0) {
            t.b(4 - d, this.d, this.c.a);
            this.c.B(0);
            final int u = this.c.u();
            this.b.B(0);
            super.a.c(4, this.b);
            super.a.c(u, t);
            n6 = n6 + 4 + u;
        }
        super.a.b(n4 * 1000L + n, n5, n6, 0, (w$a)null);
        return this.f = true;
    }
}
