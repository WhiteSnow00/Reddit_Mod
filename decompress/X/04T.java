// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.lang.reflect.Array;
import java.util.Iterator;
import com.bytedance.covode.number.Covode;
import java.util.Set;
import java.util.Collection;

public final class 04t<E> implements Collection<E>, Set<E>
{
    public static final int[] LIZJ;
    public static final Object[] LIZLLL;
    public static Object[] LJ;
    public static int LJFF;
    public static Object[] LJI;
    public static int LJII;
    public Object[] LIZ;
    public int LIZIZ;
    public int[] LJIIIIZZ;
    public 04z<E, E> LJIIIZ;
    
    static {
        Covode.recordClassIndex(576);
        LIZJ = new int[0];
        LIZLLL = new Object[0];
    }
    
    public 04t() {
        this((byte)0);
    }
    
    public 04t(final byte b) {
        this.LJIIIIZZ = 04t.LIZJ;
        this.LIZ = 04t.LIZLLL;
        this.LIZIZ = 0;
    }
    
    public 04t(final Collection<E> collection) {
        this();
        if (collection != null) {
            this.addAll((Collection<? extends E>)collection);
        }
    }
    
    private int LIZ() {
        final int liziz = this.LIZIZ;
        if (liziz == 0) {
            return -1;
        }
        final int liz = 04u.LIZ(this.LJIIIIZZ, liziz, 0);
        if (liz < 0) {
            return liz;
        }
        if (this.LIZ[liz] == null) {
            return liz;
        }
        int n;
        for (n = liz + 1; n < liziz && this.LJIIIIZZ[n] == 0; ++n) {
            if (this.LIZ[n] == null) {
                return n;
            }
        }
        for (int n2 = liz - 1; n2 >= 0 && this.LJIIIIZZ[n2] == 0; --n2) {
            if (this.LIZ[n2] == null) {
                return n2;
            }
        }
        return ~n;
    }
    
    private int LIZ(final Object o, final int n) {
        final int liziz = this.LIZIZ;
        if (liziz == 0) {
            return -1;
        }
        int liz = 04u.LIZ(this.LJIIIIZZ, liziz, n);
        if (liz < 0) {
            return liz;
        }
        if (o.equals(this.LIZ[liz])) {
            return liz;
        }
        int n2;
        for (n2 = liz + 1; n2 < liziz && this.LJIIIIZZ[n2] == n; ++n2) {
            if (o.equals(this.LIZ[n2])) {
                return n2;
            }
        }
        --liz;
        while (liz >= 0 && this.LJIIIIZZ[liz] == n) {
            if (o.equals(this.LIZ[liz])) {
                return liz;
            }
            --liz;
        }
        return ~n2;
    }
    
    public static void LIZ(final int[] array, final Object[] array2, int i) {
        if (array.length == 8) {
            synchronized (04t.class) {
                if (04t.LJII < 10) {
                    array2[0] = 04t.LJI;
                    array2[1] = array;
                    --i;
                    while (i >= 2) {
                        array2[i] = null;
                        --i;
                    }
                    04t.LJI = array2;
                    ++04t.LJII;
                }
                return;
            }
        }
        if (array.length == 4) {
            synchronized (04t.class) {
                if (04t.LJFF < 10) {
                    array2[0] = 04t.LJ;
                    array2[1] = array;
                    --i;
                    while (i >= 2) {
                        array2[i] = null;
                        --i;
                    }
                    04t.LJ = array2;
                    ++04t.LJFF;
                }
            }
        }
    }
    
    private void LIZIZ(final int n) {
        Label_0142: {
            if (n == 8) {
                synchronized (04t.class) {
                    final Object[] lji = 04t.LJI;
                    if (lji != null) {
                        this.LIZ = lji;
                        04t.LJI = (Object[])lji[0];
                        this.LJIIIIZZ = (int[])lji[1];
                        lji[0] = (lji[1] = null);
                        --04t.LJII;
                        return;
                    }
                    break Label_0142;
                }
            }
            if (n == 4) {
                synchronized (04t.class) {
                    final Object[] lj = 04t.LJ;
                    if (lj != null) {
                        this.LIZ = lj;
                        04t.LJ = (Object[])lj[0];
                        this.LJIIIIZZ = (int[])lj[1];
                        lj[0] = (lj[1] = null);
                        --04t.LJFF;
                        return;
                    }
                }
                monitorexit(04t.class);
            }
        }
        this.LJIIIIZZ = new int[n];
        this.LIZ = new Object[n];
    }
    
