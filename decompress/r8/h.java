// 
// Decompiled by Procyon v0.6.0
// 

package r8;

import java.security.MessageDigest;
import ah0.b;
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
        ah0.b.F(a);
        this.a = a;
        if (g == null) {
            throw new NullPointerException("Signature must not be null");
        }
        this.g = g;
        this.b = b;
        this.d = d;
        ah0.b.F((Object)h);
        this.h = h;
        if (e == null) {
            throw new NullPointerException("Resource class must not be null");
        }
        this.e = e;
        if (f != null) {
            this.f = f;
            ah0.b.F((Object)i);
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
                                        if (this.i.equals(h.i)) {
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
        final StringBuilder t = a.t("EngineKey{model=");
        t.append(this.a);
        t.append(", width=");
        t.append(this.b);
        t.append(", height=");
        t.append(this.d);
        t.append(", resourceClass=");
        t.append(this.e);
        t.append(", transcodeClass=");
        t.append(this.f);
        t.append(", signature=");
        t.append(this.g);
        t.append(", hashCode=");
        t.append(this.j);
        t.append(", transformations=");
        t.append(this.h);
        t.append(", options=");
        t.append(this.i);
        t.append('}');
        return t.toString();
    }
    
    @Override
    public final void updateDiskCacheKey(final MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
