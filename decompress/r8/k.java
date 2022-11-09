// 
// Decompiled by Procyon v0.6.0
// 

package r8;

import m9.d;
import m9.a;

public final class k<Z> implements l<Z>, d
{
    public static final c j;
    public final m9.d.a f;
    public l<Z> g;
    public boolean h;
    public boolean i;
    
    static {
        j = m9.a.a(20, (a.b)new b<k<?>>() {
            @Override
            public final Object create() {
                return new k();
            }
        });
    }
    
    public k() {
        this.f = new m9.d.a();
    }
    
    @Override
    public final m9.d.a a() {
        return this.f;
    }
    
    public final void b() {
        synchronized (this) {
            this.f.a();
            if (this.h) {
                this.h = false;
                if (this.i) {
                    this.recycle();
                }
                return;
            }
            throw new IllegalStateException("Already unlocked");
        }
    }
    
    @Override
    public final Z get() {
        return this.g.get();
    }
    
    @Override
    public final Class<Z> getResourceClass() {
        return this.g.getResourceClass();
    }
    
    @Override
    public final int getSize() {
        return this.g.getSize();
    }
    
    @Override
    public final void recycle() {
        synchronized (this) {
            this.f.a();
            this.i = true;
            if (!this.h) {
                this.g.recycle();
                this.g = null;
                k.j.b(this);
            }
        }
    }
}
