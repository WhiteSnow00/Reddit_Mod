// 
// Decompiled by Procyon v0.6.0
// 

package o2;

import lg.e0;
import sg2.e;
import java.util.List;

public final class a implements d
{
    public final i2.a a;
    public final int b;
    
    public a(final String s, final int b) {
        final i2.a a = new i2.a(6, s, null);
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final f f) {
        e.f((Object)f, "buffer");
        final int d = f.d;
        if (d != -1) {
            f.d(d, f.e, this.a.f);
        }
        else {
            f.d(f.b, f.c, this.a.f);
        }
        final int b = f.b;
        int c = f.c;
        if (b != c) {
            c = -1;
        }
        final int b2 = this.b;
        int n = c + b2;
        if (b2 > 0) {
            --n;
        }
        else {
            n -= this.a.f.length();
        }
        final int v = e0.v(n, 0, f.c());
        f.f(v, v);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final String f = this.a.f;
        final a a = (a)o;
        return e.a((Object)f, (Object)a.a.f) && this.b == a.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a.f.hashCode() * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("CommitTextCommand(text='");
        r.append(this.a.f);
        r.append("', newCursorPosition=");
        return d.l(r, this.b, ')');
    }
}
