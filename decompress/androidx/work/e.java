// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

import l6.q;
import c6.h;
import java.util.concurrent.TimeUnit;

public final class e extends f
{
    public e(final a a) {
        super(a.b, a.c, a.d);
    }
    
    public static final class a extends f$a<a, e>
    {
        public a(final Class<? extends ListenableWorker> clazz, long millis, final TimeUnit timeUnit) {
            super((Class)clazz);
            final q c = super.c;
            if ((millis = timeUnit.toMillis(millis)) < 900000L) {
                c.getClass();
                h.c().f(q.s, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
                millis = 900000L;
            }
            c.d(millis, millis);
        }
        
        public a(final Class<? extends ListenableWorker> clazz, final long n, final TimeUnit timeUnit, final long n2, final TimeUnit timeUnit2) {
            super((Class)clazz);
            super.c.d(timeUnit.toMillis(n), timeUnit2.toMillis(n2));
        }
        
        public final f c() {
            if (super.a && super.c.j.c) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            if (!super.c.q) {
                return new e(this);
            }
            throw new IllegalArgumentException("PeriodicWorkRequests cannot be expedited");
        }
        
        public final f$a d() {
            return this;
        }
    }
}
