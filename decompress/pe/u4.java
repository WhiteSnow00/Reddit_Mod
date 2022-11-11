// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import java.util.concurrent.FutureTask;
import md.g;
import md.h;
import ud.i;
import android.os.Binder;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import android.os.Bundle;
import qd.a;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Callable;
import java.util.List;
import com.android.billingclient.api.m0;
import lw0.b;

public final class u4 extends t2
{
    public final g7 a;
    public Boolean b;
    public String c;
    
    public u4(final g7 a) {
        lw0.b.R((Object)a);
        this.a = a;
        this.c = null;
    }
    
    public final void E0(final q7 q7) {
        this.X(q7);
        this.N(new o4(this, q7, 1));
    }
    
    public final void F(final q7 q7) {
        lw0.b.O(q7.f);
        this.z1(q7.f, false);
        this.N((Runnable)new m0((Object)this, (Object)q7, 2));
    }
    
    public final List G0(String s, final String s2, final q7 q7) {
        this.X(q7);
        final String f = q7.f;
        lw0.b.R((Object)f);
        s = (ExecutionException)this.a.b().S(new m4(this, f, (String)s, s2));
        try {
            s = (ExecutionException)((FutureTask<List<?>>)s).get();
            return (List)s;
        }
        catch (final ExecutionException s) {}
        catch (final InterruptedException ex) {}
        this.a.h().k.b((Object)s, "Failed to get conditional user properties");
        return Collections.emptyList();
    }
    
    public final void J(final q7 q7) {
        this.X(q7);
        this.N(new j4(1, this, q7));
    }
    
    public final void N(final Runnable runnable) {
        if (this.a.b().W()) {
            runnable.run();
            return;
        }
        this.a.b().U(runnable);
    }
    
    public final void R0(c c, final q7 q7) {
        lw0.b.R((Object)c);
        lw0.b.R((Object)c.h);
        this.X(q7);
        c = new c(c);
        c.f = q7.f;
        this.N(new i4(this, c, q7, 0));
    }
    
    public final void T0(final long n, final String s, final String s2, final String s3) {
        this.N(new t4(this, s2, s3, s, n));
    }
    
    public final void V(final Bundle bundle, final q7 q7) {
        this.X(q7);
        final String f = q7.f;
        lw0.b.R((Object)f);
        this.N(new s3(this, f, bundle));
    }
    
    public final void X(final q7 q7) {
        lw0.b.R((Object)q7);
        lw0.b.O(q7.f);
        this.z1(q7.f, false);
        this.a.P().m0(q7.g, q7.v);
    }
    
    public final void a1(final t t, final q7 q7) {
        lw0.b.R((Object)t);
        this.X(q7);
        this.N(new p4(this, 0, t, q7));
    }
    
    public final List g0(String s, final String s2, final String s3) {
        this.z1((String)s, true);
        s = (ExecutionException)this.a.b().S(new n4(this, (String)s, s2, s3));
        try {
            s = (ExecutionException)((FutureTask<List<?>>)s).get();
            return (List)s;
        }
        catch (final ExecutionException s) {}
        catch (final InterruptedException ex) {}
        this.a.h().k.b((Object)s, "Failed to get conditional user properties as");
        return Collections.emptyList();
    }
    
    public final void j1(final j7 j7, final q7 q7) {
        lw0.b.R((Object)j7);
        this.X(q7);
        this.N(new i4(this, j7, q7, 1));
    }
    
    public final String k0(q7 q7) {
        this.X(q7);
        final g7 a = this.a;
        Object s = a.b().S((Callable)new d7(a, q7));
        try {
            s = (q7 = (q7)((FutureTask<String>)s).get(30000L, TimeUnit.MILLISECONDS));
            return (String)q7;
        }
        catch (final ExecutionException s) {}
        catch (final InterruptedException s) {}
        catch (final TimeoutException ex) {}
        a.h().k.c((Object)d3.V(q7.f), "Failed to get app instance id. appId", s);
        q7 = null;
        return (String)q7;
    }
    
