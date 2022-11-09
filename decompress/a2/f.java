// 
// Decompiled by Procyon v0.6.0
// 

package a2;

import ll2.d;
import ll2.b;
import pm2.k;
import pm2.c;
import wk2.m;

public final class f
{
    public int a;
    public final Object b;
    
    public f(final int a, int i) {
        if (i != 1) {
            this.a = a;
            final Float[] b = new Float[a];
            for (i = 0; i < a; ++i) {
                b[i] = 0.0f;
            }
            this.b = b;
            return;
        }
        if (a > 0) {
            this.b = new Object[a];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }
    
    public final byte[] a(final byte[] array, final byte[] array2) {
        if (array.length != this.a) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (array2.length == 32) {
            return this.b(array, 3, array2);
        }
        throw new IllegalArgumentException("wrong address length");
    }
    
    public final byte[] b(byte[] array, int a, final byte[] array2) {
        final byte[] h = k.h(this.a, (long)a);
        ((b)this.b).a(0, h.length, h);
        ((b)this.b).a(0, array.length, array);
        ((b)this.b).a(0, array2.length, array2);
        a = this.a;
        array = new byte[a];
        final Object b = this.b;
        final boolean b2 = ((b)b) instanceof d;
        final b b3 = (b)b;
        if (b2) {
            ((d)b3).c(0, a, array);
        }
        else {
            b3.g(0, array);
        }
        return array;
    }
    
    public final void c(final Object o) {
        final int a = this.a;
        final Object[] array = (Object[])this.b;
        if (a < array.length) {
            array[a] = o;
            this.a = a + 1;
        }
    }
    
    public final float d(final f f) {
        f.f((Object)f, "a");
        final int a = this.a;
        float n = 0.0f;
        for (int i = 0; i < a; ++i) {
            n += ((Float[])f.b)[i] * ((Float[])this.b)[i];
        }
        return n;
    }
}
