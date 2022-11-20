// 
// Decompiled by Procyon v0.6.0
// 

package kd2;

import android.content.Intent;
import com.tonyodev.fetch2.exception.FetchException;
import com.tonyodev.fetch2.downloader.ParallelFileDownloaderImpl;
import com.tonyodev.fetch2.downloader.SequentialFileDownloaderImpl;
import mg.d0;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Map;
import cg2.j;
import com.tonyodev.fetch2.Download;
import java.util.concurrent.Executors;
import t5.u;
import android.content.Context;
import qd2.k;
import qd2.e;
import com.tonyodev.fetch2.fetch.ListenerCoordinator;
import h.s;
import qd2.i;
import com.tonyodev.fetch2core.Downloader;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

public final class b implements a
{
    public final boolean A;
    public final Object f;
    public ExecutorService g;
    public volatile int h;
    public final HashMap<Integer, c> i;
    public volatile int j;
    public volatile boolean k;
    public final Downloader<?, ?> l;
    public final long m;
    public final i n;
    public final od2.a o;
    public final boolean p;
    public final s q;
    public final g3.a r;
    public final ListenerCoordinator s;
    public final e t;
    public final boolean u;
    public final k v;
    public final Context w;
    public final String x;
    public final u y;
    public final int z;
    
    public b(final Downloader<?, ?> l, final int h, final long m, final i n, final od2.a o, final boolean p17, final s q, final g3.a r, final ListenerCoordinator s, final e t, final boolean u, final k v, final Context w, final String x, final u y, final int z, final boolean a) {
        ng2.e.g((Object)l, "httpDownloader");
        ng2.e.g((Object)n, "logger");
        ng2.e.g((Object)r, "downloadManagerCoordinator");
        ng2.e.g((Object)s, "listenerCoordinator");
        ng2.e.g((Object)t, "fileServerDownloader");
        ng2.e.g((Object)v, "storageResolver");
        ng2.e.g((Object)w, "context");
        ng2.e.g((Object)x, "namespace");
        ng2.e.g((Object)y, "groupInfoProvider");
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p17;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.f = new Object();
        ExecutorService fixedThreadPool;
        if (h > 0) {
            fixedThreadPool = Executors.newFixedThreadPool(h);
        }
        else {
            fixedThreadPool = null;
        }
        this.g = fixedThreadPool;
        this.h = h;
        this.i = new HashMap<Integer, c>();
    }
    
    public static final void a(final b b, final Download download) {
        synchronized (b.f) {
            if (b.i.containsKey(download.getId())) {
                b.i.remove(download.getId());
                --b.j;
            }
            b.r.c(download.getId());
            final j a = j.a;
        }
    }
    
    @Override
    public final boolean B1(final int n) {
        synchronized (this.f) {
            if (!this.k) {
                final g3.a r = this.r;
                synchronized (r.a) {
                    boolean containsKey = ((Map)r.b).containsKey(n);
                    monitorexit(r.a);
                    if (containsKey) {
                        containsKey = true;
                        return containsKey;
                    }
                }
            }
            return false;
        }
    }
    
    public final void b() {
        if (this.h > 0) {
            final g3.a r = this.r;
            Object o = r.a;
            synchronized (o) {
                final List i5 = CollectionsKt___CollectionsKt.I5((Iterable)((Map)r.b).values());
                monitorexit(o);
                for (final c c : i5) {
                    if (c != null) {
                        c.P();
                        this.r.c(((Download)c.w()).getId());
                        final i n = this.n;
                        o = a.t("DownloadManager cancelled download ");
                        ((StringBuilder)o).append(c.w());
                        n.d(((StringBuilder)o).toString());
                    }
                }
            }
        }
        this.i.clear();
        this.j = 0;
    }
    
    @Override
    public final void close() {
        synchronized (this.f) {
            if (this.k) {
                return;
            }
            this.k = true;
            if (this.h > 0) {
                this.q();
            }
            this.n.d("DownloadManager closing download manager");
            try {
                final ExecutorService g = this.g;
                if (g != null) {
                    g.shutdown();
                    final j a = cg2.j.a;
                }
            }
            catch (final Exception ex) {
                final j a2 = cg2.j.a;
            }
        }
    }
    