    public final int LIZ(final Object o) {
        if (o == null) {
            return this.LIZ();
        }
        return this.LIZ(o, o.hashCode());
    }
    
    public final E LIZ(final int n) {
        final Object[] liz = this.LIZ;
        final Object o = liz[n];
        final int liziz = this.LIZIZ;
        if (liziz <= 1) {
            LIZ(this.LJIIIIZZ, liz, liziz);
            this.LJIIIIZZ = 04t.LIZJ;
            this.LIZ = 04t.LIZLLL;
            this.LIZIZ = 0;
        }
        else {
            final int[] ljiiiizz = this.LJIIIIZZ;
            final int length = ljiiiizz.length;
            int n2 = 8;
            if (length > 8 && liziz < ljiiiizz.length / 3) {
                if (liziz > 8) {
                    n2 = liziz + (liziz >> 1);
                }
                this.LIZIZ(n2);
                --this.LIZIZ;
                if (n > 0) {
                    System.arraycopy(ljiiiizz, 0, this.LJIIIIZZ, 0, n);
                    System.arraycopy(liz, 0, this.LIZ, 0, n);
                }
                final int liziz2 = this.LIZIZ;
                if (n < liziz2) {
                    final int n3 = n + 1;
                    System.arraycopy(ljiiiizz, n3, this.LJIIIIZZ, n, liziz2 - n);
                    System.arraycopy(liz, n3, this.LIZ, n, this.LIZIZ - n);
                }
            }
            else {
                final int liziz3 = liziz - 1;
                if (n < (this.LIZIZ = liziz3)) {
                    final int n4 = n + 1;
                    System.arraycopy(ljiiiizz, n4, ljiiiizz, n, liziz3 - n);
                    final Object[] liz2 = this.LIZ;
                    System.arraycopy(liz2, n4, liz2, n, this.LIZIZ - n);
                }
                this.LIZ[this.LIZIZ] = null;
            }
        }
        return (E)o;
    }
    
    @Override
    public final boolean add(final E e) {
        int n;
        int hashCode;
        if (e == null) {
            n = this.LIZ();
            hashCode = 0;
        }
        else {
            hashCode = e.hashCode();
            n = this.LIZ(e, hashCode);
        }
        if (n >= 0) {
            return false;
        }
        final int n2 = ~n;
        final int liziz = this.LIZIZ;
        final int[] ljiiiizz = this.LJIIIIZZ;
        if (liziz >= ljiiiizz.length) {
            int n3 = 4;
            if (liziz >= 8) {
                n3 = (liziz >> 1) + liziz;
            }
            else if (liziz >= 4) {
                n3 = 8;
            }
            final Object[] liz = this.LIZ;
            this.LIZIZ(n3);
            final int[] ljiiiizz2 = this.LJIIIIZZ;
            if (ljiiiizz2.length > 0) {
                System.arraycopy(ljiiiizz, 0, ljiiiizz2, 0, ljiiiizz.length);
                System.arraycopy(liz, 0, this.LIZ, 0, liz.length);
            }
            LIZ(ljiiiizz, liz, this.LIZIZ);
        }
        final int liziz2 = this.LIZIZ;
        if (n2 < liziz2) {
            final int[] ljiiiizz3 = this.LJIIIIZZ;
            final int n4 = n2 + 1;
            System.arraycopy(ljiiiizz3, n2, ljiiiizz3, n4, liziz2 - n2);
            final Object[] liz2 = this.LIZ;
            System.arraycopy(liz2, n2, liz2, n4, this.LIZIZ - n2);
        }
        this.LJIIIIZZ[n2] = hashCode;
        this.LIZ[n2] = e;
        ++this.LIZIZ;
        return true;
    }
    
