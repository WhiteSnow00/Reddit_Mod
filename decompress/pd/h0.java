// 
// Decompiled by Procyon v0.6.0
// 

package pd;

import android.os.BaseBundle;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import com.android.billingclient.api.w;
import com.google.android.gms.common.api.a$b;
import java.util.Collections;
import android.app.PendingIntent;
import android.os.Looper;
import java.util.Iterator;
import com.google.android.gms.common.api.c;
import mg.d0;
import com.google.android.gms.common.api.a$e;
import java.util.HashMap;
import java.util.concurrent.Future;
import java.util.ArrayList;
import com.google.android.gms.common.api.a;
import java.util.Map;
import qd.d;
import qd.i;
import java.util.HashSet;
import android.os.Bundle;
import nd.b;
import nd.f;
import android.content.Context;
import java.util.concurrent.locks.Lock;

public final class h0 implements m0
{
    public final p0 a;
    public final Lock b;
    public final Context c;
    public final f d;
    public b e;
    public int f;
    public int g;
    public int h;
    public final Bundle i;
    public final HashSet j;
    public te.f k;
    public boolean l;
    public boolean m;
    public boolean n;
    public i o;
    public boolean p;
    public boolean q;
    public final d r;
    public final Map<a<?>, Boolean> s;
    public final a.a<? extends te.f, te.a> t;
    public final ArrayList<Future<?>> u;
    
    public h0(final p0 a, final d r, final Map<a<?>, Boolean> s, final f d, final a.a<? extends te.f, te.a> t, final Lock b, final Context c) {
        this.g = 0;
        this.i = new Bundle();
        this.j = new HashSet();
        this.u = new ArrayList<Future<?>>();
        this.a = a;
        this.r = r;
        this.s = s;
        this.d = d;
        this.t = t;
        this.b = b;
        this.c = c;
    }
    
    public final void a() {
        this.a.g.clear();
        this.m = false;
        this.e = null;
        this.g = 0;
        this.l = true;
        this.n = false;
        this.p = false;
        final HashMap hashMap = new HashMap();
        for (final a a : this.s.keySet()) {
            final a$e a$e = this.a.f.get(a.b);
            d0.y((Object)a$e);
            a.a.getClass();
            final boolean booleanValue = this.s.get(a);
            if (a$e.f()) {
                this.m = true;
                if (booleanValue) {
                    this.j.add(a.b);
                }
                else {
                    this.l = false;
                }
            }
            hashMap.put(a$e, new y(this, (a<?>)a, booleanValue));
        }
        if (this.m) {
            d0.y((Object)this.r);
            d0.y((Object)this.t);
            this.r.i = System.identityHashCode(this.a.m);
            final f0 f0 = new f0(this);
            final a.a<? extends te.f, te.a> t = this.t;
            final Context c = this.c;
            final Looper l = this.a.m.l;
            final d r = this.r;
            this.k = (te.f)t.b(c, l, r, r.h, (c.b)f0, (c.c)f0);
        }
        this.h = this.a.f.size();
        this.u.add(q0.a.submit((Runnable)new b0(this, hashMap)));
    }
    
    public final void b() {
    }
    
    public final void c(final int n) {
        this.k(new b(8, (PendingIntent)null));
    }
    
    public final boolean d() {
        final ArrayList<Future<?>> u = this.u;
        for (int size = u.size(), i = 0; i < size; ++i) {
            ((Future)u.get(i)).cancel(true);
        }
        this.u.clear();
        this.i(true);
        this.a.h();
        return true;
    }
    
