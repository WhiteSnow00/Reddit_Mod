// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import ig2.j;
import lq0.k;
import java.util.Comparator;

public final class h
{
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public Object d;
    public Object e;
    public Object f;
    
    public h() {
        int i = 0;
        this.a = 0;
        this.d = new int[16];
        this.e = new int[16];
        final int[] f = new int[16];
        while (i < 16) {
            final int n = i + 1;
            f[i] = n;
            i = n;
        }
        this.f = f;
    }
    
    public h(final Comparator d, final int b) {
        boolean b2 = true;
        this.a = 1;
        if (d == null) {
            throw new NullPointerException("comparator");
        }
        this.d = d;
        this.b = b;
        k.l(b >= 0, "k (%s) must be >= 0", b);
        k.l(b <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", b);
        final long n = b * (long)2;
        final int n2 = (int)n;
        if (n != n2) {
            b2 = false;
        }
        if (b2) {
            this.e = new Object[n2];
            this.c = 0;
            this.f = null;
            return;
        }
        final StringBuilder sb = new StringBuilder(51);
        sb.append("overflow: ");
        sb.append("checkedMultiply");
        sb.append("(");
        sb.append(b);
        sb.append(", ");
        sb.append(2);
        sb.append(")");
        throw new ArithmeticException(sb.toString());
    }
    
    public final int a(int i) {
        final int b = this.b;
        final int[] array = (int[])this.d;
        final int length = array.length;
        if (b + 1 > length) {
            final int n = length * 2;
            final int[] d = new int[n];
            final int[] e = new int[n];
            j.H0(array, d, 0, 0, 14);
            j.H0((int[])this.e, e, 0, 0, 14);
            this.d = d;
            this.e = e;
        }
        final int n2 = this.b++;
        final int length2 = ((int[])this.f).length;
        if (this.c >= length2) {
            final int n3 = length2 * 2;
            final int[] f = new int[n3];
            int n4;
            for (int j = 0; j < n3; j = n4) {
                n4 = j + 1;
                f[j] = n4;
            }
            j.H0((int[])this.f, f, 0, 0, 14);
            this.f = f;
        }
        final int c = this.c;
        final int[] array2 = (int[])this.f;
        this.c = array2[c];
        final Object d2 = this.d;
        ((int[])d2)[n2] = i;
        array2[((int[])this.e)[n2] = c] = n2;
        final int[] array3 = (int[])d2;
        final int n5 = array3[n2];
        int n6;
        for (i = n2; i > 0; i = n6) {
            n6 = (i + 1 >> 1) - 1;
            if (array3[n6] <= n5) {
                break;
            }
            this.b(n6, i);
        }
        return c;
    }
    
    public final void b(final int n, final int n2) {
        switch (this.a) {
            default: {
                final Object[] array = (Object[])this.e;
                final Object o = array[n];
                array[n] = array[n2];
                array[n2] = o;
                return;
            }
            case 0: {
                final int[] array2 = (int[])this.d;
                final int[] array3 = (int[])this.e;
                final int[] array4 = (int[])this.f;
                final int n3 = array2[n];
                array2[n] = array2[n2];
                array2[n2] = n3;
                final int n4 = array3[n];
                array3[n] = array3[n2];
                array3[n2] = n4;
                array4[array3[n]] = n;
                array4[array3[n2]] = n2;
            }
        }
    }
}
