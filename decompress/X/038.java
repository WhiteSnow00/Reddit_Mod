// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.widget.SeekBar;

public class 038 extends SeekBar
{
    public final 13c LIZ;
    
    static {
        Covode.recordClassIndex(406);
    }
    
    public 038(final Context context) {
        this(context, null);
    }
    
    public 038(final Context context, final AttributeSet set) {
        this(context, set, 2130970937);
    }
    
    public 038(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        (this.LIZ = new 13c(this)).LIZ(set, n);
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        final 13c liz = this.LIZ;
        final Drawable lizj = liz.LIZJ;
        if (lizj != null && lizj.isStateful() && lizj.setState(liz.LIZIZ.getDrawableState())) {
            liz.LIZIZ.invalidateDrawable(lizj);
        }
    }
    
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final 13c liz = this.LIZ;
        if (liz.LIZJ != null) {
            liz.LIZJ.jumpToCurrentState();
        }
    }
    
    public void onDraw(final Canvas canvas) {
        synchronized (this) {
            super.onDraw(canvas);
            final 13c liz = this.LIZ;
            if (liz.LIZJ != null) {
                final int max = liz.LIZIZ.getMax();
                int n = 1;
                if (max > 1) {
                    final int intrinsicWidth = liz.LIZJ.getIntrinsicWidth();
                    final int intrinsicHeight = liz.LIZJ.getIntrinsicHeight();
                    int n2;
                    if (intrinsicWidth >= 0) {
                        n2 = intrinsicWidth / 2;
                    }
                    else {
                        n2 = 1;
                    }
                    if (intrinsicHeight >= 0) {
                        n = intrinsicHeight / 2;
                    }
                    liz.LIZJ.setBounds(-n2, -n, n2, n);
                    final float n3 = (liz.LIZIZ.getWidth() - liz.LIZIZ.getPaddingLeft() - liz.LIZIZ.getPaddingRight()) / (float)max;
                    final int save = canvas.save();
                    canvas.translate((float)liz.LIZIZ.getPaddingLeft(), (float)(liz.LIZIZ.getHeight() / 2));
                    for (int i = 0; i <= max; ++i) {
                        liz.LIZJ.draw(canvas);
                        canvas.translate(n3, 0.0f);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
    }
}
