// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.internal.util;

import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class VolatileSizeArrayList<T> extends AtomicInteger implements List<T>, RandomAccess
{
    private static final long serialVersionUID = 3972397474470203923L;
    public final ArrayList<T> list;
    
    public VolatileSizeArrayList() {
        this.list = new ArrayList<T>();
    }
    
    public VolatileSizeArrayList(final int n) {
        this.list = new ArrayList<T>(n);
    }
    
    @Override
    public void add(final int n, final T t) {
        this.list.add(n, t);
        this.lazySet(this.list.size());
    }
    
    @Override
    public boolean add(final T t) {
        final boolean add = this.list.add(t);
        this.lazySet(this.list.size());
        return add;
    }
    
    @Override
    public boolean addAll(final int n, final Collection<? extends T> collection) {
        final boolean addAll = this.list.addAll(n, collection);
        this.lazySet(this.list.size());
        return addAll;
    }
    
    @Override
    public boolean addAll(final Collection<? extends T> collection) {
        final boolean addAll = this.list.addAll(collection);
        this.lazySet(this.list.size());
        return addAll;
    }
    
    @Override
    public void clear() {
        this.list.clear();
        this.lazySet(0);
    }
    
    @Override
    public boolean contains(final Object o) {
        return this.list.contains(o);
    }
    
    @Override
    public boolean containsAll(final Collection<?> collection) {
        return this.list.containsAll(collection);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof VolatileSizeArrayList) {
            return this.list.equals(((VolatileSizeArrayList)o).list);
        }
        return this.list.equals(o);
    }
    
    @Override
    public T get(final int n) {
        return this.list.get(n);
    }
    
    @Override
    public int hashCode() {
        return this.list.hashCode();
    }
    
    @Override
    public int indexOf(final Object o) {
        return this.list.indexOf(o);
    }
    
    @Override
    public boolean isEmpty() {
        return this.get() == 0;
    }
    
    @Override
    public Iterator<T> iterator() {
        return this.list.iterator();
    }
    
    @Override
    public int lastIndexOf(final Object o) {
        return this.list.lastIndexOf(o);
    }
    
    @Override
    public ListIterator<T> listIterator() {
        return this.list.listIterator();
    }
    
    @Override
    public ListIterator<T> listIterator(final int n) {
        return this.list.listIterator(n);
    }
    
    @Override
    public T remove(final int n) {
        final T remove = this.list.remove(n);
        this.lazySet(this.list.size());
        return remove;
    }
    
    @Override
    public boolean remove(final Object o) {
        final boolean remove = this.list.remove(o);
        this.lazySet(this.list.size());
        return remove;
    }
    
    @Override
    public boolean removeAll(final Collection<?> collection) {
        final boolean removeAll = this.list.removeAll(collection);
        this.lazySet(this.list.size());
        return removeAll;
    }
    
    @Override
    public boolean retainAll(final Collection<?> collection) {
        final boolean retainAll = this.list.retainAll(collection);
        this.lazySet(this.list.size());
        return retainAll;
    }
    
    @Override
    public T set(final int n, final T t) {
        return this.list.set(n, t);
    }
    
    @Override
    public int size() {
        return this.get();
    }
    
    @Override
    public List<T> subList(final int n, final int n2) {
        return this.list.subList(n, n2);
    }
    
    @Override
    public Object[] toArray() {
        return this.list.toArray();
    }
    
    @Override
    public <E> E[] toArray(final E[] array) {
        return this.list.toArray(array);
    }
    
    @Override
    public String toString() {
        return this.list.toString();
    }
}
