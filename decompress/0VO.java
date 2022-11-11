// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Canvas;
import com.bytedance.android.ecommerce.view.OcrScanView;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.graphics.Paint$Style;
import android.graphics.BitmapFactory;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Matrix;
import android.view.View;

public class 0VO extends View
{
    public Matrix LIZ;
    public Paint LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public Bitmap LJ;
    public float LJFF;
    public ValueAnimator LJI;
    public long LJII;
    
    static {
        Covode.recordClassIndex(4798);
    }
    
    public 0VO(final Context context, final AttributeSet set) {
        super(context, set);
        MethodCollector.i(4564);
        this.LIZ = new Matrix();
        this.LJFF = 0.0f;
        this.LJII = 2000L;
        this.LJ = BitmapFactory.decodeResource(this.getResources(), 2131233502);
        (this.LIZIZ = new Paint(1)).setStyle(Paint$Style.FILL);
        MethodCollector.o(4564);
    }
    
    private void LIZ(final boolean b) {
        this.LIZ.reset();
        this.LIZ.setTranslate(0.0f, -this.LJFF);
        this.LIZ.preScale(1.0f, 1.0f);
        if (b) {
            this.invalidate();
        }
    }
    
    private ValueAnimator$AnimatorUpdateListener getUpdateListener() {
        return (ValueAnimator$AnimatorUpdateListener)new OcrScanView.OcrScanView$1(this);
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LJI.isRunning()) {
            this.LJI.cancel();
        }
        this.LIZ(true);
    }
    
    public void onDraw(final Canvas canvas) {
        MethodCollector.i(135);
        super.onDraw(canvas);
        final Bitmap lj = this.LJ;
        if (lj != null) {
            canvas.drawBitmap(lj, this.LIZ, this.LIZIZ);
        }
        MethodCollector.o(135);
    }
    
    public void onSizeChanged(int lizj, int lizlll, int height, int height2) {
        MethodCollector.i(5859);
        super.onSizeChanged(lizj, lizlll, height, height2);
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        final Bitmap lj = this.LJ;
        if (lj == null || lizj <= 0 || lizlll <= 0) {
            MethodCollector.o(5859);
            return;
        }
        lizlll = lj.getWidth();
        lizj = this.LIZJ;
        if (lizlll != lizj) {
            final Bitmap lj2 = this.LJ;
            height = lj2.getHeight();
            lizlll = lj2.getWidth();
            height2 = lj2.getHeight();
            final float min = Math.min(height / (float)height2, lizj / (float)lizlll);
            final Matrix matrix = new Matrix();
            matrix.postScale(min, min);
            this.LJ = Bitmap.createBitmap(lj2, 0, 0, lizlll, height2, matrix, true);
        }
        this.LJFF = (float)this.LJ.getHeight();
        this.LIZ(false);
        final ValueAnimator lji = this.LJI;
        if (lji != null && lji.isRunning()) {
            this.LJI.cancel();
        }
        final float ljff = this.LJFF;
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { -ljff, this.LIZLLL + ljff });
        if ((this.LJI = ofFloat) != null) {
            ofFloat.setDuration(this.LJII);
            this.LJI.setRepeatCount(-1);
            this.LJI.setRepeatMode(1);
            this.LJI.addUpdateListener(this.getUpdateListener());
            this.LJI.start();
        }
        MethodCollector.o(5859);
    }
}
