// 
// Decompiled by Procyon v0.6.0
// 

package qd;

import android.os.Handler;
import android.os.Bundle;
import od.g;
import android.content.BroadcastReceiver;
import com.google.android.gms.common.api.Status;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collection;
import java.util.Iterator;
import android.util.Log;
import java.util.HashSet;
import ue.b;
import java.util.concurrent.locks.ReentrantLock;
import java.util.ArrayList;
import ue.f;
import com.google.android.gms.common.api.a;
import rd.d;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import com.google.android.gms.common.api.a$e;
import com.google.android.gms.common.api.a$b;
import java.util.Map;
import od.e;
import java.util.LinkedList;
import android.os.Looper;
import android.content.Context;
import rd.d0;
import java.util.concurrent.locks.Lock;
import com.google.android.gms.common.api.c;

public final class l0 extends c implements c1
{
    public Integer A;
    public final p1 B;
    public final Lock g;
    public final d0 h;
    public e1 i;
    public final int j;
    public final Context k;
    public final Looper l;
    public final LinkedList m;
    public volatile boolean n;
    public long o;
    public long p;
    public final j0 q;
    public final e r;
    public b1 s;
    public final Map<a$b<?>, a$e> t;
    public Set<Scope> u;
    public final d v;
    public final Map<a<?>, Boolean> w;
    public final a.a<? extends f, ue.a> x;
    public final j y;
    public final ArrayList<b2> z;
    
