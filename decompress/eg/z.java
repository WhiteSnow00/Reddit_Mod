// 
// Decompiled by Procyon v0.6.0
// 

package eg;

public final class z extends i1
{
    public final int a;
    public final String b;
    public final long c;
    public final long d;
    public final int e;
    
    public z(final int a, final int e, final long c, final long d, final String b) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final int a() {
        return this.a;
    }
    
    public final int b() {
        return this.e;
    }
    
    public final long c() {
        return this.c;
    }
    
    public final long d() {
        return this.d;
    }
    
    public final String e() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof i1) {
            final i1 i1 = (i1)o;
            if (this.a == i1.a()) {
                final String b = this.b;
                if (b == null) {
                    if (i1.e() != null) {
                        return false;
                    }
                }
                else if (!b.equals(i1.e())) {
                    return false;
                }
                if (this.c == i1.c() && this.d == i1.d() && this.e == i1.b()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public final int hashCode() {
        final int a = this.a;
        final String b = this.b;
        int hashCode;
        if (b == null) {
            hashCode = 0;
        }
        else {
            hashCode = b.hashCode();
        }
        final long c = this.c;
        final long d = this.d;
        return ((((a ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ (int)(c ^ c >>> 32)) * 1000003 ^ (int)(d >>> 32 ^ d)) * 1000003 ^ this.e;
    }
    
    public final String toString() {
        final int a = this.a;
        final String b = this.b;
        final long c = this.c;
        final long d = this.d;
        final int e = this.e;
        final StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(a);
        sb.append(", filePath=");
        sb.append(b);
        sb.append(", fileOffset=");
        sb.append(c);
        sb.append(", remainingBytes=");
        sb.append(d);
        sb.append(", previousChunk=");
        sb.append(e);
        sb.append("}");
        return sb.toString();
    }
}
