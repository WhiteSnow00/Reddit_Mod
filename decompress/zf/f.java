// 
// Decompiled by Procyon v0.6.0
// 

package zf;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable$Callback;
import android.view.View;
import android.graphics.Canvas;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint$Style;
import vf.j;
import android.graphics.RectF;
import android.graphics.Paint;

public final class f extends vf.f
{
    public final Paint D;
    public final RectF E;
    public int F;
    
    public f() {
        this(null);
    }
    
    public f(j j) {
        if (j == null) {
            j = new j();
        }
        super(j);
        final Paint d = new Paint(1);
        (this.D = d).setStyle(Paint$Style.FILL_AND_STROKE);
        d.setColor(-1);
        d.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
        this.E = new RectF();
    }
    
    public final void draw(final Canvas canvas) {
        final Drawable$Callback callback = ((Drawable)this).getCallback();
        if (callback instanceof View) {
            final View view = (View)callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint)null);
            }
        }
        else {
            this.F = canvas.saveLayer(0.0f, 0.0f, (float)canvas.getWidth(), (float)canvas.getHeight(), (Paint)null);
        }
        super.draw(canvas);
        canvas.drawRect(this.E, this.D);
        if (!(((Drawable)this).getCallback() instanceof View)) {
            canvas.restoreToCount(this.F);
        }
    }
    
    public final void t(final float n, final float n2, final float n3, final float n4) {
        final RectF e = this.E;
        if (n != e.left || n2 != e.top || n3 != e.right || n4 != e.bottom) {
            e.set(n, n2, n3, n4);
            this.invalidateSelf();
        }
    }
}
