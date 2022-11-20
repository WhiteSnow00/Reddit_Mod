// 
// Decompiled by Procyon v0.6.0
// 

package ld2;

import java.util.Iterator;
import cg2.j;
import hd2.f;
import com.tonyodev.fetch2.exception.FetchException;
import android.os.Looper;
import java.util.UUID;
import com.tonyodev.fetch2.PrioritySort;
import t5.u;
import qd2.k;
import android.os.Handler;
import com.tonyodev.fetch2core.Downloader;
import md2.e;
import hd2.g;
import com.tonyodev.fetch2.fetch.ListenerCoordinator;
import com.tonyodev.fetch2.Download;
import id2.i;
import java.util.LinkedHashSet;

public final class b implements a
{
    public final int f;
    public final LinkedHashSet g;
    public volatile boolean h;
    public final String i;
    public final i j;
    public final kd2.a k;
    public final md2.b<Download> l;
    public final boolean m;
    public final ListenerCoordinator n;
    public final g o;
    
    public b(final String i, final i j, final kd2.b k, final e l, final qd2.i m, final boolean m2, final Downloader downloader, final qd2.e e, final ListenerCoordinator n, final Handler handler, final k k2, final g o, final u u, final PrioritySort prioritySort) {
        ng2.e.g((Object)i, "namespace");
        ng2.e.g((Object)j, "fetchDatabaseManagerWrapper");
        ng2.e.g((Object)m, "logger");
        ng2.e.g((Object)downloader, "httpDownloader");
        ng2.e.g((Object)e, "fileServerDownloader");
        ng2.e.g((Object)n, "listenerCoordinator");
        ng2.e.g((Object)handler, "uiHandler");
        ng2.e.g((Object)k2, "storageResolver");
        ng2.e.g((Object)u, "groupInfoProvider");
        ng2.e.g((Object)prioritySort, "prioritySort");
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = (md2.b<Download>)l;
        this.m = m2;
        this.n = n;
        this.o = o;
        this.f = UUID.randomUUID().hashCode();
        this.g = new LinkedHashSet();
    }
    
    @Override
    public final boolean K(final boolean b) {
        final Thread currentThread = Thread.currentThread();
        final Looper mainLooper = Looper.getMainLooper();
        ng2.e.b((Object)mainLooper, "Looper.getMainLooper()");
        if (!ng2.e.a((Object)currentThread, (Object)mainLooper.getThread())) {
            return this.j.u1(b) > 0L;
        }
        throw new FetchException("blocking_call_on_ui_thread");
    }
    
    @Override
    public final void close() {
        if (this.h) {
            return;
        }
        this.h = true;
        synchronized (this.g) {
            final Iterator iterator = this.g.iterator();
            while (iterator.hasNext()) {
                this.n.b(this.f, (f)iterator.next());
            }
            this.g.clear();
            final j a = cg2.j.a;
            monitorexit(this.g);
            final g o = this.o;
            if (o != null) {
                final ListenerCoordinator n = this.n;
                n.getClass();
                Object o2 = n.a;
                synchronized (this.g) {
                    n.d.remove(o);
                    monitorexit(this.g);
                    final ListenerCoordinator n2 = this.n;
                    final g o3 = this.o;
                    n2.getClass();
                    ng2.e.g((Object)o3, "fetchNotificationManager");
                    o2 = n2.a;
                    synchronized (this.g) {
                        n2.e.post((Runnable)new d(n2, o3));
                    }
                }
            }
            this.l.stop();
            this.l.close();
            this.k.close();
            Object o2 = c.a;
            c.a(this.i);
        }
    }
    
    @Override
    public final void init() {
        final g o = this.o;
        if (o != null) {
            final ListenerCoordinator n = this.n;
            n.getClass();
            synchronized (n.a) {
                if (!n.d.contains(o)) {
                    n.d.add(o);
                }
                final j a = cg2.j.a;
            }
        }
        this.j.f1();
        if (this.m) {
            this.l.start();
        }
    }
}
