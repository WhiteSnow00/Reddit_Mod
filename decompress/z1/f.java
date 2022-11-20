// 
// Decompiled by Procyon v0.6.0
// 

package z1;

import java.util.Iterator;
import java.util.List;
import com.reddit.events.userprofile.UserProfileAnalytics$PaneName;
import com.android.billingclient.api.l;
import com.google.android.play.core.tasks.zzj;
import com.google.android.play.core.review.ReviewException;
import java.util.concurrent.locks.ReadWriteLock;
import cg.h;
import android.os.Parcelable;
import android.content.Intent;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewInfo;
import android.app.Activity;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
import z3.c;
import c2.m;
import e2.e0;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import m5.d;
import qe.d4;
import java.util.ArrayList;
import mg2.p;
import android.os.Handler;
import android.os.Looper;
import cc2.b;
import e2.g;
import com.reddit.listing.model.sort.SortTimeFrame;
import com.reddit.listing.model.sort.SortType;
import java.util.Map;
import java.util.Collections;
import java.util.IdentityHashMap;
import androidx.room.RoomDatabase;
import com.android.billingclient.api.b0;
import com.android.billingclient.api.q;
import android.content.Context;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.ConcurrentHashMap;
import ok.a;
import m5.e;

public final class f implements e
{
    public final int f;
    public Object g;
    public Object h;
    
    public f(final int f) {
        this.f = f;
        if (f == 8) {
            this.g = a.l();
            this.h = a.j();
            return;
        }
        if (f != 12) {
            return;
        }
        this.g = new ConcurrentHashMap();
        this.h = new ReentrantReadWriteLock();
    }
    
