// 
// Decompiled by Procyon v0.6.0
// 

package i1;

import java.util.ConcurrentModificationException;
import ng2.e;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import og2.a;
import java.util.ListIterator;

public final class q<T> implements ListIterator<T>, a
{
    public final SnapshotStateList<T> f;
    public int g;
    public int h;
    
    public q(final SnapshotStateList<T> f, final int n) {
        e.f((Object)f, "list");
        this.f = f;
        this.g = n - 1;
        this.h = f.c();
    }
    
    public final void a() {
        if (this.f.c() == this.h) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    @Override
    public final void add(final T t) {
        this.a();
        this.f.add(this.g + 1, (Object)t);
        ++this.g;
        this.h = this.f.c();
    }
    
    @Override
    public final boolean hasNext() {
        final int g = this.g;
        final int size = this.f.size();
        boolean b = true;
        if (g >= size - 1) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final boolean hasPrevious() {
        return this.g >= 0;
    }
    
    @Override
    public final T next() {
        this.a();
        final int g = this.g + 1;
        n.a(g, this.f.size());
        final Object value = this.f.get(g);
        this.g = g;
        return (T)value;
    }
    
    @Override
    public final int nextIndex() {
        return this.g + 1;
    }
    
    @Override
    public final T previous() {
        this.a();
        n.a(this.g, this.f.size());
        final Object value = this.f.get(this.g);
        --this.g;
        return (T)value;
    }
    
    @Override
    public final int previousIndex() {
        return this.g;
    }
    
    @Override
    public final void remove() {
        this.a();
        this.f.remove(this.g);
        --this.g;
        this.h = this.f.c();
    }
    
    @Override
    public final void set(final T t) {
        this.a();
        this.f.set(this.g, (Object)t);
        this.h = this.f.c();
    }
}