    public final c d(final Download download, final Downloader<?, ?> downloader) {
        final Downloader.b v = d0.V(download, "GET");
        downloader.f(v);
        Object o;
        if (downloader.Q(v, downloader.C(v)) == Downloader.FileDownloaderType.SEQUENTIAL) {
            o = new SequentialFileDownloaderImpl(download, (Downloader)downloader, this.m, this.n, this.o, this.p, this.u, this.v, this.A);
        }
        else {
            o = new ParallelFileDownloaderImpl(download, (Downloader)downloader, this.m, this.n, this.o, this.p, this.v.d(v), this.u, this.v, this.A);
        }
        return (c)o;
    }
    
    @Override
    public final boolean d2() {
        synchronized (this.f) {
            return !this.k && this.j < this.h;
        }
    }
    
    public final c h(final Download download) {
        ng2.e.g((Object)download, "download");
        c c;
        if (!oy0.b.C(download.getUrl())) {
            c = this.d(download, this.l);
        }
        else {
            c = this.d(download, (Downloader<?, ?>)this.t);
        }
        return c;
    }
    
    @Override
    public final void j1() {
        final Object f = this.f;
        monitorenter(f);
        Label_0042: {
            try {
                if (!this.k) {
                    this.b();
                    final j a = cg2.j.a;
                    monitorexit(f);
                    return;
                }
            }
            finally {
                break Label_0042;
            }
            throw new FetchException("DownloadManager is already shutdown.");
        }
        monitorexit(f);
    }
    
