// 
// Decompiled by Procyon v0.6.0
// 

package uj2;

import hg2.j;
import java.util.Arrays;
import sg2.e;
import ig2.h;

public final class i implements l
{
    public char[] a;
    public int b;
    
    public i() {
        synchronized (c.a) {
            final h b = c.b;
            final boolean empty = b.isEmpty();
            final char[] array = null;
            Object removeLast;
            if (empty) {
                removeLast = null;
            }
            else {
                removeLast = b.removeLast();
            }
            final char[] array2 = (char[])removeLast;
            char[] array3 = array;
            if (array2 != null) {
                c.c -= array2.length;
                array3 = array2;
            }
            monitorexit(c.a);
            char[] a;
            if ((a = array3) == null) {
                a = new char[128];
            }
            this.a = a;
        }
    }
    
    public final void a(final char c) {
        this.d(this.b, 1);
        this.a[this.b++] = c;
    }
    
    public final void b(final String s) {
        e.f((Object)s, "text");
        this.d(this.b, s.length() + 2);
        final char[] a = this.a;
        final int b = this.b;
        final int n = b + 1;
        a[b] = 34;
        final int length = s.length();
        s.getChars(0, length, a, n);
        final int n2 = length + n;
        for (int i = n; i < n2; ++i) {
            final char c = a[i];
            final byte[] b2 = p.b;
            if (c < b2.length && b2[c] != 0) {
                for (int j = i - n; j < s.length(); ++j) {
                    this.d(i, 2);
                    final char char1 = s.charAt(j);
                    final byte[] b3 = p.b;
                    if (char1 < b3.length) {
                        final byte b4 = b3[char1];
                        if (b4 == 0) {
                            final char[] a2 = this.a;
                            final int n3 = i + 1;
                            a2[i] = char1;
                            i = n3;
                        }
                        else if (b4 == 1) {
                            final String s2 = p.a[char1];
                            e.c((Object)s2);
                            this.d(i, s2.length());
                            s2.getChars(0, s2.length(), this.a, i);
                            i += s2.length();
                            this.b = i;
                        }
                        else {
                            final char[] a3 = this.a;
                            a3[i] = 92;
                            a3[i + 1] = (char)b4;
                            i += 2;
                            this.b = i;
                        }
                    }
                    else {
                        final char[] a4 = this.a;
                        final int n4 = i + 1;
                        a4[i] = char1;
                        i = n4;
                    }
                }
                this.d(i, 1);
                this.a[i] = 34;
                this.b = i + 1;
                return;
            }
        }
        a[n2] = 34;
        this.b = n2 + 1;
    }
    
    public final void c(final String s) {
        e.f((Object)s, "text");
        final int length = s.length();
        if (length == 0) {
            return;
        }
        this.d(this.b, length);
        s.getChars(0, s.length(), this.a, this.b);
        this.b += length;
    }
    
    public final void d(int n, int n2) {
        n2 += n;
        final char[] a = this.a;
        if (a.length <= n2) {
            final int n3 = n * 2;
            if ((n = n2) < n3) {
                n = n3;
            }
            final char[] copy = Arrays.copyOf(a, n);
            e.e((Object)copy, "copyOf(this, newSize)");
            this.a = copy;
        }
    }
    
    public final void e() {
        final c a = c.a;
        final char[] a2 = this.a;
        e.f((Object)a2, "array");
        synchronized (a) {
            final int c = uj2.c.c;
            if (a2.length + c < uj2.c.d) {
                uj2.c.c = c + a2.length;
                uj2.c.b.addLast((Object)a2);
            }
            final j a3 = j.a;
        }
    }
    
    @Override
    public final String toString() {
        return new String(this.a, 0, this.b);
    }
    
    public final void writeLong(final long n) {
        this.c(String.valueOf(n));
    }
}
