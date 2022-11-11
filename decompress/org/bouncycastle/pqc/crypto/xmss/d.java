// 
// Decompiled by Procyon v0.6.0
// 

package org.bouncycastle.pqc.crypto.xmss;

import hm2.k;
import androidx.lifecycle.w;
import hm2.e;

public final class d
{
    public final e a;
    public final a2.e b;
    public byte[] c;
    public byte[] d;
    
    public d(final e a) {
        if (a != null) {
            this.a = a;
            final int a2 = a.a;
            this.b = new a2.e(a2, a.d);
            this.c = new byte[a2];
            this.d = new byte[a2];
            return;
        }
        throw new NullPointerException("params == null");
    }
    
    public final byte[] a(byte[] a, int i, final c c) {
        final int a2 = this.a.a;
        if (a.length != a2) {
            throw new IllegalArgumentException(d.i("startHash needs to be ", a2, "bytes"));
        }
        c.a();
        final int n = i + 0;
        if (n > this.a.b - 1) {
            throw new IllegalArgumentException("max chain length must not be greater than w");
        }
        if (i == 0) {
            return a;
        }
        a = this.a(a, i - 1, c);
        final c$a c$a = ((org.bouncycastle.pqc.crypto.xmss.e.a<c$a>)((org.bouncycastle.pqc.crypto.xmss.e.a<c$a>)new c$a()).c(((org.bouncycastle.pqc.crypto.xmss.e)c).a)).d(((org.bouncycastle.pqc.crypto.xmss.e)c).b);
        c$a.e = c.e;
        c$a.f = c.f;
        c$a.g = n - 1;
        final c$a c$a2 = ((org.bouncycastle.pqc.crypto.xmss.e.a<c$a>)c$a).b(0);
        c$a2.getClass();
        final c c2 = new c(c$a2);
        final byte[] a3 = this.b.a(this.d, c2.a());
        final c$a c$a3 = ((org.bouncycastle.pqc.crypto.xmss.e.a<c$a>)((org.bouncycastle.pqc.crypto.xmss.e.a<c$a>)new c$a()).c(((org.bouncycastle.pqc.crypto.xmss.e)c2).a)).d(((org.bouncycastle.pqc.crypto.xmss.e)c2).b);
        c$a3.e = c2.e;
        c$a3.f = c2.f;
        c$a3.g = c2.g;
        final c$a c$a4 = ((org.bouncycastle.pqc.crypto.xmss.e.a<c$a>)c$a3).b(1);
        c$a4.getClass();
        final byte[] a4 = this.b.a(this.d, new c(c$a4).a());
        final byte[] array = new byte[a2];
        for (i = 0; i < a2; ++i) {
            array[i] = (byte)(a[i] ^ a4[i]);
        }
        final a2.e b = this.b;
        b.getClass();
        i = a3.length;
        final int g = b.g;
        if (i != g) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (a2 == g) {
            return b.c(a3, 0, array);
        }
        throw new IllegalArgumentException("wrong in length");
    }
    
    public final w b(c c) {
        final byte[][] array = new byte[this.a.c][];
        int f = 0;
        while (true) {
            final e a = this.a;
            if (f >= a.c) {
                return new w(a, array);
            }
            final c$a c$a = ((org.bouncycastle.pqc.crypto.xmss.e.a<c$a>)((org.bouncycastle.pqc.crypto.xmss.e.a<c$a>)new c$a()).c(((org.bouncycastle.pqc.crypto.xmss.e)c).a)).d(((org.bouncycastle.pqc.crypto.xmss.e)c).b);
            c$a.e = c.e;
            c$a.f = f;
            c$a.g = c.g;
            final c$a c$a2 = ((org.bouncycastle.pqc.crypto.xmss.e.a<c$a>)c$a).b(((org.bouncycastle.pqc.crypto.xmss.e)c).d);
            c$a2.getClass();
            c = new c(c$a2);
            if (f < 0 || f >= this.a.c) {
                throw new IllegalArgumentException("index out of bounds");
            }
            array[f] = this.a(this.b.a(this.c, k.i(32, (long)f)), this.a.b - 1, c);
            ++f;
        }
    }
    
    public final byte[] c(final byte[] array, c c) {
        final c$a c$a = ((org.bouncycastle.pqc.crypto.xmss.e.a<c$a>)((org.bouncycastle.pqc.crypto.xmss.e.a<c$a>)new c$a()).c(((org.bouncycastle.pqc.crypto.xmss.e)c).a)).d(((org.bouncycastle.pqc.crypto.xmss.e)c).b);
        c$a.e = c.e;
        c = (c)c$a.e();
        return this.b.a(array, c.a());
    }
    
    public final void d(final byte[] c, final byte[] d) {
        final int length = c.length;
        final int a = this.a.a;
        if (length != a) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
        }
        if (d == null) {
            throw new NullPointerException("publicSeed == null");
        }
        if (d.length == a) {
            this.c = c;
            this.d = d;
            return;
        }
        throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
    }
}
