// 
// Decompiled by Procyon v0.6.0
// 

package jc;

import ad.c0;

public final class c
{
    public static final byte[] g;
    public final boolean a;
    public final byte b;
    public final int c;
    public final long d;
    public final int e;
    public final byte[] f;
    
    static {
        g = new byte[0];
    }
    
    public c(final a a) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
        this.e = a.e;
        final int n = a.f.length / 4;
        this.f = a.g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && c.class == o.getClass()) {
            final c c = (c)o;
            if (this.b != c.b || this.c != c.c || this.a != c.a || this.d != c.d || this.e != c.e) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final byte b = this.b;
        final int c = this.c;
        final int a = this.a ? 1 : 0;
        final long d = this.d;
        return ((((527 + b) * 31 + c) * 31 + a) * 31 + (int)(d ^ d >>> 32)) * 31 + this.e;
    }
    
    @Override
    public final String toString() {
        return c0.n("RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", this.b, this.c, this.d, this.e, this.a);
    }
    
    public static final class a
    {
        public boolean a;
        public byte b;
        public int c;
        public long d;
        public int e;
        public byte[] f;
        public byte[] g;
        
        public a() {
            final byte[] g = c.g;
            this.f = g;
            this.g = g;
        }
    }
}
