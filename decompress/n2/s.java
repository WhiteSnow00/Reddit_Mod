// 
// Decompiled by Procyon v0.6.0
// 

package n2;

import androidx.appcompat.widget.s0;

public final class s implements f
{
    public final int a;
    public final m b;
    public final int c;
    public final int d;
    
    public s(final int a, final m b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final int a() {
        return this.d;
    }
    
    @Override
    public final m b() {
        return this.b;
    }
    
    @Override
    public final int c() {
        return this.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof s)) {
            return false;
        }
        final int a = this.a;
        final s s = (s)o;
        return a == s.a && ah2.f.a((Object)this.b, (Object)s.b) && this.c == s.c && this.d == s.d;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.d) + s0.e(this.c, (this.a * 31 + this.b.f) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("ResourceFont(resId=");
        k.append(this.a);
        k.append(", weight=");
        k.append(this.b);
        k.append(", style=");
        k.append((Object)n2.k.a(this.c));
        k.append(", loadingStrategy=");
        k.append((Object)a80.a.L0(this.d));
        k.append(')');
        return k.toString();
    }
}
