// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import nd.b;
import android.os.Bundle;
import od.c;
import te.f;
import com.google.android.gms.common.api.a;
import java.util.Map;
import java.util.Iterator;
import java.util.Collections;
import com.google.android.gms.common.api.a$e;

public final class i0 implements m0
{
    public final p0 a;
    
    public i0(final p0 a) {
        this.a = a;
    }
    
    public final void a() {
        final Iterator iterator = this.a.f.values().iterator();
        while (iterator.hasNext()) {
            ((a$e)iterator.next()).a();
        }
        this.a.m.u = Collections.emptySet();
    }
    
    public final void b() {
        final p0 a = this.a;
        a.a.lock();
        try {
            (a.k = (m0)new h0(a, a.h, a.i, a.d, a.j, a.a, a.c)).a();
            a.b.signalAll();
        }
        finally {
            a.a.unlock();
        }
    }
    
    public final void c(final int n) {
    }
    
    public final boolean d() {
        return true;
    }
    
    public final <A, T extends com.google.android.gms.common.api.internal.a<? extends c, A>> T e(final T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
    
    public final void f(final Bundle bundle) {
    }
    
    public final void g(final b b, final a<?> a, final boolean b2) {
    }
}
