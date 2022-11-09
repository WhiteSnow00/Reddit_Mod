// 
// Decompiled by Procyon v0.6.0
// 

package eg;

public final class w extends a
{
    public final int b;
    public final String c;
    public final String d;
    
    public w(final int b, final String c, final String d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final String a() {
        return this.d;
    }
    
    public final int b() {
        return this.b;
    }
    
    public final String c() {
        return this.c;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof a) {
            final a a = (a)o;
            if (this.b == a.b()) {
                final String c = this.c;
                if (c == null) {
                    if (a.c() != null) {
                        return false;
                    }
                }
                else if (!c.equals(a.c())) {
                    return false;
                }
                final String d = this.d;
                if (d == null) {
                    if (a.a() != null) {
                        return false;
                    }
                }
                else if (!d.equals(a.a())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    public final int hashCode() {
        final int b = this.b;
        final String c = this.c;
        int hashCode = 0;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final String d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return ((b ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode;
    }
    
    public final String toString() {
        final int b = this.b;
        final String c = this.c;
        final String d = this.d;
        final StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 68 + String.valueOf(d).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(b);
        sb.append(", path=");
        sb.append(c);
        return a.i(sb, ", assetsPath=", d, "}");
    }
}
