// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public interface 0r0
{
    default static {
        Covode.recordClassIndex(8508);
    }
    
    boolean LIZ(final a p0);
    
    public static final class a
    {
        public final Context LIZ;
        public final DataChannel LIZIZ;
        public final SRS<Integer, 2P9> LIZJ;
        public final QgG<2P9> LIZLLL;
        public int LJ;
        public int LJFF;
        
        static {
            Covode.recordClassIndex(8509);
        }
        
        public a(final Context liz, final DataChannel liziz, final SRS<? super Integer, 2P9> lizj, final QgG<2P9> lizlll, final int lj, final int ljff) {
            CTM.LIZ((Object)lizj, (Object)lizlll);
            this.LIZ = liz;
            this.LIZIZ = liziz;
            this.LIZJ = (SRS<Integer, 2P9>)lizj;
            this.LIZLLL = lizlll;
            this.LJ = lj;
            this.LJFF = ljff;
        }
    }
}
