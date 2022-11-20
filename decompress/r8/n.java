// 
// Decompiled by Procyon v0.6.0
// 

package r8;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p8.j;
import s8.b;
import l9.g;
import p8.d;

public final class n implements d
{
    public static final g<Class<?>, byte[]> j;
    public final b a;
    public final d b;
    public final d d;
    public final int e;
    public final int f;
    public final Class<?> g;
    public final p8.g h;
    public final j<?> i;
    
    static {
        j = new g(50L);
    }
    
    public n(final b a, final d b, final d d, final int e, final int f, final j<?> i, final Class<?> g, final p8.g h) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        this.f = f;
        this.i = i;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof n;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final n n = (n)o;
            b3 = b2;
            if (this.f == n.f) {
                b3 = b2;
                if (this.e == n.e) {
                    b3 = b2;
                    if (l9.j.b((Object)this.i, (Object)n.i)) {
                        b3 = b2;
                        if (this.g.equals(n.g)) {
                            b3 = b2;
                            if (this.b.equals(n.b)) {
                                b3 = b2;
                                if (this.d.equals(n.d)) {
                                    b3 = b2;
                                    if (this.h.equals(n.h)) {
                                        b3 = true;
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
        final int n = ((this.d.hashCode() + this.b.hashCode() * 31) * 31 + this.e) * 31 + this.f;
        final j<?> i = this.i;
        int n2 = n;
        if (i != null) {
            n2 = n * 31 + i.hashCode();
        }
        return this.h.hashCode() + (this.g.hashCode() + n2 * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("ResourceCacheKey{sourceKey=");
        t.append(this.b);
        t.append(", signature=");
        t.append(this.d);
        t.append(", width=");
        t.append(this.e);
        t.append(", height=");
        t.append(this.f);
        t.append(", decodedResourceClass=");
        t.append(this.g);
        t.append(", transformation='");
        t.append(this.i);
        t.append('\'');
        t.append(", options=");
        t.append(this.h);
        t.append('}');
        return t.toString();
    }
    
    @Override
    public final void updateDiskCacheKey(final MessageDigest messageDigest) {
        final byte[] array = (byte[])this.a.c();
        ByteBuffer.wrap(array).putInt(this.e).putInt(this.f).array();
        this.d.updateDiskCacheKey(messageDigest);
        this.b.updateDiskCacheKey(messageDigest);
        messageDigest.update(array);
        final j<?> i = this.i;
        if (i != null) {
            i.updateDiskCacheKey(messageDigest);
        }
        this.h.updateDiskCacheKey(messageDigest);
        final g<Class<?>, byte[]> j = n.j;
        byte[] bytes;
        if ((bytes = (byte[])j.a((Object)this.g)) == null) {
            bytes = this.g.getName().getBytes(p8.d.c);
            j.d((Object)this.g, (Object)bytes);
        }
        messageDigest.update(bytes);
        this.a.a(array);
    }
}
