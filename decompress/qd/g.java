// 
// Decompiled by Procyon v0.6.0
// 

package qd;

import java.util.Collections;
import java.util.Iterator;
import nd.f;
import mg.d0;
import nd.e;
import pd.l;
import android.os.Looper;
import android.content.Context;
import android.accounts.Account;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import com.google.android.gms.common.api.a$e;
import android.os.IInterface;

public abstract class g<T extends IInterface> extends b<T> implements a$e, c0
{
    public final d I;
    public final Set<Scope> J;
    public final Account K;
    
    public g(final Context context, final Looper looper, final int n, final d i, final pd.d d, final l l) {
        final h1 a = h.a(context);
        final e d2 = e.d;
        d0.y((Object)d);
        d0.y((Object)l);
        super(context, looper, a, (f)d2, n, (b$a)new a0(d), (b$b)new b0(l), i.g);
        this.I = i;
        this.K = i.a;
        final Set c = i.c;
        final Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            if (c.contains(iterator.next())) {
                continue;
            }
            throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
        }
        this.J = c;
    }
    
    public final Set<Scope> B() {
        return this.J;
    }
    
    public final Set<Scope> h() {
        Object o;
        if (this.f()) {
            o = this.J;
        }
        else {
            o = Collections.emptySet();
        }
        return (Set<Scope>)o;
    }
    
    public final Account x() {
        return this.K;
    }
    
    public final void z() {
    }
}
