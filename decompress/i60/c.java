// 
// Decompiled by Procyon v0.6.0
// 

package i60;

import ah2.f;

public final class c
{
    public final String a;
    public final boolean b;
    public final long c;
    
    public c(final String a, final boolean b, final long c) {
        f.f((Object)a, "id");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static c a(final c c, boolean b, long c2, final int n) {
        String a;
        if ((n & 0x1) != 0x0) {
            a = c.a;
        }
        else {
            a = null;
        }
        if ((n & 0x2) != 0x0) {
            b = c.b;
        }
        if ((n & 0x4) != 0x0) {
            c2 = c.c;
        }
        c.getClass();
        f.f((Object)a, "id");
        return new c(a, b, c2);
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
        return f.a((Object)this.a, (Object)c.a) && this.b == c.b && this.c == c.c;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        return Long.hashCode(this.c) + (hashCode * 31 + b) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("AnnouncementDataModel(id=");
        k.append(this.a);
        k.append(", isHidden=");
        k.append(this.b);
        k.append(", impressionCount=");
        return androidx.viewpager.widget.c.k(k, this.c, ')');
    }
}
