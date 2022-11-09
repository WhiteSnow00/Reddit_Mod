// 
// Decompiled by Procyon v0.6.0
// 

package o2;

import n02.r;
import androidx.appcompat.widget.s0;

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
        return Integer.hashCode(this.e) + s0.e(this.d, (Boolean.hashCode(this.c) + s0.e(this.b, Boolean.hashCode(this.a) * 31, 31)) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("ImeOptions(singleLine=");
        k.append(this.a);
        k.append(", capitalization=");
        k.append((Object)r.r0(this.b));
        k.append(", autoCorrect=");
        k.append(this.c);
        k.append(", keyboardType=");
        k.append((Object)yl.a.y1(this.d));
        k.append(", imeAction=");
        k.append((Object)i.a(this.e));
        k.append(')');
        return k.toString();
    }
}
