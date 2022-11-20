// 
// Decompiled by Procyon v0.6.0
// 

package ge2;

public final class c
{
    public int a;
    public int b;
    public int c;
    
    public c(final int a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null || c.class != o.getClass()) {
            return false;
        }
        final c c = (c)o;
        if (this.a != c.a) {
            return false;
        }
        if (this.b != c.b) {
            return false;
        }
        if (this.c != c.c) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return (this.a * 31 + this.b) * 31 + this.c;
    }
}