    @Override
    public final boolean addAll(final Collection<? extends E> collection) {
        final int n = this.LIZIZ + collection.size();
        final int[] ljiiiizz = this.LJIIIIZZ;
        final int length = ljiiiizz.length;
        boolean b = false;
        if (length < n) {
            final Object[] liz = this.LIZ;
            this.LIZIZ(n);
            final int liziz = this.LIZIZ;
            if (liziz > 0) {
                System.arraycopy(ljiiiizz, 0, this.LJIIIIZZ, 0, liziz);
                System.arraycopy(liz, 0, this.LIZ, 0, this.LIZIZ);
            }
            LIZ(ljiiiizz, liz, this.LIZIZ);
        }
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            b |= this.add(iterator.next());
        }
        return b;
    }
    
    @Override
    public final void clear() {
        final int liziz = this.LIZIZ;
        if (liziz != 0) {
            LIZ(this.LJIIIIZZ, this.LIZ, liziz);
            this.LJIIIIZZ = 04t.LIZJ;
            this.LIZ = 04t.LIZLLL;
            this.LIZIZ = 0;
        }
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.LIZ(o) >= 0;
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
        if (this == o) {
            return true;
        }
        if (!(o instanceof Set)) {
            return false;
        }
        final Set set = (Set)o;
        if (this.size() != set.size()) {
            return false;
        }
        int i = 0;
        try {
            while (i < this.LIZIZ) {
                if (!set.contains(this.LIZ[i])) {
                    return false;
                }
                ++i;
            }
            return true;
        }
        catch (final NullPointerException | ClassCastException ex) {
            return false;
        }
    }
    
    @Override
    public final int hashCode() {
        final int[] ljiiiizz = this.LJIIIIZZ;
        final int liziz = this.LIZIZ;
        int i = 0;
        int n = 0;
        while (i < liziz) {
            n += ljiiiizz[i];
            ++i;
        }
        return n;
    }
    
    @Override
    public final boolean isEmpty() {
        return this.LIZIZ <= 0;
    }
    
    @Override
    public final Iterator<E> iterator() {
        if (this.LJIIIZ == null) {
            this.LJIIIZ = new 13k(this);
        }
        return this.LJIIIZ.LIZLLL().iterator();
    }
    
    @Override
    public final boolean remove(final Object o) {
        final int liz = this.LIZ(o);
        if (liz >= 0) {
            this.LIZ(liz);
            return true;
        }
        return false;
    }
    
    @Override
    public final boolean removeAll(final Collection<?> collection) {
        final Iterator<?> iterator = collection.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            b |= this.remove(iterator.next());
        }
        return b;
    }
    
    @Override
    public final boolean retainAll(final Collection<?> collection) {
        int i = this.LIZIZ - 1;
        boolean b = false;
        while (i >= 0) {
            if (!collection.contains(this.LIZ[i])) {
                this.LIZ(i);
                b = true;
            }
            --i;
        }
        return b;
    }
    
    @Override
    public final int size() {
        return this.LIZIZ;
    }
    
    @Override
    public final Object[] toArray() {
        final int liziz = this.LIZIZ;
        final Object[] array = new Object[liziz];
        System.arraycopy(this.LIZ, 0, array, 0, liziz);
        return array;
    }
    
    @Override
    public final <T> T[] toArray(final T[] array) {
        Object[] array2 = array;
        if (array.length < this.LIZIZ) {
            array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), this.LIZIZ);
        }
        System.arraycopy(this.LIZ, 0, array2, 0, this.LIZIZ);
        final int length = ((T[])array2).length;
        final int liziz = this.LIZIZ;
        if (length > liziz) {
            array2[liziz] = null;
        }
        return (T[])array2;
    }
    
    @Override
    public final String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.LIZIZ * 14);
        sb.append('{');
        for (int i = 0; i < this.LIZIZ; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            final Object o = this.LIZ[i];
            if (o != this) {
                sb.append(o);
            }
            else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
