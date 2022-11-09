// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import pd.c;
import java.util.concurrent.TimeUnit;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import xe.h;
import pd.a;

public final class g0 implements a
{
    public final /* synthetic */ pd.a a;
    public final /* synthetic */ h b;
    public final /* synthetic */ n.a c;
    
    public g0(final BasePendingResult a, final h b, final h0 c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(Status status) {
        if (status.f()) {
            final pd.a a = this.a;
            final TimeUnit milliseconds = TimeUnit.MILLISECONDS;
            status = (Status)(BasePendingResult<?>)a;
            yd.a.W0(((BasePendingResult)status).h ^ true, "Result has already been consumed.");
            try {
                if (!((BasePendingResult)status).c.await(0L, milliseconds)) {
                    ((BasePendingResult)status).e(Status.n);
                }
            }
            catch (final InterruptedException ex) {
                ((BasePendingResult)status).e(Status.l);
            }
            yd.a.W0(((BasePendingResult)status).f(), "Result is not ready.");
            this.b.b(this.c.a(((BasePendingResult<c>)status).h()));
            return;
        }
        this.b.a((Exception)yl.a.h0(status));
    }
}
