// 
// Decompiled by Procyon v0.6.0
// 

package qd;

import j0.i;
import xe.h;
import com.android.billingclient.api.l0;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import android.util.Log;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Message;
import android.app.PendingIntent;
import java.util.Collection;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import rd.m;
import com.android.billingclient.api.k0;
import android.os.Bundle;
import fe.f;
import android.content.Context;
import com.google.android.gms.common.api.Scope;
import android.accounts.Account;
import android.os.Looper;
import java.util.Set;
import rd.d;
import od.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import com.google.android.gms.common.api.a$e;
import java.util.LinkedList;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.a$c;

public final class w0<O extends a$c> implements b, c.c, c2
{
    public final LinkedList a;
    public final a$e b;
    public final a<O> c;
    public final s d;
    public final HashSet e;
    public final HashMap f;
    public final int g;
    public final l1 h;
    public boolean i;
    public final ArrayList j;
    public od.b k;
    public final /* synthetic */ e l;
    
    public w0(final e l, final com.google.android.gms.common.api.b<O> b) {
        this.l = l;
        this.a = new LinkedList();
        this.e = new HashSet();
        this.f = new HashMap();
        this.j = new ArrayList();
        this.k = null;
        final Looper looper = ((Handler)l.s).getLooper();
        final d.a a = b.a();
        final Account a2 = a.a;
        final j0.d<Scope> b2 = a.b;
        final String c = a.c;
        final String d = a.d;
        final ue.a f = ue.a.f;
        final d d2 = new d(a2, (Set)b2, null, c, d, f);
        final com.google.android.gms.common.api.a.a a3 = b.c.a;
        yd.a.S0((Object)a3);
        final a$e b3 = a3.b(b.a, looper, d2, b.d, this, this);
        final String b4 = b.b;
        if (b4 != null && b3 instanceof rd.b) {
            ((rd.b)b3).C = b4;
        }
        if (b4 != null && b3 instanceof k) {
            ((k)b3).getClass();
        }
        this.b = b3;
        this.c = b.e;
        this.d = new s();
        this.g = b.g;
        if (b3.g()) {
            final Context j = l.j;
            final f s = l.s;
            final d.a a4 = b.a();
            this.h = new l1(j, s, new d(a4.a, (Set)a4.b, null, a4.c, a4.d, f));
            return;
        }
        this.h = null;
    }
    
    public final void J(final od.b b, final com.google.android.gms.common.api.a<?> a, final boolean b2) {
        throw null;
    }
    
    public final void R(final Bundle bundle) {
        if (Looper.myLooper() == ((Handler)this.l.s).getLooper()) {
            this.e();
            return;
        }
        ((Handler)this.l.s).post((Runnable)new k0(this, 1));
    }
    
    public final void a(final od.b b) {
        final Iterator iterator = this.e.iterator();
        if (iterator.hasNext()) {
            final u1 u1 = (u1)iterator.next();
            if (m.a(b, b.j)) {
                this.b.r();
            }
            u1.getClass();
            throw null;
        }
        this.e.clear();
    }
    
    public final void b(final Status status) {
        yd.a.M0(this.l.s);
        this.c(status, null, false);
    }
    
