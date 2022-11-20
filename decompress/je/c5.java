// 
// Decompiled by Procyon v0.6.0
// 

package je;

import java.util.RandomAccess;
import java.util.List;
import java.util.Collection;
import java.util.AbstractList;

public abstract class c5 extends AbstractList implements h6
{
    public boolean f;
    
    public c5() {
        this.f = true;
    }
    
    public final void a() {
        if (this.f) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean add(final Object o) {
        this.a();
        return super.add(o);
    }
    
    @Override
    public boolean addAll(final int n, final Collection collection) {
        this.a();
        return super.addAll(n, collection);
    }
    
    public boolean addAll(final Collection collection) {
        this.a();
        return super.addAll(collection);
    }
    
    @Override
    public void clear() {
        this.a();
        super.clear();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof List)) {
            return false;
        }
        if (!(o instanceof RandomAccess)) {
            return super.equals(o);
        }
        final List list = (List)o;
        final int size = this.size();
        if (size == list.size()) {
            for (int i = 0; i < size; ++i) {
                if (!this.get(i).equals(list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int size = this.size();
        int n = 1;
        for (int i = 0; i < size; ++i) {
            n = n * 31 + this.get(i).hashCode();
        }
        return n;
    }
    
    public final void r() {
        this.f = false;
    }
    
    @Override
    public abstract Object remove(final int p0);
    
    public final boolean remove(final Object o) {
        this.a();
        final int index = this.indexOf(o);
        if (index == -1) {
            return false;
        }
        this.remove(index);
        return true;
    }
    
    public final boolean removeAll(final Collection collection) {
        this.a();
        return super.removeAll(collection);
    }
    
    public final boolean retainAll(final Collection collection) {
        this.a();
        return super.retainAll(collection);
    }
    
    public final boolean s() {
        return this.f;
    }
}
