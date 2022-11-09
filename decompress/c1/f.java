// 
// Decompiled by Procyon v0.6.0
// 

package c1;

import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;

public final class f<T> extends a<T>
{
    public final PersistentVectorBuilder<T> h;
    public int i;
    public i<? extends T> j;
    public int k;
    
    public f(final PersistentVectorBuilder<T> h, final int n) {
        ah2.f.f((Object)h, "builder");
        super(n, h.size());
        this.h = h;
        this.i = h.c();
        this.k = -1;
        this.b();
    }
    
    public final void a() {
        if (this.i == this.h.c()) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public final void add(final T t) {
        this.a();
        this.h.add(super.f, t);
        ++super.f;
        super.g = this.h.size();
        this.i = this.h.c();
        this.k = -1;
        this.b();
    }
    
    public final void b() {
        final PersistentVectorBuilder<T> h = this.h;
        final Object[] k = h.k;
        if (k == null) {
            this.j = null;
            return;
        }
        final int g = h.size() - 1 & 0xFFFFFFE0;
        int f;
        if ((f = super.f) > g) {
            f = g;
        }
        final int h2 = this.h.i / 5 + 1;
        final i<? extends T> j = this.j;
        if (j == null) {
            this.j = (i<? extends T>)new i<T>(k, f, g, h2);
        }
        else {
            ah2.f.c((Object)j);
            j.f = f;
            j.g = g;
            if (j.i.length < (j.h = h2)) {
                j.i = new Object[h2];
            }
            final Object[] i = j.i;
            boolean l = false;
            i[0] = k;
            if (f == g) {
                l = true;
            }
            j.b(f - ((j.j = l) ? 1 : 0), 1);
        }
    }
    
    @Override
    public final T next() {
        this.a();
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        final int f = super.f;
        this.k = f;
        final i<? extends T> j = this.j;
        if (j == null) {
            final Object[] l = this.h.l;
            super.f = f + 1;
            return (T)l[f];
        }
        if (j.hasNext()) {
            ++super.f;
            return (T)j.next();
        }
        return (T)this.h.l[super.f++ - j.g];
    }
    
    @Override
    public final T previous() {
        this.a();
        if (!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        final int f = super.f;
        final int n = f - 1;
        this.k = n;
        final i<? extends T> j = this.j;
        if (j == null) {
            final Object[] l = this.h.l;
            super.f = n;
            return (T)l[n];
        }
        final int g = j.g;
        if (f > g) {
            final Object[] i = this.h.l;
            super.f = n;
            return (T)i[n - g];
        }
        super.f = n;
        return (T)j.previous();
    }
    
    @Override
    public final void remove() {
        this.a();
        final int k = this.k;
        if (k != -1) {
            this.h.remove(k);
            final int i = this.k;
            if (i < super.f) {
                super.f = i;
            }
            super.g = this.h.size();
            this.i = this.h.c();
            this.k = -1;
            this.b();
            return;
        }
        throw new IllegalStateException();
    }
    
    @Override
    public final void set(final T t) {
        this.a();
        final int k = this.k;
        if (k != -1) {
            this.h.set(k, t);
            this.i = this.h.c();
            this.b();
            return;
        }
        throw new IllegalStateException();
    }
}
