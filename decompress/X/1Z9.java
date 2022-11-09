// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 1Z9 implements e
{
    public final /* synthetic */ 1mN LIZ;
    
    static {
        Covode.recordClassIndex(9478);
    }
    
    public 1Z9(final 1mN liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ(final int n, final float n2, final int n3) {
    }
    
    @Override
    public final void LIZIZ(final int n) {
    }
    
    @Override
    public final void f_(final int n) {
        if (this.LIZ.LIZJ) {
            String s;
            if (n != 0) {
                if (n != 1) {
                    s = "";
                }
                else {
                    s = "invitation";
                }
            }
            else {
                s = "guest_list";
            }
            this.LIZ.LIZ(s, "draw");
            this.LIZ.LIZIZ(n);
            return;
        }
        this.LIZ.LIZJ = true;
    }
}
