// 
// Decompiled by Procyon v0.6.0
// 

package i2;

import u2.k;
import ej2.c0;

public final class j
{
    public final long a;
    public final long b;
    public final int c;
    
    public j(final long a, final long b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (!(c0.A3(a) ^ true)) {
            throw new IllegalArgumentException("width cannot be TextUnit.Unspecified".toString());
        }
        if (c0.A3(b) ^ true) {
            return;
        }
        throw new IllegalArgumentException("height cannot be TextUnit.Unspecified".toString());
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof j)) {
            return false;
        }
        final long a = this.a;
        final j j = (j)o;
        return u2.j.a(a, j.a) && u2.j.a(this.b, j.b) && this.c == j.c;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final k[] b = u2.j.b;
        return Integer.hashCode(this.c) + b.b(this.b, Long.hashCode(a) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("Placeholder(width=");
        r.append((Object)u2.j.d(this.a));
        r.append(", height=");
        r.append((Object)u2.j.d(this.b));
        r.append(", placeholderVerticalAlign=");
        final int c = this.c;
        final int n = 0;
        String s;
        if (c == 1) {
            s = "AboveBaseline";
        }
        else if (c == 2) {
            s = "Top";
        }
        else if (c == 3) {
            s = "Bottom";
        }
        else if (c == 4) {
            s = "Center";
        }
        else if (c == 5) {
            s = "TextTop";
        }
        else if (c == 6) {
            s = "TextBottom";
        }
        else {
            int n2 = n;
            if (c == 7) {
                n2 = 1;
            }
            if (n2 != 0) {
                s = "TextCenter";
            }
            else {
                s = "Invalid";
            }
        }
        r.append((Object)s);
        r.append(')');
        return r.toString();
    }
}
