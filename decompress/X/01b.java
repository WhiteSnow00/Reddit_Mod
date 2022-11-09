// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import com.bytedance.covode.number.Covode;
import java.util.WeakHashMap;
import java.util.Map;

public class 01b<K, V> implements Iterable<Map.Entry<K, V>>
{
    public c<K, V> LIZIZ;
    public c<K, V> LIZJ;
    public WeakHashMap<f<K, V>, Boolean> LIZLLL;
    public int LJ;
    
    static {
        Covode.recordClassIndex(193);
    }
    
    public 01b() {
        this.LIZLLL = new WeakHashMap<f<K, V>, Boolean>();
        this.LJ = 0;
    }
    
    public c<K, V> LIZ(final K k) {
        c<K, V> c;
        for (c = this.LIZIZ; c != null && !c.LIZ.equals(k); c = c.LIZJ) {}
        return c;
    }
    
    public final d LIZ() {
        final d d = new d();
        this.LIZLLL.put((f<K, V>)d, false);
        return d;
    }
    
    public V LIZ(final K k, final V v) {
        final c<K, V> liz = this.LIZ(k);
        if (liz != null) {
            return liz.LIZIZ;
        }
        this.LIZIZ(k, v);
        return null;
    }
    
    public final c<K, V> LIZIZ(final K k, final V v) {
        final c c = new c((K)k, (V)v);
        ++this.LJ;
        final c<K, V> lizj = this.LIZJ;
        if (lizj == null) {
            this.LIZIZ = c;
            return this.LIZJ = c;
        }
        lizj.LIZJ = c;
        c.LIZLLL = (c<K, V>)this.LIZJ;
        return this.LIZJ = c;
    }
    
