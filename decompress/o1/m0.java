// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import pg2.i;
import android.graphics.Shader;

public final class m0 extends n
{
    public final long a;
    
    public m0(final long a) {
        this.a = a;
    }
    
    public final void a(final float n, long n2, final a0 a0) {
        a0.d(1.0f);
        if (n != 1.0f) {
            n2 = this.a;
            n2 = r.b(n2, r.d(n2) * n);
        }
        else {
            n2 = this.a;
        }
        a0.c(n2);
        if (a0.f() != null) {
            a0.k((Shader)null);
        }
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof m0 && r.c(this.a, ((m0)o).a));
    }
    
    public final int hashCode() {
        final long a = this.a;
        final int m = r.m;
        return i.a(a);
    }
    
    public final String toString() {
        return d.i(this.a, a.k("SolidColor(value="), ')');
    }
}
