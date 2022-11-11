// 
// Decompiled by Procyon v0.6.0
// 

package ra;

public final class a extends e
{
    public final long b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;
    
    public a(final long b, final int c, final int d, final long e, final int f) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final int a() {
        return this.d;
    }
    
    public final long b() {
        return this.e;
    }
    
    public final int c() {
        return this.c;
    }
    
    public final int d() {
        return this.f;
    }
    
    public final long e() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof e) {
            final e e = (e)o;
            if (this.b != e.e() || this.c != e.c() || this.d != e.a() || this.e != e.b() || this.f != e.d()) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final long b = this.b;
        final int n = (int)(b ^ b >>> 32);
        final int c = this.c;
        final int d = this.d;
        final long e = this.e;
        return ((((n ^ 0xF4243) * 1000003 ^ c) * 1000003 ^ d) * 1000003 ^ (int)(e >>> 32 ^ e)) * 1000003 ^ this.f;
    }
    
    public final String toString() {
        final StringBuilder r = a.r("EventStoreConfig{maxStorageSizeInBytes=");
        r.append(this.b);
        r.append(", loadBatchSize=");
        r.append(this.c);
        r.append(", criticalSectionEnterTimeoutMs=");
        r.append(this.d);
        r.append(", eventCleanUpAge=");
        r.append(this.e);
        r.append(", maxBlobByteSizePerRow=");
        return al0.a.l(r, this.f, "}");
    }
    
    public static final class a extends e$a
    {
        public Long a;
        public Integer b;
        public Integer c;
        public Long d;
        public Integer e;
    }
}
