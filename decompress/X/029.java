// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 029 implements Runnable
{
    public final /* synthetic */ 12Y LIZ;
    
    static {
        Covode.recordClassIndex(267);
    }
    
    public 029(final 12Y liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void run() {
        if ((this.LIZ.LJJ & 0x1) != 0x0) {
            this.LIZ.LJI(0);
        }
        if ((this.LIZ.LJJ & 0x1000) != 0x0) {
            this.LIZ.LJI(108);
        }
        this.LIZ.LJIL = false;
        this.LIZ.LJJ = 0;
    }
}
