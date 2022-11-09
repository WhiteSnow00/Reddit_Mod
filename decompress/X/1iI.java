// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class 1ii extends 1JK implements 0fi
{
    public 1ij<1ii> LIZ;
    
    static {
        Covode.recordClassIndex(6125);
    }
    
    public 1ii(final Context context, final AttributeSet set) {
        super(context, set);
        this.LIZ(set, 0);
    }
    
    public 1ii(final Context context, final AttributeSet set, final byte b) {
        super(context, set, 0);
        this.LIZ(set, 0);
    }
    
    private void LIZ(final AttributeSet set, final int n) {
        (this.LIZ = new 1ij<1ii>(this)).LIZ(set, 0, 0);
    }
    
    public final void LIZ(final Resources resources, int i) {
        final 1ij<1ii> liz = this.LIZ;
        if (liz != null) {
            final 1JJ liz2 = liz.LIZ;
            int[] array = null;
            final int n = 0;
            if (i != 0) {
                final TypedArray obtainTypedArray = resources.obtainTypedArray(i);
                final int length = obtainTypedArray.length();
                array = new int[length];
                for (i = 0; i < length; ++i) {
                    array[i] = obtainTypedArray.getColor(i, -16777216);
                }
                obtainTypedArray.recycle();
            }
            final TypedArray obtainTypedArray2 = resources.obtainTypedArray(2130903111);
            final int length2 = obtainTypedArray2.length();
            final float[] array2 = new float[length2];
            for (i = n; i < length2; ++i) {
                array2[i] = obtainTypedArray2.getFloat(i, 0.0f);
            }
            obtainTypedArray2.recycle();
            liz2.LIZ(array, array2);
        }
    }
    
    public final void LIZIZ(final int n) {
        this.LIZ.LIZJ(n);
    }
    
    public void draw(final Canvas canvas) {
        this.LIZ.LIZIZ(canvas);
        super.draw(canvas);
        this.LIZ.LIZJ(canvas);
    }
    
    public float getBottomLeftRadius() {
        return this.LIZ.LJI();
    }
    
    public float getBottomRightRadius() {
        return this.LIZ.LJII();
    }
    
    public int[] getGradientColors() {
        return this.LIZ.LJIIJJI();
    }
    
    public float[] getGradientPositions() {
        return this.LIZ.LJIIL();
    }
    
    public float getRadius() {
        return this.LIZ.LJIIJ();
    }
    
    public ColorStateList getStrokeColor() {
        return this.LIZ.LJIIIZ();
    }
    
    public float getStrokeWidth() {
        return this.LIZ.LJIIIIZZ();
    }
    
    public float getTopLeftRadius() {
        return this.LIZ.LJ();
    }
    
    public float getTopRightRadius() {
        return this.LIZ.LJFF();
    }
    
    public void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        this.LIZ.LIZ(canvas);
    }
    
    public void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.LIZ.LIZ(n, n2);
    }
    
    public void setBottomLeftCircular(final boolean b) {
        this.LIZ.LIZJ(b);
    }
    
    public void setBottomLeftRadius(final float n) {
        this.LIZ.LJ(n);
    }
    
    public void setBottomRightCircular(final boolean b) {
        this.LIZ.LIZLLL(b);
    }
    
    public void setBottomRightRadius(final float n) {
        this.LIZ.LJFF(n);
    }
    
    @Override
    public void setCircular(final boolean circular) {
        this.LIZ.setCircular(circular);
    }
    
    public void setGradientColors(final int[] array) {
        this.LIZ.LIZ(array);
    }
    
    public void setGradientOrientation(final int n) {
        this.LIZ.LIZIZ(n);
    }
    
    public void setRadius(final float n) {
        this.LIZ.LIZIZ(n);
    }
    
    public void setStrokeColor(final int n) {
        this.LIZ.LIZ(n);
    }
    
    public void setStrokeColor(final ColorStateList list) {
        this.LIZ.LIZ(list);
    }
    
    public void setStrokeWidth(final float n) {
        this.LIZ.LIZ(n);
    }
    
    public void setTopLeftCircular(final boolean b) {
        this.LIZ.LIZ(b);
    }
    
    public void setTopLeftRadius(final float n) {
        this.LIZ.LIZJ(n);
    }
    
    public void setTopRightCircular(final boolean b) {
        this.LIZ.LIZIZ(b);
    }
    
    public void setTopRightRadius(final float n) {
        this.LIZ.LIZLLL(n);
    }
}
