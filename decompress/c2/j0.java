// 
// Decompiled by Procyon v0.6.0
// 

package c2;

import ah2.c;
import java.util.function.Predicate;
import java.util.Iterator;
import ah2.f;
import java.util.LinkedHashSet;
import java.util.Set;
import bh2.a;
import java.util.Collection;

public interface j0
{
    void h(final a p0);
    
    boolean i(final Object p0, final Object p1);
    
    public static final class a implements Collection<Object>, bh2.a
    {
        public final Set<Object> f;
        
        public a(final int n) {
            final LinkedHashSet f = new LinkedHashSet();
            this.f = f;
        }
        
        @Override
        public final boolean add(final Object o) {
            return this.f.add(o);
        }
        
        @Override
        public final boolean addAll(final Collection<?> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final void clear() {
            this.f.clear();
        }
        
        @Override
        public final boolean contains(final Object o) {
            return this.f.contains(o);
        }
        
        @Override
        public final boolean containsAll(final Collection<?> collection) {
            ah2.f.f((Object)collection, "elements");
            return this.f.containsAll(collection);
        }
        
        @Override
        public final boolean isEmpty() {
            return this.f.isEmpty();
        }
        
        @Override
        public final Iterator<Object> iterator() {
            return this.f.iterator();
        }
        
        @Override
        public final boolean remove(final Object o) {
            return this.f.remove(o);
        }
        
        @Override
        public final boolean removeAll(final Collection<?> collection) {
            ah2.f.f((Object)collection, "slotIds");
            return this.f.remove(collection);
        }
        
        @Override
        public final boolean removeIf(final Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public final boolean retainAll(final Collection<?> collection) {
            ah2.f.f((Object)collection, "slotIds");
            return this.f.retainAll(collection);
        }
        
        @Override
        public final int size() {
            return this.f.size();
        }
        
        @Override
        public final Object[] toArray() {
            return c.G0((Collection)this);
        }
        
        @Override
        public final <T> T[] toArray(final T[] array) {
            ah2.f.f((Object)array, "array");
            return (T[])c.H0((Collection)this, (Object[])array);
        }
    }
}
