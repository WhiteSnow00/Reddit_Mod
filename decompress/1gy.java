// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.List;
import com.bytedance.covode.number.Covode;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Path;

public final class 1gy implements 1BH, 1BI, a
{
    public final Path LIZ;
    public final RectF LIZIZ;
    public final String LIZJ;
    public final 0LK LIZLLL;
    public final 0JP<?, PointF> LJ;
    public final 0JP<?, PointF> LJFF;
    public final 0JP<?, Float> LJI;
    public 1BJ LJII;
    public 0JH LJIIIIZZ;
    public boolean LJIIIZ;
    
    static {
        Covode.recordClassIndex(2243);
    }
    
    public 1gy(final 0LK lizlll, final 1hH 1hH, final 1Bb 1Bb) {
        this.LIZ = new Path();
        this.LIZIZ = new RectF();
        if (0KM.a.LIZ) {
            this.LJIIIIZZ = new 0JH();
        }
        this.LIZJ = 1Bb.LIZ;
        this.LIZLLL = lizlll;
        final 0JP<PointF, PointF> liz = 1Bb.LIZIZ.LIZ();
        this.LJ = liz;
        final 0JP<PointF, PointF> liz2 = 1Bb.LIZJ.LIZ();
        this.LJFF = liz2;
        final 0JP<Float, Float> liz3 = 1Bb.LIZLLL.LIZ();
        this.LJI = liz3;
        1hH.LIZ(liz);
        1hH.LIZ(liz2);
        1hH.LIZ(liz3);
        liz.LIZ((0JP.a)this);
        liz2.LIZ((0JP.a)this);
        liz3.LIZ((0JP.a)this);
    }
    
    @Override
    public final void LIZ() {
        this.LJIIIZ = false;
        this.LIZLLL.invalidateSelf();
    }
    
    @Override
    public final void LIZ(final 0K3 0k3, final int n, final List<0K3> list, final 0K3 0k4) {
        0L4.LIZ(0k3, n, list, 0k4, this);
    }
    
    @Override
    public final <T> void LIZ(final T t, final 0LI<T> 0li) {
    }
    
    @Override
    public final void LIZ(final List<0JI> list, final List<0JI> list2) {
        for (int i = 0; i < list.size(); ++i) {
            final 0JI 0ji = list.get(i);
            if (0ji instanceof 1BJ) {
                final 1BJ ljii = (1BJ)0ji;
                if (ljii.LIZ == 1Bh.a.Simultaneously) {
                    if (0KM.a.LIZ) {
                        final 0JH ljiiiizz = this.LJIIIIZZ;
                        if (ljiiiizz != null) {
                            ljiiiizz.LIZ(ljii);
                            ljii.LIZ(this);
                            continue;
                        }
                    }
                    (this.LJII = ljii).LIZ(this);
                }
            }
        }
    }
    
    @Override
    public final String LIZIZ() {
        return this.LIZJ;
    }
    
    @Override
    public final Path LJ() {
        if (this.LJIIIZ) {
            return this.LIZ;
        }
        this.LIZ.reset();
        final PointF pointF = this.LJFF.LJFF();
        final float n = pointF.x / 2.0f;
        final float n2 = pointF.y / 2.0f;
        final 0JP<?, Float> lji = this.LJI;
        float floatValue;
        if (lji == null) {
            floatValue = 0.0f;
        }
        else {
            floatValue = lji.LJFF();
        }
        final float min = Math.min(n, n2);
        float n3 = floatValue;
        if (floatValue > min) {
            n3 = min;
        }
        final PointF pointF2 = this.LJ.LJFF();
        this.LIZ.moveTo(pointF2.x + n, pointF2.y - n2 + n3);
        this.LIZ.lineTo(pointF2.x + n, pointF2.y + n2 - n3);
        final float n4 = fcmpl(n3, 0.0f);
        if (n4 > 0) {
            final RectF liziz = this.LIZIZ;
            final float x = pointF2.x;
            final float n5 = n3 * 2.0f;
            liziz.set(x + n - n5, pointF2.y + n2 - n5, pointF2.x + n, pointF2.y + n2);
            this.LIZ.arcTo(this.LIZIZ, 0.0f, 90.0f, false);
        }
        this.LIZ.lineTo(pointF2.x - n + n3, pointF2.y + n2);
        if (n4 > 0) {
            final RectF liziz2 = this.LIZIZ;
            final float x2 = pointF2.x;
            final float y = pointF2.y;
            final float n6 = n3 * 2.0f;
            liziz2.set(x2 - n, y + n2 - n6, pointF2.x - n + n6, pointF2.y + n2);
            this.LIZ.arcTo(this.LIZIZ, 90.0f, 90.0f, false);
        }
        this.LIZ.lineTo(pointF2.x - n, pointF2.y - n2 + n3);
        if (n4 > 0) {
            final RectF liziz3 = this.LIZIZ;
            final float x3 = pointF2.x;
            final float y2 = pointF2.y;
            final float x4 = pointF2.x;
            final float n7 = n3 * 2.0f;
            liziz3.set(x3 - n, y2 - n2, x4 - n + n7, pointF2.y - n2 + n7);
            this.LIZ.arcTo(this.LIZIZ, 180.0f, 90.0f, false);
        }
        this.LIZ.lineTo(pointF2.x + n - n3, pointF2.y - n2);
        if (n4 > 0) {
            final RectF liziz4 = this.LIZIZ;
            final float x5 = pointF2.x;
            final float n8 = n3 * 2.0f;
            liziz4.set(x5 + n - n8, pointF2.y - n2, pointF2.x + n, pointF2.y - n2 + n8);
            this.LIZ.arcTo(this.LIZIZ, 270.0f, 90.0f, false);
        }
        this.LIZ.close();
        while (true) {
            Label_0545: {
                if (!0KM.a.LIZ) {
                    break Label_0545;
                }
                final 0JH ljiiiizz = this.LJIIIIZZ;
                if (ljiiiizz == null) {
                    break Label_0545;
                }
                ljiiiizz.LIZ(this.LIZ);
                this.LJIIIZ = true;
                return this.LIZ;
            }
            0L9.LIZ(this.LIZ, this.LJII);
            continue;
        }
    }
}
