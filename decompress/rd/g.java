// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import java.util.Collections;
import java.util.Iterator;
import od.f;
import yd.a;
import od.e;
import qd.l;
import android.os.Looper;
import android.content.Context;
import android.accounts.Account;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import com.google.android.gms.common.api.a$e;
import android.os.IInterface;

public abstract class g<T extends IInterface> extends b<T> implements a$e, c0
{
    public final rd.d I;
    public final Set<Scope> J;
    public final Account K;
    
    public g(final Context context, final Looper looper, final int n, final rd.d i, final qd.d d, final l l) {
        final h1 a = rd.h.a(context);
        final e d2 = e.d;
        yd.a.S0((Object)d);
        yd.a.S0((Object)l);
        super(context, looper, a, (f)d2, n, (a)new a0(d), (b)new b0(l), i.g);
        this.I = i;
        this.K = i.a;
        final Set<Scope> c = i.c;
        final Iterator<Scope> iterator = c.iterator();
        while (iterator.hasNext()) {
            if (c.contains(iterator.next())) {
                continue;
            }
            throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
        }
        this.J = c;
    }
    
    @Override
    public final Set<Scope> B() {
        return this.J;
    }
    
    public final Set<Scope> i() {
        Object o;
        if (this.g()) {
            o = this.J;
        }
        else {
            o = Collections.emptySet();
        }
        return (Set<Scope>)o;
    }
    
    @Override
    public final Account x() {
        return this.K;
    }
    
    @Override
    public final void z() {
    }
}
