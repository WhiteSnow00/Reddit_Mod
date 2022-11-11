// 
// Decompiled by Procyon v0.6.0
// 

package com.wdullaer.materialdatetimepicker;

import android.view.View;
import android.graphics.Paint;
import android.widget.TextView;
import android.text.TextPaint;
import android.graphics.Canvas;
import android.view.Gravity;
import android.util.AttributeSet;
import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;

public class VerticalTextView extends AppCompatTextView
{
    public final boolean m;
    
    public VerticalTextView(final Context context, final AttributeSet set) {
        super(context, set);
        final int gravity = ((TextView)this).getGravity();
        if (Gravity.isVertical(gravity) && (gravity & 0x70) == 0x50) {
            ((TextView)this).setGravity((gravity & 0x7) | 0x30);
            this.m = false;
        }
        else {
            this.m = true;
        }
    }
    
    public final void onDraw(final Canvas canvas) {
        final TextPaint paint = ((TextView)this).getPaint();
        ((Paint)paint).setColor(((TextView)this).getCurrentTextColor());
        paint.drawableState = ((View)this).getDrawableState();
        canvas.save();
        if (this.m) {
            canvas.translate((float)((View)this).getWidth(), 0.0f);
            canvas.rotate(90.0f);
        }
        else {
            canvas.translate(0.0f, (float)((View)this).getHeight());
            canvas.rotate(-90.0f);
        }
        canvas.translate((float)((TextView)this).getCompoundPaddingLeft(), (float)((TextView)this).getExtendedPaddingTop());
        ((TextView)this).getLayout().draw(canvas);
        canvas.restore();
    }
    
    public final void onMeasure(final int n, final int n2) {
        super.onMeasure(n2, n);
        ((View)this).setMeasuredDimension(((View)this).getMeasuredHeight(), ((View)this).getMeasuredWidth());
    }
}
