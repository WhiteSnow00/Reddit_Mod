// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Canvas;
import android.graphics.Paint$FontMetricsInt;
import android.graphics.Paint;
import com.bytedance.covode.number.Covode;
import android.content.Context;

public abstract class 106
{
    public boolean LIZ;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public Runnable LJIIJJI;
    public Runnable LJIIL;
    public final Context LJIILIIL;
    
    static {
        Covode.recordClassIndex(10665);
    }
    
    public 106(final Context ljiiliil) {
        CTM.LIZ((Object)ljiiliil);
        this.LJIILIIL = ljiiliil;
        this.LJIIIIZZ = -1;
        this.LJIIIZ = ljiiliil.getResources().getDimensionPixelSize(2131166230);
        this.LJIIJ = 8;
    }
    
    public abstract int LIZ(final Paint p0);
    
    public int LIZ(final Paint paint, final Paint$FontMetricsInt paint$FontMetricsInt) {
        CTM.LIZ((Object)paint);
        if (paint$FontMetricsInt != null) {
            final Paint$FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            final int bottom = fontMetricsInt.bottom;
            final int top = fontMetricsInt.top;
            final int n = this.LJIIIZ / 2;
            final int n2 = (bottom - top) / 4;
            final int n3 = n - n2;
            final int n4 = -(n + n2);
            paint$FontMetricsInt.ascent = n4;
            paint$FontMetricsInt.top = n4;
            paint$FontMetricsInt.bottom = n3;
            paint$FontMetricsInt.descent = n3;
        }
        if (this.LJIIIIZZ < 0) {
            this.LJIIIIZZ = this.LIZ(paint);
        }
        return this.LJIIIIZZ;
    }
    
    public abstract void LIZ(final Canvas p0, final Paint p1);
    
    public final int LIZIZ(final Paint paint) {
        CTM.LIZ((Object)paint);
        if (this.LJIIIIZZ < 0) {
            this.LJIIIIZZ = this.LIZ(paint);
        }
        return this.LJIIIIZZ;
    }
    
    public final void LIZIZ(final Canvas canvas, final Paint paint) {
        CTM.LIZ((Object)canvas, (Object)paint);
        this.LIZ(canvas, paint);
        final Runnable ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.run();
        }
        if (!this.LIZ) {
            this.LIZ = true;
            final Runnable ljiil = this.LJIIL;
            if (ljiil != null) {
                ljiil.run();
            }
        }
    }
}
