// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Map;
import java.util.ConcurrentModificationException;
import com.bytedance.covode.number.Covode;

public class 050<K, V>
{
    public static Object[] LIZIZ;
    public static int LIZJ;
    public static Object[] LIZLLL;
    public static int LJ;
    public int[] LJFF;
    public Object[] LJI;
    public int LJII;
    
    static {
        Covode.recordClassIndex(587);
    }
    
    public 050() {
        this.LJFF = 04u.LIZ;
        this.LJI = 04u.LIZJ;
    }
    
    public 050(final int n) {
        if (n == 0) {
            this.LJFF = 04u.LIZ;
            this.LJI = 04u.LIZJ;
        }
        else {
            this.LJ(n);
        }
        this.LJII = 0;
    }
    
    public 050(final 050<K, V> 050) {
        this();
        if (050 != null) {
            final int ljii = 050.LJII;
            this.LIZ(this.LJII + ljii);
            final int ljii2 = this.LJII;
            int i = 0;
            if (ljii2 == 0) {
                if (ljii > 0) {
                    System.arraycopy(050.LJFF, 0, this.LJFF, 0, ljii);
                    System.arraycopy(050.LJI, 0, this.LJI, 0, ljii << 1);
                    this.LJII = ljii;
                }
            }
            else {
                while (i < ljii) {
                    this.put(050.LIZIZ(i), 050.LIZJ(i));
                    ++i;
                }
            }
        }
    }
    
    private int LIZ() {
        final int ljii = this.LJII;
        if (ljii == 0) {
            return -1;
        }
        int liz = LIZ(this.LJFF, ljii, 0);
        if (liz < 0) {
            return liz;
        }
        if (this.LJI[liz << 1] == null) {
            return liz;
        }
        int n;
        for (n = liz + 1; n < ljii && this.LJFF[n] == 0; ++n) {
            if (this.LJI[n << 1] == null) {
                return n;
            }
        }
        --liz;
        while (liz >= 0 && this.LJFF[liz] == 0) {
            if (this.LJI[liz << 1] == null) {
                return liz;
            }
            --liz;
        }
        return ~n;
    }
    
    private int LIZ(final Object o, final int n) {
        final int ljii = this.LJII;
        if (ljii == 0) {
            return -1;
        }
        int liz = LIZ(this.LJFF, ljii, n);
        if (liz < 0) {
            return liz;
        }
        if (o.equals(this.LJI[liz << 1])) {
            return liz;
        }
        int n2;
        for (n2 = liz + 1; n2 < ljii && this.LJFF[n2] == n; ++n2) {
            if (o.equals(this.LJI[n2 << 1])) {
                return n2;
            }
        }
        --liz;
        while (liz >= 0 && this.LJFF[liz] == n) {
            if (o.equals(this.LJI[liz << 1])) {
                return liz;
            }
            --liz;
        }
        return ~n2;
    }
    
    public static int LIZ(final int[] array, final int n, final int n2) {
        try {
            return 04u.LIZ(array, n, n2);
        }
        catch (final ArrayIndexOutOfBoundsException ex) {
            throw new ConcurrentModificationException();
        }
    }
    
    public static void LIZ(final int[] array, final Object[] array2, int i) {
        if (array.length == 8) {
            synchronized (050.class) {
                if (050.LJ < 10) {
                    array2[0] = 050.LIZLLL;
                    array2[1] = array;
                    for (i = (i << 1) - 1; i >= 2; --i) {
                        array2[i] = null;
                    }
                    050.LIZLLL = array2;
                    ++050.LJ;
                }
                return;
            }
        }
        if (array.length == 4) {
            synchronized (050.class) {
                if (050.LIZJ < 10) {
                    array2[0] = 050.LIZIZ;
                    array2[1] = array;
                    for (i = (i << 1) - 1; i >= 2; --i) {
                        array2[i] = null;
                    }
                    050.LIZIZ = array2;
                    ++050.LIZJ;
                }
            }
        }
    }
    
    private void LJ(final int n) {
        Label_0142: {
            if (n == 8) {
                synchronized (050.class) {
                    final Object[] lizlll = 050.LIZLLL;
                    if (lizlll != null) {
                        this.LJI = lizlll;
                        050.LIZLLL = (Object[])lizlll[0];
                        this.LJFF = (int[])lizlll[1];
                        lizlll[0] = (lizlll[1] = null);
                        --050.LJ;
                        return;
                    }
                    break Label_0142;
                }
            }
            if (n == 4) {
                synchronized (050.class) {
                    final Object[] liziz = 050.LIZIZ;
                    if (liziz != null) {
                        this.LJI = liziz;
                        050.LIZIZ = (Object[])liziz[0];
                        this.LJFF = (int[])liziz[1];
                        liziz[0] = (liziz[1] = null);
                        --050.LIZJ;
                        return;
                    }
                }
                monitorexit(050.class);
            }
        }
        this.LJFF = new int[n];
        this.LJI = new Object[n << 1];
    }
    
