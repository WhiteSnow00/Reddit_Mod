// 
// Decompiled by Procyon v0.6.0
// 

package qd;

import com.google.android.gms.common.api.a$e;
import com.android.billingclient.api.m0;
import ve.l;
import android.os.Bundle;
import ue.e;
import ue.f;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import android.os.Handler;
import android.content.Context;
import ue.b;
import com.google.android.gms.common.api.c;
import ve.d;

public final class l1 extends d implements b, c.c
{
    public static final ue.b h;
    public final Context a;
    public final Handler b;
    public final ue.b c;
    public final Set<Scope> d;
    public final rd.d e;
    public f f;
    public k1 g;
    
    static {
        h = e.a;
    }
    
    public l1(final Context a, final fe.f b, final rd.d e) {
        final ue.b h = l1.h;
        this.a = a;
        this.b = (Handler)b;
        this.e = e;
        this.d = e.b;
        this.c = h;
    }
    
    public final void R(final Bundle bundle) {
        this.f.p((ve.f)this);
    }
    
    public final void i0(final l l) {
        this.b.post((Runnable)new m0(this, l, 1));
    }
    
    public final void k(final int n) {
        ((a$e)this.f).a();
    }
    
    public final void m(final od.b b) {
        ((z0)this.g).b(b);
    }
}
