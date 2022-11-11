// 
// Decompiled by Procyon v0.6.0
// 

package ra;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.c;

public final class b extends j
{
    public final long a;
    public final c b;
    public final EventInternal c;
    
    public b(final long a, final c b, final EventInternal c) {
        this.a = a;
        if (b == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = b;
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null event");
    }
    
    public final EventInternal a() {
        return this.c;
    }
    
    public final long b() {
        return this.a;
    }
    
    public final c c() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof j) {
            final j j = (j)o;
            if (this.a != j.b() || !this.b.equals(j.c()) || !this.c.equals(j.a())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final long a = this.a;
        return (((int)(a ^ a >>> 32) ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    public final String toString() {
        final StringBuilder r = a.r("PersistedEvent{id=");
        r.append(this.a);
        r.append(", transportContext=");
        r.append(this.b);
        r.append(", event=");
        r.append(this.c);
        r.append("}");
        return r.toString();
    }
}