    public final List k1(final String s, String s2, final String s3, final boolean b) {
        this.z1(s, true);
        s2 = (ExecutionException)this.a.b().S(new l4(this, s, (String)s2, s3));
        try {
            final List list = ((FutureTask<List>)s2).get();
            s2 = (ExecutionException)new ArrayList(list.size());
            for (final l7 l7 : list) {
                if (b || !n7.y0(l7.c)) {
                    ((ArrayList<j7>)s2).add(new j7(l7));
                }
            }
            return (List)s2;
        }
        catch (final ExecutionException s2) {}
        catch (final InterruptedException ex) {}
        this.a.h().k.c((Object)d3.V(s), "Failed to get user properties as. appId", (Object)s2);
        return Collections.emptyList();
    }
    
    public final List n0(String s, final String s2, final boolean b, final q7 q7) {
        this.X(q7);
        final String f = q7.f;
        b.R((Object)f);
        s = (ExecutionException)this.a.b().S(new k4(this, f, (String)s, s2));
        try {
            final List list = ((FutureTask<List>)s).get();
            s = (ExecutionException)new ArrayList(list.size());
            for (final l7 l7 : list) {
                if (b || !n7.y0(l7.c)) {
                    ((ArrayList<j7>)s).add(new j7(l7));
                }
            }
            return (List)s;
        }
        catch (final ExecutionException s) {}
        catch (final InterruptedException ex) {}
        this.a.h().k.c((Object)d3.V(q7.f), "Failed to query user properties. appId", (Object)s);
        return Collections.emptyList();
    }
    
    public final void o(final t t, final q7 q7) {
        this.a.a();
        this.a.e(t, q7);
    }
    
    public final void w(final q7 q7) {
        lw0.b.O(q7.f);
        lw0.b.R((Object)q7.A);
        final o4 o4 = new o4(this, q7, 0);
        if (this.a.b().W()) {
            o4.run();
            return;
        }
        this.a.b().V(o4);
    }
    
    public final byte[] w0(final t t, final String s) {
        lw0.b.O(s);
        lw0.b.R((Object)t);
        this.z1(s, true);
        this.a.h().r.b((Object)this.a.q.r.d(t.f), "Log and bundle. event");
        ((mf1.a)this.a.i()).getClass();
        final long n = System.nanoTime() / 1000000L;
        Object b = this.a.b();
        final r4 r4 = new r4(this, t, s);
        ((v4)b).O();
        final e4 e4 = new e4((g4)b, (Callable)r4, true);
        if (Thread.currentThread() == ((g4)b).h) {
            ((FutureTask)e4).run();
        }
        else {
            ((g4)b).X(e4);
        }
        try {
            if ((b = ((FutureTask<byte[]>)e4).get()) == null) {
                this.a.h().k.b((Object)d3.V(s), "Log and bundle returned null. appId");
                b = new byte[0];
            }
            ((mf1.a)this.a.i()).getClass();
            this.a.h().r.d((Object)this.a.q.r.d(t.f), "Log and bundle processed. event, size, time_ms", (Object)((g4)b).length, (Object)(System.nanoTime() / 1000000L - n));
            return (byte[])b;
        }
        catch (final ExecutionException b) {}
        catch (final InterruptedException ex) {}
        this.a.h().k.d((Object)d3.V(s), "Failed to log and bundle. appId, event, error", (Object)this.a.q.r.d(t.f), b);
        return null;
    }
    
    public final void z1(final String c, final boolean b) {
        if (!TextUtils.isEmpty((CharSequence)c)) {
            Label_0100: {
                if (!b) {
                    break Label_0100;
                }
                try {
                    if (this.b == null) {
                        this.b = ("com.google.android.gms".equals(this.c) || i.a(this.a.q.f, Binder.getCallingUid()) || h.a(this.a.q.f).b(Binder.getCallingUid()));
                    }
                    if (!this.b) {
                        if (this.c == null && g.uidHasPackageName(this.a.q.f, Binder.getCallingUid(), c)) {
                            this.c = c;
                        }
                        if (!c.equals(this.c)) {
                            throw new SecurityException(String.format("Unknown calling package name '%s'.", c));
                        }
                    }
                    return;
                }
                catch (final SecurityException ex) {
                    this.a.h().k.b((Object)d3.V(c), "Measurement Service called with invalid calling package. appId");
                    throw ex;
                }
            }
        }
        this.a.h().k.a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }
}
