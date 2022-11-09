// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Typeface;
import android.content.res.TypedArray;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.widget.TextView;

public final class 1ig extends 1JC<TextView>
{
    static {
        Covode.recordClassIndex(6121);
    }
    
    public 1ig(final TextView textView) {
        super((View)textView);
    }
    
    public final void LIZ(final int n) {
        this.LIZLLL(n);
    }
    
    @Override
    public final void LIZ(final TypedArray typedArray) {
        for (int indexCount = typedArray.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = typedArray.getIndex(i);
            if (index == 1) {
                final Typeface liz = 7we.LIZ().LIZ(typedArray.getInt(1, 1));
                if (liz != null) {
                    ((TextView)super.LIZLLL).setTypeface(liz);
                }
            }
            else if (index == 0) {
                final int dimensionPixelSize = typedArray.getDimensionPixelSize(0, 0);
                if (dimensionPixelSize > 0) {
                    ((TextView)super.LIZLLL).setTextSize(0, (float)dimensionPixelSize);
                }
            }
        }
    }
    
    @Override
    public final int[] LIZ() {
        return new int[] { 16842901, 2130969591 };
    }
}
