// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 1Y3 implements a<Ipf>
{
    public final /* synthetic */ 24s LIZ;
    public final /* synthetic */ boolean LIZIZ;
    
    static {
        Covode.recordClassIndex(9200);
    }
    
    public 1Y3(final 24s liz, final boolean liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    @Override
    public final void LIZ(final Vxk vxk, final Throwable t) {
        CTM.LIZ((Object)vxk);
        this.LIZ.LJIIIIZZ = false;
        if (t != null && ((GK2)this.LIZ).LJJIL != null) {
            this.LIZ.LIZ(t);
        }
        0xo.LIZJ("LinkIn_leave_Failed", "position:leaveChannel; throwable:".concat(String.valueOf(t)));
        GCe.LIZ().LJJIIZ = false;
        this.LIZ.LIZLLL(this.LIZIZ);
    }
}
