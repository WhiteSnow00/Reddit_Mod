// 
// Decompiled by Procyon v0.6.0
// 

package qd;

import android.os.Handler;
import com.google.android.gms.common.api.internal.BasePendingResult;
import fe.f;
import pd.c;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.a$c;

public final class a1<O extends a$c> extends v
{
    public final b<O> g;
    
    public a1(final b<O> g) {
        this.g = g;
    }
    
    public final <A, T extends a<? extends c, A>> T c(final T t) {
        final b<O> g = this.g;
        g.getClass();
        ((BasePendingResult)t).j();
        final e j = g.j;
        j.getClass();
        final q1 q1 = new q1(t);
        final f s = j.s;
        ((Handler)s).sendMessage(((Handler)s).obtainMessage(4, (Object)new i1((t1)q1, j.n.get(), (b)g)));
        return t;
    }
}
