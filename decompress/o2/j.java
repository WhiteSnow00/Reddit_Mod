// 
// Decompiled by Procyon v0.6.0
// 

package o2;

import a92.b;
import lq0.k;

public final class j
{
    public static final j f;
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    
    static {
        f = new j(false, 0, true, 1, 1);
    }
    
    public j(final boolean a, final int b, final boolean c, final int d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof j)) {
            return false;
        }
        final boolean a = this.a;
        final j j = (j)o;
        return a == j.a && this.b == j.b && this.c == j.c && this.d == j.d && this.e == j.e;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.e) + a.c(this.d, (Boolean.hashCode(this.c) + a.c(this.b, Boolean.hashCode(this.a) * 31, 31)) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("ImeOptions(singleLine=");
        r.append(this.a);
        r.append(", capitalization=");
        r.append((Object)k.O0(this.b));
        r.append(", autoCorrect=");
        r.append(this.c);
        r.append(", keyboardType=");
        r.append((Object)a92.b.g0(this.d));
        r.append(", imeAction=");
        r.append((Object)i.a(this.e));
        r.append(')');
        return r.toString();
    }
}