    public final int LIZ(final Object o) {
        if (o == null) {
            return this.LIZ();
        }
        return this.LIZ(o, o.hashCode());
    }
    
    public final V LIZ(int n, final V v) {
        n = (n << 1) + 1;
        final Object[] lji = this.LJI;
        final Object o = lji[n];
        lji[n] = v;
        return (V)o;
    }
    
    public final void LIZ(final int n) {
        final int ljii = this.LJII;
        final int[] ljff = this.LJFF;
        if (ljff.length < n) {
            final Object[] lji = this.LJI;
            this.LJ(n);
            if (this.LJII > 0) {
                System.arraycopy(ljff, 0, this.LJFF, 0, ljii);
                System.arraycopy(lji, 0, this.LJI, 0, ljii << 1);
            }
            LIZ(ljff, lji, ljii);
        }
        if (this.LJII == ljii) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    public final int LIZIZ(final Object o) {
        final int n = this.LJII * 2;
        final Object[] lji = this.LJI;
        if (o == null) {
            for (int i = 1; i < n; i += 2) {
                if (lji[i] == null) {
                    return i >> 1;
                }
            }
        }
        else {
            for (int j = 1; j < n; j += 2) {
                if (o.equals(lji[j])) {
                    return j >> 1;
                }
            }
        }
        return -1;
    }
    
    public final K LIZIZ(final int n) {
        return (K)this.LJI[n << 1];
    }
    
    public final V LIZJ(final int n) {
        return (V)this.LJI[(n << 1) + 1];
    }
    
    public final V LIZLLL(int ljii) {
        final Object[] lji = this.LJI;
        final int n = ljii << 1;
        final Object o = lji[n + 1];
        final int ljii2 = this.LJII;
        final int n2 = 0;
        if (ljii2 <= 1) {
            LIZ(this.LJFF, lji, ljii2);
            this.LJFF = 04u.LIZ;
            this.LJI = 04u.LIZJ;
            ljii = n2;
        }
        else {
            final int n3 = ljii2 - 1;
            final int[] ljff = this.LJFF;
            final int length = ljff.length;
            int n4 = 8;
            if (length > 8 && ljii2 < ljff.length / 3) {
                if (ljii2 > 8) {
                    n4 = ljii2 + (ljii2 >> 1);
                }
                this.LJ(n4);
                if (ljii2 != this.LJII) {
                    throw new ConcurrentModificationException();
                }
                if (ljii > 0) {
                    System.arraycopy(ljff, 0, this.LJFF, 0, ljii);
                    System.arraycopy(lji, 0, this.LJI, 0, n);
                }
                if (ljii < n3) {
                    final int n5 = ljii + 1;
                    final int[] ljff2 = this.LJFF;
                    final int n6 = n3 - ljii;
                    System.arraycopy(ljff, n5, ljff2, ljii, n6);
                    System.arraycopy(lji, n5 << 1, this.LJI, n, n6 << 1);
                }
            }
            else {
                if (ljii < n3) {
                    final int n7 = ljii + 1;
                    final int n8 = n3 - ljii;
                    System.arraycopy(ljff, n7, ljff, ljii, n8);
                    final Object[] lji2 = this.LJI;
                    System.arraycopy(lji2, n7 << 1, lji2, n, n8 << 1);
                }
                final Object[] lji3 = this.LJI;
                ljii = n3 << 1;
                lji3[ljii + 1] = (lji3[ljii] = null);
            }
            ljii = n3;
        }
        if (ljii2 == this.LJII) {
            this.LJII = ljii;
            return (V)o;
        }
        throw new ConcurrentModificationException();
    }
    
    public void clear() {
        final int ljii = this.LJII;
        if (ljii > 0) {
            final int[] ljff = this.LJFF;
            final Object[] lji = this.LJI;
            this.LJFF = 04u.LIZ;
            this.LJI = 04u.LIZJ;
            this.LJII = 0;
            LIZ(ljff, lji, ljii);
        }
        if (this.LJII <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    public boolean containsKey(final Object o) {
        return this.LIZ(o) >= 0;
    }
    
    public boolean containsValue(final Object o) {
        return this.LIZIZ(o) >= 0;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof 050) {
            final 050 050 = (050)o;
            if (this.size() != 050.size()) {
                return false;
            }
            int i = 0;
            try {
                while (i < this.LJII) {
                    final K liziz = this.LIZIZ(i);
                    o = this.LIZJ(i);
                    final Object value = 050.get(liziz);
                    if (o == null) {
                        if (value != null || !050.containsKey(liziz)) {
                            return false;
                        }
                    }
                    else if (!o.equals(value)) {
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
        if (!(o instanceof Map)) {
            return false;
        }
        final Map map = (Map)o;
        if (this.size() != map.size()) {
            return false;
        }
        int j = 0;
        try {
            while (j < this.LJII) {
                final K liziz2 = this.LIZIZ(j);
                o = this.LIZJ(j);
                final Object value2 = map.get(liziz2);
                if (o == null) {
                    if (value2 != null || !map.containsKey(liziz2)) {
                        return false;
                    }
                }
                else if (!o.equals(value2)) {
                    return false;
                }
                ++j;
            }
            return true;
        }
        catch (final NullPointerException | ClassCastException ex2) {
            return false;
        }
    }
    
    public V get(final Object o) {
        return this.getOrDefault(o, null);
    }
    
    public V getOrDefault(final Object o, final V v) {
        final int liz = this.LIZ(o);
        if (liz >= 0) {
            return (V)this.LJI[(liz << 1) + 1];
        }
        return v;
    }
    
    @Override
    public int hashCode() {
        final int[] ljff = this.LJFF;
        final Object[] lji = this.LJI;
        final int ljii = this.LJII;
        int n = 1;
        int i = 0;
        int n2 = 0;
        while (i < ljii) {
            final Object o = lji[n];
            final int n3 = ljff[i];
            int hashCode;
            if (o == null) {
                hashCode = 0;
            }
            else {
                hashCode = o.hashCode();
            }
            n2 += (hashCode ^ n3);
            ++i;
            n += 2;
        }
        return n2;
    }
    
    public boolean isEmpty() {
        return this.LJII <= 0;
    }
    
    public V put(final K k, final V v) {
        final int ljii = this.LJII;
        int n;
        int hashCode;
        if (k == null) {
            n = this.LIZ();
            hashCode = 0;
        }
        else {
            hashCode = k.hashCode();
            n = this.LIZ(k, hashCode);
        }
        if (n >= 0) {
            final int n2 = (n << 1) + 1;
            final Object[] lji = this.LJI;
            final Object o = lji[n2];
            lji[n2] = v;
            return (V)o;
        }
        final int n3 = ~n;
        final int[] ljff = this.LJFF;
        if (ljii >= ljff.length) {
            int n4 = 4;
            if (ljii >= 8) {
                n4 = (ljii >> 1) + ljii;
            }
            else if (ljii >= 4) {
                n4 = 8;
            }
            final Object[] lji2 = this.LJI;
            this.LJ(n4);
            if (ljii != this.LJII) {
                throw new ConcurrentModificationException();
            }
            final int[] ljff2 = this.LJFF;
            if (ljff2.length > 0) {
                System.arraycopy(ljff, 0, ljff2, 0, ljff.length);
                System.arraycopy(lji2, 0, this.LJI, 0, lji2.length);
            }
            LIZ(ljff, lji2, ljii);
        }
        if (n3 < ljii) {
            final int[] ljff3 = this.LJFF;
            final int n5 = n3 + 1;
            System.arraycopy(ljff3, n3, ljff3, n5, ljii - n3);
            final Object[] lji3 = this.LJI;
            System.arraycopy(lji3, n3 << 1, lji3, n5 << 1, this.LJII - n3 << 1);
        }
        final int ljii2 = this.LJII;
        if (ljii == ljii2) {
            final int[] ljff4 = this.LJFF;
            if (n3 < ljff4.length) {
                ljff4[n3] = hashCode;
                final Object[] lji4 = this.LJI;
                final int n6 = n3 << 1;
                lji4[n6] = k;
                lji4[n6 + 1] = v;
                this.LJII = ljii2 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }
    
    public V putIfAbsent(final K k, final V v) {
        Object o;
        if ((o = this.get(k)) == null) {
            o = this.put(k, v);
        }
        return (V)o;
    }
    
    public V remove(final Object o) {
        final int liz = this.LIZ(o);
        if (liz >= 0) {
            return this.LIZLLL(liz);
        }
        return null;
    }
    
    public boolean remove(Object lizj, final Object o) {
        final int liz = this.LIZ(lizj);
        if (liz >= 0) {
            lizj = this.LIZJ(liz);
            if (o == lizj || (o != null && o.equals(lizj))) {
                this.LIZLLL(liz);
                return true;
            }
        }
        return false;
    }
    
    public V replace(final K k, final V v) {
        final int liz = this.LIZ(k);
        if (liz >= 0) {
            return this.LIZ(liz, v);
        }
        return null;
    }
    
    public boolean replace(final K k, final V v, final V v2) {
        final int liz = this.LIZ(k);
        if (liz >= 0) {
            final V lizj = this.LIZJ(liz);
            if (lizj == v || (v != null && v.equals(lizj))) {
                this.LIZ(liz, v2);
                return true;
            }
        }
        return false;
    }
    
    public int size() {
        return this.LJII;
    }
    
    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.LJII * 28);
        sb.append('{');
        for (int i = 0; i < this.LJII; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            final K liziz = this.LIZIZ(i);
            if (liziz != this) {
                sb.append(liziz);
            }
            else {
                sb.append("(this Map)");
            }
            sb.append('=');
            final V lizj = this.LIZJ(i);
            if (lizj != this) {
                sb.append(lizj);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
