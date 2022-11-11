// 
// Decompiled by Procyon v0.6.0
// 

package rd2;

import hg2.j;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.tonyodev.fetch2.PrioritySort;
import android.content.Context;
import com.tonyodev.fetch2.fetch.ListenerCoordinator;
import vd2.i;
import h.t;
import com.tonyodev.fetch2core.a;
import com.tonyodev.fetch2.helper.PriorityListProcessorImpl$networkChangeListener$1;
import com.tonyodev.fetch2.NetworkType;
import com.tonyodev.fetch2.Download;

public final class e implements b<Download>
{
    public final Object f;
    public volatile NetworkType g;
    public volatile boolean h;
    public volatile long i;
    public final PriorityListProcessorImpl$networkChangeListener$1 j;
    public final c k;
    public final d l;
    public final a m;
    public final t n;
    public final pd2.a o;
    public final td2.a p;
    public final i q;
    public final ListenerCoordinator r;
    public volatile int s;
    public final Context t;
    public final String u;
    public final PrioritySort v;
    
    public e(final a m, final t n, final pd2.b o, final td2.a p10, final i q, final ListenerCoordinator r, final int s, final Context t, final String u, final PrioritySort v) {
        sg2.e.g((Object)m, "handlerWrapper");
        sg2.e.g((Object)n, "downloadProvider");
        sg2.e.g((Object)q, "logger");
        sg2.e.g((Object)r, "listenerCoordinator");
        sg2.e.g((Object)t, "context");
        sg2.e.g((Object)u, "namespace");
        sg2.e.g((Object)v, "prioritySort");
        this.m = m;
        this.n = n;
        this.o = (pd2.a)o;
        this.p = p10;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.f = new Object();
        this.g = NetworkType.GLOBAL_OFF;
        this.h = true;
        this.i = 500L;
        final PriorityListProcessorImpl$networkChangeListener$1 j = new PriorityListProcessorImpl$networkChangeListener$1(this);
        this.j = j;
        final c k = new c();
        this.k = k;
        synchronized (p10.a) {
            p10.b.add(j);
            monitorexit(p10.a);
            t.registerReceiver((BroadcastReceiver)k, new IntentFilter("com.tonyodev.fetch2.action.QUEUE_BACKOFF_RESET"));
            this.l = new d(this);
        }
    }
    
    public static final boolean a(final e e) {
        return !e.h;
    }
    
    public final void b() {
        synchronized (this.f) {
            this.i = 500L;
            this.h();
            if (this.s > 0) {
                final a m = this.m;
                final d l = this.l;
                final long i = this.i;
                m.getClass();
                sg2.e.g((Object)l, "runnable");
                synchronized (m.a) {
                    if (!m.b) {
                        m.d.postDelayed((Runnable)l, i);
                    }
                    final j a = hg2.j.a;
                }
            }
            final i q = this.q;
            final StringBuilder sb = new StringBuilder();
            sb.append("PriorityIterator backoffTime reset to ");
            sb.append(this.i);
            sb.append(" milliseconds");
            q.d(sb.toString());
            final j a2 = hg2.j.a;
        }
    }
    
    public final void c(final NetworkType g) {
        sg2.e.g((Object)g, "<set-?>");
        this.g = g;
    }
    
    @Override
    public final void close() {
        synchronized (this.f) {
            final td2.a p = this.p;
            final PriorityListProcessorImpl$networkChangeListener$1 j = this.j;
            p.getClass();
            sg2.e.g((Object)j, "networkChangeListener");
            synchronized (p.a) {
                p.b.remove(j);
                monitorexit(p.a);
                this.t.unregisterReceiver((BroadcastReceiver)this.k);
                final j a = hg2.j.a;
            }
        }
    }
    
    public final void h() {
        if (this.s > 0) {
            final a m = this.m;
            final d l = this.l;
            m.getClass();
            sg2.e.g((Object)l, "runnable");
            synchronized (m.a) {
                if (!m.b) {
                    m.d.removeCallbacks((Runnable)l);
                }
                final j a = hg2.j.a;
            }
        }
    }
    
    @Override
    public final void start() {
        synchronized (this.f) {
            this.b();
            this.h = false;
            if (this.s > 0) {
                final a m = this.m;
                final d l = this.l;
                final long i = this.i;
                m.getClass();
                sg2.e.g((Object)l, "runnable");
                synchronized (m.a) {
                    if (!m.b) {
                        m.d.postDelayed((Runnable)l, i);
                    }
                    final j a = hg2.j.a;
                }
            }
            this.q.d("PriorityIterator started");
            final j a2 = hg2.j.a;
        }
    }
    
    @Override
    public final void stop() {
        synchronized (this.f) {
            this.h();
            this.h = true;
            this.o.i1();
            this.q.d("PriorityIterator stop");
            final j a = hg2.j.a;
        }
    }
}
