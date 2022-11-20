// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.internal.play_billing;

import java.util.AbstractCollection;
import java.util.ListIterator;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Collection;
import java.util.RandomAccess;
import java.util.List;

public abstract class zzp<E> extends zzm<E> implements List<E>, RandomAccess
{
    public static final i g;
    
    static {
        g = new i(zzq.zza, 0);
    }
    
    public static <E> zzp<E> zzg() {
        return zzq.zza;
    }
    
    @Deprecated
    public final void add(final int n, final E e) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    public final boolean addAll(final int n, final Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }
    
    public final boolean contains(@NullableDecl final Object o) {
        return this.indexOf(o) >= 0;
    }
    
    public final boolean equals(@NullableDecl Object value) {
        boolean b = false;
        if (value != this) {
            if (!(value instanceof List)) {
                return b;
            }
            final List list = (List)value;
            final int size = this.size();
            if (size != list.size()) {
                return b;
            }
            if (list instanceof RandomAccess) {
                for (int i = 0; i < size; ++i) {
                    value = this.get(i);
                    final Object value2 = list.get(i);
                    if (value != value2 && (value == null || !value.equals(value2))) {
                        return b;
                    }
                }
            }
            else {
                final Iterator<E> iterator = this.iterator();
                final Iterator iterator2 = list.iterator();
                while (iterator.hasNext()) {
                    if (!iterator2.hasNext()) {
                        return b;
                    }
                    final E next = iterator.next();
                    final Object next2 = iterator2.next();
                    if (next != next2 && (next == null || !next.equals(next2))) {
                        return b;
                    }
                }
                if (iterator2.hasNext()) {
                    return b;
                }
            }
        }
        b = true;
        return b;
    }
    
    public final int hashCode() {
        final int size = ((AbstractCollection)this).size();
        int n = 1;
        for (int i = 0; i < size; ++i) {
            n = n * 31 + this.get(i).hashCode();
        }
        return n;
    }
    
    public final int indexOf(@NullableDecl final Object o) {
        final int n = -1;
        if (o == null) {
            return -1;
        }
        final int size = this.size();
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n;
            if (n2 >= size) {
                break;
            }
            if (o.equals(this.get(n2))) {
                n3 = n2;
                break;
            }
            ++n2;
        }
        return n3;
    }
    
    public final /* bridge */ Iterator iterator() {
        return this.zzh(0);
    }
    
    public final int lastIndexOf(@NullableDecl final Object o) {
        final int n = -1;
        if (o == null) {
            return -1;
        }
        int n2 = this.size() - 1;
        int n3;
        while (true) {
            n3 = n;
            if (n2 < 0) {
                break;
            }
            if (o.equals(this.get(n2))) {
                n3 = n2;
                break;
            }
            --n2;
        }
        return n3;
    }
    
    public final /* bridge */ ListIterator listIterator() {
        return this.zzh(0);
    }
    
    public final /* bridge */ ListIterator listIterator(final int n) {
        return this.zzh(n);
    }
    
    @Deprecated
    public final E remove(final int n) {
        throw new UnsupportedOperationException();
    }
    
    @Deprecated
    public final E set(final int n, final E e) {
        throw new UnsupportedOperationException();
    }
    
    public /* bridge */ List subList(final int n, final int n2) {
        return this.zzf(n, n2);
    }
    
    public int zza(final Object[] array, int i) {
        int size;
        for (size = ((AbstractCollection)this).size(), i = 0; i < size; ++i) {
            array[i] = this.get(i);
        }
        return size;
    }
    
    public final j<E> zzd() {
        return this.zzh(0);
    }
    
    public zzp<E> zzf(final int n, int n2) {
        h.c(n, n2, ((AbstractCollection)this).size());
        n2 -= n;
        if (n2 == ((AbstractCollection)this).size()) {
            return this;
        }
        if (n2 == 0) {
            return zzq.zza;
        }
        return (zzp<E>)new zzo(this, n, n2);
    }
    
    public final k<E> zzh(final int n) {
        h.b(n, ((AbstractCollection)this).size());
        if (((AbstractCollection)this).isEmpty()) {
            return (k<E>)zzp.g;
        }
        return (k<E>)new i(this, n);
    }
}
