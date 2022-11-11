// 
// Decompiled by Procyon v0.6.0
// 

package m2;

import java.util.Map;
import ig2.j;
import java.util.ConcurrentModificationException;
import java.util.Arrays;
import sg2.e;

public final class b<K, V>
{
    public int[] a;
    public Object[] b;
    public int c;
    
    public b() {
        this(0);
    }
    
    public b(final int n) {
        this.a = a92.b.w;
        this.b = a92.b.x;
        this.c = 0;
    }
    
    public final V a(final K k) {
        int n;
        if (k == null) {
            n = this.c();
        }
        else {
            n = this.b(k.hashCode(), k);
        }
        Object o;
        if (n >= 0) {
            o = this.b[(n << 1) + 1];
        }
        else {
            o = null;
        }
        return (V)o;
    }
    
    public final int b(final int n, final Object o) {
        e.f(o, "key");
        final int c = this.c;
        if (c == 0) {
            return -1;
        }
        final int w = a92.b.w(c, n, this.a);
        if (w < 0) {
            return w;
        }
        if (e.a(o, this.b[w << 1])) {
            return w;
        }
        int n2;
        for (n2 = w + 1; n2 < c && this.a[n2] == n; ++n2) {
            if (e.a(o, this.b[n2 << 1])) {
                return n2;
            }
        }
        for (int n3 = w - 1; n3 >= 0 && this.a[n3] == n; --n3) {
            if (e.a(o, this.b[n3 << 1])) {
                return n3;
            }
        }
        return ~n2;
    }
    
    public final int c() {
        final int c = this.c;
        if (c == 0) {
            return -1;
        }
        int w = a92.b.w(c, 0, this.a);
        if (w < 0) {
            return w;
        }
        if (this.b[w << 1] == null) {
            return w;
        }
        int n;
        for (n = w + 1; n < c && this.a[n] == 0; ++n) {
            if (this.b[n << 1] == null) {
                return n;
            }
        }
        --w;
        while (w >= 0 && this.a[w] == 0) {
            if (this.b[w << 1] == null) {
                return w;
            }
            --w;
        }
        return ~n;
    }
    
    public final Object d(final androidx.compose.ui.text.font.b.b b, final androidx.compose.ui.text.font.b.a a) {
        final int c = this.c;
        int hashCode;
        int n;
        if (b == null) {
            hashCode = 0;
            n = this.c();
        }
        else {
            hashCode = b.hashCode();
            n = this.b(hashCode, b);
        }
        if (n >= 0) {
            final int n2 = (n << 1) + 1;
            final Object[] b2 = this.b;
            final Object o = b2[n2];
            b2[n2] = a;
            return o;
        }
        final int n3 = ~n;
        final int[] a2 = this.a;
        if (c >= a2.length) {
            int n4 = 4;
            if (c >= 8) {
                n4 = (c >> 1) + c;
            }
            else if (c >= 4) {
                n4 = 8;
            }
            final int[] copy = Arrays.copyOf(a2, n4);
            e.e((Object)copy, "copyOf(this, newSize)");
            this.a = copy;
            final Object[] copy2 = Arrays.copyOf(this.b, n4 << 1);
            e.e((Object)copy2, "copyOf(this, newSize)");
            this.b = copy2;
            if (c != this.c) {
                throw new ConcurrentModificationException();
            }
        }
        if (n3 < c) {
            final int[] a3 = this.a;
            final int n5 = n3 + 1;
            j.C0(n5, n3, c, a3, a3);
            final Object[] b3 = this.b;
            j.F0(b3, n5 << 1, b3, n3 << 1, this.c << 1);
        }
        final int c2 = this.c;
        if (c == c2) {
            final int[] a4 = this.a;
            if (n3 < a4.length) {
                a4[n3] = hashCode;
                final Object[] b4 = this.b;
                final int n6 = n3 << 1;
                b4[n6] = b;
                b4[n6 + 1] = a;
                this.c = c2 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        try {
            if (o instanceof b) {
                final b b = (b)o;
                final int c = this.c;
                if (c != b.c) {
                    return false;
                }
                for (int i = 0; i < c; ++i) {
                    final Object[] b2 = this.b;
                    final int n = i << 1;
                    final Object o2 = b2[n];
                    final Object o3 = b2[n + 1];
                    final V a = b.a(o2);
                    if (o3 == null) {
                        if (a == null) {
                            int n2;
                            if (o2 == null) {
                                n2 = b.c();
                            }
                            else {
                                n2 = b.b(o2.hashCode(), o2);
                            }
                            if (n2 >= 0) {
                                continue;
                            }
                        }
                        return false;
                    }
                    if (!e.a(o3, (Object)a)) {
                        return false;
                    }
                }
                return true;
            }
            else {
                if (!(o instanceof Map)) {
                    return false;
                }
                if (this.c != ((Map)o).size()) {
                    return false;
                }
                for (int c2 = this.c, j = 0; j < c2; ++j) {
                    final Object[] b3 = this.b;
                    final int n3 = j << 1;
                    final Object o4 = b3[n3];
                    final Object o5 = b3[n3 + 1];
                    final Object value = ((Map)o).get(o4);
                    if (o5 == null) {
                        if (value != null || !((Map)o).containsKey(o4)) {
                            return false;
                        }
                    }
                    else if (!e.a(o5, value)) {
                        return false;
                    }
                }
                return true;
            }
        }
        catch (final NullPointerException | ClassCastException ex) {
            return false;
        }
    }
    
    @Override
    public final int hashCode() {
        final int[] a = this.a;
        final Object[] b = this.b;
        int n2;
        for (int c = this.c, n = 1, i = n2 = 0; i < c; ++i, n += 2) {
            final Object o = b[n];
            final int n3 = a[i];
            int hashCode;
            if (o != null) {
                hashCode = o.hashCode();
            }
            else {
                hashCode = 0;
            }
            n2 += (hashCode ^ n3);
        }
        return n2;
    }
    
    @Override
    public final String toString() {
        final int c = this.c;
        final int n = 0;
        if (c <= 0) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(c * 28);
        sb.append('{');
        for (int c2 = this.c, i = n; i < c2; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            final Object[] b = this.b;
            final int n2 = i << 1;
            final Object o = b[n2];
            if (o != this) {
                sb.append(o);
            }
            else {
                sb.append("(this Map)");
            }
            sb.append('=');
            final Object o2 = this.b[n2 + 1];
            if (o2 != this) {
                sb.append(o2);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        final String string = sb.toString();
        e.e((Object)string, "buffer.toString()");
        return string;
    }
}
