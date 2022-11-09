// 
// Decompiled by Procyon v0.6.0
// 

package ka;

import ha.d;
import com.google.android.datatransport.runtime.c;

public final class b extends i
{
    public final c a;
    public final String b;
    public final ha.c<?> c;
    public final d<?, byte[]> d;
    public final ha.b e;
    
    public b(final c a, final String b, final ha.c c, final d d, final ha.b e) {
        this.a = a;
        this.b = b;
        this.c = (ha.c<?>)c;
        this.d = (d<?, byte[]>)d;
        this.e = e;
    }
    
    @Override
    public final ha.b a() {
        return this.e;
    }
    
    @Override
    public final ha.c<?> b() {
        return this.c;
    }
    
    @Override
    public final d<?, byte[]> c() {
        return this.d;
    }
    
    @Override
    public final c d() {
        return this.a;
    }
    
    @Override
    public final String e() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof i) {
            final i i = (i)o;
            if (!this.a.equals(i.d()) || !this.b.equals(i.e()) || !this.c.equals(i.b()) || !this.d.equals(i.c()) || !this.e.equals((Object)i.a())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("SendRequest{transportContext=");
        k.append(this.a);
        k.append(", transportName=");
        k.append(this.b);
        k.append(", event=");
        k.append(this.c);
        k.append(", transformer=");
        k.append(this.d);
        k.append(", encoding=");
        k.append(this.e);
        k.append("}");
        return k.toString();
    }
    
    public static final class a extends i.a
    {
        public c a;
        public String b;
        public ha.c<?> c;
        public d<?, byte[]> d;
        public ha.b e;
    }
}
