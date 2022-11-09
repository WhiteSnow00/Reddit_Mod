// 
// Decompiled by Procyon v0.6.0
// 

package r8;

import java.security.MessageDigest;
import ng.f0;
import p8.g;
import p8.j;
import java.util.Map;
import p8.d;

public final class h implements d
{
    public final Object a;
    public final int b;
    public final int d;
    public final Class<?> e;
    public final Class<?> f;
    public final d g;
    public final Map<Class<?>, j<?>> h;
    public final g i;
    public int j;
    
    public h(final Object a, final d g, final int b, final int d, final Map<Class<?>, j<?>> h, final Class<?> e, final Class<?> f, final g i) {
        f0.a2(a);
        this.a = a;
        if (g == null) {
            throw new NullPointerException("Signature must not be null");
        }
        this.g = g;
        this.b = b;
        this.d = d;
        f0.a2(h);
        this.h = h;
        if (e == null) {
            throw new NullPointerException("Resource class must not be null");
        }
        this.e = e;
        if (f != null) {
            this.f = f;
            f0.a2(i);
            this.i = i;
            return;
        }
        throw new NullPointerException("Transcode class must not be null");
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof h;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final h h = (h)o;
            b3 = b2;
            if (this.a.equals(h.a)) {
                b3 = b2;
                if (this.g.equals(h.g)) {
                    b3 = b2;
                    if (this.d == h.d) {
                        b3 = b2;
                        if (this.b == h.b) {
                            b3 = b2;
                            if (this.h.equals(h.h)) {
                                b3 = b2;
                                if (this.e.equals(h.e)) {
                                    b3 = b2;
                                    if (this.f.equals(h.f)) {
                                        b3 = b2;
                                        if (this.i.equals((Object)h.i)) {
                                            b3 = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        if (this.j == 0) {
            final int hashCode = this.a.hashCode();
            this.j = hashCode;
            final int j = ((this.g.hashCode() + hashCode * 31) * 31 + this.b) * 31 + this.d;
            this.j = j;
            final int i = this.h.hashCode() + j * 31;
            this.j = i;
            final int k = this.e.hashCode() + i * 31;
            this.j = k;
            final int l = this.f.hashCode() + k * 31;
            this.j = l;
            this.j = this.i.hashCode() + l * 31;
        }
        return this.j;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("EngineKey{model=");
        k.append(this.a);
        k.append(", width=");
        k.append(this.b);
        k.append(", height=");
        k.append(this.d);
        k.append(", resourceClass=");
        k.append(this.e);
        k.append(", transcodeClass=");
        k.append(this.f);
        k.append(", signature=");
        k.append(this.g);
        k.append(", hashCode=");
        k.append(this.j);
        k.append(", transformations=");
        k.append(this.h);
        k.append(", options=");
        k.append(this.i);
        k.append('}');
        return k.toString();
    }
    
    @Override
    public final void updateDiskCacheKey(final MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
