// 
// Decompiled by Procyon v0.6.0
// 

package h6;

public final class b
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    
    public b(final boolean a, final boolean b, final boolean c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b2 = (b)o;
        if (this.a != b2.a || this.b != b2.b || this.c != b2.c || this.d != b2.d) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        int a;
        final int n = a = (this.a ? 1 : 0);
        if (this.b) {
            a = n + 16;
        }
        int n2 = a;
        if (this.c) {
            n2 = a + 256;
        }
        int n3 = n2;
        if (this.d) {
            n3 = n2 + 4096;
        }
        return n3;
    }
    
    @Override
    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", this.a, this.b, this.c, this.d);
    }
}
