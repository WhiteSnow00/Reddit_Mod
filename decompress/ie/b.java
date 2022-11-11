// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import android.support.v4.media.a;
import java.util.Map;
import java.util.HashMap;

public final class b
{
    public String a;
    public final long b;
    public final HashMap c;
    
    public b(final long b, final String a, final HashMap hashMap) {
        this.a = a;
        this.b = b;
        final HashMap c = new HashMap();
        this.c = c;
        if (hashMap != null) {
            c.putAll(hashMap);
        }
    }
    
    public final b a() {
        return new b(this.b, this.a, new HashMap(this.c));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        return this.b == b.b && this.a.equals(b.a) && this.c.equals(b.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        return this.c.hashCode() + (hashCode * 31 + (int)(b ^ b >>> 32)) * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final long b = this.b;
        final String string = this.c.toString();
        final StringBuilder sb = new StringBuilder();
        sb.append("Event{name='");
        sb.append(a);
        sb.append("', timestamp=");
        sb.append(b);
        return android.support.v4.media.a.l(sb, ", params=", string, "}");
    }
}