    public f(final int f, final Object g, final Object h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public f(final Context g, final q q) {
        this.f = 4;
        this.g = g;
        this.h = new b0(this, q);
    }
    
    public f(final RoomDatabase h) {
        this.f = 1;
        this.g = Collections.newSetFromMap(new IdentityHashMap<Object, Boolean>());
        this.h = h;
    }
    
    public f(final SortType sortType) {
        this.f = 10;
        this(sortType, null);
    }
    
    public f(final SortType g, final SortTimeFrame h) {
        this.f = 10;
        ng2.e.f((Object)g, "sortType");
        this.g = g;
        this.h = h;
    }
    
    public f(final g g) {
        this.f = 0;
        ng2.e.f((Object)g, "rootCoordinates");
        this.g = g;
        this.h = new k();
    }
    
    public f(final Object g) {
        this.f = 13;
        this.g = g;
        this.h = Thread.currentThread();
    }
    
    public f(final String s) {
        this(this.f = 2, s, null);
    }
    
    public f(final Map g) {
        this.f = 11;
        this.h = b.a;
        this.g = g;
    }
    
    public f(final jg.f g) {
        this.f = 7;
        this.h = new Handler(Looper.getMainLooper());
        this.g = g;
    }
    
    public f(final p g) {
        this.f = 9;
        this.g = g;
        this.h = new ArrayList();
    }
    
    public f(final d4 h, final String g) {
        this.f = 6;
        this.h = h;
        this.g = g;
    }
    
    public final void a(final d d) {
        final Object[] array = (Object[])this.h;
        if (array != null) {
            final int length = array.length;
            int i = 0;
            while (i < length) {
                final Object o = array[i];
                ++i;
                if (o == null) {
                    d.bindNull(i);
                }
                else if (o instanceof byte[]) {
                    d.bindBlob(i, (byte[])o);
                }
                else if (o instanceof Float) {
                    d.bindDouble(i, (double)(float)o);
                }
                else if (o instanceof Double) {
                    d.bindDouble(i, (double)o);
                }
                else if (o instanceof Long) {
                    d.bindLong(i, (long)o);
                }
                else if (o instanceof Integer) {
                    d.bindLong(i, (long)(int)o);
                }
                else if (o instanceof Short) {
                    d.bindLong(i, (long)(short)o);
                }
                else if (o instanceof Byte) {
                    d.bindLong(i, (long)(byte)o);
                }
                else if (o instanceof String) {
                    d.bindString(i, (String)o);
                }
                else {
                    if (!(o instanceof Boolean)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Cannot bind ");
                        sb.append(o);
                        sb.append(" at index ");
                        sb.append(i);
                        sb.append(" Supported types: null, byte[], float, double, long, int, short, byte, string");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    long n;
                    if (o) {
                        n = 1L;
                    }
                    else {
                        n = 0L;
                    }
                    d.bindLong(i, n);
                }
            }
        }
    }
    
    public final String b() {
        return (String)this.g;
    }
    
    public final boolean c() {
        final Context context = (Context)this.g;
        final String s = "";
        String packageName;
        if (context != null) {
            packageName = context.getApplicationContext().getPackageName();
        }
        else {
            packageName = "";
        }
        final String s2 = null;
        final boolean b = false;
        String s3 = null;
        Label_0260: {
            try {
                final Class<?> forName = Class.forName("android.os.SystemProperties");
                try {
                    final Method declaredMethod = forName.getDeclaredMethod("get", String.class);
                    final InvocationTargetException ex;
                    zk.a a2 = null;
                    String message = null;
                    Label_0161: {
                        InvocationTargetException ex2 = null;
                        Label_0154: {
                            zk.a a3;
                            try {
                                s3 = (String)declaredMethod.invoke(null, "debug.instabug.apm.app");
                                break Label_0260;
                            }
                            catch (final InvocationTargetException ex) {
                                final zk.a a = (zk.a)this.h;
                                ex2 = ex;
                                a2 = a;
                                if (ex.getMessage() == null) {
                                    break Label_0154;
                                }
                                a3 = a;
                            }
                            catch (final IllegalAccessException ex) {
                                final zk.a a4 = (zk.a)this.h;
                                ex2 = ex;
                                a2 = a4;
                                if (ex.getMessage() == null) {
                                    break Label_0154;
                                }
                                a3 = a4;
                            }
                            message = ex.getMessage();
                            a2 = a3;
                            break Label_0161;
                        }
                        message = "";
                        ex = ex2;
                    }
                    a2.b(message, (Throwable)ex);
                    s3 = s2;
                }
                catch (final NoSuchMethodException ex3) {
                    final zk.a a5 = (zk.a)this.h;
                    String message2;
                    if (ex3.getMessage() != null) {
                        message2 = ex3.getMessage();
                    }
                    else {
                        message2 = "";
                    }
                    a5.b(message2, (Throwable)ex3);
                    s3 = s2;
                }
            }
            catch (final ClassNotFoundException ex4) {
                final zk.a a6 = (zk.a)this.h;
                String message3 = s;
                if (ex4.getMessage() != null) {
                    message3 = ex4.getMessage();
                }
                a6.b(message3, (Throwable)ex4);
                s3 = s2;
            }
        }
        boolean b2 = b;
        if (!packageName.isEmpty()) {
            b2 = b;
            if (packageName.equals(s3)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final void d(final long n, final e2.f f) {
        ng2.e.f((Object)f, "pointerInputNodes");
        Object o = this.h;
        final int i = f.i;
        int j = 0;
        int n2 = 1;
        while (j < i) {
            final e0 e0 = (e0)f.f[j];
            Label_0247: {
                int n3;
                if ((n3 = n2) != 0) {
                    final a1.d<j> a = ((k)o).a;
                    final int h = a.h;
                    Object o2 = null;
                    Label_0139: {
                        if (h > 0) {
                            final Object[] f2 = a.f;
                            ng2.e.d((Object)f2, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                            int n4 = 0;
                            do {
                                o2 = f2[n4];
                                if (ng2.e.a((Object)((j)o2).b, (Object)e0)) {
                                    break Label_0139;
                                }
                            } while (++n4 < h);
                        }
                        o2 = null;
                    }
                    final j k = (j)o2;
                    if (k != null) {
                        k.h = true;
                        if (!k.c.g((Object)new o(n))) {
                            k.c.b((Object)new o(n));
                        }
                        o = k;
                        break Label_0247;
                    }
                    n3 = 0;
                }
                final j l = new j(e0);
                l.c.b((Object)new o(n));
                ((k)o).a.b((Object)l);
                o = l;
                n2 = n3;
            }
            ++j;
        }
    }
    
    public final boolean e(final z1.g g, final boolean b) {
        final boolean a = ((k)this.h).a(g.a, (m)this.g, g, b);
        final boolean b2 = false;
        if (!a) {
            return false;
        }
        final boolean e = ((k)this.h).e(g.a, (m)this.g, g, b);
        if (!((k)this.h).d(g)) {
            final boolean b3 = b2;
            if (!e) {
                return b3;
            }
        }
        return true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        switch (this.f) {
            default: {
                return super.equals(o);
            }
            case 3: {
                final boolean b = o instanceof c;
                boolean b2 = true;
                if (b) {
                    final c c = (c)o;
                    c.getClass();
                    if (this.g == null) {
                        c.getClass();
                        if (this.h == null) {
                            return b2;
                        }
                    }
                }
                b2 = false;
                return b2;
            }
        }
    }
    
    public final Lock f(final String s) {
        if (!((ConcurrentMap)this.g).containsKey(s)) {
            ((ConcurrentMap)this.g).putIfAbsent(s, new ReentrantLock());
        }
        return (Lock)((ConcurrentMap)this.g).get(s);
    }
    
    public final pg.m g(final Activity activity, final ReviewInfo reviewInfo) {
        if (reviewInfo.d()) {
            return pg.e.c((Object)null);
        }
        final Intent intent = new Intent((Context)activity, (Class)PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", (Parcelable)reviewInfo.c());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        final pg.k k = new pg.k();
        intent.putExtra("result_receiver", (Parcelable)new h((Handler)this.h, k, 1));
        activity.startActivity(intent);
        return k.a;
    }
    
    public final void h(final String s) {
        ((ReadWriteLock)this.h).readLock().lock();
        this.f(s).lock();
    }
    
    @Override
    public final int hashCode() {
        switch (this.f) {
            default: {
                return super.hashCode();
            }
            case 3: {
                final Object g = this.g;
                int hashCode = 0;
                int hashCode2;
                if (g == null) {
                    hashCode2 = 0;
                }
                else {
                    hashCode2 = g.hashCode();
                }
                final Object h = this.h;
                if (h != null) {
                    hashCode = h.hashCode();
                }
                return hashCode2 ^ hashCode;
            }
        }
    }
    
    public final pg.m i() {
        final jg.f f = (jg.f)this.g;
        final l c = jg.f.c;
        c.d("requestInAppReview (%s)", f.b);
        pg.m m;
        if (f.a == null) {
            c.b("Play Store app is either not installed or not the official version", new Object[0]);
            m = pg.e.b((zzj)new ReviewException(-1));
        }
        else {
            final pg.k k = new pg.k();
            f.a.b((hg.e)new jg.d(f, k, k), k);
            m = k.a;
        }
        return m;
    }
    
    public final void j(final UserProfileAnalytics$PaneName userProfileAnalytics$PaneName, final kt1.c c) {
        synchronized ((List)this.h) {
            if (c.a()) {
                this.k(c);
                ((p)this.g).invoke((Object)userProfileAnalytics$PaneName, (Object)c);
                final cg2.j a = cg2.j.a;
            }
            else {
                ((List)this.h).add(userProfileAnalytics$PaneName);
            }
        }
    }
    
    public final void k(final kt1.c c) {
        synchronized ((List)this.h) {
            if (((List)this.h).isEmpty()) {
                return;
            }
            if (c.a()) {
                final Iterator iterator = ((List)this.h).iterator();
                while (iterator.hasNext()) {
                    ((p)this.g).invoke(iterator.next(), (Object)c);
                }
                ((List)this.h).clear();
            }
            final cg2.j a = cg2.j.a;
        }
    }
    
    public final void l(final String s) {
        this.f(s).unlock();
        ((ReadWriteLock)this.h).readLock().unlock();
    }
    
    @Override
    public final String toString() {
        switch (this.f) {
            default: {
                return super.toString();
            }
            case 11: {
                return this.g.toString();
            }
            case 5: {
                final String s = (String)this.g;
                final String s2 = (String)this.h;
                return xm2.a.a(u10.o.e(s2, u10.o.e(s, 2)), s, ", ", s2);
            }
            case 3: {
                final StringBuilder t = a.t("Pair{");
                t.append(this.g);
                t.append(" ");
                t.append(this.h);
                t.append("}");
                return t.toString();
            }
        }
    }
}
