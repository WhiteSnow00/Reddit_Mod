// 
// Decompiled by Procyon v0.6.0
// 

package com.bumptech.glide.load.engine;

import ml0.a;
import o8.d;
import q8.l;

public final class g<Z> implements l<Z>
{
    public final boolean f;
    public final boolean g;
    public final l<Z> h;
    public final a i;
    public final d j;
    public int k;
    public boolean l;
    
    public g(final l<Z> h, final boolean f, final boolean g, final d j, final a i) {
        ml0.a.l((Object)h);
        this.h = h;
        this.f = f;
        this.g = g;
        this.j = j;
        ml0.a.l((Object)i);
        this.i = i;
    }
    
    public final void a() {
        synchronized (this) {
            if (!this.l) {
                ++this.k;
                return;
            }
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }
    
    public final void b() {
        synchronized (this) {
            int k = this.k;
            if (k > 0) {
                boolean b = true;
                --k;
                if ((this.k = k) != 0) {
                    b = false;
                }
                monitorexit(this);
                if (b) {
                    this.i.a(this.j, this);
                }
                return;
            }
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        }
    }
    
    public final Z get() {
        return (Z)this.h.get();
    }
    
    public final Class<Z> getResourceClass() {
        return this.h.getResourceClass();
    }
    
    public final int getSize() {
        return this.h.getSize();
    }
    
    public final void recycle() {
        synchronized (this) {
            if (this.k > 0) {
                throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
            }
            if (!this.l) {
                this.l = true;
                if (this.g) {
                    this.h.recycle();
                }
                return;
            }
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }
    
    @Override
    public final String toString() {
        synchronized (this) {
            final StringBuilder sb = new StringBuilder();
            sb.append("EngineResource{isMemoryCacheable=");
            sb.append(this.f);
            sb.append(", listener=");
            sb.append(this.i);
            sb.append(", key=");
            sb.append(this.j);
            sb.append(", acquired=");
            sb.append(this.k);
            sb.append(", isRecycled=");
            sb.append(this.l);
            sb.append(", resource=");
            sb.append(this.h);
            sb.append('}');
            return sb.toString();
        }
    }
    
    public interface a
    {
        void a(final d p0, final g<?> p1);
    }
}
