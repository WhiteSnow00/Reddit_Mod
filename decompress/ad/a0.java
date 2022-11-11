// 
// Decompiled by Procyon v0.6.0
// 

package ad;

public final class a0
{
    public long a;
    public long b;
    public long c;
    public final ThreadLocal<Long> d;
    
    public a0(final long n) {
        this.d = new ThreadLocal<Long>();
        this.d(n);
    }
    
    public final long a(final long c) {
        monitorenter(this);
        if (c == -9223372036854775807L) {
            monitorexit(this);
            return -9223372036854775807L;
        }
        try {
            if (this.b == -9223372036854775807L) {
                long n;
                if ((n = this.a) == 9223372036854775806L) {
                    final Long n2 = this.d.get();
                    n2.getClass();
                    n = n2;
                }
                this.b = n - c;
                this.notifyAll();
            }
            this.c = c;
            final long b = this.b;
            monitorexit(this);
            return c + b;
        }
        finally {
            monitorexit(this);
        }
    }
    
    public final long b(long a) {
        monitorenter(this);
        if (a == -9223372036854775807L) {
            monitorexit(this);
            return -9223372036854775807L;
        }
        try {
            final long c = this.c;
            long n = a;
            if (c != -9223372036854775807L) {
                final long n2 = c * 90000L / 1000000L;
                final long n3 = (4294967296L + n2) / 8589934592L;
                final long n4 = (n3 - 1L) * 8589934592L + a;
                a = (n = a + n3 * 8589934592L);
                if (Math.abs(n4 - n2) < Math.abs(a - n2)) {
                    n = n4;
                }
            }
            a = this.a(n * 1000000L / 90000L);
            return a;
        }
        finally {
            monitorexit(this);
        }
    }
    
    public final long c() {
        synchronized (this) {
            final long a = this.a;
            if (a != Long.MAX_VALUE) {
                final long n = a;
                if (a != 9223372036854775806L) {
                    return n;
                }
            }
            return -9223372036854775807L;
        }
    }
    
    public final void d(long n) {
        synchronized (this) {
            this.a = n;
            if (n == Long.MAX_VALUE) {
                n = 0L;
            }
            else {
                n = -9223372036854775807L;
            }
            this.b = n;
            this.c = -9223372036854775807L;
        }
    }
}
