// 
// Decompiled by Procyon v0.6.0
// 

package qd2;

public final class f
{
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public long e;
    
    public f() {
        this(0, 0, 0L, 0L, 0L);
    }
    
    public f(final int a, final int b, final long c, final long d, final long e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final long a() {
        return this.e;
    }
    
    public final long b() {
        return this.d;
    }
    
    public final int c() {
        return this.a;
    }
    
    public final int d() {
        return this.b;
    }
    
    public final long e() {
        return this.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof f) {
                final f f = (f)o;
                if (this.a == f.a && this.b == f.b && this.c == f.c && this.d == f.d && this.e == f.e) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final boolean f() {
        return this.c + this.e == this.d;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final int b = this.b;
        final long c = this.c;
        final int n = (int)(c ^ c >>> 32);
        final long d = this.d;
        final int n2 = (int)(d ^ d >>> 32);
        final long e = this.e;
        return (((a * 31 + b) * 31 + n) * 31 + n2) * 31 + (int)(e ^ e >>> 32);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("FileSlice(id=");
        t.append(this.a);
        t.append(", position=");
        t.append(this.b);
        t.append(", startBytes=");
        t.append(this.c);
        t.append(", endBytes=");
        t.append(this.d);
        t.append(", downloaded=");
        return d.k(t, this.e, ")");
    }
}
