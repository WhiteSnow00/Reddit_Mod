// 
// Decompiled by Procyon v0.6.0
// 

package a1;

import qg2.j;
import ah2.f;
import com.google.android.exoplayer2.source.rtsp.e;
import java.io.Serializable;

public final class b
{
    public int a = a;
    public Object b = b;
    public Serializable c = c;
    
    public final int a(final Object o) {
        final int identityHashCode = System.identityHashCode(o);
        int i = 0;
        int n = this.a - 1;
        while (i <= n) {
            final int n2 = i + n >>> 1;
            final Object o2 = ((Object[])this.b)[n2];
            final int identityHashCode2 = System.identityHashCode(o2);
            if (identityHashCode2 < identityHashCode) {
                i = n2 + 1;
            }
            else if (identityHashCode2 > identityHashCode) {
                n = n2 - 1;
            }
            else {
                if (o == o2) {
                    return n2;
                }
                for (int j = n2 - 1; -1 < j; --j) {
                    final Object o3 = ((Object[])this.b)[j];
                    if (o3 == o) {
                        return j;
                    }
                    if (System.identityHashCode(o3) != identityHashCode) {
                        break;
                    }
                }
                for (int j = n2 + 1; j < this.a; ++j) {
                    final Object o4 = ((Object[])this.b)[j];
                    if (o4 == o) {
                        return j;
                    }
                    if (System.identityHashCode(o4) != identityHashCode) {
                        j = -(j + 1);
                        return j;
                    }
                }
                int j = this.a;
                return -(j + 1);
            }
        }
        return -(i + 1);
    }
    
    public final void b(final Object o, final Object o2) {
        f.f(o, "key");
        final int a = this.a(o);
        if (a >= 0) {
            ((Object[])(Object)this.c)[a] = o2;
        }
        else {
            final int n = -(a + 1);
            final int a2 = this.a;
            final Object[] array = (Object[])this.b;
            final boolean b = a2 == array.length;
            Object[] b2;
            if (b) {
                b2 = new Object[a2 * 2];
            }
            else {
                b2 = array;
            }
            final int n2 = n + 1;
            j.j1(array, n2, b2, n, a2);
            if (b) {
                j.m1((Object[])this.b, b2, 0, 0, n, 6);
            }
            b2[n] = o;
            this.b = b2;
            Object[] c;
            if (b) {
                c = new Object[this.a * 2];
            }
            else {
                c = (Object[])(Object)this.c;
            }
            j.j1((Object[])(Object)this.c, n2, c, n, this.a);
            if (b) {
                j.m1((Object[])(Object)this.c, c, 0, 0, n, 6);
            }
            c[n] = o2;
            this.c = c;
            ++this.a;
        }
    }
}
