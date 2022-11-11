// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

public final class 0b7
{
    public final List<0b6> LIZ;
    public int LIZIZ;
    public final boolean LIZJ;
    public final DataChannel LIZLLL;
    public final SRS<Boolean, 2P9> LJ;
    
    static {
        Covode.recordClassIndex(5609);
    }
    
    public 0b7(final DataChannel lizlll, final SRS<? super Boolean, 2P9> lj) {
        CTM.LIZ((Object)lizlll, (Object)lj);
        this.LIZLLL = lizlll;
        this.LJ = (SRS<Boolean, 2P9>)lj;
        this.LIZ = new ArrayList<0b6>();
    }
    
    private final void LIZLLL() {
        final int liziz = this.LIZIZ + 1;
        this.LIZIZ = liziz;
        if (liziz == this.LIZ.size()) {
            this.LJ.invoke((Object)true);
        }
    }
    
    private final void LJ() {
        final int liziz = this.LIZIZ - 1;
        this.LIZIZ = liziz;
        if (liziz != this.LIZ.size()) {
            this.LJ.invoke((Object)false);
        }
    }
    
    public final void LIZ(final 0b6 0b6) {
        CTM.LIZ((Object)0b6);
        CTM.LIZ((Object)this);
        0b6.LIZLLL = this;
        final DataChannel lizlll = this.LIZLLL;
        CTM.LIZ((Object)lizlll);
        0b6.LIZJ = lizlll;
        this.LIZ.add(0b6);
        this.LIZ(0b6.LJ);
    }
    
    public final void LIZ(final boolean b) {
        if (b ^ true) {
            this.LIZLLL();
        }
        else {
            this.LJ();
        }
        if (this.LIZJ) {
            for (final 0b6 0b6 : this.LIZ) {
                final StringBuilder sb = new StringBuilder();
                sb.append(FIV.LIZ.LIZ((Class)0b6.getClass()).LIZIZ());
                sb.append(": ");
                sb.append(0b6.LJ);
                0ba.LIZ(6, "SurveyEvasion", sb.toString());
            }
        }
    }
    
    public final boolean LIZ() {
        return this.LIZIZ == this.LIZ.size();
    }
    
    public final void LIZIZ() {
        final Iterator<Object> iterator = this.LIZ.iterator();
        while (iterator.hasNext()) {
            iterator.next().LIZ();
        }
    }
    
    public final void LIZJ() {
        for (final 0b6 0b6 : this.LIZ) {
            final DataChannel lizj = 0b6.LIZJ;
            if (lizj != null) {
                lizj.LIZIZ((Object)0b6);
            }
            0b6.LIZIZ.dispose();
        }
    }
}
