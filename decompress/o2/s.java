// 
// Decompiled by Procyon v0.6.0
// 

package o2;

import lg.e0;
import sg2.e;
import java.util.List;
import i2.a;

public final class s implements d
{
    public final a a;
    public final int b;
    
    public s(final String s, final int b) {
        final a a = new a(6, s, null);
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final f f) {
        e.f((Object)f, "buffer");
        final int d = f.d;
        final int n = -1;
        if (d != -1) {
            f.d(d, f.e, this.a.f);
            if (this.a.f.length() > 0) {
                f.e(d, this.a.f.length() + d);
            }
        }
        else {
            final int b = f.b;
            f.d(b, f.c, this.a.f);
            if (this.a.f.length() > 0) {
                f.e(b, this.a.f.length() + b);
            }
        }
        final int b2 = f.b;
        final int c = f.c;
        int n2 = n;
        if (b2 == c) {
            n2 = c;
        }
        final int b3 = this.b;
        int n3 = n2 + b3;
        if (b3 > 0) {
            --n3;
        }
        else {
            n3 -= this.a.f.length();
        }
        final int v = e0.v(n3, 0, f.c());
        f.f(v, v);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof s)) {
            return false;
        }
        final String f = this.a.f;
        final s s = (s)o;
        return e.a((Object)f, (Object)s.a.f) && this.b == s.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a.f.hashCode() * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("SetComposingTextCommand(text='");
        r.append(this.a.f);
        r.append("', newCursorPosition=");
        return d.l(r, this.b, ')');
    }
}
