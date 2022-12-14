// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.common.api.internal;

import od.d;
import android.util.Pair;
import android.os.Message;
import ee.f;
import mg.d0;
import android.util.Log;
import od.b;
import pd.a1;
import android.os.Looper;
import pd.z1;
import com.google.android.gms.common.api.Status;
import pd.n1;
import java.util.concurrent.atomic.AtomicReference;
import od.a$a;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.lang.ref.WeakReference;
import pd.y1;
import com.google.android.gms.common.annotation.KeepName;
import od.a;
import od.c;

@KeepName
public abstract class BasePendingResult<R extends c> extends od.a<R>
{
    public static final y1 l;
    public final Object a;
    public final WeakReference<com.google.android.gms.common.api.c> b;
    public final CountDownLatch c;
    public final ArrayList<a$a> d;
    public final AtomicReference<n1> e;
    public R f;
    public Status g;
    public volatile boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    @KeepName
    private z1 mResultGuardian;
    
    static {
        l = new y1(0);
    }
    
    @Deprecated
    public BasePendingResult() {
        this.a = new Object();
        this.c = new CountDownLatch(1);
        this.d = new ArrayList<a$a>();
        this.e = new AtomicReference<n1>();
        this.k = false;
        new a(Looper.getMainLooper());
        this.b = new WeakReference<com.google.android.gms.common.api.c>(null);
    }
    
    public BasePendingResult(final a1 a1) {
        this.a = new Object();
        this.c = new CountDownLatch(1);
        this.d = new ArrayList<a$a>();
        this.e = new AtomicReference<n1>();
        this.k = false;
        Looper looper;
        if (a1 != null) {
            looper = a1.g.f;
        }
        else {
            looper = Looper.getMainLooper();
        }
        new a(looper);
        this.b = new WeakReference<com.google.android.gms.common.api.c>((com.google.android.gms.common.api.c)a1);
    }
    
    public static void k(final c c) {
        if (c instanceof b) {
            try {
                ((b)c).release();
            }
            catch (final RuntimeException ex) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(c)), (Throwable)ex);
            }
        }
    }
    
    public /* bridge */ void a(final Status status) {
        this.g(status);
    }
    
    public final void b(final a$a a$a) {
        synchronized (this.a) {
            if (this.f()) {
                a$a.a(this.g);
            }
            else {
                this.d.add(a$a);
            }
        }
    }
    
    public final void c() {
        synchronized (this.a) {
            if (!this.i && !this.h) {
                k(this.f);
                this.i = true;
                this.i(this.d(Status.o));
            }
        }
    }
    
    public abstract R d(final Status p0);
    
    @Deprecated
    public final void e(final Status status) {
        synchronized (this.a) {
            if (!this.f()) {
                this.g(this.d(status));
                this.j = true;
            }
        }
    }
    
    public final boolean f() {
        return this.c.getCount() == 0L;
    }
    
    public final void g(final R r) {
        synchronized (this.a) {
            if (!this.j && !this.i) {
                this.f();
                d0.D(this.f() ^ true, "Results have already been set");
                d0.D(this.h ^ true, "Result has already been consumed");
                this.i(r);
                return;
            }
            k(r);
        }
    }
    
    public final R h() {
        Object a = this.a;
        synchronized (a) {
            d0.D(this.h ^ true, "Result has already been consumed.");
            d0.D(this.f(), "Result is not ready.");
            final c f = this.f;
            this.f = null;
            this.h = true;
            monitorexit(a);
            a = this.e.getAndSet(null);
            if (a != null) {
                ((n1)a).a.a.remove(this);
            }
            d0.y((Object)f);
            return (R)f;
        }
    }
    
    public final void i(final R f) {
        this.f = f;
        this.g = f.getStatus();
        this.c.countDown();
        if (!this.i) {
            if (this.f instanceof b) {
                this.mResultGuardian = new z1(this);
            }
        }
        final ArrayList<a$a> d = this.d;
        for (int size = d.size(), i = 0; i < size; ++i) {
            ((a$a)d.get(i)).a(this.g);
        }
        this.d.clear();
    }
    
    public final void j() {
        this.k = (this.k || ((ThreadLocal<Boolean>)BasePendingResult.l).get());
    }
    
    public static final class a<R extends c> extends f
    {
        public a(final Looper looper) {
            super(looper);
        }
        
        public final void handleMessage(Message message) {
            final int what = message.what;
            if (what != 1) {
                if (what != 2) {
                    final StringBuilder sb = new StringBuilder(45);
                    sb.append("Don't know how to handle message: ");
                    sb.append(what);
                    Log.wtf("BasePendingResult", sb.toString(), (Throwable)new Exception());
                    return;
                }
                ((BasePendingResult)message.obj).e(Status.n);
            }
            else {
                final Pair pair = (Pair)message.obj;
                final d d = (d)pair.first;
                message = (Message)pair.second;
                try {
                    d.a((c)message);
                }
                catch (final RuntimeException ex) {
                    BasePendingResult.k((c)message);
                    throw ex;
                }
            }
        }
    }
}
