// 
// Decompiled by Procyon v0.6.0
// 

package rm2;

import java.util.NoSuchElementException;
import java.util.Iterator;

public final class a
{
    public static byte[] a(byte[] array) {
        if (array == null) {
            array = null;
        }
        else {
            array = array.clone();
        }
        return array;
    }
    
    public static byte[] b(final byte[] array, final byte[] array2) {
        if (array2 == null) {
            return array.clone();
        }
        final byte[] array3 = new byte[array.length + array2.length];
        System.arraycopy(array, 0, array3, 0, array.length);
        System.arraycopy(array2, 0, array3, array.length, array2.length);
        return array3;
    }
    
    public static byte[] c(final int n, final byte[] array) {
        final int n2 = n - 4;
        if (n2 >= 0) {
            final byte[] array2 = new byte[n2];
            System.arraycopy(array, 4, array2, 0, Math.min(array.length - 4, n2));
            return array2;
        }
        final StringBuffer sb = new StringBuffer(4);
        sb.append(" > ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static int d(int n, final int[] array) {
        if (array == null) {
            return 0;
        }
        final int n2 = n + 1;
        int n3 = n;
        n = n2;
        while (--n3 >= 0) {
            n = (n * 257 ^ array[0 + n3]);
        }
        return n;
    }
    
    public static int e(final byte[] array) {
        if (array == null) {
            return 0;
        }
        int length = array.length;
        int n = length + 1;
        while (--length >= 0) {
            n = (n * 257 ^ array[length]);
        }
        return n;
    }
    
    public static int f(final int[] array) {
        if (array == null) {
            return 0;
        }
        int length = array.length;
        int n = length + 1;
        while (--length >= 0) {
            n = (n * 257 ^ array[length]);
        }
        return n;
    }
    
    public static int g(final long[] array, int n) {
        if (array == null) {
            return 0;
        }
        final int n2 = n + 1;
        int n3 = n;
        n = n2;
        while (--n3 >= 0) {
            final long n4 = array[0 + n3];
            n = ((n * 257 ^ (int)n4) * 257 ^ (int)(n4 >>> 32));
        }
        return n;
    }
    
    public static int h(final short[] array) {
        if (array == null) {
            return 0;
        }
        int length = array.length;
        int n = length + 1;
        while (--length >= 0) {
            n = (n * 257 ^ (array[length] & 0xFF));
        }
        return n;
    }
    
    public static int i(final short[][] array) {
        int i = 0;
        int n = 0;
        while (i != array.length) {
            n = n * 257 + h(array[i]);
            ++i;
        }
        return n;
    }
    
    public static final class a<T> implements Iterator<T>
    {
        public final T[] f;
        public int g;
        
        public a(final T[] f) {
            this.g = 0;
            this.f = f;
        }
        
        @Override
        public final boolean hasNext() {
            return this.g < this.f.length;
        }
        
        @Override
        public final T next() {
            final int g = this.g;
            final T[] f = this.f;
            if (g != f.length) {
                this.g = g + 1;
                return f[g];
            }
            final StringBuilder r = a.r("Out of elements: ");
            r.append(this.g);
            throw new NoSuchElementException(r.toString());
        }
        
        @Override
        public final void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }
}
