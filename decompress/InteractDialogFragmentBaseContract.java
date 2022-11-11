// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.cohost.business.contract;

import X.FBp;
import X.FG5;
import X.FFb;
import X.FC5;
import X.FFa;
import X.0CC;
import X.FCn;
import X.0ba;
import X.0l6;
import X.1NN;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.covode.number.Covode;

public final class InteractDialogFragmentBaseContract
{
    static {
        Covode.recordClassIndex(7315);
    }
    
    public abstract static class AbsView<T extends a> extends BaseFragment
    {
        public d LIZIZ;
        public T LIZJ;
        public final 1NN LIZLLL;
        
        static {
            Covode.recordClassIndex(7316);
        }
        
        public AbsView() {
            this.LIZLLL = 1NN.LLFF.LIZ();
        }
        
        public abstract 0l6.a LJ();
    }
    
    public abstract static class a<V extends AbsView>
    {
        public final String LJI;
        public V LJII;
        public final 1NN LJIIIIZZ;
        
        static {
            Covode.recordClassIndex(7317);
        }
        
        public a(final V ljii) {
            this.LJI = this.getClass().getSimpleName();
            this.LJIIIIZZ = 1NN.LLFF.LIZ();
            this.LJII = ljii;
        }
        
        public final void LIZ(final Throwable t) {
            0ba.LIZ(6, this.LJI, t.getStackTrace());
        }
        
        public final <R> FCn<R> LJI() {
            final AbsView ljii = this.LJII;
            if (ljii.LIZIZ != null) {
                return (FCn<R>)FFb.LIZ((FG5)FFa.LIZ(ljii.LIZIZ.LJ(), 0CC.a.ON_DESTROY), (FBp)new FC5());
            }
            return null;
        }
        
        public void LJII() {
        }
    }
}
