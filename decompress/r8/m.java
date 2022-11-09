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

public final class m implements d
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
        j = new g<Class<?>, byte[]>(50L);
    }
    
    public m(final b a, final d b, final d d, final int e, final int f, final j<?> i, final Class<?> g, final p8.g h) {
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
        final boolean b = o instanceof m;
        boolean b3;
        final boolean b2 = b3 = false;
        if (b) {
            final m m = (m)o;
            b3 = b2;
            if (this.f == m.f) {
                b3 = b2;
                if (this.e == m.e) {
                    b3 = b2;
                    if (l9.j.b(this.i, m.i)) {
                        b3 = b2;
                        if (this.g.equals(m.g)) {
                            b3 = b2;
                            if (this.b.equals(m.b)) {
                                b3 = b2;
                                if (this.d.equals(m.d)) {
                                    b3 = b2;
                                    if (this.h.equals((Object)m.h)) {
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
        final StringBuilder k = a.k("ResourceCacheKey{sourceKey=");
        k.append(this.b);
        k.append(", signature=");
        k.append(this.d);
        k.append(", width=");
        k.append(this.e);
        k.append(", height=");
        k.append(this.f);
        k.append(", decodedResourceClass=");
        k.append(this.g);
        k.append(", transformation='");
        k.append(this.i);
        k.append('\'');
        k.append(", options=");
        k.append(this.h);
        k.append('}');
        return k.toString();
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
            ((d)i).updateDiskCacheKey(messageDigest);
        }
        this.h.updateDiskCacheKey(messageDigest);
        final g<Class<?>, byte[]> j = m.j;
        byte[] bytes;
        if ((bytes = j.a(this.g)) == null) {
            bytes = this.g.getName().getBytes(p8.d.c);
            j.d(this.g, bytes);
        }
        messageDigest.update(bytes);
        this.a.a(array);
    }
}
