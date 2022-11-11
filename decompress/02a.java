// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import com.bytedance.covode.number.Covode;
import android.view.animation.Interpolator;
import java.util.ArrayList;

public final class 02a
{
    public final ArrayList<08M> LIZ;
    public 08N LIZIZ;
    public boolean LIZJ;
    public long LIZLLL;
    public Interpolator LJ;
    public final 14X LJFF;
    
    static {
        Covode.recordClassIndex(328);
    }
    
    public 02a() {
        this.LIZLLL = -1L;
        this.LJFF = new 1fU(this);
        this.LIZ = new ArrayList<08M>();
    }
    
    public final 02a LIZ(final 08M 08M) {
        if (!this.LIZJ) {
            this.LIZ.add(08M);
        }
        return this;
    }
    
    public final 02a LIZ(final 08M 08M, final 08M 08M2) {
        this.LIZ.add(08M);
        08M2.LIZIZ(08M.LIZ());
        this.LIZ.add(08M2);
        return this;
    }
    
    public final 02a LIZ(final 08N liziz) {
        if (!this.LIZJ) {
            this.LIZIZ = liziz;
        }
        return this;
    }
    
    public final 02a LIZ(final Interpolator lj) {
        if (!this.LIZJ) {
            this.LJ = lj;
        }
        return this;
    }
    
    public final void LIZ() {
        if (this.LIZJ) {
            return;
        }
        for (final 08M 08M : this.LIZ) {
            final long lizlll = this.LIZLLL;
            if (lizlll >= 0L) {
                08M.LIZ(lizlll);
            }
            final Interpolator lj = this.LJ;
            if (lj != null) {
                08M.LIZ(lj);
            }
            if (this.LIZIZ != null) {
                08M.LIZ(this.LJFF);
            }
            08M.LIZJ();
        }
        this.LIZJ = true;
    }
    
    public final void LIZIZ() {
        if (!this.LIZJ) {
            return;
        }
        final Iterator<08M> iterator = this.LIZ.iterator();
        while (iterator.hasNext()) {
            iterator.next().LIZIZ();
        }
        this.LIZJ = false;
    }
    
    public final 02a LIZJ() {
        if (!this.LIZJ) {
            this.LIZLLL = 250L;
        }
        return this;
    }
}
