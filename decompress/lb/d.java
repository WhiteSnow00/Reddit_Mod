// 
// Decompiled by Procyon v0.6.0
// 

package lb;

import java.io.IOException;
import java.io.EOFException;
import bd.s;

public final class d
{
    public final e a;
    public final s b;
    public int c;
    public int d;
    public boolean e;
    
    public d() {
        this.a = new e();
        this.b = new s(new byte[65025], 0);
        this.c = -1;
    }
    
    public final boolean a(final db.e e) throws IOException {
        if (this.e) {
            this.e = false;
            this.b.y(0);
        }
        while (true) {
            final boolean e2 = this.e;
            boolean e3 = true;
            if (e2) {
                return true;
            }
            if (this.c < 0) {
                if (!this.a.b(e, -1L) || !this.a.a(e, true)) {
                    return false;
                }
                final e a = this.a;
                final int d = a.d;
                int n4;
                int c;
                if ((a.a & 0x1) == 0x1 && this.b.c == 0) {
                    this.d = 0;
                    int n = 0;
                    int i;
                    int n3;
                    do {
                        final int d2 = this.d;
                        final int n2 = 0 + d2;
                        final e a2 = this.a;
                        n3 = n;
                        if (n2 >= a2.c) {
                            break;
                        }
                        final int[] f = a2.f;
                        this.d = d2 + 1;
                        i = f[n2];
                        n3 = (n += i);
                    } while (i == 255);
                    n4 = d + n3;
                    c = this.d + 0;
                }
                else {
                    c = 0;
                    n4 = d;
                }
                boolean b;
                try {
                    e.n(n4);
                    b = true;
                }
                catch (final EOFException ex) {
                    b = false;
                }
                if (!b) {
                    return false;
                }
                this.c = c;
            }
            final int c2 = this.c;
            this.d = 0;
            int n5 = 0;
            int j;
            int n7;
            do {
                final int d3 = this.d;
                final int n6 = c2 + d3;
                final e a3 = this.a;
                n7 = n5;
                if (n6 >= a3.c) {
                    break;
                }
                final int[] f2 = a3.f;
                this.d = d3 + 1;
                j = f2[n6];
                n7 = (n5 += j);
            } while (j == 255);
            final int n8 = this.c + this.d;
            if (n7 > 0) {
                final s b2 = this.b;
                b2.a(b2.c + n7);
                final s b3 = this.b;
                final byte[] a4 = b3.a;
                final int c3 = b3.c;
                boolean b4;
                try {
                    e.f(a4, c3, n7, false);
                    b4 = true;
                }
                catch (final EOFException ex2) {
                    b4 = false;
                }
                if (!b4) {
                    return false;
                }
                final s b5 = this.b;
                b5.A(b5.c + n7);
                if (this.a.f[n8 - 1] == 255) {
                    e3 = false;
                }
                this.e = e3;
            }
            int c4;
            if ((c4 = n8) == this.a.c) {
                c4 = -1;
            }
            this.c = c4;
        }
    }
}
