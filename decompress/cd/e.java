// 
// Decompiled by Procyon v0.6.0
// 

package cd;

import java.util.Arrays;

public final class e
{
    public a a;
    public a b;
    public boolean c;
    public long d;
    public int e;
    
    public e() {
        this.a = new a();
        this.b = new a();
        this.d = -9223372036854775807L;
    }
    
    public final boolean a() {
        return this.a.a();
    }
    
    public static final class a
    {
        public long a;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
        public final boolean[] g;
        public int h;
        
        public a() {
            this.g = new boolean[15];
        }
        
        public final boolean a() {
            return this.d > 15L && this.h == 0;
        }
        
        public final void b(final long n) {
            final long d = this.d;
            if (d == 0L) {
                this.a = n;
            }
            else if (d == 1L) {
                final long n2 = n - this.a;
                this.b = n2;
                this.f = n2;
                this.e = 1L;
            }
            else {
                final long n3 = n - this.c;
                final int n4 = (int)(d % 15L);
                if (Math.abs(n3 - this.b) <= 1000000L) {
                    ++this.e;
                    this.f += n3;
                    final boolean[] g = this.g;
                    if (g[n4]) {
                        g[n4] = false;
                        --this.h;
                    }
                }
                else {
                    final boolean[] g2 = this.g;
                    if (!g2[n4]) {
                        g2[n4] = true;
                        ++this.h;
                    }
                }
            }
            ++this.d;
            this.c = n;
        }
        
        public final void c() {
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.h = 0;
            Arrays.fill(this.g, false);
        }
    }
}
