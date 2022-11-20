// 
// Decompiled by Procyon v0.6.0
// 

package zf2;

import hf2.a;
import java.util.concurrent.TimeUnit;

public final class b<T>
{
    public final T a;
    public final long b;
    public final TimeUnit c;
    
    public b(final T a, final long b, final TimeUnit c) {
        this.a = a;
        this.b = b;
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("unit is null");
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof b;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final b b4 = (b)o;
            b3 = b2;
            if (hf2.a.a((Object)this.a, (Object)b4.a)) {
                b3 = b2;
                if (this.b == b4.b) {
                    b3 = b2;
                    if (hf2.a.a((Object)this.c, (Object)b4.c)) {
                        b3 = true;
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        final T a = this.a;
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        final long b = this.b;
        return this.c.hashCode() + (hashCode * 31 + (int)(b ^ b >>> 31)) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("Timed[time=");
        t.append(this.b);
        t.append(", unit=");
        t.append(this.c);
        t.append(", value=");
        t.append(this.a);
        t.append("]");
        return t.toString();
    }
}
