// 
// Decompiled by Procyon v0.6.0
// 

package ja;

import ga.d;
import com.google.android.datatransport.runtime.c;

public final class b extends i
{
    public final c a;
    public final String b;
    public final ga.c<?> c;
    public final d<?, byte[]> d;
    public final ga.b e;
    
    public b(final c a, final String b, final ga.c c, final d d, final ga.b e) {
        this.a = a;
        this.b = b;
        this.c = (ga.c<?>)c;
        this.d = (d<?, byte[]>)d;
        this.e = e;
    }
    
    public final ga.b a() {
        return this.e;
    }
    
    public final ga.c<?> b() {
        return this.c;
    }
    
    public final d<?, byte[]> c() {
        return this.d;
    }
    
    public final c d() {
        return this.a;
    }
    
    public final String e() {
        return this.b;
    }
    
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
    
    public final int hashCode() {
        return ((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }
    
    public final String toString() {
        final StringBuilder r = a.r("SendRequest{transportContext=");
        r.append(this.a);
        r.append(", transportName=");
        r.append(this.b);
        r.append(", event=");
        r.append(this.c);
        r.append(", transformer=");
        r.append(this.d);
        r.append(", encoding=");
        r.append(this.e);
        r.append("}");
        return r.toString();
    }
    
    public static final class a extends i$a
    {
        public c a;
        public String b;
        public ga.c<?> c;
        public d<?, byte[]> d;
        public ga.b e;
    }
}
