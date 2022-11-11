// 
// Decompiled by Procyon v0.6.0
// 

package rd2;

import android.net.NetworkInfo;
import android.content.Context;
import td2.a;
import com.tonyodev.fetch2.PrioritySort;
import h.t;
import hg2.j;
import java.util.concurrent.TimeUnit;
import android.net.ConnectivityManager;
import kotlin.TypeCastException;
import com.tonyodev.fetch2.NetworkType;
import com.tonyodev.fetch2.Download;
import java.util.List;
import lw0.b;
import kotlin.collections.EmptyList;
import nd2.i;

public final class d implements Runnable
{
    public final /* synthetic */ e f;
    
    public d(final e f) {
        this.f = f;
    }
    
    @Override
    public final void run() {
        if (e.a(this.f)) {
            if (this.f.o.b2() && e.a(this.f)) {
                final e f = this.f;
                Object o = f.f;
                synchronized (o) {
                    Object o2;
                    try {
                        final t n = f.n;
                        final PrioritySort v = f.v;
                        n.getClass();
                        sg2.e.g((Object)v, "prioritySort");
                        o2 = ((i)n.g).L1(v);
                    }
                    catch (final Exception ex) {
                        f.q.a(ex);
                        o2 = EmptyList.INSTANCE;
                    }
                    monitorexit(o);
                    final boolean empty = ((List)o2).isEmpty();
                    final int n2 = 1;
                    int n3;
                    if (!empty && this.f.p.b()) {
                        n3 = 0;
                    }
                    else {
                        n3 = 1;
                    }
                    if (n3 == 0) {
                        final int l0 = b.L0((List)o2);
                        n3 = n2;
                        if (l0 >= 0) {
                            int n4 = 0;
                            int n5 = 1;
                            int n6;
                            while (true) {
                                n6 = n5;
                                if (!this.f.o.b2()) {
                                    break;
                                }
                                n6 = n5;
                                if (!e.a(this.f)) {
                                    break;
                                }
                                final Download download = (Download)((List)o2).get(n4);
                                final boolean k1 = b.k1(download.getUrl());
                                if (!k1) {
                                    n6 = n5;
                                    if (!this.f.p.b()) {
                                        break;
                                    }
                                }
                                n6 = n5;
                                if (!e.a(this.f)) {
                                    break;
                                }
                                final NetworkType g = this.f.g;
                                o = NetworkType.GLOBAL_OFF;
                                if (g != o) {
                                    o = this.f.g;
                                }
                                else if (download.getNetworkType() == o) {
                                    o = NetworkType.ALL;
                                }
                                else {
                                    o = download.getNetworkType();
                                }
                                final a p = this.f.p;
                                p.getClass();
                                sg2.e.g(o, "networkType");
                                boolean b = false;
                                Label_0517: {
                                    Label_0508: {
                                        if (o == NetworkType.WIFI_ONLY) {
                                            final Context g2 = p.g;
                                            sg2.e.g((Object)g2, "$this$isOnWiFi");
                                            final Object systemService = g2.getSystemService("connectivity");
                                            if (systemService == null) {
                                                throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
                                            }
                                            final NetworkInfo activeNetworkInfo = ((ConnectivityManager)systemService).getActiveNetworkInfo();
                                            if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) {
                                                break Label_0508;
                                            }
                                        }
                                        if (o == NetworkType.UNMETERED) {
                                            final Context g3 = p.g;
                                            sg2.e.g((Object)g3, "$this$isOnMeteredConnection");
                                            final Object systemService2 = g3.getSystemService("connectivity");
                                            if (systemService2 == null) {
                                                throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
                                            }
                                            if (!((ConnectivityManager)systemService2).isActiveNetworkMetered()) {
                                                break Label_0508;
                                            }
                                        }
                                        if (o != NetworkType.ALL || !ui.b.I(p.g)) {
                                            b = false;
                                            break Label_0517;
                                        }
                                    }
                                    b = true;
                                }
                                if (!b) {
                                    this.f.r.g.l(download);
                                }
                                if (k1 || b) {
                                    if (!this.f.o.A1(download.getId()) && e.a(this.f)) {
                                        this.f.o.m2(download);
                                    }
                                    n5 = 0;
                                }
                                n6 = n5;
                                if (n4 == l0) {
                                    break;
                                }
                                ++n4;
                            }
                            n3 = n6;
                        }
                    }
                    if (n3 != 0) {
                        o = this.f;
                        long i;
                        if (((e)o).i == 500L) {
                            i = 60000L;
                        }
                        else {
                            i = ((e)o).i * 2L;
                        }
                        ((e)o).i = i;
                        final long minutes = TimeUnit.MILLISECONDS.toMinutes(((e)o).i);
                        o = ((e)o).q;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("PriorityIterator backoffTime increased to ");
                        sb.append(minutes);
                        sb.append(" minute(s)");
                        ((vd2.i)o).d(sb.toString());
                    }
                }
            }
            if (e.a(this.f)) {
                final e f2 = this.f;
                if (f2.s > 0) {
                    final com.tonyodev.fetch2core.a m = f2.m;
                    final d j = f2.l;
                    final long i2 = f2.i;
                    m.getClass();
                    sg2.e.g((Object)j, "runnable");
                    synchronized (m.a) {
                        if (!m.b) {
                            m.d.postDelayed((Runnable)j, i2);
                        }
                        final j a = hg2.j.a;
                    }
                }
            }
        }
    }
}
