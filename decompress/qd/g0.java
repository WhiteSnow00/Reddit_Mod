// 
// Decompiled by Procyon v0.6.0
// 

package qd;

import dg.l0;
import mg.d0;
import java.util.concurrent.TimeUnit;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import we.h;
import od.a;
import od.a$a;

public final class g0 implements a$a
{
    public final a a;
    public final h b;
    public final m$a c;
    
    public g0(final BasePendingResult a, final h b, final h0 c) {
        this.a = a;
        this.b = b;
        this.c = (m$a)c;
    }
    
    public final void a(final Status status) {
        if (status.g()) {
            final a a = this.a;
            final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
            final BasePendingResult basePendingResult = (BasePendingResult)a;
            d0.D(basePendingResult.h ^ true, "Result has already been consumed.");
            try {
                if (!basePendingResult.c.await(0L, milliseconds)) {
                    basePendingResult.e(Status.n);
                }
            }
            catch (final InterruptedException ex) {
                basePendingResult.e(Status.l);
            }
            d0.D(basePendingResult.f(), "Result is not ready.");
            this.b.b(this.c.a(basePendingResult.h()));
            return;
        }
        this.b.a((Exception)l0.g0(status));
    }
}
