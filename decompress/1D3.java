// 
// Decompiled by Procyon v0.6.0
// 

package X;

import kotlin.jvm.internal.n;
import java.util.LinkedHashMap;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;

public abstract class 1D3 implements 0Oy
{
    public final Map<Object, Object> LIZ;
    public final Map<Object, a> LIZIZ;
    public final Object LIZJ;
    public final List<Object> LIZLLL;
    
    static {
        Covode.recordClassIndex(4080);
    }
    
    public 1D3() {
        this(null, 3);
    }
    
    public 1D3(final Object lizj, final List<?> lizlll) {
        this.LIZJ = lizj;
        this.LIZLLL = (List<Object>)lizlll;
        this.LIZIZ = new LinkedHashMap<Object, a>();
        this.LIZ = new LinkedHashMap<Object, Object>();
    }
    
    public abstract void LIZ(final Object p0, final 0Oc p1);
    
    public abstract void LIZ(final Object p0, final 0Oe p1, final int p2, final int p3);
    
    public abstract void LIZ(final Object p0, final 0Ov p1, final int p2, final int p3);
    
    public void LIZ(final Object o, final 1Cz 1Cz, final 0Ox 0Ox) {
        CTM.LIZ(o, (Object)1Cz, (Object)0Ox);
    }
    
    public void LIZ(final Object o, final 1Cz 1Cz, final Object o2) {
        CTM.LIZ(o, (Object)1Cz, o2);
    }
    
    public abstract void LIZ(final Object p0, final Object p1, final boolean p2, final int p3, final int p4);
    
    @Override
    public void onEvent(final 0Ox 0Ox) {
        CTM.LIZ((Object)0Ox);
        final List<Object> lizlll = this.LIZLLL;
        if (lizlll != null && 0Ox instanceof 0Ox.a.c && lizlll.contains(0Ox.LIZ)) {
            this.LIZ.put(0Ox.LIZ, ((0Ox.a.c)0Ox).LIZLLL);
        }
        final Object lizj = this.LIZJ;
        if (lizj != null && (n.LIZ(lizj, 0Ox.LIZ) ^ true)) {
            return;
        }
        if (0Ox instanceof 0Ox.a.g) {
            final Map<Object, a> liziz = this.LIZIZ;
            final Object liz = 0Ox.LIZ;
            final 1Cz liziz2 = 0Ox.LIZIZ;
            final 0Ox.a.g g = (0Ox.a.g)0Ox;
            liziz.put(liz, new a(liziz2, ((0Ox.a)g).LIZJ));
            this.LIZ(0Ox.LIZ, g.LIZLLL);
            return;
        }
        if (0Ox instanceof 0Ox.a.c) {
            final a value = this.LIZIZ.get(0Ox.LIZ);
            if (value == null) {
                n.LIZIZ();
            }
            final 1Cz liz2 = 0Ox.LIZIZ.LIZ(value.LIZ);
            final long liz3 = liz2.LIZ;
            final long liziz3 = liz2.LIZIZ;
            final Object liz4 = 0Ox.LIZ;
            final 0Ox.a.c c = (0Ox.a.c)0Ox;
            this.LIZ(liz4, c.LIZLLL, c.LJ, (int)liz3, (int)liziz3);
            return;
        }
        if (0Ox instanceof 0Ox.a.b) {
            final a value2 = this.LIZIZ.get(0Ox.LIZ);
            if (value2 == null) {
                n.LIZIZ();
            }
            final 1Cz liz5 = 0Ox.LIZIZ.LIZ(value2.LIZ);
            this.LIZ(0Ox.LIZ, ((0Ox.a.b)0Ox).LIZLLL, (int)liz5.LIZ, (int)liz5.LIZIZ);
            return;
        }
        if (0Ox instanceof 0Ox.a.d) {
            final a value3 = this.LIZIZ.get(0Ox.LIZ);
            if (value3 == null) {
                n.LIZIZ();
            }
            final 1Cz liz6 = 0Ox.LIZIZ.LIZ(value3.LIZ);
            this.LIZ(0Ox.LIZ, ((0Ox.a.d)0Ox).LIZLLL, (int)liz6.LIZ, (int)liz6.LIZIZ);
            return;
        }
        if (0Ox instanceof 0Ox.b) {
            this.LIZ(0Ox.LIZ, 0Ox.LIZIZ, ((0Ox.b)0Ox).LIZJ);
            return;
        }
        this.LIZ(0Ox.LIZ, 0Ox.LIZIZ, 0Ox);
    }
    
    public static final class a
    {
        public final 1Cz LIZ;
        public final Object LIZIZ;
        
        static {
            Covode.recordClassIndex(4081);
        }
        
        public a(final 1Cz liz, final Object liziz) {
            CTM.LIZ((Object)liz);
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this != o) {
                if (o instanceof a) {
                    final a a = (a)o;
                    if (n.LIZ((Object)this.LIZ, (Object)a.LIZ) && n.LIZ(this.LIZIZ, a.LIZIZ)) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        
        @Override
        public final int hashCode() {
            final 1Cz liz = this.LIZ;
            int hashCode = 0;
            int hashCode2;
            if (liz != null) {
                hashCode2 = liz.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            final Object liziz = this.LIZIZ;
            if (liziz != null) {
                hashCode = liziz.hashCode();
            }
            return hashCode2 * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("StartInfo(startTime=");
            sb.append(this.LIZ);
            sb.append(", info=");
            sb.append(this.LIZIZ);
            sb.append(")");
            return sb.toString();
        }
    }
}
