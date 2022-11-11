// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Paint$FontMetricsInt;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.graphics.RectF;

public final class 1eP extends 106
{
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public final RectF LJII;
    
    static {
        Covode.recordClassIndex(10673);
    }
    
    public 1eP(final Context context) {
        CTM.LIZ((Object)context);
        super(context);
        this.LIZ = -16777216;
        this.LIZLLL = "";
        this.LJ = -16777216;
        this.LJII = new RectF();
        this.LJI = 400;
    }
    
    @Override
    public final int LIZ(final Paint paint) {
        CTM.LIZ((Object)paint);
        0fd.LIZ(super.LJIILIIL, paint, super.LJIIJ, this.LJI);
        return (int)paint.measureText(this.LIZLLL) + this.LIZJ * 2 + this.LJFF;
    }
    
    @Override
    public final void LIZ(final Canvas canvas, final Paint paint) {
        CTM.LIZ((Object)canvas, (Object)paint);
        paint.setAntiAlias(true);
        this.LJII.bottom = (float)super.LJIIIZ;
        this.LJII.right = (float)super.LJIIIIZZ;
        paint.setColor(this.LIZ);
        final RectF ljii = this.LJII;
        final int liziz = this.LIZIZ;
        canvas.drawRoundRect(ljii, (float)liziz, (float)liziz, paint);
        0fd.LIZ(super.LJIILIIL, paint, super.LJIIJ, this.LJI);
        final Paint$FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        paint.setColor(this.LJ);
        canvas.drawText(this.LIZLLL, (float)this.LIZJ, (super.LJIIIZ - fontMetricsInt.bottom - fontMetricsInt.top) / 2.0f, paint);
    }
    
    public final void LIZ(final String lizlll) {
        CTM.LIZ((Object)lizlll);
        this.LIZLLL = lizlll;
    }
}