    public l0(final Context k, ReentrantLock g, final Looper l, final d v, final e r, final b x, final j0.b w, final ArrayList list, final ArrayList list2, final j0.b t, int length, final int n, final ArrayList z) {
        this.i = null;
        this.m = new LinkedList();
        this.o = 120000L;
        this.p = 5000L;
        this.u = new HashSet<Scope>();
        this.y = new j();
        this.A = null;
        final c1.c c = new c1.c(this);
        this.k = k;
        this.g = g;
        this.h = new d0(l, c);
        this.l = l;
        this.q = new j0(this, l);
        this.r = r;
        this.j = length;
        if (length >= 0) {
            this.A = n;
        }
        this.w = (Map<a<?>, Boolean>)w;
        this.t = (Map<a$b<?>, a$e>)t;
        this.z = z;
        this.B = new p1();
        for (c.b b : list) {
            final d0 h = this.h;
            h.getClass();
            yd.a.S0((Object)b);
            g = (ReentrantLock)h.n;
            synchronized (g) {
                if (h.g.contains(b)) {
                    final String value = String.valueOf(b);
                    length = value.length();
                    final StringBuilder sb = new StringBuilder(length + 62);
                    sb.append("registerConnectionCallbacks(): listener ");
                    sb.append(value);
                    sb.append(" is already registered");
                    Log.w("GmsClientEvents", sb.toString());
                }
                else {
                    h.g.add(b);
                }
                monitorexit(g);
                if (h.f.b()) {
                    g = (ReentrantLock)h.m;
                    ((Handler)g).sendMessage(((Handler)g).obtainMessage(1, (Object)b));
                    continue;
                }
                continue;
            }
            break;
        }
        final Iterator iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            this.h.a((c.c)iterator2.next());
        }
        this.v = v;
        this.x = (a.a<? extends f, ue.a>)x;
    }
    
    public static int h(final Collection collection, final boolean b) {
        final Iterator iterator = collection.iterator();
        boolean b2 = false;
        boolean b3 = false;
        while (iterator.hasNext()) {
            final a$e a$e = (a$e)iterator.next();
            b2 |= a$e.g();
            b3 |= a$e.d();
        }
        if (!b2) {
            return 3;
        }
        if (b3 && b) {
            return 2;
        }
        return 1;
    }
    
    public final boolean a(final n n) {
        final e1 i = this.i;
        return i != null && i.f(n);
    }
    
    public final void b() {
        final e1 i = this.i;
        if (i != null) {
            i.c();
        }
    }
    
    public final void c() {
        this.g.lock();
        try {
            final int j = this.j;
            final int n = 2;
            final boolean b = false;
            if (j >= 0) {
                yd.a.W0(this.A != null, "Sign-in mode should have been set explicitly by auto-manage.");
            }
            else {
                final Integer a = this.A;
                if (a == null) {
                    this.A = h(this.t.values(), false);
                }
                else if (a == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            final Integer a2 = this.A;
            yd.a.S0((Object)a2);
            final int intValue = a2;
            this.g.lock();
            Label_0154: {
                int n2;
                if (intValue != 3 && intValue != 1) {
                    n2 = intValue;
                    final boolean b2 = b;
                    if (intValue != 2) {
                        break Label_0154;
                    }
                    n2 = n;
                }
                else {
                    n2 = intValue;
                }
                final boolean b2 = true;
                try {
                    final StringBuilder sb = new StringBuilder(33);
                    sb.append("Illegal sign-in mode: ");
                    sb.append(n2);
                    yd.a.L0(b2, sb.toString());
                    this.l(n2);
                    this.n();
                    return;
                }
                finally {
                    this.g.unlock();
                }
            }
            throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
        }
        finally {
            this.g.unlock();
        }
    }
    
    public final void d() {
        this.g.lock();
        try {
            final p1 b = this.B;
            final BasePendingResult[] array = b.a.toArray(new BasePendingResult[0]);
            final int length = array.length;
            int i = 0;
            while (i < length) {
                final BasePendingResult basePendingResult = array[i];
                basePendingResult.e.set(null);
                synchronized (basePendingResult.a) {
                    if (basePendingResult.b.get() == null || !basePendingResult.k) {
                        basePendingResult.c();
                    }
                    synchronized (basePendingResult.a) {
                        final boolean j = basePendingResult.i;
                        monitorexit(basePendingResult.a);
                        monitorexit(basePendingResult.a);
                        if (j) {
                            b.a.remove(basePendingResult);
                        }
                        ++i;
                    }
                }
                break;
            }
            final e1 k = this.i;
            if (k != null) {
                k.d();
            }
            final j y = this.y;
            final Iterator iterator = y.a.iterator();
            while (iterator.hasNext()) {
                ((i)iterator.next()).getClass();
            }
            y.a.clear();
            for (final com.google.android.gms.common.api.internal.a a : this.m) {
                ((BasePendingResult)a).e.set(null);
                ((BasePendingResult)a).c();
            }
            this.m.clear();
            Lock lock;
            if (this.i == null) {
                lock = this.g;
            }
            else {
                this.i();
                final d0 h = this.h;
                h.j = false;
                h.k.incrementAndGet();
                lock = this.g;
            }
            lock.unlock();
        }
        finally {
            this.g.unlock();
        }
    }
    
    public final void e(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        printWriter.append(s).append("mContext=").println(this.k);
        printWriter.append(s).append("mResuming=").print(this.n);
        printWriter.append(" mWorkQueue.size()=").print(this.m.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.B.a.size());
        final e1 i = this.i;
        if (i != null) {
            i.e(s, fileDescriptor, printWriter, array);
        }
    }
    
    public final <A, T extends com.google.android.gms.common.api.internal.a<? extends pd.c, A>> T f(T a) {
        final a n = a.n;
        final boolean containsKey = this.t.containsKey(a.m);
        String c;
        if (n != null) {
            c = n.c;
        }
        else {
            c = "the API";
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(c);
        sb.append(" required for this call.");
        yd.a.L0(containsKey, sb.toString());
        this.g.lock();
        try {
            final e1 i = this.i;
            if (i != null) {
                Lock lock;
                if (this.n) {
                    this.m.add(a);
                    while (!this.m.isEmpty()) {
                        final com.google.android.gms.common.api.internal.a a2 = this.m.remove();
                        final p1 b = this.B;
                        b.a.add(a2);
                        ((BasePendingResult)a2).e.set(b.b);
                        a2.m(Status.m);
                    }
                    lock = this.g;
                }
                else {
                    a = (T)i.a((com.google.android.gms.common.api.internal.a)a);
                    lock = this.g;
                }
                lock.unlock();
                return a;
            }
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        }
        finally {
            this.g.unlock();
        }
    }
    
    public final a$e g(final a.f f) {
        final a$e a$e = this.t.get(f);
        yd.a.T0((Object)a$e, "Appropriate Api was not requested.");
        return a$e;
    }
    
    public final boolean i() {
        if (!this.n) {
            return false;
        }
        this.n = false;
        ((Handler)this.q).removeMessages(2);
        ((Handler)this.q).removeMessages(1);
        final b1 s = this.s;
        if (s != null) {
            synchronized (s) {
                final Context a = s.a;
                if (a != null) {
                    a.unregisterReceiver((BroadcastReceiver)s);
                }
                s.a = null;
                monitorexit(s);
                this.s = null;
            }
        }
        return true;
    }
    
    public final void j(final od.b b) {
        final e r = this.r;
        final Context k = this.k;
        final int g = b.g;
        r.getClass();
        if (!od.g.isPlayServicesPossiblyUpdating(k, g)) {
            this.i();
        }
        if (!this.n) {
            final d0 h = this.h;
            yd.a.N0(h.m, "onConnectionFailure must only be called on the Handler thread");
            ((Handler)h.m).removeMessages(1);
            synchronized (h.n) {
                final ArrayList list = new ArrayList(h.i);
                final int value = h.k.get();
                while (true) {
                    for (c.c c : list) {
                        if (!h.j || h.k.get() != value) {
                            monitorexit(h.n);
                            final d0 h2 = this.h;
                            h2.j = false;
                            h2.k.incrementAndGet();
                            return;
                        }
                        if (!h.i.contains(c)) {
                            continue;
                        }
                        ((l)c).m(b);
                    }
                    monitorexit(h.n);
                    continue;
                }
            }
        }
    }
    
    public final void k(int i, final boolean b) {
        int n = i;
        Label_0122: {
            if (i != 1) {
                break Label_0122;
            }
            Label_0120: {
                if (b) {
                    break Label_0120;
                }
                if (this.n) {
                    break Label_0120;
                }
                this.n = true;
                while (true) {
                    if (this.s != null) {
                        break Label_0076;
                    }
                    try {
                        final e r = this.r;
                        final Context applicationContext = this.k.getApplicationContext();
                        final k0 k0 = new k0(this);
                        r.getClass();
                        this.s = e.h(applicationContext, (bj2.d)k0);
                        final j0 q = this.q;
                        ((Handler)q).sendMessageDelayed(((Handler)q).obtainMessage(1), this.o);
                        final j0 q2 = this.q;
                        ((Handler)q2).sendMessageDelayed(((Handler)q2).obtainMessage(2), this.p);
                        n = 1;
                        final BasePendingResult[] array = this.B.a.toArray(new BasePendingResult[0]);
                        int length;
                        for (length = array.length, i = 0; i < length; ++i) {
                            array[i].e(p1.c);
                        }
                        final d0 h = this.h;
                        yd.a.N0(h.m, "onUnintentionalDisconnection must only be called on the Handler thread");
                        ((Handler)h.m).removeMessages(1);
                        Object o = h.n;
                        synchronized (o) {
                            h.l = true;
                            final ArrayList list = new ArrayList(h.g);
                            i = h.k.get();
                            for (final c.b b2 : list) {
                                if (!h.j) {
                                    break;
                                }
                                if (h.k.get() != i) {
                                    break;
                                }
                                if (!h.g.contains(b2)) {
                                    continue;
                                }
                                ((qd.d)b2).k(n);
                            }
                            h.h.clear();
                            h.l = false;
                            monitorexit(o);
                            o = this.h;
                            ((d0)o).j = false;
                            ((d0)o).k.incrementAndGet();
                            if (n == 2) {
                                this.n();
                            }
                        }
                    }
                    catch (final SecurityException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public final void l(int n) {
        final Integer a = this.A;
        if (a == null) {
            this.A = n;
        }
        else if (a != n) {
            String s = "UNKNOWN";
            String s2;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        s2 = "UNKNOWN";
                    }
                    else {
                        s2 = "SIGN_IN_MODE_NONE";
                    }
                }
                else {
                    s2 = "SIGN_IN_MODE_OPTIONAL";
                }
            }
            else {
                s2 = "SIGN_IN_MODE_REQUIRED";
            }
            n = this.A;
            if (n != 1) {
                if (n != 2) {
                    if (n == 3) {
                        s = "SIGN_IN_MODE_NONE";
                    }
                }
                else {
                    s = "SIGN_IN_MODE_OPTIONAL";
                }
            }
            else {
                s = "SIGN_IN_MODE_REQUIRED";
            }
            n = s2.length();
            throw new IllegalStateException(a.j(new StringBuilder(s.length() + (n + 51)), "Cannot use sign-in mode: ", s2, ". Mode was already set to ", s));
        }
        if (this.i != null) {
            return;
        }
        final Iterator<a$e> iterator = this.t.values().iterator();
        boolean b = false;
        n = 0;
        while (iterator.hasNext()) {
            final a$e a$e = iterator.next();
            b |= a$e.g();
            n |= (a$e.d() ? 1 : 0);
        }
        final int intValue = this.A;
        if (intValue != 1) {
            if (intValue == 2 && b) {
                final Context k = this.k;
                final Lock g = this.g;
                final Looper l = this.l;
                final e r = this.r;
                final Map<a$b<?>, a$e> t = this.t;
                final d v = this.v;
                final Map<a<?>, Boolean> w = this.w;
                final a.a<? extends f, ue.a> x = this.x;
                final ArrayList<b2> z = this.z;
                final j0.b b2 = new j0.b();
                final j0.b b3 = new j0.b();
                final Iterator<Map.Entry<a$b<?>, a$e>> iterator2 = t.entrySet().iterator();
                a$e a$e2 = null;
                while (iterator2.hasNext()) {
                    final Map.Entry<a$b, a$e> entry = (Map.Entry<a$b, a$e>)iterator2.next();
                    final a$e a$e3 = entry.getValue();
                    if (a$e3.d()) {
                        a$e2 = a$e3;
                    }
                    if (a$e3.g()) {
                        ((j0.i)b2).put((Object)entry.getKey(), (Object)a$e3);
                    }
                    else {
                        ((j0.i)b3).put((Object)entry.getKey(), (Object)a$e3);
                    }
                }
                yd.a.W0(((j0.i)b2).isEmpty() ^ true, "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
                final j0.b b4 = new j0.b();
                final j0.b b5 = new j0.b();
                for (final a a2 : w.keySet()) {
                    final a.f b6 = a2.b;
                    if (((j0.i)b2).containsKey((Object)b6)) {
                        ((j0.i)b4).put((Object)a2, (Object)w.get(a2));
                    }
                    else {
                        if (!((j0.i)b3).containsKey((Object)b6)) {
                            throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                        }
                        ((j0.i)b5).put((Object)a2, (Object)w.get(a2));
                    }
                }
                final ArrayList list = new ArrayList();
                final ArrayList list2 = new ArrayList();
                n = z.size();
                int i = 0;
                final ArrayList list3 = z;
                while (i < n) {
                    final b2 b7 = (b2)list3.get(i);
                    if (((j0.i)b4).containsKey((Object)b7.a)) {
                        list.add(b7);
                    }
                    else {
                        if (!((j0.i)b5).containsKey((Object)b7.a)) {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                        list2.add(b7);
                    }
                    ++i;
                }
                this.i = (e1)new q(k, this, g, l, r, b2, b3, v, x, a$e2, list, list2, b4, b5);
                return;
            }
        }
        else {
            if (!b) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (n != 0) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        }
        this.i = (e1)new p0(this.k, this, this.g, this.l, this.r, this.t, this.v, this.w, this.x, this.z, (c1)this);
    }
    
    public final void m(final Bundle bundle) {
        while (!this.m.isEmpty()) {
            this.f(this.m.remove());
        }
        final d0 h = this.h;
        yd.a.N0(h.m, "onConnectionSuccess must only be called on the Handler thread");
        synchronized (h.n) {
            yd.a.V0(h.l ^ true);
            ((Handler)h.m).removeMessages(1);
            h.l = true;
            yd.a.V0(h.h.isEmpty());
            final ArrayList list = new ArrayList(h.g);
            final int value = h.k.get();
            for (final c.b b : list) {
                if (!h.j || !h.f.b()) {
                    break;
                }
                if (h.k.get() != value) {
                    break;
                }
                if (h.h.contains(b)) {
                    continue;
                }
                ((qd.d)b).R(bundle);
            }
            h.h.clear();
            h.l = false;
        }
    }
    
    public final void n() {
        this.h.j = true;
        final e1 i = this.i;
        yd.a.S0((Object)i);
        i.b();
    }
}
