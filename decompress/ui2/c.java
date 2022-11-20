// 
// Decompiled by Procyon v0.6.0
// 

package ui2;

import java.util.NoSuchElementException;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import android.support.v4.media.a;
import java.util.RandomAccess;
import java.util.AbstractList;

public final class c<E> extends AbstractList<E> implements RandomAccess
{
    public int f;
    public Object g;
    
    public static void a(final int n) {
        String s;
        if (n != 2 && n != 3 && n != 5 && n != 6 && n != 7) {
            s = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            s = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 2 && n != 3 && n != 5 && n != 6 && n != 7) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] array = new Object[n2];
        switch (n) {
            default: {
                array[0] = "elements";
                break;
            }
            case 4: {
                array[0] = "a";
                break;
            }
            case 2:
            case 3:
            case 5:
            case 6:
            case 7: {
                array[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            }
        }
        if (n != 2 && n != 3) {
            if (n != 5 && n != 6 && n != 7) {
                array[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
            }
            else {
                array[1] = "toArray";
            }
        }
        else {
            array[1] = "iterator";
        }
        switch (n) {
            case 4: {
                array[2] = "toArray";
            }
            default: {
                array[2] = "<init>";
            }
            case 2:
            case 3:
            case 5:
            case 6:
            case 7: {
                final String format = String.format(s, array);
                RuntimeException ex;
                if (n != 2 && n != 3 && n != 5 && n != 6 && n != 7) {
                    ex = new IllegalArgumentException(format);
                }
                else {
                    ex = new IllegalStateException(format);
                }
                throw ex;
            }
        }
    }
    
    public static int c(final c c) {
        return c.modCount;
    }
    
    public static int d(final c c) {
        return c.modCount;
    }
    
    public static int e(final c c) {
        return c.modCount;
    }
    
    @Override
    public final void add(final int n, final E g) {
        if (n >= 0) {
            final int f = this.f;
            if (n <= f) {
                if (f == 0) {
                    this.g = g;
                }
                else if (f == 1 && n == 0) {
                    this.g = new Object[] { g, this.g };
                }
                else {
                    final Object[] g2 = new Object[f + 1];
                    if (f == 1) {
                        g2[0] = this.g;
                    }
                    else {
                        final Object[] array = (Object[])this.g;
                        System.arraycopy(array, 0, g2, 0, n);
                        System.arraycopy(array, n, g2, n + 1, this.f - n);
                    }
                    g2[n] = g;
                    this.g = g2;
                }
                ++this.f;
                ++super.modCount;
                return;
            }
        }
        final StringBuilder o = android.support.v4.media.a.o("Index: ", n, ", Size: ");
        o.append(this.f);
        throw new IndexOutOfBoundsException(o.toString());
    }
    
    @Override
    public final boolean add(final E g) {
        final int f = this.f;
        if (f == 0) {
            this.g = g;
        }
        else if (f == 1) {
            this.g = new Object[] { this.g, g };
        }
        else {
            final Object[] array = (Object[])this.g;
            final int length = array.length;
            Object[] g2 = array;
            if (f >= length) {
                final int a = m5.a.a(length, 3, 2, 1);
                final int n = f + 1;
                int n2;
                if ((n2 = a) < n) {
                    n2 = n;
                }
                g2 = new Object[n2];
                System.arraycopy(array, 0, this.g = g2, 0, length);
            }
            g2[this.f] = g;
        }
        ++this.f;
        ++super.modCount;
        return true;
    }
    
    @Override
    public final void clear() {
        this.g = null;
        this.f = 0;
        ++super.modCount;
    }
    
    @Override
    public final E get(final int n) {
        if (n >= 0) {
            final int f = this.f;
            if (n < f) {
                if (f == 1) {
                    return (E)this.g;
                }
                return (E)((Object[])this.g)[n];
            }
        }
        final StringBuilder o = android.support.v4.media.a.o("Index: ", n, ", Size: ");
        o.append(this.f);
        throw new IndexOutOfBoundsException(o.toString());
    }
    
    @Override
    public final Iterator<E> iterator() {
        final int f = this.f;
        if (f == 0) {
            return a.f;
        }
        if (f == 1) {
            return (Iterator<E>)new c$b(this);
        }
        final Iterator<E> iterator = super.iterator();
        if (iterator != null) {
            return iterator;
        }
        a(3);
        throw null;
    }
    
    @Override
    public final E remove(final int n) {
        if (n >= 0) {
            final int f = this.f;
            if (n < f) {
                Object g;
                if (f == 1) {
                    g = this.g;
                    this.g = null;
                }
                else {
                    final Object[] array = (Object[])this.g;
                    g = array[n];
                    if (f == 2) {
                        this.g = array[1 - n];
                    }
                    else {
                        final int n2 = f - n - 1;
                        if (n2 > 0) {
                            System.arraycopy(array, n + 1, array, n, n2);
                        }
                        array[this.f - 1] = null;
                    }
                }
                --this.f;
                ++super.modCount;
                return (E)g;
            }
        }
        final StringBuilder o = android.support.v4.media.a.o("Index: ", n, ", Size: ");
        o.append(this.f);
        throw new IndexOutOfBoundsException(o.toString());
    }
    
    @Override
    public final E set(final int n, final E g) {
        if (n >= 0) {
            final int f = this.f;
            if (n < f) {
                Object o;
                if (f == 1) {
                    final Object g2 = this.g;
                    this.g = g;
                    o = g2;
                }
                else {
                    final Object[] array = (Object[])this.g;
                    final Object o2 = array[n];
                    array[n] = g;
                    o = o2;
                }
                return (E)o;
            }
        }
        final StringBuilder o3 = android.support.v4.media.a.o("Index: ", n, ", Size: ");
        o3.append(this.f);
        throw new IndexOutOfBoundsException(o3.toString());
    }
    
    @Override
    public final int size() {
        return this.f;
    }
    
    @Override
    public final <T> T[] toArray(final T[] array) {
        if (array != null) {
            final int length = array.length;
            final int f = this.f;
            if (f == 1) {
                if (length == 0) {
                    final Object[] array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), 1);
                    array2[0] = this.g;
                    return (T[])array2;
                }
                array[0] = (T)this.g;
            }
            else if (length < f) {
                final Object[] copy = Arrays.copyOf((Object[])this.g, f, array.getClass());
                if (copy != null) {
                    return (T[])copy;
                }
                a(6);
                throw null;
            }
            else if (f != 0) {
                System.arraycopy(this.g, 0, array, 0, f);
            }
            final int f2 = this.f;
            if (length > f2) {
                array[f2] = null;
            }
            return array;
        }
        a(4);
        throw null;
    }
    
    public static final class a<T> implements Iterator<T>
    {
        public static final a f;
        
        static {
            f = new a();
        }
        
        @Override
        public final boolean hasNext() {
            return false;
        }
        
        @Override
        public final T next() {
            throw new NoSuchElementException();
        }
        
        @Override
        public final void remove() {
            throw new IllegalStateException();
        }
    }
    
    public abstract static class c<T> implements Iterator<T>
    {
        public boolean f;
        
        public abstract void a();
        
        @Override
        public final boolean hasNext() {
            return this.f ^ true;
        }
        
        @Override
        public final T next() {
            if (!this.f) {
                this.f = true;
                this.a();
                return (T)((c$b)this).h.g;
            }
            throw new NoSuchElementException();
        }
    }
}
