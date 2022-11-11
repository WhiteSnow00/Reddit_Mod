// 
// Decompiled by Procyon v0.6.0
// 

package bh0;

import al0.g7;
import java.util.Arrays;
import sg2.e;

public final class a
{
    public final long a;
    public final long b;
    public final byte[] c;
    public final boolean d;
    
    public a(final long a, final long b, final byte[] c, final boolean d) {
        e.f((Object)c, "event");
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
        Class<?> class1;
        if (o != null) {
            class1 = o.getClass();
        }
        else {
            class1 = null;
        }
        if (!e.a((Object)a.class, (Object)class1)) {
            return false;
        }
        e.d(o, "null cannot be cast to non-null type com.reddit.events.data.db.model.EventDataModel");
        final a a = (a)o;
        return this.a == a.a && this.b == a.b && Arrays.equals(this.c, a.c);
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.c) + b.b(this.b, Long.hashCode(this.a) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("EventDataModel(id=");
        r.append(this.a);
        r.append(", timestamp=");
        r.append(this.b);
        r.append(", event=");
        r.append(Arrays.toString(this.c));
        r.append(", dispatched=");
        return g7.m(r, this.d, ')');
    }
}
