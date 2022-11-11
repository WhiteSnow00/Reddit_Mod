// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;

public abstract class 0hz
{
    static {
        Covode.recordClassIndex(6603);
    }
    
    public static final class a extends 0hz
    {
        public final boolean LIZ;
        public final String LIZIZ;
        
        static {
            Covode.recordClassIndex(6604);
        }
        
        public a(final boolean liz, final String liziz) {
            CTM.LIZ((Object)liziz);
            super((byte)0);
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this != o) {
                if (o instanceof a) {
                    final a a = (a)o;
                    if (this.LIZ == a.LIZ && n.LIZ((Object)this.LIZIZ, (Object)a.LIZIZ)) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        
        @Override
        public final int hashCode() {
            int liz;
            if ((liz = (this.LIZ ? 1 : 0)) != 0) {
                liz = 1;
            }
            final String liziz = this.LIZIZ;
            int hashCode;
            if (liziz != null) {
                hashCode = liziz.hashCode();
            }
            else {
                hashCode = 0;
            }
            return liz * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("FetchError(noAvailableData=");
            sb.append(this.LIZ);
            sb.append(", errorMsg=");
            sb.append(this.LIZIZ);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b extends 0hz
    {
        public final List<1Km<LiveEffect>> LIZ;
        
        static {
            Covode.recordClassIndex(6605);
        }
        
        public b(final List<1Km<LiveEffect>> liz) {
            CTM.LIZ((Object)liz);
            super((byte)0);
            this.LIZ = liz;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && n.LIZ((Object)this.LIZ, (Object)((b)o).LIZ));
        }
        
        @Override
        public final int hashCode() {
            final List<1Km<LiveEffect>> liz = this.LIZ;
            if (liz != null) {
                return liz.hashCode();
            }
            return 0;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("LiveEffectPanelList(effectPanelList=");
            sb.append(this.LIZ);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c extends 0hz
    {
        public static final c LIZ;
        
        static {
            Covode.recordClassIndex(6606);
            LIZ = new c();
        }
        
        public c() {
            super((byte)0);
        }
    }
}
