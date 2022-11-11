import android.graphics.Paint;

// 
// Decompiled by Procyon v0.6.0
// 

public final class c
{
    public final String a;
    public final Paint b;
    public final long c;
    public final e d;
    
    public c(final String a, final Paint b, final long c, final e d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return sg2.e.a((Object)this.a, (Object)c.a) && sg2.e.a((Object)this.b, (Object)c.b) && n1.c.a(this.c, c.c) && sg2.e.a((Object)this.d, (Object)c.d);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final long c = this.c;
        final int e = n1.c.e;
        return this.d.hashCode() + b.b(c, (hashCode2 + hashCode * 31) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("Label(name=");
        r.append(this.a);
        r.append(", paint=");
        r.append(this.b);
        r.append(", position=");
        r.append((Object)n1.c.h(this.c));
        r.append(", bounds=");
        r.append(this.d);
        r.append(')');
        return r.toString();
    }
}
