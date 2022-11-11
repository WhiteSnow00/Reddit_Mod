// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Paint;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.Matrix;
import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.RadialGradient;
import android.graphics.LinearGradient;

public final class 1nj extends 1gr
{
    public final String LIZJ;
    public final 04v<LinearGradient> LIZLLL;
    public final 04v<RadialGradient> LJ;
    public final RectF LJFF;
    public final 0Jj LJI;
    public final int LJII;
    public final 0JP<0Ji, 0Ji> LJIIIIZZ;
    public final 0JP<PointF, PointF> LJIIIZ;
    public final 0JP<PointF, PointF> LJIIJ;
    
    static {
        Covode.recordClassIndex(2235);
    }
    
    public 1nj(final 0LK 0lk, final 1hH 1hH, final 1BY 1by) {
        super(0lk, 1hH, 1by.LJII.toPaintCap(), 1by.LJIIIIZZ.toPaintJoin(), 1by.LJIIIZ, 1by.LIZLLL, 1by.LJI, 1by.LJIIJ, 1by.LJIIJJI);
        this.LIZLLL = new 04v<LinearGradient>();
        this.LJ = new 04v<RadialGradient>();
        this.LJFF = new RectF();
        this.LIZJ = 1by.LIZ;
        this.LJI = 1by.LIZIZ;
        this.LJII = (int)(0lk.LIZ.LIZ() / 32.0f);
        final 0JP<0Ji, 0Ji> liz = 1by.LIZJ.LIZ();
        (this.LJIIIIZZ = liz).LIZ((0JP.a)this);
        1hH.LIZ(liz);
        final 0JP<PointF, PointF> liz2 = 1by.LJ.LIZ();
        (this.LJIIIZ = liz2).LIZ((0JP.a)this);
        1hH.LIZ(liz2);
        final 0JP<PointF, PointF> liz3 = 1by.LJFF.LIZ();
        (this.LJIIJ = liz3).LIZ((0JP.a)this);
        1hH.LIZ(liz3);
    }
    
    private int LIZJ() {
        final int round = Math.round(this.LJIIIZ.LIZJ * this.LJII);
        final int round2 = Math.round(this.LJIIJ.LIZJ * this.LJII);
        final int round3 = Math.round(this.LJIIIIZZ.LIZJ * this.LJII);
        int n;
        if (round != 0) {
            n = round * 527;
        }
        else {
            n = 17;
        }
        int n2 = n;
        if (round2 != 0) {
            n2 = n * 31 * round2;
        }
        int n3 = n2;
        if (round3 != 0) {
            n3 = n2 * 31 * round3;
        }
        return n3;
    }
    
    @Override
    public final void LIZ(final Canvas canvas, final Matrix matrix, final int n) {
        this.LIZ(this.LJFF, matrix);
        if (this.LJI == 0Jj.Linear) {
            final Paint liziz = super.LIZIZ;
            final int lizj = this.LIZJ();
            final 04v<LinearGradient> lizlll = this.LIZLLL;
            final long n2 = lizj;
            Object shader = lizlll.LIZ(n2, null);
            if (shader == null) {
                final PointF pointF = this.LJIIIZ.LJFF();
                final PointF pointF2 = this.LJIIJ.LJFF();
                final 0Ji 0Ji = this.LJIIIIZZ.LJFF();
                shader = new LinearGradient((float)(int)(this.LJFF.left + this.LJFF.width() / 2.0f + pointF.x), (float)(int)(this.LJFF.top + this.LJFF.height() / 2.0f + pointF.y), (float)(int)(this.LJFF.left + this.LJFF.width() / 2.0f + pointF2.x), (float)(int)(this.LJFF.top + this.LJFF.height() / 2.0f + pointF2.y), 0Ji.LIZIZ, 0Ji.LIZ, Shader$TileMode.CLAMP);
                this.LIZLLL.LIZIZ(n2, (LinearGradient)shader);
            }
            liziz.setShader((Shader)shader);
        }
        else {
            final Paint liziz2 = super.LIZIZ;
            final int lizj2 = this.LIZJ();
            final 04v<RadialGradient> lj = this.LJ;
            final long n3 = lizj2;
            Object shader2 = lj.LIZ(n3);
            if (shader2 == null) {
                final PointF pointF3 = this.LJIIIZ.LJFF();
                final PointF pointF4 = this.LJIIJ.LJFF();
                final 0Ji 0Ji2 = this.LJIIIIZZ.LJFF();
                final int[] liziz3 = 0Ji2.LIZIZ;
                final float[] liz = 0Ji2.LIZ;
                final int n4 = (int)(this.LJFF.left + this.LJFF.width() / 2.0f + pointF3.x);
                final int n5 = (int)(this.LJFF.top + this.LJFF.height() / 2.0f + pointF3.y);
                shader2 = new RadialGradient((float)n4, (float)n5, (float)Math.hypot((int)(this.LJFF.left + this.LJFF.width() / 2.0f + pointF4.x) - n4, (int)(this.LJFF.top + this.LJFF.height() / 2.0f + pointF4.y) - n5), liziz3, liz, Shader$TileMode.CLAMP);
                this.LJ.LIZIZ(n3, (RadialGradient)shader2);
            }
            liziz2.setShader((Shader)shader2);
        }
        super.LIZ(canvas, matrix, n);
    }
    
    @Override
    public final String LIZIZ() {
        return this.LIZJ;
    }
}
