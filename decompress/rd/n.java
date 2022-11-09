// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import pd.c;
import pd.a;
import xe.h;
import xe.x;
import com.google.android.gms.common.api.internal.BasePendingResult;
import o8.l;

public final class n
{
    static {
        new l(4);
    }
    
    public static x a(final BasePendingResult basePendingResult) {
        final h0 h0 = new h0();
        final h h2 = new h();
        basePendingResult.b(new g0(basePendingResult, h2, h0));
        return h2.a;
    }
    
    public interface a<R extends c, T>
    {
        T a(final R p0);
    }
}
