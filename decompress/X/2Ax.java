// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import kotlin.jvm.internal.n;
import java.util.Collections;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class 2Ax<V> implements List<V>, QgK
{
    public final /* synthetic */ List LIZ;
    
    static {
        Covode.recordClassIndex(1822);
    }
    
    public 2Ax(final boolean b) {
        List<Object> synchronizedList;
        if (b) {
            synchronizedList = Collections.synchronizedList(new ArrayList<Object>());
            n.LIZ((Object)synchronizedList, "");
        }
        else {
            synchronizedList = new ArrayList<Object>();
        }
        this.LIZ = synchronizedList;
    }
    
    @Override
    public final void add(final int n, final V v) {
        this.LIZ.add(n, v);
    }
    
    @Override
    public final boolean add(final V v) {
        return this.LIZ.add(v);
    }
    
    @Override
    public final boolean addAll(final int n, final Collection<? extends V> collection) {
        CTM.LIZ((Object)collection);
        return this.LIZ.addAll(n, collection);
    }
    
    @Override
    public final boolean addAll(final Collection<? extends V> collection) {
        CTM.LIZ((Object)collection);
        return this.LIZ.addAll(collection);
    }
    
    @Override
    public final void clear() {
        this.LIZ.clear();
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.LIZ.contains(o);
    }
    
    @Override
    public final boolean containsAll(final Collection<?> collection) {
        CTM.LIZ((Object)collection);
        return this.LIZ.containsAll(collection);
    }
    
    @Override
    public final V get(final int n) {
        return this.LIZ.get(n);
    }
    
    @Override
    public final int indexOf(final Object o) {
        return this.LIZ.indexOf(o);
    }
    
    @Override
    public final boolean isEmpty() {
        return this.LIZ.isEmpty();
    }
    
    @Override
    public final Iterator<V> iterator() {
        return this.LIZ.iterator();
    }
    
    @Override
    public final int lastIndexOf(final Object o) {
        return this.LIZ.lastIndexOf(o);
    }
    
    @Override
    public final ListIterator<V> listIterator() {
        return this.LIZ.listIterator();
    }
    
    @Override
    public final ListIterator<V> listIterator(final int n) {
        return this.LIZ.listIterator(n);
    }
    
    @Override
    public final /* bridge */ V remove(final int n) {
        return this.LIZ.remove(n);
    }
    
    @Override
    public final boolean remove(final Object o) {
        return this.LIZ.remove(o);
    }
    
    @Override
    public final boolean removeAll(final Collection<?> collection) {
        CTM.LIZ((Object)collection);
        return this.LIZ.removeAll(collection);
    }
    
    @Override
    public final boolean retainAll(final Collection<?> collection) {
        CTM.LIZ((Object)collection);
        return this.LIZ.retainAll(collection);
    }
    
    @Override
    public final V set(final int n, final V v) {
        return this.LIZ.set(n, v);
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.LIZ.size();
    }
    
    @Override
    public final List<V> subList(final int n, final int n2) {
        return this.LIZ.subList(n, n2);
    }
    
    @Override
    public final Object[] toArray() {
        return 6ur.LIZ((Collection)this);
    }
    
    @Override
    public final <T> T[] toArray(final T[] array) {
        return (T[])6ur.LIZ((Collection)this, (Object[])array);
    }
}
