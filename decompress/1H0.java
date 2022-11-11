// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Path$FillType;
import java.util.List;
import com.bytedance.covode.number.Covode;
import android.graphics.Path;

public final class 1h0 implements 1BI, a
{
    public final Path LIZ;
    public final String LIZIZ;
    public final 0LK LIZJ;
    public final 0JP<?, Path> LIZLLL;
    public boolean LJ;
    public 1BJ LJFF;
    public 0JH LJI;
    
    static {
        Covode.recordClassIndex(2245);
    }
    
    public 1h0(final 0LK lizj, final 1hH 1hH, final 1Bf 1Bf) {
        this.LIZ = new Path();
        if (0KM.a.LIZ) {
            this.LJI = new 0JH();
        }
        this.LIZIZ = 1Bf.LIZ;
        this.LIZJ = lizj;
        final 0JP<0Jo, Path> liz = 1Bf.LIZIZ.LIZ();
        1hH.LIZ(this.LIZLLL = liz);
        liz.LIZ((0JP.a)this);
    }
    
    @Override
    public final void LIZ() {
        this.LJ = false;
        this.LIZJ.invalidateSelf();
    }
    
    @Override
    public final void LIZ(final List<0JI> list, final List<0JI> list2) {
        for (int i = 0; i < list.size(); ++i) {
            final 0JI 0ji = list.get(i);
            if (0ji instanceof 1BJ) {
                final 1BJ ljff = (1BJ)0ji;
                if (ljff.LIZ == 1Bh.a.Simultaneously) {
                    if (0KM.a.LIZ) {
                        final 0JH lji = this.LJI;
                        if (lji != null) {
                            lji.LIZ(ljff);
                            ljff.LIZ(this);
                            continue;
                        }
                    }
                    (this.LJFF = ljff).LIZ(this);
                }
            }
        }
    }
    
    @Override
    public final String LIZIZ() {
        return this.LIZIZ;
    }
    
    @Override
    public final Path LJ() {
        if (this.LJ) {
            return this.LIZ;
        }
        this.LIZ.reset();
        this.LIZ.set((Path)this.LIZLLL.LJFF());
        this.LIZ.setFillType(Path$FillType.EVEN_ODD);
        while (true) {
            Label_0079: {
                if (!0KM.a.LIZ) {
                    break Label_0079;
                }
                final 0JH lji = this.LJI;
                if (lji == null) {
                    break Label_0079;
                }
                lji.LIZ(this.LIZ);
                this.LJ = true;
                return this.LIZ;
            }
            0L9.LIZ(this.LIZ, this.LJFF);
            continue;
        }
    }
}
