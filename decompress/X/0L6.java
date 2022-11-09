// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.live.liveinteract.cohost.business.contract.InteractDialogFragmentBaseContract;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class 0l6
{
    static {
        Covode.recordClassIndex(7321);
    }
    
    public static final class a
    {
        public String LIZ;
        public int LIZIZ;
        public boolean LIZJ;
        public View LIZLLL;
        public View LJ;
        public View LJFF;
        public boolean LJI;
        public QgG<2P9> LJII;
        public QgG<2P9> LJIIIIZZ;
        public boolean LJIIIZ;
        
        static {
            Covode.recordClassIndex(7322);
        }
        
        public a() {
            this.LIZ = "";
            this.LJI = true;
            this.LJIIIZ = true;
        }
        
        public final a LIZ(final String liz) {
            CTM.LIZ((Object)liz);
            this.LIZ = liz;
            return this;
        }
    }
    
    public interface b
    {
        default static {
            Covode.recordClassIndex(7323);
        }
        
        boolean LIZ();
        
        boolean LIZ(final 1OY.a p0, final InteractDialogFragmentBaseContract.b p1);
        
        InteractDialogFragmentBaseContract.AbsView<?> LIZIZ();
        
        void LIZJ();
    }
    
    public interface c
    {
        default static {
            Covode.recordClassIndex(7324);
        }
        
        DataChannel LJFF();
    }
}
