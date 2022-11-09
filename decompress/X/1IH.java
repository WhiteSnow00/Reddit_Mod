// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.TypedArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.widget.TextView;

public class 1ih extends 1JC<TextView>
{
    public final 1ig LIZ;
    
    static {
        Covode.recordClassIndex(6122);
    }
    
    public 1ih(final TextView textView) {
        super((View)textView);
        this.LIZ = new 1ig(textView);
    }
    
    public final void LIZ(final int n) {
        this.LIZ.LIZ(n);
    }
    
    @Override
    public final void LIZ(final TypedArray typedArray) {
        ((TextView)super.LIZLLL).setTypeface(7we.LIZ().LIZ(typedArray.getInteger(3, 1)));
        if (typedArray.hasValue(0)) {
            final int resourceId = typedArray.getResourceId(0, 0);
            if (resourceId != 0) {
                this.LIZ.LIZ(resourceId);
            }
        }
        if (typedArray.hasValue(4)) {
            08p.LIZLLL((TextView)super.LIZLLL, typedArray.getDimensionPixelSize(4, 0));
        }
        if (typedArray.hasValue(1)) {
            final int dimensionPixelSize = typedArray.getDimensionPixelSize(1, -1);
            if (dimensionPixelSize != -1) {
                ((TextView)super.LIZLLL).setTextSize(0, (float)dimensionPixelSize);
            }
        }
    }
    
    @Override
    public final int[] LIZ() {
        return new int[] { 16842804, 16842901, 16842904, 2130969591, 2130969904 };
    }
    
    public final void LIZIZ(final int n) {
        this.LIZLLL(n);
    }
}
