// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$LayoutParams;
import kotlin.jvm.internal.n;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 1xy extends 1ib
{
    public 1ib LIZ;
    public final float LIZIZ;
    public final int LIZJ;
    public boolean LJ;
    
    static {
        Covode.recordClassIndex(8038);
    }
    
    public 1xy(final Context context, final AttributeSet set) {
        CTM.LIZ((Object)context);
        this(context, set, (byte)0);
    }
    
    public 1xy(final Context context, final AttributeSet set, final byte b) {
        CTM.LIZ((Object)context);
        super(context, set, 0);
        final float n = (float)0cB.LIZ(1.0f);
        this.LIZIZ = n;
        final int liziz = 0cB.LIZIZ(2131100847);
        this.LIZJ = liziz;
        final 1ib liz = new 1ib(context, set, 0);
        this.LIZ = liz;
        final TextPaint paint = liz.getPaint();
        if (paint != null) {
            paint.setStrokeWidth(n);
            paint.setStyle(Paint$Style.FILL_AND_STROKE);
        }
        final 1ib liz2 = this.LIZ;
        if (liz2 != null) {
            liz2.setTextColor(liziz);
        }
        final 1ib liz3 = this.LIZ;
        if (liz3 != null) {
            liz3.setGravity(this.getGravity());
        }
    }
    
    public final boolean getStrokeEnable() {
        return this.LJ;
    }
    
    public final void onDraw(final Canvas canvas) {
        if (this.LJ) {
            final 1ib liz = this.LIZ;
            if (liz != null) {
                liz.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }
    
    @Override
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final 1ib liz = this.LIZ;
        if (liz != null) {
            liz.layout(n, n2, n3, n4);
        }
        super.onLayout(b, n, n2, n3, n4);
    }
    
    @Override
    public final void onMeasure(final int n, final int n2) {
        final 1ib liz = this.LIZ;
        if (liz != null) {
            if (n.LIZ((Object)liz.getText(), (Object)this.getText()) ^ true) {
                liz.setText(this.getText());
                this.postInvalidate();
            }
            liz.measure(n, n2);
        }
        super.onMeasure(n, n2);
    }
    
    public final void setLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        final 1ib liz = this.LIZ;
        if (liz != null) {
            liz.setLayoutParams(viewGroup$LayoutParams);
        }
        super.setLayoutParams(viewGroup$LayoutParams);
    }
    
    public final void setStrokeEnable(final boolean lj) {
        this.LJ = lj;
    }
    
    @Override
    public final void setTextSize(final int n, final float n2) {
        final 1ib liz = this.LIZ;
        if (liz != null) {
            liz.setTextSize(n, n2);
        }
        super.setTextSize(n, n2);
    }
    
    public final void setVisibility(final int n) {
        final 1ib liz = this.LIZ;
        if (liz != null) {
            liz.setVisibility(n);
        }
        super.setVisibility(n);
    }
}
