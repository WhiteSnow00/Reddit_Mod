// 
// Decompiled by Procyon v0.6.0
// 

package wd2;

import p1.h;
import aq2.a;
import ng2.e;

public final class c
{
    public final int a;
    public final String b;
    public final float c;
    public final int d;
    public final int e;
    public final String f;
    
    public c(final String b, final String f, final int a, final int d, final int e, final float c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
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
        return this.a == c.a && ng2.e.a((Object)this.b, (Object)c.b) && ng2.e.a((Object)this.c, (Object)c.c) && this.d == c.d && this.e == c.e && ng2.e.a((Object)this.f, (Object)c.f);
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode() + aq2.a.c(this.e, aq2.a.c(this.d, aq2.a.b(this.c, aq2.a.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("PlayerQuality(bitrate=");
        t.append(this.a);
        t.append(", codecs=");
        t.append(this.b);
        t.append(", framerate=");
        t.append(this.c);
        t.append(", height=");
        t.append(this.d);
        t.append(", width=");
        t.append(this.e);
        t.append(", name=");
        return h.c(t, this.f, ')');
    }
}
