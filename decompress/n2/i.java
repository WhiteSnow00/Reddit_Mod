// 
// Decompiled by Procyon v0.6.0
// 

package n2;

import ah2.c;
import java.util.Comparator;
import java.util.function.UnaryOperator;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import bh2.a;
import java.util.List;

public final class i extends g implements List<f>, bh2.a
{
    public final /* synthetic */ List<f> g;
    public final ArrayList h;
    
    public i(final List<? extends f> g) {
        this.g = (List<f>)g;
        if (g.isEmpty() ^ true) {
            this.h = new ArrayList((Collection<? extends E>)g);
            return;
        }
        throw new IllegalStateException("At least one font should be passed to FontFamily".toString());
    }
    
    @Override
    public final boolean addAll(final int n, final Collection<? extends f> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean addAll(final Collection<? extends f> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean contains(final Object o) {
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        ah2.f.f((Object)f, "element");
        return this.g.contains(f);
    }
    
    @Override
    public final boolean containsAll(final Collection<?> collection) {
        ah2.f.f((Object)collection, "elements");
        return this.g.containsAll(collection);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof i && ah2.f.a((Object)this.h, (Object)((i)o).h));
    }
    
    @Override
    public final Object get(final int n) {
        return this.g.get(n);
    }
    
    @Override
    public final int hashCode() {
        return this.h.hashCode();
    }
    
    @Override
    public final int indexOf(final Object o) {
        if (!(o instanceof f)) {
            return -1;
        }
        final f f = (f)o;
        ah2.f.f((Object)f, "element");
        return this.g.indexOf(f);
    }
    
    @Override
    public final boolean isEmpty() {
        return this.g.isEmpty();
    }
    
    @Override
    public final Iterator<f> iterator() {
        return this.g.iterator();
    }
    
    @Override
    public final int lastIndexOf(final Object o) {
        if (!(o instanceof f)) {
            return -1;
        }
        final f f = (f)o;
        ah2.f.f((Object)f, "element");
        return this.g.lastIndexOf(f);
    }
    
    @Override
    public final ListIterator<f> listIterator() {
        return this.g.listIterator();
    }
    
    @Override
    public final ListIterator<f> listIterator(final int n) {
        return this.g.listIterator(n);
    }
    
    @Override
    public final boolean remove(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean removeAll(final Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final void replaceAll(final UnaryOperator<f> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final boolean retainAll(final Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final int size() {
        return this.g.size();
    }
    
    @Override
    public final void sort(final Comparator<? super f> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final List<f> subList(final int n, final int n2) {
        return this.g.subList(n, n2);
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
    
    public final String toString() {
        final StringBuilder k = a.k("FontListFontFamily(fonts=");
        k.append(this.h);
        k.append(')');
        return k.toString();
    }
}