    public final void c(final Status status, final RuntimeException ex, final boolean b) {
        yd.a.M0(this.l.s);
        int n = false ? 1 : 0;
        final boolean b2 = status == null;
        if (ex == null) {
            n = (true ? 1 : 0);
        }
        if ((b2 ? 1 : 0) != n) {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                final t1 t1 = (t1)iterator.next();
                if (!b || t1.a == 2) {
                    if (status != null) {
                        t1.a(status);
                    }
                    else {
                        t1.b(ex);
                    }
                    iterator.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }
    
    public final void d() {
        final ArrayList list = new ArrayList(this.a);
        for (int size = list.size(), i = 0; i < size; ++i) {
            final t1 t1 = list.get(i);
            if (!this.b.b()) {
                break;
            }
            if (this.i(t1)) {
                this.a.remove(t1);
            }
        }
    }
    
    public final void e() {
        yd.a.M0(this.l.s);
        this.k = null;
        this.a(od.b.j);
        this.h();
        final Iterator iterator = this.f.values().iterator();
        if (!iterator.hasNext()) {
            this.d();
            this.g();
            return;
        }
        ((j1)iterator.next()).getClass();
        throw null;
    }
    
    public final void f(final int n) {
        yd.a.M0(this.l.s);
        this.k = null;
        this.i = true;
        final s d = this.d;
        final String u = this.b.u();
        d.getClass();
        final StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (n == 1) {
            sb.append(" due to service disconnection.");
        }
        else if (n == 3) {
            sb.append(" due to dead object exception.");
        }
        if (u != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(u);
        }
        d.a(true, new Status(20, (PendingIntent)null, sb.toString()));
        final f s = this.l.s;
        final Message obtain = Message.obtain((Handler)s, 9, (Object)this.c);
        this.l.getClass();
        ((Handler)s).sendMessageDelayed(obtain, 5000L);
        final f s2 = this.l.s;
        final Message obtain2 = Message.obtain((Handler)s2, 11, (Object)this.c);
        this.l.getClass();
        ((Handler)s2).sendMessageDelayed(obtain2, 120000L);
        this.l.l.a.clear();
        final Iterator iterator = this.f.values().iterator();
        if (!iterator.hasNext()) {
            return;
        }
        ((j1)iterator.next()).getClass();
        throw null;
    }
    
    public final void g() {
        ((Handler)this.l.s).removeMessages(12, (Object)this.c);
        final f s = this.l.s;
        ((Handler)s).sendMessageDelayed(((Handler)s).obtainMessage(12, (Object)this.c), this.l.f);
    }
    
    public final void h() {
        if (this.i) {
            ((Handler)this.l.s).removeMessages(11, (Object)this.c);
            ((Handler)this.l.s).removeMessages(9, (Object)this.c);
            this.i = false;
        }
    }
    
    public final boolean i(final t1 t1) {
        if (!(t1 instanceof d1)) {
            t1.d(this.d, this.b.g());
            try {
                t1.c(this);
            }
            catch (final DeadObjectException ex) {
                this.k(1);
                this.b.e("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        final d1 d1 = (d1)t1;
        final od.d[] g = d1.g(this);
        od.d d4 = null;
        Label_0234: {
            if (g != null) {
                if (g.length != 0) {
                    od.d[] t2;
                    if ((t2 = this.b.t()) == null) {
                        t2 = new od.d[0];
                    }
                    final int length = t2.length;
                    final j0.b b = new j0.b(length);
                    for (final od.d d2 : t2) {
                        ((i)b).put((Object)d2.f, (Object)d2.f());
                    }
                    for (final od.d d3 : g) {
                        final Long n = (Long)((i)b).getOrDefault((Object)d3.f, (Object)null);
                        d4 = d3;
                        if (n == null) {
                            break Label_0234;
                        }
                        if (n < d3.f()) {
                            d4 = d3;
                            break Label_0234;
                        }
                    }
                }
            }
            d4 = null;
        }
        if (d4 == null) {
            t1.d(this.d, this.b.g());
            try {
                t1.c(this);
            }
            catch (final DeadObjectException ex2) {
                this.k(1);
                this.b.e("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        final String name = this.b.getClass().getName();
        final String f = d4.f;
        final long f2 = d4.f();
        final StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(f).length());
        d.B(sb, name, " could not execute call because it requires feature (", f, ", ");
        sb.append(f2);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (this.l.t && d1.f(this)) {
            final x0 x0 = new x0((a)this.c, d4);
            final int index = this.j.indexOf(x0);
            if (index >= 0) {
                final x0 x2 = this.j.get(index);
                ((Handler)this.l.s).removeMessages(15, (Object)x2);
                final f s = this.l.s;
                final Message obtain = Message.obtain((Handler)s, 15, (Object)x2);
                this.l.getClass();
                ((Handler)s).sendMessageDelayed(obtain, 5000L);
            }
            else {
                this.j.add(x0);
                final f s2 = this.l.s;
                final Message obtain2 = Message.obtain((Handler)s2, 15, (Object)x0);
                this.l.getClass();
                ((Handler)s2).sendMessageDelayed(obtain2, 5000L);
                final f s3 = this.l.s;
                final Message obtain3 = Message.obtain((Handler)s3, 16, (Object)x0);
                this.l.getClass();
                ((Handler)s3).sendMessageDelayed(obtain3, 120000L);
                final od.b b2 = new od.b(2, null);
                if (!this.j(b2)) {
                    this.l.c(b2, this.g);
                }
            }
            return false;
        }
        d1.b((RuntimeException)new UnsupportedApiCallException(d4));
        return true;
    }
    
    public final boolean j(final od.b b) {
        synchronized (qd.e.w) {
            final e l = this.l;
            if (l.p != null && l.q.contains((Object)this.c)) {
                ((y1)this.l.p).m(b, this.g);
                return true;
            }
            return false;
        }
    }
    
    public final void k(final int n) {
        if (Looper.myLooper() == ((Handler)this.l.s).getLooper()) {
            this.f(n);
            return;
        }
        ((Handler)this.l.s).post((Runnable)new t0(this, n));
    }
    
    public final boolean l(final boolean b) {
        yd.a.M0(this.l.s);
        if (!this.b.b() || this.f.size() != 0) {
            return false;
        }
        final s d = this.d;
        if (!d.a.isEmpty() || !d.b.isEmpty()) {
            if (b) {
                this.g();
            }
            return false;
        }
        this.b.e("Timing out service connection.");
        return true;
    }
    
    public final void m(final od.b b) {
        this.p(b, null);
    }
    
    public final void n() {
        yd.a.M0(this.l.s);
        if (!this.b.b()) {
            if (!this.b.f()) {
                try {
                    final e l = this.l;
                    final int a = l.l.a(l.j, this.b);
                    if (a != 0) {
                        final od.b b = new od.b(a, null);
                        final String name = this.b.getClass().getName();
                        final String string = b.toString();
                        final StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                        sb.append("The service for ");
                        sb.append(name);
                        sb.append(" is not available: ");
                        sb.append(string);
                        Log.w("GoogleApiManager", sb.toString());
                        this.p(b, null);
                        return;
                    }
                    final e i = this.l;
                    final a$e b2 = this.b;
                    final z0 g = new z0(b2, this.c);
                    if (b2.g()) {
                        final l1 h = this.h;
                        yd.a.S0((Object)h);
                        final ue.f f = h.f;
                        if (f != null) {
                            ((a$e)f).a();
                        }
                        h.e.i = System.identityHashCode(h);
                        final ue.b c = h.c;
                        final Context a2 = h.a;
                        final Looper looper = h.b.getLooper();
                        final d e = h.e;
                        h.f = (ue.f)c.b(a2, looper, e, (Object)e.h, (b)h, (c.c)h);
                        h.g = (k1)g;
                        final Set<Scope> d = h.d;
                        if (d != null && !d.isEmpty()) {
                            h.f.h();
                        }
                        else {
                            h.b.post((Runnable)new l0(h, 4));
                        }
                    }
                    try {
                        this.b.n((rd.b.c)g);
                    }
                    catch (final SecurityException ex) {
                        this.p(new od.b(10), ex);
                    }
                }
                catch (final IllegalStateException ex2) {
                    this.p(new od.b(10), ex2);
                }
            }
        }
    }
    
    public final void o(final t1 t1) {
        yd.a.M0(this.l.s);
        if (this.b.b()) {
            if (this.i(t1)) {
                this.g();
                return;
            }
            this.a.add(t1);
        }
        else {
            this.a.add(t1);
            final od.b k = this.k;
            if (k != null && k.f()) {
                this.p(this.k, null);
                return;
            }
            this.n();
        }
    }
    
    public final void p(final od.b k, final RuntimeException ex) {
        yd.a.M0(this.l.s);
        final l1 h = this.h;
        if (h != null) {
            final ue.f f = h.f;
            if (f != null) {
                ((a$e)f).a();
            }
        }
        yd.a.M0(this.l.s);
        this.k = null;
        this.l.l.a.clear();
        this.a(k);
        if (this.b instanceof td.d && k.g != 24) {
            final e l = this.l;
            l.g = true;
            final f s = l.s;
            ((Handler)s).sendMessageDelayed(((Handler)s).obtainMessage(19), 300000L);
        }
        if (k.g == 4) {
            this.b(qd.e.v);
            return;
        }
        if (this.a.isEmpty()) {
            this.k = k;
            return;
        }
        if (ex != null) {
            yd.a.M0(this.l.s);
            this.c(null, ex, false);
            return;
        }
        if (!this.l.t) {
            this.b(qd.e.d((a)this.c, k));
            return;
        }
        this.c(qd.e.d((a)this.c, k), null, true);
        if (this.a.isEmpty()) {
            return;
        }
        if (this.j(k)) {
            return;
        }
        if (!this.l.c(k, this.g)) {
            if (k.g == 18) {
                this.i = true;
            }
            if (this.i) {
                final f s2 = this.l.s;
                final Message obtain = Message.obtain((Handler)s2, 9, (Object)this.c);
                this.l.getClass();
                ((Handler)s2).sendMessageDelayed(obtain, 5000L);
                return;
            }
            this.b(qd.e.d((a)this.c, k));
        }
    }
    
    public final void q() {
        yd.a.M0(this.l.s);
        final Status u = qd.e.u;
        this.b(u);
        final s d = this.d;
        d.getClass();
        int i = 0;
        d.a(false, u);
        for (i$a[] array = (i$a[])this.f.keySet().toArray(new i$a[0]); i < array.length; ++i) {
            this.o((t1)new s1((i$a<?>)array[i], new h<Boolean>()));
        }
        this.a(new od.b(4));
        if (this.b.b()) {
            this.b.c(new v0(this));
        }
    }
}