    public V LIZIZ(final K k) {
        final c<K, V> liz = this.LIZ(k);
        if (liz == null) {
            return null;
        }
        --this.LJ;
        if (!this.LIZLLL.isEmpty()) {
            final Iterator<f<K, V>> iterator = this.LIZLLL.keySet().iterator();
            while (iterator.hasNext()) {
                iterator.next().a_((c)liz);
            }
        }
        if (liz.LIZLLL != null) {
            liz.LIZLLL.LIZJ = liz.LIZJ;
        }
        else {
            this.LIZIZ = liz.LIZJ;
        }
        if (liz.LIZJ != null) {
            liz.LIZJ.LIZLLL = liz.LIZLLL;
        }
        else {
            this.LIZJ = liz.LIZLLL;
        }
        liz.LIZJ = null;
        liz.LIZLLL = null;
        return liz.LIZIZ;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof 01b)) {
            return false;
        }
        final 01b 01b = (01b)o;
        if (this.LJ != 01b.LJ) {
            return false;
        }
        final Iterator<Map.Entry<K, V>> iterator = this.iterator();
        final Iterator iterator2 = 01b.iterator();
        while (iterator.hasNext() && iterator2.hasNext()) {
            final Map.Entry entry = iterator.next();
            final Object next = iterator2.next();
            if (entry == null) {
                if (next == null) {
                    continue;
                }
            }
            else if (entry.equals(next)) {
                continue;
            }
            return false;
        }
        return !iterator.hasNext() && !iterator2.hasNext();
    }
    
    @Override
    public int hashCode() {
        final Iterator<Map.Entry<K, V>> iterator = this.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n += ((Map.Entry)iterator.next()).hashCode();
        }
        return n;
    }
    
    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        final a a = new a<K, V>(this.LIZIZ, this.LIZJ);
        this.LIZLLL.put((f<K, V>)a, false);
        return (Iterator<Map.Entry<K, V>>)a;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        final Iterator<Map.Entry<K, V>> iterator = this.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next().toString());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    public static final class c<K, V> implements Entry<K, V>
    {
        public final K LIZ;
        public final V LIZIZ;
        public c<K, V> LIZJ;
        public c<K, V> LIZLLL;
        
        static {
            Covode.recordClassIndex(196);
        }
        
        public c(final K liz, final V liziz) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            return this.LIZ.equals(c.LIZ) && this.LIZIZ.equals(c.LIZIZ);
        }
        
        @Override
        public final K getKey() {
            return this.LIZ;
        }
        
        @Override
        public final V getValue() {
            return this.LIZIZ;
        }
        
        @Override
        public final int hashCode() {
            return this.LIZ.hashCode() ^ this.LIZIZ.hashCode();
        }
        
        @Override
        public final V setValue(final V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.LIZ);
            sb.append("=");
            sb.append(this.LIZIZ);
            return sb.toString();
        }
    }
    
    public interface f<K, V>
    {
        default static {
            Covode.recordClassIndex(199);
        }
        
        void a_(final c<K, V> p0);
    }
    
    public final class d implements f<K, V>, Iterator<Map.Entry<K, V>>
    {
        public c<K, V> LIZIZ;
        public boolean LIZJ;
        
        static {
            Covode.recordClassIndex(197);
        }
        
        public d() {
            this.LIZJ = true;
        }
        
        @Override
        public final void a_(final c<K, V> c) {
            final c<K, V> liziz = this.LIZIZ;
            if (c == liziz) {
                final c<K, V> lizlll = liziz.LIZLLL;
                this.LIZIZ = lizlll;
                this.LIZJ = (lizlll == null);
            }
        }
        
        @Override
        public final boolean hasNext() {
            if (this.LIZJ) {
                return 01b.this.LIZIZ != null;
            }
            final c<K, V> liziz = this.LIZIZ;
            return liziz != null && liziz.LIZJ != null;
        }
    }
    
    public abstract static class e<K, V> implements f<K, V>, Iterator<Map.Entry<K, V>>
    {
        public c<K, V> LIZ;
        public c<K, V> LIZIZ;
        
        static {
            Covode.recordClassIndex(198);
        }
        
        public e(final c<K, V> liziz, final c<K, V> liz) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
        
        private c<K, V> LIZ() {
            final c<K, V> liziz = this.LIZIZ;
            final c<K, V> liz = this.LIZ;
            if (liziz == liz || liz == null) {
                return null;
            }
            return this.LIZ(liziz);
        }
        
        public abstract c<K, V> LIZ(final c<K, V> p0);
        
        public abstract c<K, V> LIZIZ(final c<K, V> p0);
        
        @Override
        public final void a_(final c<K, V> c) {
            if (this.LIZ == c && c == this.LIZIZ) {
                this.LIZIZ = null;
                this.LIZ = null;
            }
            final c<K, V> liz = this.LIZ;
            if (liz == c) {
                this.LIZ = this.LIZIZ(liz);
            }
            if (this.LIZIZ == c) {
                this.LIZIZ = this.LIZ();
            }
        }
        
        @Override
        public boolean hasNext() {
            return this.LIZIZ != null;
        }
    }
    
    public static final class a<K, V> extends e<K, V>
    {
        static {
            Covode.recordClassIndex(194);
        }
        
        public a(final c<K, V> c, final c<K, V> c2) {
            super(c, c2);
        }
        
        @Override
        public final c<K, V> LIZ(final c<K, V> c) {
            return c.LIZJ;
        }
        
        @Override
        public final c<K, V> LIZIZ(final c<K, V> c) {
            return c.LIZLLL;
        }
    }
    
    public static final class b<K, V> extends e<K, V>
    {
        static {
            Covode.recordClassIndex(195);
        }
        
        public b(final c<K, V> c, final c<K, V> c2) {
            super(c, c2);
        }
        
        @Override
        public final c<K, V> LIZ(final c<K, V> c) {
            return c.LIZLLL;
        }
        
        @Override
        public final c<K, V> LIZIZ(final c<K, V> c) {
            return c.LIZJ;
        }
    }
}