    @Override
    public final boolean n2(final Download download) {
        final Object f = this.f;
        monitorenter(f);
        Label_0309: {
            try {
                if (!this.k) {
                    if (this.i.containsKey(download.getId())) {
                        final i n = this.n;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("DownloadManager already running download ");
                        sb.append(download);
                        n.d(sb.toString());
                        monitorexit(f);
                        return false;
                    }
                    if (this.j >= this.h) {
                        final i n2 = this.n;
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("DownloadManager cannot init download ");
                        sb2.append(download);
                        sb2.append(" because ");
                        sb2.append("the download queue is full");
                        n2.d(sb2.toString());
                        monitorexit(f);
                        return false;
                    }
                    ++this.j;
                    this.i.put(download.getId(), null);
                    final g3.a r = this.r;
                    final int id = download.getId();
                    Object a = r.a;
                    synchronized (a) {
                        ((Map)r.b).put(id, null);
                        final j a2 = cg2.j.a;
                        monitorexit(a);
                        final ExecutorService g = this.g;
                        if (g != null && !g.isShutdown()) {
                            a = new Runnable(this, download) {
                                public final b f;
                                public final Download g;
                                
                                @Override
                                public final void run() {
                                    while (true) {
                                        try {
                                            final Thread currentThread = Thread.currentThread();
                                            ng2.e.b((Object)currentThread, "Thread.currentThread()");
                                            final StringBuilder sb = new StringBuilder();
                                            sb.append(this.g.getNamespace());
                                            sb.append('-');
                                            sb.append(this.g.getId());
                                            currentThread.setName(sb.toString());
                                            try {
                                                final c h = this.f.h(this.g);
                                                final Object f = this.f.f;
                                                monitorenter(f);
                                                Label_0358: {
                                                    int id = 0;
                                                    Label_0301: {
                                                        Label_0299: {
                                                            Object o;
                                                            g3.a r;
                                                            try {
                                                                if (this.f.i.containsKey(this.g.getId())) {
                                                                    final b f2 = this.f;
                                                                    o = new md2.a(f2.q, f2.s.g, f2.p, f2.z);
                                                                    h.I((md2.a)o);
                                                                    this.f.i.put(this.g.getId(), h);
                                                                    r = this.f.r;
                                                                    id = this.g.getId();
                                                                    o = r.a;
                                                                    monitorenter(o);
                                                                    final g3.a a = r;
                                                                    final Object o2 = a.b;
                                                                    final Map<Integer, c> map = (Map<Integer, c>)o2;
                                                                    final int n = id;
                                                                    final Integer n2 = n;
                                                                    final c c = h;
                                                                    map.put(n2, c);
                                                                    final j j = cg2.j.a;
                                                                    final md2.a a2 = (md2.a)o;
                                                                    monitorexit(a2);
                                                                    final Runnable runnable = this;
                                                                    final b b = runnable.f;
                                                                    o = b.n;
                                                                    final StringBuilder sb2 = new(java.lang.StringBuilder.class)();
                                                                    final StringBuilder sb4;
                                                                    final StringBuilder sb3 = sb4 = sb2;
                                                                    new StringBuilder();
                                                                    final StringBuilder sb5 = sb3;
                                                                    final String s = "DownloadManager starting download ";
                                                                    sb5.append(s);
                                                                    final StringBuilder sb6 = sb3;
                                                                    final Runnable runnable2 = this;
                                                                    final Download download = runnable2.g;
                                                                    sb6.append(download);
                                                                    final md2.a a3 = (md2.a)o;
                                                                    final StringBuilder sb7 = sb3;
                                                                    final String s2 = sb7.toString();
                                                                    ((i)a3).d(s2);
                                                                    id = 1;
                                                                    break Label_0301;
                                                                }
                                                                break Label_0299;
                                                            }
                                                            finally {
                                                                break Label_0358;
                                                            }
                                                            try {
                                                                final g3.a a = r;
                                                                final Object o2 = a.b;
                                                                final Map<Integer, c> map = (Map<Integer, c>)o2;
                                                                final int n = id;
                                                                final Integer n2 = n;
                                                                final c c = h;
                                                                map.put(n2, c);
                                                                final j j = cg2.j.a;
                                                                final md2.a a2 = (md2.a)o;
                                                                monitorexit(a2);
                                                                final Runnable runnable = this;
                                                                final b b = runnable.f;
                                                                o = b.n;
                                                                final StringBuilder sb2 = new(java.lang.StringBuilder.class)();
                                                                final StringBuilder sb4;
                                                                final StringBuilder sb3 = sb4 = sb2;
                                                                new StringBuilder();
                                                                final StringBuilder sb5 = sb3;
                                                                final String s = "DownloadManager starting download ";
                                                                sb5.append(s);
                                                                final StringBuilder sb6 = sb3;
                                                                final Runnable runnable2 = this;
                                                                final Download download = runnable2.g;
                                                                sb6.append(download);
                                                                final md2.a a3 = (md2.a)o;
                                                                final StringBuilder sb7 = sb3;
                                                                final String s2 = sb7.toString();
                                                                ((i)a3).d(s2);
                                                                id = 1;
                                                                break Label_0301;
                                                            }
                                                            finally {
                                                                monitorexit(o);
                                                            }
                                                        }
                                                        id = 0;
                                                    }
                                                    monitorexit(f);
                                                    if (id != 0) {
                                                        final Runnable runnable3;
                                                        runnable3.run();
                                                    }
                                                    b.a(this.f, this.g);
                                                    this.f.y.a();
                                                    b.a(this.f, this.g);
                                                    final Intent intent = new Intent("com.tonyodev.fetch2.action.QUEUE_BACKOFF_RESET");
                                                    return;
                                                }
                                                monitorexit(f);
                                            }
                                            catch (final Exception o) {
                                                try {
                                                    final i n3 = this.f.n;
                                                    final StringBuilder sb8 = new StringBuilder();
                                                    sb8.append("DownloadManager failed to start download ");
                                                    sb8.append(this.g);
                                                    n3.b(sb8.toString(), (Exception)o);
                                                }
                                                finally {
                                                    b.a(this.f, this.g);
                                                    final Intent intent2 = new Intent("com.tonyodev.fetch2.action.QUEUE_BACKOFF_RESET");
                                                    intent2.setPackage(this.f.w.getPackageName());
                                                    intent2.putExtra("com.tonyodev.fetch2.extra.NAMESPACE", this.f.x);
                                                    this.f.w.sendBroadcast(intent2);
                                                }
                                            }
                                        }
                                        catch (final Exception ex) {
                                            continue;
                                        }
                                        break;
                                    }
                                }
                            };
                            g.execute((Runnable)a);
                            return true;
                        }
                        return false;
                    }
                }
            }
            finally {
                break Label_0309;
            }
            throw new FetchException("DownloadManager is already shutdown.");
        }
        monitorexit(f);
    }
    
    public final void q() {
        for (final Map.Entry<K, c> entry : this.i.entrySet()) {
            final c c = entry.getValue();
            if (c != null) {
                c.v();
                final i n = this.n;
                final StringBuilder t = a.t("DownloadManager terminated download ");
                t.append(c.w());
                n.d(t.toString());
                this.r.c(((Number)entry.getKey()).intValue());
            }
        }
        this.i.clear();
        this.j = 0;
    }
}
