// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class 1JH extends 0fj implements 0fi
{
    public 1ij<1JH> LIZ;
    
    static {
        Covode.recordClassIndex(6129);
    }
    
    public 1JH(final Context context, final AttributeSet set) {
        super(context, set);
        (this.LIZ = new 1ij<1JH>(this)).LIZ(set, 0, 0);
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
