// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.request;

import g9.c;

public final class b implements RequestCoordinator, c
{
    public final RequestCoordinator a;
    public final Object b;
    public volatile c c;
    public volatile c d;
    public RequestCoordinator$RequestState e;
    public RequestCoordinator$RequestState f;
    public boolean g;
    
    public b(final Object b, final RequestCoordinator a) {
        final RequestCoordinator$RequestState cleared = RequestCoordinator$RequestState.CLEARED;
        this.e = cleared;
        this.f = cleared;
        this.b = b;
        this.a = a;
    }
    
    public final boolean a() {
        synchronized (this.b) {
            return this.d.a() || this.c.a();
        }
    }
    
    public final void b(final c c) {
        synchronized (this.b) {
            if (!c.equals(this.c)) {
                this.f = RequestCoordinator$RequestState.FAILED;
                return;
            }
            this.e = RequestCoordinator$RequestState.FAILED;
            final RequestCoordinator a = this.a;
            if (a != null) {
                a.b((c)this);
            }
        }
    }
    
    public final boolean c() {
        synchronized (this.b) {
            return this.e == RequestCoordinator$RequestState.CLEARED;
        }
    }
    
    public final void clear() {
        synchronized (this.b) {
            this.g = false;
            final RequestCoordinator$RequestState cleared = RequestCoordinator$RequestState.CLEARED;
            this.e = cleared;
            this.f = cleared;
            this.d.clear();
            this.c.clear();
        }
    }
    
    public final boolean d() {
        synchronized (this.b) {
            return this.e == RequestCoordinator$RequestState.SUCCESS;
        }
    }
    
    public final void e(final c c) {
        synchronized (this.b) {
            if (c.equals(this.d)) {
                this.f = RequestCoordinator$RequestState.SUCCESS;
                return;
            }
            this.e = RequestCoordinator$RequestState.SUCCESS;
            final RequestCoordinator a = this.a;
            if (a != null) {
                a.e((c)this);
            }
            if (!this.f.isComplete()) {
                this.d.clear();
            }
        }
    }
    
    public final boolean f(final c c) {
        if (c instanceof b) {
            final b b = (b)c;
            if (this.c == null) {
                if (b.c != null) {
                    return false;
                }
            }
            else if (!this.c.f(b.c)) {
                return false;
            }
            if ((this.d != null) ? this.d.f(b.d) : (b.d == null)) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean g(final c c) {
        final Object b = this.b;
        monitorenter(b);
        while (true) {
            try {
                final RequestCoordinator a = this.a;
                final boolean b2 = false;
                final boolean b3 = a == null || a.g((c)this);
                boolean b4 = b2;
                if (b3) {
                    b4 = b2;
                    if (c.equals(this.c)) {
                        b4 = b2;
                        if (this.e != RequestCoordinator$RequestState.PAUSED) {
                            b4 = true;
                        }
                    }
                }
                monitorexit(b);
                return b4;
                monitorexit(b);
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final RequestCoordinator getRoot() {
        synchronized (this.b) {
            final RequestCoordinator a = this.a;
            Object root;
            if (a != null) {
                root = a.getRoot();
            }
            else {
                root = this;
            }
            return (RequestCoordinator)root;
        }
    }
    
    public final boolean h(final c c) {
        final Object b = this.b;
        monitorenter(b);
        while (true) {
            try {
                final RequestCoordinator a = this.a;
                final boolean b2 = false;
                final boolean b3 = a == null || a.h((c)this);
                boolean b4 = b2;
                Label_0078: {
                    if (b3) {
                        if (!c.equals(this.c)) {
                            b4 = b2;
                            if (this.e == RequestCoordinator$RequestState.SUCCESS) {
                                break Label_0078;
                            }
                        }
                        b4 = true;
                    }
                }
                monitorexit(b);
                return b4;
                monitorexit(b);
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final boolean i(final c c) {
        final Object b = this.b;
        monitorenter(b);
        while (true) {
            try {
                final RequestCoordinator a = this.a;
                final boolean b2 = false;
                final boolean b3 = a == null || a.i((c)this);
                boolean b4 = b2;
                if (b3) {
                    b4 = b2;
                    if (c.equals(this.c)) {
                        b4 = b2;
                        if (!this.a()) {
                            b4 = true;
                        }
                    }
                }
                monitorexit(b);
                return b4;
                monitorexit(b);
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final boolean isRunning() {
        synchronized (this.b) {
            return this.e == RequestCoordinator$RequestState.RUNNING;
        }
    }
    
    public final void j() {
        synchronized (this.b) {
            this.g = true;
            try {
                if (this.e != RequestCoordinator$RequestState.SUCCESS) {
                    final RequestCoordinator$RequestState f = this.f;
                    final RequestCoordinator$RequestState running = RequestCoordinator$RequestState.RUNNING;
                    if (f != running) {
                        this.f = running;
                        this.d.j();
                    }
                }
                if (this.g) {
                    final RequestCoordinator$RequestState e = this.e;
                    final RequestCoordinator$RequestState running2 = RequestCoordinator$RequestState.RUNNING;
                    if (e != running2) {
                        this.e = running2;
                        this.c.j();
                    }
                }
            }
            finally {
                this.g = false;
            }
        }
    }
    
    public final void pause() {
        synchronized (this.b) {
            if (!this.f.isComplete()) {
                this.f = RequestCoordinator$RequestState.PAUSED;
                this.d.pause();
            }
            if (!this.e.isComplete()) {
                this.e = RequestCoordinator$RequestState.PAUSED;
                this.c.pause();
            }
        }
    }
}
