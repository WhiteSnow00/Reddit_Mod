// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.NoSuchElementException;
import java.lang.reflect.Array;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import com.bytedance.covode.number.Covode;

public abstract class 04z<K, V>
{
    public b LIZIZ;
    public c LIZJ;
    public e LIZLLL;
    
    static {
        Covode.recordClassIndex(581);
    }
    
    public static <K, V> boolean LIZ(final Map<K, V> map, final Collection<?> collection) {
        final int size = map.size();
        final Iterator<K> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            if (!collection.contains(iterator.next())) {
                iterator.remove();
            }
        }
        return size != map.size();
    }
    
    public static <T> boolean LIZ(final Set<T> set, final Object o) {
        if (set == o) {
            return true;
        }
        if (!(o instanceof Set)) {
            return false;
        }
        final Set set2 = (Set)o;
        try {
            if (set.size() == set2.size() && set.containsAll(set2)) {
                return true;
            }
            return false;
        }
        catch (final NullPointerException | ClassCastException ex) {
            return false;
        }
    }
    
    public abstract int LIZ();
    
    public abstract int LIZ(final Object p0);
    
    public abstract Object LIZ(final int p0, final int p1);
    
    public abstract V LIZ(final int p0, final V p1);
    
    public abstract void LIZ(final int p0);
    
    public abstract void LIZ(final K p0, final V p1);
    
    public final <T> T[] LIZ(final T[] array, final int n) {
        final int liz = this.LIZ();
        Object[] array2 = array;
        if (array.length < liz) {
            array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), liz);
        }
        for (int i = 0; i < liz; ++i) {
            array2[i] = this.LIZ(i, n);
        }
        if (array2.length > liz) {
            array2[liz] = null;
        }
        return (T[])array2;
    }
    
    public abstract int LIZIZ(final Object p0);
    
    public abstract Map<K, V> LIZIZ();
    
    public final Object[] LIZIZ(final int n) {
        final int liz = this.LIZ();
        final Object[] array = new Object[liz];
        for (int i = 0; i < liz; ++i) {
            array[i] = this.LIZ(i, n);
        }
        return array;
    }
    
    public abstract void LIZJ();
    
    public final Set<K> LIZLLL() {
        if (this.LIZJ == null) {
            this.LIZJ = new c();
        }
        return this.LIZJ;
    }
    
    public final class a<T> implements Iterator<T>
    {
        public final int LIZ;
        public int LIZIZ;
        public int LIZJ;
        public boolean LIZLLL;
        
        static {
            Covode.recordClassIndex(582);
        }
        
        public a(final int liz) {
            this.LIZ = liz;
            this.LIZIZ = 04z.this.LIZ();
        }
        
        @Override
        public final boolean hasNext() {
            return this.LIZJ < this.LIZIZ;
        }
        
        @Override
        public final T next() {
            if (this.hasNext()) {
                final Object liz = 04z.this.LIZ(this.LIZJ, this.LIZ);
                ++this.LIZJ;
                this.LIZLLL = true;
                return (T)liz;
            }
            throw new NoSuchElementException();
        }
        
        @Override
        public final void remove() {
            if (this.LIZLLL) {
                final int lizj = this.LIZJ - 1;
                this.LIZJ = lizj;
                --this.LIZIZ;
                this.LIZLLL = false;
                04z.this.LIZ(lizj);
                return;
            }
            throw new IllegalStateException();
        }
    }
    
    public final class d implements Iterator<Entry<K, V>>, Entry<K, V>
    {
        public int LIZ;
        public int LIZIZ;
        public boolean LIZJ;
        
        static {
            Covode.recordClassIndex(585);
        }
        
        public d() {
            this.LIZ = 04z.this.LIZ() - 1;
            this.LIZIZ = -1;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (!this.LIZJ) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(o instanceof Entry)) {
                return false;
            }
            final Entry entry = (Entry)o;
            return 04u.LIZ(entry.getKey(), 04z.this.LIZ(this.LIZIZ, 0)) && 04u.LIZ(entry.getValue(), 04z.this.LIZ(this.LIZIZ, 1));
        }
        
        @Override
        public final K getKey() {
            if (this.LIZJ) {
                return (K)04z.this.LIZ(this.LIZIZ, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        
        @Override
        public final V getValue() {
            if (this.LIZJ) {
                return (V)04z.this.LIZ(this.LIZIZ, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        
        @Override
        public final boolean hasNext() {
            return this.LIZIZ < this.LIZ;
        }
        
        @Override
        public final int hashCode() {
            if (this.LIZJ) {
                final 04z lizlll = 04z.this;
                final int liziz = this.LIZIZ;
                int hashCode = 0;
                final Object liz = lizlll.LIZ(liziz, 0);
                final Object liz2 = 04z.this.LIZ(this.LIZIZ, 1);
                int hashCode2;
                if (liz == null) {
                    hashCode2 = 0;
                }
                else {
                    hashCode2 = liz.hashCode();
                }
                if (liz2 != null) {
                    hashCode = liz2.hashCode();
                }
                return hashCode2 ^ hashCode;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        
        @Override
        public final void remove() {
            if (this.LIZJ) {
                04z.this.LIZ(this.LIZIZ);
                --this.LIZIZ;
                --this.LIZ;
                this.LIZJ = false;
                return;
            }
            throw new IllegalStateException();
        }
        
        @Override
        public final V setValue(final V v) {
            if (this.LIZJ) {
                return 04z.this.LIZ(this.LIZIZ, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.getKey());
            sb.append("=");
            sb.append(this.getValue());
            return sb.toString();
        }
    }
    
    public final class b implements Set<Map.Entry<K, V>>
    {
        static {
            Covode.recordClassIndex(583);
        }
        
        @Override
        public final boolean addAll(final Collection<? extends Map.Entry<K, V>> collection) {
            final int liz = 04z.this.LIZ();
            for (final Map.Entry<K, V> entry : collection) {
                04z.this.LIZ(entry.getKey(), entry.getValue());
            }
            return liz != 04z.this.LIZ();
        }
        
        @Override
        public final void clear() {
            04z.this.LIZJ();
        }
        
        @Override
        public final boolean contains(final Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            final Map.Entry entry = (Map.Entry)o;
            final int liz = 04z.this.LIZ(entry.getKey());
            return liz >= 0 && 04u.LIZ(04z.this.LIZ(liz, 1), entry.getValue());
        }
        
        @Override
        public final boolean containsAll(final Collection<?> collection) {
            final Iterator<?> iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (!this.contains(iterator.next())) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return 04z.LIZ((Set<Object>)this, o);
        }
        
        @Override
        public final int hashCode() {
            int i = 04z.this.LIZ() - 1;
            int n = 0;
            while (i >= 0) {
                final Object liz = 04z.this.LIZ(i, 0);
                final Object liz2 = 04z.this.LIZ(i, 1);
                int hashCode;
                if (liz == null) {
                    hashCode = 0;
                }
                else {
                    hashCode = liz.hashCode();
                }
                int hashCode2;
                if (liz2 == null) {
                    hashCode2 = 0;
                }
                else {
                    hashCode2 = liz2.hashCode();
                }
                n += (hashCode ^ hashCode2);
                --i;
            }
            return n;
        }
        
        @Override
        public final boolean isEmpty() {
            return 04z.this.LIZ() == 0;
        }
        
        @Override
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }
        
        @Override
        public final boolean remove(final Object o) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public final boolean removeAll(final Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public final boolean retainAll(final Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public final int size() {
            return 04z.this.LIZ();
        }
        
        @Override
        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public final <T> T[] toArray(final T[] array) {
            throw new UnsupportedOperationException();
        }
    }
    
    public final class c implements Set<K>
    {
        static {
            Covode.recordClassIndex(584);
        }
        
        @Override
        public final boolean add(final K k) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public final boolean addAll(final Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public final void clear() {
            04z.this.LIZJ();
        }
        
        @Override
        public final boolean contains(final Object o) {
            return 04z.this.LIZ(o) >= 0;
        }
        
        @Override
        public final boolean containsAll(final Collection<?> collection) {
            final Map<K, V> liziz = 04z.this.LIZIZ();
            final Iterator<?> iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (!liziz.containsKey(iterator.next())) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return 04z.LIZ((Set<Object>)this, o);
        }
        
        @Override
        public final int hashCode() {
            int i = 04z.this.LIZ() - 1;
            int n = 0;
            while (i >= 0) {
                final Object liz = 04z.this.LIZ(i, 0);
                int hashCode;
                if (liz == null) {
                    hashCode = 0;
                }
                else {
                    hashCode = liz.hashCode();
                }
                n += hashCode;
                --i;
            }
            return n;
        }
        
        @Override
        public final boolean isEmpty() {
            return 04z.this.LIZ() == 0;
        }
        
        @Override
        public final Iterator<K> iterator() {
            return new a<K>(0);
        }
        
        @Override
        public final boolean remove(final Object o) {
            final int liz = 04z.this.LIZ(o);
            if (liz >= 0) {
                04z.this.LIZ(liz);
                return true;
            }
            return false;
        }
        
        @Override
        public final boolean removeAll(final Collection<?> collection) {
            final Map<K, V> liziz = 04z.this.LIZIZ();
            final int size = liziz.size();
            final Iterator<?> iterator = collection.iterator();
            while (iterator.hasNext()) {
                liziz.remove(iterator.next());
            }
            return size != liziz.size();
        }
        
        @Override
        public final boolean retainAll(final Collection<?> collection) {
            return 04z.LIZ(04z.this.LIZIZ(), collection);
        }
        
        @Override
        public final int size() {
            return 04z.this.LIZ();
        }
        
        @Override
        public final Object[] toArray() {
            return 04z.this.LIZIZ(0);
        }
        
        @Override
        public final <T> T[] toArray(final T[] array) {
            return 04z.this.LIZ(array, 0);
        }
    }
    
    public final class e implements Collection<V>
    {
        static {
            Covode.recordClassIndex(586);
        }
        
        @Override
        public final boolean add(final V v) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public final boolean addAll(final Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public final void clear() {
            04z.this.LIZJ();
        }
        
        @Override
        public final boolean contains(final Object o) {
            return 04z.this.LIZIZ(o) >= 0;
        }
        
        @Override
        public final boolean containsAll(final Collection<?> collection) {
            final Iterator<?> iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (!this.contains(iterator.next())) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public final boolean isEmpty() {
            return 04z.this.LIZ() == 0;
        }
        
        @Override
        public final Iterator<V> iterator() {
            return new a<V>(1);
        }
        
        @Override
        public final boolean remove(final Object o) {
            final int liziz = 04z.this.LIZIZ(o);
            if (liziz >= 0) {
                04z.this.LIZ(liziz);
                return true;
            }
            return false;
        }
        
        @Override
        public final boolean removeAll(final Collection<?> collection) {
            int liz = 04z.this.LIZ();
            int i = 0;
            boolean b = false;
            while (i < liz) {
                int n = i;
                int n2 = liz;
                if (collection.contains(04z.this.LIZ(i, 1))) {
                    04z.this.LIZ(i);
                    n = i - 1;
                    n2 = liz - 1;
                    b = true;
                }
                i = n + 1;
                liz = n2;
            }
            return b;
        }
        
        @Override
        public final boolean retainAll(final Collection<?> collection) {
            int liz = 04z.this.LIZ();
            int i = 0;
            boolean b = false;
            while (i < liz) {
                int n = i;
                int n2 = liz;
                if (!collection.contains(04z.this.LIZ(i, 1))) {
                    04z.this.LIZ(i);
                    n = i - 1;
                    n2 = liz - 1;
                    b = true;
                }
                i = n + 1;
                liz = n2;
            }
            return b;
        }
        
        @Override
        public final int size() {
            return 04z.this.LIZ();
        }
        
        @Override
        public final Object[] toArray() {
            return 04z.this.LIZIZ(1);
        }
        
        @Override
        public final <T> T[] toArray(final T[] array) {
            return 04z.this.LIZ(array, 1);
        }
    }
}
