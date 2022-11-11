// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.content.res.TypedArray;
import android.view.View;
import com.bytedance.covode.number.Covode;

public final class 1iV extends 1JC<1It>
{
    static {
        Covode.recordClassIndex(6050);
    }
    
    public 1iV(final 1It 1It) {
        super((View)1It);
    }
    
    @Override
    public final void LIZ(final TypedArray typedArray) {
        if (typedArray.hasValue(3)) {
            final int color = typedArray.getColor(3, 0);
            if (color != 0) {
                final float dimension = typedArray.getDimension(4, 0.0f);
                final float dimension2 = typedArray.getDimension(5, 0.0f);
                final float dimension3 = typedArray.getDimension(6, 0.0f);
                final 1It 1It = (1It)super.LIZLLL;
                1It.LIZ = dimension3;
                1It.LIZJ = dimension;
                1It.LIZLLL = dimension2;
                1It.LIZIZ = color;
                1It.LIZ();
            }
        }
        for (int indexCount = typedArray.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = typedArray.getIndex(i);
            if (index == 10) {
                ((1It)super.LIZLLL).setIconBackground(typedArray.getDrawable(index));
            }
            else if (index == 9) {
                final TypedValue typedValue = new TypedValue();
                typedArray.getValue(index, typedValue);
                ((1It)super.LIZLLL).setIconWidthRatio(typedValue.getFloat());
            }
            else if (index == 2) {
                final TypedValue typedValue2 = new TypedValue();
                typedArray.getValue(index, typedValue2);
                ((1It)super.LIZLLL).setIconHeightRatio(typedValue2.getFloat());
            }
            else if (index == 0) {
                ((1It)super.LIZLLL).setCutout(typedArray.getBoolean(index, false));
            }
            else if (index == 8) {
                final ColorStateList liz = 0eN.LIZ(((1It)super.LIZLLL).getContext(), typedArray, index);
                if (liz != null) {
                    ((1It)super.LIZLLL).setIconTintList(liz);
                }
            }
            else if (index == 1) {
                final int resourceId = typedArray.getResourceId(index, -1);
                if (resourceId != -1) {
                    ((1It)super.LIZLLL).setIconBackgroundAppearance(resourceId);
                }
            }
            else if (index == 7) {
                final int resourceId2 = typedArray.getResourceId(index, -1);
                if (resourceId2 != -1) {
                    ((1It)super.LIZLLL).setIconStateAlphaAppearance(resourceId2);
                }
            }
        }
    }
    
    @Override
    public final int[] LIZ() {
        return new int[] { 2130969432, 2130969643, 2130969647, 2130969650, 2130969651, 2130969652, 2130969653, 2130969656, 2130969658, 2130969660, 2130970118 };
    }
}
