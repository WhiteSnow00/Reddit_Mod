// 
// Decompiled by Procyon v0.6.0
// 

package l6;

public final class d
{
    public String a;
    public Long b;
    
    public d(final String a, final long n) {
        this.a = a;
        this.b = n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean equals = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        if (!this.a.equals(d.a)) {
            return false;
        }
        final Long b = this.b;
        final Long b2 = d.b;
        if (b != null) {
            equals = b.equals(b2);
        }
        else if (b2 != null) {
            equals = false;
        }
        return equals;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final Long b = this.b;
        int hashCode2;
        if (b != null) {
            hashCode2 = b.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return hashCode * 31 + hashCode2;
    }
}
