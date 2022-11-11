// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import android.util.Pair;
import com.bytedance.covode.number.Covode;

public interface 0bW<K, V>
{
    default static {
        Covode.recordClassIndex(5645);
    }
    
    FBF<Pair<K, a>> LIZ();
    
    V LIZ(final K p0, final 0bY<V> p1);
    
    List<V> LIZ(final K p0, final List<V> p1);
    
    void LIZ(final K p0);
    
    void LIZ(final K p0, final V p1);
    
    List<V> LIZIZ(final K p0);
    
    int LIZJ(final K p0);
    
    void LIZLLL(final K p0);
    
    public static final class a<V>
    {
        public int LIZ;
        public List<V> LIZIZ;
        
        static {
            Covode.recordClassIndex(5646);
        }
        
        public a(final int liz, final List<V> liziz) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
    }
}
