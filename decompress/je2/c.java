// 
// Decompiled by Procyon v0.6.0
// 

package je2;

import android.view.View;
import android.widget.ImageView$ScaleType;
import android.graphics.Bitmap;
import m5.a;
import android.graphics.Canvas;
import android.graphics.Point;
import android.view.WindowManager;
import android.graphics.drawable.Drawable;
import zd.b;
import android.graphics.RectF;
import android.util.Log;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Matrix;
import androidx.appcompat.widget.AppCompatImageView;

public class c extends AppCompatImageView
{
    public final float[] j;
    public final float[] k;
    public final float[] l;
    public Matrix m;
    public int n;
    public int o;
    public a p;
    public float[] q;
    public float[] r;
    public boolean s;
    public boolean t;
    public int u;
    public String v;
    public String w;
    public ge2.c x;
    
    public c(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public c(final Context context, final AttributeSet set, final int n) {
        super(context, set, 0);
        this.j = new float[8];
        this.k = new float[2];
        this.l = new float[9];
        this.m = new Matrix();
        this.s = false;
        this.t = false;
        this.u = 0;
        this.init();
    }
    
    public final float a(final Matrix matrix) {
        matrix.getValues(this.l);
        final float[] l = this.l;
        final double n = l[1];
        matrix.getValues(l);
        return (float)(-(Math.atan2(n, this.l[0]) * 57.29577951308232));
    }
    
    public final float b(final Matrix matrix) {
        matrix.getValues(this.l);
        final double pow = Math.pow(this.l[0], 2.0);
        matrix.getValues(this.l);
        return (float)Math.sqrt(Math.pow(this.l[3], 2.0) + pow);
    }
    
    public void f() {
        final Drawable drawable = this.getDrawable();
        if (drawable == null) {
            return;
        }
        final float n = (float)drawable.getIntrinsicWidth();
        final float n2 = (float)drawable.getIntrinsicHeight();
        Log.d("TransformImageView", String.format("Image size: [%d:%d]", (int)n, (int)n2));
        final RectF rectF = new RectF(0.0f, 0.0f, n, n2);
        this.q = b.a0(rectF);
        this.r = new float[] { rectF.centerX(), rectF.centerY() };
        this.t = true;
        final a p = this.p;
        if (p != null) {
            p.a();
        }
    }
    
    public void g(final float n, final float n2, final float n3) {
        if (n != 0.0f) {
            this.m.postScale(n, n, n2, n3);
            this.setImageMatrix(this.m);
            final a p3 = this.p;
            if (p3 != null) {
                this.b(this.m);
                p3.c();
            }
        }
    }
    
    public float getCurrentAngle() {
        return this.a(this.m);
    }
    
    public float getCurrentScale() {
        return this.b(this.m);
    }
    
    public ge2.c getExifInfo() {
        return this.x;
    }
    
    public String getImageInputPath() {
        return this.v;
    }
    
    public String getImageOutputPath() {
        return this.w;
    }
    
    public int getMaxBitmapSize() {
        if (this.u <= 0) {
            final WindowManager windowManager = (WindowManager)((View)this).getContext().getSystemService("window");
            final Point point = new Point();
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getSize(point);
            }
            final int n = (int)Math.sqrt(Math.pow(point.y, 2.0) + Math.pow(point.x, 2.0));
            final Canvas canvas = new Canvas();
            final int min = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
            int min2 = n;
            if (min > 0) {
                min2 = Math.min(n, min);
            }
            int a;
            try {
                a = ie2.b.a();
            }
            catch (final Exception ex) {
                Log.d("EglUtils", "getMaxTextureSize: ", (Throwable)ex);
                a = 0;
            }
            int min3 = min2;
            if (a > 0) {
                min3 = Math.min(min2, a);
            }
            m5.a.q("maxBitmapSize: ", min3, "BitmapLoadUtils");
            this.u = min3;
        }
        return this.u;
    }
    
    public Bitmap getViewBitmap() {
        if (this.getDrawable() != null && this.getDrawable() instanceof ie2.c) {
            return ((ie2.c)this.getDrawable()).b;
        }
        return null;
    }
    
    public final void h(final float n, final float n2) {
        if (n != 0.0f || n2 != 0.0f) {
            this.m.postTranslate(n, n2);
            this.setImageMatrix(this.m);
        }
    }
    
    public void init() {
        this.setScaleType(ImageView$ScaleType.MATRIX);
    }
    
    public final void onLayout(final boolean b, int width, int paddingTop, int paddingBottom, int paddingLeft) {
        super.onLayout(b, width, paddingTop, paddingBottom, paddingLeft);
        if (b || (this.s && !this.t)) {
            paddingLeft = ((View)this).getPaddingLeft();
            paddingTop = ((View)this).getPaddingTop();
            width = ((View)this).getWidth();
            final int paddingRight = ((View)this).getPaddingRight();
            final int height = ((View)this).getHeight();
            paddingBottom = ((View)this).getPaddingBottom();
            this.n = width - paddingRight - paddingLeft;
            this.o = height - paddingBottom - paddingTop;
            this.f();
        }
    }
    
    @Override
    public void setImageBitmap(final Bitmap bitmap) {
        this.setImageDrawable((Drawable)new ie2.c(bitmap));
    }
    
    public void setImageMatrix(final Matrix imageMatrix) {
        super.setImageMatrix(imageMatrix);
        this.m.set(imageMatrix);
        this.m.mapPoints(this.j, this.q);
        this.m.mapPoints(this.k, this.r);
    }
    
    public void setMaxBitmapSize(final int u) {
        this.u = u;
    }
    
    public void setScaleType(final ImageView$ScaleType scaleType) {
        if (scaleType == ImageView$ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        }
        else {
            Log.w("TransformImageView", "Invalid ScaleType. Only ScaleType.MATRIX can be used");
        }
    }
    
    public void setTransformImageListener(final a p) {
        this.p = p;
    }
    
    public interface a
    {
        void a();
        
        void b(final Exception p0);
        
        void c();
        
        void d();
    }
}
