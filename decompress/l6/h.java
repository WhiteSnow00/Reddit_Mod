// 
// Decompiled by Procyon v0.6.0
// 

package l6;

public final class h
{
    public final String a;
    public final int b;
    
    public h(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof h)) {
            return false;
        }
        final h h = (h)o;
        return this.b == h.b && this.a.equals(h.a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b;
    }
}
