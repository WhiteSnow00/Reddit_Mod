// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Paint;
import com.bytedance.covode.number.Covode;
import android.graphics.Paint$FontMetricsInt;
import android.text.style.ReplacementSpan;

public abstract class 09P extends ReplacementSpan
{
    public final 09L LIZ;
    public short LIZIZ;
    public float LIZJ;
    public final Paint$FontMetricsInt LIZLLL;
    
    static {
        Covode.recordClassIndex(988);
    }
    
    public 09P(final 09L liz) {
        this.LIZLLL = new Paint$FontMetricsInt();
        this.LIZIZ = -1;
        this.LIZJ = 1.0f;
        07U.LIZ(liz, "metadata cannot be null");
        this.LIZ = liz;
    }
    
    public int getSize(final Paint paint, final CharSequence charSequence, final int n, final int n2, final Paint$FontMetricsInt paint$FontMetricsInt) {
        paint.getFontMetricsInt(this.LIZLLL);
        this.LIZJ = Math.abs(this.LIZLLL.descent - this.LIZLLL.ascent) * 1.0f / this.LIZ.LIZ().LJ();
        this.LIZ.LIZ().LJ();
        this.LIZIZ = (short)(this.LIZ.LIZ().LIZLLL() * this.LIZJ);
        if (paint$FontMetricsInt != null) {
            paint$FontMetricsInt.ascent = this.LIZLLL.ascent;
            paint$FontMetricsInt.descent = this.LIZLLL.descent;
            paint$FontMetricsInt.top = this.LIZLLL.top;
            paint$FontMetricsInt.bottom = this.LIZLLL.bottom;
        }
        return this.LIZIZ;
    }
}
