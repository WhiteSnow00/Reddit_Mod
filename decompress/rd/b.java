// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import java.text.DateFormat;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.accounts.Account;
import android.content.Intent;
import ng.f0;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import ld.i;
import java.util.concurrent.Executor;
import android.util.Log;
import android.os.DeadObjectException;
import java.util.Collections;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import android.os.Bundle;
import android.text.TextUtils;
import yd.a;
import android.os.Looper;
import java.util.ArrayList;
import od.f;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import od.d;
import android.os.IInterface;

public abstract class b<T extends IInterface>
{
    public static final od.d[] H;
    public final int A;
    public final String B;
    public volatile String C;
    public b D;
    public boolean E;
    public volatile a1 F;
    public AtomicInteger G;
    public int f;
    public long g;
    public long h;
    public int i;
    public long j;
    public volatile String k;
    public j1 l;
    public final Context m;
    public final h n;
    public final f o;
    public final u0 p;
    public final Object q;
    public final Object r;
    public k s;
    public c t;
    public T u;
    public final ArrayList<v0<?>> v;
    public x0 w;
    public int x;
    public final a y;
    public final b z;
    
    static {
        H = new od.d[0];
    }
    
    public b(final Context m, final Looper looper, final h1 n, final f o, final int a, final a y, final b z, final String b) {
        this.k = null;
        this.q = new Object();
        this.r = new Object();
        this.v = new ArrayList<v0<?>>();
        this.x = 1;
        this.D = null;
        this.E = false;
        this.F = null;
        this.G = new AtomicInteger(0);
        if (m == null) {
            throw new NullPointerException("Context must not be null");
        }
        this.m = m;
        if (looper == null) {
            throw new NullPointerException("Looper must not be null");
        }
        if (n != null) {
            this.n = n;
            yd.a.T0((Object)o, "API availability must not be null");
            this.o = o;
            this.p = new u0(this, looper);
            this.A = a;
            this.y = y;
            this.z = z;
            this.B = b;
            return;
        }
        throw new NullPointerException("Supervisor must not be null");
    }
    
    public Bundle A() {
        return new Bundle();
    }
    
    public Set<Scope> B() {
        return Collections.emptySet();
    }
    
