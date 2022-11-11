// 
// Decompiled by Procyon v0.6.0
// 

package od;

import java.util.Iterator;
import md.g;
import android.util.Log;
import android.app.ActivityManager;
import android.app.ActivityManager$RunningAppProcessInfo;
import android.app.Application;
import j0.h$a;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import pd.m;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import com.google.android.gms.common.internal.MethodInvocation;
import android.os.Message;
import android.app.PendingIntent;
import android.os.Parcelable;
import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiActivity;
import pd.o;
import java.util.Collection;
import android.os.HandlerThread;
import pd.h;
import md.b;
import android.content.pm.PackageManager;
import android.os.Looper;
import de.f;
import j0.d;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import pd.f0;
import android.content.Context;
import rd.c;
import pd.q;
import com.google.android.gms.common.api.Status;
import android.os.Handler$Callback;

public final class e implements Handler$Callback
{
    public static final Status u;
    public static final Status v;
    public static final Object w;
    public static e x;
    public long f;
    public boolean g;
    public q h;
    public c i;
    public final Context j;
    public final md.e k;
    public final f0 l;
    public final AtomicInteger m;
    public final AtomicInteger n;
    public final ConcurrentHashMap o;
    public t p;
    public final d q;
    public final d r;
    public final f s;
    public volatile boolean t;
    
    static {
        u = new Status(4, "Sign-out occurred while this API call was in progress.");
        v = new Status(4, "The user must be signed in to make this API call.");
        w = new Object();
    }
    
    public e(final Context j, final Looper looper, final md.e k) {
        this.f = 10000L;
        this.g = false;
        boolean b = true;
        this.m = new AtomicInteger(1);
        this.n = new AtomicInteger(0);
        this.o = new ConcurrentHashMap(5, 0.75f, 1);
        this.p = null;
        this.q = new d();
        this.r = new d();
        this.t = true;
        this.j = j;
        final f s = new f(looper, (Handler$Callback)this);
        this.s = s;
        this.k = k;
        this.l = new f0((md.f)k);
        final PackageManager packageManager = j.getPackageManager();
        if (ud.d.d == null) {
            if (!ud.f.a() || !packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                b = false;
            }
            ud.d.d = b;
        }
        if (ud.d.d) {
            this.t = false;
        }
        s.sendMessage(s.obtainMessage(6));
    }
    
    public static Status d(final a<?> a, final b b) {
        final String c = a.b.c;
        final String value = String.valueOf(b);
        return new Status(1, 17, b.j(new StringBuilder(String.valueOf(c).length() + 63 + value.length()), "API: ", c, " is not available on this device. Connection failed with: ", value), b.h, b);
    }
    
    public static e f(final Context context) {
        final Object w = e.w;
        monitorenter(w);
        Label_0094: {
            try {
                if (e.x != null) {
                    break Label_0094;
                }
                Object o = h.a;
                synchronized (o) {
                    HandlerThread handlerThread = h.c;
                    if (handlerThread != null) {
                        monitorexit(o);
                    }
                    else {
                        ((Thread)(h.c = new HandlerThread("GoogleApiHandler", 9))).start();
                        handlerThread = h.c;
                        monitorexit(o);
                    }
                    o = handlerThread.getLooper();
                    e.x = new e(context.getApplicationContext(), (Looper)o, md.e.d);
                }
            }
            finally {
                monitorexit(w);
                final e x = e.x;
                monitorexit(w);
                return x;
            }
        }
    }
    
    public final void a(final t p) {
        synchronized (e.w) {
            if (this.p != p) {
                this.p = p;
                this.q.clear();
            }
            this.q.addAll((Collection)p.k);
        }
    }
    
    public final boolean b() {
        if (this.g) {
            return false;
        }
        pd.o.a().getClass();
        final int value = this.l.a.get(203400000, -1);
        return value == -1 || value == 0;
    }
    
    public final boolean c(final b b, final int n) {
        final md.e k = this.k;
        final Context j = this.j;
        k.getClass();
        final boolean t = wd.a.T(j);
        boolean b2 = false;
        if (!t) {
            PendingIntent pendingIntent;
            if (b.q()) {
                pendingIntent = b.h;
            }
            else {
                pendingIntent = ((md.f)k).b(b.g, 0, j, (String)null);
            }
            if (pendingIntent != null) {
                final int g = b.g;
                final int g2 = GoogleApiActivity.g;
                final Intent intent = new Intent(j, (Class)GoogleApiActivity.class);
                intent.putExtra("pending_intent", (Parcelable)pendingIntent);
                intent.putExtra("failing_client_id", n);
                intent.putExtra("notify_manager", true);
                k.j(j, g, PendingIntent.getActivity(j, 0, intent, de.e.a | 0x8000000));
                b2 = true;
            }
        }
        return b2;
    }
    
