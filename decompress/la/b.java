// 
// Decompiled by Procyon v0.6.0
// 

package la;

import ua.a;
import android.content.Context;

public final class b extends f
{
    public final Context a;
    public final a b;
    public final a c;
    public final String d;
    
    public b(final Context a, final a b, final a c, final String d) {
        if (a == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.a = a;
        if (b == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = b;
        if (c == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = c;
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null backendName");
    }
    
    public final Context a() {
        return this.a;
    }
    
    public final String b() {
        return this.d;
    }
    
    public final a c() {
        return this.c;
    }
    
    public final a d() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof f) {
            final f f = (f)o;
            if (!this.a.equals(f.a()) || !this.b.equals(f.d()) || !this.c.equals(f.c()) || !this.d.equals(f.b())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return (((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
    }
    
    public final String toString() {
        final StringBuilder t = a.t("CreationContext{applicationContext=");
        t.append(this.a);
        t.append(", wallClock=");
        t.append(this.b);
        t.append(", monotonicClock=");
        t.append(this.c);
        t.append(", backendName=");
        return ph0.a.f(t, this.d, "}");
    }
}
