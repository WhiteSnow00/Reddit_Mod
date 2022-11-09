// 
// Decompiled by Procyon v0.6.0
// 

package ha;

import com.google.android.datatransport.Priority;

public final class a<T> extends c<T>
{
    public final Integer a;
    public final T b;
    public final Priority c;
    
    public a(final Object b, final Priority c) {
        this.a = null;
        if (b == null) {
            throw new NullPointerException("Null payload");
        }
        this.b = (T)b;
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null priority");
    }
    
    public final Integer a() {
        return this.a;
    }
    
    public final T b() {
        return this.b;
    }
    
    public final Priority c() {
        return this.c;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof c) {
            final c c = (c)o;
            final Integer a = this.a;
            if (a == null) {
                if (c.a() != null) {
                    return false;
                }
            }
            else if (!a.equals(c.a())) {
                return false;
            }
            if (this.b.equals(c.b()) && this.c.equals(c.c())) {
                return b;
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final Integer a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return ((hashCode ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    public final String toString() {
        final StringBuilder k = a.k("Event{code=");
        k.append(this.a);
        k.append(", payload=");
        k.append(this.b);
        k.append(", priority=");
        k.append(this.c);
        k.append("}");
        return k.toString();
    }
}
