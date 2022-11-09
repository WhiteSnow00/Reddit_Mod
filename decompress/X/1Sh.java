// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.widget.TextView$BufferType;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.graphics.Paint;

public class 1sh extends 1ib
{
    public final Paint LIZ;
    public float LIZIZ;
    public float LIZJ;
    
    static {
        Covode.recordClassIndex(5859);
    }
    
    public 1sh(final Context context, final AttributeSet set) {
        super(context, set);
        final TextPaint liz = new TextPaint();
        this.LIZ = (Paint)liz;
        this.LIZJ = 6.0f;
        ((Paint)liz).set((Paint)this.getPaint());
        this.LIZIZ = this.getTextSize();
    }
    
    private float LIZ(final Context context, final float n) {
        return n / context.getResources().getDisplayMetrics().scaledDensity;
    }
    
    private void LIZ(final String s, final int n) {
        if (n > 0) {
            final int paddingLeft = this.getPaddingLeft();
            final int paddingRight = this.getPaddingRight();
            float liziz = this.LIZIZ;
            this.LIZ.setTextSize(liziz);
            float lizj;
            while (true) {
                lizj = liziz;
                if (this.LIZ.measureText(s) <= n - paddingLeft - paddingRight) {
                    break;
                }
                --liziz;
                lizj = this.LIZJ;
                if (liziz <= lizj) {
                    break;
                }
                this.LIZ.setTextSize(liziz);
            }
            this.setTextSize(this.LIZ(this.getContext(), lizj));
        }
    }
    
    public void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        if (n != n3) {
            this.LIZ(this.getText().toString(), n);
        }
    }
    
    @Override
    public void setText(final CharSequence charSequence, final TextView$BufferType textView$BufferType) {
        super.setText(charSequence, textView$BufferType);
        this.LIZ(charSequence.toString(), this.getWidth());
    }
}
