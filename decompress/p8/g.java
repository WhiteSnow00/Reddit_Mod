// 
// Decompiled by Procyon v0.6.0
// 

package p8;

import j0.i;
import java.security.MessageDigest;
import l9.b;

public final class g implements d
{
    public final b a;
    
    public g() {
        this.a = new b();
    }
    
    public final <T> T a(final f<T> f) {
        Object o;
        if (((i)this.a).containsKey((Object)f)) {
            o = ((i)this.a).getOrDefault((Object)f, (Object)null);
        }
        else {
            o = f.a;
        }
        return (T)o;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof g && ((i)this.a).equals((Object)((g)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("Options{values=");
        t.append(this.a);
        t.append('}');
        return t.toString();
    }
    
    @Override
    public final void updateDiskCacheKey(final MessageDigest messageDigest) {
        int n = 0;
        while (true) {
            final b a = this.a;
            if (n >= ((i)a).h) {
                break;
            }
            final f f = (f)((i)a).j(n);
            final Object n2 = ((i)this.a).n(n);
            final f.b<T> b = f.b;
            if (f.d == null) {
                f.d = f.c.getBytes(d.c);
            }
            b.a(f.d, (T)n2, messageDigest);
            ++n;
        }
    }
}
