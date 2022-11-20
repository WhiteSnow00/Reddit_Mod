// 
// Decompiled by Procyon v0.6.0
// 

package qc2;

import rc2.q;
import java.io.IOException;
import com.sendbird.android.shadow.okio.ByteString;
import com.sendbird.android.shadow.okio.a$a;
import com.sendbird.android.shadow.okio.a;
import rc2.d;
import java.util.Random;

public final class f
{
    public final boolean a;
    public final Random b;
    public final d c;
    public final a d;
    public boolean e;
    public final a f;
    public final f.f$a g;
    public boolean h;
    public final byte[] i;
    public final a$a j;
    
    public f(final boolean a, final d c, final Random b) {
        this.f = new a();
        this.g = new f.f$a(this);
        if (c == null) {
            throw new NullPointerException("sink == null");
        }
        if (b != null) {
            this.a = a;
            this.c = c;
            this.d = c.S0();
            this.b = b;
            final a$a a$a = null;
            byte[] i;
            if (a) {
                i = new byte[4];
            }
            else {
                i = null;
            }
            this.i = i;
            a$a j = a$a;
            if (a) {
                j = new a$a();
            }
            this.j = j;
            return;
        }
        throw new NullPointerException("random == null");
    }
    
    public final void a(final ByteString byteString, final int n) throws IOException {
        if (this.e) {
            throw new IOException("closed");
        }
        final int size = byteString.size();
        if (size <= 125L) {
            this.d.A(n | 0x80);
            if (this.a) {
                this.d.A(size | 0x80);
                this.b.nextBytes(this.i);
                this.d.write(this.i);
                if (size > 0) {
                    final a d = this.d;
                    final long g = d.g;
                    d.x(byteString);
                    this.d.n(this.j);
                    this.j.h(g);
                    qc2.d.b(this.j, this.i);
                    this.j.close();
                }
            }
            else {
                this.d.A(size);
                this.d.x(byteString);
            }
            this.c.flush();
            return;
        }
        throw new IllegalArgumentException("Payload size must be less than or equal to 125");
    }
    
    public final void b(final long n, int c, final boolean b, final boolean b2) throws IOException {
        if (!this.e) {
            final int n2 = 0;
            if (!b) {
                c = 0;
            }
            int n3 = c;
            if (b2) {
                n3 = (c | 0x80);
            }
            this.d.A(n3);
            c = n2;
            if (this.a) {
                c = 128;
            }
            if (n <= 125L) {
                this.d.A((int)n | c);
            }
            else if (n <= 65535L) {
                this.d.A(c | 0x7E);
                this.d.F((int)n);
            }
            else {
                this.d.A(c | 0x7F);
                final a d = this.d;
                final q v = d.v(8);
                final byte[] a = v.a;
                c = v.c;
                final int n4 = c + 1;
                a[c] = (byte)(n >>> 56 & 0xFFL);
                c = n4 + 1;
                a[n4] = (byte)(n >>> 48 & 0xFFL);
                final int n5 = c + 1;
                a[c] = (byte)(n >>> 40 & 0xFFL);
                c = n5 + 1;
                a[n5] = (byte)(n >>> 32 & 0xFFL);
                final int n6 = c + 1;
                a[c] = (byte)(n >>> 24 & 0xFFL);
                c = n6 + 1;
                a[n6] = (byte)(n >>> 16 & 0xFFL);
                final int n7 = c + 1;
                a[c] = (byte)(n >>> 8 & 0xFFL);
                a[n7] = (byte)(n & 0xFFL);
                v.c = n7 + 1;
                d.g += 8L;
            }
            if (this.a) {
                this.b.nextBytes(this.i);
                this.d.write(this.i);
                if (n > 0L) {
                    final a d2 = this.d;
                    final long g = d2.g;
                    d2.L(this.f, n);
                    this.d.n(this.j);
                    this.j.h(g);
                    qc2.d.b(this.j, this.i);
                    this.j.close();
                }
            }
            else {
                this.d.L(this.f, n);
            }
            this.c.X0();
            return;
        }
        throw new IOException("closed");
    }
}
