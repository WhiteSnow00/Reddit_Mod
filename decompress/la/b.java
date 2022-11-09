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
    
    @Override
    public final Context a() {
        return this.a;
    }
    
    @Override
    public final String b() {
        return this.d;
    }
    
    @Override
    public final a c() {
        return this.c;
    }
    
    @Override
    public final a d() {
        return this.b;
    }
    
    @Override
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
    
    @Override
    public final int hashCode() {
        return (((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("CreationContext{applicationContext=");
        k.append(this.a);
        k.append(", wallClock=");
        k.append(this.b);
        k.append(", monotonicClock=");
        k.append(this.c);
        k.append(", backendName=");
        return a2.b.j(k, this.d, "}");
    }
}
