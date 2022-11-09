// 
// Decompiled by Procyon v0.6.0
// 

package bc;

public class j
{
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    
    public j(final j j) {
        this.a = j.a;
        this.b = j.b;
        this.c = j.c;
        this.d = j.d;
        this.e = j.e;
    }
    
    public j(final Object a, final int b, final int c, final long d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public j(final Object o, final long n) {
        this(o, -1, -1, n, -1);
    }
    
    public final boolean a() {
        return this.b != -1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof j)) {
            return false;
        }
        final j j = (j)o;
        if (!this.a.equals(j.a) || this.b != j.b || this.c != j.c || this.d != j.d || this.e != j.e) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return (((d.f(this.a, 527, 31) + this.b) * 31 + this.c) * 31 + (int)this.d) * 31 + this.e;
    }
}
