// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import androidx.appcompat.widget.AppCompatTextView;

public class 1fc extends AppCompatTextView
{
    static {
        Covode.recordClassIndex(423);
    }
    
    public 1fc(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    @Override
    public void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        final Layout layout = this.getLayout();
        if (layout != null) {
            final int lineCount = layout.getLineCount();
            if (lineCount > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
                this.setSingleLine(false);
                this.setMaxLines(2);
                final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes((AttributeSet)null, new int[] { 16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, 16844165, 2130969583, 2130969592, 2130971189, 2130971220 }, 16842817, 16973892);
                final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
                if (dimensionPixelSize != 0) {
                    this.setTextSize(0, (float)dimensionPixelSize);
                }
                obtainStyledAttributes.recycle();
                super.onMeasure(n, n2);
            }
        }
    }
}
