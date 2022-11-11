// 
// Decompiled by Procyon v0.6.0
// 

package z6;

import android.graphics.Paint;
import android.graphics.ColorFilter;
import android.graphics.Color;
import android.graphics.Canvas;
import android.graphics.Matrix;
import q6.g0;
import d7.c;
import android.graphics.Paint$Style;
import com.airbnb.lottie.LottieDrawable;
import t6.r;
import com.airbnb.lottie.model.layer.Layer;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.model.layer.a;

public final class e extends a
{
    public final RectF C;
    public final r6.a D;
    public final float[] E;
    public final Path F;
    public final Layer G;
    public r H;
    
    public e(final LottieDrawable lottieDrawable, final Layer g) {
        super(lottieDrawable, g);
        this.C = new RectF();
        final r6.a d = new r6.a();
        this.D = d;
        this.E = new float[8];
        this.F = new Path();
        this.G = g;
        d.setAlpha(0);
        ((Paint)d).setStyle(Paint$Style.FILL);
        ((Paint)d).setColor(g.l);
    }
    
    @Override
    public final void a(final d7.c c, final Object o) {
        super.a(c, o);
        if (o == g0.K) {
            if (c == null) {
                this.H = null;
            }
            else {
                this.H = new r(c, (Object)null);
            }
        }
    }
    
    @Override
    public final void b(final RectF rectF, final Matrix matrix, final boolean b) {
        super.b(rectF, matrix, b);
        final RectF c = this.C;
        final Layer g = this.G;
        c.set(0.0f, 0.0f, (float)g.j, (float)g.k);
        super.n.mapRect(this.C);
        rectF.set(this.C);
    }
    
    @Override
    public final void k(final Canvas canvas, final Matrix matrix, int alpha) {
        final int alpha2 = Color.alpha(this.G.l);
        if (alpha2 == 0) {
            return;
        }
        final t6.a<Integer, Integer> j = super.w.j;
        int intValue;
        if (j == null) {
            intValue = 100;
        }
        else {
            intValue = j.f();
        }
        alpha = (int)(alpha2 / 255.0f * intValue / 100.0f * (alpha / 255.0f) * 255.0f);
        this.D.setAlpha(alpha);
        final r h = this.H;
        if (h != null) {
            ((Paint)this.D).setColorFilter((ColorFilter)h.f());
        }
        if (alpha > 0) {
            final float[] e = this.E;
            e[1] = (e[0] = 0.0f);
            final Layer g = this.G;
            final float n = (float)g.j;
            e[2] = n;
            e[3] = 0.0f;
            e[4] = n;
            final float n2 = (float)g.k;
            e[5] = n2;
            e[6] = 0.0f;
            e[7] = n2;
            matrix.mapPoints(e);
            this.F.reset();
            final Path f = this.F;
            final float[] e2 = this.E;
            f.moveTo(e2[0], e2[1]);
            final Path f2 = this.F;
            final float[] e3 = this.E;
            f2.lineTo(e3[2], e3[3]);
            final Path f3 = this.F;
            final float[] e4 = this.E;
            f3.lineTo(e4[4], e4[5]);
            final Path f4 = this.F;
            final float[] e5 = this.E;
            f4.lineTo(e5[6], e5[7]);
            final Path f5 = this.F;
            final float[] e6 = this.E;
            f5.lineTo(e6[0], e6[1]);
            this.F.close();
            canvas.drawPath(this.F, (Paint)this.D);
        }
    }
}
