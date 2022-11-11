// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import ec2.a;
import java.util.concurrent.TimeUnit;
import yc2.c;
import java.util.concurrent.atomic.AtomicBoolean;

public final class s4
{
    public final AtomicBoolean a;
    public final AtomicBoolean b;
    public final c c;
    public final long d;
    public long e;
    public a f;
    
    public s4(final long d, final long e, final boolean b, final a f, final Object o) {
        this.d = d;
        this.e = e;
        this.f = f;
        this.a = new AtomicBoolean(false);
        this.b = new AtomicBoolean(b);
        this.c = new c();
    }
    
    public final void a() {
        this.e = this.e;
        if (this.a.getAndSet(false)) {
            this.c(false);
        }
        this.b();
    }
    
    public final void b() {
        synchronized (this) {
            if (this.f == null) {
                throw new NullPointerException("callback must Non null");
            }
            if (this.a.get()) {
                return;
            }
            this.c.scheduleAtFixedRate(new Runnable() {
                public final /* synthetic */ s4 f;
                
                @Override
                public final void run() {
                    final a f = this.f.f;
                    if (f != null) {
                        f.a();
                    }
                    if (!this.f.b.get()) {
                        this.f.c(false);
                    }
                    this.f.a.set(false);
                }
            }, this.d, this.e, TimeUnit.MILLISECONDS);
            this.a.compareAndSet(false, true);
        }
    }
    
    public final void c(final boolean b) {
        this.a.set(false);
        ec2.a.b("__ TimeoutScheduler::cancelAll(%s)", new Object[] { b });
        this.c.c(b);
    }
    
    public interface a
    {
        void a();
    }
}
