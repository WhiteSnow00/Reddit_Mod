// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;

public class 04w<K, V>
{
    public final LinkedHashMap<K, V> LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    
    static {
        Covode.recordClassIndex(580);
    }
    
    public 04w(final int lizj) {
        if (lizj > 0) {
            this.LIZJ = lizj;
            this.LIZ = new LinkedHashMap<K, V>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
    
    private int LIZJ(final K k, final V v) {
        final int liziz = this.LIZIZ(k, v);
        if (liziz >= 0) {
            return liziz;
        }
        final StringBuilder sb = new StringBuilder("Negative size: ");
        sb.append(k);
        sb.append("=");
        sb.append(v);
        throw new IllegalStateException(sb.toString());
    }
    
    public final V LIZ(final K k) {
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            final V value = this.LIZ.get(k);
            if (value != null) {
                ++this.LJI;
                return value;
            }
            ++this.LJII;
            monitorexit(this);
            final V lizj = this.LIZJ(k);
            if (lizj == null) {
                return null;
            }
            synchronized (this) {
                ++this.LJ;
                final V put = this.LIZ.put(k, lizj);
                if (put != null) {
                    this.LIZ.put(k, put);
                }
                else {
                    this.LIZIZ += this.LIZJ(k, lizj);
                }
                monitorexit(this);
                if (put != null) {
                    this.LIZ(false, k, lizj, put);
                    return put;
                }
                this.LIZIZ(this.LIZJ);
                return lizj;
            }
        }
    }
    
    public final V LIZ(final K k, final V v) {
        if (k != null && v != null) {
            synchronized (this) {
                ++this.LIZLLL;
                this.LIZIZ += this.LIZJ(k, v);
                final V put = this.LIZ.put(k, v);
                if (put != null) {
                    this.LIZIZ -= this.LIZJ(k, put);
                }
                monitorexit(this);
                if (put != null) {
                    this.LIZ(false, k, put, v);
                }
                this.LIZIZ(this.LIZJ);
                return put;
            }
        }
        throw new NullPointerException("key == null || value == null");
    }
    
    public final void LIZ() {
        this.LIZIZ(-1);
    }
    
    public final void LIZ(final int lizj) {
        if (lizj > 0) {
            synchronized (this) {
                this.LIZJ = lizj;
                monitorexit(this);
                this.LIZIZ(lizj);
                return;
            }
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
    
    public void LIZ(final boolean b, final K k, final V v, final V v2) {
    }
    
    public final int LIZIZ() {
        synchronized (this) {
            return this.LIZIZ;
        }
    }
    
    public int LIZIZ(final K k, final V v) {
        return 1;
    }
    
    public final V LIZIZ(final K k) {
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            final V remove = this.LIZ.remove(k);
            if (remove != null) {
                this.LIZIZ -= this.LIZJ(k, remove);
            }
            monitorexit(this);
            if (remove != null) {
                this.LIZ(false, k, remove, null);
            }
            return remove;
        }
    }
    
    public final void LIZIZ(final int n) {
        while (true) {
            synchronized (this) {
                if (this.LIZIZ < 0 || (this.LIZ.isEmpty() && this.LIZIZ != 0)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(this.getClass().getName());
                    sb.append(".sizeOf() is reporting inconsistent results!");
                    throw new IllegalStateException(sb.toString());
                }
                if (this.LIZIZ <= n || this.LIZ.isEmpty()) {
                    monitorexit(this);
                    return;
                }
                final Map.Entry entry = (Map.Entry)this.LIZ.entrySet().iterator().next();
                final Object key = entry.getKey();
                final Object value = entry.getValue();
                this.LIZ.remove(key);
                this.LIZIZ -= this.LIZJ((K)key, (V)value);
                ++this.LJFF;
                monitorexit(this);
                this.LIZ(true, (K)key, (V)value, null);
            }
        }
    }
    
    public V LIZJ(final K k) {
        return null;
    }
    
    public final Map<K, V> LIZJ() {
        synchronized (this) {
            return new LinkedHashMap<K, V>((Map<? extends K, ? extends V>)this.LIZ);
        }
    }
    
    @Override
    public final String toString() {
        synchronized (this) {
            final int lji = this.LJI;
            final int n = this.LJII + lji;
            int n2;
            if (n != 0) {
                n2 = lji * 100 / n;
            }
            else {
                n2 = 0;
            }
            return 0II.LIZ(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[] { this.LIZJ, this.LJI, this.LJII, n2 });
        }
    }
}
