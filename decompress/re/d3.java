// 
// Decompiled by Procyon v0.6.0
// 

package re;

import android.os.Bundle;

public final class d3
{
    public final String a;
    public final String b;
    public final long c;
    public final Bundle d;
    
    public d3(final long c, final Bundle d, final String a, final String b) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public static d3 b(final t t) {
        return new d3(t.i, t.g.f(), t.f, t.h);
    }
    
    public final t a() {
        return new t(this.a, new r(new Bundle(this.d)), this.b, this.c);
    }
    
    @Override
    public final String toString() {
        final String b = this.b;
        final String a = this.a;
        final String string = this.d.toString();
        final StringBuilder m = b.m("origin=", b, ",name=", a, ",params=");
        m.append(string);
        return m.toString();
    }
}
