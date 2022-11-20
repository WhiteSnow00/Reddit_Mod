// 
// Decompiled by Procyon v0.6.0
// 

package ve;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import com.android.billingclient.api.c0;
import android.text.TextUtils;
import android.os.SystemClock;
import android.content.pm.ApplicationInfo;
import java.lang.reflect.Method;
import com.google.android.gms.internal.stats.zzi;
import java.util.concurrent.Executors;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.WorkSource;
import android.util.Log;
import vd.h;
import xd.c;
import vd.j;
import android.os.PowerManager;
import mg.d0;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ScheduledFuture;
import android.os.PowerManager$WakeLock;
import java.util.concurrent.ScheduledExecutorService;

public final class a
{
    public static final long n;
    public static volatile ScheduledExecutorService o;
    public static final Object p;
    public final Object a;
    public final PowerManager$WakeLock b;
    public int c;
    public ScheduledFuture d;
    public long e;
    public final HashSet f;
    public boolean g;
    public le.a h;
    public px1.a i;
    public final String j;
    public final HashMap k;
    public AtomicInteger l;
    public final ScheduledExecutorService m;
    
    static {
        n = TimeUnit.DAYS.toMillis(366L);
        a.o = null;
        p = new Object();
    }
    
    public a(Context b) {
        final String packageName = ((Context)b).getPackageName();
        this.a = new Object();
        this.c = 0;
        this.f = new HashSet();
        this.g = true;
        this.i = px1.a.t;
        this.k = new HashMap();
        this.l = new AtomicInteger(0);
        d0.w("WakeLock: wakeLockName must not be empty", "wake:com.google.firebase.iid.WakeLockHolder");
        ((Context)b).getApplicationContext();
        final WorkSource workSource = null;
        this.h = null;
        if (!"com.google.android.gms".equals(((Context)b).getPackageName())) {
            String concat;
            if ("wake:com.google.firebase.iid.WakeLockHolder".length() != 0) {
                concat = "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
            }
            else {
                concat = new String("*gcore*:");
            }
            this.j = concat;
        }
        else {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        final PowerManager powerManager = (PowerManager)((Context)b).getSystemService("power");
        if (powerManager != null) {
            this.b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            final Method a = vd.j.a;
            boolean b2 = false;
            Label_0221: {
                if (((Context)b).getPackageManager() != null) {
                    if (xd.c.a((Context)b).a.getPackageManager().checkPermission("android.permission.UPDATE_DEVICE_STATS", ((Context)b).getPackageName()) == 0) {
                        b2 = true;
                        break Label_0221;
                    }
                }
                b2 = false;
            }
            Label_0505: {
                if (b2) {
                    Object o = packageName;
                    if (vd.h.b(packageName)) {
                        o = ((Context)b).getPackageName();
                    }
                    Object workSource2 = workSource;
                    if (((Context)b).getPackageManager() != null) {
                        workSource2 = workSource;
                        if (o != null) {
                            try {
                                final ApplicationInfo a2 = xd.c.a((Context)b).a(0, (String)o);
                                if (a2 == null) {
                                    String concat2;
                                    if (((String)o).length() != 0) {
                                        concat2 = "Could not get applicationInfo from package: ".concat((String)o);
                                    }
                                    else {
                                        concat2 = new String("Could not get applicationInfo from package: ");
                                    }
                                    Log.e("WorkSourceUtil", concat2);
                                    workSource2 = workSource;
                                }
                                else {
                                    final int uid = a2.uid;
                                    b = (ArrayIndexOutOfBoundsException)new WorkSource();
                                    final Method b3 = vd.j.b;
                                    if (b3 != null) {
                                        try {
                                            b3.invoke(b, uid, o);
                                            workSource2 = b;
                                        }
                                        catch (final Exception o) {
                                            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", (Throwable)o);
                                            workSource2 = b;
                                        }
                                    }
                                    else {
                                        o = vd.j.a;
                                        workSource2 = b;
                                        if (o != null) {
                                            try {
                                                ((Method)o).invoke(b, uid);
                                                workSource2 = b;
                                            }
                                            catch (final Exception o) {
                                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", (Throwable)o);
                                                workSource2 = b;
                                            }
                                        }
                                    }
                                }
                            }
                            catch (final PackageManager$NameNotFoundException ex) {
                                String concat3;
                                if (((String)o).length() != 0) {
                                    concat3 = "Could not find package: ".concat((String)o);
                                }
                                else {
                                    concat3 = new String("Could not find package: ");
                                }
                                Log.e("WorkSourceUtil", concat3);
                                workSource2 = workSource;
                            }
                        }
                    }
                    if (workSource2 != null) {
                        b = (ArrayIndexOutOfBoundsException)this.b;
                        try {
                            ((PowerManager$WakeLock)b).setWorkSource((WorkSource)workSource2);
                            break Label_0505;
                        }
                        catch (final ArrayIndexOutOfBoundsException b) {}
                        catch (final IllegalArgumentException ex2) {}
                        Log.wtf("WakeLock", b.toString());
                    }
                }
            }
            final ScheduledExecutorService o2;
            if ((o2 = ve.a.o) == null) {
                synchronized (ve.a.p) {
                    if (ve.a.o == null) {
                        ve.a.o = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    }
                }
            }
            this.m = o2;
            return;
        }
        final StringBuilder sb = new StringBuilder(29);
        sb.append("expected a non-null reference", 0, 29);
        throw new zzi(sb.toString());
    }
    
    public final void a(long e) {
        this.l.incrementAndGet();
        final long n = ve.a.n;
        final long n2 = Long.MAX_VALUE;
        long n4;
        final long n3 = n4 = Math.max(Math.min(Long.MAX_VALUE, n), 1L);
        if (e > 0L) {
            n4 = Math.min(e, n3);
        }
        final Object a = this.a;
        monitorenter(a);
        Label_0118: {
            try {
                if (!this.b()) {
                    this.h = le.a.f;
                    this.b.acquire();
                    this.i.getClass();
                    SystemClock.elapsedRealtime();
                }
                ++this.c;
                if (this.g) {
                    TextUtils.isEmpty((CharSequence)null);
                }
                break Label_0118;
            }
            finally {
                monitorexit(a);
                while (true) {
                    ScheduledFuture d = null;
                    Block_10: {
                        while (true) {
                            while (true) {
                                this.e = e;
                                d = this.d;
                                iftrue(Label_0240:)(d == null);
                                break Block_10;
                                iftrue(Label_0275:)(e <= this.e);
                                continue;
                            }
                            final b b = new b(0);
                            this.k.put(null, b);
                            Label_0162: {
                                ++b.a;
                            }
                            this.i.getClass();
                            final long elapsedRealtime = SystemClock.elapsedRealtime();
                            e = n2;
                            iftrue(Label_0206:)(Long.MAX_VALUE - elapsedRealtime <= n4);
                            e = elapsedRealtime + n4;
                            continue;
                        }
                    }
                    d.cancel(false);
                    Label_0240: {
                        this.d = this.m.schedule((Runnable)new c0((Object)this, 5), n4, TimeUnit.MILLISECONDS);
                    }
                    Label_0275:
                    monitorexit(a);
                    return;
                    b b;
                    iftrue(Label_0162:)((b = this.k.get(null)) != null);
                    continue;
                }
            }
        }
    }
    
    public final boolean b() {
        synchronized (this.a) {
            return this.c > 0;
        }
    }
    
    public final void c() {
        if (this.l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.j).concat(" release without a matched acquire!"));
        }
        final Object a = this.a;
        monitorenter(a);
        Label_0055: {
            try {
                if (this.g) {
                    TextUtils.isEmpty((CharSequence)null);
                }
                break Label_0055;
            }
            finally {
                monitorexit(a);
                iftrue(Label_0110:)(!this.k.containsKey(null));
                Label_0129: {
                    while (true) {
                        Block_6: {
                            break Block_6;
                            Label_0110: {
                                Log.w("WakeLock", String.valueOf(this.j).concat(" counter does not exist"));
                            }
                            break Label_0129;
                            this.k.remove(null);
                            break Label_0129;
                        }
                        final b b = this.k.get(null);
                        iftrue(Label_0129:)(b == null || --b.a != 0);
                        continue;
                    }
                }
                this.e();
                monitorexit(a);
            }
        }
    }
    
    public final void d() {
        if (this.f.isEmpty()) {
            return;
        }
        final ArrayList list = new ArrayList(this.f);
        this.f.clear();
        if (list.size() <= 0) {
            return;
        }
        final ve.c c = list.get(0);
        throw null;
    }
    
    public final void e() {
        synchronized (this.a) {
            if (!this.b()) {
                return;
            }
            if (this.g) {
                if (--this.c > 0) {
                    return;
                }
            }
            else {
                this.c = 0;
            }
            this.d();
            final Iterator iterator = this.k.values().iterator();
            while (iterator.hasNext()) {
                ((b)iterator.next()).a = 0;
            }
            this.k.clear();
            final ScheduledFuture d = this.d;
            if (d != null) {
                d.cancel(false);
                this.d = null;
                this.e = 0L;
            }
            if (this.b.isHeld()) {
                try {
                    try {
                        this.b.release();
                        if (this.h != null) {
                            this.h = null;
                        }
                        return;
                    }
                    finally {
                        if (this.h != null) {
                            this.h = null;
                        }
                        final RuntimeException ex;
                        Log.e("WakeLock", String.valueOf(this.j).concat(" failed to release!"), (Throwable)ex);
                        iftrue(Label_0261:)(this.h == null);
                        this.h = null;
                    }
                }
                catch (final RuntimeException ex2) {}
            }
            Log.e("WakeLock", String.valueOf(this.j).concat(" should be held!"));
            Label_0261:;
        }
    }
}
