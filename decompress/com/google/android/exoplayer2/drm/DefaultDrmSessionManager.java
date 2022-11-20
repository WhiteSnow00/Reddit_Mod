// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.drm;

import java.util.HashSet;
import androidx.activity.k;
import com.google.common.collect.o0;
import java.util.Collection;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;
import java.util.List;
import com.google.common.collect.ImmutableList;
import android.util.Log;
import bd.p;
import com.google.android.exoplayer2.n;
import android.media.ResourceBusyException;
import bd.c0;
import java.util.Map;
import java.util.Collections;
import java.util.IdentityHashMap;
import wa.b;
import com.google.android.exoplayer2.upstream.f;
import xa.d0;
import android.os.Handler;
import android.os.Looper;
import java.util.Set;
import java.util.ArrayList;
import com.google.android.exoplayer2.upstream.h;
import java.util.HashMap;
import java.util.UUID;

public final class DefaultDrmSessionManager implements d
{
    public final UUID b;
    public final g$c c;
    public final j d;
    public final HashMap<String, String> e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final f i;
    public final h j;
    public final g k;
    public final long l;
    public final ArrayList m;
    public final Set<e> n;
    public final Set<DefaultDrmSession> o;
    public int p;
    public com.google.android.exoplayer2.drm.g q;
    public DefaultDrmSession r;
    public DefaultDrmSession s;
    public Looper t;
    public Handler u;
    public int v;
    public byte[] w;
    public d0 x;
    public volatile DefaultDrmSessionManager.DefaultDrmSessionManager$d y;
    
    public DefaultDrmSessionManager(final UUID b, final g$c c, final i d, final HashMap e, final boolean f, final int[] g, final boolean h, final com.google.android.exoplayer2.upstream.f j, final long l) {
        b.getClass();
        ah0.b.D(wa.b.b.equals(b) ^ true, "Use C.CLEARKEY_UUID instead");
        this.b = b;
        this.c = c;
        this.d = (j)d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.j = (h)j;
        this.i = new f();
        this.k = new g();
        this.v = 0;
        this.m = new ArrayList();
        this.n = Collections.newSetFromMap(new IdentityHashMap<e, Boolean>());
        this.o = Collections.newSetFromMap(new IdentityHashMap<DefaultDrmSession, Boolean>());
        this.l = l;
    }
    
