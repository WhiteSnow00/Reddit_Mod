// 
// Decompiled by Procyon v0.6.0
// 

package h2;

import ah2.f;
import java.util.concurrent.atomic.AtomicInteger;

public final class m implements l
{
    public static AtomicInteger h;
    public final int f;
    public final j g;
    
    static {
        m.h = new AtomicInteger(0);
    }
    
    public m(final boolean g, final boolean h, final zg2.l l, final int f) {
        ah2.f.f((Object)l, "properties");
        this.f = f;
        final j g2 = new j();
        g2.g = g;
        g2.h = h;
        l.invoke((Object)g2);
        this.g = g2;
    }
    
    @Override
    public final j Q0() {
        return this.g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof m)) {
            return false;
        }
        final int f = this.f;
        final m m = (m)o;
        return f == m.f && ah2.f.a((Object)this.g, (Object)m.g);
    }
    
    @Override
    public final int getId() {
        return this.f;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.f) + this.g.hashCode() * 31;
    }
}