    public final <A, T extends com.google.android.gms.common.api.internal.a<? extends od.c, A>> T e(final T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
    
    public final void f(final Bundle bundle) {
        if (!this.n(1)) {
            return;
        }
        if (bundle != null) {
            this.i.putAll(bundle);
        }
        if (this.o()) {
            this.j();
        }
    }
    
    public final void g(final b b, final a<?> a, final boolean b2) {
        if (!this.n(1)) {
            return;
        }
        this.l(b, a, b2);
        if (this.o()) {
            this.j();
        }
    }
    
    public final void h() {
        this.m = false;
        this.a.m.u = Collections.emptySet();
        for (final a$b a$b : this.j) {
            if (!this.a.g.containsKey(a$b)) {
                this.a.g.put(a$b, new b(17, (PendingIntent)null));
            }
        }
    }
    
    public final void i(final boolean b) {
        final te.f k = this.k;
        if (k != null) {
            if (((a$e)k).b() && b) {
                k.j();
            }
            ((a$e)k).a();
            d0.y((Object)this.r);
            this.o = null;
        }
    }
    
    public final void j() {
        Object o = this.a;
        ((p0)o).a.lock();
        try {
            ((p0)o).m.j();
            (((p0)o).k = (m0)new x((p0)o)).a();
            ((p0)o).b.signalAll();
            ((p0)o).a.unlock();
            q0.a.execute((Runnable)new w((Object)this, 2));
            final te.f k = this.k;
            if (k != null) {
                if (this.p) {
                    o = this.o;
                    d0.y(o);
                    k.o((i)o, this.q);
                }
                this.i(false);
            }
            o = this.a.g.keySet().iterator();
            while (((Iterator)o).hasNext()) {
                final a$e a$e = this.a.f.get(((Iterator<a$b>)o).next());
                d0.y((Object)a$e);
                a$e.a();
            }
            if (((BaseBundle)this.i).isEmpty()) {
                o = null;
            }
            else {
                o = this.i;
            }
            this.a.n.n((Bundle)o);
        }
        finally {
            ((p0)o).a.unlock();
        }
    }
    
    public final void k(final b b) {
        final ArrayList<Future<?>> u = this.u;
        for (int size = u.size(), i = 0; i < size; ++i) {
            ((Future)u.get(i)).cancel(true);
        }
        this.u.clear();
        this.i(b.g() ^ true);
        this.a.h();
        this.a.n.h(b);
    }
    
    public final void l(final b e, final a<?> a, final boolean b) {
        a.a.getClass();
        Label_0067: {
            if (b) {
                if (!e.g()) {
                    if (this.d.a(null, e.g, null) == null) {
                        break Label_0067;
                    }
                }
            }
            if (this.e == null || Integer.MAX_VALUE < this.f) {
                this.e = e;
                this.f = Integer.MAX_VALUE;
            }
        }
        this.a.g.put(a.b, e);
    }
    
    public final void m() {
        if (this.h != 0) {
            return;
        }
        if (!this.m || this.n) {
            final ArrayList list = new ArrayList();
            this.g = 1;
            this.h = this.a.f.size();
            for (final a$b a$b : this.a.f.keySet()) {
                if (this.a.g.containsKey(a$b)) {
                    if (!this.o()) {
                        continue;
                    }
                    this.j();
                }
                else {
                    list.add(this.a.f.get(a$b));
                }
            }
            if (!list.isEmpty()) {
                this.u.add(q0.a.submit((Runnable)new c0(list)));
            }
        }
    }
    
    public final boolean n(int length) {
        if (this.g != length) {
            final l0 m = this.a.m;
            m.getClass();
            final StringWriter stringWriter = new StringWriter();
            m.e("", null, new PrintWriter(stringWriter), null);
            Log.w("GACConnecting", stringWriter.toString());
            Log.w("GACConnecting", "Unexpected callback in ".concat(this.toString()));
            ph0.a.h(33, "mRemainingConnections=", this.h, "GACConnecting");
            final int g = this.g;
            String s = "STEP_GETTING_REMOTE_SERVICE";
            String s2;
            if (g != 0) {
                s2 = "STEP_GETTING_REMOTE_SERVICE";
            }
            else {
                s2 = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            }
            if (length == 0) {
                s = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            }
            length = s2.length();
            final StringBuilder sb = new StringBuilder(s.length() + (length + 70));
            sb.append("GoogleApiClient connecting is in step ");
            sb.append(s2);
            sb.append(" but received callback for step ");
            sb.append(s);
            Log.e("GACConnecting", sb.toString(), (Throwable)new Exception());
            this.k(new b(8, (PendingIntent)null));
            return false;
        }
        return true;
    }
    
    public final boolean o() {
        final int h = this.h - 1;
        this.h = h;
        if (h > 0) {
            return false;
        }
        if (h < 0) {
            final l0 m = this.a.m;
            m.getClass();
            final StringWriter stringWriter = new StringWriter();
            m.e("", null, new PrintWriter(stringWriter), null);
            Log.w("GACConnecting", stringWriter.toString());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", (Throwable)new Exception());
            this.k(new b(8, (PendingIntent)null));
            return false;
        }
        final b e = this.e;
        if (e != null) {
            this.a.l = this.f;
            this.k(e);
            return false;
        }
        return true;
    }
}