    public static boolean f(final DefaultDrmSession defaultDrmSession) {
        final int o = defaultDrmSession.o;
        final boolean b = true;
        if (o == 1) {
            boolean b2 = b;
            if (c0.a < 19) {
                return b2;
            }
            final DrmSession$DrmSessionException error = defaultDrmSession.getError();
            error.getClass();
            if (((Throwable)error).getCause() instanceof ResourceBusyException) {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
    
    public static ArrayList i(final com.google.android.exoplayer2.drm.b b, final UUID uuid, final boolean b2) {
        final ArrayList list = new ArrayList(b.i);
        for (int i = 0; i < b.i; ++i) {
            final b$b b$b = b.f[i];
            if ((b$b.a(uuid) || (b.c.equals(uuid) && b$b.a(b.b))) && (b$b.j != null || b2)) {
                list.add(b$b);
            }
        }
        return list;
    }
    
    public final DrmSession a(final c$a c$a, final n n) {
        ah0.b.H(this.p > 0);
        ah0.b.I((Object)this.t);
        return this.e(this.t, c$a, n, true);
    }
    
    public final d$b b(final c$a c$a, final n n) {
        ah0.b.H(this.p > 0);
        ah0.b.I((Object)this.t);
        final e e = new e(c$a);
        final Handler u = this.u;
        u.getClass();
        u.post((Runnable)new p3.g(6, e, n));
        return (d$b)e;
    }
    
    public final void c(final Looper t, final d0 x) {
        synchronized (this) {
            final Looper t2 = this.t;
            if (t2 == null) {
                this.t = t;
                this.u = new Handler(t);
            }
            else {
                ah0.b.H(t2 == t);
                this.u.getClass();
            }
            monitorexit(this);
            this.x = x;
        }
    }
    
    public final int d(final n n) {
        final com.google.android.exoplayer2.drm.g q = this.q;
        q.getClass();
        int i = q.i();
        final com.google.android.exoplayer2.drm.b t = n.t;
        final boolean b = false;
        if (t == null) {
            final int j = bd.p.i(n.q);
            final int[] g = this.g;
            while (true) {
                for (int k = 0; k < g.length; ++k) {
                    if (g[k] == j) {
                        if (k == -1) {
                            i = 0;
                        }
                        return i;
                    }
                }
                int k = -1;
                continue;
            }
        }
        int n2 = 0;
        Label_0273: {
            if (this.w == null) {
                if (i(t, this.b, true).isEmpty()) {
                    n2 = (b ? 1 : 0);
                    if (t.i != 1) {
                        break Label_0273;
                    }
                    n2 = (b ? 1 : 0);
                    if (!t.f[0].a(wa.b.b)) {
                        break Label_0273;
                    }
                    final String value = String.valueOf(this.b);
                    final StringBuilder sb = new StringBuilder(value.length() + 72);
                    sb.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
                    sb.append(value);
                    Log.w("DefaultDrmSessionMgr", sb.toString());
                }
                final String h = t.h;
                if (h != null) {
                    if (!"cenc".equals(h)) {
                        if ("cbcs".equals(h)) {
                            n2 = (b ? 1 : 0);
                            if (c0.a < 25) {
                                break Label_0273;
                            }
                        }
                        else {
                            n2 = (b ? 1 : 0);
                            if ("cbc1".equals(h)) {
                                break Label_0273;
                            }
                            if ("cens".equals(h)) {
                                n2 = (b ? 1 : 0);
                                break Label_0273;
                            }
                        }
                    }
                }
            }
            n2 = 1;
        }
        if (n2 == 0) {
            i = 1;
        }
        return i;
    }
    
    public final DrmSession e(final Looper looper, final c$a c$a, final n n, final boolean b) {
        if (this.y == null) {
            this.y = new DefaultDrmSessionManager.DefaultDrmSessionManager$d(this, looper);
        }
        final com.google.android.exoplayer2.drm.b t = n.t;
        final DrmSession drmSession = null;
        final DrmSession drmSession2 = null;
        final int n2 = 0;
        if (t == null) {
            final int i = bd.p.i(n.q);
            final com.google.android.exoplayer2.drm.g q = this.q;
            q.getClass();
            final boolean b2 = q.i() == 2 && bb.f.d;
            Object r = drmSession2;
            if (!b2) {
                final int[] g = this.g;
                int j = n2;
                while (true) {
                    while (j < g.length) {
                        if (g[j] == i) {
                            r = drmSession2;
                            if (j == -1) {
                                return (DrmSession)r;
                            }
                            if (q.i() == 1) {
                                r = drmSession2;
                                return (DrmSession)r;
                            }
                            final DefaultDrmSession r2 = this.r;
                            if (r2 == null) {
                                final DefaultDrmSession h = this.h((List<b$b>)ImmutableList.of(), true, null, b);
                                this.m.add(h);
                                this.r = h;
                            }
                            else {
                                r2.e(null);
                            }
                            r = this.r;
                            return (DrmSession)r;
                        }
                        else {
                            ++j;
                        }
                    }
                    j = -1;
                    continue;
                }
            }
            return (DrmSession)r;
        }
        ArrayList k;
        if (this.w == null) {
            if ((k = i(t, this.b, false)).isEmpty()) {
                final DefaultDrmSessionManager.DefaultDrmSessionManager$MissingSchemeDataException ex = new DefaultDrmSessionManager.DefaultDrmSessionManager$MissingSchemeDataException(this.b, (DefaultDrmSessionManager$a)null);
                ah0.b.U("DefaultDrmSessionMgr", "DRM error", (Throwable)ex);
                if (c$a != null) {
                    c$a.e((Exception)ex);
                }
                return (DrmSession)new com.google.android.exoplayer2.drm.f(new DrmSession$DrmSessionException((Throwable)ex, 6003));
            }
        }
        else {
            k = null;
        }
        Object s;
        if (!this.f) {
            s = this.s;
        }
        else {
            final Iterator iterator = this.m.iterator();
            do {
                s = drmSession;
                if (!iterator.hasNext()) {
                    break;
                }
                s = iterator.next();
            } while (!c0.a((Object)((DefaultDrmSession)s).a, (Object)k));
        }
        if (s == null) {
            s = this.h(k, false, c$a, b);
            if (!this.f) {
                this.s = (DefaultDrmSession)s;
            }
            this.m.add(s);
        }
        else {
            ((DefaultDrmSession)s).e(c$a);
        }
        return (DrmSession)s;
    }
    
    public final DefaultDrmSession g(final List<b$b> list, final boolean b, final c$a c$a) {
        this.q.getClass();
        final boolean h = this.h;
        final UUID b2 = this.b;
        final com.google.android.exoplayer2.drm.g q = this.q;
        final f i = this.i;
        final g k = this.k;
        final int v = this.v;
        final byte[] w = this.w;
        final HashMap<String, String> e = this.e;
        final j d = this.d;
        final Looper t = this.t;
        t.getClass();
        final h j = this.j;
        final d0 x = this.x;
        x.getClass();
        final DefaultDrmSession defaultDrmSession = new DefaultDrmSession(b2, q, i, k, list, v, h | b, b, w, e, d, t, j, x);
        defaultDrmSession.e(c$a);
        if (this.l != -9223372036854775807L) {
            defaultDrmSession.e(null);
        }
        return defaultDrmSession;
    }
    
    public final DefaultDrmSession h(final List<b$b> list, final boolean b, final c$a c$a, final boolean b2) {
        DefaultDrmSession defaultDrmSession2;
        final DefaultDrmSession defaultDrmSession = defaultDrmSession2 = this.g(list, b, c$a);
        if (f(defaultDrmSession)) {
            defaultDrmSession2 = defaultDrmSession;
            if (!this.o.isEmpty()) {
                final o0 iterator = ImmutableSet.copyOf((Collection)this.o).iterator();
                while (((Iterator)iterator).hasNext()) {
                    ((DrmSession)((Iterator)iterator).next()).a((c$a)null);
                }
                defaultDrmSession.a(c$a);
                if (this.l != -9223372036854775807L) {
                    defaultDrmSession.a(null);
                }
                defaultDrmSession2 = this.g(list, b, c$a);
            }
        }
        DefaultDrmSession g = defaultDrmSession2;
        if (f(defaultDrmSession2)) {
            g = defaultDrmSession2;
            if (b2) {
                g = defaultDrmSession2;
                if (!this.n.isEmpty()) {
                    final o0 iterator2 = ImmutableSet.copyOf((Collection)this.n).iterator();
                    while (((Iterator)iterator2).hasNext()) {
                        ((e)((Iterator)iterator2).next()).release();
                    }
                    if (!this.o.isEmpty()) {
                        final o0 iterator3 = ImmutableSet.copyOf((Collection)this.o).iterator();
                        while (((Iterator)iterator3).hasNext()) {
                            ((DrmSession)((Iterator)iterator3).next()).a((c$a)null);
                        }
                    }
                    defaultDrmSession2.a(c$a);
                    if (this.l != -9223372036854775807L) {
                        defaultDrmSession2.a(null);
                    }
                    g = this.g(list, b, c$a);
                }
            }
        }
        return g;
    }
    
    public final void j() {
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            final com.google.android.exoplayer2.drm.g q = this.q;
            q.getClass();
            q.release();
            this.q = null;
        }
    }
    
    public final void prepare() {
        if (this.p++ != 0) {
            return;
        }
        if (this.q == null) {
            (this.q = this.c.d(this.b)).h(new c());
        }
        else if (this.l != -9223372036854775807L) {
            for (int i = 0; i < this.m.size(); ++i) {
                ((DefaultDrmSession)this.m.get(i)).e(null);
            }
        }
    }
    
    public final void release() {
        final int p = this.p - 1;
        this.p = p;
        if (p != 0) {
            return;
        }
        if (this.l != -9223372036854775807L) {
            final ArrayList list = new ArrayList(this.m);
            for (int i = 0; i < list.size(); ++i) {
                ((DefaultDrmSession)list.get(i)).a(null);
            }
        }
        final o0 iterator = ImmutableSet.copyOf((Collection)this.n).iterator();
        while (((Iterator)iterator).hasNext()) {
            ((e)((Iterator)iterator).next()).release();
        }
        this.j();
    }
    
    public final class c implements g$b
    {
        public final DefaultDrmSessionManager a;
        
        public c(final DefaultDrmSessionManager a) {
            this.a = a;
        }
    }
    
    public final class e implements d$b
    {
        public final c$a f;
        public DrmSession g;
        public boolean h;
        public final DefaultDrmSessionManager i;
        
        public e(final DefaultDrmSessionManager i, final c$a f) {
            this.i = i;
            this.f = f;
        }
        
        public final void release() {
            final Handler u = this.i.u;
            u.getClass();
            c0.N(u, (Runnable)new k((Object)this, 6));
        }
    }
    
    public final class f implements DefaultDrmSession$a
    {
        public final HashSet a;
        public DefaultDrmSession b;
        
        public f() {
            this.a = new HashSet();
        }
        
        public final void a(final Exception ex, final boolean b) {
            this.b = null;
            final ImmutableList copy = ImmutableList.copyOf((Collection)this.a);
            this.a.clear();
            for (final DefaultDrmSession defaultDrmSession : copy) {
                int n;
                if (b) {
                    n = 1;
                }
                else {
                    n = 3;
                }
                defaultDrmSession.j(n, ex);
            }
        }
    }
    
    public final class g implements DefaultDrmSession$b
    {
        public final DefaultDrmSessionManager a;
        
        public g(final DefaultDrmSessionManager a) {
            this.a = a;
        }
    }
}
