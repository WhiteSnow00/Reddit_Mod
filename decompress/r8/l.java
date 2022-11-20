// 
// Decompiled by Procyon v0.6.0
// 

package r8;

import m9.a;
import m9.a$b;
import m9.d$a;
import m9.a$c;
import m9.a$d;

public final class l<Z> implements m<Z>, a$d
{
    public static final a$c j;
    public final d$a f;
    public m<Z> g;
    public boolean h;
    public boolean i;
    
    static {
        j = a.a(20, (a$b)new a$b<l<?>>() {
            public final Object create() {
                return new l();
            }
        });
    }
    
    public l() {
        this.f = new d$a();
    }
    
    public final d$a a() {
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
                l.j.b((Object)this);
            }
        }
    }
}
