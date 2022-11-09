// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;

public final class 0mk
{
    public 1Q5 LIZ;
    public 1QB LIZIZ;
    public 1d6 LIZJ;
    
    static {
        Covode.recordClassIndex(7641);
    }
    
    public 0mk(final a a, final 0CH 0ch) {
        CTM.LIZ((Object)a, (Object)0ch);
        this.LIZJ = new 1d6((byte)0);
        this.LIZ = new 1Q5(a, 0ch, this.LIZJ);
        this.LIZIZ = new 1QB(a, 0ch, this.LIZJ);
    }
    
    public final void LIZ() {
        final StringBuilder sb = new StringBuilder("canLinkCrossRoom = ");
        sb.append(this.LIZ.LJIJ);
        sb.append(" canLinkInRoom = ");
        sb.append(this.LIZIZ.LJI());
        0ba.LIZ(4, "FindCrashLog#NewToolbarInteractBehavior#onBundleLoaded", sb.toString());
        if (this.LIZ.LJIJ && this.LIZIZ.LJI()) {
            this.LIZ(0, 17);
            return;
        }
        if (this.LIZ.LJIJ && !this.LIZIZ.LJI()) {
            this.LIZ(0, 1);
            return;
        }
        if (this.LIZIZ.LJI() && !this.LIZ.LJIJ) {
            this.LIZ(0, 16);
        }
    }
    
    public final void LIZ(final int n, final int n2) {
        if ((n2 & 0x1) == 0x1) {
            this.LIZ.LIZ(n);
        }
        if ((n2 & 0x10) == 0x10) {
            this.LIZIZ.LIZ(n);
        }
    }
    
    public final void LIZ(final boolean b) {
        if (b) {
            this.LIZIZ.LJII();
        }
    }
    
    public final void LIZIZ() {
        final 1dP.a lizj = 1dP.LIZJ;
        final StringBuilder sb = new StringBuilder("on bundle load failed. canLInkCrossRoom");
        sb.append(this.LIZ.LJIJ);
        sb.append(" canLinkInRoom");
        sb.append(this.LIZIZ.LJI());
        lizj.LIZ(sb.toString());
        if (this.LIZ.LJIJ && this.LIZIZ.LJI()) {
            this.LIZ(0, 17);
            return;
        }
        if (this.LIZ.LJIJ && !this.LIZIZ.LJI()) {
            this.LIZ(0, 1);
            return;
        }
        if (this.LIZIZ.LJI() && !this.LIZ.LJIJ) {
            this.LIZ(0, 16);
        }
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(7642);
        }
        
        void LIZLLL(final boolean p0);
        
        void LJIIJJI();
    }
}
