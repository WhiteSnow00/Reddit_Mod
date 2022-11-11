// 
// Decompiled by Procyon v0.6.0
// 

package o8;

import android.text.TextUtils;
import java.security.MessageDigest;

public final class f<T>
{
    public static final f$a e;
    public final T a;
    public final b<T> b;
    public final String c;
    public volatile byte[] d;
    
    static {
        e = new b<Object>() {
            @Override
            public final void a(final byte[] array, final Object o, final MessageDigest messageDigest) {
            }
        };
    }
    
    public f(final String c, final T a, final b<T> b) {
        if (!TextUtils.isEmpty((CharSequence)c)) {
            this.c = c;
            this.a = a;
            this.b = b;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
    
    public static f a(final Object o, final String s) {
        return new f(s, (T)o, (b<T>)f.e);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof f && this.c.equals(((f)o).c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        return android.support.v4.media.a.k(a.r("Option{key='"), this.c, '\'', '}');
    }
    
    public interface b<T>
    {
        void a(final byte[] p0, final T p1, final MessageDigest p2);
    }
}
