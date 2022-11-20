// 
// Decompiled by Procyon v0.6.0
// 

package ld2;

import com.tonyodev.fetch2.Download;
import mg.d0;
import com.tonyodev.fetch2.database.DownloadInfo;
import id2.g$a;
import com.tonyodev.fetch2core.Downloader;
import h.s;
import hd2.b;
import com.tonyodev.fetch2.fetch.ListenerCoordinator;
import androidx.compose.ui.platform.k0;
import id2.i;
import t5.u;
import com.tonyodev.fetch2core.a;
import java.util.Map;
import cg2.j;
import ng2.e;
import android.os.Looper;
import android.os.Handler;
import java.util.LinkedHashMap;

public final class c
{
    public static final Object a;
    public static final LinkedHashMap b;
    public static final Handler c;
    
    static {
        a = new Object();
        b = new LinkedHashMap();
        c = new Handler(Looper.getMainLooper());
    }
    
    public static void a(final String s) {
        e.g((Object)s, "namespace");
        synchronized (ld2.c.a) {
            final LinkedHashMap b = ld2.c.b;
            final a a = b.get(s);
            Label_0238: {
                if (a != null) {
                    final com.tonyodev.fetch2core.a a2 = a.a;
                    synchronized (a2.a) {
                        Label_0088: {
                            if (!a2.b) {
                                final int c = a2.c;
                                if (c == 0) {
                                    monitorexit(a2.a);
                                    break Label_0088;
                                }
                                a2.c = c - 1;
                            }
                            final j a3 = j.a;
                            monitorexit(a2.a);
                        }
                        final com.tonyodev.fetch2core.a a4 = a.a;
                        Object o = a4.a;
                        synchronized (a2.a) {
                            int c2;
                            if (!a4.b) {
                                c2 = a4.c;
                            }
                            else {
                                c2 = 0;
                            }
                            monitorexit(a2.a);
                            if (c2 != 0) {
                                break Label_0238;
                            }
                            a.a.a();
                            a.g.a();
                            final u d = a.d;
                            o = d.a;
                            synchronized (a2.a) {
                                ((Map)d.b).clear();
                                final j a5 = j.a;
                                monitorexit(a2.a);
                                a.b.close();
                                a.f.a();
                                a.h.c();
                                b.remove(s);
                            }
                        }
                    }
                }
            }
            final j a6 = j.a;
        }
    }
    
    public static final class a
    {
        public final com.tonyodev.fetch2core.a a;
        public final i b;
        public final k0 c;
        public final u d;
        public final Handler e;
        public final g3.a f;
        public final ListenerCoordinator g;
        public final od2.a h;
        
        public a(final com.tonyodev.fetch2core.a a, final i b, final k0 c, final u d, final Handler e, final g3.a f, final ListenerCoordinator g, final od2.a h) {
            e.g((Object)e, "uiHandler");
            e.g((Object)h, "networkInfoProvider");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this != o) {
                if (o instanceof a) {
                    final a a = (a)o;
                    if (ng2.e.a((Object)this.a, (Object)a.a) && ng2.e.a((Object)this.b, (Object)a.b) && ng2.e.a((Object)this.c, (Object)a.c) && ng2.e.a((Object)this.d, (Object)a.d) && ng2.e.a((Object)this.e, (Object)a.e) && ng2.e.a((Object)this.f, (Object)a.f) && ng2.e.a((Object)this.g, (Object)a.g) && ng2.e.a((Object)this.h, (Object)a.h)) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        
        @Override
        public final int hashCode() {
            final com.tonyodev.fetch2core.a a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a != null) {
                hashCode2 = a.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            final i b = this.b;
            int hashCode3;
            if (b != null) {
                hashCode3 = b.hashCode();
            }
            else {
                hashCode3 = 0;
            }
            final k0 c = this.c;
            int hashCode4;
            if (c != null) {
                hashCode4 = c.hashCode();
            }
            else {
                hashCode4 = 0;
            }
            final u d = this.d;
            int hashCode5;
            if (d != null) {
                hashCode5 = d.hashCode();
            }
            else {
                hashCode5 = 0;
            }
            final Handler e = this.e;
            int hashCode6;
            if (e != null) {
                hashCode6 = e.hashCode();
            }
            else {
                hashCode6 = 0;
            }
            final g3.a f = this.f;
            int hashCode7;
            if (f != null) {
                hashCode7 = f.hashCode();
            }
            else {
                hashCode7 = 0;
            }
            final ListenerCoordinator g = this.g;
            int hashCode8;
            if (g != null) {
                hashCode8 = g.hashCode();
            }
            else {
                hashCode8 = 0;
            }
            final od2.a h = this.h;
            if (h != null) {
                hashCode = h.hashCode();
            }
            return ((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("Holder(handlerWrapper=");
            t.append(this.a);
            t.append(", fetchDatabaseManagerWrapper=");
            t.append(this.b);
            t.append(", downloadProvider=");
            t.append(this.c);
            t.append(", groupInfoProvider=");
            t.append(this.d);
            t.append(", uiHandler=");
            t.append(this.e);
            t.append(", downloadManagerCoordinator=");
            t.append(this.f);
            t.append(", listenerCoordinator=");
            t.append(this.g);
            t.append(", networkInfoProvider=");
            t.append(this.h);
            t.append(")");
            return t.toString();
        }
    }
    
    public static final class b
    {
        public final od2.a a;
        public final ld2.a b;
        public final hd2.b c;
        public final com.tonyodev.fetch2core.a d;
        public final i e;
        public final Handler f;
        public final ListenerCoordinator g;
        
        public b(final hd2.b c, final com.tonyodev.fetch2core.a d, final i e, final k0 k0, final u u, final Handler f, final g3.a a, final ListenerCoordinator g) {
            e.g((Object)d, "handlerWrapper");
            e.g((Object)e, "fetchDatabaseManagerWrapper");
            e.g((Object)k0, "downloadProvider");
            e.g((Object)u, "groupInfoProvider");
            e.g((Object)f, "uiHandler");
            e.g((Object)a, "downloadManagerCoordinator");
            e.g((Object)g, "listenerCoordinator");
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            final s s = new s(e);
            final od2.a a2 = new od2.a(c.a, c.s);
            this.a = a2;
            final kd2.b b = new kd2.b(c.f, c.c, c.d, c.h, a2, c.j, s, a, g, c.k, c.l, c.n, c.a, c.b, u, c.v, c.w);
            final md2.e e2 = new md2.e(d, k0, b, a2, c.h, g, c.c, c.a, c.b, c.r);
            e2.d(c.g);
            final ld2.a x = c.x;
            ld2.a b2;
            if (x != null) {
                b2 = x;
            }
            else {
                b2 = new ld2.b(c.b, e, b, e2, c.h, c.i, c.f, c.k, g, f, c.n, c.o, u, c.r);
            }
            this.b = b2;
            e.b2(new g$a<DownloadInfo>(this) {
                public final b a;
                
                public final void a(final DownloadInfo downloadInfo) {
                    d0.J(downloadInfo.getId(), this.a.c.n.d(d0.V((Download)downloadInfo, "GET")));
                }
            });
        }
    }
}
