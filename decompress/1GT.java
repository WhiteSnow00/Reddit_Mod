// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import com.bytedance.covode.number.Covode;
import android.graphics.PointF;
import android.graphics.Path;

public final class 1gt implements 1BH, 1BI, a
{
    public final Path LIZ;
    public final String LIZIZ;
    public final 0LK LIZJ;
    public final 0JP<?, PointF> LIZLLL;
    public final 0JP<?, PointF> LJ;
    public final 1BW LJFF;
    public 1BJ LJI;
    public 0JH LJII;
    public boolean LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(2232);
    }
    
    public 1gt(final 0LK lizj, final 1hH 1hH, final 1BW ljff) {
        this.LIZ = new Path();
        if (0KM.a.LIZ) {
            this.LJII = new 0JH();
        }
        this.LIZIZ = ljff.LIZ;
        this.LIZJ = lizj;
        final 0JP<PointF, PointF> liz = ljff.LIZJ.LIZ();
        this.LIZLLL = liz;
        final 0JP<PointF, PointF> liz2 = ljff.LIZIZ.LIZ();
        this.LJ = liz2;
        this.LJFF = ljff;
        1hH.LIZ(liz);
        1hH.LIZ(liz2);
        liz.LIZ((0JP.a)this);
        liz2.LIZ((0JP.a)this);
    }
    
    @Override
    public final void LIZ() {
        this.LJIIIIZZ = false;
        this.LIZJ.invalidateSelf();
    }
    
    @Override
    public final void LIZ(final 0K3 0k3, final int n, final List<0K3> list, final 0K3 0k4) {
        0L4.LIZ(0k3, n, list, 0k4, this);
    }
    
    @Override
    public final <T> void LIZ(final T t, final 0LI<T> 0li) {
        if (t == 0LS.LJI) {
            this.LIZLLL.LIZ((0LI<PointF>)0li);
            return;
        }
        if (t == 0LS.LJII) {
            this.LJ.LIZ((0LI<PointF>)0li);
        }
    }
    
    @Override
    public final void LIZ(final List<0JI> list, final List<0JI> list2) {
        for (int i = 0; i < list.size(); ++i) {
            final 0JI 0ji = list.get(i);
            if (0ji instanceof 1BJ) {
                final 1BJ lji = (1BJ)0ji;
                if (lji.LIZ == 1Bh.a.Simultaneously) {
                    if (0KM.a.LIZ) {
                        final 0JH ljii = this.LJII;
                        if (ljii != null) {
                            ljii.LIZ(lji);
                            lji.LIZ(this);
                            continue;
                        }
                    }
                    (this.LJI = lji).LIZ(this);
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
        if (this.LJIIIIZZ) {
            return this.LIZ;
        }
        this.LIZ.reset();
        final PointF pointF = this.LIZLLL.LJFF();
        final float n = pointF.x / 2.0f;
        final float n2 = pointF.y / 2.0f;
        final float n3 = n * 0.55228f;
        final float n4 = 0.55228f * n2;
        this.LIZ.reset();
        if (this.LJFF.LIZLLL) {
            final Path liz = this.LIZ;
            final float n5 = -n2;
            liz.moveTo(0.0f, n5);
            final Path liz2 = this.LIZ;
            final float n6 = 0.0f - n3;
            final float n7 = -n;
            final float n8 = 0.0f - n4;
            liz2.cubicTo(n6, n5, n7, n8, n7, 0.0f);
            final Path liz3 = this.LIZ;
            final float n9 = n4 + 0.0f;
            liz3.cubicTo(n7, n9, n6, n2, 0.0f, n2);
            final Path liz4 = this.LIZ;
            final float n10 = n3 + 0.0f;
            liz4.cubicTo(n10, n2, n, n9, n, 0.0f);
            this.LIZ.cubicTo(n, n8, n10, n5, 0.0f, n5);
        }
        else {
            final Path liz5 = this.LIZ;
            final float n11 = -n2;
            liz5.moveTo(0.0f, n11);
            final Path liz6 = this.LIZ;
            final float n12 = n3 + 0.0f;
            final float n13 = 0.0f - n4;
            liz6.cubicTo(n12, n11, n, n13, n, 0.0f);
            final Path liz7 = this.LIZ;
            final float n14 = n4 + 0.0f;
            liz7.cubicTo(n, n14, n12, n2, 0.0f, n2);
            final Path liz8 = this.LIZ;
            final float n15 = 0.0f - n3;
            final float n16 = -n;
            liz8.cubicTo(n15, n2, n16, n14, n16, 0.0f);
            this.LIZ.cubicTo(n16, n13, n15, n11, 0.0f, n11);
        }
        final PointF pointF2 = this.LJ.LJFF();
        this.LIZ.offset(pointF2.x, pointF2.y);
        this.LIZ.close();
        while (true) {
            Label_0255: {
                if (!0KM.a.LIZ) {
                    break Label_0255;
                }
                final 0JH ljii = this.LJII;
                if (ljii == null) {
                    break Label_0255;
                }
                ljii.LIZ(this.LIZ);
                this.LJIIIIZZ = true;
                return this.LIZ;
            }
            0L9.LIZ(this.LIZ, this.LJI);
            continue;
        }
    }
}
