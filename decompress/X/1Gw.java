// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.ListIterator;
import android.graphics.Path$Op;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import java.util.List;
import android.graphics.Path;

public final class 1gw implements 0JJ, 1BI
{
    public final Path LIZ;
    public final Path LIZIZ;
    public final Path LIZJ;
    public final String LIZLLL;
    public final List<1BI> LJ;
    public final 1BZ LJFF;
    
    static {
        Covode.recordClassIndex(2238);
    }
    
    public 1gw(final 1BZ ljff) {
        this.LIZ = new Path();
        this.LIZIZ = new Path();
        this.LIZJ = new Path();
        this.LJ = new ArrayList<1BI>();
        this.LIZLLL = ljff.LIZ;
        this.LJFF = ljff;
    }
    
    private void LIZ(final Path$Op path$Op) {
        this.LIZIZ.reset();
        this.LIZ.reset();
        for (int i = this.LJ.size() - 1; i > 0; --i) {
            final 1BI 1bi = this.LJ.get(i);
            if (1bi instanceof 1gs) {
                final 1gs 1gs = (1gs)1bi;
                final List<1BI> lizj = 1gs.LIZJ();
                for (int j = lizj.size() - 1; j >= 0; --j) {
                    final Path lj = lizj.get(j).LJ();
                    lj.transform(1gs.LIZLLL());
                    this.LIZIZ.addPath(lj);
                }
            }
            else {
                this.LIZIZ.addPath(1bi.LJ());
            }
        }
        final List<1BI> lj2 = this.LJ;
        int k = 0;
        final 1BI 1bi2 = lj2.get(0);
        if (1bi2 instanceof 1gs) {
            final 1gs 1gs2 = (1gs)1bi2;
            for (List<1BI> lizj2 = 1gs2.LIZJ(); k < lizj2.size(); ++k) {
                final Path lj3 = lizj2.get(k).LJ();
                lj3.transform(1gs2.LIZLLL());
                this.LIZ.addPath(lj3);
            }
        }
        else {
            this.LIZ.set(1bi2.LJ());
        }
        this.LIZJ.op(this.LIZ, this.LIZIZ, path$Op);
    }
    
    @Override
    public final void LIZ(final List<0JI> list, final List<0JI> list2) {
        for (int i = 0; i < this.LJ.size(); ++i) {
            this.LJ.get(i).LIZ(list, list2);
        }
    }
    
    @Override
    public final void LIZ(final ListIterator<0JI> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {}
        while (listIterator.hasPrevious()) {
            final 0JI 0ji = listIterator.previous();
            if (0ji instanceof 1BI) {
                this.LJ.add((1BI)0ji);
                listIterator.remove();
            }
        }
    }
    
    @Override
    public final String LIZIZ() {
        return this.LIZLLL;
    }
    
    @Override
    public final Path LJ() {
        this.LIZJ.reset();
        final int n = 0JK.LIZ[this.LJFF.LIZIZ.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n == 5) {
                            this.LIZ(Path$Op.XOR);
                        }
                    }
                    else {
                        this.LIZ(Path$Op.INTERSECT);
                    }
                }
                else {
                    this.LIZ(Path$Op.REVERSE_DIFFERENCE);
                }
            }
            else {
                this.LIZ(Path$Op.UNION);
            }
        }
        else {
            for (int i = 0; i < this.LJ.size(); ++i) {
                this.LIZJ.addPath(this.LJ.get(i).LJ());
            }
        }
        return this.LIZJ;
    }
}
