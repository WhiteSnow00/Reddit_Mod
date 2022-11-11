// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.request;

import g9.c;

public final class a implements RequestCoordinator, c
{
    public final Object a;
    public final RequestCoordinator b;
    public volatile c c;
    public volatile c d;
    public RequestCoordinator$RequestState e;
    public RequestCoordinator$RequestState f;
    
    public a(final Object a, final RequestCoordinator b) {
        final RequestCoordinator$RequestState cleared = RequestCoordinator$RequestState.CLEARED;
        this.e = cleared;
        this.f = cleared;
        this.a = a;
        this.b = b;
    }
    
    public final boolean a() {
        synchronized (this.a) {
            return this.c.a() || this.d.a();
        }
    }
    
    public final void b(final c c) {
        synchronized (this.a) {
            if (!c.equals(this.d)) {
                this.e = RequestCoordinator$RequestState.FAILED;
                final RequestCoordinator$RequestState f = this.f;
                final RequestCoordinator$RequestState running = RequestCoordinator$RequestState.RUNNING;
                if (f != running) {
                    this.f = running;
                    this.d.j();
                }
                return;
            }
            this.f = RequestCoordinator$RequestState.FAILED;
            final RequestCoordinator b = this.b;
            if (b != null) {
                b.b((c)this);
            }
        }
    }
    
    public final boolean c() {
        synchronized (this.a) {
            final RequestCoordinator$RequestState e = this.e;
            final RequestCoordinator$RequestState cleared = RequestCoordinator$RequestState.CLEARED;
            return e == cleared && this.f == cleared;
        }
    }
    
    public final void clear() {
        synchronized (this.a) {
            final RequestCoordinator$RequestState cleared = RequestCoordinator$RequestState.CLEARED;
            this.e = cleared;
            this.c.clear();
            if (this.f != cleared) {
                this.f = cleared;
                this.d.clear();
            }
        }
    }
    
    public final boolean d() {
        synchronized (this.a) {
            final RequestCoordinator$RequestState e = this.e;
            final RequestCoordinator$RequestState success = RequestCoordinator$RequestState.SUCCESS;
            return e == success || this.f == success;
        }
    }
    
    public final void e(final c c) {
        synchronized (this.a) {
            if (c.equals(this.c)) {
                this.e = RequestCoordinator$RequestState.SUCCESS;
            }
            else if (c.equals(this.d)) {
                this.f = RequestCoordinator$RequestState.SUCCESS;
            }
            final RequestCoordinator b = this.b;
            if (b != null) {
                b.e((c)this);
            }
        }
    }
    
    public final boolean f(final c c) {
        if (c instanceof a) {
            final a a = (a)c;
            if (this.c.f(a.c) && this.d.f(a.d)) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean g(final c c) {
        final Object a = this.a;
        monitorenter(a);
        while (true) {
            try {
                final RequestCoordinator b = this.b;
                final boolean b2 = false;
                final boolean b3 = b == null || b.g((c)this);
                boolean b4 = b2;
                if (b3) {
                    b4 = b2;
                    if (this.k(c)) {
                        b4 = true;
                    }
                }
                monitorexit(a);
                return b4;
                monitorexit(a);
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final RequestCoordinator getRoot() {
        synchronized (this.a) {
            final RequestCoordinator b = this.b;
            Object root;
            if (b != null) {
                root = b.getRoot();
            }
            else {
                root = this;
            }
            return (RequestCoordinator)root;
        }
    }
    
    public final boolean h(final c c) {
        final Object a = this.a;
        monitorenter(a);
        while (true) {
            try {
                final RequestCoordinator b = this.b;
                final boolean b2 = false;
                final boolean b3 = b == null || b.h((c)this);
                boolean b4 = b2;
                if (b3) {
                    b4 = b2;
                    if (this.k(c)) {
                        b4 = true;
                    }
                }
                monitorexit(a);
                return b4;
                monitorexit(a);
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final boolean i(final c c) {
        final Object a = this.a;
        monitorenter(a);
        while (true) {
            try {
                final RequestCoordinator b = this.b;
                final boolean b2 = false;
                final boolean b3 = b == null || b.i((c)this);
                boolean b4 = b2;
                if (b3) {
                    b4 = b2;
                    if (this.k(c)) {
                        b4 = true;
                    }
                }
                monitorexit(a);
                return b4;
                monitorexit(a);
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final boolean isRunning() {
        synchronized (this.a) {
            final RequestCoordinator$RequestState e = this.e;
            final RequestCoordinator$RequestState running = RequestCoordinator$RequestState.RUNNING;
            return e == running || this.f == running;
        }
    }
    
    public final void j() {
        synchronized (this.a) {
            final RequestCoordinator$RequestState e = this.e;
            final RequestCoordinator$RequestState running = RequestCoordinator$RequestState.RUNNING;
            if (e != running) {
                this.e = running;
                this.c.j();
            }
        }
    }
    
    public final boolean k(final c c) {
        return c.equals(this.c) || (this.e == RequestCoordinator$RequestState.FAILED && c.equals(this.d));
    }
    
    public final void pause() {
        synchronized (this.a) {
            final RequestCoordinator$RequestState e = this.e;
            final RequestCoordinator$RequestState running = RequestCoordinator$RequestState.RUNNING;
            if (e == running) {
                this.e = RequestCoordinator$RequestState.PAUSED;
                this.c.pause();
            }
            if (this.f == running) {
                this.f = RequestCoordinator$RequestState.PAUSED;
                this.d.pause();
            }
        }
    }
}