    public final w0<?> e(final com.google.android.gms.common.api.b<?> b) {
        final a<O> e = (a<O>)b.e;
        w0 w0;
        if ((w0 = this.o.get(e)) == null) {
            w0 = new w0(this, b);
            this.o.put(e, w0);
        }
        if (w0.b.h()) {
            this.r.add((Object)e);
        }
        w0.m();
        return w0;
    }
    
    public final void g(final b b, final int n) {
        if (!this.c(b, n)) {
            final f s = this.s;
            s.sendMessage(s.obtainMessage(5, n, 0, (Object)b));
        }
    }
    
    public final boolean handleMessage(Message j) {
        final int what = j.what;
        long f = 300000L;
        final int n = 0;
        Label_1861: {
            switch (what) {
                default: {
                    d.w(31, "Unknown message id: ", what, "GoogleApiManager");
                    return false;
                }
                case 19: {
                    this.g = false;
                    break;
                }
                case 18: {
                    final g1 g1 = (g1)j.obj;
                    if (g1.c == 0L) {
                        final q q = new q(g1.b, Arrays.asList(g1.a));
                        if (this.i == null) {
                            this.i = new c(this.j);
                        }
                        this.i.c(q);
                        break;
                    }
                    final q h = this.h;
                    if (h != null) {
                        final List<MethodInvocation> g2 = h.g;
                        if (h.f == g1.b && (g2 == null || g2.size() < g1.d)) {
                            final q h2 = this.h;
                            final MethodInvocation a = g1.a;
                            if (h2.g == null) {
                                h2.g = new ArrayList<MethodInvocation>();
                            }
                            h2.g.add(a);
                        }
                        else {
                            this.s.removeMessages(17);
                            final q h3 = this.h;
                            if (h3 != null) {
                                if (h3.f > 0 || this.b()) {
                                    if (this.i == null) {
                                        this.i = new c(this.j);
                                    }
                                    this.i.c(h3);
                                }
                                this.h = null;
                            }
                        }
                    }
                    if (this.h == null) {
                        final ArrayList<MethodInvocation> list = new ArrayList<MethodInvocation>();
                        list.add(g1.a);
                        this.h = new q(g1.b, list);
                        final f s = this.s;
                        s.sendMessageDelayed(s.obtainMessage(17), g1.c);
                        break;
                    }
                    break;
                }
                case 17: {
                    final q h4 = this.h;
                    if (h4 != null) {
                        if (h4.f > 0 || this.b()) {
                            if (this.i == null) {
                                this.i = new c(this.j);
                            }
                            this.i.c(h4);
                        }
                        this.h = null;
                        break;
                    }
                    break;
                }
                case 16: {
                    final x0 x0 = (x0)j.obj;
                    if (!this.o.containsKey(x0.a)) {
                        break;
                    }
                    final w0 w0 = this.o.get(x0.a);
                    if (w0.j.remove(x0)) {
                        w0.l.s.removeMessages(15, (Object)x0);
                        w0.l.s.removeMessages(16, (Object)x0);
                        final md.d b = x0.b;
                        final ArrayList list2 = new ArrayList<d1>(w0.a.size());
                    Label_0620:
                        for (final t1 t1 : w0.a) {
                            if (t1 instanceof d1) {
                                final md.d[] g3 = ((d1)t1).g(w0);
                                if (g3 != null) {
                                    final int length = g3.length;
                                    int i = 0;
                                    while (true) {
                                        while (i < length) {
                                            if (pd.m.a((Object)g3[i], (Object)b)) {
                                                if (i < 0) {
                                                    break;
                                                }
                                                final boolean b2 = true;
                                                if (b2) {
                                                    list2.add((d1)t1);
                                                    continue Label_0620;
                                                }
                                                continue Label_0620;
                                            }
                                            else {
                                                ++i;
                                            }
                                        }
                                        final boolean b2 = false;
                                        continue;
                                    }
                                }
                                continue;
                            }
                        }
                        for (int size = list2.size(), k = n; k < size; ++k) {
                            final t1 t2 = list2.get(k);
                            w0.a.remove(t2);
                            t2.b((RuntimeException)new UnsupportedApiCallException(b));
                        }
                        break;
                    }
                    break;
                }
                case 15: {
                    final x0 x2 = (x0)j.obj;
                    if (!this.o.containsKey(x2.a)) {
                        break;
                    }
                    final w0 w2 = this.o.get(x2.a);
                    if (!w2.j.contains(x2)) {
                        break;
                    }
                    if (w2.i) {
                        break;
                    }
                    if (!w2.b.c()) {
                        w2.m();
                        break;
                    }
                    w2.d();
                    break;
                }
                case 14: {
                    j.obj.getClass();
                    if (!this.o.containsKey(null)) {
                        throw null;
                    }
                    this.o.get(null).k(false);
                    throw null;
                }
                case 12: {
                    if (this.o.containsKey(j.obj)) {
                        this.o.get(j.obj).k(true);
                        break;
                    }
                    break;
                }
                case 11: {
                    if (!this.o.containsKey(j.obj)) {
                        break;
                    }
                    final w0 w3 = this.o.get(j.obj);
                    lw0.b.K(w3.l.s);
                    if (w3.i) {
                        w3.h();
                        final e l = w3.l;
                        Status status;
                        if (l.k.f(l.j) == 18) {
                            status = new Status(21, (PendingIntent)null, "Connection timed out waiting for Google Play services update to complete.");
                        }
                        else {
                            status = new Status(22, (PendingIntent)null, "API failed to connect while resuming due to an unknown error.");
                        }
                        w3.b(status);
                        w3.b.e("Timing out connection while resuming.");
                        break;
                    }
                    break;
                }
                case 10: {
                    final Iterator iterator2 = this.r.iterator();
                    while (true) {
                        final h$a h$a = (h$a)iterator2;
                        if (!h$a.hasNext()) {
                            break;
                        }
                        final w0 w4 = this.o.remove(h$a.next());
                        if (w4 == null) {
                            continue;
                        }
                        w4.q();
                    }
                    this.r.clear();
                    break;
                }
                case 9: {
                    if (!this.o.containsKey(j.obj)) {
                        break;
                    }
                    final w0 w5 = this.o.get(j.obj);
                    lw0.b.K(w5.l.s);
                    if (w5.i) {
                        w5.m();
                        break;
                    }
                    break;
                }
                case 7: {
                    this.e((com.google.android.gms.common.api.b<?>)j.obj);
                    break;
                }
                case 6: {
                    if (this.j.getApplicationContext() instanceof Application) {
                        od.b.a((Application)this.j.getApplicationContext());
                        j = (Message)od.b.j;
                        final s0 s2 = new s0(this);
                        j.getClass();
                        synchronized (j) {
                            ((od.b)j).h.add((od.b.a)s2);
                            monitorexit(j);
                            if (!((od.b)j).g.get()) {
                                final ActivityManager$RunningAppProcessInfo activityManager$RunningAppProcessInfo = new ActivityManager$RunningAppProcessInfo();
                                ActivityManager.getMyMemoryState(activityManager$RunningAppProcessInfo);
                                if (!((od.b)j).g.getAndSet(true) && activityManager$RunningAppProcessInfo.importance > 100) {
                                    ((od.b)j).f.set(true);
                                }
                            }
                            if (!((od.b)j).f.get()) {
                                this.f = 300000L;
                                break;
                            }
                            break;
                        }
                    }
                    break;
                }
                case 5: {
                    final int arg1 = j.arg1;
                    final b b3 = (b)j.obj;
                    while (true) {
                        for (final w0 w6 : this.o.values()) {
                            if (w6.g == arg1) {
                                if (w6 == null) {
                                    final StringBuilder sb = new StringBuilder(76);
                                    sb.append("Could not find API instance ");
                                    sb.append(arg1);
                                    sb.append(" while trying to fail enqueued calls.");
                                    Log.wtf("GoogleApiManager", sb.toString(), (Throwable)new Exception());
                                    break Label_1861;
                                }
                                if (b3.g == 13) {
                                    final md.e m = this.k;
                                    final int g4 = b3.g;
                                    m.getClass();
                                    final String errorString = md.g.getErrorString(g4);
                                    final String i2 = b3.i;
                                    w6.b(new Status(17, (PendingIntent)null, b.j(new StringBuilder(String.valueOf(errorString).length() + 69 + String.valueOf(i2).length()), "Error resolution was canceled by the user, original error message: ", errorString, ": ", i2)));
                                    break Label_1861;
                                }
                                w6.b(d(w6.c, b3));
                                break Label_1861;
                            }
                        }
                        w0 w6 = null;
                        continue;
                    }
                }
                case 4:
                case 8:
                case 13: {
                    final i1 i3 = (i1)j.obj;
                    w0<?> e;
                    if ((e = this.o.get(i3.c.e)) == null) {
                        e = this.e(i3.c);
                    }
                    if (e.b.h() && this.n.get() != i3.b) {
                        i3.a.a(od.e.u);
                        e.q();
                        break;
                    }
                    e.n(i3.a);
                    break;
                }
                case 3: {
                    for (final w0 w7 : this.o.values()) {
                        lw0.b.K(w7.l.s);
                        w7.k = null;
                        w7.m();
                    }
                    break;
                }
                case 2: {
                    j.obj.getClass();
                    throw null;
                }
                case 1: {
                    if (j.obj) {
                        f = 10000L;
                    }
                    this.f = f;
                    this.s.removeMessages(12);
                    for (final a a2 : this.o.keySet()) {
                        final f s3 = this.s;
                        s3.sendMessageDelayed(s3.obtainMessage(12, (Object)a2), this.f);
                    }
                    break;
                }
            }
        }
        return true;
    }
}
