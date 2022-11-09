// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import android.graphics.Color;
import androidx.cardview.widget.CardView;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.graphics.Rect;
import android.widget.FrameLayout;

public class 052 extends FrameLayout
{
    public static final int[] LIZJ;
    public static final 054 LIZLLL;
    public final Rect LIZ;
    public final Rect LIZIZ;
    public boolean LJ;
    public boolean LJFF;
    public final 053 LJI;
    
    static {
        Covode.recordClassIndex(589);
        LIZJ = new int[] { 16842801 };
        LIZLLL = new 13l();
    }
    
    public 052(final Context context) {
        this(context, null);
    }
    
    public 052(final Context context, final AttributeSet set) {
        this(context, set, 2130969228);
    }
    
    public 052(final Context context, final AttributeSet set, int n) {
        super(context, set, n);
        final Rect liz = new Rect();
        this.LIZ = liz;
        this.LIZIZ = new Rect();
        final CardView.CardView$1 lji = new CardView.CardView$1(this);
        this.LJI = (053)lji;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, new int[] { 16843071, 16843072, 2130969222, 2130969223, 2130969224, 2130969225, 2130969226, 2130969227, 2130969389, 2130969390, 2130969391, 2130969392, 2130969393 }, n, 2131886300);
        ColorStateList list;
        if (obtainStyledAttributes.hasValue(2)) {
            list = obtainStyledAttributes.getColorStateList(2);
        }
        else {
            final TypedArray obtainStyledAttributes2 = this.getContext().obtainStyledAttributes(052.LIZJ);
            n = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            final float[] array = new float[3];
            Color.colorToHSV(n, array);
            if (array[2] > 0.5f) {
                n = this.getResources().getColor(2131099867);
            }
            else {
                n = this.getResources().getColor(2131099866);
            }
            list = ColorStateList.valueOf(n);
        }
        final float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        final float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        final float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.LJ = obtainStyledAttributes.getBoolean(7, false);
        this.LJFF = obtainStyledAttributes.getBoolean(6, true);
        n = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        liz.left = obtainStyledAttributes.getDimensionPixelSize(10, n);
        liz.top = obtainStyledAttributes.getDimensionPixelSize(12, n);
        liz.right = obtainStyledAttributes.getDimensionPixelSize(11, n);
        liz.bottom = obtainStyledAttributes.getDimensionPixelSize(9, n);
        float n2 = dimension3;
        if (dimension2 > dimension3) {
            n2 = dimension2;
        }
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        052.LIZLLL.LIZ((053)lji, list, dimension, dimension2, n2);
    }
    
    public ColorStateList getCardBackgroundColor() {
        return 052.LIZLLL.LJII(this.LJI);
    }
    
    public float getCardElevation() {
        return 052.LIZLLL.LJ(this.LJI);
    }
    
    public int getContentPaddingBottom() {
        return this.LIZ.bottom;
    }
    
    public int getContentPaddingLeft() {
        return this.LIZ.left;
    }
    
    public int getContentPaddingRight() {
        return this.LIZ.right;
    }
    
    public int getContentPaddingTop() {
        return this.LIZ.top;
    }
    
    public float getMaxCardElevation() {
        return 052.LIZLLL.LIZ(this.LJI);
    }
    
    public boolean getPreventCornerOverlap() {
        return this.LJFF;
    }
    
    public float getRadius() {
        return 052.LIZLLL.LIZLLL(this.LJI);
    }
    
    public boolean getUseCompatPadding() {
        return this.LJ;
    }
    
    public void onMeasure(int measureSpec, int measureSpec2) {
        final 054 lizlll = 052.LIZLLL;
        if (!(lizlll instanceof 13l)) {
            final int mode = View$MeasureSpec.getMode(measureSpec);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                measureSpec = View$MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(lizlll.LIZIZ(this.LJI)), View$MeasureSpec.getSize(measureSpec)), mode);
            }
            final int mode2 = View$MeasureSpec.getMode(measureSpec2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                measureSpec2 = View$MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(lizlll.LIZJ(this.LJI)), View$MeasureSpec.getSize(measureSpec2)), mode2);
            }
            super.onMeasure(measureSpec, measureSpec2);
            return;
        }
        super.onMeasure(measureSpec, measureSpec2);
    }
    
    public void setCardBackgroundColor(final int n) {
        052.LIZLLL.LIZ(this.LJI, ColorStateList.valueOf(n));
    }
    
    public void setCardBackgroundColor(final ColorStateList list) {
        052.LIZLLL.LIZ(this.LJI, list);
    }
    
    public void setCardElevation(final float n) {
        052.LIZLLL.LIZJ(this.LJI, n);
    }
    
    public void setMaxCardElevation(final float n) {
        052.LIZLLL.LIZIZ(this.LJI, n);
    }
    
    public void setMinimumHeight(final int minimumHeight) {
        super.setMinimumHeight(minimumHeight);
    }
    
    public void setMinimumWidth(final int minimumWidth) {
        super.setMinimumWidth(minimumWidth);
    }
    
    public void setPadding(final int n, final int n2, final int n3, final int n4) {
    }
    
    public void setPaddingRelative(final int n, final int n2, final int n3, final int n4) {
    }
    
    public void setPreventCornerOverlap(final boolean ljff) {
        if (ljff != this.LJFF) {
            this.LJFF = ljff;
            052.LIZLLL.LJI(this.LJI);
        }
    }
    
    public void setRadius(final float n) {
        052.LIZLLL.LIZ(this.LJI, n);
    }
    
    public void setUseCompatPadding(final boolean lj) {
        if (this.LJ != lj) {
            this.LJ = lj;
            052.LIZLLL.LJFF(this.LJI);
        }
    }
}
