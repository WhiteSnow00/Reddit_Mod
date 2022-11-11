// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import b1.a$a;
import java.util.List;
import zg2.l;
import java.util.ListIterator;
import java.util.Iterator;
import ah2.f;
import java.util.Collection;
import b1.c;
import qg2.a;

public abstract class AbstractPersistentList<E> extends qg2.a<E> implements c<E>
{
    public c<E> addAll(final Collection<? extends E> collection) {
        f.f((Object)collection, "elements");
        final PersistentVectorBuilder builder = this.builder();
        builder.addAll(collection);
        return builder.a();
    }
    
    public final boolean contains(final Object o) {
        return this.indexOf(o) != -1;
    }
    
    public final boolean containsAll(final Collection<?> collection) {
        f.f((Object)collection, "elements");
        final boolean empty = collection.isEmpty();
        final boolean b = true;
        boolean b2;
        if (empty) {
            b2 = b;
        }
        else {
            final Iterator iterator = collection.iterator();
            do {
                b2 = b;
                if (iterator.hasNext()) {
                    continue;
                }
                return b2;
            } while (this.contains(iterator.next()));
            b2 = false;
        }
        return b2;
    }
    
    public final Iterator<E> iterator() {
        return this.listIterator(0);
    }
    
    public final ListIterator<E> listIterator() {
        return this.listIterator(0);
    }
    
    public final c<E> remove(final E e) {
        final int index = this.indexOf((Object)e);
        if (index != -1) {
            return this.r0(index);
        }
        return this;
    }
    
    public final c<E> removeAll(final Collection<? extends E> collection) {
        f.f((Object)collection, "elements");
        return this.V((zg2.l<? super E, Boolean>)new AbstractPersistentList$removeAll.AbstractPersistentList$removeAll$1((Collection)collection));
    }
    
    public final List subList(final int n, final int n2) {
        return (List)new a$a((a)this, n, n2);
    }
}