    public final T C() throws DeadObjectException {
        synchronized (this.q) {
            if (this.x == 5) {
                throw new DeadObjectException();
            }
            if (this.b()) {
                final IInterface u = this.u;
                yd.a.T0((Object)u, "Client is connected but service is null");
                return (T)u;
            }
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }
    
    public abstract String D();
    
    public abstract String E();
    
    public boolean F() {
        return this.m() >= 211700000;
    }
    
    public final void G(final b b) {
        this.i = b.g;
        this.j = System.currentTimeMillis();
    }
    
    public final void K(int x, final T u) {
        boolean b = false;
        if (x == 4 == (u != null)) {
            b = true;
        }
        yd.a.K0(b);
        final Object q = this.q;
        monitorenter(q);
        x0 w;
        j1 l;
        String a;
        int length;
        StringBuilder sb;
        h n;
        String a2;
        h n2 = null;
        String a3 = null;
        String s = null;
        String a4;
        StringBuilder sb2;
        u0 p2;
        h n3 = null;
        String a5 = null;
        String value;
        String concat;
        x0 w2 = null;
        x0 w3 = null;
        String e;
        Object a6;
        boolean f;
        boolean b2;
        Block_19_Outer:Block_18_Outer:
        while (true) {
            Label_0256: {
                try {
                    this.x = x;
                    this.u = u;
                    if (x == 1) {
                        break Block_19_Outer;
                    }
                    if (x != 2 && x != 3) {
                        if (x != 4) {
                            break Label_0716;
                        }
                        yd.a.S0((Object)u);
                        this.h = System.currentTimeMillis();
                        break Label_0716;
                    }
                    else {
                        w = this.w;
                        if (w == null) {
                            break Label_0256;
                        }
                        l = this.l;
                        if (l == null) {
                            break Label_0256;
                        }
                        a = l.a;
                        length = String.valueOf(a).length();
                        x = "com.google.android.gms".length();
                        sb = new StringBuilder(length + 70 + x);
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(a);
                        sb.append(" on ");
                        sb.append("com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        n = this.n;
                        a2 = this.l.a;
                        yd.a.S0((Object)a2);
                        this.l.getClass();
                        if (this.B == null) {
                            this.m.getClass();
                        }
                        break Label_0256;
                    }
                }
                finally {
                    monitorexit(q);
                    while (true) {
                        Label_0462: {
                        Label_0690:
                            while (true) {
                                while (true) {
                                    n2 = this.n;
                                    a3 = this.l.a;
                                    yd.a.S0((Object)a3);
                                    this.l.getClass();
                                    iftrue(Label_0690:)(this.B != null);
                                    Block_20: {
                                        break Block_20;
                                        while (true) {
                                            s = this.m.getClass().getName();
                                            break Label_0462;
                                            a4 = this.l.a;
                                            x = String.valueOf(a4).length();
                                            sb2 = new StringBuilder(x + 34 + "com.google.android.gms".length());
                                            sb2.append("unable to connect to service: ");
                                            sb2.append(a4);
                                            sb2.append(" on ");
                                            sb2.append("com.google.android.gms");
                                            Log.w("GmsClient", sb2.toString());
                                            x = this.G.get();
                                            p2 = this.p;
                                            ((Handler)p2).sendMessage(((Handler)p2).obtainMessage(7, x, -1, (Object)new z0(this, 16)));
                                            break Label_0716;
                                            Label_0409: {
                                                n3 = this.n;
                                            }
                                            a5 = this.l.a;
                                            yd.a.S0((Object)a5);
                                            this.l.getClass();
                                            iftrue(Label_0462:)((s = this.B) != null);
                                            continue Block_18_Outer;
                                        }
                                        value = String.valueOf(this.l.a);
                                        iftrue(Label_0389:)(value.length() == 0);
                                        Block_16: {
                                            break Block_16;
                                            n.b(a2, "com.google.android.gms", 4225, w, this.l.b);
                                            this.G.incrementAndGet();
                                            break Label_0256;
                                        }
                                        concat = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(value);
                                        throw new IllegalStateException(concat);
                                    }
                                    this.m.getClass();
                                    break Label_0690;
                                    w2 = this.w;
                                    iftrue(Label_0716:)(w2 == null);
                                    continue Block_18_Outer;
                                }
                                monitorexit(q);
                                return;
                                w3 = new x0(this, this.G.get());
                                this.w = w3;
                                e = this.E();
                                a6 = rd.h.a;
                                f = this.F();
                                this.l = new j1(e, f);
                                iftrue(Label_0409:)(!f || this.m() >= 17895000);
                                continue;
                            }
                            n2.b(a3, "com.google.android.gms", 4225, w2, this.l.b);
                            this.w = null;
                            continue Block_19_Outer;
                        }
                        b2 = this.l.b;
                        this.z();
                        iftrue(Label_0716:)(n3.c(new e1(4225, a5, "com.google.android.gms", b2), w3, s, null));
                        continue;
                    }
                    Label_0389: {
                        concat = new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ");
                    }
                    throw new IllegalStateException(concat);
                }
            }
            break;
        }
    }
    
    public void a() {
        this.G.incrementAndGet();
        final ArrayList<v0<?>> v = this.v;
        monitorenter(v);
        Label_0074: {
            try {
                for (int size = this.v.size(), i = 0; i < size; ++i) {
                    final v0 v2 = this.v.get(i);
                    synchronized (v2) {
                        v2.a = null;
                        monitorexit(v2);
                    }
                }
                break Label_0074;
            }
            finally {
                monitorexit(v);
                this.v.clear();
                monitorexit(v);
                synchronized (this.r) {
                    this.s = null;
                    monitorexit(this.r);
                    this.K(1, null);
                }
            }
        }
    }
    
    public final boolean b() {
        synchronized (this.q) {
            return this.x == 4;
        }
    }
    
    public final void c(final qd.v0 v0) {
        ((Handler)v0.a.l.s).post((Runnable)new qd.u0(v0));
    }
    
    public boolean d() {
        return this instanceof i;
    }
    
    public final void e(final String k) {
        this.k = k;
        this.a();
    }
    
    public final boolean f() {
        synchronized (this.q) {
            final int x = this.x;
            boolean b = true;
            if (x != 2) {
                b = (x == 3 && b);
            }
            return b;
        }
    }
    
    public boolean g() {
        return false;
    }
    
    public final void k(final String s, FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        fileDescriptor = (FileDescriptor)this.q;
        synchronized (fileDescriptor) {
            final int x = this.x;
            final IInterface u = this.u;
            monitorexit(fileDescriptor);
            fileDescriptor = (FileDescriptor)this.r;
            synchronized (fileDescriptor) {
                final k s2 = this.s;
                monitorexit(fileDescriptor);
                printWriter.append(s).append("mConnectState=");
                if (x != 1) {
                    if (x != 2) {
                        if (x != 3) {
                            if (x != 4) {
                                if (x != 5) {
                                    printWriter.print("UNKNOWN");
                                }
                                else {
                                    printWriter.print("DISCONNECTING");
                                }
                            }
                            else {
                                printWriter.print("CONNECTED");
                            }
                        }
                        else {
                            printWriter.print("LOCAL_CONNECTING");
                        }
                    }
                    else {
                        printWriter.print("REMOTE_CONNECTING");
                    }
                }
                else {
                    printWriter.print("DISCONNECTED");
                }
                printWriter.append(" mService=");
                if (u == null) {
                    printWriter.append("null");
                }
                else {
                    printWriter.append(this.D()).append("@").append(Integer.toHexString(System.identityHashCode(u.asBinder())));
                }
                printWriter.append(" mServiceBroker=");
                if (s2 == null) {
                    printWriter.println("null");
                }
                else {
                    printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((IInterface)s2).asBinder())));
                }
                fileDescriptor = (FileDescriptor)new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
                if (this.h > 0L) {
                    final PrintWriter append = printWriter.append(s).append("lastConnectedTime=");
                    final long h = this.h;
                    final String format = ((DateFormat)fileDescriptor).format(new Date(h));
                    final StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
                    sb.append(h);
                    sb.append(" ");
                    sb.append(format);
                    append.println(sb.toString());
                }
                if (this.g > 0L) {
                    printWriter.append(s).append("lastSuspendedCause=");
                    final int f = this.f;
                    if (f != 1) {
                        if (f != 2) {
                            if (f != 3) {
                                printWriter.append(String.valueOf(f));
                            }
                            else {
                                printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
                            }
                        }
                        else {
                            printWriter.append("CAUSE_NETWORK_LOST");
                        }
                    }
                    else {
                        printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                    }
                    final PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
                    final long g = this.g;
                    final String format2 = ((DateFormat)fileDescriptor).format(new Date(g));
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
                    sb2.append(g);
                    sb2.append(" ");
                    sb2.append(format2);
                    append2.println(sb2.toString());
                }
                if (this.j > 0L) {
                    printWriter.append(s).append("lastFailedStatus=").append(f0.i2(this.i));
                    final PrintWriter append3 = printWriter.append(" lastFailedTime=");
                    final long j = this.j;
                    final String format3 = ((DateFormat)fileDescriptor).format(new Date(j));
                    fileDescriptor = (FileDescriptor)new StringBuilder(String.valueOf(format3).length() + 21);
                    ((StringBuilder)fileDescriptor).append(j);
                    ((StringBuilder)fileDescriptor).append(" ");
                    ((StringBuilder)fileDescriptor).append(format3);
                    append3.println(((StringBuilder)fileDescriptor).toString());
                }
            }
        }
    }
    
    public int m() {
        return od.f.a;
    }
    
    public final void n(final c t) {
        if (t != null) {
            this.t = t;
            this.K(2, null);
            return;
        }
        throw new NullPointerException("Connection progress callbacks cannot be null.");
    }
    
    public Intent o() {
        throw new UnsupportedOperationException("Not a sign in API");
    }
    
    public final void q(final j ex, final Set<Scope> set) {
        final Bundle a = this.A();
        final rd.f f = new rd.f(this.A, this.C);
        f.i = this.m.getPackageName();
        f.l = a;
        if (set != null) {
            f.k = (Scope[])set.toArray((Object[])new Scope[set.size()]);
        }
        if (this.g()) {
            Account x;
            if ((x = this.x()) == null) {
                x = new Account("<<default account>>", "com.google");
            }
            f.m = x;
            if (ex != null) {
                f.j = ((IInterface)ex).asBinder();
            }
        }
        f.n = b.H;
        f.o = this.y();
        try {
            synchronized (this.r) {
                final k s = this.s;
                if (s != null) {
                    s.f1(new w0(this, this.G.get()), f);
                }
                else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        }
        catch (final RuntimeException ex) {
            goto Label_0204;
        }
        catch (final RemoteException ex2) {}
        catch (final SecurityException ex3) {
            throw ex3;
        }
        catch (final DeadObjectException ex4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", (Throwable)ex4);
            final u0 p2 = this.p;
            ((Handler)p2).sendMessage(((Handler)p2).obtainMessage(6, this.G.get(), 3));
        }
    }
    
    public final String r() {
        if (this.b() && this.l != null) {
            return "com.google.android.gms";
        }
        throw new RuntimeException("Failed to connect when checking package");
    }
    
    public final boolean s() {
        return true;
    }
    
    public final od.d[] t() {
        final a1 f = this.F;
        if (f == null) {
            return null;
        }
        return f.g;
    }
    
    public final String u() {
        return this.k;
    }
    
    public final void v() {
        final int c = this.o.c(this.m, this.m());
        if (c != 0) {
            this.K(1, null);
            this.t = (c)new d();
            final u0 p = this.p;
            ((Handler)p).sendMessage(((Handler)p).obtainMessage(3, this.G.get(), c, (Object)null));
            return;
        }
        this.n((c)new d());
    }
    
    public abstract T w(final IBinder p0);
    
    public Account x() {
        return null;
    }
    
    public od.d[] y() {
        return b.H;
    }
    
    public void z() {
    }
    
    public interface a
    {
        void b();
        
        void k(final int p0);
    }
    
    public interface b
    {
        void m(final od.b p0);
    }
    
    public interface c
    {
        void a(final b p0);
    }
    
    public final class d implements c
    {
        @Override
        public final void a(final b b) {
            if (b.j()) {
                final b a = b.this;
                a.q(null, a.B());
                return;
            }
            final b z = b.this.z;
            if (z != null) {
                z.m(b);
            }
        }
    }
}
